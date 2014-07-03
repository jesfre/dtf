//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.07.03 a las 03:33:34 AM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Clase Java para ValidationCombinationsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValidationCombinationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="combine" type="{http://www.dextratech.com/testsuite}ValidationCombination" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="combineDefaults" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="excludeValidValuesCombination" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationCombinationsType", propOrder = {
    "combine"
})
public class ValidationCombinationsType
    implements ToString
{

    @XmlElement(required = true)
    protected List<ValidationCombination> combine;
    @XmlAttribute(name = "combineDefaults")
    protected Boolean combineDefaults;
    @XmlAttribute(name = "excludeValidValuesCombination")
    protected Boolean excludeValidValuesCombination;

    /**
     * Gets the value of the combine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationCombination }
     * 
     * 
     */
    public List<ValidationCombination> getCombine() {
        if (combine == null) {
            combine = new ArrayList<ValidationCombination>();
        }
        return this.combine;
    }

    /**
     * Obtiene el valor de la propiedad combineDefaults.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCombineDefaults() {
        if (combineDefaults == null) {
            return true;
        } else {
            return combineDefaults;
        }
    }

    /**
     * Define el valor de la propiedad combineDefaults.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombineDefaults(Boolean value) {
        this.combineDefaults = value;
    }

    /**
     * Obtiene el valor de la propiedad excludeValidValuesCombination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeValidValuesCombination() {
        if (excludeValidValuesCombination == null) {
            return false;
        } else {
            return excludeValidValuesCombination;
        }
    }

    /**
     * Define el valor de la propiedad excludeValidValuesCombination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeValidValuesCombination(Boolean value) {
        this.excludeValidValuesCombination = value;
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
            List<ValidationCombination> theCombine;
            theCombine = (((this.combine!= null)&&(!this.combine.isEmpty()))?this.getCombine():null);
            strategy.appendField(locator, this, "combine", buffer, theCombine);
        }
        {
            boolean theCombineDefaults;
            theCombineDefaults = ((this.combineDefaults!= null)?this.isCombineDefaults():false);
            strategy.appendField(locator, this, "combineDefaults", buffer, theCombineDefaults);
        }
        {
            boolean theExcludeValidValuesCombination;
            theExcludeValidValuesCombination = ((this.excludeValidValuesCombination!= null)?this.isExcludeValidValuesCombination():false);
            strategy.appendField(locator, this, "excludeValidValuesCombination", buffer, theExcludeValidValuesCombination);
        }
        return buffer;
    }

}
