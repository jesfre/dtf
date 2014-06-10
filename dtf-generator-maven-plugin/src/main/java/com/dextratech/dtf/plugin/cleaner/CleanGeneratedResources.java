//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.plugin.cleaner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.maven.plugin.MojoExecutionException;

import com.dextratech.dtf.common.Constants;
import com.dextratech.dtf.plugin.DtfAbstractMojo;

/**
 * Class used to clean all generated resources in src/test/java and src/test/resources.
 * @goal clean
 * 
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         04/12/2012
 */
public class CleanGeneratedResources extends DtfAbstractMojo {
	private static Log log = LogFactory.getLog(CleanGeneratedResources.class);

	/**
	 * @parameter expression="true"
	 * @required
	 */
	private boolean cleanTestsuites;

	/**
	 * @parameter expression="true"
	 * @required
	 */
	private boolean cleanJava;

	/**
	 * @parameter expression="true"
	 * @required
	 */
	private boolean cleanScreenshots;

	public void execute() throws MojoExecutionException {
		try {
			if (cleanTestsuites)
				cleanTestsuites();
			if (cleanJava)
				cleanJavaSrc();
			if (cleanScreenshots)
				cleanScreenshots();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void cleanTestsuites() throws IOException {
		cleanDirectory(generatedHtmlTestsuitesPath.getAbsolutePath());
	}

	private void cleanScreenshots() throws IOException {
		cleanDirectory(screenshotsDirectory);
	}

	private void cleanJavaSrc() throws IOException {
		String packagePostfix = "";
		if (!testSuitesBasePackage.equals(packagePostfix)) {
			testSuitesBasePackage += "." + packagePostfix;
		}
		testSuitesBasePackage = StringUtils.replace(testSuitesBasePackage, ".", Constants.SEPARATOR);
		String finalPath = javaTestSuitesDirectory + Constants.SEPARATOR + testSuitesBasePackage;
		cleanDirectory(finalPath);
	}

	/**
	 * @param path
	 * @param extensions
	 * @return
	 * @throws IOException
	 */
	private void cleanDirectory(String path) throws IOException {
		log.debug("Cleaning directory " + path);

		File latoutsPath = new File(path);
		if (latoutsPath.exists()) {
			FileUtils.forceDelete(latoutsPath);
		}
		FileUtils.forceMkdir(latoutsPath);
	}

	public String getJavaTestSuitesDirectory() {
		return javaTestSuitesDirectory;
	}

	public void setJavaTestSuitesDirectory(String javaTestSuitesDirectory) {
		this.javaTestSuitesDirectory = javaTestSuitesDirectory;
	}

	public boolean isCleanTestsuites() {
		return cleanTestsuites;
	}

	public void setCleanTestsuites(boolean cleanTestsuites) {
		this.cleanTestsuites = cleanTestsuites;
	}

	public boolean isCleanJava() {
		return cleanJava;
	}

	public void setCleanJava(boolean cleanJava) {
		this.cleanJava = cleanJava;
	}

	public String getTestSuitesBasePackage() {
		return testSuitesBasePackage;
	}

	public void setTestSuitesBasePackage(String testSuitesBasePackage) {
		this.testSuitesBasePackage = testSuitesBasePackage;
	}

	public String getScreenshotsDirectory() {
		return screenshotsDirectory;
	}

	public void setScreenshotsDirectory(String screenshotsDirectory) {
		this.screenshotsDirectory = screenshotsDirectory;
	}

}
