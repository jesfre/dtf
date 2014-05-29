//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.testsuite.generator;

import java.util.ArrayList;
import java.util.List;

import com.dextratech.dtf.xml.testsuite.Component;

/**
 * Registry helper for components in a testsuite.
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 *         07/05/2013
 */
public class ComponentRegistry extends ArrayList<Component> {
	private static final long serialVersionUID = 1L;

	public ComponentRegistry() {
	}

	public ComponentRegistry(List<Component> componentList) {
		addAll(componentList);
	}

	/**
	 * Return an specified component by name
	 * @param name
	 * @return
	 */
	public Component getComponent(String name) {
		for (Component component : this) {
			if (component.getName().equals(name)) {
				return component;
			}
		}
		return null;
	}

}
