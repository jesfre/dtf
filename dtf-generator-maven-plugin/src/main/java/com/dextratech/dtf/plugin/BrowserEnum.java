/**
 * 
 */
package com.dextratech.dtf.plugin;


/**
 * Handle browser properties
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 06/06/2014
 */
public enum BrowserEnum {
	FIREFOX("*firefox", "driver = new FirefoxDriver();"),
	FIREFOX_PROXY("*firefoxproxy", "driver = new FirefoxDriver();"),
	CHROME("*chrome", "System.setProperty(\"webdriver.chrome.driver\", \"{0}\");driver = new ChromeDriver();"),
	GOOGLE_CHROME("*googlechrome", "System.setProperty(\"webdriver.chrome.driver\", \"{0}\");driver = new ChromeDriver();"),
	IE("*iexplore", "System.setProperty(\"webdriver.ie.driver\", \"{0}\");driver = new InternetExplorerDriver();"),
	IE_PROXY("*iexploreproxy", "System.setProperty(\"webdriver.ie.driver\", \"{0}\");driver = new InternetExplorerDriver();"),
	SAFARI("*safari", "driver = new SafariDriver();"),
	SAFARI_PROXY("*safariproxy", "driver = new SafariDriver();");

	/**
	 * Instantiates a new browser.
	 *
	 * @param name The name of the browser as Selenium know it
	 * @param driverInstanciation The driver instanciation snippet
	 */
	private BrowserEnum(String name, String driverInstanciationTemplate) {
		this.name = name;
		this.driverInstantiationTemplate = driverInstanciationTemplate;
	}

	/** The name of the browser as Selenium know it */
	private String name = null;

	/** The driver instantiation snippet. */
	private String driverInstantiationTemplate = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDriverInstantiationTemplate() {
		return driverInstantiationTemplate;
	}

	public void setDriverInstantiationTemplate(String driverInstanciationTemplate) {
		this.driverInstantiationTemplate = driverInstanciationTemplate;
	}

}
