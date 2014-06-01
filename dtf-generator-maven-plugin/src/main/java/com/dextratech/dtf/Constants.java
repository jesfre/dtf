//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf;

/**
 * The Class Constants.
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 31/05/2014
 */
public class Constants {
	public static final String SEPARATOR = System.getProperty("file.separator");
	public static final String WILDCARD_PREFIX = "${";
	public static final String WILDCARD_POSTFIX = "}";
	public static final String AFTER_ERROR_SCRIPT_SUFIX = "_AfterErrorCommands";

	public static final String TEST_CASE_DEFAULT_NAME = "scenario";

	/**
	 * XML configuration constants
	 */
	public static final String C_SELENIUM_HOST = "seleniumHost";
	public static final String C_SELENIUM_PORT = "seleniumPort";
	public static final String C_TIMEOUT = "timeout";
	public static final String C_SPEED = "speed";
	public static final String C_BROWSER = "browser";
	public static final String C_URL = "url";
	public static final String C_USER = "user";
	public static final String C_PASSWORD = "password";
	public static final String C_TESTSUITE_LIST = "testsuiteList";
	public static final String C_TESTSUITE = "testsuite";
	public static final String C_RUN = "run";
	public static final String C_SUITE_NAME = "suiteName";
	public static final String C_FILE_NAME = "fileName";
	public static final String C_DB_SNAPSHOT = "dbSnapshot";
	public static final String C_DB_RESTORE = "dbRestore";

	/**
	 * Selenium Javascript source code directories
	 */
	public static final String SELENIUM_API_DIR = "/selenium-api/";
	public static final String SELENIUM_API_SRC_DIR = "/selenium-api/src/";
	public static final String SELENIUM_API_FORMAT_DIR = "/selenium-api/src/formats/";

	/**
	 * Selenium Javascript source code for XUnit generation
	 */
	public static final String SELENIUM_JS_SOURCE = SELENIUM_API_DIR + "javascriptsource.js";
	public static final String SELENIUM_JS_IE_DOC = SELENIUM_API_DIR + "iedoc-core-custom.xml";
	public static final String SELENIUM_JS_TESTSUITE_TEMPLATE = "testLayouts/TestSuiteLayout_JUnit4RC.vm";
	public static final String SELENIUM_JS_REMOT_CONTROL = SELENIUM_API_SRC_DIR + "remoteControl.js";
	public static final String SELENIUM_JS_TEST_CASE = SELENIUM_API_SRC_DIR + "testCase.js";
	public static final String SELENIUM_JS_COMMAND_ADAPTER = SELENIUM_API_SRC_DIR + "formatCommandOnlyAdapter.js";
	public static final String SELENIUM_JS_FORMAT = SELENIUM_API_SRC_DIR + "format.js";
	public static final String SELENIUM_JS_TOOLS = SELENIUM_API_SRC_DIR + "tools.js";
	public static final String SELENIUM_JS_WEBDRIVER = SELENIUM_API_SRC_DIR + "webdriver.js";

	/**
	 * Selenium unit testing frameworks
	 */
	public static enum SeleniumXunitFramework {
		JUNIT_3RC("JUnit3RC", "java-rc.js"),
		JUNIT_4RC("JUnit4RC", "java-rc-junit4.js"),
		JUNIT_4WEB_DRIVER("JUnit4WebDriver", "webdriver-junit4.js"),
		JUNIT_4WEB_DRIVER_BACKED("JUnit4WebDriverBacked", "java-backed-junit4.js"),
		TESTNG_RC("TestNGRC", "java-rc-testng.js");

		private String name;
		private String jsFile;

		private SeleniumXunitFramework(String name, String jsFile) {
			this.name = name;
			this.jsFile = SELENIUM_API_FORMAT_DIR + jsFile;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getJsFile() {
			return jsFile;
		}

		public void setJsFile(String jsFile) {
			this.jsFile = jsFile;
		}
	};
}
