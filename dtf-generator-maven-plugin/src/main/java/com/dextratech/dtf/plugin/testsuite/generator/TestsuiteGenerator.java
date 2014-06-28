//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.plugin.testsuite.generator;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.springframework.beans.BeanUtils;

import com.dextratech.dtf.common.Constants;
import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.common.SeleniumCommand.Type;
import com.dextratech.dtf.exception.DextraSeleniumException;
import com.dextratech.dtf.exception.NotFoundElementException;
import com.dextratech.dtf.plugin.html2java.Html2JavaConverter;
import com.dextratech.dtf.plugin.parser.TestHtmlParser;
import com.dextratech.dtf.plugin.utils.DataHelper;
import com.dextratech.dtf.plugin.utils.VelocityUtils;
import com.dextratech.dtf.plugin.xml.configuration.Configuration;
import com.dextratech.dtf.xml.testsuite.ActionOption;
import com.dextratech.dtf.xml.testsuite.AssertionAction;
import com.dextratech.dtf.xml.testsuite.Component;
import com.dextratech.dtf.xml.testsuite.Components;
import com.dextratech.dtf.xml.testsuite.Function;
import com.dextratech.dtf.xml.testsuite.Testcase;
import com.dextratech.dtf.xml.testsuite.Testsuite;
import com.dextratech.dtf.xml.testsuite.Validation;
import com.dextratech.dtf.xml.testsuite.ValidationCombination;
import com.dextratech.dtf.xml.testsuite.ValidationCombinationsType;
import com.dextratech.dtf.xml.testsuite.ValidationFunction;
import com.dextratech.dtf.xml.testsuite.ValidationFunctionRef;
import com.dextratech.dtf.xml.testsuite.ValidationRules;

/**
 * Generates HTML and XLS of testsuites from a XML.
 * 
 * @goal xml-testsuites
 * @phase process-sources
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 *         06/05/2013
 */
public class TestsuiteGenerator extends Html2JavaConverter {
	private static Log log = LogFactory.getLog(TestsuiteGenerator.class);

	/**
	 * Location of the XLS data source file for this test case script
	 * @parameter expression="${dtf-testsuites-dir}"
	 * @readonly
	 */
	private String testsuitesXMLLocation;

	/**
	 * Location of the XML that contains all the global validations functions for all test suites.
	 * @parameter expression="${dtf-testsuites-dir}/validation-functions.xml"
	 * @readonly
	 */
	private String validationFunctionsXmlPath;

	/**
	 * Location of the XML that contains all the global components for all test suites.
	 * @parameter expression="${dtf-testsuites-dir}/components.xml"
	 * @readonly
	 */
	private String componentsXmlPath;

	public static FunctionRegistry vFunctionRegistry = new FunctionRegistry();
	public static ComponentRegistry componentRegistry = new ComponentRegistry();

	private static final String JAXB_CONTEXT_PATH_TESTSUITE = "com.dextratech.dtf.xml.testsuite";

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		log.trace("Running the TestSuiteGenerator...");

		File testsuitesLocation = new File(testsuitesXMLLocation);

