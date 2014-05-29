//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.parser;

import java.io.File;

import org.htmlparser.Node;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.nodes.TextNode;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableRow;
import org.htmlparser.util.NodeIterator;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

import com.dextratech.dtf.LabelValue;

/**
 * Class that parse a html document 
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         20/06/2012
 */
public class TestSuiteHtmlParser extends GenericHtmlParser {
	
	public TestSuiteHtmlParser(File htmlSuiteFile) {
		super(htmlSuiteFile);
	}
	
	/**
	 * Parse the html document getting the size of commands and the test case name
	 * @param htmlFile
	 */
	protected void parseHtml(File htmlSuiteFile) {
		try {
			/*
			 * Parse the HTML document
			 */
			Parser parser = new Parser(htmlSuiteFile.getAbsolutePath());

			/*
			 * Gets all TR node elements
			 */
			TagNameFilter filter = new TagNameFilter("TR");
			NodeIterator e = parser.elements();
			while(e.hasMoreNodes()) {
				/*
				 * Update the nodeList with the TR nodes found
				 */
				e.nextNode().collectInto(nodeList, filter);
			}
			
			/*
			 * Gets the test case name
			 */
			Node node = nodeList.remove(0);
			TableRow row = (TableRow) node;

			TableColumn tdCommand = row.getColumns()[0];
			Node[] tdChilds = tdCommand.getChildrenAsNodeArray();
			for(Node n : tdChilds) {
				if(n.getClass().isInstance(new TextNode(""))) {
					this.testName = ((TextNode)n).getText();
				}
			}
			
			/*
			 * The row length of the table of test cases 
			 */
			this.rowSize = nodeList.size();
			this.iterator = nodeList.elements();
		} catch (ParserException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Get the label and the file name from the href attribute 
	 * of the test case represented by this link node of this row
	 * @param node
	 * @return
	 */
	public LabelValue getTestFileMembers(Node node) {
		TableRow row = (TableRow)node;
		TableColumn td = row.getColumns()[0];
		TagNameFilter filter = new TagNameFilter("A");
		NodeList anchors = td.getChildren().extractAllNodesThatMatch(filter);
		LinkTag anchor = (LinkTag)anchors.elementAt(0);
		String link = anchor.getAttribute("href");
		link = link.replaceFirst("./", "");
		String label = anchor.getStringText();
		return new LabelValue(label, link);
	}

}
