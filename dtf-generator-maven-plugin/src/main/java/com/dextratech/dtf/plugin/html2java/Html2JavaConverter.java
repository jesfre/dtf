//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.plugin.html2java;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.xml.bind.JAXBException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.cyberneko.html.parsers.DOMParser;
import org.htmlparser.Node;
import org.htmlparser.util.NodeIterator;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import sun.org.mozilla.javascript.internal.NativeArray;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.plugin.BrowserEnum;
import com.dextratech.dtf.plugin.ConfigurationHandler;
import com.dextratech.dtf.plugin.Constants;
import com.dextratech.dtf.plugin.DtfAbstractMojo;
import com.dextratech.dtf.plugin.JavascriptLogger;
import com.dextratech.dtf.plugin.LabelValue;
import com.dextratech.dtf.plugin.Constants.SeleniumXunitFramework;
import com.dextratech.dtf.plugin.parser.TestHtmlParser;
import com.dextratech.dtf.plugin.parser.TestSuiteHtmlParser;
import com.dextratech.dtf.plugin.utils.VelocityUtils;
import com.dextratech.dtf.plugin.xml.configuration.Browser;
import com.dextratech.dtf.plugin.xml.configuration.Configuration;

/**
 * Utility to convert from HTML Selenese script file to Java source code
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         22/06/2012
 */
public abstract class Html2JavaConverter extends DtfAbstractMojo {
	private static Log log = LogFactory.getLog(Html2JavaConverter.class);

	/**
	 * The format of the Java test class
	 * Supported Formats:
	 * - JUnit3RC
	 * - JUnit4RC
	 * - JUnit4WebDriverBacked
	 * Unsupported Formats:
	 * - TestNGRC
	 * - JUnit4WebDriver
	 * @parameter expression="${dtf.plugin.format}"
	 * @required
	 */
	protected String format;

	/**
	 * Path to utility scripts
	 */
	protected String seleniumScriptsDir = null;

	/**
	 * The XML file with the API doc of Selenese commands
	 * @parameter
	 */
	protected String seleniumApiDocFile = null;

	protected String prefix = null;
	protected String packagePostfix;

	/**
	 * The path of the test suite template. testLayouts\TestSuiteLayout_JUnit4RC.vm
	 * @parameter
	 */
	protected String testSuiteTemplatePath = null;

	/**
	 * Paths to Javascript files to be loaded
	 * 
	 * @parameter
	 */
	protected String remoteControlJs = null;

	/**
	 * Paths to Javascript files to be loaded
	 * @parameter
	 */
	protected String testCaseJs = null;

	/**
	 * Paths to Javascript files to be loaded
	 * @parameter
	 */
	protected String fmtCommndAdapterJs = null;

	/**
	 * Paths to Javascript files to be loaded
	 * @parameter
	 */
	protected String formatJs = null;

	/**
	 * Paths to Javascript files to be loaded
	 * @parameter
	 */
	protected String toolsJs = null;

	/**
	 * Paths to Javascript files to be loaded
	 * @parameter
	 */
	protected String xJunitJsApi = null;

	/**
	 * Paths to Javascript files to be loaded
	 * @parameter
	 */
	protected String customJs = null;

	/**
	 * Paths to Javascript files to be loaded
	 * @parameter
	 */
	protected String webdriverJs = null;

	@Override
	abstract public void execute() throws MojoExecutionException, MojoFailureException;

