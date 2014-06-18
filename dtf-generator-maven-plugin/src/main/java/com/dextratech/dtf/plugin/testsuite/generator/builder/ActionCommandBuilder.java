/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.common.SeleniumCommand.Type;
import com.dextratech.dtf.plugin.testsuite.generator.FunctionRegistry;
import com.dextratech.dtf.xml.testsuite.Action;
import com.dextratech.dtf.xml.testsuite.Field;
import com.dextratech.dtf.xml.testsuite.LocatorType;

/**
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public class ActionCommandBuilder extends SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(ActionCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SeleniumCommand buildCommand(Object o, FunctionRegistry functionRegistry) {
		SeleniumCommand command = null;
		if (o instanceof Action) {
			log.trace("The object is an Action.");
			Action action = (Action) o;
			command = composeCommand(action);
			command.setType(Type.ACTION);
		}
		return command;
	}

	/**
	 * Creates the function(selenese type function), target and value for an action command.
	 *
	 * @param action the action
	 * @return the selenium command
	 */
	private SeleniumCommand composeCommand(Action action) {
		LocatorType locatorType = action.getLocatorType();
		String locatorValue = action.getLocatorValue();
		String finalLocator = createLocator(locatorType, locatorValue);
		String actionType = action.getActionType().value();
		String additionalParam = action.getAdditionalParameter();
		boolean errorStep = action.isErrorStep();

		SeleniumCommand seleniumCommand = new SeleniumCommand(actionType, finalLocator, additionalParam, errorStep);
		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;
	}

}
