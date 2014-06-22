/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.common.SeleniumCommand.Type;
import com.dextratech.dtf.plugin.testsuite.generator.FunctionRegistry;
import com.dextratech.dtf.xml.testsuite.AssertionAction;
import com.dextratech.dtf.xml.testsuite.AssertionType;

/**
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 */
public class AssertionCommandBuilder implements SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(AssertionCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 * @throws Exception 
	 */
	@Override
	public List<SeleniumCommand> buildCommand(Object o, FunctionRegistry functionRegistry) throws Exception {
		List<SeleniumCommand> commandList = new ArrayList<SeleniumCommand>();
		if (o instanceof AssertionAction) {
			log.trace("The object is an Assertion.");
			SeleniumCommand command = null;
			AssertionAction assertion = (AssertionAction) o;
			command = composeCommand(assertion);
			command.setType(Type.ASSERT);
			command.setOriginalCommand(o);
			commandList.add(command);
		}
		return commandList;
	}

	/**
	 * Creates the function(selenese type function), target and value for an assertion command
	 * @param assertion
	 * @return
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 */
	private SeleniumCommand composeCommand(AssertionAction assertion) throws Exception {
		String id = assertion.getId();
		AssertionType assertionType = assertion.getType();
		boolean errorStep = assertion.isErrorStep();
		
		String param1value = null;
		String param2value = null;
		Object object = null;
		
		AssertionParameterMapping[] assertionParameterMappings = AssertionParameterMapping.values();
		String actionSimpleClassName = null;
		for(AssertionParameterMapping parameterMapping : assertionParameterMappings) {
			actionSimpleClassName = parameterMapping.name();

			// Builds something like "getAlert"
			String getActionMethodName = "get" + WordUtils.capitalize(actionSimpleClassName);

			// Builds something like "getAlert()" method
			Method getActionMethod = assertion.getClass().getMethod(getActionMethodName);

			// Returns something like "AssertionAction.Alert" object by invoking something like "assertion.getAlert()"
			object = getActionMethod.invoke(assertion);
			
			if(object != null) {
				String simpleClassName = object.getClass().getSimpleName();
	
				// Gets the name of the parameters
				AssertionParameterMapping assertionParameterMapping = AssertionParameterMapping.valueOf(simpleClassName);
				String parameter1Name = assertionParameterMapping.getParameter1Name();
				String parameter2Name = assertionParameterMapping.getParameter2Name();
	
				/*
				 * Builds the get methods to extract the values for 1st and 2nd parameters
				 */
				if (parameter1Name != null) {
					String getMethod1 = "get" + WordUtils.capitalize(parameter1Name);
					param1value = (String) object.getClass().getMethod(getMethod1).invoke(object);
				}
				if (parameter2Name != null) {
					String getMethod2 = "get" + WordUtils.capitalize(parameter2Name);
					param2value = (String) object.getClass().getMethod(getMethod2).invoke(object);
				}
				log.trace("The action IS a [ " + parameterMapping + " ]");
				log.trace("Found parameters [" + parameter1Name + "=" + param1value + "," + parameter2Name + "=" + param2value + "]");
				break;
			}
		}
		
		if (object == null) {
			String message = "The assertion [ "+assertion+" ] is not a valid one or not found.";
			log.error(message);
			throw new Exception(message);
		}
		String fullAssertionName = assertionType.value() + actionSimpleClassName;
		SeleniumCommand seleniumCommand = new SeleniumCommand(fullAssertionName, param1value, param2value, errorStep);
		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;

	}

	@Override
	public String getCommandName() {
		return null;
	}
}
