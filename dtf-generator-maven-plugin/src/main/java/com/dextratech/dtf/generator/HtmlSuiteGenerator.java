//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.generator;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.maven.plugin.MojoExecutionException;

import com.dextratech.dtf.Constants;
import com.dextratech.dtf.DtfAbstractMojo;
import com.dextratech.dtf.exception.NoErrorOccurredException;
import com.dextratech.dtf.parser.DatasetExcelParser;
import com.dextratech.dtf.parser.GenericHtmlParser;
import com.dextratech.dtf.testsuite.generator.HTMLTestsuiteGenerator;

/**
 * Class used to generator test suites in base of a data set from a Excel file and a layout
 * @goal generate-tests
 * 
 * @phase process-sources
 * @author adanbalderas
 *         Modified by <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a> / 21/06/2012 / 17/05/2013
 */
@Deprecated
public class HtmlSuiteGenerator extends DtfAbstractMojo {
	private static Log log = LogFactory.getLog(HtmlSuiteGenerator.class);

	/**
	 * Location of the HTML for pre test tasks scripts and configurations
	 * @parameter expression="${basedir}/src/test/resources/config/"
	 * @required
	 * @readonly
	 */
	private String configLocation;

	private static final String PRE_TESTS_TASKS_FILENAME = "pre_test_tasks.html";
	private static final String POST_TESTS_TASKS_FILENAME = "post_test_tasks.html";

	/**
	 * Generate and saves the new test cases
	 * @param dataSetList
	 * @param html
	 * @param outputDir
	 * @throws IOException
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<String> generateTestsScripts(List<Map<String, String>> dataSetList,
			String html, String outputDir) throws IOException {
		final String htmlOriginal = html;
		int testSetCount = 1;
		List<String> fileNameList = new ArrayList<String>();
		for (Map<String, String> map : dataSetList) {
			String tmpHtml = htmlOriginal;
			Set<Entry<String, String>> entrySet = map.entrySet();
			for (Iterator iterator2 = entrySet.iterator(); iterator2.hasNext();) {
				Entry<String, String> entry = (Entry<String, String>) iterator2.next();
				String propertyName = entry.getKey();
				// Must replace all ocurrences to be able to reuse buildcards for logic purposes.
				tmpHtml = StringUtils.replace(tmpHtml, propertyName, entry.getValue());
			}
			String fileName = Constants.TEST_CASE_DEFAULT_NAME + testSetCount + ".html";
			String fileLocation = outputDir + Constants.SEPARATOR + fileName;
			File outputFile = new File(fileLocation);

			tmpHtml = concatPreTestTasks(tmpHtml);
			tmpHtml = concatPostTestTasks(tmpHtml);

			FileUtils.writeStringToFile(outputFile, tmpHtml, "UTF-8");
			fileNameList.add(fileName);
			testSetCount++;
		}
		return fileNameList;
	}

	/**
	 * Concatenate HTML of the previous tasks to the current HTML Selenese script.
	 * @param html
	 * @return
	 * @throws IOException
	 */
	private String concatPreTestTasks(String html) throws IOException {
		File preTestTasksFile = new File(configLocation + Constants.SEPARATOR + PRE_TESTS_TASKS_FILENAME);
		String preTestTasksHtml = FileUtils.readFileToString(preTestTasksFile);
		html = StringUtils.replaceOnce(html, "<tbody>", "<tbody>" + preTestTasksHtml);
		return html;
	}

	/**
	 * Concatenate the HTML of scripts for the last tasks to the current HTML Selenese script.
	 * @param html
	 * @return
	 * @throws IOException
	 */
	private String concatPostTestTasks(String html) throws IOException {
		File postTestTasksFile = new File(configLocation + Constants.SEPARATOR + POST_TESTS_TASKS_FILENAME);
		String postTestTasksHtml = FileUtils.readFileToString(postTestTasksFile);
		html = StringUtils.replaceOnce(html, "</tbody>", postTestTasksHtml + "</tbody>");
		return html;
	}

	public void execute() throws MojoExecutionException {
		String layoutFile = "";
		String outDir = generatedHtmlTestsuitesPath.getAbsolutePath();

		try {
			File latoutsPath = new File(generatedLayoutsPath);
			Iterator<File> it = FileUtils.iterateFiles(latoutsPath, new String[] { "html" }, true);
			log.debug("\nGenerating test suites...");
			while (it.hasNext()) {
				File file = it.next();
				layoutFile = file.getAbsolutePath();
				log.debug("Generating test suite for: " + file.getName());

				String html = GenericHtmlParser.getHTML(layoutFile);

				String dataSource = generatedDatasetsPath;
				String shortFileName = StringUtils.substringBeforeLast(file.getName(), ".");
				dataSource += shortFileName + ".xls";

				log.debug("Loading datasource: " + shortFileName + ".xls");

				List<Map<String, String>> dataSetList = DatasetExcelParser.getTableArray(dataSource);

				int endIndex = file.getName().lastIndexOf(".");
				String testSuiteName = file.getName().substring(0, endIndex);
				String outDirTests = outDir + Constants.SEPARATOR + testSuiteName;

				List<String> fileNameList = this.generateTestsScripts(dataSetList, html, outDirTests);
				// The parameters for the constructor of HTMLTestsuiteGenerator are doesn't necesary.
				HTMLTestsuiteGenerator htmlTestsuiteGenerator = new HTMLTestsuiteGenerator(null, screenshotsDirectory);
				htmlTestsuiteGenerator.generateTestsuiteScript(fileNameList, testSuiteName, outDir);
				log.debug("Generated test suite: " + testSuiteName);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getConfigLocation() {
		return configLocation;
	}

	public void setConfigLocation(String configLocation) {
		this.configLocation = configLocation;
	}

}
