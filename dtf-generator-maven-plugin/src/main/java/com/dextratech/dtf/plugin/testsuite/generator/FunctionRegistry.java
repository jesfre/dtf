//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.plugin.testsuite.generator;

import java.util.ArrayList;
import java.util.List;

import com.dextratech.dtf.xml.testsuite.ValidationFunction;

/**
 * Registry helper for validation functions.
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 *         07/05/2013
 *         
 *         TODO Change this List object for a Map, to get more easy a function by its ID.
 */
public class FunctionRegistry extends ArrayList<ValidationFunction> {
	private static final long serialVersionUID = 1L;

	public FunctionRegistry() {
	}

	public FunctionRegistry(List<ValidationFunction> componentList) {
		addAll(componentList);
	}

	/**
	 * Return an specified component by name
	 * @param fnId
	 * @return
	 */
	public ValidationFunction getFunction(String fnId) {
		for (ValidationFunction fn : this) {
			if (fn.getId().equals(fnId)) {
				return fn;
			}
		}
		return null;
	}

}
