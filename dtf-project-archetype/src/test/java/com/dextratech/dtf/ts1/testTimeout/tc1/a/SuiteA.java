package com.dextratech.dtf.ts1.testTimeout.tc1.a;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SuiteA {
	
	public static Test suite() {
		TestSuite suite = new TestSuite();
		
				suite.addTestSuite(A.class);
				
		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}
