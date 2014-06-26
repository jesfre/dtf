//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.26 a las 03:45:57 AM CDT 
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
 * <p>Clase Java para Field complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Field">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="validValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="validValueDef" type="{http://www.dextratech.com/testsuite}validFieldValue"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="validate" type="{http://www.dextratech.com/testsuite}validation" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="validateFunction" type="{http://www.dextratech.com/testsuite}ValidationFunction" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="validateFunctionRef" type="{http://www.dextratech.com/testsuite}validationFunctionRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.dextratech.com/testsuite}elementName" />
 *       &lt;attribute name="locator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorStep" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field", propOrder = {
    "validValue",
    "validValueDef",
    "validateOrValidateFunctionOrValidateFunctionRef"
})
public class Field implements ToString
{

    protected String validValue;
    protected ValidFieldValue validValueDef;
    @XmlElements({
        @XmlElement(name = "validate", type = Validation.class),
        @XmlElement(name = "validateFunction", type = ValidationFunction.class),
        @XmlElement(name = "validateFunctionRef", type = ValidationFunctionRef.class)
    })
    protected List<Object> validateOrValidateFunctionOrValidateFunctionRef;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "locator")
    protected String locator;
    @XmlAttribute(name = "errorStep")
    protected Boolean errorStep;

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
     * Obtiene el valor de la propiedad locator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocator() {
        return locator;
    }

    /**
     * Define el valor de la propiedad locator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocator(String value) {
        this.locator = value;
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
            String theValidValue;
            theValidValue = this.getValidValue();
            strategy.appendField(locator, this, "validValue", buffer, theValidValue);
        }
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
            String theLocator;
            theLocator = this.getLocator();
            strategy.appendField(locator, this, "locator", buffer, theLocator);
        }
        {
            boolean theErrorStep;
            theErrorStep = ((this.errorStep!= null)?this.isErrorStep():false);
            strategy.appendField(locator, this, "errorStep", buffer, theErrorStep);
        }
        return buffer;
    }

}
