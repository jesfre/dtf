//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.testsuite.generator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.Constants;
import com.dextratech.dtf.SeleniumCommand;
import com.dextratech.dtf.SeleniumCommand.Type;
import com.dextratech.dtf.exception.DextraSeleniumException;
import com.dextratech.dtf.utils.DataHelper;
import com.dextratech.dtf.utils.VelocityUtils;
import com.dextratech.dtf.xml.testsuite.Action;
import com.dextratech.dtf.xml.testsuite.Assertion;
import com.dextratech.dtf.xml.testsuite.CaptureScreenshot;
import com.dextratech.dtf.xml.testsuite.Component;
import com.dextratech.dtf.xml.testsuite.Field;
import com.dextratech.dtf.xml.testsuite.Function;
import com.dextratech.dtf.xml.testsuite.FunctionRef;
import com.dextratech.dtf.xml.testsuite.GenericCommand;
import com.dextratech.dtf.xml.testsuite.Include;
import com.dextratech.dtf.xml.testsuite.LocatorType;
import com.dextratech.dtf.xml.testsuite.Onload;
import com.dextratech.dtf.xml.testsuite.SeleneseAssertion;
import com.dextratech.dtf.xml.testsuite.SeleneseCommand;
import com.dextratech.dtf.xml.testsuite.Testcase;
import com.dextratech.dtf.xml.testsuite.ValidFieldValue;
import com.dextratech.dtf.xml.testsuite.ValidationFunction;

/**
 * Util class to generate HTML testfcases usin
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 *         06/05/2013
 */
public class HTMLTestsuiteGenerator {
	private static Log log = LogFactory.getLog(HTMLTestsuiteGenerator.class);
	private FunctionRegistry functionRegistry = new FunctionRegistry();
	private ComponentRegistry componentRegistry = new ComponentRegistry();

	private String screenshotsDirectory;
	private int screenshotCounter = 0;
	private String testcaseName;

	public HTMLTestsuiteGenerator(String testcaseName, String screenshotsDirectory) {
		this.screenshotsDirectory = screenshotsDirectory;
		this.testcaseName = testcaseName;
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
		generateTestcaseScript(testcase, afterErrorCommandList, testcaseOutDir, newTestcaseName, afterErrorScriptsFilename);
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
		String baseUrl = testcase.getUrl();
		boolean success = testcase.isSuccess();
		final String templatePath = "testLayouts/testcaseLayout.html";

		Map<String, Object> contextParams = new HashMap<String, Object>();
		contextParams.put("testcaseName", testcaseName);
		contextParams.put("baseUrl", baseUrl);
		contextParams.put("success", success);
		contextParams.put("seleneseCommandsList", commandList);

		VelocityUtils.evaluate(contextParams, templatePath, outputDir, testcaseFileName);
	}

	/**
	 * Fill a list of Selenese commands using a list of children from a testcase object
	 * @param fieldsAndActions
	 * @return
	 * @throws DextraSeleniumException
	 */
	public List<SeleniumCommand> getCommandList(List<Object> fieldsAndActions) throws DextraSeleniumException {
		List<SeleniumCommand> commandList = new ArrayList<SeleniumCommand>();
		for (Object o : fieldsAndActions) {
			SeleniumCommand command = null;
			if (o instanceof Field) {
				Field field = (Field) o;
				command = composeCommandForField(field);
				command.setType(Type.FIELD);
			} else if (o instanceof Action) {
				Action action = (Action) o;
				command = composeCommandForAction(action);
				command.setType(Type.ACTION);
			} else if (o instanceof Assertion) {
				Assertion assertion = (Assertion) o;
				command = composeCommandForAssertion(assertion);
				command.setType(Type.ASSERT);
			} else if (o instanceof GenericCommand) {
				GenericCommand generic = (GenericCommand) o;
				command = composeCommandForGenericCommand(generic);
				command.setType(Type.CUSTOM);
			} else if (o instanceof Onload) {
				Onload onload = (Onload) o;
				onload.getAction();
				command = composeCommandForOnload(onload);
				command.setType(Type.ONLOAD);
			} else if (o instanceof CaptureScreenshot) {
				CaptureScreenshot screenshot = (CaptureScreenshot) o;
				command = composeCommandForCaptureScreenshot(screenshot);
				command.setType(Type.CAPTURE_SCREENSHOT);
			} else if (o instanceof Include) {
				/* When the object is a Include instance, 
				 * then may search the component defined by the componentName in the registry of components.
				 * A component is a subset of selenese commands, like a testcase object.
				 */
				Include include = (Include) o;
				String componentName = include.getComponentName();
				Component component = componentRegistry.getComponent(componentName);
				if (component != null) {
					List<Object> innerFieldsAndActions = component.getFieldOrActionOrAssert();
					List<SeleniumCommand> innerCommandList = getCommandList(innerFieldsAndActions);
					commandList.addAll(innerCommandList);
				} else {
					throw new DextraSeleniumException("Can't load component: " + componentName);
				}
			}
			if (command != null) {
				command.setOriginalCommand(o);
				commandList.add(command);
			}
		}
		return commandList;
	}

