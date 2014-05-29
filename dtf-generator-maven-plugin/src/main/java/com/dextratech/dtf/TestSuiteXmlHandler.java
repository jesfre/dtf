//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf;

/**
 * Modified by <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a> / 22/06/2012
 */
public class TestSuiteXmlHandler {

	private String suiteName;
	@Deprecated
	private String fileName;
	private boolean dbSnapshot;
	private boolean dbRestore;
	private boolean run;

	public String getSuiteName() {
		return suiteName;
	}

	public void setSuiteName(String nombreTest) {
		this.suiteName = nombreTest;
	}

	@Deprecated
	public String getFileName() {
		return fileName;
	}

	@Deprecated
	public void setFileName(String archivoNombre) {
		this.fileName = archivoNombre;
	}

	public boolean getDbSnapshot() {
		return dbSnapshot;
	}

	public void setDbSnapshot(boolean dbSnapshot) {
		this.dbSnapshot = dbSnapshot;
	}

	public boolean getDbRestore() {
		return dbRestore;
	}

	public void setDbRestore(boolean dbRestore) {
		this.dbRestore = dbRestore;
	}

	public boolean getRun() {
		return run;
	}

	public void setRun(boolean ejecutar) {
		this.run = ejecutar;
	}

}
