//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.parser;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.htmlparser.Node;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableRow;
import org.htmlparser.util.NodeIterator;
import org.htmlparser.util.ParserException;

/**
 * Class that parse a html document
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         20/06/2012
 */
public abstract class GenericHtmlParser {
	protected int rowSize;
	protected String testName;
	protected org.htmlparser.util.NodeList nodeList = null;
	protected NodeIterator iterator = null;
	protected Map<String, String> metaMap = null;

	public GenericHtmlParser(File htmlFile) {
		rowSize = 0;
		testName = null;
		nodeList = new org.htmlparser.util.NodeList();
		metaMap = new HashMap<String, String>();
		parseHtml(htmlFile);
	}

	/**
	 * Return a String with the content of the html layout file
	 * @param xFilePath path to the html layout file
	 * @return
	 */
	public static String getHTML(String xFilePath) {
		String result = null;
		try {
			File file = new File(xFilePath);
			result = FileUtils.readFileToString(file, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Parse the html document getting the size of commands and the test case name
	 * @param htmlFile
	 */
	protected abstract void parseHtml(File htmlFile);

	protected String getContent(Node node, int columnIndex) {
		TableRow row = (TableRow) node;
		TableColumn td = row.getColumns()[columnIndex];
		String value = td.getStringText();
		return value;
	}

	/**
	 * Return the value of an attribute in the row.
	 * @param node
	 * @param attrName
	 * @return
	 */
	protected String getAttribute(Node node, String attrName) {
		TableRow row = (TableRow) node;
		String attrVal = row.getAttribute(attrName);
		return attrVal;
	}

	public NodeIterator newIterator() {
		this.iterator = nodeList.elements();
		return this.iterator;
	}

	public boolean hasMoreNodes() throws ParserException {
		return iterator.hasMoreNodes();
	}

	public Node getNextElement() throws ParserException {
		if (iterator.hasMoreNodes()) {
			return iterator.nextNode();
		}
		return null;
	}

	public int getRowSize() {
		return rowSize;
	}

	public String getTestName() {
		return testName;
	}

	public NodeIterator getIterator() {
		return newIterator();
	}

	public Map<String, String> getMetaMap() {
		return metaMap;
	}

	public String getMeta(String metaName) {
		return metaMap.get(metaName);
	}
}
