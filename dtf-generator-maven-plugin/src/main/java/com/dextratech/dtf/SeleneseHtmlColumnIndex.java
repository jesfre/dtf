//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf;

/**
 * Enumeracion para obtener la columna correspondiente a cierto campo del script de Selenese
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 * 20/06/2012
 */
public enum SeleneseHtmlColumnIndex {
	COMMAND(0), TARGET(1), VALUE(2);
	
	private int index;
	
	private SeleneseHtmlColumnIndex(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
