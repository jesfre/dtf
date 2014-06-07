//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.06 a las 11:39:07 PM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Clase Java para field complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="field">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validValueDef" type="{http://www.dextratech.com/testsuite}validFieldValue" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="validate" type="{http://www.dextratech.com/testsuite}validation" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="validateFunction" type="{http://www.dextratech.com/testsuite}validationFunction" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="validateFunctionRef" type="{http://www.dextratech.com/testsuite}validationFunctionRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.dextratech.com/testsuite}elementName" />
 *       &lt;attribute name="locatorType" type="{http://www.dextratech.com/testsuite}locatorType" default="id" />
 *       &lt;attribute name="locatorValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="validValue">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="errorStep" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "field", propOrder = {
    "validValueDef",
    "validateOrValidateFunctionOrValidateFunctionRef"
})
public class Field implements ToString
{

    protected ValidFieldValue validValueDef;
    @XmlElements({
        @XmlElement(name = "validate", type = Validation.class),
        @XmlElement(name = "validateFunction", type = ValidationFunction.class),
        @XmlElement(name = "validateFunctionRef", type = ValidationFunctionRef.class)
    })
    protected List<Object> validateOrValidateFunctionOrValidateFunctionRef;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "locatorType")
    protected LocatorType locatorType;
    @XmlAttribute(name = "locatorValue")
    protected String locatorValue;
    @XmlAttribute(name = "validValue")
    protected String validValue;
    @XmlAttribute(name = "errorStep")
    protected Boolean errorStep;

    /**
     * Obtiene el valor de la propiedad validValueDef.
     * 
     * @return
     *     possible object is
     *     {@link ValidFieldValue }
     *     
     */
    public ValidFieldValue getValidValueDef() {
        return validValueDef;
    }

    /**
     * Define el valor de la propiedad validValueDef.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidFieldValue }
     *     
     */
    public void setValidValueDef(ValidFieldValue value) {
        this.validValueDef = value;
    }

    /**
     * Gets the value of the validateOrValidateFunctionOrValidateFunctionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validateOrValidateFunctionOrValidateFunctionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidateOrValidateFunctionOrValidateFunctionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Validation }
     * {@link ValidationFunction }
     * {@link ValidationFunctionRef }
     * 
     * 
     */
    public List<Object> getValidateOrValidateFunctionOrValidateFunctionRef() {
        if (validateOrValidateFunctionOrValidateFunctionRef == null) {
            validateOrValidateFunctionOrValidateFunctionRef = new ArrayList<Object>();
        }
        return this.validateOrValidateFunctionOrValidateFunctionRef;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Obtiene el valor de la propiedad validValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidValue() {
        return validValue;
    }

    /**
     * Define el valor de la propiedad validValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidValue(String value) {
        this.validValue = value;
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
            ValidFieldValue theValidValueDef;
            theValidValueDef = this.getValidValueDef();
            strategy.appendField(locator, this, "validValueDef", buffer, theValidValueDef);
        }
        {
            List<Object> theValidateOrValidateFunctionOrValidateFunctionRef;
            theValidateOrValidateFunctionOrValidateFunctionRef = (((this.validateOrValidateFunctionOrValidateFunctionRef!= null)&&(!this.validateOrValidateFunctionOrValidateFunctionRef.isEmpty()))?this.getValidateOrValidateFunctionOrValidateFunctionRef():null);
            strategy.appendField(locator, this, "validateOrValidateFunctionOrValidateFunctionRef", buffer, theValidateOrValidateFunctionOrValidateFunctionRef);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
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
            String theValidValue;
            theValidValue = this.getValidValue();
            strategy.appendField(locator, this, "validValue", buffer, theValidValue);
        }
        {
            boolean theErrorStep;
            theErrorStep = ((this.errorStep!= null)?this.isErrorStep():false);
            strategy.appendField(locator, this, "errorStep", buffer, theErrorStep);
        }
        return buffer;
    }

}
