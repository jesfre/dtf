//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.06 a las 01:58:15 AM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Clase Java para onload complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="onload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="action" type="{http://www.dextratech.com/testsuite}onloadAction" default="closeAlert" />
 *       &lt;attribute name="errorStep" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "onload")
public class Onload implements ToString
{

    @XmlAttribute(name = "action")
    protected OnloadAction action;
    @XmlAttribute(name = "errorStep")
    protected Boolean errorStep;

    /**
     * Obtiene el valor de la propiedad action.
     * 
     * @return
     *     possible object is
     *     {@link OnloadAction }
     *     
     */
    public OnloadAction getAction() {
        if (action == null) {
            return OnloadAction.CLOSE_ALERT;
        } else {
            return action;
        }
    }

    /**
     * Define el valor de la propiedad action.
     * 
     * @param value
     *     allowed object is
     *     {@link OnloadAction }
     *     
     */
    public void setAction(OnloadAction value) {
        this.action = value;
    }

    /**
     * Obtiene el valor de la propiedad errorStep.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isErrorStep() {
        if (errorStep == null) {
            return false;
        } else {
            return errorStep;
        }
    }

    /**
     * Define el valor de la propiedad errorStep.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorStep(Boolean value) {
        this.errorStep = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            OnloadAction theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        {
            boolean theErrorStep;
            theErrorStep = ((this.errorStep!= null)?this.isErrorStep():false);
            strategy.appendField(locator, this, "errorStep", buffer, theErrorStep);
        }
        return buffer;
    }

}
