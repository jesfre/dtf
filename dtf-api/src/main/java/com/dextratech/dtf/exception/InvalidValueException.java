/**
 * 
 */
package com.dextratech.dtf.exception;

/**
 * Throwable exception used when a value is not a valid one.
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 26/06/2014
 */
public class InvalidValueException extends Exception {

	public InvalidValueException() {
		super();
	}

	public InvalidValueException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidValueException(String message) {
		super(message);
	}

	public InvalidValueException(Throwable cause) {
		super(cause);
	}

}
