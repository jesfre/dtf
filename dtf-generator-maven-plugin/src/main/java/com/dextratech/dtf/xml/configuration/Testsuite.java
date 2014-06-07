//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.06 a las 11:39:10 PM CDT 
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
 * <p>Clase Java para testsuite complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="testsuite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbSnapshot" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dbRestore" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="run" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testsuite")
public class Testsuite
    implements ToString
{

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "fileName")
    protected String fileName;
    @XmlAttribute(name = "dbSnapshot")
    protected Boolean dbSnapshot;
    @XmlAttribute(name = "dbRestore")
    protected Boolean dbRestore;
    @XmlAttribute(name = "run")
    protected Boolean run;

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
     * Obtiene el valor de la propiedad fileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Define el valor de la propiedad fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Obtiene el valor de la propiedad dbSnapshot.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbSnapshot() {
        return dbSnapshot;
    }

    /**
     * Define el valor de la propiedad dbSnapshot.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDbSnapshot(Boolean value) {
        this.dbSnapshot = value;
    }

    /**
     * Obtiene el valor de la propiedad dbRestore.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbRestore() {
        return dbRestore;
    }

    /**
     * Define el valor de la propiedad dbRestore.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDbRestore(Boolean value) {
        this.dbRestore = value;
    }

    /**
     * Obtiene el valor de la propiedad run.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRun() {
        return run;
    }

    /**
     * Define el valor de la propiedad run.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRun(Boolean value) {
        this.run = value;
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
            String theFileName;
            theFileName = this.getFileName();
            strategy.appendField(locator, this, "fileName", buffer, theFileName);
        }
        {
            Boolean theDbSnapshot;
            theDbSnapshot = this.isDbSnapshot();
            strategy.appendField(locator, this, "dbSnapshot", buffer, theDbSnapshot);
        }
        {
            Boolean theDbRestore;
            theDbRestore = this.isDbRestore();
            strategy.appendField(locator, this, "dbRestore", buffer, theDbRestore);
        }
        {
            Boolean theRun;
            theRun = this.isRun();
            strategy.appendField(locator, this, "run", buffer, theRun);
        }
        return buffer;
    }

}
