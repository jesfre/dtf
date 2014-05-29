//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.maven.model.Dependency;

import com.dextratech.dtf.Constants;

/**
 * Util to generate a pom.xml file for a Java Web project with a non-standard
 * Maven structure
 * 
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         17/07/2012
 */
public class MavenizerUtil {
	private static String rootDir;
	private static String srcDir;
	private static String webDir;
	private static String webinfDir;
	private static String repoDir;
	private static String projectName;

	/**
	 * Mavenize a Java Web project with a non-standard Maven structure
	 * @param rootDirectory The project root folder system path
	 * @param sourceDirectory The source folder path from root folder
	 * @param webappDirectory The webapp content folder path from root folder
	 * @param webinfDirectory The WEBINF folder path from root folder
	 * @param libraryDirectory The lib or library folder path from root folder
	 * @param projectName Optional project name. If null, the root folder name is set as project name.
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws SuiteGenerationException
	 */
	public void mavenize(String rootDirectory, String sourceDirectory, String webappDirectory, String webinfDirectory, String libraryDirectory, String projectName) throws URISyntaxException, IOException {
		MavenizerUtil.rootDir = rootDirectory;
		MavenizerUtil.srcDir = sourceDirectory;
		MavenizerUtil.webDir = webappDirectory;
		MavenizerUtil.webinfDir = webinfDirectory;
		MavenizerUtil.repoDir = libraryDirectory;
		MavenizerUtil.projectName = projectName;

		if (StringUtils.isBlank(projectName)) {
			File rootDirFile = new File(rootDir);
			String rootDirName = rootDirFile.getName();
			projectName = rootDirName;
			DextraSystemLogger.println("\nNew project name: " + projectName);
		} else {
			DextraSystemLogger.println();
		}

		List<Dependency> dependencyList = new ArrayList<Dependency>();

		File libDirFile = new File(rootDir + Constants.SEPARATOR + repoDir);
		Iterator<File> dependencyFileIt = FileUtils.iterateFiles(libDirFile, new String[] { "jar" }, true);
		for (; dependencyFileIt.hasNext();) {
			File file = dependencyFileIt.next();
			String fileName = file.getName();
			System.out.print("Next file: " + fileName);

			Dependency dependency = getDependency(fileName);
			dependencyList.add(dependency);
			System.out.println(" - OK");
		}

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("projectName", projectName);
		params.put("rootDir", rootDir);
		params.put("srcDir", srcDir);
		params.put("webDir", webDir);
		params.put("webinfDir", webinfDir);
		params.put("repoDir", repoDir);
		params.put("dependencyList", dependencyList);
		VelocityUtils.evaluate(params, "/mavenizer-resources/pom.vm", rootDir, "pom.xml");
	}

	/**
	 * Creates a new Maven Dependency object obtaining the parts from a JAR filename
	 * @param fileName
	 * @return
	 */
	private Dependency getDependency(String fileName) {
		String artifactId, groupId, version = "";
		int extIndex = fileName.lastIndexOf('.');
		int verIndex = fileName.indexOf('.');
		artifactId = fileName.substring(0, verIndex);
		verIndex = artifactId.lastIndexOf('-');

		if (verIndex > 1) {
			groupId = artifactId = artifactId.substring(0, verIndex);
			version = fileName.substring(verIndex + 1, extIndex);
		} else {
			groupId = artifactId;
			version = "1";
		}
		Dependency dependency = new Dependency();
		dependency.setSystemPath(fileName);
		dependency.setGroupId(groupId);
		dependency.setArtifactId(artifactId);
		dependency.setVersion(version);
		return dependency;
	}

	public static String getRootDir() {
		return rootDir;
	}

	public static void setRootDir(String rootDir) {
		MavenizerUtil.rootDir = rootDir;
	}

	public static String getSrcDir() {
		return srcDir;
	}

	public static void setSrcDir(String srcDir) {
		MavenizerUtil.srcDir = srcDir;
	}

	public static String getWebDir() {
		return webDir;
	}

	public static void setWebDir(String webDir) {
		MavenizerUtil.webDir = webDir;
	}

	public static String getRepoDir() {
		return repoDir;
	}

	public static void setRepoDir(String repoDir) {
		MavenizerUtil.repoDir = repoDir;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// C:\jesfre\dev\projects\DEXTRA-testing-framework\project-web-spring-3
		System.out.print("Root project directory: ");
		String rootDirectory = scan.nextLine();

		// src
		System.out.print("Source folder path from root directory: ");
		String sourceDirectory = scan.nextLine();

		// WebContent
		System.out.print("Webroot folder path from root directory: ");
		String webappDirectory = scan.nextLine();

		// WebContent/WEB-INF
		System.out.print("WEB-INF folder path from root directory: ");
		String webinfDirectory = scan.nextLine();

		// WebContent/WEB-INF/lib
		System.out.print("Library folder path from root directory: ");
		String libraryDirectory = scan.nextLine();

		System.out.print("Project name (optional): ");
		String projectName = scan.nextLine();

		try {

			MavenizerUtil mavenizer = new MavenizerUtil();
			mavenizer.mavenize(rootDirectory, sourceDirectory, webappDirectory, webinfDirectory, libraryDirectory, projectName);

		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
