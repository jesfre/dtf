//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.testsuite.generator;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
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

import com.dextratech.dtf.ConfigurationXmlHandler;
import com.dextratech.dtf.Constants;
import com.dextratech.dtf.SeleniumCommand;
import com.dextratech.dtf.SeleniumCommand.Type;
import com.dextratech.dtf.TestSuiteXmlHandler;
import com.dextratech.dtf.exception.DextraSeleniumException;
import com.dextratech.dtf.html2java.Html2JavaConverter;
import com.dextratech.dtf.parser.TestHtmlParser;
import com.dextratech.dtf.utils.DataHelper;
import com.dextratech.dtf.utils.VelocityUtils;
import com.dextratech.dtf.xml.testsuite.ActionOption;
import com.dextratech.dtf.xml.testsuite.Assertion;
import com.dextratech.dtf.xml.testsuite.Component;
import com.dextratech.dtf.xml.testsuite.Components;
import com.dextratech.dtf.xml.testsuite.Function;
import com.dextratech.dtf.xml.testsuite.Testcase;
import com.dextratech.dtf.xml.testsuite.Testsuite;
import com.dextratech.dtf.xml.testsuite.Validation;
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
	 * @parameter expression="${basedir}/src/test/resources/config/testsuites/"
	 * @readonly
	 */
	private String testsuitesXMLLocation;

	/**
	 * Location of the XML that contains all the global validations functions for all test suites.
	 * @parameter expression="${basedir}/src/test/resources/config/testsuites/validation-functions.xml"
	 * @readonly
	 */
	private String validationFunctionsXmlPath;

	/**
	 * Location of the XML that contains all the global components for all test suites.
	 * @parameter expression="${basedir}/src/test/resources/config/testsuites/components.xml"
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
		File testsuitesLocation = new File(testsuitesXMLLocation);

		// Iterate the directory to obtain all testsuites from XML files
		if (testsuitesLocation.exists()) {
			if (testsuitesLocation.isDirectory()) {
				if (globalConfigurationFile != null && globalConfigurationFile.exists()) {
					prefix = "Suite";
					packagePostfix = "";
					if (!testSuitesBasePackage.equals(packagePostfix)) {
						testSuitesBasePackage += "." + packagePostfix;
					}

					setupSeleniumSourceCode();

					loadGlobalFunctions();

					loadGlobalComponents();

					ConfigurationXmlHandler config = setupGlobalConfigurations();
					List<TestSuiteXmlHandler> fileNameList = config.getRunnableTestsuiteList();
					int testsuiteCounter = 0;
					for (TestSuiteXmlHandler tst : fileNameList) {
						boolean dbSnapshot = tst.getDbSnapshot();
						boolean dbRestore = tst.getDbRestore();

						/* For each runnable testsuite element, 
						 * a HTML testsuite script and a set of testcase scripts will be generated.
						 */
						String filePath = testsuitesXMLLocation + Constants.SEPARATOR + tst.getSuiteName() + ".xml";
						File testsuiteFile = new File(filePath);
						if (testsuiteFile.exists()) {
							try {

								Testsuite testsuite = getTestsuite(testsuiteFile);
								generateHTMLScripts(testsuite, generatedHtmlTestsuitesPath, ++testsuiteCounter, dbSnapshot, dbRestore);

							} catch (JAXBException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (URISyntaxException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (DextraSeleniumException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} else {
							log.error("File not found: " + filePath);
						}
					}

				}
			}
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
	 */
	public void generateHTMLScripts(Testsuite testsuite, File testSuitesDirectory, int testsuiteCounter, boolean dbSnapshot, boolean dbRestore) throws URISyntaxException, IOException, DextraSeleniumException {
		List<String> testcaseFilenames = new ArrayList<String>();
		String testsuiteFilename = testsuite.getName();
		String testsuiteOutDir = testSuitesDirectory.getAbsolutePath();

		log.debug("Generating test suite for: ============ " + testsuiteFilename + " ============");
		List<Testcase> testcaseList = testsuite.getTestcase();

		FunctionRegistry tmpFunctionRegistry = new FunctionRegistry(vFunctionRegistry);
		ValidationRules vRules = testsuite.getValidationRules();
		if (testcaseList.size() > 0 && vRules != null) {
			tmpFunctionRegistry.addAll(vRules.getFunction());
		}

		int packageCounter = 0;
		List<Component> componentList = testsuite.getComponent();
		HTMLTestsuiteGenerator htmlTestsuiteGenerator = null;
		for (Testcase testcase : testcaseList) {
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
					List<Object> afterErrorCommandObjectList = afterErrorActions.getFieldOrActionOrAssert();
					List<SeleniumCommand> afterErrorCommandList = htmlTestsuiteGenerator.getCommandList(afterErrorCommandObjectList);

					String afterErrorActionsHtmlFileName = htmlTestsuiteGenerator.generateAfterErrrorScript(testcase, afterErrorCommandList, testcaseOutDir, testcaseName);

					String javaTestcaseName = testcaseName + Constants.AFTER_ERROR_SCRIPT_SUFIX;
					String afterErrorActionsClassName = generateJavaTestcase(testcase, testcaseOutDir, afterErrorActionsHtmlFileName, javaTestSuiteDir, finalPackageTarget, javaTestcaseName, dbSnapshot, dbRestore, null);

					if (afterErrorActionsClassName != null) {
						afterErrorActionsSentences = getAfterErrorSentences(javaTestSuiteDir, afterErrorActionsClassName);
					}
				}

				List<Object> fieldsAndActions = testcase.getFieldOrActionOrAssert();
				List<SeleniumCommand> commandList = htmlTestsuiteGenerator.getCommandList(fieldsAndActions);
				int testcaseCounter = 0;

				/* Searchs for validations in each command 
				 * to generate a new test case for each validation found.
				 */
				for (int i = 0; i < commandList.size(); i++) {
					SeleniumCommand sc = commandList.get(i);
					List<Object> validationObjectList = sc.getValidations();
					if (validationObjectList.size() > 0) {
						for (Object vObject : validationObjectList) {
							String validationName = null;
							String value = "";
							String assertionId = null;
							boolean causeError = false;

							if (vObject instanceof Validation) {
								Validation validation = (Validation) vObject;
								causeError = !validation.isValid();
								validationName = validation.getName();
								value = validation.getContent();
								assertionId = validation.getAssertId();

							} else if (vObject instanceof ValidationFunction) {
								// For a function object, the ID will be used as validation name
								ValidationFunction vFunction = (ValidationFunction) vObject;
								causeError = !vFunction.isValid();
								validationName = vFunction.getId();
								value = DataHelper.getTestValue(vFunction);
								assertionId = vFunction.getAssertId();

							} else if (vObject instanceof ValidationFunctionRef) {
								ValidationFunctionRef vFunction = (ValidationFunctionRef) vObject;
								causeError = !vFunction.isValid();
								validationName = vFunction.getName();
								String fnId = vFunction.getFunctionRefId();
								if (StringUtils.isBlank(validationName)) {
									validationName = fnId;
								}

								Function fn = tmpFunctionRegistry.getFunction(fnId);
								value = DataHelper.getTestValue(fn);
								assertionId = vFunction.getAssertId();
							}

							List<SeleniumCommand> copyCommandList = createDeepCopyForValidation(commandList, assertionId);
							SeleniumCommand copySc = copyCommandList.get(i);
							copySc.setValue(value);
							copySc.setErrorStep(causeError);
							copySc.setTestingCommand4Testcase(true);

							// Build a new testcase name for each validation found
							String newTestcaseName = WordUtils.capitalizeFully(testcaseName) + "_" + (++testcaseCounter);
							if (StringUtils.isNotBlank(validationName)) {
								newTestcaseName += "_" + WordUtils.capitalizeFully(validationName);
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

				if (testcase.isRunDefault()) {
					List<SeleniumCommand> copyCommandList = createDeepCopyForValidation(commandList, defaultAssert);

					// Generates the default test case, with all valid values for fields, that have to be run at last.
					String htmlFilename = WordUtils.capitalizeFully(testcaseName) + ".html";
					log.debug("Generating testcase for: ===" + testcaseName + " ===");
					htmlTestsuiteGenerator.generateTestcaseScript(testcase, copyCommandList, testcaseOutDir, testcaseName, htmlFilename);
					testcaseFilenames.add(htmlFilename);
					String testcaseClassName = generateJavaTestcase(testcase, testcaseOutDir, htmlFilename, javaTestSuiteDir, finalPackageTarget, testcaseName, dbSnapshot, dbRestore, afterErrorActionsSentences);
					testClassNameList.add(testcaseClassName + ".class");
				}

				// Generates a test suite Java file to invoke the list of test cases.
				String testSuiteFileName = generateJavaTestsuite(testClassNameList, testcaseName, finalPackageTarget, javaTestSuiteDir);
			}
		}
		if (htmlTestsuiteGenerator != null) {
			htmlTestsuiteGenerator.generateTestsuiteScript(testcaseFilenames, testsuiteFilename, testsuiteOutDir);
		}
	}

	/**
	 * Creates a copy of the commands because of some commands must be modified
	 * in order to create a different test case for each validation.
	 * For each Selenium Command must have to create a deep copy, because a reference copy makes confusion errors about its final valid value.
	 * And removes all assert commands that are part of customized validations for fields
	 * @param commandList
	 * @param assertionId
	 */
	private List<SeleniumCommand> createDeepCopyForValidation(List<SeleniumCommand> commandList, String assertionId) {
		List<SeleniumCommand> copyCommandList = new ArrayList<SeleniumCommand>();
		for (SeleniumCommand sc2Copy : commandList) {
			boolean includeThis = true;
			if (sc2Copy.getType() == Type.ASSERT) {
				Assertion assertion = (Assertion) sc2Copy.getOriginalCommand();
				String assertId = assertion.getId();
				if (StringUtils.isNotBlank(assertId) && !assertId.equals(assertionId)) {
					includeThis = false;
				}
			}
			if (includeThis) {
				SeleniumCommand scCopy = new SeleniumCommand();
				BeanUtils.copyProperties(sc2Copy, scCopy);
				copyCommandList.add(scCopy);
			}
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
		testSuiteName = WordUtils.capitalize(testSuiteName);
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
		JAXBContext context = JAXBContext.newInstance("com.dextratech.dtf.xml.testsuite");
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

		String javaTestcaseContent = convertTestCase(testParser, testName, finalPackageTarget, dbSnapshot, dbRestore);

		if (afterErrorActionsSentences != null) {
			// Adding the actions to fire if an error occurs.
			final StringBuilder AFTER_ERROR_ACTIONS_PREFIX = new StringBuilder("private void runAfterErrorCommands() {");
			final StringBuilder AFTER_ERROR_ACTIONS_MESSAGE = new StringBuilder();
			AFTER_ERROR_ACTIONS_MESSAGE.append("\n\t\tselenium.setContext(\"Firing actions after error...\");");
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

	public static void main(String[] args) {
		TestsuiteGenerator generator = new TestsuiteGenerator();
		generator.setTestsuitesXMLLocation("D:/dev/projects/DEXTRA-testing-framework/Dextra_Testing_Framework/dtf-project-archetype/src/test/resources/config/testsuites/");
		generator.setGeneratedHtmlTestsuitesPath(new File("D:/dev/projects/DEXTRA-testing-framework/Dextra_Testing_Framework/dtf-project-archetype/src/test/resources/generated-testsuites/"));
		generator.setGlobalConfigurationFile(new File("D:/dev/projects/DEXTRA-testing-framework/Dextra_Testing_Framework/dtf-project-archetype/src/test/resources/config/globalConfiguration.xml"));
		try {
			generator.execute();
		} catch (MojoExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MojoFailureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
