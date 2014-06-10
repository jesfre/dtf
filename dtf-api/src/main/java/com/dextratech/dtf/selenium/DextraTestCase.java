//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.selenium;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.exception.DextraSeleniumException;
import com.dextratech.dtf.exception.NoErrorOccurredException;
import com.dextratech.dtf.utils.DbUnitUtils;
import com.thoughtworks.selenium.SeleneseTestCase;

/**
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         06/12/2012
 */
@SuppressWarnings("deprecation")
public class DextraTestCase extends SeleneseTestCase {
	protected SeleniumCommand currentCommand = new SeleniumCommand();
	protected SeleniumCommand testingCommand4ThisTestcase = new SeleniumCommand();
	protected List<SeleniumCommand> errorCommands = new ArrayList<SeleniumCommand>();

	public void setUp() throws Exception {
		super.setUp();
		DbUnitUtils.export();
	}

	public void tearDown() throws Exception {
		super.tearDown();
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
	 * @param screenshotDirectory
	 * @return
	 */
	public String captureScreenshot(String screenshotDirectory) {
		String screenshotFilePath = screenshotDirectory + "error-" + getName() + ".png";
		selenium.captureScreenshot(screenshotFilePath);
		return screenshotFilePath;
	}

	/**
	 * Creates a message for a Dextra Selenium Exception and fires it.
	 * @param e
	 * @param screenshotDirectory
	 * @throws DextraSeleniumException
	 */
	public void fireDextraSeleniumException(Throwable e, String screenshotFilePath) throws DextraSeleniumException {
		throw new DextraSeleniumException(e, getName(), screenshotFilePath, currentCommand.getName(),
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

}
