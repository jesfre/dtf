/**
 * 
 */
package com.dextratech.dtf.plugin;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.dextratech.dtf.plugin.xml.configuration.Configuration;

/**
 * Handles the global settings.
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 04/06/2014
 */
public class ConfigurationHandler {
	private File configurationFile = null;
	private Configuration configuration = null;

	public ConfigurationHandler(File configurationFile) throws JAXBException {
		this.configurationFile = configurationFile;
		configuration = getConfiguration(this.configurationFile);
	}

	/**
	 * Load the global settings.
	 * @param xmlFilePath the path to the configuration file
	 * @return the configuration
	 * @throws JAXBException the jAXB exception
	 */
	private Configuration getConfiguration(File xmlFilePath) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance("com.dextratech.dtf.plugin.xml.configuration");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object unmarshalled = unmarshaller.unmarshal(xmlFilePath);
		JAXBElement<Configuration> configurationJaxb = (JAXBElement<Configuration>) unmarshalled;
		Configuration configuration = configurationJaxb.getValue();
		return configuration;
	}

	public File getConfigurationFile() {
		return configurationFile;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	/*
	 * TODO to delete
	 */
	public static void main(String[] args) {
		try {
			File xmlFile = new File("E:/dev/projects/titulacion/sources/dtf2/dtf-project-archetype/testing/conf/settings.xml");
			ConfigurationHandler ch = new ConfigurationHandler(xmlFile);
			File file = ch.getConfigurationFile();
			System.out.println("File is: " + file);
			System.out.println(ch.getConfiguration());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
