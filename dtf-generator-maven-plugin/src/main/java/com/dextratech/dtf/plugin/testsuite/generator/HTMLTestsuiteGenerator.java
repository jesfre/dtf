//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.plugin.testsuite.generator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.exception.DextraSeleniumException;
import com.dextratech.dtf.plugin.Constants;
import com.dextratech.dtf.plugin.testsuite.generator.builder.ActionCommandBuilder;
import com.dextratech.dtf.plugin.testsuite.generator.builder.AssertionCommandBuilder;
import com.dextratech.dtf.plugin.testsuite.generator.builder.CaptureScreenshotCommandBuilder;
import com.dextratech.dtf.plugin.testsuite.generator.builder.EchoCommandBuilder;
import com.dextratech.dtf.plugin.testsuite.generator.builder.FieldCommandBuilder;
import com.dextratech.dtf.plugin.testsuite.generator.builder.GenericCommandBuilder;
import com.dextratech.dtf.plugin.testsuite.generator.builder.OnloadCommandBuilder;
import com.dextratech.dtf.plugin.testsuite.generator.builder.SeleniumCommandBuilder;
import com.dextratech.dtf.plugin.utils.VelocityUtils;
import com.dextratech.dtf.xml.testsuite.Component;
import com.dextratech.dtf.xml.testsuite.Include;
import com.dextratech.dtf.xml.testsuite.Testcase;
import com.dextratech.dtf.xml.testsuite.ValidationFunction;

/**
 * Util class to generate HTML testfcases usin
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 *         06/05/2013
 */
public class HTMLTestsuiteGenerator {
	private static Log log = LogFactory.getLog(HTMLTestsuiteGenerator.class);
	private List<SeleniumCommandBuilder> commandBuilderList = new ArrayList<SeleniumCommandBuilder>();

	private FunctionRegistry functionRegistry = new FunctionRegistry();
	private ComponentRegistry componentRegistry = new ComponentRegistry();

	private String screenshotsDirectory;
	private String testcaseName;

	public HTMLTestsuiteGenerator(String testcaseName, String screenshotsDirectory) {
		this.screenshotsDirectory = screenshotsDirectory;
		this.testcaseName = testcaseName;
		commandBuilderList.add(new FieldCommandBuilder());
		commandBuilderList.add(new ActionCommandBuilder());
		commandBuilderList.add(new AssertionCommandBuilder());
		commandBuilderList.add(new GenericCommandBuilder());
		commandBuilderList.add(new OnloadCommandBuilder());
		commandBuilderList.add(new EchoCommandBuilder());
		commandBuilderList.add(new CaptureScreenshotCommandBuilder(testcaseName));
	}

	public void addFunctions(List<ValidationFunction> functionList) {
		functionRegistry.addAll(functionList);
	}

	public void addComponents(List<Component> componentList) {
		componentRegistry.addAll(componentList);
	}

	/**
	 * Generate a test suite script in the outputDir with a list of test case
	 * @param fileNameList the list of test case file names
	 * @param name the name of the test suite
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws SuiteGenerationException
	 */
	public void generateTestsuiteScript(List<String> fileNameList, String testSuiteName, String outputDir) throws URISyntaxException, IOException {
		final String templatePath = "testLayouts/testSuiteLayout.html";

		Map<String, Object> contextParams = new HashMap<String, Object>();
		contextParams.put("testSuiteName", testSuiteName);
		contextParams.put("fileNameList", fileNameList);

		String fileName = testSuiteName + ".html";
		VelocityUtils.evaluate(contextParams, templatePath, outputDir, fileName);
	}

