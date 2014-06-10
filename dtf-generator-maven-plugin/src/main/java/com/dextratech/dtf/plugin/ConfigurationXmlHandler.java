//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.plugin;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Modified by <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a> / 22/06/2012
 */
public class ConfigurationXmlHandler {
	private static Log log = LogFactory.getLog(ConfigurationXmlHandler.class);

	private String seleniumHost;
	private Integer seleniumPort;
	private String timeout;
	private Integer speed;
	private String browser;
	private String url;
	private String user;
	private String password;
	private ArrayList<TestSuiteXmlHandler> testSuiteList = new ArrayList<TestSuiteXmlHandler>();
	
	public ConfigurationXmlHandler() {;}
	
	public String getSeleniumHost() {
		return seleniumHost;
	}

	public void setSeleniumHost(String host) {
		this.seleniumHost = host;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String navigator) {
		this.browser = navigator;
	}

	public void setTestSuiteList(ArrayList<TestSuiteXmlHandler> testSuiteList) {
		this.testSuiteList = testSuiteList;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getSeleniumPort() {
		return seleniumPort;
	}

	public void setSeleniumPort(Integer seleniumPort) {
		this.seleniumPort = seleniumPort;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<TestSuiteXmlHandler> getTestSuiteList() {
		return testSuiteList;
	}

	public void setTestSuite(ArrayList<TestSuiteXmlHandler> testSuiteList) {
		this.testSuiteList = testSuiteList;
	}

	/**
	 * Returns a list of testsuite objects where <run/> is true.
	 */
	public List<TestSuiteXmlHandler> getRunnableTestsuiteList() {
		List<TestSuiteXmlHandler> runnables = new ArrayList<TestSuiteXmlHandler>();
		List<TestSuiteXmlHandler> fileNameList = getTestSuiteList();
		for(TestSuiteXmlHandler tst : fileNameList) {
			if(tst.getRun()) {
				runnables.add(tst);
			}
		}
		return runnables;
	}

	public void imprimeConfiguracion() {
		log.debug("		Selenium host : " + seleniumHost);
		log.debug("		Selenium port : " + seleniumPort);
		log.debug("		Timeout : " + timeout);
		log.debug("		Speed : " + speed);
		log.debug("		Navigator : " + browser);
		log.debug("        URL : " + url);
		log.debug("        User : " + user);
		log.debug("        Password : " + password);
		log.debug("\n");

		for (int i = 0; i < testSuiteList.size(); i++) {
			TestSuiteXmlHandler ts = new TestSuiteXmlHandler();
			ts = testSuiteList.get(i);

			log.debug("+ ------>> Caso de Prueba " + (i + 1));
			log.debug("\n");
			log.debug("	      Nombre del Test : " + ts.getSuiteName());
			log.debug("	   Nombre del Archivo : " + ts.getFileName());
			log.debug("	          Snapshot BD : " + ts.getDbSnapshot());
			log.debug("	         Restaurar BD : " + ts.getDbRestore());
			log.debug("	             Ejecutar : " + ts.getRun());
			log.debug("\n");

		}
	}

}
