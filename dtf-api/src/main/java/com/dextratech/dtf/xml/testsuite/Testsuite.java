//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.17 a las 10:41:31 PM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.dextratech.com/testsuite}elementName"/>
 *         &lt;element name="testcase" type="{http://www.dextratech.com/testsuite}testcase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="component" type="{http://www.dextratech.com/testsuite}component" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="validationRules" type="{http://www.dextratech.com/testsuite}validationRules" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testsuite", propOrder = {
    "name",
    "testcase",
    "component",
    "validationRules"
})
public class Testsuite
    implements ToString
{

    @XmlElement(required = true)
    protected String name;
    protected List<Testcase> testcase;
    protected List<Component> component;
    protected ValidationRules validationRules;

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
     * Gets the value of the testcase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testcase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestcase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Testcase }
     * 
     * 
     */
    public List<Testcase> getTestcase() {
        if (testcase == null) {
            testcase = new ArrayList<Testcase>();
        }
        return this.testcase;
    }

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Component }
     * 
     * 
     */
    public List<Component> getComponent() {
        if (component == null) {
            component = new ArrayList<Component>();
        }
        return this.component;
    }

    /**
     * Obtiene el valor de la propiedad validationRules.
     * 
     * @return
     *     possible object is
     *     {@link ValidationRules }
     *     
     */
    public ValidationRules getValidationRules() {
        return validationRules;
    }

    /**
     * Define el valor de la propiedad validationRules.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationRules }
     *     
     */
    public void setValidationRules(ValidationRules value) {
        this.validationRules = value;
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
            List<Testcase> theTestcase;
            theTestcase = (((this.testcase!= null)&&(!this.testcase.isEmpty()))?this.getTestcase():null);
            strategy.appendField(locator, this, "testcase", buffer, theTestcase);
        }
        {
            List<Component> theComponent;
            theComponent = (((this.component!= null)&&(!this.component.isEmpty()))?this.getComponent():null);
            strategy.appendField(locator, this, "component", buffer, theComponent);
        }
        {
            ValidationRules theValidationRules;
            theValidationRules = this.getValidationRules();
            strategy.appendField(locator, this, "validationRules", buffer, theValidationRules);
        }
        return buffer;
    }

}
