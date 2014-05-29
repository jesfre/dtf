//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf;

import java.io.File;

/**
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         20/06/2012
 */
@Deprecated
public class TestSuite {
	private File file;
	private String name;
	private Test tests[];
	private boolean result;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Test[] getTests() {
		return tests;
	}

	public void setTests(Test[] tests) {
		this.tests = tests;
	}

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

}
