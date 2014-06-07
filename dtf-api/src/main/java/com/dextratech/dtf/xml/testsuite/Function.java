//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.06 a las 11:39:07 PM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Prepare validation functions to use in the <validate> tag of the field elements in a test case.
 * 
 * <p>Clase Java para function complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="function">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *           &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="dateFormat" type="{http://www.dextratech.com/testsuite}dateFormat"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="customDateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attribute name="type" use="required" type="{http://www.dextratech.com/testsuite}functionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "function", propOrder = {
    "pattern",
    "length",
    "value",
    "minValue",
    "maxValue",
    "dateFormat",
    "customDateFormat"
})
@XmlSeeAlso({
    ValidationFunction.class
})
public class Function implements ToString
{

    protected String pattern;
    protected Integer length;
    protected String value;
    protected Double minValue;
    protected Double maxValue;
    @XmlElement(defaultValue = "dd/MM/yyyy")
    protected String dateFormat;
    protected String customDateFormat;
    @XmlAttribute(name = "type", required = true)
    protected FunctionType type;

    /**
     * Obtiene el valor de la propiedad pattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Define el valor de la propiedad pattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Obtiene el valor de la propiedad length.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Define el valor de la propiedad length.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad minValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinValue() {
        return minValue;
    }

    /**
     * Define el valor de la propiedad minValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinValue(Double value) {
        this.minValue = value;
    }

    /**
     * Obtiene el valor de la propiedad maxValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * Define el valor de la propiedad maxValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxValue(Double value) {
        this.maxValue = value;
    }

    /**
     * Obtiene el valor de la propiedad dateFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Define el valor de la propiedad dateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad customDateFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomDateFormat() {
        return customDateFormat;
    }

    /**
     * Define el valor de la propiedad customDateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomDateFormat(String value) {
        this.customDateFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link FunctionType }
     *     
     */
    public FunctionType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionType }
     *     
     */
    public void setType(FunctionType value) {
        this.type = value;
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
            String thePattern;
            thePattern = this.getPattern();
            strategy.appendField(locator, this, "pattern", buffer, thePattern);
        }
        {
            Integer theLength;
            theLength = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theLength);
        }
        {
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            Double theMinValue;
            theMinValue = this.getMinValue();
            strategy.appendField(locator, this, "minValue", buffer, theMinValue);
        }
        {
            Double theMaxValue;
            theMaxValue = this.getMaxValue();
            strategy.appendField(locator, this, "maxValue", buffer, theMaxValue);
        }
        {
            String theDateFormat;
            theDateFormat = this.getDateFormat();
            strategy.appendField(locator, this, "dateFormat", buffer, theDateFormat);
        }
        {
            String theCustomDateFormat;
            theCustomDateFormat = this.getCustomDateFormat();
            strategy.appendField(locator, this, "customDateFormat", buffer, theCustomDateFormat);
        }
        {
            FunctionType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        return buffer;
    }

}
