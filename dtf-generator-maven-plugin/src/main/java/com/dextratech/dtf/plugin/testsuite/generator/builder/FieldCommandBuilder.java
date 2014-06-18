/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.common.SeleniumCommand;
import com.dextratech.dtf.common.SeleniumCommand.Type;
import com.dextratech.dtf.plugin.testsuite.generator.FunctionRegistry;
import com.dextratech.dtf.plugin.utils.DataHelper;
import com.dextratech.dtf.xml.testsuite.Field;
import com.dextratech.dtf.xml.testsuite.Function;
import com.dextratech.dtf.xml.testsuite.FunctionRef;
import com.dextratech.dtf.xml.testsuite.LocatorType;
import com.dextratech.dtf.xml.testsuite.SeleneseCommand;
import com.dextratech.dtf.xml.testsuite.ValidFieldValue;

/**
 * Builds a SeleniumCommand for fields.
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 17/06/2014
 * @param <T>
 */
public class FieldCommandBuilder extends SeleniumCommandBuilder {
	private Log log = LogFactory.getLog(FieldCommandBuilder.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SeleniumCommand buildCommand(Object o, FunctionRegistry functionRegistry) {
		SeleniumCommand command = null;
		if (o instanceof Field) {
			log.trace("The object is a Field.");
			Field field = (Field) o;
			command = composeCommand(field, functionRegistry);
			command.setType(Type.FIELD);
		}
		return command;
	}

	/**
	 * Here is where the build of the command is done.
	 * Creates the function(selenese type function), target and value for a tested field
	 *
	 * @param field the field
	 * @param functionRegistry the function registry
	 * @return the selenium command
	 */
	public SeleniumCommand composeCommand(Field field, FunctionRegistry functionRegistry) {
		LocatorType locatorType = field.getLocatorType();
		String locatorValue = field.getLocatorValue();
		String finalLocator = createLocator(locatorType, locatorValue);
		boolean errorStep = field.isErrorStep();

		/*
		 * Gets the valid value from attribute or from a validFieldValue element.
		 * Attribute validValue is mandatory.
		 */
		String testingValue = field.getValidValue();
		if (testingValue == null) {
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
		}

		SeleniumCommand seleniumCommand = new SeleniumCommand(SeleneseCommand.TYPE.value(), finalLocator, testingValue, errorStep);
		List<Object> validationList = field.getValidateOrValidateFunctionOrValidateFunctionRef();
		seleniumCommand.setValidations(validationList);

		log.debug("Composed command : " + seleniumCommand.toString());
		return seleniumCommand;
	}
}
