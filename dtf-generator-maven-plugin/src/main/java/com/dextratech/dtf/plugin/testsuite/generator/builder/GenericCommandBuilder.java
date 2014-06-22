/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.common.SeleniumCommand.Type;
import com.dextratech.dtf.plugin.testsuite.generator.FunctionRegistry;
import com.dextratech.dtf.xml.testsuite.GenericCommand;

/**
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public class GenericCommandBuilder implements SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(GenericCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<SeleniumCommand> buildCommand(Object o, FunctionRegistry functionRegistry) throws Exception {
		List<SeleniumCommand> commandList = new ArrayList<SeleniumCommand>();
		if (o instanceof GenericCommand) {
			log.trace("The object is a GenericCommand.");
			SeleniumCommand command = null;
			GenericCommand generic = (GenericCommand) o;
			command = composeCommand(generic);
			command.setType(Type.CUSTOM);
			command.setOriginalCommand(o);
			commandList.add(command);
		}
		return commandList;
	}

	/**
	 * Creates the function(selenese type function), target and value for a generic command.
	 *
	 * @param generic the generic
	 * @return the selenium command
	 */
	private SeleniumCommand composeCommand(GenericCommand generic) {
		String name = generic.getName();
		String target = generic.getParameter1();
		String value = generic.getParameter2();
		boolean errorStep = generic.isErrorStep();

		SeleniumCommand seleniumCommand = new SeleniumCommand(name, target, value, errorStep);
		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;
	}

	@Override
	public String getCommandName() {
		return null;
	}
}
