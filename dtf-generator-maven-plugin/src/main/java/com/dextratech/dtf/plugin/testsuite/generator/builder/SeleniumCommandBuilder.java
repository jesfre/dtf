/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.plugin.testsuite.generator.FunctionRegistry;
import com.dextratech.dtf.xml.testsuite.Field;
import com.dextratech.dtf.xml.testsuite.LocatorType;

/**
 * An abstract class to build all required commands for Selenium.
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public abstract class SeleniumCommandBuilder {

	/**
	 * Builds the Selenium command.
	 *
	 * @param o the object from which to obtain values for the command
	 * @param functionRegistry the function registry
	 * @return the selenium command
	 */
	public abstract SeleniumCommand buildCommand(Object o, FunctionRegistry functionRegistry);
	
	/**
	 * Create a string that represents the locator expression for Selenese.
	 * @param locatorType
	 * @param locatorValue
	 * @return
	 */
	protected String createLocator(LocatorType locatorType, String locatorValue) {
		if (locatorType == null) {
			return locatorValue;
		}
		String locator = "";
		switch (locatorType) {
		case XPATH:
			// Return the value itself because a xpath locator is expressed like //a[contains(text(),'Entrar')]
			locator = locatorValue;
			break;
		case NOTHING:
			locator = locatorValue;
			break;
		default:
			// Return locatorType=locatorValue because all other locator are expressed like id=j_username
			locator = locatorType.value() + "=" + locatorValue;
			break;
		}
		return locator;
	}
}
