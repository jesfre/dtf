//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.common;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract Selenese command.
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 *         03/05/2013
 */
public class SeleniumCommand {
	public enum Type {
		ACTION, ASSERT, CAPTURE_SCREENSHOT, CUSTOM, FIELD, ONLOAD, ECHO;
	}

	private Type type = null;
	private String name = "";
	private String target = "";
	private String value = "";
	private boolean errorStep = false;
	private Object originalCommand = null;

	/**
	 * A flag to determine during HTML test script generation if this command
	 * (type action for an input field) is the one wich is being tested in the test case
	 */
	private boolean testingCommand4Testcase = false;
	/**
	 * A list of validations with possible values that the command can handle
	 */
	private List<Object> validations = new ArrayList<Object>();

	public SeleniumCommand() {
	}

	/**
	 * If target or value are null, then will be set to an empty string
	 * @param name
	 * @param target
	 * @param value
	 */
	public SeleniumCommand(String name, String target, String value) {
		this(name, target, value, false, false);
	}

	/**
	 * If target or value are null, then will be set to an empty string
	 * @param name
	 * @param target
	 * @param value
	 * @param errorStep
	 */
	public SeleniumCommand(String name, String target, String value, boolean errorStep) {
		this(name, target, value, errorStep, false);
	}

	/**
	 * If target or value are null, then will be set to an empty string
	 * @param name
	 * @param target
	 * @param value
	 * @param errorStep
	 * @param testingCommand4Testcase
	 */
	public SeleniumCommand(String name, String target, String value, boolean errorStep, boolean testingCommand4Testcase) {
		super();

		if (target == null) {
			target = "";
		}
		if (value == null) {
			value = "";
		}

		this.name = name;
		this.target = target;
		this.value = value;
		this.errorStep = errorStep;
		this.testingCommand4Testcase = testingCommand4Testcase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean getErrorStep() {
		return errorStep;
	}

	public void setErrorStep(boolean errorStep) {
		this.errorStep = errorStep;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Object getOriginalCommand() {
		return originalCommand;
	}

	public void setOriginalCommand(Object originalCommand) {
		this.originalCommand = originalCommand;
	}

	/**
	 * {@link SeleniumCommand#testingCommand4Testcase}
	 * @return
	 */
	public boolean getTestingCommand4Testcase() {
		return testingCommand4Testcase;
	}

	/**
	 * {@link SeleniumCommand#testingCommand4Testcase}
	 * @param testingCommand4Testcase
	 */
	public void setTestingCommand4Testcase(boolean testingCommand4Testcase) {
		this.testingCommand4Testcase = testingCommand4Testcase;
	}

	/**
	 * {@link SeleniumCommand#validations}
	 * @return
	 */
	public List<Object> getValidations() {
		return validations;
	}

	/**
	 * {@link SeleniumCommand#validations}
	 * @param validations
	 */
	public void setValidations(List<Object> validations) {
		this.validations = validations;
	}

	@Override
	public String toString() {
		return "SeleniumCommand [name=" + name + ", target=" + target + ", value=" + value + ", errorStep=" + errorStep + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (errorStep ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeleniumCommand other = (SeleniumCommand) obj;
		if (errorStep != other.errorStep)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
}