	/**
	 * Creates the function(selenese type function), target and value for a captureScreenshot function
	 * @param screenshot
	 * @return
	 */
	private SeleniumCommand composeCommandForCaptureScreenshot(CaptureScreenshot screenshot) {
		SeleniumCommand command;
		String commandName = SeleneseCommand.CAPTURE_SCREENSHOT.value();
		/*
		 * Full path of the file is not more needed.
		 */
		//		String directory = screenshot.getDirectory();
		//		if (StringUtils.isBlank(directory)) {
		//			directory = screenshotsDirectory;
		//		}
		String filename = screenshot.getPngFilename();
		if (StringUtils.isBlank(filename)) {
			filename = testcaseName + "_" + (++screenshotCounter);
		}
		//		String target = directory + filename + ".png";
		String target = filename + ".png";
		command = new SeleniumCommand(commandName, target, "");
		return command;
	}

	/**
	 * Creates the function(selenese type function), target and value for an onload function
	 * @param onload
	 * @return
	 */
	private SeleniumCommand composeCommandForOnload(Onload onload) {
		boolean errorStep = onload.isErrorStep();
		String onloadAction = onload.getAction().value();
		String commandName = "onload" + WordUtils.capitalize(onloadAction);
		SeleniumCommand seleniumCommand = new SeleniumCommand(commandName, "", "", errorStep);
		return seleniumCommand;
	}

	/**
	 * Creates the function(selenese type function), target and value for a generic command
	 * @param generic
	 * @return
	 */
	private SeleniumCommand composeCommandForGenericCommand(GenericCommand generic) {
		String name = generic.getName();
		String target = generic.getTarget();
		String value = generic.getValue();
		boolean errorStep = generic.isErrorStep();

		SeleniumCommand seleniumCommand = new SeleniumCommand(name, target, value, errorStep);
		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;

	}

	/**
	 * Creates the function(selenese type function), target and value for an assertion command
	 * @param assertion
	 * @return
	 */
	private SeleniumCommand composeCommandForAssertion(Assertion assertion) {
		SeleneseAssertion assertionType = assertion.getType();
		String param1 = assertion.getParam1();
		String param2 = assertion.getParam2();
		boolean errorStep = assertion.isErrorStep();

		SeleniumCommand seleniumCommand = new SeleniumCommand(assertionType.value(), param1, param2, errorStep);
		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;

	}

	/**
	 * Creates the function(selenese type function), target and value for an action command
	 * @param action
	 * @return
	 */
	private SeleniumCommand composeCommandForAction(Action action) {
		LocatorType locatorType = action.getLocatorType();
		String locatorValue = action.getLocatorValue();
		String finalLocator = createLocator(locatorType, locatorValue);
		String actionType = action.getActionType().value();
		String additionalParam = action.getAdditionalParameter();
		boolean errorStep = action.isErrorStep();

		SeleniumCommand seleniumCommand = new SeleniumCommand(actionType, finalLocator, additionalParam, errorStep);
		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;
	}

	/**
	 * Creates the function(selenese type function), target and value for a tested field
	 * @param field
	 * @return
	 */
	private SeleniumCommand composeCommandForField(Field field) {
		LocatorType locatorType = field.getLocatorType();
		String locatorValue = field.getLocatorValue();
		String finalLocator = createLocator(locatorType, locatorValue);
		boolean errorStep = field.isErrorStep();

		/* Gets the valid value from attribute or from a validFieldValue element.
		 * Attribute validValue is mandatory.
		 */
		String testingValue = field.getValidValue();
		if (testingValue == null) {
			ValidFieldValue validFieldValue = field.getValidValueDef();
			if (validFieldValue != null) {
				String literal = validFieldValue.getLiteral();
				Function fn = validFieldValue.getFunction();
				FunctionRef fnRef = validFieldValue.getFunctionRef();
				if (StringUtils.isNotBlank(literal)) {
					testingValue = literal;

				} else if (fn != null) {
					testingValue = DataHelper.getTestValue(fn);

				} else if (fnRef != null) {
					String fnRefId = fnRef.getFunctionRefId();
					Function fnReferred = functionRegistry.getFunction(fnRefId);
					testingValue = DataHelper.getTestValue(fnReferred);
				}
			}
		}

		SeleniumCommand seleniumCommand = new SeleniumCommand(SeleneseCommand.TYPE.value(), finalLocator, testingValue, errorStep);
		List<Object> validationList = field.getValidateOrValidateFunctionOrValidateFunctionRef();
		seleniumCommand.setValidations(validationList);

		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;
	}

	/**
	 * Create a string that represents the locator expression for Selenese.
	 * @param locatorType
	 * @param locatorValue
	 * @return
	 */
	private String createLocator(LocatorType locatorType, String locatorValue) {
		if (locatorType == null) {
			return locatorValue;
		}
		String locator = "";
		switch (locatorType) {
		case XPATH:
			// Return the value itself because a xpath locator is expressed like //a[contains(text(),'Entrar')]
			locator = locatorValue;
			break;
		case NOTHING:
			locator = locatorValue;
			break;
		default:
			// Return locatorType=locatorValue because all other locator are expressed like id=j_username
			locator = locatorType.value() + "=" + locatorValue;
			break;
		}
		return locator;
	}

	public String getScreenshotsDirectory() {
		return screenshotsDirectory;
	}

	public void setScreenshotsDirectory(String screenshotsDirectory) {
		this.screenshotsDirectory = screenshotsDirectory;
	}

	public int getScreenshotCounter() {
		return screenshotCounter;
	}

	public void setScreenshotCounter(int screenshotCounter) {
		this.screenshotCounter = screenshotCounter;
	}

	public String getTestcaseName() {
		return testcaseName;
	}

	public void setTestcaseName(String testcaseName) {
		this.testcaseName = testcaseName;
	}

}
