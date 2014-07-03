//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.07.03 a las 03:33:34 AM CDT 
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
 * <p>Clase Java para ValidationCombination complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValidationCombination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="validations" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assertId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationCombination")
public class ValidationCombination
    implements ToString
{

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "validations", required = true)
    protected String validations;
    @XmlAttribute(name = "assertId")
    protected String assertId;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad validations.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidations() {
        return validations;
    }

    /**
     * Define el valor de la propiedad validations.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidations(String value) {
        this.validations = value;
    }

    /**
     * Obtiene el valor de la propiedad assertId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssertId() {
        return assertId;
    }

    /**
     * Define el valor de la propiedad assertId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssertId(String value) {
        this.assertId = value;
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theValidations;
            theValidations = this.getValidations();
            strategy.appendField(locator, this, "validations", buffer, theValidations);
        }
        {
            String theAssertId;
            theAssertId = this.getAssertId();
            strategy.appendField(locator, this, "assertId", buffer, theAssertId);
        }
        return buffer;
    }

}
