/**
 * 
 */
package com.dextratech.dtf;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.dextratech.dtf.xml.configuration.Configuration;

/**
 * Handles the global configuration.
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 04/06/2014
 */
public class ConfigurationHandler {
	private String configurationFilePath = null;
	private Configuration configuration = null;

	public ConfigurationHandler(String configurationFilePath) throws JAXBException {
		this.configurationFilePath = configurationFilePath;
		configuration = getConfiguration(configurationFilePath);
	}

	/**
	 * Load the global configuration.
	 * @param xmlFilePath the path to the configuration file
	 * @return the configuration
	 * @throws JAXBException the jAXB exception
	 */
	private Configuration getConfiguration(String xmlFilePath) throws JAXBException {
		File xmlFile = new File(xmlFilePath);
		JAXBContext context = JAXBContext.newInstance("com.dextratech.dtf.xml.configuration");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object unmarshalled = unmarshaller.unmarshal(xmlFile);
		JAXBElement<Configuration> configurationJaxb = (JAXBElement<Configuration>) unmarshalled;
		Configuration configuration = configurationJaxb.getValue();
		return configuration;
	}

	public String getConfigurationFile() {
		return configurationFilePath;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	/*
	 * TODO to delete
	 */
	public static void main(String[] args) {
		try {
			ConfigurationHandler ch = new ConfigurationHandler("E:/dev/projects/titulacion/sources/dtf2/dtf-project-archetype/testing/conf/globalConfiguration.xml");
			String file = ch.getConfigurationFile();
			System.out.println("File is: " + file);
			System.out.println(ch.getConfiguration());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
