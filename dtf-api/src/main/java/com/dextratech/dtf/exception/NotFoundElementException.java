/**
 * 
 */
package com.dextratech.dtf.exception;

/**
 * Throwable exception used when an element is not found in a testcase.
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 26/06/2014
 */
public class NotFoundElementException extends Exception {

	public NotFoundElementException() {
		super();
	}

	public NotFoundElementException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotFoundElementException(String message) {
		super(message);
	}

	public NotFoundElementException(Throwable cause) {
		super(cause);
	}

}
