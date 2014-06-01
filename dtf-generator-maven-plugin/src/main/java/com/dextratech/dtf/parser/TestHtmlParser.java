//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.htmlparser.Node;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.tags.MetaTag;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableRow;
import org.htmlparser.util.NodeIterator;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

import com.dextratech.dtf.SeleneseHtmlColumnIndex;
import com.dextratech.dtf.SeleniumCommand;

/**
 * Class that parse a html document
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         20/06/2012
 */
public class TestHtmlParser extends GenericHtmlParser {
	private static Log log = LogFactory.getLog(TestHtmlParser.class);

	public static final String META_SUCCESS = "success";

	public TestHtmlParser(File htmlFile) {
		super(htmlFile);
	}

	/**
	 * Parse the html document getting the size of commands and the test case name
	 * @param htmlFile
	 */
	protected void parseHtml(File htmlFile) {
		try {
			/*
			 * Parse the HTML document
			 */
			Parser parser = new Parser(htmlFile.getAbsolutePath());

			/*
			 * Gets all TR and META node elements
			 */
			TagNameFilter filter = new TagNameFilter("TR");
			TagNameFilter filterMeta = new TagNameFilter("META");
			NodeList metaNodeList = new NodeList();
			for (NodeIterator e = parser.elements(); e.hasMoreNodes();) {
				/*
				 * Update the nodeLists with the TR and META nodes found
				 */
				Node currentNode = e.nextNode();
				currentNode.collectInto(nodeList, filter);
				currentNode.collectInto(metaNodeList, filterMeta);
			}
			populateMetaMap(metaNodeList);

			/*
			 * The row length of the table, minus the row of the test case name 
			 */
			this.rowSize = nodeList.size() - 1;

			/*
			 * Creates an iterator for this node list
			 */
			this.iterator = nodeList.elements();

			/*
			 * Verify the general information of the document
			 */
			for (; iterator.hasMoreNodes();) {
				org.htmlparser.Node node = iterator.nextNode();
				TableRow row = (TableRow) node;
				int colCount = row.getColumnCount();

				if (colCount == 1) {
					/*
					 * Gets the test case name
					 */
					TableColumn tdCommand = row.getColumns()[0];
					testName = tdCommand.getStringText();
					return;
				}
			}
		} catch (ParserException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Populates the meta map with the contents of metaNodeList
	 * @param metaNodeList
	 * @throws ParserException
	 */
	private void populateMetaMap(NodeList metaNodeList) throws ParserException {
		log.debug("Populating META map...");
		NodeIterator metaIterator = metaNodeList.elements();
		for (; metaIterator.hasMoreNodes();) {
			Node node = metaIterator.nextNode();
			MetaTag meta = (MetaTag) node;
			String metaName = meta.getMetaTagName();
			String metaContent = meta.getMetaContent();

			log.debug("META found: " + metaName + " with content: " + metaContent);
			metaMap.put(metaName, metaContent);
		}
	}

	/**
	 * Returns a command object with the Selenese command
	 * @param node
	 * @return
	 */
	public String getCommand(Node node) {
		String command = getContent(node, SeleneseHtmlColumnIndex.COMMAND.getIndex());
		return StringEscapeUtils.unescapeHtml(command);
	}

	/**
	 * Returns the target (locator) of a step
	 * @param node
	 * @return
	 */
	public String getTarget(Node node) {
		String target = getContent(node, SeleneseHtmlColumnIndex.TARGET.getIndex());
		return StringEscapeUtils.unescapeHtml(target);
	}

	/**
	 * Returns the value to be set to the target
	 * @param node
	 * @return
	 */
	public String getValue(Node node) {
		String value = getContent(node, SeleneseHtmlColumnIndex.VALUE.getIndex());
		return StringEscapeUtils.unescapeHtml(value);
	}

	public List<SeleniumCommand> getFormatedSelenseCommands() throws ParserException {
		log.debug("Parsing commands...");
		List<SeleniumCommand> formatedSeleneseCommands = new ArrayList<SeleniumCommand>();
		while (iterator.hasMoreNodes()) {
			Node rowNode = iterator.nextNode();
			String cmd = getCommand(rowNode);
			String target = getTarget(rowNode);
			String value = getValue(rowNode);
			String errorStepString = getAttribute(rowNode, "errorStep");
			boolean errorStep = Boolean.valueOf(errorStepString);
			String testingCommandString = getAttribute(rowNode, "testingCommand");
			boolean testingCommand = Boolean.valueOf(testingCommandString);

			String formatedSeleneseCommand = cmd + "|" + target + "|" + value + "|" + errorStep + "|" + testingCommand;
			log.debug(formatedSeleneseCommand);

			SeleniumCommand sc = new SeleniumCommand(cmd, target, value, errorStep, testingCommand);
			formatedSeleneseCommands.add(sc);
		}
		return formatedSeleneseCommands;
	}
}
