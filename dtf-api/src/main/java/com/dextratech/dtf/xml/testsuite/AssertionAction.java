//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.22 a las 12:48:00 AM CDT 
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
 * 
 * 				An assertion may require one or two parameters,
 * 				depending on the type of the choosen assertion.
 * 			
 * 
 * <p>Clase Java para AssertionAction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AssertionAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="alert" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="alertNotPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alertPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allButtons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="allFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="allLinks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="allWindowIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="allWindowNames" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="allWindowTitles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attribute" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="attributeLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attributeFromAllWindows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="attributeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bodyText" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="checked" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="confirmation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="confirmationNotPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmationPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cookie" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cookieByName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cookieNotPresent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cookiePresent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cursorPosition" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="editable" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="elementHeight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="elementIndex" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="elementNotPresent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="elementPositionLeft" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="elementPositionTop" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="elementPresent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="elementWidth" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="errorOnNext" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="message" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="eval" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="script" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="expression" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="failureOnNext" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="message" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="htmlSource" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="location" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mouseSpeed" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notAlert" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notAllButtons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notAllFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notAllLinks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notAllWindowIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notAllWindowNames" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notAllWindowTitles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notAttribute" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="attributeLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notAttributeFromAllWindows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="attributeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notBodyText" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notChecked" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notConfirmation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notCookie" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notCookieByName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notCursorPosition" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notEditable" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notElementHeight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notElementIndex" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notElementPositionLeft" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notElementPositionTop" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notElementWidth" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notErrorOnNext" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="message" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notEval" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="script" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notExpression" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notFailureOnNext" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="message" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notHtmlSource" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notMouseSpeed" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notOrdered" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="locator2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notPrompt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSelected" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="optionLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSelectedId" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSelectedIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSelectedIndex" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSelectedIndexes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSelectedLabel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSelectedLabels" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSelectedValue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSelectedValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSelectOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSomethingSelected" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notSpeed" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notTable" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="tableCellAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notText" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notTitle" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notValue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notVisible" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notWhetherThisFrameMatchFrameExpression" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="currentFrameString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notWhetherThisWindowMatchWindowExpression" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="currentWindowString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notXpathCount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="xpath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ordered" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="locator2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="prompt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="promptNotPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promptPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selected" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="optionLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectedId" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectedIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectedIndex" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectedIndexes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectedLabel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectedLabels" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectedValue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectedValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="somethingSelected" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="speed" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="table" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="tableCellAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="text" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="textNotPresent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="textPresent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="title" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="value" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="visible" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="whetherThisFrameMatchFrameExpression" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="currentFrameString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="whetherThisWindowMatchWindowExpression" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="currentWindowString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="xpathCount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="xpath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.dextratech.com/testsuite}elementName" />
 *       &lt;attribute name="type" use="required" type="{http://www.dextratech.com/testsuite}AssertionType" />
 *       &lt;attribute name="errorStep" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssertionAction", propOrder = {
    "alert",
    "alertNotPresent",
    "alertPresent",
    "allButtons",
    "allFields",
    "allLinks",
    "allWindowIds",
    "allWindowNames",
    "allWindowTitles",
    "attribute",
    "attributeFromAllWindows",
    "bodyText",
    "checked",
    "confirmation",
    "confirmationNotPresent",
    "confirmationPresent",
    "cookie",
    "cookieByName",
    "cookieNotPresent",
    "cookiePresent",
    "cursorPosition",
    "editable",
    "elementHeight",
    "elementIndex",
    "elementNotPresent",
    "elementPositionLeft",
    "elementPositionTop",
    "elementPresent",
    "elementWidth",
    "errorOnNext",
    "eval",
    "expression",
    "failureOnNext",
    "htmlSource",
    "location",
    "mouseSpeed",
    "notAlert",
    "notAllButtons",
    "notAllFields",
    "notAllLinks",
    "notAllWindowIds",
    "notAllWindowNames",
    "notAllWindowTitles",
    "notAttribute",
    "notAttributeFromAllWindows",
    "notBodyText",
    "notChecked",
    "notConfirmation",
    "notCookie",
    "notCookieByName",
    "notCursorPosition",
    "notEditable",
    "notElementHeight",
    "notElementIndex",
    "notElementPositionLeft",
    "notElementPositionTop",
    "notElementWidth",
    "notErrorOnNext",
    "notEval",
    "notExpression",
    "notFailureOnNext",
    "notHtmlSource",
    "notLocation",
    "notMouseSpeed",
    "notOrdered",
    "notPrompt",
    "notSelected",
    "notSelectedId",
    "notSelectedIds",
    "notSelectedIndex",
    "notSelectedIndexes",
    "notSelectedLabel",
    "notSelectedLabels",
    "notSelectedValue",
    "notSelectedValues",
    "notSelectOptions",
    "notSomethingSelected",
    "notSpeed",
    "notTable",
    "notText",
    "notTitle",
    "notValue",
    "notVisible",
    "notWhetherThisFrameMatchFrameExpression",
    "notWhetherThisWindowMatchWindowExpression",
    "notXpathCount",
    "ordered",
    "prompt",
    "promptNotPresent",
    "promptPresent",
    "selected",
    "selectedId",
    "selectedIds",
    "selectedIndex",
    "selectedIndexes",
    "selectedLabel",
    "selectedLabels",
    "selectedValue",
    "selectedValues",
    "selectOptions",
    "somethingSelected",
    "speed",
    "table",
    "text",
    "textNotPresent",
    "textPresent",
    "title",
    "value",
    "visible",
    "whetherThisFrameMatchFrameExpression",
    "whetherThisWindowMatchWindowExpression",
    "xpathCount"
})
public class AssertionAction implements ToString
{

