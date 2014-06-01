//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.runner;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.htmlparser.Node;

import com.dextratech.dtf.Command;
import com.dextratech.dtf.LabelValue;
import com.dextratech.dtf.Test;
import com.dextratech.dtf.TestSuite;
import com.dextratech.dtf.parser.TestHtmlParser;
import com.dextratech.dtf.parser.TestSuiteHtmlParser;

@Deprecated
public class SeleniumHtmlClient {
	private static Log log = LogFactory.getLog(SeleniumHtmlClient.class);

	private String host = "localhost";
	private int port = 4444;
	private String browser = "*firefox";
	private String baseUrl;
	private File resultsDir;
	private Writer resultsWriter;
	private boolean verbose;
	private HtmlCommandProcessor htmlCommandProcessor = null;
	private TestHtmlParser testHtmlParser = null;
	private TestSuiteHtmlParser suiteParser = null;

	public SeleniumHtmlClient() {
	}

	public SeleniumHtmlClient(String host, int port, String browser,
			String baseUrl, File resultsDir, boolean verbose) {
		super();
		this.host = host;
		this.port = port;
		this.browser = browser;
		this.baseUrl = baseUrl;
		this.resultsDir = resultsDir;
		this.verbose = verbose;
	}

	public boolean runSuite(String filename) throws Exception {
		log.debug("Running test suite " + filename + " against " + this.host + ":" + this.port + " with " + this.browser);
		TestSuite suite = new TestSuite();
		suite.setFile(new File(filename));
		suiteParser = new TestSuiteHtmlParser(suite.getFile());
		suite.setName(suiteParser.getTestName());
		suite.setResult(true);
		
		File suiteDirectory = suite.getFile().getParentFile();
		suite.setTests(new Test[suiteParser.getRowSize()]);
		int cont = 0;
		for (; suiteParser.hasMoreNodes(); ) {
			Node node = suiteParser.getNextElement();
			LabelValue lb = suiteParser.getTestFileMembers(node);
			Test test = new Test();
			test.setLabel(lb.getLabel());
			test.setHtmlFile(new File(suiteDirectory, lb.getValue()));

			SeleniumHtmlClient subclient = new SeleniumHtmlClient();
			subclient.setHost(this.host);
			subclient.setPort(this.port);
			subclient.setBrowser(this.browser);
			// subclient.setResultsWriter(this.resultsWriter);
			subclient.setBaseUrl(this.baseUrl);
			subclient.setVerbose(this.verbose);
			subclient.runTest(test);
			suite.setResult(suite.getResult() && test.isResult());
			suite.getTests()[cont] = test;
			cont++;
		}
		return suite.getResult();
	}

	public boolean runTest(String filename) throws Exception {
		Test test = new Test();
		test.setHtmlFile(new File(filename));
		runTest(test);

		// Print the DOM node
		createTestReport(test);
		return test.isResult();
	}

	public boolean runTest(Test test) throws Exception {
		String filename = test.getHtmlFile().toString();
		log.debug("Running " + filename + " against " + this.host + ":" + this.port + " with " + this.browser);
		testHtmlParser = new TestHtmlParser(test.getHtmlFile());

		log.debug("Base URL=" + this.baseUrl);

		test.setName(testHtmlParser.getTestName());

		/*
		 * Iterates all commands and run them
		 */
		this.htmlCommandProcessor = new HtmlCommandProcessor(this.host, this.port, this.browser, this.baseUrl);
		String resultState;
		String resultLog;
		test.setResult(true);
		try {
			this.htmlCommandProcessor.start();
			test.setCommands( new Command[testHtmlParser.getRowSize()] );
			int cont = 0;
			for (; testHtmlParser.hasMoreNodes(); ) {
				Node node = testHtmlParser.getNextElement();
				Command command = executeStep(node);
				test.getCommands()[cont] = command;
				cont++;
				if (command.isError()) {
					test.setResult(false);
				}
				if (command.isFailure()) {
					test.setResult(false);
					break;
				}
			}
			resultState = test.isResult() ? "PASSED" : "FAILED";
			resultLog = (test.isResult() ? "Test Complete" : "Error");
			this.htmlCommandProcessor.stop();
		} catch (Exception e) {
			test.setResult(false);
			resultState = "ERROR";
			resultLog = "Failed to initialize session\n" + e;
			e.printStackTrace();
		}
		return test.isResult();
	}

