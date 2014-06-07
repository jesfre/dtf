//
// Developed by Dextra Technologies www.dextratech.com
//
package testcase.sample.junit4rc;

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
