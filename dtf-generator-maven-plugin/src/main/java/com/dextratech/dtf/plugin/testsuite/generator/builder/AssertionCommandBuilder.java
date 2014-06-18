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
import com.dextratech.dtf.xml.testsuite.Assertion;
import com.dextratech.dtf.xml.testsuite.Field;
import com.dextratech.dtf.xml.testsuite.LocatorType;
import com.dextratech.dtf.xml.testsuite.SeleneseAssertion;

/**
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public class AssertionCommandBuilder extends SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(AssertionCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SeleniumCommand buildCommand(Object o, FunctionRegistry functionRegistry) {
		SeleniumCommand command = null;
		if (o instanceof Assertion) {
			log.trace("The object is an Assertion.");
			Assertion assertion = (Assertion) o;
			command = composeCommand(assertion);
			command.setType(Type.ASSERT);
		}
		return command;
	}

	/**
	 * Creates the function(selenese type function), target and value for an assertion command
	 * @param assertion
	 * @return
	 */
	private SeleniumCommand composeCommand(Assertion assertion) {
		SeleneseAssertion assertionType = assertion.getType();
		String param1 = assertion.getParam1();
		String param2 = assertion.getParam2();
		boolean errorStep = assertion.isErrorStep();

		SeleniumCommand seleniumCommand = new SeleniumCommand(assertionType.value(), param1, param2, errorStep);
		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;

	}

}
