//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.26 a las 03:45:57 AM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AssertionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AssertionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="assert"/>
 *     &lt;enumeration value="verify"/>
 *     &lt;enumeration value="waitFor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssertionType")
@XmlEnum
public enum AssertionType {

    @XmlEnumValue("assert")
    ASSERT("assert"),
    @XmlEnumValue("verify")
    VERIFY("verify"),
    @XmlEnumValue("waitFor")
    WAIT_FOR("waitFor");
    private final String value;

    AssertionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssertionType fromValue(String v) {
        for (AssertionType c: AssertionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