	public Command executeStep(Node stepRow) throws Exception {
		String commandString = testHtmlParser.getCommand(stepRow);
		Command command = new Command();
		command.setCmd(commandString);
		ArrayList<String> argList = new ArrayList<String>();

		String target = testHtmlParser.getTarget(stepRow);
		target = target.replaceAll(" +", " ");
		target = target.replace('\u00A0', ' ');
		target = target.trim();
		argList.add(target);

		String value = testHtmlParser.getValue(stepRow);
		value = value.replaceAll(" +", " ");
		value = value.replace('\u00A0', ' ');
		value = value.trim();
		argList.add(value);

		String args[] = argList.toArray(new String[0]);
		command.setArgs(args);
		log.debug(command.getCmd() + " " + Arrays.asList(args));
		try {
			command.setResult( this.htmlCommandProcessor.doCommand(command.getCmd(), args) );
			command.setError(false);
		} catch (Exception e) {
			command.setResult(e.getMessage());
			command.setError(true);
		}
		command.setFailure( command.isError() && !command.getCmd().startsWith("verify") );
		return command;
	}

	private void createTestReport(Test test) throws IOException {
		if (this.resultsWriter != null) {
			this.resultsWriter.write("<html><head>");
			this.resultsWriter.write("<title>" + test.getName() + "</title>");
			this.resultsWriter.write("<style>");
			this.resultsWriter.write(".ran { background-color: #eeffee; }");
			this.resultsWriter.write(".passed { background-color: #ccffcc; }");
			this.resultsWriter.write(".failed { background-color: #ffcccc; }");
			this.resultsWriter.write(".error { background-color: #ffeeee; }");
			this.resultsWriter.write("</style>");
			this.resultsWriter.write("</head><body>");
			this.resultsWriter.write("<div>\n");
			this.resultsWriter.write("<h3><a name=\"" + test.getLabel() + "\">"
					+ test.getHtmlFile().getName() + "</a></h3>\n");
			this.resultsWriter.write("<table border=\"1\">\n");
			this.resultsWriter.write("<tr class=\""
					+ (test.isResult() ? "passed" : "failed")
					+ "\"><td colspan=\"3\">" + test.getName() + "</td></tr>\n");
			for (Command command : test.getCommands()) {
				boolean result = command.getResult().startsWith("OK");
				this.resultsWriter.write("<tr class=\""
						+ (result ? "passed" : "failed") + "\"><td>");
				this.resultsWriter.write(command.getCmd());
				this.resultsWriter.write("</td><td>");
				if (command.getArgs() != null) {
					this.resultsWriter.write(Arrays.asList(command.getArgs())
							.toString());
				}
				this.resultsWriter.write("</td><td>");
				this.resultsWriter.write(command.getResult());
				this.resultsWriter.write("</td></tr>\n");
				if (command.isFailure())
					break;
			}
			this.resultsWriter.write("</table>\n");
			this.resultsWriter.write("</div>\n");
			this.resultsWriter.write("</body></html>");
			// outputDocument(this.resultsWriter);
		}
	}
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public File getResultsDir() {
		return resultsDir;
	}

	public void setResultsDir(File resultsDir) {
		this.resultsDir = resultsDir;
	}

	public Writer getResultsWriter() {
		return resultsWriter;
	}

	public void setResultsWriter(Writer resultsWriter) {
		this.resultsWriter = resultsWriter;
	}

	public boolean isVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public HtmlCommandProcessor getCommandProcessor() {
		return htmlCommandProcessor;
	}

	public void setCommandProcessor(HtmlCommandProcessor htmlCommandProcessor) {
		this.htmlCommandProcessor = htmlCommandProcessor;
	}
	
	public static void main(String[] args) {
		try {
			SeleniumHtmlClient client = new SeleniumHtmlClient();
			client.setBrowser("*firefox");
			client.setBaseUrl("http://localhost:8484/excercise");
//			client.runTest("C:/jesfre/dev/projects/DEXTRA-testing-framework/dtf-layout-builder-maven-plugin/src/main/java/htmlGenerado2.html");
			client.runSuite("C:/jesfre/dev/projects/DEXTRA-testing-framework/dtf-layout-builder-maven-plugin/src/main/java/selenium/testSuite1.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
