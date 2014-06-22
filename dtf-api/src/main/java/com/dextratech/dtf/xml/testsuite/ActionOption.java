//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.22 a las 12:48:00 AM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *           &lt;element name="field" type="{http://www.dextratech.com/testsuite}Field" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="custom" type="{http://www.dextratech.com/testsuite}GenericCommand" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="include" type="{http://www.dextratech.com/testsuite}Include" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="onload" type="{http://www.dextratech.com/testsuite}Onload" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="captureScreenshot" type="{http://www.dextratech.com/testsuite}CaptureScreenshot" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="assertion" type="{http://www.dextratech.com/testsuite}AssertionAction" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="echo" type="{http://www.dextratech.com/testsuite}Echo" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="addLocationStrategy" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="strategyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="functionDefinition" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="addScript" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="scriptContent" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="scriptTagId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="addSelection" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="optionLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="allowNativeXpath" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="allow" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="answerOnNextPrompt" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="answer" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="assignId" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="identifier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="break" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="check" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="chooseCancelOnNextConfirmation" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="chooseOkOnNextConfirmation" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="close" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="createCookie" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="nameValuePair" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="optionsString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="deleteAllVisibleCookies" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="deleteCookie" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="optionsString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="deselectPopUp" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="dragAndDrop" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="movementsString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="dragAndDropToObject" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locatorOfObjectToBeDragged" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="locatorOfDragDestinationObject" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="dragdrop" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="movementsString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="fireEvent" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="eventName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="focus" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="highlight" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="ignoreAttributesWithoutValue" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="ignore" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="open" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="openWindow" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="windowID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="pause" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="waitTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="removeAllSelections" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="removeScript" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="scriptTagId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="removeSelection" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="optionLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="rollup" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="rollupName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="kwargs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="runScript" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="script" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="select" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="optionLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="selectFrame" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="selectPopUp" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="windowID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="selectWindow" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="windowID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="setBrowserLogLevel" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="logLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="setCursorPosition" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="setMouseSpeed" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="pixels" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="setSpeed" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="setTimeout" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="timeout" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="submit" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="formLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="type" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="typeKeys" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="uncheck" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="useXpathLibrary" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="libraryName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="click" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="clickAndWait" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="clickAt" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="doubleClick" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="doubleClickAt" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="contextMenu" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="contextMenuAt" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseDown" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseDownAt" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseDownRight" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseDownRightAt" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseMove" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseMoveAt" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseOut" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseOver" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseUp" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseUpAt" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseUpRight" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="mouseUpRightAt" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="goBack" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="refresh" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="windowFocus" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="windowMaximize" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="store" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeAlert" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeAlertPresent" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeAllButtons" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeAllFields" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeAllLinks" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeAllWindowIds" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeAllWindowNames" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeAllWindowTitles" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeAttribute" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="attributeLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeAttributeFromAllWindows" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="attributeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeBodyText" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeChecked" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeConfirmation" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeConfirmationPresent" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeCookie" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeCookieByName" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeCookiePresent" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeCursorPosition" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeEditable" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeElementHeight" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeElementIndex" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeElementPositionLeft" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeElementPositionTop" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeElementPresent" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeElementWidth" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeEval" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="script" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeExpression" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeHtmlSource" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeLocation" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeMouseSpeed" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storePrompt" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storePromptPresent" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSelectedId" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSelectedIds" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSelectedIndex" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSelectedIndexes" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSelectedLabel" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSelectedLabels" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSelectedValue" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSelectedValues" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSelectOptions" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSomethingSelected" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeSpeed" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeTable" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="tableCellAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeText" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeTextPresent" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeTitle" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeValue" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeVisible" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="storeXpathCount" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="xpath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="altKeyDown" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="altKeyUp" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="controlKeyDown" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="controlKeyUp" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="metaKeyDown" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="metaKeyUp" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="shiftKeyDown" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="shiftKeyUp" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="keyDown" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="keySequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="keyPress" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="keySequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="keyUp" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.dextratech.com/testsuite}Action">
 *                   &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="keySequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
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
    "fieldOrCustomOrInclude"
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
        @XmlElement(name = "custom", type = GenericCommand.class),
        @XmlElement(name = "include", type = Include.class),
        @XmlElement(name = "onload", type = Onload.class),
        @XmlElement(name = "captureScreenshot", type = CaptureScreenshot.class),
        @XmlElement(name = "assertion", type = AssertionAction.class),
        @XmlElement(name = "echo", type = Echo.class),
        @XmlElement(name = "addLocationStrategy", type = ActionOption.AddLocationStrategy.class),
        @XmlElement(name = "addScript", type = ActionOption.AddScript.class),
        @XmlElement(name = "addSelection", type = ActionOption.AddSelection.class),
        @XmlElement(name = "allowNativeXpath", type = ActionOption.AllowNativeXpath.class),
        @XmlElement(name = "answerOnNextPrompt", type = ActionOption.AnswerOnNextPrompt.class),
        @XmlElement(name = "assignId", type = ActionOption.AssignId.class),
        @XmlElement(name = "break", type = ActionOption.Break.class),
        @XmlElement(name = "check", type = ActionOption.Check.class),
        @XmlElement(name = "chooseCancelOnNextConfirmation", type = ActionOption.ChooseCancelOnNextConfirmation.class),
        @XmlElement(name = "chooseOkOnNextConfirmation", type = ActionOption.ChooseOkOnNextConfirmation.class),
        @XmlElement(name = "close", type = ActionOption.Close.class),
        @XmlElement(name = "createCookie", type = ActionOption.CreateCookie.class),
        @XmlElement(name = "deleteAllVisibleCookies", type = ActionOption.DeleteAllVisibleCookies.class),
        @XmlElement(name = "deleteCookie", type = ActionOption.DeleteCookie.class),
        @XmlElement(name = "deselectPopUp", type = ActionOption.DeselectPopUp.class),
        @XmlElement(name = "dragAndDrop", type = ActionOption.DragAndDrop.class),
        @XmlElement(name = "dragAndDropToObject", type = ActionOption.DragAndDropToObject.class),
        @XmlElement(name = "dragdrop", type = ActionOption.Dragdrop.class),
        @XmlElement(name = "fireEvent", type = ActionOption.FireEvent.class),
        @XmlElement(name = "focus", type = ActionOption.Focus.class),
        @XmlElement(name = "highlight", type = ActionOption.Highlight.class),
        @XmlElement(name = "ignoreAttributesWithoutValue", type = ActionOption.IgnoreAttributesWithoutValue.class),
        @XmlElement(name = "open", type = ActionOption.Open.class),
        @XmlElement(name = "openWindow", type = ActionOption.OpenWindow.class),
        @XmlElement(name = "pause", type = ActionOption.Pause.class),
        @XmlElement(name = "removeAllSelections", type = ActionOption.RemoveAllSelections.class),
        @XmlElement(name = "removeScript", type = ActionOption.RemoveScript.class),
        @XmlElement(name = "removeSelection", type = ActionOption.RemoveSelection.class),
        @XmlElement(name = "rollup", type = ActionOption.Rollup.class),
        @XmlElement(name = "runScript", type = ActionOption.RunScript.class),
        @XmlElement(name = "select", type = ActionOption.Select.class),
        @XmlElement(name = "selectFrame", type = ActionOption.SelectFrame.class),
        @XmlElement(name = "selectPopUp", type = ActionOption.SelectPopUp.class),
        @XmlElement(name = "selectWindow", type = ActionOption.SelectWindow.class),
        @XmlElement(name = "setBrowserLogLevel", type = ActionOption.SetBrowserLogLevel.class),
        @XmlElement(name = "setCursorPosition", type = ActionOption.SetCursorPosition.class),
        @XmlElement(name = "setMouseSpeed", type = ActionOption.SetMouseSpeed.class),
        @XmlElement(name = "setSpeed", type = ActionOption.SetSpeed.class),
        @XmlElement(name = "setTimeout", type = ActionOption.SetTimeout.class),
        @XmlElement(name = "submit", type = ActionOption.Submit.class),
        @XmlElement(name = "type", type = ActionOption.Type.class),
        @XmlElement(name = "typeKeys", type = ActionOption.TypeKeys.class),
        @XmlElement(name = "uncheck", type = ActionOption.Uncheck.class),
        @XmlElement(name = "useXpathLibrary", type = ActionOption.UseXpathLibrary.class),
        @XmlElement(name = "click", type = ActionOption.Click.class),
        @XmlElement(name = "clickAndWait", type = ActionOption.ClickAndWait.class),
        @XmlElement(name = "clickAt", type = ActionOption.ClickAt.class),
        @XmlElement(name = "doubleClick", type = ActionOption.DoubleClick.class),
        @XmlElement(name = "doubleClickAt", type = ActionOption.DoubleClickAt.class),
        @XmlElement(name = "contextMenu", type = ActionOption.ContextMenu.class),
        @XmlElement(name = "contextMenuAt", type = ActionOption.ContextMenuAt.class),
        @XmlElement(name = "mouseDown", type = ActionOption.MouseDown.class),
        @XmlElement(name = "mouseDownAt", type = ActionOption.MouseDownAt.class),
        @XmlElement(name = "mouseDownRight", type = ActionOption.MouseDownRight.class),
        @XmlElement(name = "mouseDownRightAt", type = ActionOption.MouseDownRightAt.class),
        @XmlElement(name = "mouseMove", type = ActionOption.MouseMove.class),
        @XmlElement(name = "mouseMoveAt", type = ActionOption.MouseMoveAt.class),
        @XmlElement(name = "mouseOut", type = ActionOption.MouseOut.class),
        @XmlElement(name = "mouseOver", type = ActionOption.MouseOver.class),
        @XmlElement(name = "mouseUp", type = ActionOption.MouseUp.class),
        @XmlElement(name = "mouseUpAt", type = ActionOption.MouseUpAt.class),
        @XmlElement(name = "mouseUpRight", type = ActionOption.MouseUpRight.class),
        @XmlElement(name = "mouseUpRightAt", type = ActionOption.MouseUpRightAt.class),
        @XmlElement(name = "goBack", type = ActionOption.GoBack.class),
        @XmlElement(name = "refresh", type = ActionOption.Refresh.class),
        @XmlElement(name = "windowFocus", type = ActionOption.WindowFocus.class),
        @XmlElement(name = "windowMaximize", type = ActionOption.WindowMaximize.class),
        @XmlElement(name = "store", type = ActionOption.Store.class),
        @XmlElement(name = "storeAlert", type = ActionOption.StoreAlert.class),
        @XmlElement(name = "storeAlertPresent", type = ActionOption.StoreAlertPresent.class),
        @XmlElement(name = "storeAllButtons", type = ActionOption.StoreAllButtons.class),
        @XmlElement(name = "storeAllFields", type = ActionOption.StoreAllFields.class),
        @XmlElement(name = "storeAllLinks", type = ActionOption.StoreAllLinks.class),
        @XmlElement(name = "storeAllWindowIds", type = ActionOption.StoreAllWindowIds.class),
        @XmlElement(name = "storeAllWindowNames", type = ActionOption.StoreAllWindowNames.class),
        @XmlElement(name = "storeAllWindowTitles", type = ActionOption.StoreAllWindowTitles.class),
        @XmlElement(name = "storeAttribute", type = ActionOption.StoreAttribute.class),
        @XmlElement(name = "storeAttributeFromAllWindows", type = ActionOption.StoreAttributeFromAllWindows.class),
        @XmlElement(name = "storeBodyText", type = ActionOption.StoreBodyText.class),
        @XmlElement(name = "storeChecked", type = ActionOption.StoreChecked.class),
        @XmlElement(name = "storeConfirmation", type = ActionOption.StoreConfirmation.class),
        @XmlElement(name = "storeConfirmationPresent", type = ActionOption.StoreConfirmationPresent.class),
        @XmlElement(name = "storeCookie", type = ActionOption.StoreCookie.class),
        @XmlElement(name = "storeCookieByName", type = ActionOption.StoreCookieByName.class),
        @XmlElement(name = "storeCookiePresent", type = ActionOption.StoreCookiePresent.class),
        @XmlElement(name = "storeCursorPosition", type = ActionOption.StoreCursorPosition.class),
        @XmlElement(name = "storeEditable", type = ActionOption.StoreEditable.class),
        @XmlElement(name = "storeElementHeight", type = ActionOption.StoreElementHeight.class),
        @XmlElement(name = "storeElementIndex", type = ActionOption.StoreElementIndex.class),
        @XmlElement(name = "storeElementPositionLeft", type = ActionOption.StoreElementPositionLeft.class),
        @XmlElement(name = "storeElementPositionTop", type = ActionOption.StoreElementPositionTop.class),
        @XmlElement(name = "storeElementPresent", type = ActionOption.StoreElementPresent.class),
        @XmlElement(name = "storeElementWidth", type = ActionOption.StoreElementWidth.class),
        @XmlElement(name = "storeEval", type = ActionOption.StoreEval.class),
        @XmlElement(name = "storeExpression", type = ActionOption.StoreExpression.class),
        @XmlElement(name = "storeHtmlSource", type = ActionOption.StoreHtmlSource.class),
        @XmlElement(name = "storeLocation", type = ActionOption.StoreLocation.class),
        @XmlElement(name = "storeMouseSpeed", type = ActionOption.StoreMouseSpeed.class),
        @XmlElement(name = "storePrompt", type = ActionOption.StorePrompt.class),
        @XmlElement(name = "storePromptPresent", type = ActionOption.StorePromptPresent.class),
        @XmlElement(name = "storeSelectedId", type = ActionOption.StoreSelectedId.class),
        @XmlElement(name = "storeSelectedIds", type = ActionOption.StoreSelectedIds.class),
        @XmlElement(name = "storeSelectedIndex", type = ActionOption.StoreSelectedIndex.class),
        @XmlElement(name = "storeSelectedIndexes", type = ActionOption.StoreSelectedIndexes.class),
        @XmlElement(name = "storeSelectedLabel", type = ActionOption.StoreSelectedLabel.class),
        @XmlElement(name = "storeSelectedLabels", type = ActionOption.StoreSelectedLabels.class),
        @XmlElement(name = "storeSelectedValue", type = ActionOption.StoreSelectedValue.class),
        @XmlElement(name = "storeSelectedValues", type = ActionOption.StoreSelectedValues.class),
        @XmlElement(name = "storeSelectOptions", type = ActionOption.StoreSelectOptions.class),
        @XmlElement(name = "storeSomethingSelected", type = ActionOption.StoreSomethingSelected.class),
        @XmlElement(name = "storeSpeed", type = ActionOption.StoreSpeed.class),
        @XmlElement(name = "storeTable", type = ActionOption.StoreTable.class),
        @XmlElement(name = "storeText", type = ActionOption.StoreText.class),
        @XmlElement(name = "storeTextPresent", type = ActionOption.StoreTextPresent.class),
        @XmlElement(name = "storeTitle", type = ActionOption.StoreTitle.class),
        @XmlElement(name = "storeValue", type = ActionOption.StoreValue.class),
        @XmlElement(name = "storeVisible", type = ActionOption.StoreVisible.class),
        @XmlElement(name = "storeXpathCount", type = ActionOption.StoreXpathCount.class),
        @XmlElement(name = "altKeyDown", type = ActionOption.AltKeyDown.class),
        @XmlElement(name = "altKeyUp", type = ActionOption.AltKeyUp.class),
        @XmlElement(name = "controlKeyDown", type = ActionOption.ControlKeyDown.class),
        @XmlElement(name = "controlKeyUp", type = ActionOption.ControlKeyUp.class),
        @XmlElement(name = "metaKeyDown", type = ActionOption.MetaKeyDown.class),
        @XmlElement(name = "metaKeyUp", type = ActionOption.MetaKeyUp.class),
        @XmlElement(name = "shiftKeyDown", type = ActionOption.ShiftKeyDown.class),
        @XmlElement(name = "shiftKeyUp", type = ActionOption.ShiftKeyUp.class),
        @XmlElement(name = "keyDown", type = ActionOption.KeyDown.class),
        @XmlElement(name = "keyPress", type = ActionOption.KeyPress.class),
        @XmlElement(name = "keyUp", type = ActionOption.KeyUp.class)
    })
    protected List<Object> fieldOrCustomOrInclude;

    /**
     * Gets the value of the fieldOrCustomOrInclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldOrCustomOrInclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldOrCustomOrInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * {@link GenericCommand }
     * {@link Include }
     * {@link Onload }
     * {@link CaptureScreenshot }
     * {@link AssertionAction }
     * {@link Echo }
     * {@link ActionOption.AddLocationStrategy }
     * {@link ActionOption.AddScript }
     * {@link ActionOption.AddSelection }
     * {@link ActionOption.AllowNativeXpath }
     * {@link ActionOption.AnswerOnNextPrompt }
     * {@link ActionOption.AssignId }
     * {@link ActionOption.Break }
     * {@link ActionOption.Check }
     * {@link ActionOption.ChooseCancelOnNextConfirmation }
     * {@link ActionOption.ChooseOkOnNextConfirmation }
     * {@link ActionOption.Close }
     * {@link ActionOption.CreateCookie }
     * {@link ActionOption.DeleteAllVisibleCookies }
     * {@link ActionOption.DeleteCookie }
     * {@link ActionOption.DeselectPopUp }
     * {@link ActionOption.DragAndDrop }
     * {@link ActionOption.DragAndDropToObject }
     * {@link ActionOption.Dragdrop }
     * {@link ActionOption.FireEvent }
     * {@link ActionOption.Focus }
     * {@link ActionOption.Highlight }
     * {@link ActionOption.IgnoreAttributesWithoutValue }
     * {@link ActionOption.Open }
     * {@link ActionOption.OpenWindow }
     * {@link ActionOption.Pause }
     * {@link ActionOption.RemoveAllSelections }
     * {@link ActionOption.RemoveScript }
     * {@link ActionOption.RemoveSelection }
     * {@link ActionOption.Rollup }
     * {@link ActionOption.RunScript }
     * {@link ActionOption.Select }
     * {@link ActionOption.SelectFrame }
     * {@link ActionOption.SelectPopUp }
     * {@link ActionOption.SelectWindow }
     * {@link ActionOption.SetBrowserLogLevel }
     * {@link ActionOption.SetCursorPosition }
     * {@link ActionOption.SetMouseSpeed }
     * {@link ActionOption.SetSpeed }
     * {@link ActionOption.SetTimeout }
     * {@link ActionOption.Submit }
     * {@link ActionOption.Type }
     * {@link ActionOption.TypeKeys }
     * {@link ActionOption.Uncheck }
     * {@link ActionOption.UseXpathLibrary }
     * {@link ActionOption.Click }
     * {@link ActionOption.ClickAndWait }
     * {@link ActionOption.ClickAt }
     * {@link ActionOption.DoubleClick }
     * {@link ActionOption.DoubleClickAt }
     * {@link ActionOption.ContextMenu }
     * {@link ActionOption.ContextMenuAt }
     * {@link ActionOption.MouseDown }
     * {@link ActionOption.MouseDownAt }
     * {@link ActionOption.MouseDownRight }
     * {@link ActionOption.MouseDownRightAt }
     * {@link ActionOption.MouseMove }
     * {@link ActionOption.MouseMoveAt }
     * {@link ActionOption.MouseOut }
     * {@link ActionOption.MouseOver }
     * {@link ActionOption.MouseUp }
     * {@link ActionOption.MouseUpAt }
     * {@link ActionOption.MouseUpRight }
     * {@link ActionOption.MouseUpRightAt }
     * {@link ActionOption.GoBack }
     * {@link ActionOption.Refresh }
     * {@link ActionOption.WindowFocus }
     * {@link ActionOption.WindowMaximize }
     * {@link ActionOption.Store }
     * {@link ActionOption.StoreAlert }
     * {@link ActionOption.StoreAlertPresent }
     * {@link ActionOption.StoreAllButtons }
     * {@link ActionOption.StoreAllFields }
     * {@link ActionOption.StoreAllLinks }
     * {@link ActionOption.StoreAllWindowIds }
     * {@link ActionOption.StoreAllWindowNames }
     * {@link ActionOption.StoreAllWindowTitles }
     * {@link ActionOption.StoreAttribute }
     * {@link ActionOption.StoreAttributeFromAllWindows }
     * {@link ActionOption.StoreBodyText }
     * {@link ActionOption.StoreChecked }
     * {@link ActionOption.StoreConfirmation }
     * {@link ActionOption.StoreConfirmationPresent }
     * {@link ActionOption.StoreCookie }
     * {@link ActionOption.StoreCookieByName }
     * {@link ActionOption.StoreCookiePresent }
     * {@link ActionOption.StoreCursorPosition }
     * {@link ActionOption.StoreEditable }
     * {@link ActionOption.StoreElementHeight }
     * {@link ActionOption.StoreElementIndex }
     * {@link ActionOption.StoreElementPositionLeft }
     * {@link ActionOption.StoreElementPositionTop }
     * {@link ActionOption.StoreElementPresent }
     * {@link ActionOption.StoreElementWidth }
     * {@link ActionOption.StoreEval }
     * {@link ActionOption.StoreExpression }
     * {@link ActionOption.StoreHtmlSource }
     * {@link ActionOption.StoreLocation }
     * {@link ActionOption.StoreMouseSpeed }
     * {@link ActionOption.StorePrompt }
     * {@link ActionOption.StorePromptPresent }
     * {@link ActionOption.StoreSelectedId }
     * {@link ActionOption.StoreSelectedIds }
     * {@link ActionOption.StoreSelectedIndex }
     * {@link ActionOption.StoreSelectedIndexes }
     * {@link ActionOption.StoreSelectedLabel }
     * {@link ActionOption.StoreSelectedLabels }
     * {@link ActionOption.StoreSelectedValue }
     * {@link ActionOption.StoreSelectedValues }
     * {@link ActionOption.StoreSelectOptions }
     * {@link ActionOption.StoreSomethingSelected }
     * {@link ActionOption.StoreSpeed }
     * {@link ActionOption.StoreTable }
     * {@link ActionOption.StoreText }
     * {@link ActionOption.StoreTextPresent }
     * {@link ActionOption.StoreTitle }
     * {@link ActionOption.StoreValue }
     * {@link ActionOption.StoreVisible }
     * {@link ActionOption.StoreXpathCount }
     * {@link ActionOption.AltKeyDown }
     * {@link ActionOption.AltKeyUp }
     * {@link ActionOption.ControlKeyDown }
     * {@link ActionOption.ControlKeyUp }
     * {@link ActionOption.MetaKeyDown }
     * {@link ActionOption.MetaKeyUp }
     * {@link ActionOption.ShiftKeyDown }
     * {@link ActionOption.ShiftKeyUp }
     * {@link ActionOption.KeyDown }
     * {@link ActionOption.KeyPress }
     * {@link ActionOption.KeyUp }
     * 
     * 
     */
    public List<Object> getFieldOrCustomOrInclude() {
        if (fieldOrCustomOrInclude == null) {
            fieldOrCustomOrInclude = new ArrayList<Object>();
        }
        return this.fieldOrCustomOrInclude;
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
            List<Object> theFieldOrCustomOrInclude;
            theFieldOrCustomOrInclude = (((this.fieldOrCustomOrInclude!= null)&&(!this.fieldOrCustomOrInclude.isEmpty()))?this.getFieldOrCustomOrInclude():null);
            strategy.appendField(locator, this, "fieldOrCustomOrInclude", buffer, theFieldOrCustomOrInclude);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="strategyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="functionDefinition" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AddLocationStrategy
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "strategyName", required = true)
        protected String strategyName;
        @XmlAttribute(name = "functionDefinition", required = true)
        protected String functionDefinition;

        /**
         * Obtiene el valor de la propiedad strategyName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrategyName() {
            return strategyName;
        }

        /**
         * Define el valor de la propiedad strategyName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrategyName(String value) {
            this.strategyName = value;
        }

        /**
         * Obtiene el valor de la propiedad functionDefinition.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFunctionDefinition() {
            return functionDefinition;
        }

        /**
         * Define el valor de la propiedad functionDefinition.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFunctionDefinition(String value) {
            this.functionDefinition = value;
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
                String theStrategyName;
                theStrategyName = this.getStrategyName();
                strategy.appendField(locator, this, "strategyName", buffer, theStrategyName);
            }
            {
                String theFunctionDefinition;
                theFunctionDefinition = this.getFunctionDefinition();
                strategy.appendField(locator, this, "functionDefinition", buffer, theFunctionDefinition);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="scriptContent" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="scriptTagId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AddScript
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "scriptContent", required = true)
        protected String scriptContent;
        @XmlAttribute(name = "scriptTagId", required = true)
        protected String scriptTagId;

        /**
         * Obtiene el valor de la propiedad scriptContent.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScriptContent() {
            return scriptContent;
        }

        /**
         * Define el valor de la propiedad scriptContent.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScriptContent(String value) {
            this.scriptContent = value;
        }

        /**
         * Obtiene el valor de la propiedad scriptTagId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScriptTagId() {
            return scriptTagId;
        }

        /**
         * Define el valor de la propiedad scriptTagId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScriptTagId(String value) {
            this.scriptTagId = value;
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
                String theScriptContent;
                theScriptContent = this.getScriptContent();
                strategy.appendField(locator, this, "scriptContent", buffer, theScriptContent);
            }
            {
                String theScriptTagId;
                theScriptTagId = this.getScriptTagId();
                strategy.appendField(locator, this, "scriptTagId", buffer, theScriptTagId);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optionLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AddSelection
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "optionLocator", required = true)
        protected String optionLocator;

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
            super.appendFields(locator, buffer, strategy);
            {
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="allow" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllowNativeXpath
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "allow", required = true)
        protected String allow;

        /**
         * Obtiene el valor de la propiedad allow.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllow() {
            return allow;
        }

        /**
         * Define el valor de la propiedad allow.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllow(String value) {
            this.allow = value;
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
                String theAllow;
                theAllow = this.getAllow();
                strategy.appendField(locator, this, "allow", buffer, theAllow);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AltKeyDown
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AltKeyUp
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="answer" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AnswerOnNextPrompt
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "answer", required = true)
        protected String answer;

        /**
         * Obtiene el valor de la propiedad answer.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnswer() {
            return answer;
        }

        /**
         * Define el valor de la propiedad answer.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnswer(String value) {
            this.answer = value;
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
                String theAnswer;
                theAnswer = this.getAnswer();
                strategy.appendField(locator, this, "answer", buffer, theAnswer);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="identifier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AssignId
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "identifier", required = true)
        protected String identifier;

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
         * Obtiene el valor de la propiedad identifier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * Define el valor de la propiedad identifier.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifier(String value) {
            this.identifier = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theIdentifier;
                theIdentifier = this.getIdentifier();
                strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Break
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Check
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ChooseCancelOnNextConfirmation
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ChooseOkOnNextConfirmation
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Click
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ClickAndWait
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ClickAt
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "coordString", required = true)
        protected String coordString;

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
         * Obtiene el valor de la propiedad coordString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoordString() {
            return coordString;
        }

        /**
         * Define el valor de la propiedad coordString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoordString(String value) {
            this.coordString = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theCoordString;
                theCoordString = this.getCoordString();
                strategy.appendField(locator, this, "coordString", buffer, theCoordString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Close
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContextMenu
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContextMenuAt
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "coordString", required = true)
        protected String coordString;

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
         * Obtiene el valor de la propiedad coordString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoordString() {
            return coordString;
        }

        /**
         * Define el valor de la propiedad coordString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoordString(String value) {
            this.coordString = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theCoordString;
                theCoordString = this.getCoordString();
                strategy.appendField(locator, this, "coordString", buffer, theCoordString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ControlKeyDown
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ControlKeyUp
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="nameValuePair" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optionsString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CreateCookie
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "nameValuePair", required = true)
        protected String nameValuePair;
        @XmlAttribute(name = "optionsString", required = true)
        protected String optionsString;

        /**
         * Obtiene el valor de la propiedad nameValuePair.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameValuePair() {
            return nameValuePair;
        }

        /**
         * Define el valor de la propiedad nameValuePair.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameValuePair(String value) {
            this.nameValuePair = value;
        }

        /**
         * Obtiene el valor de la propiedad optionsString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionsString() {
            return optionsString;
        }

        /**
         * Define el valor de la propiedad optionsString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionsString(String value) {
            this.optionsString = value;
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
                String theNameValuePair;
                theNameValuePair = this.getNameValuePair();
                strategy.appendField(locator, this, "nameValuePair", buffer, theNameValuePair);
            }
            {
                String theOptionsString;
                theOptionsString = this.getOptionsString();
                strategy.appendField(locator, this, "optionsString", buffer, theOptionsString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DeleteAllVisibleCookies
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optionsString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DeleteCookie
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "optionsString", required = true)
        protected String optionsString;

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
         * Obtiene el valor de la propiedad optionsString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionsString() {
            return optionsString;
        }

        /**
         * Define el valor de la propiedad optionsString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionsString(String value) {
            this.optionsString = value;
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
                String theName;
                theName = this.getName();
                strategy.appendField(locator, this, "name", buffer, theName);
            }
            {
                String theOptionsString;
                theOptionsString = this.getOptionsString();
                strategy.appendField(locator, this, "optionsString", buffer, theOptionsString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DeselectPopUp
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DoubleClick
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DoubleClickAt
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "coordString", required = true)
        protected String coordString;

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
         * Obtiene el valor de la propiedad coordString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoordString() {
            return coordString;
        }

        /**
         * Define el valor de la propiedad coordString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoordString(String value) {
            this.coordString = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theCoordString;
                theCoordString = this.getCoordString();
                strategy.appendField(locator, this, "coordString", buffer, theCoordString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="movementsString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DragAndDrop
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "movementsString", required = true)
        protected String movementsString;

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
         * Obtiene el valor de la propiedad movementsString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMovementsString() {
            return movementsString;
        }

        /**
         * Define el valor de la propiedad movementsString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMovementsString(String value) {
            this.movementsString = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theMovementsString;
                theMovementsString = this.getMovementsString();
                strategy.appendField(locator, this, "movementsString", buffer, theMovementsString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locatorOfObjectToBeDragged" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="locatorOfDragDestinationObject" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DragAndDropToObject
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locatorOfObjectToBeDragged", required = true)
        protected String locatorOfObjectToBeDragged;
        @XmlAttribute(name = "locatorOfDragDestinationObject", required = true)
        protected String locatorOfDragDestinationObject;

        /**
         * Obtiene el valor de la propiedad locatorOfObjectToBeDragged.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocatorOfObjectToBeDragged() {
            return locatorOfObjectToBeDragged;
        }

        /**
         * Define el valor de la propiedad locatorOfObjectToBeDragged.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocatorOfObjectToBeDragged(String value) {
            this.locatorOfObjectToBeDragged = value;
        }

        /**
         * Obtiene el valor de la propiedad locatorOfDragDestinationObject.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocatorOfDragDestinationObject() {
            return locatorOfDragDestinationObject;
        }

        /**
         * Define el valor de la propiedad locatorOfDragDestinationObject.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocatorOfDragDestinationObject(String value) {
            this.locatorOfDragDestinationObject = value;
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
                String theLocatorOfObjectToBeDragged;
                theLocatorOfObjectToBeDragged = this.getLocatorOfObjectToBeDragged();
                strategy.appendField(locator, this, "locatorOfObjectToBeDragged", buffer, theLocatorOfObjectToBeDragged);
            }
            {
                String theLocatorOfDragDestinationObject;
                theLocatorOfDragDestinationObject = this.getLocatorOfDragDestinationObject();
                strategy.appendField(locator, this, "locatorOfDragDestinationObject", buffer, theLocatorOfDragDestinationObject);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="movementsString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Dragdrop
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "movementsString", required = true)
        protected String movementsString;

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
         * Obtiene el valor de la propiedad movementsString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMovementsString() {
            return movementsString;
        }

        /**
         * Define el valor de la propiedad movementsString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMovementsString(String value) {
            this.movementsString = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theMovementsString;
                theMovementsString = this.getMovementsString();
                strategy.appendField(locator, this, "movementsString", buffer, theMovementsString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="eventName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FireEvent
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "eventName", required = true)
        protected String eventName;

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
         * Obtiene el valor de la propiedad eventName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventName() {
            return eventName;
        }

        /**
         * Define el valor de la propiedad eventName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventName(String value) {
            this.eventName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theEventName;
                theEventName = this.getEventName();
                strategy.appendField(locator, this, "eventName", buffer, theEventName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Focus
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GoBack
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Highlight
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="ignore" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IgnoreAttributesWithoutValue
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "ignore", required = true)
        protected String ignore;

        /**
         * Obtiene el valor de la propiedad ignore.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIgnore() {
            return ignore;
        }

        /**
         * Define el valor de la propiedad ignore.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIgnore(String value) {
            this.ignore = value;
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
                String theIgnore;
                theIgnore = this.getIgnore();
                strategy.appendField(locator, this, "ignore", buffer, theIgnore);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="keySequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class KeyDown
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "keySequence", required = true)
        protected String keySequence;

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
         * Obtiene el valor de la propiedad keySequence.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeySequence() {
            return keySequence;
        }

        /**
         * Define el valor de la propiedad keySequence.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeySequence(String value) {
            this.keySequence = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theKeySequence;
                theKeySequence = this.getKeySequence();
                strategy.appendField(locator, this, "keySequence", buffer, theKeySequence);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="keySequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class KeyPress
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "keySequence", required = true)
        protected String keySequence;

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
         * Obtiene el valor de la propiedad keySequence.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeySequence() {
            return keySequence;
        }

        /**
         * Define el valor de la propiedad keySequence.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeySequence(String value) {
            this.keySequence = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theKeySequence;
                theKeySequence = this.getKeySequence();
                strategy.appendField(locator, this, "keySequence", buffer, theKeySequence);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="keySequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class KeyUp
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "keySequence", required = true)
        protected String keySequence;

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
         * Obtiene el valor de la propiedad keySequence.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeySequence() {
            return keySequence;
        }

        /**
         * Define el valor de la propiedad keySequence.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeySequence(String value) {
            this.keySequence = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theKeySequence;
                theKeySequence = this.getKeySequence();
                strategy.appendField(locator, this, "keySequence", buffer, theKeySequence);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MetaKeyDown
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MetaKeyUp
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseDown
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseDownAt
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "coordString", required = true)
        protected String coordString;

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
         * Obtiene el valor de la propiedad coordString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoordString() {
            return coordString;
        }

        /**
         * Define el valor de la propiedad coordString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoordString(String value) {
            this.coordString = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theCoordString;
                theCoordString = this.getCoordString();
                strategy.appendField(locator, this, "coordString", buffer, theCoordString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseDownRight
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseDownRightAt
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "coordString", required = true)
        protected String coordString;

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
         * Obtiene el valor de la propiedad coordString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoordString() {
            return coordString;
        }

        /**
         * Define el valor de la propiedad coordString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoordString(String value) {
            this.coordString = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theCoordString;
                theCoordString = this.getCoordString();
                strategy.appendField(locator, this, "coordString", buffer, theCoordString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseMove
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseMoveAt
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "coordString", required = true)
        protected String coordString;

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
         * Obtiene el valor de la propiedad coordString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoordString() {
            return coordString;
        }

        /**
         * Define el valor de la propiedad coordString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoordString(String value) {
            this.coordString = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theCoordString;
                theCoordString = this.getCoordString();
                strategy.appendField(locator, this, "coordString", buffer, theCoordString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseOut
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseOver
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseUp
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseUpAt
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "coordString", required = true)
        protected String coordString;

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
         * Obtiene el valor de la propiedad coordString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoordString() {
            return coordString;
        }

        /**
         * Define el valor de la propiedad coordString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoordString(String value) {
            this.coordString = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theCoordString;
                theCoordString = this.getCoordString();
                strategy.appendField(locator, this, "coordString", buffer, theCoordString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseUpRight
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="coordString" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MouseUpRightAt
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "coordString", required = true)
        protected String coordString;

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
         * Obtiene el valor de la propiedad coordString.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoordString() {
            return coordString;
        }

        /**
         * Define el valor de la propiedad coordString.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoordString(String value) {
            this.coordString = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theCoordString;
                theCoordString = this.getCoordString();
                strategy.appendField(locator, this, "coordString", buffer, theCoordString);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Open
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "url", required = true)
        protected String url;

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
                String theUrl;
                theUrl = this.getUrl();
                strategy.appendField(locator, this, "url", buffer, theUrl);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="windowID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OpenWindow
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "url", required = true)
        protected String url;
        @XmlAttribute(name = "windowID", required = true)
        protected String windowID;

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
         * Obtiene el valor de la propiedad windowID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWindowID() {
            return windowID;
        }

        /**
         * Define el valor de la propiedad windowID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWindowID(String value) {
            this.windowID = value;
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
                String theUrl;
                theUrl = this.getUrl();
                strategy.appendField(locator, this, "url", buffer, theUrl);
            }
            {
                String theWindowID;
                theWindowID = this.getWindowID();
                strategy.appendField(locator, this, "windowID", buffer, theWindowID);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="waitTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Pause
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "waitTime", required = true)
        protected String waitTime;

        /**
         * Obtiene el valor de la propiedad waitTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWaitTime() {
            return waitTime;
        }

        /**
         * Define el valor de la propiedad waitTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWaitTime(String value) {
            this.waitTime = value;
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
                String theWaitTime;
                theWaitTime = this.getWaitTime();
                strategy.appendField(locator, this, "waitTime", buffer, theWaitTime);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Refresh
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RemoveAllSelections
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="scriptTagId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RemoveScript
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "scriptTagId", required = true)
        protected String scriptTagId;

        /**
         * Obtiene el valor de la propiedad scriptTagId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScriptTagId() {
            return scriptTagId;
        }

        /**
         * Define el valor de la propiedad scriptTagId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScriptTagId(String value) {
            this.scriptTagId = value;
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
                String theScriptTagId;
                theScriptTagId = this.getScriptTagId();
                strategy.appendField(locator, this, "scriptTagId", buffer, theScriptTagId);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optionLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RemoveSelection
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "optionLocator", required = true)
        protected String optionLocator;

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
            super.appendFields(locator, buffer, strategy);
            {
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="rollupName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="kwargs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Rollup
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "rollupName", required = true)
        protected String rollupName;
        @XmlAttribute(name = "kwargs", required = true)
        protected String kwargs;

        /**
         * Obtiene el valor de la propiedad rollupName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRollupName() {
            return rollupName;
        }

        /**
         * Define el valor de la propiedad rollupName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRollupName(String value) {
            this.rollupName = value;
        }

        /**
         * Obtiene el valor de la propiedad kwargs.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKwargs() {
            return kwargs;
        }

        /**
         * Define el valor de la propiedad kwargs.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKwargs(String value) {
            this.kwargs = value;
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
                String theRollupName;
                theRollupName = this.getRollupName();
                strategy.appendField(locator, this, "rollupName", buffer, theRollupName);
            }
            {
                String theKwargs;
                theKwargs = this.getKwargs();
                strategy.appendField(locator, this, "kwargs", buffer, theKwargs);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="script" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RunScript
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "script", required = true)
        protected String script;

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
                String theScript;
                theScript = this.getScript();
                strategy.appendField(locator, this, "script", buffer, theScript);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optionLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Select
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectFrame
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="windowID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectPopUp
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "windowID", required = true)
        protected String windowID;

        /**
         * Obtiene el valor de la propiedad windowID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWindowID() {
            return windowID;
        }

        /**
         * Define el valor de la propiedad windowID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWindowID(String value) {
            this.windowID = value;
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
                String theWindowID;
                theWindowID = this.getWindowID();
                strategy.appendField(locator, this, "windowID", buffer, theWindowID);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="windowID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectWindow
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "windowID", required = true)
        protected String windowID;

        /**
         * Obtiene el valor de la propiedad windowID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWindowID() {
            return windowID;
        }

        /**
         * Define el valor de la propiedad windowID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWindowID(String value) {
            this.windowID = value;
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
                String theWindowID;
                theWindowID = this.getWindowID();
                strategy.appendField(locator, this, "windowID", buffer, theWindowID);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="logLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SetBrowserLogLevel
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "logLevel", required = true)
        protected String logLevel;

        /**
         * Obtiene el valor de la propiedad logLevel.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogLevel() {
            return logLevel;
        }

        /**
         * Define el valor de la propiedad logLevel.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogLevel(String value) {
            this.logLevel = value;
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
                String theLogLevel;
                theLogLevel = this.getLogLevel();
                strategy.appendField(locator, this, "logLevel", buffer, theLogLevel);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SetCursorPosition
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "position", required = true)
        protected String position;

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
         * Obtiene el valor de la propiedad position.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosition() {
            return position;
        }

        /**
         * Define el valor de la propiedad position.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosition(String value) {
            this.position = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String thePosition;
                thePosition = this.getPosition();
                strategy.appendField(locator, this, "position", buffer, thePosition);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="pixels" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SetMouseSpeed
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "pixels", required = true)
        protected String pixels;

        /**
         * Obtiene el valor de la propiedad pixels.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPixels() {
            return pixels;
        }

        /**
         * Define el valor de la propiedad pixels.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPixels(String value) {
            this.pixels = value;
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
                String thePixels;
                thePixels = this.getPixels();
                strategy.appendField(locator, this, "pixels", buffer, thePixels);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SetSpeed
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "value", required = true)
        protected String value;

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="timeout" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SetTimeout
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "timeout", required = true)
        protected String timeout;

        /**
         * Obtiene el valor de la propiedad timeout.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeout() {
            return timeout;
        }

        /**
         * Define el valor de la propiedad timeout.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeout(String value) {
            this.timeout = value;
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
                String theTimeout;
                theTimeout = this.getTimeout();
                strategy.appendField(locator, this, "timeout", buffer, theTimeout);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ShiftKeyDown
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ShiftKeyUp
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Store
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "expression", required = true)
        protected String expression;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theExpression;
                theExpression = this.getExpression();
                strategy.appendField(locator, this, "expression", buffer, theExpression);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreAlert
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreAlertPresent
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreAllButtons
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreAllFields
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreAllLinks
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreAllWindowIds
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreAllWindowNames
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreAllWindowTitles
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="attributeLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreAttribute
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "attributeLocator", required = true)
        protected String attributeLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theAttributeLocator;
                theAttributeLocator = this.getAttributeLocator();
                strategy.appendField(locator, this, "attributeLocator", buffer, theAttributeLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="attributeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreAttributeFromAllWindows
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "attributeName", required = true)
        protected String attributeName;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theAttributeName;
                theAttributeName = this.getAttributeName();
                strategy.appendField(locator, this, "attributeName", buffer, theAttributeName);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreBodyText
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreChecked
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreConfirmation
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreConfirmationPresent
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreCookie
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreCookieByName
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theName;
                theName = this.getName();
                strategy.appendField(locator, this, "name", buffer, theName);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreCookiePresent
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theName;
                theName = this.getName();
                strategy.appendField(locator, this, "name", buffer, theName);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreCursorPosition
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreEditable
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreElementHeight
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreElementIndex
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreElementPositionLeft
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreElementPositionTop
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreElementPresent
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreElementWidth
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="script" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreEval
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "script", required = true)
        protected String script;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theScript;
                theScript = this.getScript();
                strategy.appendField(locator, this, "script", buffer, theScript);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreExpression
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "expression", required = true)
        protected String expression;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theExpression;
                theExpression = this.getExpression();
                strategy.appendField(locator, this, "expression", buffer, theExpression);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreHtmlSource
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreLocation
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreMouseSpeed
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StorePrompt
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StorePromptPresent
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSelectOptions
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSelectedId
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSelectedIds
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSelectedIndex
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSelectedIndexes
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSelectedLabel
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSelectedLabels
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSelectedValue
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSelectedValues
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="selectLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSomethingSelected
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "selectLocator", required = true)
        protected String selectLocator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theSelectLocator;
                theSelectLocator = this.getSelectLocator();
                strategy.appendField(locator, this, "selectLocator", buffer, theSelectLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreSpeed
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="tableCellAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreTable
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "tableCellAddress", required = true)
        protected String tableCellAddress;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theTableCellAddress;
                theTableCellAddress = this.getTableCellAddress();
                strategy.appendField(locator, this, "tableCellAddress", buffer, theTableCellAddress);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreText
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreTextPresent
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "pattern", required = true)
        protected String pattern;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String thePattern;
                thePattern = this.getPattern();
                strategy.appendField(locator, this, "pattern", buffer, thePattern);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreTitle
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

        /**
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreValue
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreVisible
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="xpath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StoreXpathCount
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "xpath", required = true)
        protected String xpath;
        @XmlAttribute(name = "variableName", required = true)
        protected String variableName;

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
         * Obtiene el valor de la propiedad variableName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariableName() {
            return variableName;
        }

        /**
         * Define el valor de la propiedad variableName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariableName(String value) {
            this.variableName = value;
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
                String theXpath;
                theXpath = this.getXpath();
                strategy.appendField(locator, this, "xpath", buffer, theXpath);
            }
            {
                String theVariableName;
                theVariableName = this.getVariableName();
                strategy.appendField(locator, this, "variableName", buffer, theVariableName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="formLocator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Submit
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "formLocator", required = true)
        protected String formLocator;

        /**
         * Obtiene el valor de la propiedad formLocator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormLocator() {
            return formLocator;
        }

        /**
         * Define el valor de la propiedad formLocator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormLocator(String value) {
            this.formLocator = value;
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
                String theFormLocator;
                theFormLocator = this.getFormLocator();
                strategy.appendField(locator, this, "formLocator", buffer, theFormLocator);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Type
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "value", required = true)
        protected String value;

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
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TypeKeys
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "locator", required = true)
        protected String locator;
        @XmlAttribute(name = "value", required = true)
        protected String value;

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
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
                String theLocator;
                theLocator = this.getLocator();
                strategy.appendField(locator, this, "locator", buffer, theLocator);
            }
            {
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Uncheck
        extends Action
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
            super.appendFields(locator, buffer, strategy);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *       &lt;attribute name="libraryName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UseXpathLibrary
        extends Action
        implements ToString
    {

        @XmlAttribute(name = "libraryName", required = true)
        protected String libraryName;

        /**
         * Obtiene el valor de la propiedad libraryName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLibraryName() {
            return libraryName;
        }

        /**
         * Define el valor de la propiedad libraryName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLibraryName(String value) {
            this.libraryName = value;
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
                String theLibraryName;
                theLibraryName = this.getLibraryName();
                strategy.appendField(locator, this, "libraryName", buffer, theLibraryName);
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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class WindowFocus
        extends Action
        implements ToString
    {


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
     *     &lt;extension base="{http://www.dextratech.com/testsuite}Action">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class WindowMaximize
        extends Action
        implements ToString
    {


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
            return buffer;
        }

    }

}
