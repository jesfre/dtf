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
import com.dextratech.dtf.xml.testsuite.Echo;
import com.dextratech.dtf.xml.testsuite.GenericCommand;

/**
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public class EchoCommandBuilder implements SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(EchoCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<SeleniumCommand> buildCommand(Object o, FunctionRegistry functionRegistry) throws Exception {
		List<SeleniumCommand> commandList = new ArrayList<SeleniumCommand>();
		if (o instanceof Echo) {
			log.trace("The object is an Echo.");
			SeleniumCommand command = null;
			Echo generic = (Echo) o;
			command = composeCommand(generic);
			command.setType(Type.ECHO);
			command.setOriginalCommand(o);
			commandList.add(command);
		}
		return commandList;
	}

	/**
	 * Creates the function(selenese type function) for a echo command.
	 *
	 * @param object the echo
	 * @return the selenium command
	 */
	private SeleniumCommand composeCommand(Echo object) {
		String message = object.getMessage();

		SeleniumCommand seleniumCommand = new SeleniumCommand(getCommandName(), message, null);
		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;
	}

	@Override
	public String getCommandName() {
		return "echo";
	}
}
