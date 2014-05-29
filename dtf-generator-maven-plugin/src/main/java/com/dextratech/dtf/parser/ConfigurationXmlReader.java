//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.parser;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import com.dextratech.dtf.ConfigurationXmlHandler;
import com.dextratech.dtf.Constants;
import com.dextratech.dtf.TestSuiteXmlHandler;

/**
 * Configuration XML reader to get information of global configuration Modified
 * by <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a> /
 * 22/06/2012
 */
public class ConfigurationXmlReader {
	public static void main(String[] args) {
		URL urlFile = ConfigurationXmlReader.class.getResource("/Config.xml");
		File xmlFile;
		try {
			xmlFile = new File(urlFile.toURI());
			parseXml(xmlFile);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public static ConfigurationXmlHandler parseXml(File xmlFile) {
		String ejecutar;
		SAXBuilder builder = new SAXBuilder();
		ArrayList<TestSuiteXmlHandler> testSuite = new ArrayList<TestSuiteXmlHandler>();
		ConfigurationXmlHandler conf = new ConfigurationXmlHandler();

		try {

			Document document = (Document) builder.build(xmlFile);
			// se obtiene el nodo raiz
			Element rootNode = document.getRootElement();
			// se obtienen los hijos del nodo raiz
			conf.setSeleniumHost(rootNode.getChildText(Constants.C_SELENIUM_HOST));
			conf.setTimeout(rootNode.getChildText(Constants.C_TIMEOUT));
			String speedString = rootNode.getChildText(Constants.C_SPEED);
			Integer speed = speedString != null ? new Integer(speedString) : null;
			conf.setSpeed(speed);
			conf.setBrowser(rootNode.getChildText(Constants.C_BROWSER));
			conf.setUrl(rootNode.getChildText(Constants.C_URL));
			String portString = rootNode.getChildText(Constants.C_SELENIUM_PORT);
			Integer port = portString != null ? new Integer(portString) : null;
			conf.setSeleniumPort(port);
			conf.setUser(rootNode.getChildText(Constants.C_USER));
			conf.setPassword(rootNode.getChildText(Constants.C_PASSWORD));

			// se obtiene la lista de casos de prueba
			Element casosPrueba = rootNode.getChild(Constants.C_TESTSUITE_LIST);
			List<Element> casosPruebaList = casosPrueba
					.getChildren(Constants.C_TESTSUITE);

			for (int j = 0; j < casosPruebaList.size(); j++) {
				Element node = casosPruebaList.get(j);
				TestSuiteXmlHandler ts = new TestSuiteXmlHandler();

				ejecutar = node.getChildText(Constants.C_RUN);
				if (ejecutar.trim().equals("true")) {
					String testName = node.getChildText(Constants.C_SUITE_NAME);
					String fileName = node.getChildText(Constants.C_FILE_NAME);
					String dbSnapshot = node.getChildText(Constants.C_DB_SNAPSHOT);
					String dbRestore = node.getChildText(Constants.C_DB_RESTORE);
					ts.setSuiteName(testName);
					ts.setFileName(fileName);
					ts.setDbSnapshot(Boolean.parseBoolean(dbSnapshot.trim()));
					ts.setDbRestore(Boolean.parseBoolean(dbRestore.trim()));
					ts.setRun(Boolean.parseBoolean(ejecutar.trim()));
					testSuite.add(ts);
				}
			}
			conf.setTestSuite(testSuite);
		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
		return conf;
	}
}