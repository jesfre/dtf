//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.23 a las 01:33:20 AM CDT 
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
 * <p>Clase Java para testcase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="testcase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dextratech.com/testsuite}actionOption">
 *       &lt;sequence>
 *         &lt;element name="afterErrorActions" type="{http://www.dextratech.com/testsuite}actionOption" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.dextratech.com/testsuite}elementName" />
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="success" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="run" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="runDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="defaultAssert" type="{http://www.dextratech.com/testsuite}elementName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testcase", propOrder = {
    "afterErrorActions"
})
public class Testcase
    extends ActionOption
    implements ToString
{

    protected ActionOption afterErrorActions;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "success")
    protected Boolean success;
    @XmlAttribute(name = "run")
    protected Boolean run;
    @XmlAttribute(name = "runDefault")
    protected Boolean runDefault;
    @XmlAttribute(name = "defaultAssert")
    protected String defaultAssert;

    /**
     * Obtiene el valor de la propiedad afterErrorActions.
     * 
     * @return
     *     possible object is
     *     {@link ActionOption }
     *     
     */
    public ActionOption getAfterErrorActions() {
        return afterErrorActions;
    }

    /**
     * Define el valor de la propiedad afterErrorActions.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionOption }
     *     
     */
    public void setAfterErrorActions(ActionOption value) {
        this.afterErrorActions = value;
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
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad success.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Define el valor de la propiedad success.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }

    /**
     * Obtiene el valor de la propiedad run.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRun() {
        if (run == null) {
            return true;
        } else {
            return run;
        }
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

    /**
     * Obtiene el valor de la propiedad runDefault.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRunDefault() {
        if (runDefault == null) {
            return true;
        } else {
            return runDefault;
        }
    }

    /**
     * Define el valor de la propiedad runDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunDefault(Boolean value) {
        this.runDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultAssert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAssert() {
        return defaultAssert;
    }

    /**
     * Define el valor de la propiedad defaultAssert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAssert(String value) {
        this.defaultAssert = value;
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
            ActionOption theAfterErrorActions;
            theAfterErrorActions = this.getAfterErrorActions();
            strategy.appendField(locator, this, "afterErrorActions", buffer, theAfterErrorActions);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        {
            Boolean theSuccess;
            theSuccess = this.isSuccess();
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        {
            boolean theRun;
            theRun = ((this.run!= null)?this.isRun():false);
            strategy.appendField(locator, this, "run", buffer, theRun);
        }
        {
            boolean theRunDefault;
            theRunDefault = ((this.runDefault!= null)?this.isRunDefault():false);
            strategy.appendField(locator, this, "runDefault", buffer, theRunDefault);
        }
        {
            String theDefaultAssert;
            theDefaultAssert = this.getDefaultAssert();
            strategy.appendField(locator, this, "defaultAssert", buffer, theDefaultAssert);
        }
        return buffer;
    }

}
