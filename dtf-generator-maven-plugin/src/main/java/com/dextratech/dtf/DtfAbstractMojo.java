//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Utility to convert from HTML Selenese script file to Java source code
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         22/06/2012
 */
public abstract class DtfAbstractMojo extends AbstractMojo {

	/**
	 * Define if this will to print logs in system console
	 * @parameter expression="${dtf.plugin.verbose}"
	 */
	protected boolean verbose;

	/**
	 * Location of the file where the global configurations (seleniumHost, seleniumPort, timeout, speed, browser, url, user, password, testCaseList) can be found.
	 * @parameter expression="${basedir}/src/test/resources/config/globalConfiguration.xml"
	 */
	protected File globalConfigurationFile;

	/**
	 * Host of Selenium server
	 * @parameter expression="${dtf.plugin.seleniumHost}"
	 * @required
	 */
	protected String seleniumHost;

	/**
	 * Port of Selenium server
	 * @parameter expression="${dtf.plugin.seleniumPort}"
	 * @required
	 */
	protected int seleniumPort;

	/**
	 * Tested browser
	 * *firefox
	 * *mock
	 * *firefoxproxy
	 * *pifirefox
	 * *chrome
	 * *iexploreproxy
	 * *iexplore
	 * *firefox3
	 * *safariproxy
	 * *googlechrome
	 * *konqueror
	 * *firefox2
	 * *safari
	 * *piiexplore
	 * *firefoxchrome
	 * *opera
	 * *iehta
	 * *custom
	 * @parameter expression="${dtf.plugin.browser}"
	 * @required
	 */
	protected String browser;

	/**
	 * Base URL of the tested application
	 * @parameter expression="${dtf.plugin.baseUrl}"
	 * @required
	 */
	protected String baseUrl;

	/**
	 * The global default timeout for page load wait
	 * @parameter expression="${dtf.plugin.timeout}"
	 */
	protected int timeout;

	/**
	 * The global default speed of the selenium commands
	 * @parameter expression="${dtf.plugin.speed}"
	 */
	protected int speed;

	/**
	 * The file path of the html layout
	 * @parameter expression="${basedir}/src/test/resources/generated-layouts/"
	 * @required
	 */
	protected String generatedLayoutsPath;

	/**
	 * The directory path to save the generated tests
	 * @parameter expression="${basedir}/src/test/resources/generated-testsuites/"
	 * @required
	 */
	protected File generatedHtmlTestsuitesPath;

	/**
	 * Location of the XLS data source file for this test case script
	 * @parameter expression="${basedir}/src/test/resources/generated-datasets/"
	 * @required
	 * @readonly
	 */
	protected String generatedDatasetsPath;

	/**
	 * The package to be created to use in the Java test files
	 * @parameter expression="test.temp"
	 * @required
	 */
	protected String testSuitesBasePackage;

	/**
	 * @parameter expression="${basedir}/src/test/java"
	 * @required
	 */
	protected String javaTestSuitesDirectory = null;

	/**
	 * The build directory
	 * @parameter expression="${basedir}/src/test/resources/screenshots/"
	 */
	protected String screenshotsDirectory;

	@Override
	abstract public void execute() throws MojoExecutionException, MojoFailureException;

	public boolean isVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public String getTestSuitesBasePackage() {
		return testSuitesBasePackage;
	}

	public void setTestSuitesBasePackage(String testSuitesBasePackage) {
		this.testSuitesBasePackage = testSuitesBasePackage;
	}

	public String getJavaTestSuitesDirectory() {
		return javaTestSuitesDirectory;
	}

	public void setJavaTestSuitesDirectory(String javaTestSuitesDirectory) {
		this.javaTestSuitesDirectory = javaTestSuitesDirectory;
	}

	public File getGeneratedHtmlTestsuitesPath() {
		return generatedHtmlTestsuitesPath;
	}

	public void setGeneratedHtmlTestsuitesPath(File generatedHtmlTestsuitesPath) {
		this.generatedHtmlTestsuitesPath = generatedHtmlTestsuitesPath;
	}

	public String getScreenshotsDirectory() {
		return screenshotsDirectory;
	}

	public void setScreenshotsDirectory(String screenshotsDirectory) {
		this.screenshotsDirectory = screenshotsDirectory;
	}

	public String getSeleniumHost() {
		return seleniumHost;
	}

	public void setSeleniumHost(String host) {
		this.seleniumHost = host;
	}

	public int getSeleniumPort() {
		return seleniumPort;
	}

	public void setSeleniumPort(int port) {
		this.seleniumPort = port;
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

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public File getGlobalConfigurationFile() {
		return globalConfigurationFile;
	}

	public void setGlobalConfigurationFile(File globalConfigurationFile) {
		this.globalConfigurationFile = globalConfigurationFile;
	}

	public String getGeneratedLayoutsPath() {
		return generatedLayoutsPath;
	}

	public void setGeneratedLayoutsPath(String generatedLayoutsPath) {
		this.generatedLayoutsPath = generatedLayoutsPath;
	}

	public String getGeneratedDatasetsPath() {
		return generatedDatasetsPath;
	}

	public void setGeneratedDatasetsPath(String generatedDatasetsPath) {
		this.generatedDatasetsPath = generatedDatasetsPath;
	}

}
