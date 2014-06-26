//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.26 a las 12:46:33 AM CDT 
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
 * <p>Clase Java para validationFunction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validationFunction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dextratech.com/testsuite}function">
 *       &lt;attribute name="id" use="required" type="{http://www.dextratech.com/testsuite}elementName" />
 *       &lt;attribute name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="assertId" type="{http://www.dextratech.com/testsuite}elementName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validationFunction")
public class ValidationFunction
    extends Function
    implements ToString
{

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "valid")
    protected Boolean valid;
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
     * Obtiene el valor de la propiedad valid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isValid() {
        if (valid == null) {
            return true;
        } else {
            return valid;
        }
    }

    /**
     * Define el valor de la propiedad valid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValid(Boolean value) {
        this.valid = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            boolean theValid;
            theValid = ((this.valid!= null)?this.isValid():false);
            strategy.appendField(locator, this, "valid", buffer, theValid);
        }
        {
            String theAssertId;
            theAssertId = this.getAssertId();
            strategy.appendField(locator, this, "assertId", buffer, theAssertId);
        }
        return buffer;
    }

}