		// Iterate the directory to obtain all testsuites from XML files
		if (testsuitesLocation.exists()) {
			if (testsuitesLocation.isDirectory()) {
				if (settingsFile != null && settingsFile.exists()) {
					prefix = "Suite";
					packagePostfix = "";
					if (!testSuitesBasePackage.equals(packagePostfix)) {
						testSuitesBasePackage += "." + packagePostfix;
					}

					setupSeleniumSourceCode();

					loadGlobalFunctions();

					loadGlobalComponents();

					log.trace("Fetching and loading testsuites...");
					Configuration config = setupSettings();
					List<com.dextratech.dtf.plugin.xml.configuration.Testsuite> testsuiteList = config.getTestsuite();
					int testsuiteCounter = 0;

					/*
					 * This for is executed only for logging entries.
					 */
					for (com.dextratech.dtf.plugin.xml.configuration.Testsuite tst : testsuiteList) {
						log.trace("Found " + tst);
					}

					for (com.dextratech.dtf.plugin.xml.configuration.Testsuite tst : testsuiteList) {
						/* For each runnable testsuite element, 
						 * a HTML testsuite script and a set of testcase scripts will be generated.
						 */
						String fileName = null;
						if (StringUtils.isNotBlank(tst.getFileName())) {
							fileName = tst.getFileName();
						} else {
							fileName = tst.getName() + ".xml";
						}

						log.debug("Processing [ " + fileName + " ]");

						boolean isRunnable = tst.isRun() != null && tst.isRun();
						if (isRunnable == false) {
							log.warn("[ " + fileName + " ] is not runnable.");
							continue;
						}

						String filePath = testsuitesXMLLocation + Constants.SEPARATOR + fileName;
						File testsuiteFile = new File(filePath);
						if (!testsuiteFile.exists()) {
							throw new MojoExecutionException("The testsuite file [ " + filePath + " ] doesn't exist.");
						}

						boolean dbSnapshot = tst.isDbSnapshot() != null && tst.isDbSnapshot();
						boolean dbRestore = tst.isDbRestore() != null && tst.isDbRestore();
						if (testsuiteFile.exists()) {
							try {

								Testsuite testsuite = getTestsuite(testsuiteFile);
								generateHTMLScripts(testsuite, generatedHtmlTestsuitesPath, ++testsuiteCounter, dbSnapshot, dbRestore);

							} catch (JAXBException e) {
								log.error(e.getMessage(), e);
							} catch (URISyntaxException e) {
								log.error(e.getMessage(), e);
							} catch (IOException e) {
								log.error(e.getMessage(), e);
							} catch (DextraSeleniumException e) {
								log.error(e.getMessage(), e);
							} catch (NotFoundElementException e) {
								log.error(e.getMessage(), e);
							}
						} else {
							log.error("File not found: " + filePath);
						}
					}

				}
			}
		} else {
			throw new MojoExecutionException("Testsuite location [" + testsuitesLocation + "] doesn't exist.");
		}
	}

	/**
	 * Loads all validation functions and adds all to a function registry.
	 * Occurs only once per goal execution and must be useful for all test suites.
	 * @return
	 */
	private void loadGlobalFunctions() {
		File vFunctionsXmlFile = new File(validationFunctionsXmlPath);
		if (vFunctionsXmlFile.exists()) {
			try {
				log.debug("Loading validation functions...");
				JAXBContext context = JAXBContext.newInstance(JAXB_CONTEXT_PATH_TESTSUITE);
				Unmarshaller unmarshaller = context.createUnmarshaller();
				Object unmarshalled = unmarshaller.unmarshal(vFunctionsXmlFile);
				JAXBElement<ValidationRules> testsuiteJaxb = (JAXBElement<ValidationRules>) unmarshalled;
				ValidationRules vRules = testsuiteJaxb.getValue();

				List<ValidationFunction> vFunctionList = vRules.getFunction();
				for (ValidationFunction fn : vFunctionList) {
					log.debug("Function loaded > " + fn.getId());
				}
				vFunctionRegistry.addAll(vFunctionList);
			} catch (JAXBException e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		}
	}

	/**
	 * Loads all components and adds all to a component registry.
	 * Occurs only once per goal execution and must be useful for all test suites.
	 * @return
	 */
	private void loadGlobalComponents() {
		File componentsXmlFile = new File(componentsXmlPath);
		if (componentsXmlFile.exists()) {
			try {
				log.debug("Loading components...");
				JAXBContext context = JAXBContext.newInstance(JAXB_CONTEXT_PATH_TESTSUITE);
				Unmarshaller unmarshaller = context.createUnmarshaller();
				Object unmarshalled = unmarshaller.unmarshal(componentsXmlFile);
				JAXBElement<Components> testsuiteJaxb = (JAXBElement<Components>) unmarshalled;
				Components components = testsuiteJaxb.getValue();

				List<Component> componentList = components.getComponent();
				for (Component cmp : componentList) {
					log.debug("Component loaded > " + cmp.getName());
				}
				componentRegistry.addAll(componentList);
			} catch (JAXBException e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		}
	}

	/**
	 * Generates a list of testcases for a testsuite.
	 * Each testcase defined in the XML can generate more than one testcase HTML file,
	 * depending on the number of validations per field.
	 * @param testsuite
	 * @param testSuitesDirectory
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws DextraSeleniumException
	 * @throws NotFoundElementException 
	 */
	public void generateHTMLScripts(Testsuite testsuite, File testSuitesDirectory, int testsuiteCounter, boolean dbSnapshot, boolean dbRestore) throws URISyntaxException, IOException, DextraSeleniumException, NotFoundElementException {
		List<String> testcaseFilenames = new ArrayList<String>();
		String testsuiteFilename = testsuite.getName();
		String testsuiteOutDir = testSuitesDirectory.getAbsolutePath();

		log.debug("Generating test suite for: ============ " + testsuiteFilename + " ============");
		List<Testcase> testcaseList = testsuite.getTestcase();

		FunctionRegistry tmpFunctionRegistry = new FunctionRegistry(vFunctionRegistry);
		ValidationRules vRules = testsuite.getValidationFunctions();
		if (testcaseList.size() > 0 && vRules != null) {
			tmpFunctionRegistry.addAll(vRules.getFunction());
		}

		int packageCounter = 0;
		List<Component> componentList = testsuite.getComponent();
		HTMLTestsuiteGenerator htmlTestsuiteGenerator = null;
		for (Testcase testcase : testcaseList) {
			log.debug("Found testcase [ " + testcase.getName() + " ]");
			List<String> testClassNameList = new ArrayList<String>();
			// Generate only testcase signed with run=true
			if (testcase.isRun()) {
				String testcaseOutDir = testsuiteOutDir + Constants.SEPARATOR + testsuiteFilename;
				String testcaseName = testcase.getName();
				String afterErrorActionsSentences = null;
				String defaultAssert = testcase.getDefaultAssert();

				htmlTestsuiteGenerator = new HTMLTestsuiteGenerator(testcaseName, screenshotsDirectory);
				htmlTestsuiteGenerator.addComponents(componentRegistry);
				htmlTestsuiteGenerator.addComponents(componentList);
				htmlTestsuiteGenerator.addFunctions(tmpFunctionRegistry);

				String finalPackageTarget = testSuitesBasePackage;
				finalPackageTarget += "ts" + testsuiteCounter + "." + WordUtils.uncapitalize(testsuiteFilename);
				finalPackageTarget += ".tc" + (++packageCounter) + "." + WordUtils.uncapitalize(testcaseName);
				finalPackageTarget = StringUtils.deleteWhitespace(finalPackageTarget);
				String subpath = StringUtils.replace(finalPackageTarget, ".", Constants.SEPARATOR);
				String javaTestSuiteDir = javaTestSuitesDirectory + Constants.SEPARATOR + subpath;

				// If exists, generates the actions to run after errors
				ActionOption afterErrorActions = testcase.getAfterErrorActions();
				if (afterErrorActions != null) {
					log.trace("After error actions found.");
					List<Object> afterErrorCommandObjectList = afterErrorActions.getFieldOrCustomOrInclude();
					List<SeleniumCommand> afterErrorCommandList = htmlTestsuiteGenerator.getCommandList(afterErrorCommandObjectList);

					String afterErrorActionsHtmlFileName = htmlTestsuiteGenerator.generateAfterErrrorScript(testcase, afterErrorCommandList, testcaseOutDir, testcaseName);

					String javaTestcaseName = testcaseName + com.dextratech.dtf.plugin.Constants.AFTER_ERROR_SCRIPT_SUFIX;
					String afterErrorActionsClassName = generateJavaTestcase(testcase, testcaseOutDir, afterErrorActionsHtmlFileName, javaTestSuiteDir, finalPackageTarget, javaTestcaseName, dbSnapshot, dbRestore, null);

					if (afterErrorActionsClassName != null) {
						afterErrorActionsSentences = getAfterErrorSentences(javaTestSuiteDir, afterErrorActionsClassName);
					}
				}

				List<Object> fieldsAndActions = testcase.getFieldOrCustomOrInclude();
				List<SeleniumCommand> commandList = htmlTestsuiteGenerator.getCommandList(fieldsAndActions);

				boolean combineDefaults = true;
				boolean excludeValidValuesCombination = false;
				boolean hasCombinations = false;

				ValidationCombinationsType valdationCombinationsType = testcase.getCombineValidations();
				boolean hasCombineValidationsElement = valdationCombinationsType != null;
				List<ValidationCombination> validationCombinationList = null;
				if (hasCombineValidationsElement) {
					validationCombinationList = valdationCombinationsType.getCombine();
					hasCombinations = validationCombinationList != null && validationCombinationList.size() > 0;
					combineDefaults = valdationCombinationsType.isCombineDefaults();
					excludeValidValuesCombination = valdationCombinationsType.isExcludeValidValuesCombination();

					if (combineDefaults) {
						log.trace("Default combinations will be generated.");
					} else {
						log.info("Default combinations will be avoided.");
					}

					if (excludeValidValuesCombination) {
						log.info("Combinations of valid values will be avoided.");
					} else {
						log.trace("Combinations of valid values will be generated.");
					}

				} else {
					log.debug("Doesn't has combineValidations element.");
				}

				/*
				 * Here the combination of valid values will be created.
				 */
				if (testcase.isRunDefault() && !excludeValidValuesCombination) {
					log.info("Creating valid values combination.");
					createValidValuesCombination(
							dbSnapshot,
							dbRestore,
							testcaseFilenames,
							htmlTestsuiteGenerator,
							testcase,
							testClassNameList,
							testcaseOutDir,
							testcaseName,
							afterErrorActionsSentences,
							defaultAssert,
							finalPackageTarget,
							javaTestSuiteDir,
							commandList);
				}

				/*
				 * Looks for validations in each command
				 * to generate a new test case for each validation found.
				 * Here the default combinations will be created.
				 */
				if (combineDefaults) {
					log.info("Creating default combinations.");
					createDefaultCombinations(
							dbSnapshot,
							dbRestore,
							testcaseFilenames,
							tmpFunctionRegistry,
							htmlTestsuiteGenerator,
							testcase,
							testClassNameList,
							testcaseOutDir,
							testcaseName,
							afterErrorActionsSentences,
							finalPackageTarget,
							javaTestSuiteDir,
							commandList);
				}

				/*
				 * Looks for customized combinations of validations to create a Java testcase for each one.
				 */
				if (hasCombinations || validationCombinationList == null) {
					log.info("Creating custom combinations.");
					createCustomCombinations(
							dbSnapshot,
							dbRestore,
							testcaseFilenames,
							tmpFunctionRegistry,
							htmlTestsuiteGenerator,
							testcase,
							testClassNameList,
							testcaseOutDir,
							testcaseName,
							afterErrorActionsSentences,
							finalPackageTarget,
							javaTestSuiteDir,
							commandList,
							validationCombinationList);
				}

				// Generates a test suite Java file to invoke the list of test cases.
				String testSuiteFileName = generateJavaTestsuite(testClassNameList, testcaseName, finalPackageTarget, javaTestSuiteDir);
			} else {
				log.info("Found testcase [ " + testcase.getName() + " ] but 'run' is [" + testcase.isRun() + "]");
			}
		}
		if (htmlTestsuiteGenerator != null) {
			htmlTestsuiteGenerator.generateTestsuiteScript(testcaseFilenames, testsuiteFilename, testsuiteOutDir);
		}
	}

	/**
	 * Creates the custom combinations.
	 *
	 * @param dbSnapshot the db snapshot
	 * @param dbRestore the db restore
	 * @param testcaseFilenames the testcase filenames
	 * @param tmpFunctionRegistry the tmp function registry
	 * @param htmlTestsuiteGenerator the html testsuite generator
	 * @param testcase the testcase
	 * @param testClassNameList the test class name list
	 * @param testcaseOutDir the testcase out dir
	 * @param testcaseName the testcase name
	 * @param afterErrorActionsSentences the after error actions sentences
	 * @param finalPackageTarget the final package target
	 * @param javaTestSuiteDir the java test suite dir
	 * @param commandList the command list
	 * @param validationCombinationList the validation combination list
	 * @throws DextraSeleniumException the dextra selenium exception
	 * @throws NotFoundElementException the not found element exception
	 * @throws URISyntaxException the uRI syntax exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void createCustomCombinations(boolean dbSnapshot, boolean dbRestore, List<String> testcaseFilenames, FunctionRegistry tmpFunctionRegistry, HTMLTestsuiteGenerator htmlTestsuiteGenerator, Testcase testcase, List<String> testClassNameList, String testcaseOutDir, String testcaseName, String afterErrorActionsSentences, String finalPackageTarget, String javaTestSuiteDir, List<SeleniumCommand> commandList, List<ValidationCombination> validationCombinationList) throws DextraSeleniumException, NotFoundElementException, URISyntaxException, IOException {
		log.trace("Found [ " + validationCombinationList.size() + " ] combinations.");
		int testcaseCounter = 0;
		for (ValidationCombination combination : validationCombinationList) {
			String combinationId = combination.getId();
			String combinationAssertId = combination.getAssertId();
			String commaSeparatedValidationIds = combination.getValidations();
			String[] validationIdArray = StringUtils.split(commaSeparatedValidationIds, ',');

			// Clone the original command list
			List<SeleniumCommand> newCommandList4Combination = new ArrayList<SeleniumCommand>(commandList.size());
			for (SeleniumCommand sc : commandList) {
				try {
					newCommandList4Combination.add(sc.clone());
				} catch (CloneNotSupportedException e) {
					log.error(e.getMessage(), e);
					throw new DextraSeleniumException(e);
				}
			}

			// Remove from the list the fields that doesn't match any validationId in the combination
			List<String> foundValidationList = new ArrayList<String>();
			for (int i = 0; i < newCommandList4Combination.size(); i++) {
				SeleniumCommand sc = newCommandList4Combination.get(i);
				List<Object> validationObjectList = sc.getValidations();
				if (validationObjectList.size() > 0) {
					for (Object vObject : validationObjectList) {
						ValidationContent validationContent = getValidationContent(tmpFunctionRegistry, vObject);
						String validationName = validationContent.getValidationName();
						boolean isValidationInCombination = Arrays.asList(validationIdArray).contains(validationName);
						if (isValidationInCombination) {
							sc.setValue(validationContent.getValue());
							sc.setErrorStep(validationContent.isCauseError());
							sc.setTestingCommand4Testcase(true);
							foundValidationList.add(validationName);
						}
					}
				}
			}
			if (foundValidationList.size() != validationIdArray.length) {
				throw new NotFoundElementException(
						"Some validation couldn't be found while testing combination with Id [" + combinationId + "]. "
								+ "Expected validations are " + Arrays.toString(validationIdArray) + ", but found " + foundValidationList.toString());
			}

			List<SeleniumCommand> copyCommandList = createDeepCopyForValidation(newCommandList4Combination, combinationAssertId);
			// Build a new testcase name for each validation found
			String newTestcaseName = capitalize(testcaseName) + "_Comb_" + (++testcaseCounter);
			if (StringUtils.isNotBlank(combinationId)) {
				newTestcaseName += "_" + capitalize(combinationId);
			}
			newTestcaseName = StringUtils.deleteWhitespace(newTestcaseName);
			String htmlFilename = newTestcaseName + ".html";

			log.debug("Generating testcase for: ===" + testcaseName + " ===");
			htmlTestsuiteGenerator.generateTestcaseScript(testcase, copyCommandList, testcaseOutDir, newTestcaseName, htmlFilename);
			testcaseFilenames.add(htmlFilename);

			String testcaseClassName = generateJavaTestcase(testcase, testcaseOutDir, htmlFilename, javaTestSuiteDir, finalPackageTarget, newTestcaseName, dbSnapshot, dbRestore, afterErrorActionsSentences);
			testClassNameList.add(testcaseClassName + ".class");
		}
	}

	/**
	 * Creates the valid values combination.
	 *
	 * @param dbSnapshot the db snapshot
	 * @param dbRestore the db restore
	 * @param testcaseFilenames the testcase filenames
	 * @param htmlTestsuiteGenerator the html testsuite generator
	 * @param testcase the testcase
	 * @param testClassNameList the test class name list
	 * @param testcaseOutDir the testcase out dir
	 * @param testcaseName the testcase name
	 * @param afterErrorActionsSentences the after error actions sentences
	 * @param defaultAssert the default assert
	 * @param finalPackageTarget the final package target
	 * @param javaTestSuiteDir the java test suite dir
	 * @param commandList the command list
	 * @throws NotFoundElementException the not found element exception
	 * @throws URISyntaxException the uRI syntax exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void createValidValuesCombination(boolean dbSnapshot, boolean dbRestore, List<String> testcaseFilenames, HTMLTestsuiteGenerator htmlTestsuiteGenerator, Testcase testcase, List<String> testClassNameList, String testcaseOutDir, String testcaseName, String afterErrorActionsSentences, String defaultAssert, String finalPackageTarget, String javaTestSuiteDir, List<SeleniumCommand> commandList) throws NotFoundElementException, URISyntaxException, IOException {
		List<SeleniumCommand> copyCommandList = createDeepCopyForValidation(commandList, defaultAssert);

		// Generates the default test case, with all valid values for fields, that have to be run at last.
		String htmlFilename = capitalize(testcaseName) + ".html";
		log.debug("Generating testcase for: ===" + testcaseName + " ===");
		htmlTestsuiteGenerator.generateTestcaseScript(testcase, copyCommandList, testcaseOutDir, testcaseName, htmlFilename);
		testcaseFilenames.add(htmlFilename);
		String testcaseClassName = generateJavaTestcase(testcase, testcaseOutDir, htmlFilename, javaTestSuiteDir, finalPackageTarget, testcaseName, dbSnapshot, dbRestore, afterErrorActionsSentences);
		testClassNameList.add(testcaseClassName + ".class");
	}

	/**
	 * Creates the default combinations of field validations with valid values.
	 *
	 * @param dbSnapshot the db snapshot
	 * @param dbRestore the db restore
	 * @param testcaseFilenames the testcase filenames
	 * @param tmpFunctionRegistry the tmp function registry
	 * @param htmlTestsuiteGenerator the html testsuite generator
	 * @param testcase the testcase
	 * @param testClassNameList the test class name list
	 * @param testcaseOutDir the testcase out dir
	 * @param testcaseName the testcase name
	 * @param afterErrorActionsSentences the after error actions sentences
	 * @param finalPackageTarget the final package target
	 * @param javaTestSuiteDir the java test suite dir
	 * @param commandList the command list
	 * @throws NotFoundElementException the not found element exception
	 * @throws URISyntaxException the uRI syntax exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void createDefaultCombinations(final boolean dbSnapshot, final boolean dbRestore, final List<String> testcaseFilenames, final FunctionRegistry tmpFunctionRegistry, final HTMLTestsuiteGenerator htmlTestsuiteGenerator, final Testcase testcase, final List<String> testClassNameList, final String testcaseOutDir, final String testcaseName, final String afterErrorActionsSentences, final String finalPackageTarget, final String javaTestSuiteDir, final List<SeleniumCommand> commandList) throws NotFoundElementException, URISyntaxException, IOException {
		int testcaseCounter = 0;
		for (int i = 0; i < commandList.size(); i++) {
			SeleniumCommand sc = commandList.get(i);
			List<Object> validationObjectList = sc.getValidations();
			if (validationObjectList.size() > 0) {
				for (Object vObject : validationObjectList) {
					ValidationContent validationContent = getValidationContent(tmpFunctionRegistry, vObject);

					List<SeleniumCommand> copyCommandList = createDeepCopyForValidation(commandList, validationContent.getAssertionId());
					int indexOfSC = copyCommandList.indexOf(sc);
					SeleniumCommand copySc = copyCommandList.get(indexOfSC);
					copySc.setValue(validationContent.getValue());
					copySc.setErrorStep(validationContent.isCauseError());
					copySc.setTestingCommand4Testcase(true);

					// Build a new testcase name for each validation found
					String newTestcaseName = capitalize(testcaseName) + "_" + (++testcaseCounter);
					if (StringUtils.isNotBlank(validationContent.getValidationName())) {
						newTestcaseName += "_" + capitalize(validationContent.getValidationName());
					}
					newTestcaseName = StringUtils.deleteWhitespace(newTestcaseName);
					String htmlFilename = newTestcaseName + ".html";

					log.debug("Generating testcase for: ===" + testcaseName + " ===");
					htmlTestsuiteGenerator.generateTestcaseScript(testcase, copyCommandList, testcaseOutDir, newTestcaseName, htmlFilename);
					testcaseFilenames.add(htmlFilename);

					String testcaseClassName = generateJavaTestcase(testcase, testcaseOutDir, htmlFilename, javaTestSuiteDir, finalPackageTarget, newTestcaseName, dbSnapshot, dbRestore, afterErrorActionsSentences);
					testClassNameList.add(testcaseClassName + ".class");
				}
			}
		}
	}

	/**
	 * Gets the validation content from the validationObject.
	 *
	 * @param tmpFunctionRegistry the tmp function registry
	 * @param validationObject the validation object
	 * @return the validation content
	 */
	private ValidationContent getValidationContent(final FunctionRegistry tmpFunctionRegistry, Object validationObject) {
		String validationName = null;
		String validationValue = "";
		String assertionId = null;
		boolean causeError = false;

		// TODO extract like AssertionsCommandBuilder and other *CommandBuilders
		// TODO make static properties to handle global values like testcaseFilenames, testClassNameList, and others.

		if (validationObject instanceof Validation) {
			Validation validation = (Validation) validationObject;
			causeError = !validation.isValid();
			validationName = validation.getName();
			validationValue = validation.getContent();
			assertionId = validation.getAssertId();

		} else if (validationObject instanceof ValidationFunction) {
			// For a function object, the ID will be used as validation name
			ValidationFunction vFunction = (ValidationFunction) validationObject;
			causeError = !vFunction.isValid();
			validationName = vFunction.getId();
			validationValue = DataHelper.getTestValue(vFunction);
			assertionId = vFunction.getAssertId();

		} else if (validationObject instanceof ValidationFunctionRef) {
			ValidationFunctionRef vFunction = (ValidationFunctionRef) validationObject;
			causeError = !vFunction.isValid();
			validationName = vFunction.getName();
			String fnId = vFunction.getFunctionRefId();
			if (StringUtils.isBlank(validationName)) {
				validationName = fnId;
			}

			Function fn = tmpFunctionRegistry.getFunction(fnId);
			validationValue = DataHelper.getTestValue(fn);
			assertionId = vFunction.getAssertId();
		}
		ValidationContent validationContent = new ValidationContent(validationName, validationValue, assertionId, causeError);
		return validationContent;
	}

	/**
	 * Removes all assert commands that doensn't match the assertionId parameter.
	 * Creates a copy of the commands because of some commands must be modified
	 * in order to create a different test case for each validation.
	 * For each Selenium Command must have to create a deep copy, because a reference copy makes confusion errors about its final valid value.
	 * @param commandList
	 * @param assertionId
	 * @throws NotFoundElementException 
	 */
	private List<SeleniumCommand> createDeepCopyForValidation(List<SeleniumCommand> commandList, String assertionId) throws NotFoundElementException {
		List<SeleniumCommand> copyCommandList = new ArrayList<SeleniumCommand>();
		boolean foundAssertionIdInList = false;
		for (SeleniumCommand sc2Copy : commandList) {
			boolean includeThis = true;
			if (sc2Copy.getType() == Type.ASSERT) {
				AssertionAction assertion = (AssertionAction) sc2Copy.getOriginalCommand();
				String assertId = assertion.getId();
				if (StringUtils.isNotBlank(assertId) && !assertId.equals(assertionId)) {
					includeThis = false;
				}
				/*
				 * Makes sure that the assertionId looked for is not the assert tested in this loop
				 * If the looked assertion can't been found, then throws an exception.
				 */
				if (!foundAssertionIdInList) {
					foundAssertionIdInList = assertId != null && includeThis && assertId.equals(assertionId);
				}
			}
			if (includeThis) {
				SeleniumCommand scCopy = new SeleniumCommand();
				BeanUtils.copyProperties(sc2Copy, scCopy);
				copyCommandList.add(scCopy);
			}
		}
		
		if(StringUtils.isNotBlank(assertionId) && !foundAssertionIdInList) {
			throw new NotFoundElementException("Assertion with id [ " + assertionId + " ] not found.");
		}
		
		return copyCommandList;
	}

	/**
	 * @param javaTestSuiteDir
	 * @param afterErrorActionsClassName
	 * @return
	 * @throws IOException
	 */
	private String getAfterErrorSentences(String javaTestSuiteDir, String afterErrorActionsClassName) throws IOException {
		StringBuilder afterErrorActionsSentenceBuilder = new StringBuilder("");
		afterErrorActionsClassName = StringUtils.remove(afterErrorActionsClassName, ".class");
		File aeActionsJavaFile = new File(javaTestSuiteDir + Constants.SEPARATOR + afterErrorActionsClassName + ".java");
		List<String> sentenceList = FileUtils.readLines(aeActionsJavaFile);
		for (String line : sentenceList) {
			/* Get only lines that doesn't contains "setStepInfo(...)" method call.
			 * This call is not necessary because stepError flag, screenshots and current command status doesn't matter.
			 */
			if (!StringUtils.contains(line, "setStepInfo")) {
				afterErrorActionsSentenceBuilder.append("\n" + line);
			}
		}
		String afterErrorActionsSentences = StringUtils.substringBetween(afterErrorActionsSentenceBuilder.toString(), "try {", "} catch (Throwable e) {");
		FileUtils.forceDelete(aeActionsJavaFile);
		return afterErrorActionsSentences;
	}

	/**
	 * @param testClassNameList
	 * @param testcaseName
	 * @param finalPackageTarget
	 * @param javaTestSuiteDir
	 * @throws URISyntaxException
	 * @throws IOException
	 * @return
	 */
	private String generateJavaTestsuite(List<String> testClassNameList, String testcaseName, String finalPackageTarget, String javaTestSuiteDir) throws URISyntaxException, IOException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("testSuitePackageName", finalPackageTarget);
		params.put("testClassNameList", testClassNameList);

		// Remove spaces and capitalize all words of the test suite name
		String testSuiteName = testcaseName;
		testSuiteName = StringUtils.replace(testSuiteName, "_", " ");
		testSuiteName = capitalize(testSuiteName);
		testSuiteName = StringUtils.replace(testSuiteName, " ", "");
		testSuiteName = prefix + testSuiteName;
		params.put("testSuiteClassName", testSuiteName);

		String testSuiteFileName = testSuiteName + ".java";

		VelocityUtils.evaluate(params, testSuiteTemplatePath, javaTestSuiteDir, testSuiteFileName);
		return testSuiteFileName;
	}

	/**
	 * Get a testsuite object from a bound XML file.
	 * @param xmlFile
	 * @return
	 * @throws JAXBException
	 */
	private Testsuite getTestsuite(File xmlFile) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(JAXB_CONTEXT_PATH_TESTSUITE);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object unmarshalled = unmarshaller.unmarshal(xmlFile);
		JAXBElement<Testsuite> testsuiteJaxb = (JAXBElement<Testsuite>) unmarshalled;
		Testsuite testsuite = testsuiteJaxb.getValue();
		return testsuite;
	}

	private String generateJavaTestcase(Testcase testcase, String testcaseOutDir, String afterErrorActionsHtmlFileName, String javaTestSuiteDir, String finalPackageTarget, String testcaseName, boolean dbSnapshot, boolean dbRestore, String afterErrorActionsSentences) throws IOException {
		String testName = testcaseName;
		testName = StringUtils.capitalize(testName);

		File javaTestDestinationDir = new File(javaTestSuiteDir);
		javaTestDestinationDir.mkdirs();

		File htmlTestFile = new File(testcaseOutDir + Constants.SEPARATOR + afterErrorActionsHtmlFileName);
		TestHtmlParser testParser = new TestHtmlParser(htmlTestFile);

		String javaTestcaseContent = convertTestCase(testParser, testcaseName, testName, finalPackageTarget, dbSnapshot, dbRestore);

		if (afterErrorActionsSentences != null) {
			// Adding the actions to fire if an error occurs.
			final StringBuilder AFTER_ERROR_ACTIONS_PREFIX = new StringBuilder("private void runAfterErrorCommands() {");
			final StringBuilder AFTER_ERROR_ACTIONS_MESSAGE = new StringBuilder();
			//			AFTER_ERROR_ACTIONS_MESSAGE.append("\n\t\tselenium.setContext(\"Firing actions after error...\");");
			// AFTER_ERROR_ACTIONS_MESSAGE.append("\n\t\ttry {");
			// AFTER_ERROR_ACTIONS_MESSAGE.append("\n\t\t\tselenium.wait(1000);");
			// AFTER_ERROR_ACTIONS_MESSAGE.append("\n\t\t} catch (InterruptedException e) {");
			// AFTER_ERROR_ACTIONS_MESSAGE.append("\n\t\t\te.printStackTrace();");
			// AFTER_ERROR_ACTIONS_MESSAGE.append("\n\t\t}");

			String afterErrorActionsReplacement = AFTER_ERROR_ACTIONS_PREFIX.toString() + AFTER_ERROR_ACTIONS_MESSAGE.toString() + afterErrorActionsSentences;
			javaTestcaseContent = StringUtils.replaceOnce(javaTestcaseContent, AFTER_ERROR_ACTIONS_PREFIX.toString(), afterErrorActionsReplacement);
		}

		File javaTestFile = new File(javaTestDestinationDir.getAbsolutePath() + Constants.SEPARATOR + testName + ".java");
		FileUtils.writeStringToFile(javaTestFile, javaTestcaseContent);
		log.debug(finalPackageTarget + "." + testName + ".class");

		return testName;
	}

	/**
	 * @param string
	 * @return
	 */
	private String capitalize(String string) {
		return WordUtils.capitalize(string, new char[] { '.', ' ', '_', '-' });
	}

	public String getTestsuitesXMLLocation() {
		return testsuitesXMLLocation;
	}

	public void setTestsuitesXMLLocation(String testsuitesXMLLocation) {
		this.testsuitesXMLLocation = testsuitesXMLLocation;
	}

	public String getValidationFunctionsXmlPath() {
		return validationFunctionsXmlPath;
	}

	public void setValidationFunctionsXmlPath(String validationFunctionsXMLPath) {
		this.validationFunctionsXmlPath = validationFunctionsXMLPath;
	}

}

class ValidationContent {
	private String validationName = null;
	private String value = "";
	private String assertionId = null;
	private boolean causeError = false;

	public ValidationContent() {
	}

	public ValidationContent(String validationName, String value, String assertionId, boolean causeError) {
		this.validationName = validationName;
		this.value = value;
		this.assertionId = assertionId;
		this.causeError = causeError;
	}

	public String getValidationName() {
		return validationName;
	}

	public void setValidationName(String validationName) {
		this.validationName = validationName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getAssertionId() {
		return assertionId;
	}

	public void setAssertionId(String assertionId) {
		this.assertionId = assertionId;
	}

	public boolean isCauseError() {
		return causeError;
	}

	public void setCauseError(boolean causeError) {
		this.causeError = causeError;
	}

}