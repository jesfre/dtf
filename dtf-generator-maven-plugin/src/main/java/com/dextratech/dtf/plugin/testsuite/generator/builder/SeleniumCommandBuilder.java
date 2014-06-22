/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;

import java.util.List;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.plugin.testsuite.generator.FunctionRegistry;
import com.dextratech.dtf.xml.testsuite.Field;
import com.dextratech.dtf.xml.testsuite.LocatorType;

/**
 * An interface to build all required commands for Selenium.
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public interface SeleniumCommandBuilder {

	/**
	 * Builds the Selenium command.
	 *
	 * @param o the object from which to obtain values for the command
	 * @param functionRegistry the function registry
	 * @return a list of Selenium commands that handles the object (as configured Selenese command)
	 * @throws Exception the exception
	 */
	public abstract List<SeleniumCommand> buildCommand(Object o, FunctionRegistry functionRegistry) throws Exception;
	
	/**
	 * Gets the Selenium command name.
	 * @return the command name
	 */
	public abstract String getCommandName();

}
