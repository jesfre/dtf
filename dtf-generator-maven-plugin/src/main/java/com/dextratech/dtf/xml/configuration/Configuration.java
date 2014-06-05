//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.05 a las 01:44:39 AM CDT 
//


package com.dextratech.dtf.xml.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Clase Java para configuration complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="browser">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="*chrome"/>
 *               &lt;enumeration value="*googlechrome"/>
 *               &lt;enumeration value="*firefox"/>
 *               &lt;enumeration value="*firefoxproxy"/>
 *               &lt;enumeration value="*pifirefox"/>
 *               &lt;enumeration value="*firefox3"/>
 *               &lt;enumeration value="*firefox2"/>
 *               &lt;enumeration value="*firefoxchrome"/>
 *               &lt;enumeration value="*iexplore"/>
 *               &lt;enumeration value="*iexploreproxy"/>
 *               &lt;enumeration value="*piiexplore"/>
 *               &lt;enumeration value="*safari"/>
 *               &lt;enumeration value="*safariproxy"/>
 *               &lt;enumeration value="*konqueror"/>
 *               &lt;enumeration value="*opera"/>
 *               &lt;enumeration value="*mock"/>
 *               &lt;enumeration value="*iehta"/>
 *               &lt;enumeration value="*custom"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="browserExecutable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testsuiteList" type="{http://www.dextratech.com/dtf/configuration}testsuiteList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuration", propOrder = {
    "timeout",
    "speed",
    "browser",
    "browserExecutable",
    "appUrl",
    "testsuiteList"
})
public class Configuration
    implements ToString
{

    protected Integer timeout;
    protected Integer speed;
    @XmlElement(required = true)
    protected String browser;
    protected String browserExecutable;
    @XmlElement(required = true)
    protected String appUrl;
    @XmlElement(required = true)
    protected TestsuiteList testsuiteList;

    /**
     * Obtiene el valor de la propiedad timeout.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Define el valor de la propiedad timeout.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeout(Integer value) {
        this.timeout = value;
    }

    /**
     * Obtiene el valor de la propiedad speed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * Define el valor de la propiedad speed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeed(Integer value) {
        this.speed = value;
    }

    /**
     * Obtiene el valor de la propiedad browser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * Define el valor de la propiedad browser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowser(String value) {
        this.browser = value;
    }

    /**
     * Obtiene el valor de la propiedad browserExecutable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserExecutable() {
        return browserExecutable;
    }

    /**
     * Define el valor de la propiedad browserExecutable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserExecutable(String value) {
        this.browserExecutable = value;
    }

    /**
     * Obtiene el valor de la propiedad appUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * Define el valor de la propiedad appUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppUrl(String value) {
        this.appUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad testsuiteList.
     * 
     * @return
     *     possible object is
     *     {@link TestsuiteList }
     *     
     */
    public TestsuiteList getTestsuiteList() {
        return testsuiteList;
    }

    /**
     * Define el valor de la propiedad testsuiteList.
     * 
     * @param value
     *     allowed object is
     *     {@link TestsuiteList }
     *     
     */
    public void setTestsuiteList(TestsuiteList value) {
        this.testsuiteList = value;
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
            Integer theTimeout;
            theTimeout = this.getTimeout();
            strategy.appendField(locator, this, "timeout", buffer, theTimeout);
        }
        {
            Integer theSpeed;
            theSpeed = this.getSpeed();
            strategy.appendField(locator, this, "speed", buffer, theSpeed);
        }
        {
            String theBrowser;
            theBrowser = this.getBrowser();
            strategy.appendField(locator, this, "browser", buffer, theBrowser);
        }
        {
            String theBrowserExecutable;
            theBrowserExecutable = this.getBrowserExecutable();
            strategy.appendField(locator, this, "browserExecutable", buffer, theBrowserExecutable);
        }
        {
            String theAppUrl;
            theAppUrl = this.getAppUrl();
            strategy.appendField(locator, this, "appUrl", buffer, theAppUrl);
        }
        {
            TestsuiteList theTestsuiteList;
            theTestsuiteList = this.getTestsuiteList();
            strategy.appendField(locator, this, "testsuiteList", buffer, theTestsuiteList);
        }
        return buffer;
    }

}
