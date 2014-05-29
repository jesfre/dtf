//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf;

import java.util.ArrayList;
import java.util.List;

import com.dextratech.dtf.utils.DextraSystemLogger;

/**
 * Modified by <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a> / 22/06/2012
 */
public class ConfigurationXmlHandler {
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
		DextraSystemLogger.println("		Selenium host : " + seleniumHost);
		DextraSystemLogger.println("		Selenium port : " + seleniumPort);
		DextraSystemLogger.println("		Timeout : " + timeout);
		DextraSystemLogger.println("		Speed : " + speed);
		DextraSystemLogger.println("		Navigator : " + browser);
		DextraSystemLogger.println("        URL : " + url);
		DextraSystemLogger.println("        User : " + user);
		DextraSystemLogger.println("        Password : " + password);
		DextraSystemLogger.println();

		for (int i = 0; i < testSuiteList.size(); i++) {
			TestSuiteXmlHandler ts = new TestSuiteXmlHandler();
			ts = testSuiteList.get(i);

			DextraSystemLogger.println("+ ------>> Caso de Prueba " + (i + 1));
			DextraSystemLogger.println();
			DextraSystemLogger.println("	      Nombre del Test : " + ts.getSuiteName());
			DextraSystemLogger.println("	   Nombre del Archivo : " + ts.getFileName());
			DextraSystemLogger.println("	          Snapshot BD : " + ts.getDbSnapshot());
			DextraSystemLogger.println("	         Restaurar BD : " + ts.getDbRestore());
			DextraSystemLogger.println("	             Ejecutar : " + ts.getRun());
			DextraSystemLogger.println();

		}
	}

}
