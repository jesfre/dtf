//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.plugin;

import java.io.File;

/**
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         20/06/2012
 */
@Deprecated
public class Test {
	private String label;
	private File htmlFile;
	private File javaFile;
	private String name;
	private Command commands[];
	private boolean result;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public File getHtmlFile() {
		return htmlFile;
	}

	public void setHtmlFile(File htmlFile) {
		this.htmlFile = htmlFile;
	}

	public File getJavaFile() {
		return javaFile;
	}

	public void setJavaFile(File javaFile) {
		this.javaFile = javaFile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Command[] getCommands() {
		return commands;
	}

	public void setCommands(Command[] commands) {
		this.commands = commands;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

}
