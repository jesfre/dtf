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
import com.dextratech.dtf.xml.testsuite.GenericCommand;
import com.dextratech.dtf.xml.testsuite.LocatorType;

/**
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public class GenericCommandBuilder extends SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(GenericCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SeleniumCommand buildCommand(Object o, FunctionRegistry functionRegistry) {
		SeleniumCommand command = null;
		if (o instanceof GenericCommand) {
			log.trace("The object is a GenericCommand.");
			GenericCommand generic = (GenericCommand) o;
			command = composeCommand(generic);
			command.setType(Type.CUSTOM);
		}
		return command;
	}

	/**
	 * Creates the function(selenese type function), target and value for a generic command.
	 *
	 * @param generic the generic
	 * @return the selenium command
	 */
	private SeleniumCommand composeCommand(GenericCommand generic) {
		String name = generic.getName();
		String target = generic.getTarget();
		String value = generic.getValue();
		boolean errorStep = generic.isErrorStep();

		SeleniumCommand seleniumCommand = new SeleniumCommand(name, target, value, errorStep);
		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;

	}
}