	/**
	 * Setup the global configurations.
	 * @return the configuration
	 */
	protected Configuration setupGlobalConfigurations() {
		log.debug("Using Xml configuration file: " + globalConfigurationFile.getName());
		Configuration config = null;
		try {
			ConfigurationHandler configurationHandler = new ConfigurationHandler(globalConfigurationFile);
			config = configurationHandler.getConfiguration();
			//			seleniumHost = config.getSeleniumHost();
			//			seleniumPort = config.getSeleniumPort();
			Browser browserObj = config.getBrowser();
			if (browserObj != null) {
				if (browserObj.getName() != null) {
					browser = browserObj.getName();
				}
				if (browserObj.getExecutablePath() != null) {
					browserExecutablePath = browserObj.getExecutablePath();
				}
				if (browserObj.isMaximized() != null) {
					browserMaximized = browserObj.isMaximized();
				}
			}
			log.debug("Using browser [browser=" + browser + ", maximized=" + browserMaximized + ", executablePath=" + browserExecutablePath + "]");

			baseUrl = config.getAppUrl();
			timeout = config.getTimeout();
			speed = config.getSpeed();

			log.debug("\t> Converting test using global configurations...");
			log.debug("\t> seleniumHost: " + seleniumHost);
			log.debug("\t> seleniumPort: " + seleniumPort);
			log.debug("\t> browser: " + browser);
			log.debug("\t> baseUrl: " + baseUrl);
			log.debug("\t> timeout: " + timeout);
			log.debug("\t> speed: " + speed);
		} catch (JAXBException e) {
			log.error(e.getMessage(), e);
		}
		return config;
	}

	/**
	 * 
	 */
	protected void setupSeleniumSourceCode() {
		if (seleniumScriptsDir == null) {
			seleniumScriptsDir = Constants.SELENIUM_SCRIPTS_DIR;
		}
		if (seleniumApiDocFile == null) {
			seleniumApiDocFile = com.dextratech.dtf.plugin.Constants.SELENIUM_JS_IE_DOC;
		}
		if (testCaseJs == null) {
			testCaseJs = Constants.SELENIUM_JS_TEST_CASE;
		}
		if (fmtCommndAdapterJs == null) {
			fmtCommndAdapterJs = Constants.SELENIUM_JS_COMMAND_ADAPTER;
		}
		if (formatJs == null) {
			formatJs = Constants.SELENIUM_JS_COMMAND_ADAPTER;
		}
		if (toolsJs == null) {
			toolsJs = Constants.SELENIUM_JS_TOOLS;
		}
		if (xJunitJsApi == null) {
			if (format.trim().equals(SeleniumXunitFramework.JUNIT_3RC.getName())) {
				xJunitJsApi = SeleniumXunitFramework.JUNIT_3RC.getJsFile();
				remoteControlJs = Constants.SELENIUM_JS_REMOT_CONTROL;
				testSuiteTemplatePath = Constants.SELENIUM_JS_JUNIT4RC_TESTSUITE_TEMPLATE;
			}
			if (format.trim().equals(SeleniumXunitFramework.JUNIT_4RC.getName())) {
				xJunitJsApi = SeleniumXunitFramework.JUNIT_4RC.getJsFile();
				remoteControlJs = Constants.SELENIUM_JS_REMOT_CONTROL;
				testSuiteTemplatePath = Constants.SELENIUM_JS_JUNIT4RC_TESTSUITE_TEMPLATE;
			}
			if (format.trim().equals(SeleniumXunitFramework.JUNIT_4WEB_DRIVER.getName())) {
				xJunitJsApi = SeleniumXunitFramework.JUNIT_4WEB_DRIVER.getJsFile();
				webdriverJs = Constants.SELENIUM_JS_WEBDRIVER;
				testSuiteTemplatePath = Constants.SELENIUM_JS_JUNIT4WEBDRIVER_TESTSUITE_TEMPLATE;
			}
			if (format.trim().equals(SeleniumXunitFramework.JUNIT_4WEB_DRIVER_BACKED.getName())) {
				xJunitJsApi = SeleniumXunitFramework.JUNIT_4WEB_DRIVER_BACKED.getJsFile();
				webdriverJs = Constants.SELENIUM_JS_WEBDRIVER;
				testSuiteTemplatePath = Constants.SELENIUM_JS_JUNIT4WEBDRIVER_TESTSUITE_TEMPLATE;
			}
			if (format.trim().equals(SeleniumXunitFramework.TESTNG_RC.getName()))
				xJunitJsApi = SeleniumXunitFramework.TESTNG_RC.getJsFile();
		}
		if (customJs == null) {
			customJs = Constants.SELENIUM_API_DIR + "customSeleniumCode.js";
		}
	}