	/**
	 * Generates a HTML testcase like, but with commands to be executed after any error occurred in the test case.
	 * @param testcase
	 * @param testcaseOutDir
	 * @param testcaseName
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public String generateAfterErrrorScript(Testcase testcase, List<SeleniumCommand> afterErrorCommandList, String testcaseOutDir, String testcaseName) throws URISyntaxException, IOException {
		String newTestcaseName = WordUtils.capitalizeFully(testcaseName) + Constants.AFTER_ERROR_SCRIPT_SUFIX;
		String afterErrorScriptsFilename = newTestcaseName + ".html";
		log.debug("Generating after error scripts for: ===" + testcaseName + " ===");
		generateTestcaseScript(testcase, afterErrorCommandList, testcaseOutDir, newTestcaseName, afterErrorScriptsFilename, "afterErrorsTestcaseLayout.html");
		return afterErrorScriptsFilename;
	}

	/**
	 * Generate a test case script in the outputDir
	 * @param testcase
	 * @param outputDir
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public void generateTestcaseScript(Testcase testcase, List<SeleniumCommand> commandList, String outputDir, String testcaseName, String testcaseFileName) throws URISyntaxException, IOException {
		generateTestcaseScript(testcase, commandList, outputDir, testcaseName, testcaseFileName, "testcaseLayout.html");
	}

	/**
	 * Generate testcase script.
	 *
	 * @param testcase the testcase
	 * @param commandList the command list
	 * @param outputDir the output dir
	 * @param testcaseName the testcase name
	 * @param testcaseFileName the testcase file name
	 * @param testcaseLayoutFileName the testcase layout file name
	 * @throws URISyntaxException the uRI syntax exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void generateTestcaseScript(Testcase testcase, List<SeleniumCommand> commandList, String outputDir, String testcaseName, String testcaseFileName, String testcaseLayoutFileName) throws URISyntaxException, IOException {
		String baseUrl = testcase.getUrl();
		boolean success = testcase.isSuccess();
		final String templatePath = "testLayouts/" + testcaseLayoutFileName;

		Map<String, Object> contextParams = new HashMap<String, Object>();
		contextParams.put("testcaseName", testcaseName);
		contextParams.put("baseUrl", baseUrl);
		contextParams.put("success", success);
		contextParams.put("seleneseCommandsList", commandList);

		VelocityUtils.evaluate(contextParams, templatePath, outputDir, testcaseFileName);
	}

	/**
	 * Fill a list of Selenese commands using a list of children from a testcase object.
	 *
	 * @param fieldsAndActions the fields and actions
	 * @return the command list
	 * @throws DextraSeleniumException the dextra selenium exception
	 */
	public List<SeleniumCommand> getCommandList(List<Object> fieldsAndActions) throws DextraSeleniumException {
		List<SeleniumCommand> commandList = new ArrayList<SeleniumCommand>();
		for (Object o : fieldsAndActions) {
			List<SeleniumCommand> commands = null;
			if (o instanceof Include) {
				/* When the object is a Include instance, 
				 * then may search the component defined by the componentName in the registry of components.
				 * A component is a subset of selenese commands, like a testcase object.
				 */
				Include include = (Include) o;
				String componentName = include.getComponentName();
				Component component = componentRegistry.getComponent(componentName);
				if (component != null) {
					List<Object> innerFieldsAndActions = component.getFieldOrCustomOrInclude();
					List<SeleniumCommand> innerCommandList = getCommandList(innerFieldsAndActions);
					commandList.addAll(innerCommandList);
				} else {
					throw new DextraSeleniumException("Can't load component: " + componentName);
				}
			} else {
				// Looks for and uses the correct command builder
				for (SeleniumCommandBuilder commandBuilder : commandBuilderList) {
					try {
						commands = commandBuilder.buildCommand(o, functionRegistry);
					} catch (Exception e) {
						throw new DextraSeleniumException(e);
					}
					if (commands != null && commands.size() > 0)
						break;
				}
			}

			if (commands != null && commands.size() > 0) {
				commandList.addAll(commands);
			}
		}
		return commandList;
	}


	public String getScreenshotsDirectory() {
		return screenshotsDirectory;
	}

	public void setScreenshotsDirectory(String screenshotsDirectory) {
		this.screenshotsDirectory = screenshotsDirectory;
	}

	public String getTestcaseName() {
		return testcaseName;
	}

	public void setTestcaseName(String testcaseName) {
		this.testcaseName = testcaseName;
	}

}
