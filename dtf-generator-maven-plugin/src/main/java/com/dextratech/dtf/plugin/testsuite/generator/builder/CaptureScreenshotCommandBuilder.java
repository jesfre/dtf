/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.common.SeleniumCommand.Type;
import com.dextratech.dtf.plugin.testsuite.generator.FunctionRegistry;
import com.dextratech.dtf.xml.testsuite.CaptureScreenshot;

/**
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public class CaptureScreenshotCommandBuilder implements SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(CaptureScreenshotCommandBuilder.class);

	/** 
	 * Handles a counter for all screenshots taken in the testcase, 
	 * so this must be initialized in every new instance. 
	 */
	private static int screenshotCounter = 0;

	private String testcaseName = null;

	public CaptureScreenshotCommandBuilder(String testcaseName) {
		CaptureScreenshotCommandBuilder.screenshotCounter = 0;
		this.testcaseName = testcaseName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<SeleniumCommand> buildCommand(Object o, FunctionRegistry functionRegistry) throws Exception {
		List<SeleniumCommand> commandList = new ArrayList<SeleniumCommand>();
		if (o instanceof CaptureScreenshot) {
			log.trace("The object is a CaptureScreenshot.");
			SeleniumCommand command = null;
			CaptureScreenshot screenshot = (CaptureScreenshot) o;
			command = composeCommand(screenshot);
			command.setType(Type.CAPTURE_SCREENSHOT);
			command.setOriginalCommand(o);
			commandList.add(command);
		}
		return commandList;
	}

	/**
	 * Creates the function(selenese type function), target and value for a captureScreenshot function
	 * @param screenshot
	 * @return
	 */
	private SeleniumCommand composeCommand(CaptureScreenshot screenshot) {
		SeleniumCommand command;
		String commandName = getCommandName();
		/*
		 * Full path of the file is not more needed.
		 */
		//		String directory = screenshot.getDirectory();
		//		if (StringUtils.isBlank(directory)) {
		//			directory = screenshotsDirectory;
		//		}
		String filename = screenshot.getPngFilename();
		if (StringUtils.isBlank(filename)) {
			filename = this.testcaseName + "_" + (++CaptureScreenshotCommandBuilder.screenshotCounter);
		}
		//		String target = directory + filename + ".png";
		String target = filename + ".png";
		command = new SeleniumCommand(commandName, target, "");
		return command;
	}

	@Override
	public String getCommandName() {
		return "captureScreenshot";
	}
}
