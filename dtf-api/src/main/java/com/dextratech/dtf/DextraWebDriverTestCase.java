//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.BeanUtils;

import com.dextratech.dtf.exception.DextraSeleniumException;
import com.dextratech.dtf.exception.NoErrorOccurredException;
import com.dextratech.dtf.utils.DbUnitUtils;
import com.thoughtworks.selenium.SeleneseTestCase;

/**
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         06/12/2012
 */
public class DextraWebDriverTestCase {
	private static Log log = LogFactory.getLog(DextraWebDriverTestCase.class);

	protected String testName = null;
	protected WebDriver driver = null;
	protected SeleniumCommand currentCommand = new SeleniumCommand();
	protected SeleniumCommand testingCommand4ThisTestcase = new SeleniumCommand();
	protected List<SeleniumCommand> errorCommands = new ArrayList<SeleniumCommand>();

	public void setUp() throws Exception {
		DbUnitUtils.export();
	}

	public void tearDown() throws Exception {
		DbUnitUtils.cleanInsert();
	}

	/**
	 * Records the configuration of the next action step to execute and,
	 * if the step is an error step, adds the configuration to a list of strings.
	 * @param command
	 * @param target
	 * @param value
	 * @param errorStep
	 * @param isTestingCommand4Testcase
	 */
	public void setStepInfo(String command, String target, String value, boolean errorStep, boolean isTestingCommand4Testcase) {
		currentCommand.setName(command);
		currentCommand.setTarget(target);
		currentCommand.setValue(value);
		currentCommand.setErrorStep(errorStep);
		if (errorStep) {
			errorCommands.add(new SeleniumCommand(command, target, value, errorStep));
		}
		if (isTestingCommand4Testcase) {
			BeanUtils.copyProperties(currentCommand, testingCommand4ThisTestcase);
		}
	}

	/**
	 * Records the configuration of the next action step to execute and,
	 * if the step is an error step, adds the configuration to a list of strings.
	 * @param command
	 * @param target
	 * @param value
	 * @param errorStep
	 */
	public void setStepInfo(String command, String target, String value, boolean errorStep) {
		setStepInfo(command, target, value, errorStep, false);
	}

	/**
	 * Records the configuration of the next action step to execute and,
	 * if the step is an error step, adds the configuration to a list of strings.
	 * @param command
	 * @param target
	 * @param value
	 */
	public void setStepInfo(String command, String target, String value) {
		setStepInfo(command, target, value, false, false);
	}

	/**
	 * @param screenshotFilePath
	 * @return
	 */
	public String captureScreenshot(String screenshotFilePath) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File(screenshotFilePath));
		} catch (IOException e) {
			log.error("Can't create screen shot for " + getTestName());
			log.error(e.getMessage(), e);
		}
		return screenshotFilePath;
	}

	/**
	 * @param screenshotDirectory
	 * @return
	 */
	public String captureExceptionScreenshot(String screenshotDirectory) {
		String screenshotFilePath = screenshotDirectory + "error-" + getTestName() + ".png";
		captureScreenshot(screenshotFilePath);
		return screenshotFilePath;
	}

	/**
	 * Creates a message for a Dextra Selenium Exception and fires it.
	 * @param e
	 * @param screenshotDirectory
	 * @throws DextraSeleniumException
	 */
	public void fireDextraSeleniumException(Throwable e, String screenshotFilePath) throws DextraSeleniumException {
		throw new DextraSeleniumException(e, getTestName(), screenshotFilePath, currentCommand.getName(),
				currentCommand.getTarget(), currentCommand.getValue(), testingCommand4ThisTestcase);
	}

	/**
	 * Creates a message with the error commands found and fires the exception.
	 * @throws NoErrorOccurredException
	 */
	public void fireNoErrorOccurredException() throws NoErrorOccurredException {
		SeleniumCommand[] errorCommandsArray = errorCommands.toArray(new SeleniumCommand[errorCommands.size()]);
		throw new NoErrorOccurredException(errorCommandsArray, testingCommand4ThisTestcase);
	}

	public SeleniumCommand getCurrentCommand() {
		return currentCommand;
	}

	public void setCurrentCommand(SeleniumCommand currentCommand) {
		this.currentCommand = currentCommand;
	}

	public SeleniumCommand getTestingCommand4ThisTestcase() {
		return testingCommand4ThisTestcase;
	}

	public void setTestingCommand4ThisTestcase(SeleniumCommand testingCommand4ThisTestcase) {
		this.testingCommand4ThisTestcase = testingCommand4ThisTestcase;
	}

	public List<SeleniumCommand> getErrorCommands() {
		return errorCommands;
	}

	public void setErrorCommands(List<SeleniumCommand> errorCommands) {
		this.errorCommands = errorCommands;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
