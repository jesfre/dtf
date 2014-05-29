//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.utils;

/**
 * Utility used to printting to the system console if the verbose property is true
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 * 22/06/2012
 */
public class DextraSystemLogger {
	private static boolean verbose = true;
	
	public static void print(String message, boolean verbose) {
		if(verbose) {
			System.out.print(message);
		}
	}
	
	public static void print(String message) {
		print(message, verbose);
	}
	
	public static void print() {
		print("", verbose);
	}
	
	public static void println(String message, boolean verbose) {
		if(verbose) {
			System.out.println(message);
		}
	}
	
	public static void println(String message) {
		println(message, verbose);
	}
	
	public static void println() {
		println("", verbose);
	}

	public static void error(String message) {
		println("!!ERROR: " + message, verbose);
	}

	public static boolean isVerbose() {
		return verbose;
	}

	public static void setVerbose(boolean verbose) {
		DextraSystemLogger.verbose = verbose;
	}
}
