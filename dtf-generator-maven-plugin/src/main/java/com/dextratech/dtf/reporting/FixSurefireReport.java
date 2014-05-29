//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.reporting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import com.dextratech.dtf.utils.DextraSystemLogger;

/**
 * Goal to update html report file to add some scripts to enhance the report.
 * @goal fix-surefire-reports
 * @phase process-sources
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         07/12/2012
 */
public class FixSurefireReport extends AbstractMojo {
	/**
	 * Define if this will to print logs in system console
	 * @parameter expression="true"
	 */
	protected boolean verbose;

	/**
	 * The surefire-report html file.
	 * @parameter expression="${project.build.directory}/site/surefire-report.html"
	 */
	private String surefireReportPath;

	/* (non-Javadoc)
	 * @see org.apache.maven.plugin.Mojo#execute()
	 */
	public void execute() throws MojoExecutionException {
		DextraSystemLogger.print("Fixing Surefire reports...");
		try {
			String jqueryScript = "<script type=\"text/javascript\" src=\"scripts/jquery-1.7.2.min.js\"></script>";
			String functionsScript = "<script type=\"text/javascript\" src=\"scripts/functions.js\"></script>";
			List<String> lines = new ArrayList<String>();
			lines.add(jqueryScript);
			lines.add(functionsScript);
			File surefireReportFile = new File(surefireReportPath);
			FileUtils.writeLines(surefireReportFile, lines, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean isVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public String getSurefireReportPath() {
		return surefireReportPath;
	}

	public void setSurefireReportPath(String surefireReportPath) {
		this.surefireReportPath = surefireReportPath;
	}
}
