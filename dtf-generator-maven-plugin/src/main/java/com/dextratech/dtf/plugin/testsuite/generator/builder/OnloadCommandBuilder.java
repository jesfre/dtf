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
import com.dextratech.dtf.xml.testsuite.Onload;

/**
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public class OnloadCommandBuilder implements SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(OnloadCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<SeleniumCommand> buildCommand(Object o, FunctionRegistry functionRegistry) throws Exception {
		List<SeleniumCommand> commandList = new ArrayList<SeleniumCommand>();
		if (o instanceof Onload) {
			log.trace("The object is an Onload.");
			SeleniumCommand command = null;
			Onload onload = (Onload) o;
			onload.getAction();
			command = composeCommand(onload);
			command.setType(Type.ONLOAD);
			command.setOriginalCommand(o);
			commandList.add(command);
		}
		return commandList;
	}

	/**
	 * Creates the function(selenese type function), target and value for an onload function
	 * @param onload
	 * @return
	 */
	private SeleniumCommand composeCommand(Onload onload) {
		boolean errorStep = onload.isErrorStep();
		String onloadAction = onload.getAction().value();
		String commandName = "onload" + WordUtils.capitalize(onloadAction);
		SeleniumCommand seleniumCommand = new SeleniumCommand(commandName, "", "", errorStep);
		return seleniumCommand;
	}

	@Override
	public String getCommandName() {
		return null;
	}
}
