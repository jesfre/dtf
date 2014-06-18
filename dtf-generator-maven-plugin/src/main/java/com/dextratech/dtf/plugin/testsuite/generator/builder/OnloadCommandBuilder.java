/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;

import org.apache.commons.lang.WordUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.common.SeleniumCommand.Type;
import com.dextratech.dtf.plugin.testsuite.generator.FunctionRegistry;
import com.dextratech.dtf.xml.testsuite.Action;
import com.dextratech.dtf.xml.testsuite.Field;
import com.dextratech.dtf.xml.testsuite.LocatorType;
import com.dextratech.dtf.xml.testsuite.Onload;

/**
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public class OnloadCommandBuilder extends SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(OnloadCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SeleniumCommand buildCommand(Object o, FunctionRegistry functionRegistry) {
		SeleniumCommand command = null;
		if (o instanceof Onload) {
			log.trace("The object is an Onload.");
			Onload onload = (Onload) o;
			onload.getAction();
			command = composeCommand(onload);
			command.setType(Type.ONLOAD);
		}
		return command;
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

}
