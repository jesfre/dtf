/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.common.SeleniumCommand.Type;
import com.dextratech.dtf.exception.InvalidValueException;
import com.dextratech.dtf.plugin.testsuite.generator.FunctionRegistry;
import com.dextratech.dtf.plugin.utils.DataHelper;
import com.dextratech.dtf.xml.testsuite.Field;
import com.dextratech.dtf.xml.testsuite.Function;
import com.dextratech.dtf.xml.testsuite.FunctionRef;
import com.dextratech.dtf.xml.testsuite.ValidFieldValue;

/**
 * Builds a SeleniumCommand for fields.
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 * @param <T>
 */
public class FieldCommandBuilder implements SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(FieldCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<SeleniumCommand> buildCommand(Object o, FunctionRegistry functionRegistry) throws Exception {
		List<SeleniumCommand> commandList = new ArrayList<SeleniumCommand>();
		if (o instanceof Field) {
			log.trace("The object is a Field.");
			SeleniumCommand command = null;
			Field field = (Field) o;
			command = composeCommand(field, functionRegistry);
			command.setType(Type.FIELD);
			command.setOriginalCommand(o);
			commandList.add(command);
		}
		return commandList;
	}

	/**
	 * Here is where the build of the command is done.
	 * Creates the function(selenese type function), target and value for a tested field
	 *
	 * @param field the field
	 * @param functionRegistry the function registry
	 * @return the selenium command
	 * @throws InvalidValueException 
	 */
	public SeleniumCommand composeCommand(Field field, FunctionRegistry functionRegistry) throws InvalidValueException {
		String locator = field.getLocator();
		boolean errorStep = field.isErrorStep();

		String testingValue = getValidValue(field, functionRegistry);
		if (testingValue == null) {
			throw new InvalidValueException("field.validValueDef is not a valid value.");
		}

		String commandName = getCommandName();
		SeleniumCommand seleniumCommand = new SeleniumCommand(commandName, locator, testingValue, errorStep);
		List<Object> validationList = field.getValidateOrValidateFunctionOrValidateFunctionRef();
		seleniumCommand.setValidations(validationList);

		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;
	}

	/**
	 * Gets the valid value from the validValue or validValueDef element.
	 *
	 * @param field the field
	 * @param functionRegistry the function registry
	 * @return the valid value
	 */
	private String getValidValue(Field field, FunctionRegistry functionRegistry) {
		// Use the validValue element
		String testingValue = field.getValidValue();
		if (testingValue != null) {
			return testingValue;
		}
		// Use the validValueDef element
		ValidFieldValue validFieldValue = field.getValidValueDef();
		if (validFieldValue != null) {
			String literal = validFieldValue.getLiteral();
			Function fn = validFieldValue.getFunction();
			FunctionRef fnRef = validFieldValue.getFunctionRef();
			if (StringUtils.isNotBlank(literal)) {
				testingValue = literal;

			} else if (fn != null) {
				testingValue = DataHelper.getTestValue(fn);

			} else if (fnRef != null) {
				String fnRefId = fnRef.getFunctionRefId();
				Function fnReferred = functionRegistry.getFunction(fnRefId);
				testingValue = DataHelper.getTestValue(fnReferred);
			}
		}
		return testingValue;
	}

	@Override
	public String getCommandName() {
		return "type";
	}

}
