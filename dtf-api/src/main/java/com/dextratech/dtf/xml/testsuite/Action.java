//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.17 a las 10:41:31 PM CDT 
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
 * <p>Clase Java para action complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="action">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="actionType" type="{http://www.dextratech.com/testsuite}seleneseCommand" />
 *       &lt;attribute name="locatorType" type="{http://www.dextratech.com/testsuite}locatorType" default="id" />
 *       &lt;attribute name="locatorValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="additionalParameter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorStep" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "action")
public class Action implements ToString
{

    @XmlAttribute(name = "actionType")
    protected SeleneseCommand actionType;
    @XmlAttribute(name = "locatorType")
    protected LocatorType locatorType;
    @XmlAttribute(name = "locatorValue")
    protected String locatorValue;
    @XmlAttribute(name = "additionalParameter")
    protected String additionalParameter;
    @XmlAttribute(name = "errorStep")
    protected Boolean errorStep;

    /**
     * Obtiene el valor de la propiedad actionType.
     * 
     * @return
     *     possible object is
     *     {@link SeleneseCommand }
     *     
     */
    public SeleneseCommand getActionType() {
        return actionType;
    }

    /**
     * Define el valor de la propiedad actionType.
     * 
     * @param value
     *     allowed object is
     *     {@link SeleneseCommand }
     *     
     */
    public void setActionType(SeleneseCommand value) {
        this.actionType = value;
    }

    /**
     * Obtiene el valor de la propiedad locatorType.
     * 
     * @return
     *     possible object is
     *     {@link LocatorType }
     *     
     */
    public LocatorType getLocatorType() {
        if (locatorType == null) {
            return LocatorType.ID;
        } else {
            return locatorType;
        }
    }

    /**
     * Define el valor de la propiedad locatorType.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatorType }
     *     
     */
    public void setLocatorType(LocatorType value) {
        this.locatorType = value;
    }

    /**
     * Obtiene el valor de la propiedad locatorValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorValue() {
        return locatorValue;
    }

    /**
     * Define el valor de la propiedad locatorValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatorValue(String value) {
        this.locatorValue = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalParameter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalParameter() {
        return additionalParameter;
    }

    /**
     * Define el valor de la propiedad additionalParameter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalParameter(String value) {
        this.additionalParameter = value;
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
            SeleneseCommand theActionType;
            theActionType = this.getActionType();
            strategy.appendField(locator, this, "actionType", buffer, theActionType);
        }
        {
            LocatorType theLocatorType;
            theLocatorType = this.getLocatorType();
            strategy.appendField(locator, this, "locatorType", buffer, theLocatorType);
        }
        {
            String theLocatorValue;
            theLocatorValue = this.getLocatorValue();
            strategy.appendField(locator, this, "locatorValue", buffer, theLocatorValue);
        }
        {
            String theAdditionalParameter;
            theAdditionalParameter = this.getAdditionalParameter();
            strategy.appendField(locator, this, "additionalParameter", buffer, theAdditionalParameter);
        }
        {
            boolean theErrorStep;
            theErrorStep = ((this.errorStep!= null)?this.isErrorStep():false);
            strategy.appendField(locator, this, "errorStep", buffer, theErrorStep);
        }
        return buffer;
    }

}
