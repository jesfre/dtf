//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.dextratech.dtf.ConfigurationXmlHandler;
import com.dextratech.dtf.Constants;
import com.dextratech.dtf.DtfAbstractMojo;
import com.dextratech.dtf.TestSuiteXmlHandler;
import com.dextratech.dtf.parser.ConfigurationXmlReader;
import com.dextratech.dtf.reporting.FixSurefireReport;

/**
 * Goal to run all tests located in ${basedir}/src/test/resources/generated-testsuites/
 * @goal run-tests
 * @phase process-sources
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         22/06/2012
 */
@Deprecated
public class DextraSeleniumHtmlRunner extends DtfAbstractMojo {
	private static Log log = LogFactory.getLog(DextraSeleniumHtmlRunner.class);

	/**
	 * The output directory
	 * @parameter expression="${project.build.directory}"
	 */
	private File outputDirectory;

	/* (non-Javadoc)
	 * @see org.apache.maven.plugin.Mojo#execute()
	 */
	public void execute() throws MojoExecutionException, MojoFailureException {
		Iterator<File> fileIt = null;
		try {
			if (globalConfigurationFile != null && globalConfigurationFile.exists()) {
				log.debug("Using Xml configuration file: " + globalConfigurationFile.getName());
				ConfigurationXmlHandler config = ConfigurationXmlReader.parseXml(globalConfigurationFile);
				seleniumHost = config.getSeleniumHost();
				seleniumPort = config.getSeleniumPort();
				browser = config.getBrowser();
				baseUrl = config.getUrl();
				List<File> fileList = new ArrayList<File>();
				List<TestSuiteXmlHandler> fileNameList = config.getTestSuiteList();
				for (TestSuiteXmlHandler tst : fileNameList) {
					if (tst.getRun()) {
						/* TODO hacer que se generen snapshots de la base de datos si tst.getDbSnapshot() es true
						 * TODO hacer que se restaure la base de datos si tst.getDbRestore() es true
						 * esto debera hacerse cuando ya se este corriendo cada prueba. 
						 */
						String filePath = generatedHtmlTestsuitesPath + Constants.SEPARATOR + tst.getFileName();
						File testSuiteFile = new File(filePath);
						fileList.add(testSuiteFile);
					}
				}
				fileIt = fileList.iterator();
			} else {
				log.debug("Using POM global configurations.");
				fileIt = FileUtils.iterateFiles(generatedHtmlTestsuitesPath, new String[] { "html" }, false);
			}

			log.debug(">>>>>>>>>>>>>>>>>>>>>> seleniumHost: " + seleniumHost);
			log.debug(">>>>>>>>>>>>>>>>>>>>>> seleniumPort: " + seleniumPort);
			log.debug(">>>>>>>>>>>>>>>>>>>>>> browser: " + browser);
			log.debug(">>>>>>>>>>>>>>>>>>>>>> baseUrl: " + baseUrl);

			SeleniumHtmlClient client = new SeleniumHtmlClient(seleniumHost, seleniumPort, browser, baseUrl, outputDirectory, verbose);
			while (fileIt.hasNext()) {
				File testSuite = fileIt.next();
				String testSuitePath = testSuite.getAbsolutePath();
				log.debug(testSuitePath);
				client.runSuite(testSuitePath);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