    protected AssertionAction.Alert alert;
    protected String alertNotPresent;
    protected String alertPresent;
    protected AssertionAction.AllButtons allButtons;
    protected AssertionAction.AllFields allFields;
    protected AssertionAction.AllLinks allLinks;
    protected AssertionAction.AllWindowIds allWindowIds;
    protected AssertionAction.AllWindowNames allWindowNames;
    protected AssertionAction.AllWindowTitles allWindowTitles;
    protected AssertionAction.Attribute attribute;
    protected AssertionAction.AttributeFromAllWindows attributeFromAllWindows;
    protected AssertionAction.BodyText bodyText;
    protected AssertionAction.Checked checked;
    protected AssertionAction.Confirmation confirmation;
    protected String confirmationNotPresent;
    protected String confirmationPresent;
    protected AssertionAction.Cookie cookie;
    protected AssertionAction.CookieByName cookieByName;
    protected AssertionAction.CookieNotPresent cookieNotPresent;
    protected AssertionAction.CookiePresent cookiePresent;
    protected AssertionAction.CursorPosition cursorPosition;
    protected AssertionAction.Editable editable;
    protected AssertionAction.ElementHeight elementHeight;
    protected AssertionAction.ElementIndex elementIndex;
    protected AssertionAction.ElementNotPresent elementNotPresent;
    protected AssertionAction.ElementPositionLeft elementPositionLeft;
    protected AssertionAction.ElementPositionTop elementPositionTop;
    protected AssertionAction.ElementPresent elementPresent;
    protected AssertionAction.ElementWidth elementWidth;
    protected AssertionAction.ErrorOnNext errorOnNext;
    protected AssertionAction.Eval eval;
    protected AssertionAction.Expression expression;
    protected AssertionAction.FailureOnNext failureOnNext;
    protected AssertionAction.HtmlSource htmlSource;
    protected AssertionAction.Location location;
    protected AssertionAction.MouseSpeed mouseSpeed;
    protected AssertionAction.NotAlert notAlert;
    protected AssertionAction.NotAllButtons notAllButtons;
    protected AssertionAction.NotAllFields notAllFields;
    protected AssertionAction.NotAllLinks notAllLinks;
    protected AssertionAction.NotAllWindowIds notAllWindowIds;
    protected AssertionAction.NotAllWindowNames notAllWindowNames;
    protected AssertionAction.NotAllWindowTitles notAllWindowTitles;
    protected AssertionAction.NotAttribute notAttribute;
    protected AssertionAction.NotAttributeFromAllWindows notAttributeFromAllWindows;
    protected AssertionAction.NotBodyText notBodyText;
    protected AssertionAction.NotChecked notChecked;
    protected AssertionAction.NotConfirmation notConfirmation;
    protected AssertionAction.NotCookie notCookie;
    protected AssertionAction.NotCookieByName notCookieByName;
    protected AssertionAction.NotCursorPosition notCursorPosition;
    protected AssertionAction.NotEditable notEditable;
    protected AssertionAction.NotElementHeight notElementHeight;
    protected AssertionAction.NotElementIndex notElementIndex;
    protected AssertionAction.NotElementPositionLeft notElementPositionLeft;
    protected AssertionAction.NotElementPositionTop notElementPositionTop;
    protected AssertionAction.NotElementWidth notElementWidth;
    protected AssertionAction.NotErrorOnNext notErrorOnNext;
    protected AssertionAction.NotEval notEval;
    protected AssertionAction.NotExpression notExpression;
    protected AssertionAction.NotFailureOnNext notFailureOnNext;
    protected AssertionAction.NotHtmlSource notHtmlSource;
    protected AssertionAction.NotLocation notLocation;
    protected AssertionAction.NotMouseSpeed notMouseSpeed;
    protected AssertionAction.NotOrdered notOrdered;
    protected AssertionAction.NotPrompt notPrompt;
    protected AssertionAction.NotSelected notSelected;
    protected AssertionAction.NotSelectedId notSelectedId;
    protected AssertionAction.NotSelectedIds notSelectedIds;
    protected AssertionAction.NotSelectedIndex notSelectedIndex;
    protected AssertionAction.NotSelectedIndexes notSelectedIndexes;
    protected AssertionAction.NotSelectedLabel notSelectedLabel;
    protected AssertionAction.NotSelectedLabels notSelectedLabels;
    protected AssertionAction.NotSelectedValue notSelectedValue;
    protected AssertionAction.NotSelectedValues notSelectedValues;
    protected AssertionAction.NotSelectOptions notSelectOptions;
    protected AssertionAction.NotSomethingSelected notSomethingSelected;
    protected AssertionAction.NotSpeed notSpeed;
    protected AssertionAction.NotTable notTable;
    protected AssertionAction.NotText notText;
    protected AssertionAction.NotTitle notTitle;
    protected AssertionAction.NotValue notValue;
    protected AssertionAction.NotVisible notVisible;
    protected AssertionAction.NotWhetherThisFrameMatchFrameExpression notWhetherThisFrameMatchFrameExpression;
    protected AssertionAction.NotWhetherThisWindowMatchWindowExpression notWhetherThisWindowMatchWindowExpression;
    protected AssertionAction.NotXpathCount notXpathCount;
    protected AssertionAction.Ordered ordered;
    protected AssertionAction.Prompt prompt;
    protected String promptNotPresent;
    protected String promptPresent;
    protected AssertionAction.Selected selected;
    protected AssertionAction.SelectedId selectedId;
    protected AssertionAction.SelectedIds selectedIds;
    protected AssertionAction.SelectedIndex selectedIndex;
    protected AssertionAction.SelectedIndexes selectedIndexes;
    protected AssertionAction.SelectedLabel selectedLabel;
    protected AssertionAction.SelectedLabels selectedLabels;
    protected AssertionAction.SelectedValue selectedValue;
    protected AssertionAction.SelectedValues selectedValues;
    protected AssertionAction.SelectOptions selectOptions;
    protected AssertionAction.SomethingSelected somethingSelected;
    protected AssertionAction.Speed speed;
    protected AssertionAction.Table table;
    protected AssertionAction.Text text;
    protected AssertionAction.TextNotPresent textNotPresent;
    protected AssertionAction.TextPresent textPresent;
    protected AssertionAction.Title title;
    protected AssertionAction.Value value;
    protected AssertionAction.Visible visible;
    protected AssertionAction.WhetherThisFrameMatchFrameExpression whetherThisFrameMatchFrameExpression;
    protected AssertionAction.WhetherThisWindowMatchWindowExpression whetherThisWindowMatchWindowExpression;
    protected AssertionAction.XpathCount xpathCount;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "type", required = true)
    protected AssertionType type;
    @XmlAttribute(name = "errorStep")
    protected Boolean errorStep;

    /**
     * Obtiene el valor de la propiedad alert.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Alert }
     *     
     */
    public AssertionAction.Alert getAlert() {
        return alert;
    }

    /**
     * Define el valor de la propiedad alert.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Alert }
     *     
     */
    public void setAlert(AssertionAction.Alert value) {
        this.alert = value;
    }

    /**
     * Obtiene el valor de la propiedad alertNotPresent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertNotPresent() {
        return alertNotPresent;
    }

    /**
     * Define el valor de la propiedad alertNotPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertNotPresent(String value) {
        this.alertNotPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad alertPresent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertPresent() {
        return alertPresent;
    }

    /**
     * Define el valor de la propiedad alertPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertPresent(String value) {
        this.alertPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad allButtons.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.AllButtons }
     *     
     */
    public AssertionAction.AllButtons getAllButtons() {
        return allButtons;
    }

    /**
     * Define el valor de la propiedad allButtons.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.AllButtons }
     *     
     */
    public void setAllButtons(AssertionAction.AllButtons value) {
        this.allButtons = value;
    }

    /**
     * Obtiene el valor de la propiedad allFields.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.AllFields }
     *     
     */
    public AssertionAction.AllFields getAllFields() {
        return allFields;
    }

    /**
     * Define el valor de la propiedad allFields.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.AllFields }
     *     
     */
    public void setAllFields(AssertionAction.AllFields value) {
        this.allFields = value;
    }

    /**
     * Obtiene el valor de la propiedad allLinks.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.AllLinks }
     *     
     */
    public AssertionAction.AllLinks getAllLinks() {
        return allLinks;
    }

    /**
     * Define el valor de la propiedad allLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.AllLinks }
     *     
     */
    public void setAllLinks(AssertionAction.AllLinks value) {
        this.allLinks = value;
    }

    /**
     * Obtiene el valor de la propiedad allWindowIds.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.AllWindowIds }
     *     
     */
    public AssertionAction.AllWindowIds getAllWindowIds() {
        return allWindowIds;
    }

    /**
     * Define el valor de la propiedad allWindowIds.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.AllWindowIds }
     *     
     */
    public void setAllWindowIds(AssertionAction.AllWindowIds value) {
        this.allWindowIds = value;
    }

    /**
     * Obtiene el valor de la propiedad allWindowNames.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.AllWindowNames }
     *     
     */
    public AssertionAction.AllWindowNames getAllWindowNames() {
        return allWindowNames;
    }

    /**
     * Define el valor de la propiedad allWindowNames.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.AllWindowNames }
     *     
     */
    public void setAllWindowNames(AssertionAction.AllWindowNames value) {
        this.allWindowNames = value;
    }

    /**
     * Obtiene el valor de la propiedad allWindowTitles.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.AllWindowTitles }
     *     
     */
    public AssertionAction.AllWindowTitles getAllWindowTitles() {
        return allWindowTitles;
    }

    /**
     * Define el valor de la propiedad allWindowTitles.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.AllWindowTitles }
     *     
     */
    public void setAllWindowTitles(AssertionAction.AllWindowTitles value) {
        this.allWindowTitles = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Attribute }
     *     
     */
    public AssertionAction.Attribute getAttribute() {
        return attribute;
    }

    /**
     * Define el valor de la propiedad attribute.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Attribute }
     *     
     */
    public void setAttribute(AssertionAction.Attribute value) {
        this.attribute = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeFromAllWindows.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.AttributeFromAllWindows }
     *     
     */
    public AssertionAction.AttributeFromAllWindows getAttributeFromAllWindows() {
        return attributeFromAllWindows;
    }

    /**
     * Define el valor de la propiedad attributeFromAllWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.AttributeFromAllWindows }
     *     
     */
    public void setAttributeFromAllWindows(AssertionAction.AttributeFromAllWindows value) {
        this.attributeFromAllWindows = value;
    }

    /**
     * Obtiene el valor de la propiedad bodyText.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.BodyText }
     *     
     */
    public AssertionAction.BodyText getBodyText() {
        return bodyText;
    }

    /**
     * Define el valor de la propiedad bodyText.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.BodyText }
     *     
     */
    public void setBodyText(AssertionAction.BodyText value) {
        this.bodyText = value;
    }

    /**
     * Obtiene el valor de la propiedad checked.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Checked }
     *     
     */
    public AssertionAction.Checked getChecked() {
        return checked;
    }

    /**
     * Define el valor de la propiedad checked.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Checked }
     *     
     */
    public void setChecked(AssertionAction.Checked value) {
        this.checked = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmation.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Confirmation }
     *     
     */
    public AssertionAction.Confirmation getConfirmation() {
        return confirmation;
    }

    /**
     * Define el valor de la propiedad confirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Confirmation }
     *     
     */
    public void setConfirmation(AssertionAction.Confirmation value) {
        this.confirmation = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmationNotPresent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNotPresent() {
        return confirmationNotPresent;
    }

    /**
     * Define el valor de la propiedad confirmationNotPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNotPresent(String value) {
        this.confirmationNotPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmationPresent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationPresent() {
        return confirmationPresent;
    }

    /**
     * Define el valor de la propiedad confirmationPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationPresent(String value) {
        this.confirmationPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad cookie.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Cookie }
     *     
     */
    public AssertionAction.Cookie getCookie() {
        return cookie;
    }

    /**
     * Define el valor de la propiedad cookie.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Cookie }
     *     
     */
    public void setCookie(AssertionAction.Cookie value) {
        this.cookie = value;
    }

    /**
     * Obtiene el valor de la propiedad cookieByName.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.CookieByName }
     *     
     */
    public AssertionAction.CookieByName getCookieByName() {
        return cookieByName;
    }

    /**
     * Define el valor de la propiedad cookieByName.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.CookieByName }
     *     
     */
    public void setCookieByName(AssertionAction.CookieByName value) {
        this.cookieByName = value;
    }

    /**
     * Obtiene el valor de la propiedad cookieNotPresent.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.CookieNotPresent }
     *     
     */
    public AssertionAction.CookieNotPresent getCookieNotPresent() {
        return cookieNotPresent;
    }

    /**
     * Define el valor de la propiedad cookieNotPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.CookieNotPresent }
     *     
     */
    public void setCookieNotPresent(AssertionAction.CookieNotPresent value) {
        this.cookieNotPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad cookiePresent.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.CookiePresent }
     *     
     */
    public AssertionAction.CookiePresent getCookiePresent() {
        return cookiePresent;
    }

    /**
     * Define el valor de la propiedad cookiePresent.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.CookiePresent }
     *     
     */
    public void setCookiePresent(AssertionAction.CookiePresent value) {
        this.cookiePresent = value;
    }

    /**
     * Obtiene el valor de la propiedad cursorPosition.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.CursorPosition }
     *     
     */
    public AssertionAction.CursorPosition getCursorPosition() {
        return cursorPosition;
    }

    /**
     * Define el valor de la propiedad cursorPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.CursorPosition }
     *     
     */
    public void setCursorPosition(AssertionAction.CursorPosition value) {
        this.cursorPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad editable.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Editable }
     *     
     */
    public AssertionAction.Editable getEditable() {
        return editable;
    }

    /**
     * Define el valor de la propiedad editable.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Editable }
     *     
     */
    public void setEditable(AssertionAction.Editable value) {
        this.editable = value;
    }

    /**
     * Obtiene el valor de la propiedad elementHeight.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.ElementHeight }
     *     
     */
    public AssertionAction.ElementHeight getElementHeight() {
        return elementHeight;
    }

    /**
     * Define el valor de la propiedad elementHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.ElementHeight }
     *     
     */
    public void setElementHeight(AssertionAction.ElementHeight value) {
        this.elementHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad elementIndex.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.ElementIndex }
     *     
     */
    public AssertionAction.ElementIndex getElementIndex() {
        return elementIndex;
    }

    /**
     * Define el valor de la propiedad elementIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.ElementIndex }
     *     
     */
    public void setElementIndex(AssertionAction.ElementIndex value) {
        this.elementIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad elementNotPresent.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.ElementNotPresent }
     *     
     */
    public AssertionAction.ElementNotPresent getElementNotPresent() {
        return elementNotPresent;
    }

    /**
     * Define el valor de la propiedad elementNotPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.ElementNotPresent }
     *     
     */
    public void setElementNotPresent(AssertionAction.ElementNotPresent value) {
        this.elementNotPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad elementPositionLeft.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.ElementPositionLeft }
     *     
     */
    public AssertionAction.ElementPositionLeft getElementPositionLeft() {
        return elementPositionLeft;
    }

    /**
     * Define el valor de la propiedad elementPositionLeft.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.ElementPositionLeft }
     *     
     */
    public void setElementPositionLeft(AssertionAction.ElementPositionLeft value) {
        this.elementPositionLeft = value;
    }

    /**
     * Obtiene el valor de la propiedad elementPositionTop.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.ElementPositionTop }
     *     
     */
    public AssertionAction.ElementPositionTop getElementPositionTop() {
        return elementPositionTop;
    }

    /**
     * Define el valor de la propiedad elementPositionTop.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.ElementPositionTop }
     *     
     */
    public void setElementPositionTop(AssertionAction.ElementPositionTop value) {
        this.elementPositionTop = value;
    }

    /**
     * Obtiene el valor de la propiedad elementPresent.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.ElementPresent }
     *     
     */
    public AssertionAction.ElementPresent getElementPresent() {
        return elementPresent;
    }

    /**
     * Define el valor de la propiedad elementPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.ElementPresent }
     *     
     */
    public void setElementPresent(AssertionAction.ElementPresent value) {
        this.elementPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad elementWidth.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.ElementWidth }
     *     
     */
    public AssertionAction.ElementWidth getElementWidth() {
        return elementWidth;
    }

    /**
     * Define el valor de la propiedad elementWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.ElementWidth }
     *     
     */
    public void setElementWidth(AssertionAction.ElementWidth value) {
        this.elementWidth = value;
    }

    /**
     * Obtiene el valor de la propiedad errorOnNext.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.ErrorOnNext }
     *     
     */
    public AssertionAction.ErrorOnNext getErrorOnNext() {
        return errorOnNext;
    }

    /**
     * Define el valor de la propiedad errorOnNext.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.ErrorOnNext }
     *     
     */
    public void setErrorOnNext(AssertionAction.ErrorOnNext value) {
        this.errorOnNext = value;
    }

    /**
     * Obtiene el valor de la propiedad eval.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Eval }
     *     
     */
    public AssertionAction.Eval getEval() {
        return eval;
    }

    /**
     * Define el valor de la propiedad eval.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Eval }
     *     
     */
    public void setEval(AssertionAction.Eval value) {
        this.eval = value;
    }

    /**
     * Obtiene el valor de la propiedad expression.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Expression }
     *     
     */
    public AssertionAction.Expression getExpression() {
        return expression;
    }

    /**
     * Define el valor de la propiedad expression.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Expression }
     *     
     */
    public void setExpression(AssertionAction.Expression value) {
        this.expression = value;
    }

    /**
     * Obtiene el valor de la propiedad failureOnNext.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.FailureOnNext }
     *     
     */
    public AssertionAction.FailureOnNext getFailureOnNext() {
        return failureOnNext;
    }

    /**
     * Define el valor de la propiedad failureOnNext.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.FailureOnNext }
     *     
     */
    public void setFailureOnNext(AssertionAction.FailureOnNext value) {
        this.failureOnNext = value;
    }

    /**
     * Obtiene el valor de la propiedad htmlSource.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.HtmlSource }
     *     
     */
    public AssertionAction.HtmlSource getHtmlSource() {
        return htmlSource;
    }

    /**
     * Define el valor de la propiedad htmlSource.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.HtmlSource }
     *     
     */
    public void setHtmlSource(AssertionAction.HtmlSource value) {
        this.htmlSource = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Location }
     *     
     */
    public AssertionAction.Location getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Location }
     *     
     */
    public void setLocation(AssertionAction.Location value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad mouseSpeed.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.MouseSpeed }
     *     
     */
    public AssertionAction.MouseSpeed getMouseSpeed() {
        return mouseSpeed;
    }

    /**
     * Define el valor de la propiedad mouseSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.MouseSpeed }
     *     
     */
    public void setMouseSpeed(AssertionAction.MouseSpeed value) {
        this.mouseSpeed = value;
    }

    /**
     * Obtiene el valor de la propiedad notAlert.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotAlert }
     *     
     */
    public AssertionAction.NotAlert getNotAlert() {
        return notAlert;
    }

    /**
     * Define el valor de la propiedad notAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotAlert }
     *     
     */
    public void setNotAlert(AssertionAction.NotAlert value) {
        this.notAlert = value;
    }

    /**
     * Obtiene el valor de la propiedad notAllButtons.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotAllButtons }
     *     
     */
    public AssertionAction.NotAllButtons getNotAllButtons() {
        return notAllButtons;
    }

    /**
     * Define el valor de la propiedad notAllButtons.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotAllButtons }
     *     
     */
    public void setNotAllButtons(AssertionAction.NotAllButtons value) {
        this.notAllButtons = value;
    }

    /**
     * Obtiene el valor de la propiedad notAllFields.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotAllFields }
     *     
     */
    public AssertionAction.NotAllFields getNotAllFields() {
        return notAllFields;
    }

    /**
     * Define el valor de la propiedad notAllFields.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotAllFields }
     *     
     */
    public void setNotAllFields(AssertionAction.NotAllFields value) {
        this.notAllFields = value;
    }

    /**
     * Obtiene el valor de la propiedad notAllLinks.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotAllLinks }
     *     
     */
    public AssertionAction.NotAllLinks getNotAllLinks() {
        return notAllLinks;
    }

    /**
     * Define el valor de la propiedad notAllLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotAllLinks }
     *     
     */
    public void setNotAllLinks(AssertionAction.NotAllLinks value) {
        this.notAllLinks = value;
    }

    /**
     * Obtiene el valor de la propiedad notAllWindowIds.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotAllWindowIds }
     *     
     */
    public AssertionAction.NotAllWindowIds getNotAllWindowIds() {
        return notAllWindowIds;
    }

    /**
     * Define el valor de la propiedad notAllWindowIds.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotAllWindowIds }
     *     
     */
    public void setNotAllWindowIds(AssertionAction.NotAllWindowIds value) {
        this.notAllWindowIds = value;
    }

    /**
     * Obtiene el valor de la propiedad notAllWindowNames.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotAllWindowNames }
     *     
     */
    public AssertionAction.NotAllWindowNames getNotAllWindowNames() {
        return notAllWindowNames;
    }

    /**
     * Define el valor de la propiedad notAllWindowNames.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotAllWindowNames }
     *     
     */
    public void setNotAllWindowNames(AssertionAction.NotAllWindowNames value) {
        this.notAllWindowNames = value;
    }

    /**
     * Obtiene el valor de la propiedad notAllWindowTitles.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotAllWindowTitles }
     *     
     */
    public AssertionAction.NotAllWindowTitles getNotAllWindowTitles() {
        return notAllWindowTitles;
    }

    /**
     * Define el valor de la propiedad notAllWindowTitles.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotAllWindowTitles }
     *     
     */
    public void setNotAllWindowTitles(AssertionAction.NotAllWindowTitles value) {
        this.notAllWindowTitles = value;
    }

    /**
     * Obtiene el valor de la propiedad notAttribute.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotAttribute }
     *     
     */
    public AssertionAction.NotAttribute getNotAttribute() {
        return notAttribute;
    }

    /**
     * Define el valor de la propiedad notAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotAttribute }
     *     
     */
    public void setNotAttribute(AssertionAction.NotAttribute value) {
        this.notAttribute = value;
    }

    /**
     * Obtiene el valor de la propiedad notAttributeFromAllWindows.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotAttributeFromAllWindows }
     *     
     */
    public AssertionAction.NotAttributeFromAllWindows getNotAttributeFromAllWindows() {
        return notAttributeFromAllWindows;
    }

    /**
     * Define el valor de la propiedad notAttributeFromAllWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotAttributeFromAllWindows }
     *     
     */
    public void setNotAttributeFromAllWindows(AssertionAction.NotAttributeFromAllWindows value) {
        this.notAttributeFromAllWindows = value;
    }

    /**
     * Obtiene el valor de la propiedad notBodyText.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotBodyText }
     *     
     */
    public AssertionAction.NotBodyText getNotBodyText() {
        return notBodyText;
    }

    /**
     * Define el valor de la propiedad notBodyText.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotBodyText }
     *     
     */
    public void setNotBodyText(AssertionAction.NotBodyText value) {
        this.notBodyText = value;
    }

    /**
     * Obtiene el valor de la propiedad notChecked.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotChecked }
     *     
     */
    public AssertionAction.NotChecked getNotChecked() {
        return notChecked;
    }

    /**
     * Define el valor de la propiedad notChecked.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotChecked }
     *     
     */
    public void setNotChecked(AssertionAction.NotChecked value) {
        this.notChecked = value;
    }

    /**
     * Obtiene el valor de la propiedad notConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotConfirmation }
     *     
     */
    public AssertionAction.NotConfirmation getNotConfirmation() {
        return notConfirmation;
    }

    /**
     * Define el valor de la propiedad notConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotConfirmation }
     *     
     */
    public void setNotConfirmation(AssertionAction.NotConfirmation value) {
        this.notConfirmation = value;
    }

    /**
     * Obtiene el valor de la propiedad notCookie.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotCookie }
     *     
     */
    public AssertionAction.NotCookie getNotCookie() {
        return notCookie;
    }

    /**
     * Define el valor de la propiedad notCookie.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotCookie }
     *     
     */
    public void setNotCookie(AssertionAction.NotCookie value) {
        this.notCookie = value;
    }

    /**
     * Obtiene el valor de la propiedad notCookieByName.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotCookieByName }
     *     
     */
    public AssertionAction.NotCookieByName getNotCookieByName() {
        return notCookieByName;
    }

    /**
     * Define el valor de la propiedad notCookieByName.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotCookieByName }
     *     
     */
    public void setNotCookieByName(AssertionAction.NotCookieByName value) {
        this.notCookieByName = value;
    }

    /**
     * Obtiene el valor de la propiedad notCursorPosition.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotCursorPosition }
     *     
     */
    public AssertionAction.NotCursorPosition getNotCursorPosition() {
        return notCursorPosition;
    }

    /**
     * Define el valor de la propiedad notCursorPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotCursorPosition }
     *     
     */
    public void setNotCursorPosition(AssertionAction.NotCursorPosition value) {
        this.notCursorPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad notEditable.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotEditable }
     *     
     */
    public AssertionAction.NotEditable getNotEditable() {
        return notEditable;
    }

    /**
     * Define el valor de la propiedad notEditable.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotEditable }
     *     
     */
    public void setNotEditable(AssertionAction.NotEditable value) {
        this.notEditable = value;
    }

    /**
     * Obtiene el valor de la propiedad notElementHeight.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotElementHeight }
     *     
     */
    public AssertionAction.NotElementHeight getNotElementHeight() {
        return notElementHeight;
    }

    /**
     * Define el valor de la propiedad notElementHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotElementHeight }
     *     
     */
    public void setNotElementHeight(AssertionAction.NotElementHeight value) {
        this.notElementHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad notElementIndex.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotElementIndex }
     *     
     */
    public AssertionAction.NotElementIndex getNotElementIndex() {
        return notElementIndex;
    }

    /**
     * Define el valor de la propiedad notElementIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotElementIndex }
     *     
     */
    public void setNotElementIndex(AssertionAction.NotElementIndex value) {
        this.notElementIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad notElementPositionLeft.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotElementPositionLeft }
     *     
     */
    public AssertionAction.NotElementPositionLeft getNotElementPositionLeft() {
        return notElementPositionLeft;
    }

    /**
     * Define el valor de la propiedad notElementPositionLeft.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotElementPositionLeft }
     *     
     */
    public void setNotElementPositionLeft(AssertionAction.NotElementPositionLeft value) {
        this.notElementPositionLeft = value;
    }

    /**
     * Obtiene el valor de la propiedad notElementPositionTop.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotElementPositionTop }
     *     
     */
    public AssertionAction.NotElementPositionTop getNotElementPositionTop() {
        return notElementPositionTop;
    }

    /**
     * Define el valor de la propiedad notElementPositionTop.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotElementPositionTop }
     *     
     */
    public void setNotElementPositionTop(AssertionAction.NotElementPositionTop value) {
        this.notElementPositionTop = value;
    }

    /**
     * Obtiene el valor de la propiedad notElementWidth.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotElementWidth }
     *     
     */
    public AssertionAction.NotElementWidth getNotElementWidth() {
        return notElementWidth;
    }

    /**
     * Define el valor de la propiedad notElementWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotElementWidth }
     *     
     */
    public void setNotElementWidth(AssertionAction.NotElementWidth value) {
        this.notElementWidth = value;
    }

    /**
     * Obtiene el valor de la propiedad notErrorOnNext.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotErrorOnNext }
     *     
     */
    public AssertionAction.NotErrorOnNext getNotErrorOnNext() {
        return notErrorOnNext;
    }

    /**
     * Define el valor de la propiedad notErrorOnNext.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotErrorOnNext }
     *     
     */
    public void setNotErrorOnNext(AssertionAction.NotErrorOnNext value) {
        this.notErrorOnNext = value;
    }

    /**
     * Obtiene el valor de la propiedad notEval.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotEval }
     *     
     */
    public AssertionAction.NotEval getNotEval() {
        return notEval;
    }

    /**
     * Define el valor de la propiedad notEval.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotEval }
     *     
     */
    public void setNotEval(AssertionAction.NotEval value) {
        this.notEval = value;
    }

    /**
     * Obtiene el valor de la propiedad notExpression.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotExpression }
     *     
     */
    public AssertionAction.NotExpression getNotExpression() {
        return notExpression;
    }

    /**
     * Define el valor de la propiedad notExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotExpression }
     *     
     */
    public void setNotExpression(AssertionAction.NotExpression value) {
        this.notExpression = value;
    }

    /**
     * Obtiene el valor de la propiedad notFailureOnNext.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotFailureOnNext }
     *     
     */
    public AssertionAction.NotFailureOnNext getNotFailureOnNext() {
        return notFailureOnNext;
    }

    /**
     * Define el valor de la propiedad notFailureOnNext.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotFailureOnNext }
     *     
     */
    public void setNotFailureOnNext(AssertionAction.NotFailureOnNext value) {
        this.notFailureOnNext = value;
    }

    /**
     * Obtiene el valor de la propiedad notHtmlSource.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotHtmlSource }
     *     
     */
    public AssertionAction.NotHtmlSource getNotHtmlSource() {
        return notHtmlSource;
    }

    /**
     * Define el valor de la propiedad notHtmlSource.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotHtmlSource }
     *     
     */
    public void setNotHtmlSource(AssertionAction.NotHtmlSource value) {
        this.notHtmlSource = value;
    }

    /**
     * Obtiene el valor de la propiedad notLocation.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotLocation }
     *     
     */
    public AssertionAction.NotLocation getNotLocation() {
        return notLocation;
    }

    /**
     * Define el valor de la propiedad notLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotLocation }
     *     
     */
    public void setNotLocation(AssertionAction.NotLocation value) {
        this.notLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad notMouseSpeed.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotMouseSpeed }
     *     
     */
    public AssertionAction.NotMouseSpeed getNotMouseSpeed() {
        return notMouseSpeed;
    }

    /**
     * Define el valor de la propiedad notMouseSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotMouseSpeed }
     *     
     */
    public void setNotMouseSpeed(AssertionAction.NotMouseSpeed value) {
        this.notMouseSpeed = value;
    }

    /**
     * Obtiene el valor de la propiedad notOrdered.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotOrdered }
     *     
     */
    public AssertionAction.NotOrdered getNotOrdered() {
        return notOrdered;
    }

    /**
     * Define el valor de la propiedad notOrdered.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotOrdered }
     *     
     */
    public void setNotOrdered(AssertionAction.NotOrdered value) {
        this.notOrdered = value;
    }

    /**
     * Obtiene el valor de la propiedad notPrompt.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotPrompt }
     *     
     */
    public AssertionAction.NotPrompt getNotPrompt() {
        return notPrompt;
    }

    /**
     * Define el valor de la propiedad notPrompt.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotPrompt }
     *     
     */
    public void setNotPrompt(AssertionAction.NotPrompt value) {
        this.notPrompt = value;
    }

    /**
     * Obtiene el valor de la propiedad notSelected.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSelected }
     *     
     */
    public AssertionAction.NotSelected getNotSelected() {
        return notSelected;
    }

    /**
     * Define el valor de la propiedad notSelected.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSelected }
     *     
     */
    public void setNotSelected(AssertionAction.NotSelected value) {
        this.notSelected = value;
    }

    /**
     * Obtiene el valor de la propiedad notSelectedId.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSelectedId }
     *     
     */
    public AssertionAction.NotSelectedId getNotSelectedId() {
        return notSelectedId;
    }

    /**
     * Define el valor de la propiedad notSelectedId.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSelectedId }
     *     
     */
    public void setNotSelectedId(AssertionAction.NotSelectedId value) {
        this.notSelectedId = value;
    }

    /**
     * Obtiene el valor de la propiedad notSelectedIds.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSelectedIds }
     *     
     */
    public AssertionAction.NotSelectedIds getNotSelectedIds() {
        return notSelectedIds;
    }

    /**
     * Define el valor de la propiedad notSelectedIds.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSelectedIds }
     *     
     */
    public void setNotSelectedIds(AssertionAction.NotSelectedIds value) {
        this.notSelectedIds = value;
    }

    /**
     * Obtiene el valor de la propiedad notSelectedIndex.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSelectedIndex }
     *     
     */
    public AssertionAction.NotSelectedIndex getNotSelectedIndex() {
        return notSelectedIndex;
    }

    /**
     * Define el valor de la propiedad notSelectedIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSelectedIndex }
     *     
     */
    public void setNotSelectedIndex(AssertionAction.NotSelectedIndex value) {
        this.notSelectedIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad notSelectedIndexes.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSelectedIndexes }
     *     
     */
    public AssertionAction.NotSelectedIndexes getNotSelectedIndexes() {
        return notSelectedIndexes;
    }

    /**
     * Define el valor de la propiedad notSelectedIndexes.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSelectedIndexes }
     *     
     */
    public void setNotSelectedIndexes(AssertionAction.NotSelectedIndexes value) {
        this.notSelectedIndexes = value;
    }

    /**
     * Obtiene el valor de la propiedad notSelectedLabel.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSelectedLabel }
     *     
     */
    public AssertionAction.NotSelectedLabel getNotSelectedLabel() {
        return notSelectedLabel;
    }

    /**
     * Define el valor de la propiedad notSelectedLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSelectedLabel }
     *     
     */
    public void setNotSelectedLabel(AssertionAction.NotSelectedLabel value) {
        this.notSelectedLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad notSelectedLabels.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSelectedLabels }
     *     
     */
    public AssertionAction.NotSelectedLabels getNotSelectedLabels() {
        return notSelectedLabels;
    }

    /**
     * Define el valor de la propiedad notSelectedLabels.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSelectedLabels }
     *     
     */
    public void setNotSelectedLabels(AssertionAction.NotSelectedLabels value) {
        this.notSelectedLabels = value;
    }

    /**
     * Obtiene el valor de la propiedad notSelectedValue.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSelectedValue }
     *     
     */
    public AssertionAction.NotSelectedValue getNotSelectedValue() {
        return notSelectedValue;
    }

    /**
     * Define el valor de la propiedad notSelectedValue.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSelectedValue }
     *     
     */
    public void setNotSelectedValue(AssertionAction.NotSelectedValue value) {
        this.notSelectedValue = value;
    }

    /**
     * Obtiene el valor de la propiedad notSelectedValues.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSelectedValues }
     *     
     */
    public AssertionAction.NotSelectedValues getNotSelectedValues() {
        return notSelectedValues;
    }

    /**
     * Define el valor de la propiedad notSelectedValues.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSelectedValues }
     *     
     */
    public void setNotSelectedValues(AssertionAction.NotSelectedValues value) {
        this.notSelectedValues = value;
    }

    /**
     * Obtiene el valor de la propiedad notSelectOptions.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSelectOptions }
     *     
     */
    public AssertionAction.NotSelectOptions getNotSelectOptions() {
        return notSelectOptions;
    }

    /**
     * Define el valor de la propiedad notSelectOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSelectOptions }
     *     
     */
    public void setNotSelectOptions(AssertionAction.NotSelectOptions value) {
        this.notSelectOptions = value;
    }

    /**
     * Obtiene el valor de la propiedad notSomethingSelected.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSomethingSelected }
     *     
     */
    public AssertionAction.NotSomethingSelected getNotSomethingSelected() {
        return notSomethingSelected;
    }

    /**
     * Define el valor de la propiedad notSomethingSelected.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSomethingSelected }
     *     
     */
    public void setNotSomethingSelected(AssertionAction.NotSomethingSelected value) {
        this.notSomethingSelected = value;
    }

    /**
     * Obtiene el valor de la propiedad notSpeed.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotSpeed }
     *     
     */
    public AssertionAction.NotSpeed getNotSpeed() {
        return notSpeed;
    }

    /**
     * Define el valor de la propiedad notSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotSpeed }
     *     
     */
    public void setNotSpeed(AssertionAction.NotSpeed value) {
        this.notSpeed = value;
    }

    /**
     * Obtiene el valor de la propiedad notTable.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotTable }
     *     
     */
    public AssertionAction.NotTable getNotTable() {
        return notTable;
    }

    /**
     * Define el valor de la propiedad notTable.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotTable }
     *     
     */
    public void setNotTable(AssertionAction.NotTable value) {
        this.notTable = value;
    }

    /**
     * Obtiene el valor de la propiedad notText.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotText }
     *     
     */
    public AssertionAction.NotText getNotText() {
        return notText;
    }

    /**
     * Define el valor de la propiedad notText.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotText }
     *     
     */
    public void setNotText(AssertionAction.NotText value) {
        this.notText = value;
    }

    /**
     * Obtiene el valor de la propiedad notTitle.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotTitle }
     *     
     */
    public AssertionAction.NotTitle getNotTitle() {
        return notTitle;
    }

    /**
     * Define el valor de la propiedad notTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotTitle }
     *     
     */
    public void setNotTitle(AssertionAction.NotTitle value) {
        this.notTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad notValue.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotValue }
     *     
     */
    public AssertionAction.NotValue getNotValue() {
        return notValue;
    }

    /**
     * Define el valor de la propiedad notValue.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotValue }
     *     
     */
    public void setNotValue(AssertionAction.NotValue value) {
        this.notValue = value;
    }

    /**
     * Obtiene el valor de la propiedad notVisible.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotVisible }
     *     
     */
    public AssertionAction.NotVisible getNotVisible() {
        return notVisible;
    }

    /**
     * Define el valor de la propiedad notVisible.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotVisible }
     *     
     */
    public void setNotVisible(AssertionAction.NotVisible value) {
        this.notVisible = value;
    }

    /**
     * Obtiene el valor de la propiedad notWhetherThisFrameMatchFrameExpression.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotWhetherThisFrameMatchFrameExpression }
     *     
     */
    public AssertionAction.NotWhetherThisFrameMatchFrameExpression getNotWhetherThisFrameMatchFrameExpression() {
        return notWhetherThisFrameMatchFrameExpression;
    }

    /**
     * Define el valor de la propiedad notWhetherThisFrameMatchFrameExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotWhetherThisFrameMatchFrameExpression }
     *     
     */
    public void setNotWhetherThisFrameMatchFrameExpression(AssertionAction.NotWhetherThisFrameMatchFrameExpression value) {
        this.notWhetherThisFrameMatchFrameExpression = value;
    }

    /**
     * Obtiene el valor de la propiedad notWhetherThisWindowMatchWindowExpression.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotWhetherThisWindowMatchWindowExpression }
     *     
     */
    public AssertionAction.NotWhetherThisWindowMatchWindowExpression getNotWhetherThisWindowMatchWindowExpression() {
        return notWhetherThisWindowMatchWindowExpression;
    }

    /**
     * Define el valor de la propiedad notWhetherThisWindowMatchWindowExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotWhetherThisWindowMatchWindowExpression }
     *     
     */
    public void setNotWhetherThisWindowMatchWindowExpression(AssertionAction.NotWhetherThisWindowMatchWindowExpression value) {
        this.notWhetherThisWindowMatchWindowExpression = value;
    }

    /**
     * Obtiene el valor de la propiedad notXpathCount.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.NotXpathCount }
     *     
     */
    public AssertionAction.NotXpathCount getNotXpathCount() {
        return notXpathCount;
    }

    /**
     * Define el valor de la propiedad notXpathCount.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.NotXpathCount }
     *     
     */
    public void setNotXpathCount(AssertionAction.NotXpathCount value) {
        this.notXpathCount = value;
    }

    /**
     * Obtiene el valor de la propiedad ordered.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Ordered }
     *     
     */
    public AssertionAction.Ordered getOrdered() {
        return ordered;
    }

    /**
     * Define el valor de la propiedad ordered.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Ordered }
     *     
     */
    public void setOrdered(AssertionAction.Ordered value) {
        this.ordered = value;
    }

    /**
     * Obtiene el valor de la propiedad prompt.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Prompt }
     *     
     */
    public AssertionAction.Prompt getPrompt() {
        return prompt;
    }

    /**
     * Define el valor de la propiedad prompt.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Prompt }
     *     
     */
    public void setPrompt(AssertionAction.Prompt value) {
        this.prompt = value;
    }

    /**
     * Obtiene el valor de la propiedad promptNotPresent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptNotPresent() {
        return promptNotPresent;
    }

    /**
     * Define el valor de la propiedad promptNotPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptNotPresent(String value) {
        this.promptNotPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad promptPresent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptPresent() {
        return promptPresent;
    }

    /**
     * Define el valor de la propiedad promptPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptPresent(String value) {
        this.promptPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad selected.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Selected }
     *     
     */
    public AssertionAction.Selected getSelected() {
        return selected;
    }

    /**
     * Define el valor de la propiedad selected.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Selected }
     *     
     */
    public void setSelected(AssertionAction.Selected value) {
        this.selected = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedId.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.SelectedId }
     *     
     */
    public AssertionAction.SelectedId getSelectedId() {
        return selectedId;
    }

    /**
     * Define el valor de la propiedad selectedId.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.SelectedId }
     *     
     */
    public void setSelectedId(AssertionAction.SelectedId value) {
        this.selectedId = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedIds.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.SelectedIds }
     *     
     */
    public AssertionAction.SelectedIds getSelectedIds() {
        return selectedIds;
    }

    /**
     * Define el valor de la propiedad selectedIds.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.SelectedIds }
     *     
     */
    public void setSelectedIds(AssertionAction.SelectedIds value) {
        this.selectedIds = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedIndex.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.SelectedIndex }
     *     
     */
    public AssertionAction.SelectedIndex getSelectedIndex() {
        return selectedIndex;
    }

    /**
     * Define el valor de la propiedad selectedIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.SelectedIndex }
     *     
     */
    public void setSelectedIndex(AssertionAction.SelectedIndex value) {
        this.selectedIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedIndexes.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.SelectedIndexes }
     *     
     */
    public AssertionAction.SelectedIndexes getSelectedIndexes() {
        return selectedIndexes;
    }

    /**
     * Define el valor de la propiedad selectedIndexes.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.SelectedIndexes }
     *     
     */
    public void setSelectedIndexes(AssertionAction.SelectedIndexes value) {
        this.selectedIndexes = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedLabel.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.SelectedLabel }
     *     
     */
    public AssertionAction.SelectedLabel getSelectedLabel() {
        return selectedLabel;
    }

    /**
     * Define el valor de la propiedad selectedLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.SelectedLabel }
     *     
     */
    public void setSelectedLabel(AssertionAction.SelectedLabel value) {
        this.selectedLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedLabels.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.SelectedLabels }
     *     
     */
    public AssertionAction.SelectedLabels getSelectedLabels() {
        return selectedLabels;
    }

    /**
     * Define el valor de la propiedad selectedLabels.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.SelectedLabels }
     *     
     */
    public void setSelectedLabels(AssertionAction.SelectedLabels value) {
        this.selectedLabels = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedValue.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.SelectedValue }
     *     
     */
    public AssertionAction.SelectedValue getSelectedValue() {
        return selectedValue;
    }

    /**
     * Define el valor de la propiedad selectedValue.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.SelectedValue }
     *     
     */
    public void setSelectedValue(AssertionAction.SelectedValue value) {
        this.selectedValue = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedValues.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.SelectedValues }
     *     
     */
    public AssertionAction.SelectedValues getSelectedValues() {
        return selectedValues;
    }

    /**
     * Define el valor de la propiedad selectedValues.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.SelectedValues }
     *     
     */
    public void setSelectedValues(AssertionAction.SelectedValues value) {
        this.selectedValues = value;
    }

    /**
     * Obtiene el valor de la propiedad selectOptions.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.SelectOptions }
     *     
     */
    public AssertionAction.SelectOptions getSelectOptions() {
        return selectOptions;
    }

    /**
     * Define el valor de la propiedad selectOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.SelectOptions }
     *     
     */
    public void setSelectOptions(AssertionAction.SelectOptions value) {
        this.selectOptions = value;
    }

    /**
     * Obtiene el valor de la propiedad somethingSelected.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.SomethingSelected }
     *     
     */
    public AssertionAction.SomethingSelected getSomethingSelected() {
        return somethingSelected;
    }

    /**
     * Define el valor de la propiedad somethingSelected.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.SomethingSelected }
     *     
     */
    public void setSomethingSelected(AssertionAction.SomethingSelected value) {
        this.somethingSelected = value;
    }

    /**
     * Obtiene el valor de la propiedad speed.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Speed }
     *     
     */
    public AssertionAction.Speed getSpeed() {
        return speed;
    }

    /**
     * Define el valor de la propiedad speed.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Speed }
     *     
     */
    public void setSpeed(AssertionAction.Speed value) {
        this.speed = value;
    }

    /**
     * Obtiene el valor de la propiedad table.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Table }
     *     
     */
    public AssertionAction.Table getTable() {
        return table;
    }

    /**
     * Define el valor de la propiedad table.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Table }
     *     
     */
    public void setTable(AssertionAction.Table value) {
        this.table = value;
    }

    /**
     * Obtiene el valor de la propiedad text.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Text }
     *     
     */
    public AssertionAction.Text getText() {
        return text;
    }

    /**
     * Define el valor de la propiedad text.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Text }
     *     
     */
    public void setText(AssertionAction.Text value) {
        this.text = value;
    }

    /**
     * Obtiene el valor de la propiedad textNotPresent.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.TextNotPresent }
     *     
     */
    public AssertionAction.TextNotPresent getTextNotPresent() {
        return textNotPresent;
    }

    /**
     * Define el valor de la propiedad textNotPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.TextNotPresent }
     *     
     */
    public void setTextNotPresent(AssertionAction.TextNotPresent value) {
        this.textNotPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad textPresent.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.TextPresent }
     *     
     */
    public AssertionAction.TextPresent getTextPresent() {
        return textPresent;
    }

    /**
     * Define el valor de la propiedad textPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.TextPresent }
     *     
     */
    public void setTextPresent(AssertionAction.TextPresent value) {
        this.textPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Title }
     *     
     */
    public AssertionAction.Title getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Title }
     *     
     */
    public void setTitle(AssertionAction.Title value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Value }
     *     
     */
    public AssertionAction.Value getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Value }
     *     
     */
    public void setValue(AssertionAction.Value value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad visible.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.Visible }
     *     
     */
    public AssertionAction.Visible getVisible() {
        return visible;
    }

    /**
     * Define el valor de la propiedad visible.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.Visible }
     *     
     */
    public void setVisible(AssertionAction.Visible value) {
        this.visible = value;
    }

    /**
     * Obtiene el valor de la propiedad whetherThisFrameMatchFrameExpression.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.WhetherThisFrameMatchFrameExpression }
     *     
     */
    public AssertionAction.WhetherThisFrameMatchFrameExpression getWhetherThisFrameMatchFrameExpression() {
        return whetherThisFrameMatchFrameExpression;
    }

    /**
     * Define el valor de la propiedad whetherThisFrameMatchFrameExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.WhetherThisFrameMatchFrameExpression }
     *     
     */
    public void setWhetherThisFrameMatchFrameExpression(AssertionAction.WhetherThisFrameMatchFrameExpression value) {
        this.whetherThisFrameMatchFrameExpression = value;
    }

    /**
     * Obtiene el valor de la propiedad whetherThisWindowMatchWindowExpression.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.WhetherThisWindowMatchWindowExpression }
     *     
     */
    public AssertionAction.WhetherThisWindowMatchWindowExpression getWhetherThisWindowMatchWindowExpression() {
        return whetherThisWindowMatchWindowExpression;
    }

    /**
     * Define el valor de la propiedad whetherThisWindowMatchWindowExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.WhetherThisWindowMatchWindowExpression }
     *     
     */
    public void setWhetherThisWindowMatchWindowExpression(AssertionAction.WhetherThisWindowMatchWindowExpression value) {
        this.whetherThisWindowMatchWindowExpression = value;
    }

    /**
     * Obtiene el valor de la propiedad xpathCount.
     * 
     * @return
     *     possible object is
     *     {@link AssertionAction.XpathCount }
     *     
     */
    public AssertionAction.XpathCount getXpathCount() {
        return xpathCount;
    }

    /**
     * Define el valor de la propiedad xpathCount.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionAction.XpathCount }
     *     
     */
    public void setXpathCount(AssertionAction.XpathCount value) {
        this.xpathCount = value;
    }

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
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link AssertionType }
     *     
     */
    public AssertionType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionType }
     *     
     */
    public void setType(AssertionType value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad errorStep.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isErrorStep() {
        if (errorStep == null) {
            return false;
        } else {
            return errorStep;
        }
    }

    /**
     * Define el valor de la propiedad errorStep.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorStep(Boolean value) {
        this.errorStep = value;
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
            AssertionAction.Alert theAlert;
            theAlert = this.getAlert();
            strategy.appendField(locator, this, "alert", buffer, theAlert);
        }
        {
            String theAlertNotPresent;
            theAlertNotPresent = this.getAlertNotPresent();
            strategy.appendField(locator, this, "alertNotPresent", buffer, theAlertNotPresent);
        }
        {
            String theAlertPresent;
            theAlertPresent = this.getAlertPresent();
            strategy.appendField(locator, this, "alertPresent", buffer, theAlertPresent);
        }
        {
            AssertionAction.AllButtons theAllButtons;
            theAllButtons = this.getAllButtons();
            strategy.appendField(locator, this, "allButtons", buffer, theAllButtons);
        }
        {
            AssertionAction.AllFields theAllFields;
            theAllFields = this.getAllFields();
            strategy.appendField(locator, this, "allFields", buffer, theAllFields);
        }
        {
            AssertionAction.AllLinks theAllLinks;
            theAllLinks = this.getAllLinks();
            strategy.appendField(locator, this, "allLinks", buffer, theAllLinks);
        }
        {
            AssertionAction.AllWindowIds theAllWindowIds;
            theAllWindowIds = this.getAllWindowIds();
            strategy.appendField(locator, this, "allWindowIds", buffer, theAllWindowIds);
        }
        {
            AssertionAction.AllWindowNames theAllWindowNames;
            theAllWindowNames = this.getAllWindowNames();
            strategy.appendField(locator, this, "allWindowNames", buffer, theAllWindowNames);
        }
        {
            AssertionAction.AllWindowTitles theAllWindowTitles;
            theAllWindowTitles = this.getAllWindowTitles();
            strategy.appendField(locator, this, "allWindowTitles", buffer, theAllWindowTitles);
        }
        {
            AssertionAction.Attribute theAttribute;
            theAttribute = this.getAttribute();
            strategy.appendField(locator, this, "attribute", buffer, theAttribute);
        }
        {
            AssertionAction.AttributeFromAllWindows theAttributeFromAllWindows;
            theAttributeFromAllWindows = this.getAttributeFromAllWindows();
            strategy.appendField(locator, this, "attributeFromAllWindows", buffer, theAttributeFromAllWindows);
        }
        {
            AssertionAction.BodyText theBodyText;
            theBodyText = this.getBodyText();
            strategy.appendField(locator, this, "bodyText", buffer, theBodyText);
        }
        {
            AssertionAction.Checked theChecked;
            theChecked = this.getChecked();
            strategy.appendField(locator, this, "checked", buffer, theChecked);
        }
        {
            AssertionAction.Confirmation theConfirmation;
            theConfirmation = this.getConfirmation();
            strategy.appendField(locator, this, "confirmation", buffer, theConfirmation);
        }
        {
            String theConfirmationNotPresent;
            theConfirmationNotPresent = this.getConfirmationNotPresent();
            strategy.appendField(locator, this, "confirmationNotPresent", buffer, theConfirmationNotPresent);
        }
        {
            String theConfirmationPresent;
            theConfirmationPresent = this.getConfirmationPresent();
            strategy.appendField(locator, this, "confirmationPresent", buffer, theConfirmationPresent);
        }
        {
            AssertionAction.Cookie theCookie;
            theCookie = this.getCookie();
            strategy.appendField(locator, this, "cookie", buffer, theCookie);
        }
        {
            AssertionAction.CookieByName theCookieByName;
            theCookieByName = this.getCookieByName();
            strategy.appendField(locator, this, "cookieByName", buffer, theCookieByName);
        }
        {
            AssertionAction.CookieNotPresent theCookieNotPresent;
            theCookieNotPresent = this.getCookieNotPresent();
            strategy.appendField(locator, this, "cookieNotPresent", buffer, theCookieNotPresent);
        }
        {
            AssertionAction.CookiePresent theCookiePresent;
            theCookiePresent = this.getCookiePresent();
            strategy.appendField(locator, this, "cookiePresent", buffer, theCookiePresent);
        }
        {
            AssertionAction.CursorPosition theCursorPosition;
            theCursorPosition = this.getCursorPosition();
            strategy.appendField(locator, this, "cursorPosition", buffer, theCursorPosition);
        }
        {
            AssertionAction.Editable theEditable;
            theEditable = this.getEditable();
            strategy.appendField(locator, this, "editable", buffer, theEditable);
        }
        {
            AssertionAction.ElementHeight theElementHeight;
            theElementHeight = this.getElementHeight();
            strategy.appendField(locator, this, "elementHeight", buffer, theElementHeight);
        }
        {
            AssertionAction.ElementIndex theElementIndex;
            theElementIndex = this.getElementIndex();
            strategy.appendField(locator, this, "elementIndex", buffer, theElementIndex);
        }
        {
            AssertionAction.ElementNotPresent theElementNotPresent;
            theElementNotPresent = this.getElementNotPresent();
            strategy.appendField(locator, this, "elementNotPresent", buffer, theElementNotPresent);
        }
        {
            AssertionAction.ElementPositionLeft theElementPositionLeft;
            theElementPositionLeft = this.getElementPositionLeft();
            strategy.appendField(locator, this, "elementPositionLeft", buffer, theElementPositionLeft);
        }
        {
            AssertionAction.ElementPositionTop theElementPositionTop;
            theElementPositionTop = this.getElementPositionTop();
            strategy.appendField(locator, this, "elementPositionTop", buffer, theElementPositionTop);
        }
        {
            AssertionAction.ElementPresent theElementPresent;
            theElementPresent = this.getElementPresent();
            strategy.appendField(locator, this, "elementPresent", buffer, theElementPresent);
        }
        {
            AssertionAction.ElementWidth theElementWidth;
            theElementWidth = this.getElementWidth();
            strategy.appendField(locator, this, "elementWidth", buffer, theElementWidth);
        }
        {
            AssertionAction.ErrorOnNext theErrorOnNext;
            theErrorOnNext = this.getErrorOnNext();
            strategy.appendField(locator, this, "errorOnNext", buffer, theErrorOnNext);
        }
        {
            AssertionAction.Eval theEval;
            theEval = this.getEval();
            strategy.appendField(locator, this, "eval", buffer, theEval);
        }
        {
            AssertionAction.Expression theExpression;
            theExpression = this.getExpression();
            strategy.appendField(locator, this, "expression", buffer, theExpression);
        }
        {
            AssertionAction.FailureOnNext theFailureOnNext;
            theFailureOnNext = this.getFailureOnNext();
            strategy.appendField(locator, this, "failureOnNext", buffer, theFailureOnNext);
        }
        {
            AssertionAction.HtmlSource theHtmlSource;
            theHtmlSource = this.getHtmlSource();
            strategy.appendField(locator, this, "htmlSource", buffer, theHtmlSource);
        }
        {
            AssertionAction.Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            AssertionAction.MouseSpeed theMouseSpeed;
            theMouseSpeed = this.getMouseSpeed();
            strategy.appendField(locator, this, "mouseSpeed", buffer, theMouseSpeed);
        }
        {
            AssertionAction.NotAlert theNotAlert;
            theNotAlert = this.getNotAlert();
            strategy.appendField(locator, this, "notAlert", buffer, theNotAlert);
        }
        {
            AssertionAction.NotAllButtons theNotAllButtons;
            theNotAllButtons = this.getNotAllButtons();
            strategy.appendField(locator, this, "notAllButtons", buffer, theNotAllButtons);
        }
        {
            AssertionAction.NotAllFields theNotAllFields;
            theNotAllFields = this.getNotAllFields();
            strategy.appendField(locator, this, "notAllFields", buffer, theNotAllFields);
        }
        {
            AssertionAction.NotAllLinks theNotAllLinks;
            theNotAllLinks = this.getNotAllLinks();
            strategy.appendField(locator, this, "notAllLinks", buffer, theNotAllLinks);
        }
        {
            AssertionAction.NotAllWindowIds theNotAllWindowIds;
            theNotAllWindowIds = this.getNotAllWindowIds();
            strategy.appendField(locator, this, "notAllWindowIds", buffer, theNotAllWindowIds);
        }
        {
            AssertionAction.NotAllWindowNames theNotAllWindowNames;
            theNotAllWindowNames = this.getNotAllWindowNames();
            strategy.appendField(locator, this, "notAllWindowNames", buffer, theNotAllWindowNames);
        }
        {
            AssertionAction.NotAllWindowTitles theNotAllWindowTitles;
            theNotAllWindowTitles = this.getNotAllWindowTitles();
            strategy.appendField(locator, this, "notAllWindowTitles", buffer, theNotAllWindowTitles);
        }
        {
            AssertionAction.NotAttribute theNotAttribute;
            theNotAttribute = this.getNotAttribute();
            strategy.appendField(locator, this, "notAttribute", buffer, theNotAttribute);
        }
        {
            AssertionAction.NotAttributeFromAllWindows theNotAttributeFromAllWindows;
            theNotAttributeFromAllWindows = this.getNotAttributeFromAllWindows();
            strategy.appendField(locator, this, "notAttributeFromAllWindows", buffer, theNotAttributeFromAllWindows);
        }
        {
            AssertionAction.NotBodyText theNotBodyText;
            theNotBodyText = this.getNotBodyText();
            strategy.appendField(locator, this, "notBodyText", buffer, theNotBodyText);
        }
        {
            AssertionAction.NotChecked theNotChecked;
            theNotChecked = this.getNotChecked();
            strategy.appendField(locator, this, "notChecked", buffer, theNotChecked);
        }
        {
            AssertionAction.NotConfirmation theNotConfirmation;
            theNotConfirmation = this.getNotConfirmation();
            strategy.appendField(locator, this, "notConfirmation", buffer, theNotConfirmation);
        }
        {
            AssertionAction.NotCookie theNotCookie;
            theNotCookie = this.getNotCookie();
            strategy.appendField(locator, this, "notCookie", buffer, theNotCookie);
        }
        {
            AssertionAction.NotCookieByName theNotCookieByName;
            theNotCookieByName = this.getNotCookieByName();
            strategy.appendField(locator, this, "notCookieByName", buffer, theNotCookieByName);
        }
        {
            AssertionAction.NotCursorPosition theNotCursorPosition;
            theNotCursorPosition = this.getNotCursorPosition();
            strategy.appendField(locator, this, "notCursorPosition", buffer, theNotCursorPosition);
        }
        {
            AssertionAction.NotEditable theNotEditable;
            theNotEditable = this.getNotEditable();
            strategy.appendField(locator, this, "notEditable", buffer, theNotEditable);
        }
        {
            AssertionAction.NotElementHeight theNotElementHeight;
            theNotElementHeight = this.getNotElementHeight();
            strategy.appendField(locator, this, "notElementHeight", buffer, theNotElementHeight);
        }
        {
            AssertionAction.NotElementIndex theNotElementIndex;
            theNotElementIndex = this.getNotElementIndex();
            strategy.appendField(locator, this, "notElementIndex", buffer, theNotElementIndex);
        }
        {
            AssertionAction.NotElementPositionLeft theNotElementPositionLeft;
            theNotElementPositionLeft = this.getNotElementPositionLeft();
            strategy.appendField(locator, this, "notElementPositionLeft", buffer, theNotElementPositionLeft);
        }
        {
            AssertionAction.NotElementPositionTop theNotElementPositionTop;
            theNotElementPositionTop = this.getNotElementPositionTop();
            strategy.appendField(locator, this, "notElementPositionTop", buffer, theNotElementPositionTop);
        }
        {
            AssertionAction.NotElementWidth theNotElementWidth;
            theNotElementWidth = this.getNotElementWidth();
            strategy.appendField(locator, this, "notElementWidth", buffer, theNotElementWidth);
        }
        {
            AssertionAction.NotErrorOnNext theNotErrorOnNext;
            theNotErrorOnNext = this.getNotErrorOnNext();
            strategy.appendField(locator, this, "notErrorOnNext", buffer, theNotErrorOnNext);
        }
        {
            AssertionAction.NotEval theNotEval;
            theNotEval = this.getNotEval();
            strategy.appendField(locator, this, "notEval", buffer, theNotEval);
        }
        {
            AssertionAction.NotExpression theNotExpression;
            theNotExpression = this.getNotExpression();
            strategy.appendField(locator, this, "notExpression", buffer, theNotExpression);
        }
        {
            AssertionAction.NotFailureOnNext theNotFailureOnNext;
            theNotFailureOnNext = this.getNotFailureOnNext();
            strategy.appendField(locator, this, "notFailureOnNext", buffer, theNotFailureOnNext);
        }
        {
            AssertionAction.NotHtmlSource theNotHtmlSource;
            theNotHtmlSource = this.getNotHtmlSource();
            strategy.appendField(locator, this, "notHtmlSource", buffer, theNotHtmlSource);
        }
        {
            AssertionAction.NotLocation theNotLocation;
            theNotLocation = this.getNotLocation();
            strategy.appendField(locator, this, "notLocation", buffer, theNotLocation);
        }
        {
            AssertionAction.NotMouseSpeed theNotMouseSpeed;
            theNotMouseSpeed = this.getNotMouseSpeed();
            strategy.appendField(locator, this, "notMouseSpeed", buffer, theNotMouseSpeed);
        }
        {
            AssertionAction.NotOrdered theNotOrdered;
            theNotOrdered = this.getNotOrdered();
            strategy.appendField(locator, this, "notOrdered", buffer, theNotOrdered);
        }
        {
            AssertionAction.NotPrompt theNotPrompt;
            theNotPrompt = this.getNotPrompt();
            strategy.appendField(locator, this, "notPrompt", buffer, theNotPrompt);
        }
        {
            AssertionAction.NotSelected theNotSelected;
            theNotSelected = this.getNotSelected();
            strategy.appendField(locator, this, "notSelected", buffer, theNotSelected);
        }
        {
            AssertionAction.NotSelectedId theNotSelectedId;
            theNotSelectedId = this.getNotSelectedId();
            strategy.appendField(locator, this, "notSelectedId", buffer, theNotSelectedId);
        }
        {
            AssertionAction.NotSelectedIds theNotSelectedIds;
            theNotSelectedIds = this.getNotSelectedIds();
            strategy.appendField(locator, this, "notSelectedIds", buffer, theNotSelectedIds);
        }
        {
            AssertionAction.NotSelectedIndex theNotSelectedIndex;
            theNotSelectedIndex = this.getNotSelectedIndex();
            strategy.appendField(locator, this, "notSelectedIndex", buffer, theNotSelectedIndex);
        }
        {
            AssertionAction.NotSelectedIndexes theNotSelectedIndexes;
            theNotSelectedIndexes = this.getNotSelectedIndexes();
            strategy.appendField(locator, this, "notSelectedIndexes", buffer, theNotSelectedIndexes);
        }
        {
            AssertionAction.NotSelectedLabel theNotSelectedLabel;
            theNotSelectedLabel = this.getNotSelectedLabel();
            strategy.appendField(locator, this, "notSelectedLabel", buffer, theNotSelectedLabel);
        }
        {
            AssertionAction.NotSelectedLabels theNotSelectedLabels;
            theNotSelectedLabels = this.getNotSelectedLabels();
            strategy.appendField(locator, this, "notSelectedLabels", buffer, theNotSelectedLabels);
        }
        {
            AssertionAction.NotSelectedValue theNotSelectedValue;
            theNotSelectedValue = this.getNotSelectedValue();
            strategy.appendField(locator, this, "notSelectedValue", buffer, theNotSelectedValue);
        }
        {
            AssertionAction.NotSelectedValues theNotSelectedValues;
            theNotSelectedValues = this.getNotSelectedValues();
            strategy.appendField(locator, this, "notSelectedValues", buffer, theNotSelectedValues);
        }
        {
            AssertionAction.NotSelectOptions theNotSelectOptions;
            theNotSelectOptions = this.getNotSelectOptions();
            strategy.appendField(locator, this, "notSelectOptions", buffer, theNotSelectOptions);
        }
        {
            AssertionAction.NotSomethingSelected theNotSomethingSelected;
            theNotSomethingSelected = this.getNotSomethingSelected();
            strategy.appendField(locator, this, "notSomethingSelected", buffer, theNotSomethingSelected);
        }
        {
            AssertionAction.NotSpeed theNotSpeed;
            theNotSpeed = this.getNotSpeed();
            strategy.appendField(locator, this, "notSpeed", buffer, theNotSpeed);
        }
        {
            AssertionAction.NotTable theNotTable;
            theNotTable = this.getNotTable();
            strategy.appendField(locator, this, "notTable", buffer, theNotTable);
        }
        {
            AssertionAction.NotText theNotText;
            theNotText = this.getNotText();
            strategy.appendField(locator, this, "notText", buffer, theNotText);
        }
        {
            AssertionAction.NotTitle theNotTitle;
            theNotTitle = this.getNotTitle();
            strategy.appendField(locator, this, "notTitle", buffer, theNotTitle);
        }
        {
            AssertionAction.NotValue theNotValue;
            theNotValue = this.getNotValue();
            strategy.appendField(locator, this, "notValue", buffer, theNotValue);
        }
        {
            AssertionAction.NotVisible theNotVisible;
            theNotVisible = this.getNotVisible();
            strategy.appendField(locator, this, "notVisible", buffer, theNotVisible);
        }
        {
            AssertionAction.NotWhetherThisFrameMatchFrameExpression theNotWhetherThisFrameMatchFrameExpression;
            theNotWhetherThisFrameMatchFrameExpression = this.getNotWhetherThisFrameMatchFrameExpression();
            strategy.appendField(locator, this, "notWhetherThisFrameMatchFrameExpression", buffer, theNotWhetherThisFrameMatchFrameExpression);
        }
        {
            AssertionAction.NotWhetherThisWindowMatchWindowExpression theNotWhetherThisWindowMatchWindowExpression;
            theNotWhetherThisWindowMatchWindowExpression = this.getNotWhetherThisWindowMatchWindowExpression();
            strategy.appendField(locator, this, "notWhetherThisWindowMatchWindowExpression", buffer, theNotWhetherThisWindowMatchWindowExpression);
        }
        {
            AssertionAction.NotXpathCount theNotXpathCount;
            theNotXpathCount = this.getNotXpathCount();
            strategy.appendField(locator, this, "notXpathCount", buffer, theNotXpathCount);
        }
        {
            AssertionAction.Ordered theOrdered;
            theOrdered = this.getOrdered();
            strategy.appendField(locator, this, "ordered", buffer, theOrdered);
        }
        {
            AssertionAction.Prompt thePrompt;
            thePrompt = this.getPrompt();
            strategy.appendField(locator, this, "prompt", buffer, thePrompt);
        }
        {
            String thePromptNotPresent;
            thePromptNotPresent = this.getPromptNotPresent();
            strategy.appendField(locator, this, "promptNotPresent", buffer, thePromptNotPresent);
        }
        {
            String thePromptPresent;
            thePromptPresent = this.getPromptPresent();
            strategy.appendField(locator, this, "promptPresent", buffer, thePromptPresent);
        }
        {
            AssertionAction.Selected theSelected;
            theSelected = this.getSelected();
            strategy.appendField(locator, this, "selected", buffer, theSelected);
        }
        {
            AssertionAction.SelectedId theSelectedId;
            theSelectedId = this.getSelectedId();
            strategy.appendField(locator, this, "selectedId", buffer, theSelectedId);
        }
        {
            AssertionAction.SelectedIds theSelectedIds;
            theSelectedIds = this.getSelectedIds();
            strategy.appendField(locator, this, "selectedIds", buffer, theSelectedIds);
        }
        {
            AssertionAction.SelectedIndex theSelectedIndex;
            theSelectedIndex = this.getSelectedIndex();
            strategy.appendField(locator, this, "selectedIndex", buffer, theSelectedIndex);
        }
        {
            AssertionAction.SelectedIndexes theSelectedIndexes;
            theSelectedIndexes = this.getSelectedIndexes();
            strategy.appendField(locator, this, "selectedIndexes", buffer, theSelectedIndexes);
        }
        {
            AssertionAction.SelectedLabel theSelectedLabel;
            theSelectedLabel = this.getSelectedLabel();
            strategy.appendField(locator, this, "selectedLabel", buffer, theSelectedLabel);
        }
        {
            AssertionAction.SelectedLabels theSelectedLabels;
            theSelectedLabels = this.getSelectedLabels();
            strategy.appendField(locator, this, "selectedLabels", buffer, theSelectedLabels);
        }
        {
            AssertionAction.SelectedValue theSelectedValue;
            theSelectedValue = this.getSelectedValue();
            strategy.appendField(locator, this, "selectedValue", buffer, theSelectedValue);
        }
        {
            AssertionAction.SelectedValues theSelectedValues;
            theSelectedValues = this.getSelectedValues();
            strategy.appendField(locator, this, "selectedValues", buffer, theSelectedValues);
        }
        {
            AssertionAction.SelectOptions theSelectOptions;
            theSelectOptions = this.getSelectOptions();
            strategy.appendField(locator, this, "selectOptions", buffer, theSelectOptions);
        }
        {
            AssertionAction.SomethingSelected theSomethingSelected;
            theSomethingSelected = this.getSomethingSelected();
            strategy.appendField(locator, this, "somethingSelected", buffer, theSomethingSelected);
        }
        {
            AssertionAction.Speed theSpeed;
            theSpeed = this.getSpeed();
            strategy.appendField(locator, this, "speed", buffer, theSpeed);
        }
        {
            AssertionAction.Table theTable;
            theTable = this.getTable();
            strategy.appendField(locator, this, "table", buffer, theTable);
        }
        {
            AssertionAction.Text theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText);
        }
        {
            AssertionAction.TextNotPresent theTextNotPresent;
            theTextNotPresent = this.getTextNotPresent();
            strategy.appendField(locator, this, "textNotPresent", buffer, theTextNotPresent);
        }
        {
            AssertionAction.TextPresent theTextPresent;
            theTextPresent = this.getTextPresent();
            strategy.appendField(locator, this, "textPresent", buffer, theTextPresent);
        }
        {
            AssertionAction.Title theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            AssertionAction.Value theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            AssertionAction.Visible theVisible;
            theVisible = this.getVisible();
            strategy.appendField(locator, this, "visible", buffer, theVisible);
        }
        {
            AssertionAction.WhetherThisFrameMatchFrameExpression theWhetherThisFrameMatchFrameExpression;
            theWhetherThisFrameMatchFrameExpression = this.getWhetherThisFrameMatchFrameExpression();
            strategy.appendField(locator, this, "whetherThisFrameMatchFrameExpression", buffer, theWhetherThisFrameMatchFrameExpression);
        }
        {
            AssertionAction.WhetherThisWindowMatchWindowExpression theWhetherThisWindowMatchWindowExpression;
            theWhetherThisWindowMatchWindowExpression = this.getWhetherThisWindowMatchWindowExpression();
            strategy.appendField(locator, this, "whetherThisWindowMatchWindowExpression", buffer, theWhetherThisWindowMatchWindowExpression);
        }
        {
            AssertionAction.XpathCount theXpathCount;
            theXpathCount = this.getXpathCount();
            strategy.appendField(locator, this, "xpathCount", buffer, theXpathCount);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            AssertionType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            boolean theErrorStep;
            theErrorStep = ((this.errorStep!= null)?this.isErrorStep():false);
            strategy.appendField(locator, this, "errorStep", buffer, theErrorStep);
        }
        return buffer;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Alert
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllButtons
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllFields
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllLinks
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllWindowIds
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllWindowNames
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllWindowTitles
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="attributeLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Attribute
        implements ToString
    {

        @XmlAttribute(name = "attributeLocator", required = true)
        protected String attributeLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad attributeLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeLocator() {
            return attributeLocator;
        }

        /**
         * Define el valor de la propiedad attributeLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeLocator(String value) {
            this.attributeLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theAttributeLocator;
                theAttributeLocator = this.getAttributeLocator();
                strategy.appendField(locator, this, "attributeLocator", buffer, theAttributeLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="attributeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AttributeFromAllWindows
        implements ToString
    {

        @XmlAttribute(name = "attributeName", required = true)
        protected String attributeName;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad attributeName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeName() {
            return attributeName;
        }

        /**
         * Define el valor de la propiedad attributeName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeName(String value) {
            this.attributeName = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theAttributeName;
                theAttributeName = this.getAttributeName();
                strategy.appendField(locator, this, "attributeName", buffer, theAttributeName);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BodyText
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Checked
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Confirmation
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cookie
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CookieByName
        implements ToString
    {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

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
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CookieNotPresent
        implements ToString
    {

        @XmlAttribute(name = "name", required = true)
        protected String name;

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
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CookiePresent
        implements ToString
    {

        @XmlAttribute(name = "name", required = true)
        protected String name;

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
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CursorPosition
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Editable
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ElementHeight
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ElementIndex
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ElementNotPresent
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ElementPositionLeft
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ElementPositionTop
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ElementPresent
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ElementWidth
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="message" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ErrorOnNext
        implements ToString
    {

        @XmlAttribute(name = "message", required = true)
        protected String message;

        /**
         * Obtiene el valor de la propiedad message.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * Define el valor de la propiedad message.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
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
                String theMessage;
                theMessage = this.getMessage();
                strategy.appendField(locator, this, "message", buffer, theMessage);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="script" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Eval
        implements ToString
    {

        @XmlAttribute(name = "script", required = true)
        protected String script;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad script.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScript() {
            return script;
        }

        /**
         * Define el valor de la propiedad script.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScript(String value) {
            this.script = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theScript;
                theScript = this.getScript();
                strategy.appendField(locator, this, "script", buffer, theScript);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Expression
        implements ToString
    {

        @XmlAttribute(name = "expression", required = true)
        protected String expression;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad expression.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpression() {
            return expression;
        }

        /**
         * Define el valor de la propiedad expression.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpression(String value) {
            this.expression = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theExpression;
                theExpression = this.getExpression();
                strategy.appendField(locator, this, "expression", buffer, theExpression);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="message" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FailureOnNext
        implements ToString
    {

        @XmlAttribute(name = "message", required = true)
        protected String message;

        /**
         * Obtiene el valor de la propiedad message.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * Define el valor de la propiedad message.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
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
                String theMessage;
                theMessage = this.getMessage();
                strategy.appendField(locator, this, "message", buffer, theMessage);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HtmlSource
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Location
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseSpeed
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotAlert
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotAllButtons
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotAllFields
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotAllLinks
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotAllWindowIds
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotAllWindowNames
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotAllWindowTitles
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="attributeLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotAttribute
        implements ToString
    {

        @XmlAttribute(name = "attributeLocator", required = true)
        protected String attributeLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad attributeLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeLocator() {
            return attributeLocator;
        }

        /**
         * Define el valor de la propiedad attributeLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeLocator(String value) {
            this.attributeLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theAttributeLocator;
                theAttributeLocator = this.getAttributeLocator();
                strategy.appendField(locator, this, "attributeLocator", buffer, theAttributeLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="attributeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotAttributeFromAllWindows
        implements ToString
    {

        @XmlAttribute(name = "attributeName", required = true)
        protected String attributeName;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad attributeName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeName() {
            return attributeName;
        }

        /**
         * Define el valor de la propiedad attributeName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeName(String value) {
            this.attributeName = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theAttributeName;
                theAttributeName = this.getAttributeName();
                strategy.appendField(locator, this, "attributeName", buffer, theAttributeName);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotBodyText
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotChecked
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotConfirmation
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotCookie
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotCookieByName
        implements ToString
    {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

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
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotCursorPosition
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotEditable
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotElementHeight
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotElementIndex
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotElementPositionLeft
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotElementPositionTop
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotElementWidth
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="message" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotErrorOnNext
        implements ToString
    {

        @XmlAttribute(name = "message", required = true)
        protected String message;

        /**
         * Obtiene el valor de la propiedad message.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * Define el valor de la propiedad message.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
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
                String theMessage;
                theMessage = this.getMessage();
                strategy.appendField(locator, this, "message", buffer, theMessage);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="script" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotEval
        implements ToString
    {

        @XmlAttribute(name = "script", required = true)
        protected String script;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad script.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScript() {
            return script;
        }

        /**
         * Define el valor de la propiedad script.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScript(String value) {
            this.script = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theScript;
                theScript = this.getScript();
                strategy.appendField(locator, this, "script", buffer, theScript);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotExpression
        implements ToString
    {

        @XmlAttribute(name = "expression", required = true)
        protected String expression;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad expression.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpression() {
            return expression;
        }

        /**
         * Define el valor de la propiedad expression.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpression(String value) {
            this.expression = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theExpression;
                theExpression = this.getExpression();
                strategy.appendField(locator, this, "expression", buffer, theExpression);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="message" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotFailureOnNext
        implements ToString
    {

        @XmlAttribute(name = "message", required = true)
        protected String message;

        /**
         * Obtiene el valor de la propiedad message.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * Define el valor de la propiedad message.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
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
                String theMessage;
                theMessage = this.getMessage();
                strategy.appendField(locator, this, "message", buffer, theMessage);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotHtmlSource
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotLocation
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotMouseSpeed
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="locator2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotOrdered
        implements ToString
    {

        @XmlAttribute(name = "locator1", required = true)
        protected String locator1;
        @XmlAttribute(name = "locator2", required = true)
        protected String locator2;

        /**
         * Obtiene el valor de la propiedad locator1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator1() {
            return locator1;
        }

        /**
         * Define el valor de la propiedad locator1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator1(String value) {
            this.locator1 = value;
        }

        /**
         * Obtiene el valor de la propiedad locator2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator2() {
            return locator2;
        }

        /**
         * Define el valor de la propiedad locator2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator2(String value) {
            this.locator2 = value;
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
                String theLocator1;
                theLocator1 = this.getLocator1();
                strategy.appendField(locator, this, "locator1", buffer, theLocator1);
            }
            {
                String theLocator2;
                theLocator2 = this.getLocator2();
                strategy.appendField(locator, this, "locator2", buffer, theLocator2);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotPrompt
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSelectOptions
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optionLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSelected
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "optionLocator", required = true)
        protected String optionLocator;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad optionLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionLocator() {
            return optionLocator;
        }

        /**
         * Define el valor de la propiedad optionLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionLocator(String value) {
            this.optionLocator = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theOptionLocator;
                theOptionLocator = this.getOptionLocator();
                strategy.appendField(locator, this, "optionLocator", buffer, theOptionLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSelectedId
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSelectedIds
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSelectedIndex
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSelectedIndexes
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSelectedLabel
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSelectedLabels
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSelectedValue
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSelectedValues
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSomethingSelected
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotSpeed
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="tableCellAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotTable
        implements ToString
    {

        @XmlAttribute(name = "tableCellAddress", required = true)
        protected String tableCellAddress;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad tableCellAddress.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableCellAddress() {
            return tableCellAddress;
        }

        /**
         * Define el valor de la propiedad tableCellAddress.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableCellAddress(String value) {
            this.tableCellAddress = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theTableCellAddress;
                theTableCellAddress = this.getTableCellAddress();
                strategy.appendField(locator, this, "tableCellAddress", buffer, theTableCellAddress);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotText
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotTitle
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotValue
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotVisible
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="currentFrameString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotWhetherThisFrameMatchFrameExpression
        implements ToString
    {

        @XmlAttribute(name = "currentFrameString", required = true)
        protected String currentFrameString;
        @XmlAttribute(name = "target", required = true)
        protected String target;

        /**
         * Obtiene el valor de la propiedad currentFrameString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentFrameString() {
            return currentFrameString;
        }

        /**
         * Define el valor de la propiedad currentFrameString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentFrameString(String value) {
            this.currentFrameString = value;
        }

        /**
         * Obtiene el valor de la propiedad target.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * Define el valor de la propiedad target.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
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
                String theCurrentFrameString;
                theCurrentFrameString = this.getCurrentFrameString();
                strategy.appendField(locator, this, "currentFrameString", buffer, theCurrentFrameString);
            }
            {
                String theTarget;
                theTarget = this.getTarget();
                strategy.appendField(locator, this, "target", buffer, theTarget);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="currentWindowString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotWhetherThisWindowMatchWindowExpression
        implements ToString
    {

        @XmlAttribute(name = "currentWindowString", required = true)
        protected String currentWindowString;
        @XmlAttribute(name = "target", required = true)
        protected String target;

        /**
         * Obtiene el valor de la propiedad currentWindowString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentWindowString() {
            return currentWindowString;
        }

        /**
         * Define el valor de la propiedad currentWindowString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentWindowString(String value) {
            this.currentWindowString = value;
        }

        /**
         * Obtiene el valor de la propiedad target.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * Define el valor de la propiedad target.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
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
                String theCurrentWindowString;
                theCurrentWindowString = this.getCurrentWindowString();
                strategy.appendField(locator, this, "currentWindowString", buffer, theCurrentWindowString);
            }
            {
                String theTarget;
                theTarget = this.getTarget();
                strategy.appendField(locator, this, "target", buffer, theTarget);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="xpath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NotXpathCount
        implements ToString
    {

        @XmlAttribute(name = "xpath", required = true)
        protected String xpath;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad xpath.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXpath() {
            return xpath;
        }

        /**
         * Define el valor de la propiedad xpath.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXpath(String value) {
            this.xpath = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theXpath;
                theXpath = this.getXpath();
                strategy.appendField(locator, this, "xpath", buffer, theXpath);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="locator2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Ordered
        implements ToString
    {

        @XmlAttribute(name = "locator1", required = true)
        protected String locator1;
        @XmlAttribute(name = "locator2", required = true)
        protected String locator2;

        /**
         * Obtiene el valor de la propiedad locator1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator1() {
            return locator1;
        }

        /**
         * Define el valor de la propiedad locator1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator1(String value) {
            this.locator1 = value;
        }

        /**
         * Obtiene el valor de la propiedad locator2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator2() {
            return locator2;
        }

        /**
         * Define el valor de la propiedad locator2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator2(String value) {
            this.locator2 = value;
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
                String theLocator1;
                theLocator1 = this.getLocator1();
                strategy.appendField(locator, this, "locator1", buffer, theLocator1);
            }
            {
                String theLocator2;
                theLocator2 = this.getLocator2();
                strategy.appendField(locator, this, "locator2", buffer, theLocator2);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Prompt
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectOptions
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optionLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Selected
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "optionLocator", required = true)
        protected String optionLocator;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad optionLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionLocator() {
            return optionLocator;
        }

        /**
         * Define el valor de la propiedad optionLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionLocator(String value) {
            this.optionLocator = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theOptionLocator;
                theOptionLocator = this.getOptionLocator();
                strategy.appendField(locator, this, "optionLocator", buffer, theOptionLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedId
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedIds
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedIndex
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedIndexes
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedLabel
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedLabels
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedValue
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedValues
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SomethingSelected
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;

        /**
         * Obtiene el valor de la propiedad selectLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectLocator() {
            return selectLocator;
        }

        /**
         * Define el valor de la propiedad selectLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectLocator(String value) {
            this.selectLocator = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Speed
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="tableCellAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Table
        implements ToString
    {

        @XmlAttribute(name = "tableCellAddress", required = true)
        protected String tableCellAddress;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad tableCellAddress.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableCellAddress() {
            return tableCellAddress;
        }

        /**
         * Define el valor de la propiedad tableCellAddress.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableCellAddress(String value) {
            this.tableCellAddress = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theTableCellAddress;
                theTableCellAddress = this.getTableCellAddress();
                strategy.appendField(locator, this, "tableCellAddress", buffer, theTableCellAddress);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Text
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TextNotPresent
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TextPresent
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Title
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Value
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Visible
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;

        /**
         * Obtiene el valor de la propiedad locator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocator() {
            return locator;
        }

        /**
         * Define el valor de la propiedad locator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocator(String value) {
            this.locator = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="currentFrameString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class WhetherThisFrameMatchFrameExpression
        implements ToString
    {

        @XmlAttribute(name = "currentFrameString", required = true)
        protected String currentFrameString;
        @XmlAttribute(name = "target", required = true)
        protected String target;

        /**
         * Obtiene el valor de la propiedad currentFrameString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentFrameString() {
            return currentFrameString;
        }

        /**
         * Define el valor de la propiedad currentFrameString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentFrameString(String value) {
            this.currentFrameString = value;
        }

        /**
         * Obtiene el valor de la propiedad target.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * Define el valor de la propiedad target.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
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
                String theCurrentFrameString;
                theCurrentFrameString = this.getCurrentFrameString();
                strategy.appendField(locator, this, "currentFrameString", buffer, theCurrentFrameString);
            }
            {
                String theTarget;
                theTarget = this.getTarget();
                strategy.appendField(locator, this, "target", buffer, theTarget);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="currentWindowString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class WhetherThisWindowMatchWindowExpression
        implements ToString
    {

        @XmlAttribute(name = "currentWindowString", required = true)
        protected String currentWindowString;
        @XmlAttribute(name = "target", required = true)
        protected String target;

        /**
         * Obtiene el valor de la propiedad currentWindowString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentWindowString() {
            return currentWindowString;
        }

        /**
         * Define el valor de la propiedad currentWindowString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentWindowString(String value) {
            this.currentWindowString = value;
        }

        /**
         * Obtiene el valor de la propiedad target.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * Define el valor de la propiedad target.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
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
                String theCurrentWindowString;
                theCurrentWindowString = this.getCurrentWindowString();
                strategy.appendField(locator, this, "currentWindowString", buffer, theCurrentWindowString);
            }
            {
                String theTarget;
                theTarget = this.getTarget();
                strategy.appendField(locator, this, "target", buffer, theTarget);
            }
            return buffer;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="xpath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class XpathCount
        implements ToString
    {

        @XmlAttribute(name = "xpath", required = true)
        protected String xpath;
        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;

        /**
         * Obtiene el valor de la propiedad xpath.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXpath() {
            return xpath;
        }

        /**
         * Define el valor de la propiedad xpath.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXpath(String value) {
            this.xpath = value;
        }

        /**
         * Obtiene el valor de la propiedad pattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Define el valor de la propiedad pattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
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
                String theXpath;
                theXpath = this.getXpath();
                strategy.appendField(locator, this, "xpath", buffer, theXpath);
            }
            {
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            return buffer;
        }

    }

}
