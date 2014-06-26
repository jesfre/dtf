//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.26 a las 03:46:01 AM CDT 
//


package com.dextratech.dtf.xml.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Clase Java para browser complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="browser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="*firefox"/>
 *             &lt;enumeration value="*firefoxproxy"/>
 *             &lt;enumeration value="*chrome"/>
 *             &lt;enumeration value="*googlechrome"/>
 *             &lt;enumeration value="*iexplore"/>
 *             &lt;enumeration value="*iexploreproxy"/>
 *             &lt;enumeration value="*safari"/>
 *             &lt;enumeration value="*safariproxy"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="executablePath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maximized" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "browser")
public class Browser
    implements ToString
{

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "executablePath")
    protected String executablePath;
    @XmlAttribute(name = "maximized")
    protected Boolean maximized;

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
     * Obtiene el valor de la propiedad executablePath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutablePath() {
        return executablePath;
    }

    /**
     * Define el valor de la propiedad executablePath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutablePath(String value) {
        this.executablePath = value;
    }

    /**
     * Obtiene el valor de la propiedad maximized.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximized() {
        return maximized;
    }

    /**
     * Define el valor de la propiedad maximized.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximized(Boolean value) {
        this.maximized = value;
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theExecutablePath;
            theExecutablePath = this.getExecutablePath();
            strategy.appendField(locator, this, "executablePath", buffer, theExecutablePath);
        }
        {
            Boolean theMaximized;
            theMaximized = this.isMaximized();
            strategy.appendField(locator, this, "maximized", buffer, theMaximized);
        }
        return buffer;
    }

}
