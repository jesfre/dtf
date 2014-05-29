package com.dextratech.dtf.ts1.testTimeout.tc1.a;

import com.dextratech.dtf.DextraTestCase;
import com.dextratech.dtf.exception.DextraSeleniumException;
import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class A extends DextraTestCase {
	private boolean success = true;
	private String screenshotDirectory = "D:/dev/projects/DEXTRA-testing-framework/Dextra_Testing_Framework/dtf-project-archetype/src/test/resources/screenshots//";

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*googlechrome C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "localhost:8090/idverification/");
		selenium.start();
		selenium.setTimeout("80000");
	}

	@Test
	public void testA() throws Throwable {
		selenium.windowMaximize();
		selenium.windowFocus();
		selenium.setSpeed("500");
		try {
		setStepInfo("open", "cuestionarios/consultar", "", false, false);
		selenium.open("cuestionarios/consultar");
		setStepInfo("type", "id=cliente", "001", false, false);
		selenium.type("id=cliente", "001");
		setStepInfo("click", "id=submit", "", false, false);
		selenium.click("id=submit");
		setStepInfo("waitForPageToLoad", "80000", "");
		selenium.waitForPageToLoad("80000");
		} catch (Throwable e) {
			String screenshotFile = captureScreenshot(screenshotDirectory);
			runAfterErrorCommands();
			if (success && errorCommands.size() == 0 || !success && !currentCommand.getErrorStep()) {
				fireDextraSeleniumException(e, screenshotFile);
			}
		}
		if (errorCommands.size() > 0) {
			fireNoErrorOccurredException();
		}
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
	
	private void runAfterErrorCommands() {
	}
}
