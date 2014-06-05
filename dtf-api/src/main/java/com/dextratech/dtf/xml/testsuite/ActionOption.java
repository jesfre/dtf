//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.05 a las 01:44:46 AM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Clase Java para actionOption complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actionOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="field" type="{http://www.dextratech.com/testsuite}field" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="action" type="{http://www.dextratech.com/testsuite}action" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="assert" type="{http://www.dextratech.com/testsuite}assertion" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="custom" type="{http://www.dextratech.com/testsuite}genericCommand" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="include" type="{http://www.dextratech.com/testsuite}include" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="onload" type="{http://www.dextratech.com/testsuite}onload" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="captureScreenshot" type="{http://www.dextratech.com/testsuite}captureScreenshot" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionOption", propOrder = {
    "fieldOrActionOrAssert"
})
@XmlSeeAlso({
    Component.class,
    Testcase.class
})
public class ActionOption
    implements ToString
{

    @XmlElements({
        @XmlElement(name = "field", type = Field.class),
        @XmlElement(name = "action", type = Action.class),
        @XmlElement(name = "assert", type = Assertion.class),
        @XmlElement(name = "custom", type = GenericCommand.class),
        @XmlElement(name = "include", type = Include.class),
        @XmlElement(name = "onload", type = Onload.class),
        @XmlElement(name = "captureScreenshot", type = CaptureScreenshot.class)
    })
    protected List<Object> fieldOrActionOrAssert;

    /**
     * Gets the value of the fieldOrActionOrAssert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldOrActionOrAssert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldOrActionOrAssert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * {@link Action }
     * {@link Assertion }
     * {@link GenericCommand }
     * {@link Include }
     * {@link Onload }
     * {@link CaptureScreenshot }
     * 
     * 
     */
    public List<Object> getFieldOrActionOrAssert() {
        if (fieldOrActionOrAssert == null) {
            fieldOrActionOrAssert = new ArrayList<Object>();
        }
        return this.fieldOrActionOrAssert;
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
            List<Object> theFieldOrActionOrAssert;
            theFieldOrActionOrAssert = (((this.fieldOrActionOrAssert!= null)&&(!this.fieldOrActionOrAssert.isEmpty()))?this.getFieldOrActionOrAssert():null);
            strategy.appendField(locator, this, "fieldOrActionOrAssert", buffer, theFieldOrActionOrAssert);
        }
        return buffer;
    }

}