	/**
	 * Converts a HTML test suite to Java classes including test cases class files
	 * @param testSuiteParser A parser for the HTML test suite script
	 * @param suiteOrder an integer to follow the order of execution of test suites.
	 * @param javaTestSuiteDir
	 * @param dbSnapshot
	 * @param dbRestore
	 */
	public void convertHtml2Java(TestSuiteHtmlParser testSuiteParser, int suiteOrder, String javaTestSuiteDir, boolean dbSnapshot, boolean dbRestore) {
		List<String> testClassNameList = new ArrayList<String>();
		String testSuiteDirectoryPath = generatedHtmlTestsuitesPath.getAbsolutePath();
		// Remove spaces and capitalize all words of the test suite name
		String testSuiteName = testSuiteParser.getTestName();
		testSuiteName = StringUtils.replace(testSuiteName, "_", " ");
		testSuiteName = WordUtils.capitalize(testSuiteName);
		testSuiteName = StringUtils.replace(testSuiteName, " ", "");

		String finalPackageTarget = testSuitesBasePackage;
		finalPackageTarget += "._" + suiteOrder + "_" + testSuiteParser.getTestName();
		String subpath = StringUtils.replace(finalPackageTarget, ".", Constants.SEPARATOR);
		javaTestSuiteDir = javaTestSuiteDir + Constants.SEPARATOR + subpath;
		File javaTestDestinationDir = new File(javaTestSuiteDir);
		javaTestDestinationDir.mkdirs();

		/* Generate the Java file for each HTML test case in the test suite.
		 */
		NodeIterator iterator = testSuiteParser.getIterator();
		try {
			while (iterator.hasMoreNodes()) {
				Node node = iterator.nextNode();
				LabelValue members = testSuiteParser.getTestFileMembers(node);
				String testName = members.getLabel();
				String className = members.getLabel();
				if (className != null) {
					int indexOfExtension = className.lastIndexOf(".");
					className = className.substring(0, indexOfExtension);
					className = StringUtils.capitalize(className);
				}
				File htmlTestFile = new File(testSuiteDirectoryPath + Constants.SEPARATOR + members.getValue());
				TestHtmlParser testParser = new TestHtmlParser(htmlTestFile);

				String javaTestcaseContent = convertTestCase(testParser, testName, className, finalPackageTarget, dbSnapshot, dbRestore);
				File javaTestFile = new File(javaTestDestinationDir.getAbsolutePath() + Constants.SEPARATOR + className + ".java");
				FileUtils.writeStringToFile(javaTestFile, javaTestcaseContent);

				testClassNameList.add(className + ".class");
				log.debug(finalPackageTarget + "." + className + ".class");
			}

			Map<String, Object> params = new HashMap<String, Object>();
			params.put("testSuitePackageName", finalPackageTarget);
			params.put("testClassNameList", testClassNameList);

			testSuiteName = prefix + testSuiteName;
			params.put("testSuiteClassName", testSuiteName);

			String testSuiteFileName = testSuiteName + ".java";

			VelocityUtils.evaluate(params, testSuiteTemplatePath, javaTestSuiteDir, testSuiteFileName);
			log.debug(finalPackageTarget + "." + testSuiteFileName);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	/**
	 * Convert a test case HTML script document to Java class test case.
	 *
	 * @param testParser The parser to handle the HTML document
	 * @param testName the test name
	 * @param className the class name
	 * @param testBasePackage The package name string of the test class
	 * @param dbSnapshot the db snapshot
	 * @param dbRestore the db restore
	 * @return a String that represents the Java class content
	 */
	protected String convertTestCase(TestHtmlParser testParser, String testName, String className, String testBasePackage, boolean dbSnapshot, boolean dbRestore) {
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("rhino");
			engine.put("out", System.out);
			engine.put("log", LogFactory.getLog(JavascriptLogger.class));

			List<SeleniumCommand> formatedSeleniumCommandList = testParser.getFormatedSelenseCommands();
			NativeArray nativeArray = new NativeArray(formatedSeleniumCommandList.toArray());
			engine.put("formatedSeleniumCommandList", nativeArray);

			String metaSuccess = testParser.getMeta(TestHtmlParser.META_SUCCESS);
			if (StringUtils.isBlank(metaSuccess)) {
				metaSuccess = "true";
			}
			engine.put("success", metaSuccess);

			DOMParser p = new DOMParser();
			InputStream isApi = this.getClass().getResourceAsStream(seleniumApiDocFile);
			InputSource inputSource = new InputSource(isApi);
			p.parse(inputSource);
			Document d = p.getDocument();
			engine.put("apiDocument", d);
			engine.put("screenshotsDirectory", screenshotsDirectory);
			engine.put("dbSnapshot", Boolean.toString(dbSnapshot));
			engine.put("dbRestore", Boolean.toString(dbRestore));

			/*
			 * Resolve the code snippet for the instantiation of the driver
			 * This works for Google Chrome driver
			 */
			BrowserEnum browserEnum = getBrowserEmun(browser);
			String driverSnippetTemplate = browserEnum.getDriverInstantiationTemplate();
			String driverSnippet = null;
			if (StringUtils.isNotBlank(browserExecutablePath)) {
				driverSnippet = MessageFormat.format(driverSnippetTemplate, browserExecutablePath);
			} else {
				driverSnippet = driverSnippetTemplate;
			}

			if (testName != null)
				engine.put("testName", testName);
			if (className != null)
				engine.put("className", className);
			if (testName != null)
				engine.put("driver", driverSnippet);
			if (testBasePackage != null)
				engine.put("packageName", testBasePackage);
			if (seleniumHost != null)
				engine.put("seleniumHost", seleniumHost);
			if (seleniumPort > 0)
				engine.put("seleniumPort", seleniumPort);
			if (browser != null)
				engine.put("browser", browser);
			if (browserMaximized != null)
				engine.put("browserMaximized", browserMaximized.toString());
			if (baseUrl != null)
				engine.put("baseurl", baseUrl);
			if (timeout > 0)
				engine.put("timeout", timeout);
			if (speed >= 0)
				engine.put("speed", speed);

			ScriptContext context = engine.getContext();

			InputStream isJs = this.getClass().getResourceAsStream(toolsJs);
			InputStreamReader isr = new InputStreamReader(isJs);
			Object result = engine.eval(isr, context);

			// Load every util script in the directory
			if (StringUtils.isNotBlank(seleniumScriptsDir)) {
				List<String> filenames = new ArrayList<String>();
				filenames.add("customUtils.js");
				filenames.add("htmlutils.js");
				for (String filename : filenames) {
					String utilPath = seleniumScriptsDir + filename;
					isJs = this.getClass().getResourceAsStream(utilPath);
					if (isJs != null) {
						isr = new InputStreamReader(isJs);
						log.trace("Evaluating " + utilPath);
						result = engine.eval(isr, context);
						log.trace("Loaded " + utilPath);
					} else {
						log.warn("Can't load " + utilPath);
					}
				}
			}

			// TODO enhance this to load a map of resources instead of each resource one by one.
			if (StringUtils.isNotBlank(webdriverJs)) {
				isJs = this.getClass().getResourceAsStream(webdriverJs);
				if (isJs != null) {
					isr = new InputStreamReader(isJs);
					log.trace("Evaluating " + webdriverJs);
					result = engine.eval(isr, context);
					log.debug("Loaded " + webdriverJs);
				} else {
					log.debug("Can't load " + webdriverJs);
				}
			}

			if (StringUtils.isNotBlank(remoteControlJs)) {
				isJs = this.getClass().getResourceAsStream(remoteControlJs);
				if (isJs != null) {
					isr = new InputStreamReader(isJs);
					log.trace("Evaluating " + remoteControlJs);
					result = engine.eval(isr, context);
					log.debug("Loaded " + remoteControlJs);
				} else {
					log.debug("Can't load " + remoteControlJs);
				}
			}

			isJs = this.getClass().getResourceAsStream(testCaseJs);
			if (isJs != null) {
				isr = new InputStreamReader(isJs);
				log.trace("Evaluating " + testCaseJs);
				result = engine.eval(isr, context);
				log.debug("Loaded " + testCaseJs);
			} else {
				log.debug("Can't load " + testCaseJs);
			}

			isJs = this.getClass().getResourceAsStream(fmtCommndAdapterJs);
			if (isJs != null) {
				isr = new InputStreamReader(isJs);
				log.trace("Evaluating " + fmtCommndAdapterJs);
				result = engine.eval(isr, context);
				log.debug("Loaded " + fmtCommndAdapterJs);
			} else {
				log.debug("Can't load " + fmtCommndAdapterJs);
			}

			isJs = this.getClass().getResourceAsStream(formatJs);
			if (isJs != null) {
				isr = new InputStreamReader(isJs);
				log.trace("Evaluating " + formatJs);
				result = engine.eval(isr, context);
				log.debug("Loaded " + formatJs);
			} else {
				log.debug("Can't load " + formatJs);
			}

			isJs = this.getClass().getResourceAsStream(xJunitJsApi);
			if (isJs != null) {
				isr = new InputStreamReader(isJs);
				log.trace("Evaluating " + xJunitJsApi);
				result = engine.eval(isr, context);
				log.debug("Loaded " + xJunitJsApi);
			} else {
				log.debug("Can't load " + xJunitJsApi);
			}

			isJs = this.getClass().getResourceAsStream(customJs);
			if (isJs != null) {
				isr = new InputStreamReader(isJs);
				log.trace("Evaluating " + customJs);
				result = engine.eval(isr, context);
				log.debug("Loaded " + customJs);
			} else {
				log.debug("Can't load " + customJs);
			}

			String javaCode = (String) result;
			return javaCode;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @return looks for the {@link BrowserEnum} to instantiate a specified driver corresponding to the browser name. 
	 * If nothing found, returns BrowserEnum.FIREFOX.
	 */
	private BrowserEnum getBrowserEmun(String browserName) {
		for (BrowserEnum browserEnum : BrowserEnum.values()) {
			if (browserName.equals(browserEnum.getName())) {
				return browserEnum;
			}
		}
		return BrowserEnum.FIREFOX;
	}

	/**
	 * Prints all available javascript engines
	 */
	protected void printEngines() {
		// dump available engines
		ScriptEngineManager mgr = new ScriptEngineManager();
		List<ScriptEngineFactory> engines = mgr.getEngineFactories();
		for (ScriptEngineFactory engine : engines) {
			System.out.println(engine.getEngineName());
			for (String n : engine.getNames()) {
				System.out.println("Short name : " + n);
			}
		}
	}

	public String getSeleniumApiDocFile() {
		return seleniumApiDocFile;
	}

	public void setSeleniumApiDocFile(String seleniumApiDocFile) {
		this.seleniumApiDocFile = seleniumApiDocFile;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getScreenshotsDirectory() {
		return screenshotsDirectory;
	}

	public void setScreenshotsDirectory(String screenshotsDirectory) {
		this.screenshotsDirectory = screenshotsDirectory;
	}

	public String getTestSuiteTemplatePath() {
		return testSuiteTemplatePath;
	}

	public void setTestSuiteTemplatePath(String testSuiteTemplatePath) {
		this.testSuiteTemplatePath = testSuiteTemplatePath;
	}

	public String getRemoteControlJs() {
		return remoteControlJs;
	}

	public void setRemoteControlJs(String remoteControlJs) {
		this.remoteControlJs = remoteControlJs;
	}

	public String getTestCaseJs() {
		return testCaseJs;
	}

	public void setTestCaseJs(String testCaseJs) {
		this.testCaseJs = testCaseJs;
	}

	public String getFmtCommndAdapterJs() {
		return fmtCommndAdapterJs;
	}

	public void setFmtCommndAdapterJs(String fmtCommndAdapterJs) {
		this.fmtCommndAdapterJs = fmtCommndAdapterJs;
	}

	public String getFormatJs() {
		return formatJs;
	}

	public void setFormatJs(String formatJs) {
		this.formatJs = formatJs;
	}

	public String getToolsJs() {
		return toolsJs;
	}

	public void setToolsJs(String toolsJs) {
		this.toolsJs = toolsJs;
	}

	public String getRcJunitJs() {
		return xJunitJsApi;
	}

	public void setRcJunitJs(String rcJunitJs) {
		this.xJunitJsApi = rcJunitJs;
	}

	public String getCustomJs() {
		return customJs;
	}

	public void setCustomJs(String customJs) {
		this.customJs = customJs;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getPackagePostfix() {
		return packagePostfix;
	}

	public void setPackagePostfix(String packagePostfix) {
		this.packagePostfix = packagePostfix;
	}

}
