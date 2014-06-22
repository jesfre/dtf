/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.common.SeleniumCommand.Type;
import com.dextratech.dtf.plugin.testsuite.generator.FunctionRegistry;
import com.dextratech.dtf.xml.testsuite.Action;

/**
 * This builds an action command for all those that are not an assertion, custom, field, onload or capture screenshot action.
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public class ActionCommandBuilder implements SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(ActionCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<SeleniumCommand> buildCommand(Object o, FunctionRegistry functionRegistry) throws Exception {
		List<SeleniumCommand> commandList = new ArrayList<SeleniumCommand>();
		if (o instanceof Action) {
			log.trace("The object is an Action.");
			SeleniumCommand command = null;
			Action action = (Action) o;
			command = composeCommand(action);
			command.setType(Type.ACTION);
			command.setOriginalCommand(o);
			commandList.add(command);
		}
		return commandList;
	}

	/**
	 * Creates the function(selenese type function), target and value for an action command.
	 *
	 * @param action the action
	 * @return the selenium command
	 */
	private SeleniumCommand composeCommand(Action action) throws Exception {
		String param1value = null;
		String param2value = null;
		SeleniumCommand seleniumCommand = null;

		// The simple class name is the action name 
		String actionName = action.getClass().getSimpleName();
		log.trace("Testing [ " + actionName + " ] action.");

		// Gets the name of the parameters
		ActionParameterMapping actionParameterMapping = ActionParameterMapping.valueOf(actionName);
		if (actionParameterMapping != null) {
			String parameter1Name = actionParameterMapping.getParameter1Name();
			String parameter2Name = actionParameterMapping.getParameter2Name();

			/*
			 * Builds the get methods to extract the values for 1st and 2nd parameters
			 */
			if (parameter1Name != null) {
				String getMethod1 = "get" + WordUtils.capitalize(parameter1Name);
				param1value = (String) action.getClass().getMethod(getMethod1).invoke(action);
			}
			if (parameter2Name != null) {
				String getMethod2 = "get" + WordUtils.capitalize(parameter2Name);
				param2value = (String) action.getClass().getMethod(getMethod2).invoke(action);
			}
			log.trace("\tFound parameters [" + parameter1Name + "=" + param1value + "," + parameter2Name + "=" + param2value + "]");

			boolean errorStep = action.isErrorStep();
			String actionNameUncap = WordUtils.uncapitalize(actionName);

			seleniumCommand = new SeleniumCommand(actionNameUncap, param1value, param2value, errorStep);
			log.debug("\tComposed command : " + seleniumCommand.toString());
		} else {
			log.trace("\tThe action [ " + actionName + " ] not found in the enum list.");
		}
		return seleniumCommand;
	}

	@Override
	public String getCommandName() {
		return null;
	}
}
