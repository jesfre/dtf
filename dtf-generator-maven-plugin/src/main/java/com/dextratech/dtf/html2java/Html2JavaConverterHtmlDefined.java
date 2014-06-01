//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.html2java;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.maven.plugin.MojoExecutionException;

import com.dextratech.dtf.ConfigurationXmlHandler;
import com.dextratech.dtf.Constants;
import com.dextratech.dtf.TestSuiteXmlHandler;
import com.dextratech.dtf.generator.HtmlSuiteGenerator;
import com.dextratech.dtf.parser.TestSuiteHtmlParser;

/**
 * Utility to convert from HTML Selenese script file to Java source code
 * @goal html2java
 * 
 * @phase process-sources
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         22/06/2012
 */
@Deprecated
public class Html2JavaConverterHtmlDefined extends Html2JavaConverter {
	private static Log log = LogFactory.getLog(Html2JavaConverterHtmlDefined.class);

	/* (non-Javadoc)
	 * @see org.apache.maven.plugin.AbstractMojo#execute()
	 */
	public void execute() throws MojoExecutionException {
		prefix = "Suite";
		packagePostfix = "";
		if (!testSuitesBasePackage.equals(packagePostfix)) {
			testSuitesBasePackage += "." + packagePostfix;
		}
		try {
			setupSeleniumSourceCode();

			int count = 0;
			if (globalConfigurationFile != null && globalConfigurationFile.exists()) {

				ConfigurationXmlHandler config = setupGlobalConfigurations();

				List<TestSuiteXmlHandler> fileNameList = config.getTestSuiteList();
				for (TestSuiteXmlHandler tst : fileNameList) {
					if (tst.getRun()) {
						boolean dbSnapshot = tst.getDbSnapshot();
						boolean dbRestore = tst.getDbRestore();
						String filePath = generatedHtmlTestsuitesPath + Constants.SEPARATOR + tst.getFileName();
						File testSuiteFile = new File(filePath);
						if (testSuiteFile.exists()) {
							TestSuiteHtmlParser testSuiteParser = new TestSuiteHtmlParser(testSuiteFile);
							this.convertHtml2Java(testSuiteParser, count, javaTestSuitesDirectory, dbSnapshot, dbRestore);
							count++;
						} else {
							log.error("File not found: " + filePath);
						}
					}
				}

			} else {

				log.debug("Using POM global configurations.");
				Iterator<File> fileIt = FileUtils.iterateFiles(generatedHtmlTestsuitesPath, new String[] { "html" }, false);
				for (; fileIt.hasNext(); count++) {
					File htmlSuiteFile = fileIt.next();
					TestSuiteHtmlParser testSuiteParser = new TestSuiteHtmlParser(htmlSuiteFile);
					this.convertHtml2Java(testSuiteParser, count, javaTestSuitesDirectory, false, false);
				}

			}
			log.debug(">>>>>>>>>>>>>>>>>>>>>> " + count + " test suites generated.");
		} catch (Exception e) {
			log.debug(e.getMessage(), e);
			e.printStackTrace();
		}
	}

}
