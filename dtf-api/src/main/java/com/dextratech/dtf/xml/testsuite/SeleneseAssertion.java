//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.09 a las 11:36:42 PM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para seleneseAssertion.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="seleneseAssertion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="assertErrorOnNext"/>
 *     &lt;enumeration value="assertNotErrorOnNext"/>
 *     &lt;enumeration value="verifyErrorOnNext"/>
 *     &lt;enumeration value="verifyNotErrorOnNext"/>
 *     &lt;enumeration value="waitForErrorOnNext"/>
 *     &lt;enumeration value="waitForNotErrorOnNext"/>
 *     &lt;enumeration value="assertFailureOnNext"/>
 *     &lt;enumeration value="assertNotFailureOnNext"/>
 *     &lt;enumeration value="verifyFailureOnNext"/>
 *     &lt;enumeration value="verifyNotFailureOnNext"/>
 *     &lt;enumeration value="waitForFailureOnNext"/>
 *     &lt;enumeration value="waitForNotFailureOnNext"/>
 *     &lt;enumeration value="assertSelected"/>
 *     &lt;enumeration value="assertNotSelected"/>
 *     &lt;enumeration value="verifySelected"/>
 *     &lt;enumeration value="verifyNotSelected"/>
 *     &lt;enumeration value="waitForSelected"/>
 *     &lt;enumeration value="waitForNotSelected"/>
 *     &lt;enumeration value="assertAlert"/>
 *     &lt;enumeration value="assertNotAlert"/>
 *     &lt;enumeration value="verifyAlert"/>
 *     &lt;enumeration value="verifyNotAlert"/>
 *     &lt;enumeration value="waitForAlert"/>
 *     &lt;enumeration value="waitForNotAlert"/>
 *     &lt;enumeration value="assertAllButtons"/>
 *     &lt;enumeration value="assertNotAllButtons"/>
 *     &lt;enumeration value="verifyAllButtons"/>
 *     &lt;enumeration value="verifyNotAllButtons"/>
 *     &lt;enumeration value="waitForAllButtons"/>
 *     &lt;enumeration value="waitForNotAllButtons"/>
 *     &lt;enumeration value="assertAllFields"/>
 *     &lt;enumeration value="assertNotAllFields"/>
 *     &lt;enumeration value="verifyAllFields"/>
 *     &lt;enumeration value="verifyNotAllFields"/>
 *     &lt;enumeration value="waitForAllFields"/>
 *     &lt;enumeration value="waitForNotAllFields"/>
 *     &lt;enumeration value="assertAllLinks"/>
 *     &lt;enumeration value="assertNotAllLinks"/>
 *     &lt;enumeration value="verifyAllLinks"/>
 *     &lt;enumeration value="verifyNotAllLinks"/>
 *     &lt;enumeration value="waitForAllLinks"/>
 *     &lt;enumeration value="waitForNotAllLinks"/>
 *     &lt;enumeration value="assertAttribute"/>
 *     &lt;enumeration value="assertNotAttribute"/>
 *     &lt;enumeration value="verifyAttribute"/>
 *     &lt;enumeration value="verifyNotAttribute"/>
 *     &lt;enumeration value="waitForAttribute"/>
 *     &lt;enumeration value="waitForNotAttribute"/>
 *     &lt;enumeration value="assertBodyText"/>
 *     &lt;enumeration value="assertNotBodyText"/>
 *     &lt;enumeration value="verifyBodyText"/>
 *     &lt;enumeration value="verifyNotBodyText"/>
 *     &lt;enumeration value="waitForBodyText"/>
 *     &lt;enumeration value="waitForNotBodyText"/>
 *     &lt;enumeration value="assertConfirmation"/>
 *     &lt;enumeration value="assertNotConfirmation"/>
 *     &lt;enumeration value="verifyConfirmation"/>
 *     &lt;enumeration value="verifyNotConfirmation"/>
 *     &lt;enumeration value="waitForConfirmation"/>
 *     &lt;enumeration value="waitForNotConfirmation"/>
 *     &lt;enumeration value="assertElementHeight"/>
 *     &lt;enumeration value="assertNotElementHeight"/>
 *     &lt;enumeration value="verifyElementHeight"/>
 *     &lt;enumeration value="verifyNotElementHeight"/>
 *     &lt;enumeration value="waitForElementHeight"/>
 *     &lt;enumeration value="waitForNotElementHeight"/>
 *     &lt;enumeration value="assertElementIndex"/>
 *     &lt;enumeration value="assertNotElementIndex"/>
 *     &lt;enumeration value="verifyElementIndex"/>
 *     &lt;enumeration value="verifyNotElementIndex"/>
 *     &lt;enumeration value="waitForElementIndex"/>
 *     &lt;enumeration value="waitForNotElementIndex"/>
 *     &lt;enumeration value="assertElementWidth"/>
 *     &lt;enumeration value="assertNotElementWidth"/>
 *     &lt;enumeration value="verifyElementWidth"/>
 *     &lt;enumeration value="verifyNotElementWidth"/>
 *     &lt;enumeration value="waitForElementWidth"/>
 *     &lt;enumeration value="waitForNotElementWidth"/>
 *     &lt;enumeration value="assertEval"/>
 *     &lt;enumeration value="assertNotEval"/>
 *     &lt;enumeration value="verifyEval"/>
 *     &lt;enumeration value="verifyNotEval"/>
 *     &lt;enumeration value="waitForEval"/>
 *     &lt;enumeration value="waitForNotEval"/>
 *     &lt;enumeration value="assertExpression"/>
 *     &lt;enumeration value="assertNotExpression"/>
 *     &lt;enumeration value="verifyExpression"/>
 *     &lt;enumeration value="verifyNotExpression"/>
 *     &lt;enumeration value="waitForExpression"/>
 *     &lt;enumeration value="waitForNotExpression"/>
 *     &lt;enumeration value="assertHtmlSource"/>
 *     &lt;enumeration value="assertNotHtmlSource"/>
 *     &lt;enumeration value="verifyHtmlSource"/>
 *     &lt;enumeration value="verifyNotHtmlSource"/>
 *     &lt;enumeration value="waitForHtmlSource"/>
 *     &lt;enumeration value="waitForNotHtmlSource"/>
 *     &lt;enumeration value="assertLocation"/>
 *     &lt;enumeration value="assertNotLocation"/>
 *     &lt;enumeration value="verifyLocation"/>
 *     &lt;enumeration value="verifyNotLocation"/>
 *     &lt;enumeration value="waitForLocation"/>
 *     &lt;enumeration value="waitForNotLocation"/>
 *     &lt;enumeration value="assertPrompt"/>
 *     &lt;enumeration value="assertNotPrompt"/>
 *     &lt;enumeration value="verifyPrompt"/>
 *     &lt;enumeration value="verifyNotPrompt"/>
 *     &lt;enumeration value="waitForPrompt"/>
 *     &lt;enumeration value="waitForNotPrompt"/>
 *     &lt;enumeration value="assertSelectedId"/>
 *     &lt;enumeration value="assertNotSelectedId"/>
 *     &lt;enumeration value="verifySelectedId"/>
 *     &lt;enumeration value="verifyNotSelectedId"/>
 *     &lt;enumeration value="waitForSelectedId"/>
 *     &lt;enumeration value="waitForNotSelectedId"/>
 *     &lt;enumeration value="assertSelectedIds"/>
 *     &lt;enumeration value="assertNotSelectedIds"/>
 *     &lt;enumeration value="verifySelectedIds"/>
 *     &lt;enumeration value="verifyNotSelectedIds"/>
 *     &lt;enumeration value="waitForSelectedIds"/>
 *     &lt;enumeration value="waitForNotSelectedIds"/>
 *     &lt;enumeration value="assertSelectedIndex"/>
 *     &lt;enumeration value="assertNotSelectedIndex"/>
 *     &lt;enumeration value="verifySelectedIndex"/>
 *     &lt;enumeration value="verifyNotSelectedIndex"/>
 *     &lt;enumeration value="waitForSelectedIndex"/>
 *     &lt;enumeration value="waitForNotSelectedIndex"/>
 *     &lt;enumeration value="assertSelectedIndexes"/>
 *     &lt;enumeration value="assertNotSelectedIndexes"/>
 *     &lt;enumeration value="verifySelectedIndexes"/>
 *     &lt;enumeration value="verifyNotSelectedIndexes"/>
 *     &lt;enumeration value="waitForSelectedIndexes"/>
 *     &lt;enumeration value="waitForNotSelectedIndexes"/>
 *     &lt;enumeration value="assertSelectedLabel"/>
 *     &lt;enumeration value="assertNotSelectedLabel"/>
 *     &lt;enumeration value="verifySelectedLabel"/>
 *     &lt;enumeration value="verifyNotSelectedLabel"/>
 *     &lt;enumeration value="waitForSelectedLabel"/>
 *     &lt;enumeration value="waitForNotSelectedLabel"/>
 *     &lt;enumeration value="assertSelectedLabels"/>
 *     &lt;enumeration value="assertNotSelectedLabels"/>
 *     &lt;enumeration value="verifySelectedLabels"/>
 *     &lt;enumeration value="verifyNotSelectedLabels"/>
 *     &lt;enumeration value="waitForSelectedLabels"/>
 *     &lt;enumeration value="waitForNotSelectedLabels"/>
 *     &lt;enumeration value="assertSelectedValue"/>
 *     &lt;enumeration value="assertNotSelectedValue"/>
 *     &lt;enumeration value="verifySelectedValue"/>
 *     &lt;enumeration value="verifyNotSelectedValue"/>
 *     &lt;enumeration value="waitForSelectedValue"/>
 *     &lt;enumeration value="waitForNotSelectedValue"/>
 *     &lt;enumeration value="assertSelectedValues"/>
 *     &lt;enumeration value="assertNotSelectedValues"/>
 *     &lt;enumeration value="verifySelectedValues"/>
 *     &lt;enumeration value="verifyNotSelectedValues"/>
 *     &lt;enumeration value="waitForSelectedValues"/>
 *     &lt;enumeration value="waitForNotSelectedValues"/>
 *     &lt;enumeration value="assertSelectOptions"/>
 *     &lt;enumeration value="assertNotSelectOptions"/>
 *     &lt;enumeration value="verifySelectOptions"/>
 *     &lt;enumeration value="verifyNotSelectOptions"/>
 *     &lt;enumeration value="waitForSelectOptions"/>
 *     &lt;enumeration value="waitForNotSelectOptions"/>
 *     &lt;enumeration value="assertSpeed"/>
 *     &lt;enumeration value="assertNotSpeed"/>
 *     &lt;enumeration value="verifySpeed"/>
 *     &lt;enumeration value="verifyNotSpeed"/>
 *     &lt;enumeration value="waitForSpeed"/>
 *     &lt;enumeration value="waitForNotSpeed"/>
 *     &lt;enumeration value="assertTable"/>
 *     &lt;enumeration value="assertNotTable"/>
 *     &lt;enumeration value="verifyTable"/>
 *     &lt;enumeration value="verifyNotTable"/>
 *     &lt;enumeration value="waitForTable"/>
 *     &lt;enumeration value="waitForNotTable"/>
 *     &lt;enumeration value="assertText"/>
 *     &lt;enumeration value="assertNotText"/>
 *     &lt;enumeration value="verifyText"/>
 *     &lt;enumeration value="verifyNotText"/>
 *     &lt;enumeration value="waitForText"/>
 *     &lt;enumeration value="waitForNotText"/>
 *     &lt;enumeration value="assertTitle"/>
 *     &lt;enumeration value="assertNotTitle"/>
 *     &lt;enumeration value="verifyTitle"/>
 *     &lt;enumeration value="verifyNotTitle"/>
 *     &lt;enumeration value="waitForTitle"/>
 *     &lt;enumeration value="waitForNotTitle"/>
 *     &lt;enumeration value="assertValue"/>
 *     &lt;enumeration value="assertNotValue"/>
 *     &lt;enumeration value="verifyValue"/>
 *     &lt;enumeration value="verifyNotValue"/>
 *     &lt;enumeration value="waitForValue"/>
 *     &lt;enumeration value="waitForNotValue"/>
 *     &lt;enumeration value="assertAlertPresent"/>
 *     &lt;enumeration value="assertAlertNotPresent"/>
 *     &lt;enumeration value="verifyAlertPresent"/>
 *     &lt;enumeration value="verifyAlertNotPresent"/>
 *     &lt;enumeration value="waitForAlertPresent"/>
 *     &lt;enumeration value="waitForAlertNotPresent"/>
 *     &lt;enumeration value="assertChecked"/>
 *     &lt;enumeration value="assertNotChecked"/>
 *     &lt;enumeration value="verifyChecked"/>
 *     &lt;enumeration value="verifyNotChecked"/>
 *     &lt;enumeration value="waitForChecked"/>
 *     &lt;enumeration value="waitForNotChecked"/>
 *     &lt;enumeration value="assertConfirmationPresent"/>
 *     &lt;enumeration value="assertConfirmationNotPresent"/>
 *     &lt;enumeration value="verifyConfirmationPresent"/>
 *     &lt;enumeration value="verifyConfirmationNotPresent"/>
 *     &lt;enumeration value="waitForConfirmationPresent"/>
 *     &lt;enumeration value="waitForConfirmationNotPresent"/>
 *     &lt;enumeration value="assertEditable"/>
 *     &lt;enumeration value="assertNotEditable"/>
 *     &lt;enumeration value="verifyEditable"/>
 *     &lt;enumeration value="verifyNotEditable"/>
 *     &lt;enumeration value="waitForEditable"/>
 *     &lt;enumeration value="waitForNotEditable"/>
 *     &lt;enumeration value="assertElementPresent"/>
 *     &lt;enumeration value="assertElementNotPresent"/>
 *     &lt;enumeration value="verifyElementPresent"/>
 *     &lt;enumeration value="verifyElementNotPresent"/>
 *     &lt;enumeration value="waitForElementPresent"/>
 *     &lt;enumeration value="waitForElementNotPresent"/>
 *     &lt;enumeration value="assertOrdered"/>
 *     &lt;enumeration value="assertNotOrdered"/>
 *     &lt;enumeration value="verifyOrdered"/>
 *     &lt;enumeration value="verifyNotOrdered"/>
 *     &lt;enumeration value="waitForOrdered"/>
 *     &lt;enumeration value="waitForNotOrdered"/>
 *     &lt;enumeration value="assertPromptPresent"/>
 *     &lt;enumeration value="assertPromptNotPresent"/>
 *     &lt;enumeration value="verifyPromptPresent"/>
 *     &lt;enumeration value="verifyPromptNotPresent"/>
 *     &lt;enumeration value="waitForPromptPresent"/>
 *     &lt;enumeration value="waitForPromptNotPresent"/>
 *     &lt;enumeration value="assertSomethingSelected"/>
 *     &lt;enumeration value="assertNotSomethingSelected"/>
 *     &lt;enumeration value="verifySomethingSelected"/>
 *     &lt;enumeration value="verifyNotSomethingSelected"/>
 *     &lt;enumeration value="waitForSomethingSelected"/>
 *     &lt;enumeration value="waitForNotSomethingSelected"/>
 *     &lt;enumeration value="assertTextPresent"/>
 *     &lt;enumeration value="assertTextNotPresent"/>
 *     &lt;enumeration value="verifyTextPresent"/>
 *     &lt;enumeration value="verifyTextNotPresent"/>
 *     &lt;enumeration value="waitForTextPresent"/>
 *     &lt;enumeration value="waitForTextNotPresent"/>
 *     &lt;enumeration value="assertVisible"/>
 *     &lt;enumeration value="assertNotVisible"/>
 *     &lt;enumeration value="verifyVisible"/>
 *     &lt;enumeration value="verifyNotVisible"/>
 *     &lt;enumeration value="waitForVisible"/>
 *     &lt;enumeration value="waitForNotVisible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "seleneseAssertion")
@XmlEnum
public enum SeleneseAssertion {

    @XmlEnumValue("assertErrorOnNext")
    ASSERT_ERROR_ON_NEXT("assertErrorOnNext"),
    @XmlEnumValue("assertNotErrorOnNext")
    ASSERT_NOT_ERROR_ON_NEXT("assertNotErrorOnNext"),
    @XmlEnumValue("verifyErrorOnNext")
    VERIFY_ERROR_ON_NEXT("verifyErrorOnNext"),
    @XmlEnumValue("verifyNotErrorOnNext")
    VERIFY_NOT_ERROR_ON_NEXT("verifyNotErrorOnNext"),
    @XmlEnumValue("waitForErrorOnNext")
    WAIT_FOR_ERROR_ON_NEXT("waitForErrorOnNext"),
    @XmlEnumValue("waitForNotErrorOnNext")
    WAIT_FOR_NOT_ERROR_ON_NEXT("waitForNotErrorOnNext"),
    @XmlEnumValue("assertFailureOnNext")
    ASSERT_FAILURE_ON_NEXT("assertFailureOnNext"),
    @XmlEnumValue("assertNotFailureOnNext")
    ASSERT_NOT_FAILURE_ON_NEXT("assertNotFailureOnNext"),
    @XmlEnumValue("verifyFailureOnNext")
    VERIFY_FAILURE_ON_NEXT("verifyFailureOnNext"),
    @XmlEnumValue("verifyNotFailureOnNext")
    VERIFY_NOT_FAILURE_ON_NEXT("verifyNotFailureOnNext"),
    @XmlEnumValue("waitForFailureOnNext")
    WAIT_FOR_FAILURE_ON_NEXT("waitForFailureOnNext"),
    @XmlEnumValue("waitForNotFailureOnNext")
    WAIT_FOR_NOT_FAILURE_ON_NEXT("waitForNotFailureOnNext"),
    @XmlEnumValue("assertSelected")
    ASSERT_SELECTED("assertSelected"),
    @XmlEnumValue("assertNotSelected")
    ASSERT_NOT_SELECTED("assertNotSelected"),
    @XmlEnumValue("verifySelected")
    VERIFY_SELECTED("verifySelected"),
    @XmlEnumValue("verifyNotSelected")
    VERIFY_NOT_SELECTED("verifyNotSelected"),
    @XmlEnumValue("waitForSelected")
    WAIT_FOR_SELECTED("waitForSelected"),
    @XmlEnumValue("waitForNotSelected")
    WAIT_FOR_NOT_SELECTED("waitForNotSelected"),
    @XmlEnumValue("assertAlert")
    ASSERT_ALERT("assertAlert"),
    @XmlEnumValue("assertNotAlert")
    ASSERT_NOT_ALERT("assertNotAlert"),
    @XmlEnumValue("verifyAlert")
    VERIFY_ALERT("verifyAlert"),
    @XmlEnumValue("verifyNotAlert")
    VERIFY_NOT_ALERT("verifyNotAlert"),
    @XmlEnumValue("waitForAlert")
    WAIT_FOR_ALERT("waitForAlert"),
    @XmlEnumValue("waitForNotAlert")
    WAIT_FOR_NOT_ALERT("waitForNotAlert"),
    @XmlEnumValue("assertAllButtons")
    ASSERT_ALL_BUTTONS("assertAllButtons"),
    @XmlEnumValue("assertNotAllButtons")
    ASSERT_NOT_ALL_BUTTONS("assertNotAllButtons"),
    @XmlEnumValue("verifyAllButtons")
    VERIFY_ALL_BUTTONS("verifyAllButtons"),
    @XmlEnumValue("verifyNotAllButtons")
    VERIFY_NOT_ALL_BUTTONS("verifyNotAllButtons"),
    @XmlEnumValue("waitForAllButtons")
    WAIT_FOR_ALL_BUTTONS("waitForAllButtons"),
    @XmlEnumValue("waitForNotAllButtons")
    WAIT_FOR_NOT_ALL_BUTTONS("waitForNotAllButtons"),
    @XmlEnumValue("assertAllFields")
    ASSERT_ALL_FIELDS("assertAllFields"),
    @XmlEnumValue("assertNotAllFields")
    ASSERT_NOT_ALL_FIELDS("assertNotAllFields"),
    @XmlEnumValue("verifyAllFields")
    VERIFY_ALL_FIELDS("verifyAllFields"),
    @XmlEnumValue("verifyNotAllFields")
    VERIFY_NOT_ALL_FIELDS("verifyNotAllFields"),
    @XmlEnumValue("waitForAllFields")
    WAIT_FOR_ALL_FIELDS("waitForAllFields"),
    @XmlEnumValue("waitForNotAllFields")
    WAIT_FOR_NOT_ALL_FIELDS("waitForNotAllFields"),
    @XmlEnumValue("assertAllLinks")
    ASSERT_ALL_LINKS("assertAllLinks"),
    @XmlEnumValue("assertNotAllLinks")
    ASSERT_NOT_ALL_LINKS("assertNotAllLinks"),
    @XmlEnumValue("verifyAllLinks")
    VERIFY_ALL_LINKS("verifyAllLinks"),
    @XmlEnumValue("verifyNotAllLinks")
    VERIFY_NOT_ALL_LINKS("verifyNotAllLinks"),
    @XmlEnumValue("waitForAllLinks")
    WAIT_FOR_ALL_LINKS("waitForAllLinks"),
    @XmlEnumValue("waitForNotAllLinks")
    WAIT_FOR_NOT_ALL_LINKS("waitForNotAllLinks"),
    @XmlEnumValue("assertAttribute")
    ASSERT_ATTRIBUTE("assertAttribute"),
    @XmlEnumValue("assertNotAttribute")
    ASSERT_NOT_ATTRIBUTE("assertNotAttribute"),
    @XmlEnumValue("verifyAttribute")
    VERIFY_ATTRIBUTE("verifyAttribute"),
    @XmlEnumValue("verifyNotAttribute")
    VERIFY_NOT_ATTRIBUTE("verifyNotAttribute"),
    @XmlEnumValue("waitForAttribute")
    WAIT_FOR_ATTRIBUTE("waitForAttribute"),
    @XmlEnumValue("waitForNotAttribute")
    WAIT_FOR_NOT_ATTRIBUTE("waitForNotAttribute"),
    @XmlEnumValue("assertBodyText")
    ASSERT_BODY_TEXT("assertBodyText"),
    @XmlEnumValue("assertNotBodyText")
    ASSERT_NOT_BODY_TEXT("assertNotBodyText"),
    @XmlEnumValue("verifyBodyText")
    VERIFY_BODY_TEXT("verifyBodyText"),
    @XmlEnumValue("verifyNotBodyText")
    VERIFY_NOT_BODY_TEXT("verifyNotBodyText"),
    @XmlEnumValue("waitForBodyText")
    WAIT_FOR_BODY_TEXT("waitForBodyText"),
    @XmlEnumValue("waitForNotBodyText")
    WAIT_FOR_NOT_BODY_TEXT("waitForNotBodyText"),
    @XmlEnumValue("assertConfirmation")
    ASSERT_CONFIRMATION("assertConfirmation"),
    @XmlEnumValue("assertNotConfirmation")
    ASSERT_NOT_CONFIRMATION("assertNotConfirmation"),
    @XmlEnumValue("verifyConfirmation")
    VERIFY_CONFIRMATION("verifyConfirmation"),
    @XmlEnumValue("verifyNotConfirmation")
    VERIFY_NOT_CONFIRMATION("verifyNotConfirmation"),
    @XmlEnumValue("waitForConfirmation")
    WAIT_FOR_CONFIRMATION("waitForConfirmation"),
    @XmlEnumValue("waitForNotConfirmation")
    WAIT_FOR_NOT_CONFIRMATION("waitForNotConfirmation"),
    @XmlEnumValue("assertElementHeight")
    ASSERT_ELEMENT_HEIGHT("assertElementHeight"),
    @XmlEnumValue("assertNotElementHeight")
    ASSERT_NOT_ELEMENT_HEIGHT("assertNotElementHeight"),
    @XmlEnumValue("verifyElementHeight")
    VERIFY_ELEMENT_HEIGHT("verifyElementHeight"),
    @XmlEnumValue("verifyNotElementHeight")
    VERIFY_NOT_ELEMENT_HEIGHT("verifyNotElementHeight"),
    @XmlEnumValue("waitForElementHeight")
    WAIT_FOR_ELEMENT_HEIGHT("waitForElementHeight"),
    @XmlEnumValue("waitForNotElementHeight")
    WAIT_FOR_NOT_ELEMENT_HEIGHT("waitForNotElementHeight"),
    @XmlEnumValue("assertElementIndex")
    ASSERT_ELEMENT_INDEX("assertElementIndex"),
    @XmlEnumValue("assertNotElementIndex")
    ASSERT_NOT_ELEMENT_INDEX("assertNotElementIndex"),
    @XmlEnumValue("verifyElementIndex")
    VERIFY_ELEMENT_INDEX("verifyElementIndex"),
    @XmlEnumValue("verifyNotElementIndex")
    VERIFY_NOT_ELEMENT_INDEX("verifyNotElementIndex"),
    @XmlEnumValue("waitForElementIndex")
    WAIT_FOR_ELEMENT_INDEX("waitForElementIndex"),
    @XmlEnumValue("waitForNotElementIndex")
    WAIT_FOR_NOT_ELEMENT_INDEX("waitForNotElementIndex"),
    @XmlEnumValue("assertElementWidth")
    ASSERT_ELEMENT_WIDTH("assertElementWidth"),
    @XmlEnumValue("assertNotElementWidth")
    ASSERT_NOT_ELEMENT_WIDTH("assertNotElementWidth"),
    @XmlEnumValue("verifyElementWidth")
    VERIFY_ELEMENT_WIDTH("verifyElementWidth"),
    @XmlEnumValue("verifyNotElementWidth")
    VERIFY_NOT_ELEMENT_WIDTH("verifyNotElementWidth"),
    @XmlEnumValue("waitForElementWidth")
    WAIT_FOR_ELEMENT_WIDTH("waitForElementWidth"),
    @XmlEnumValue("waitForNotElementWidth")
    WAIT_FOR_NOT_ELEMENT_WIDTH("waitForNotElementWidth"),
    @XmlEnumValue("assertEval")
    ASSERT_EVAL("assertEval"),
    @XmlEnumValue("assertNotEval")
    ASSERT_NOT_EVAL("assertNotEval"),
    @XmlEnumValue("verifyEval")
    VERIFY_EVAL("verifyEval"),
    @XmlEnumValue("verifyNotEval")
    VERIFY_NOT_EVAL("verifyNotEval"),
    @XmlEnumValue("waitForEval")
    WAIT_FOR_EVAL("waitForEval"),
    @XmlEnumValue("waitForNotEval")
    WAIT_FOR_NOT_EVAL("waitForNotEval"),
    @XmlEnumValue("assertExpression")
    ASSERT_EXPRESSION("assertExpression"),
    @XmlEnumValue("assertNotExpression")
    ASSERT_NOT_EXPRESSION("assertNotExpression"),
    @XmlEnumValue("verifyExpression")
    VERIFY_EXPRESSION("verifyExpression"),
    @XmlEnumValue("verifyNotExpression")
    VERIFY_NOT_EXPRESSION("verifyNotExpression"),
    @XmlEnumValue("waitForExpression")
    WAIT_FOR_EXPRESSION("waitForExpression"),
    @XmlEnumValue("waitForNotExpression")
    WAIT_FOR_NOT_EXPRESSION("waitForNotExpression"),
    @XmlEnumValue("assertHtmlSource")
    ASSERT_HTML_SOURCE("assertHtmlSource"),
    @XmlEnumValue("assertNotHtmlSource")
    ASSERT_NOT_HTML_SOURCE("assertNotHtmlSource"),
    @XmlEnumValue("verifyHtmlSource")
    VERIFY_HTML_SOURCE("verifyHtmlSource"),
    @XmlEnumValue("verifyNotHtmlSource")
    VERIFY_NOT_HTML_SOURCE("verifyNotHtmlSource"),
    @XmlEnumValue("waitForHtmlSource")
    WAIT_FOR_HTML_SOURCE("waitForHtmlSource"),
    @XmlEnumValue("waitForNotHtmlSource")
    WAIT_FOR_NOT_HTML_SOURCE("waitForNotHtmlSource"),
    @XmlEnumValue("assertLocation")
    ASSERT_LOCATION("assertLocation"),
    @XmlEnumValue("assertNotLocation")
    ASSERT_NOT_LOCATION("assertNotLocation"),
    @XmlEnumValue("verifyLocation")
    VERIFY_LOCATION("verifyLocation"),
    @XmlEnumValue("verifyNotLocation")
    VERIFY_NOT_LOCATION("verifyNotLocation"),
    @XmlEnumValue("waitForLocation")
    WAIT_FOR_LOCATION("waitForLocation"),
    @XmlEnumValue("waitForNotLocation")
    WAIT_FOR_NOT_LOCATION("waitForNotLocation"),
    @XmlEnumValue("assertPrompt")
    ASSERT_PROMPT("assertPrompt"),
    @XmlEnumValue("assertNotPrompt")
    ASSERT_NOT_PROMPT("assertNotPrompt"),
    @XmlEnumValue("verifyPrompt")
    VERIFY_PROMPT("verifyPrompt"),
    @XmlEnumValue("verifyNotPrompt")
    VERIFY_NOT_PROMPT("verifyNotPrompt"),
    @XmlEnumValue("waitForPrompt")
    WAIT_FOR_PROMPT("waitForPrompt"),
    @XmlEnumValue("waitForNotPrompt")
    WAIT_FOR_NOT_PROMPT("waitForNotPrompt"),
    @XmlEnumValue("assertSelectedId")
    ASSERT_SELECTED_ID("assertSelectedId"),
    @XmlEnumValue("assertNotSelectedId")
    ASSERT_NOT_SELECTED_ID("assertNotSelectedId"),
    @XmlEnumValue("verifySelectedId")
    VERIFY_SELECTED_ID("verifySelectedId"),
    @XmlEnumValue("verifyNotSelectedId")
    VERIFY_NOT_SELECTED_ID("verifyNotSelectedId"),
    @XmlEnumValue("waitForSelectedId")
    WAIT_FOR_SELECTED_ID("waitForSelectedId"),
    @XmlEnumValue("waitForNotSelectedId")
    WAIT_FOR_NOT_SELECTED_ID("waitForNotSelectedId"),
    @XmlEnumValue("assertSelectedIds")
    ASSERT_SELECTED_IDS("assertSelectedIds"),
    @XmlEnumValue("assertNotSelectedIds")
    ASSERT_NOT_SELECTED_IDS("assertNotSelectedIds"),
    @XmlEnumValue("verifySelectedIds")
    VERIFY_SELECTED_IDS("verifySelectedIds"),
    @XmlEnumValue("verifyNotSelectedIds")
    VERIFY_NOT_SELECTED_IDS("verifyNotSelectedIds"),
    @XmlEnumValue("waitForSelectedIds")
    WAIT_FOR_SELECTED_IDS("waitForSelectedIds"),
    @XmlEnumValue("waitForNotSelectedIds")
    WAIT_FOR_NOT_SELECTED_IDS("waitForNotSelectedIds"),
    @XmlEnumValue("assertSelectedIndex")
    ASSERT_SELECTED_INDEX("assertSelectedIndex"),
    @XmlEnumValue("assertNotSelectedIndex")
    ASSERT_NOT_SELECTED_INDEX("assertNotSelectedIndex"),
    @XmlEnumValue("verifySelectedIndex")
    VERIFY_SELECTED_INDEX("verifySelectedIndex"),
    @XmlEnumValue("verifyNotSelectedIndex")
    VERIFY_NOT_SELECTED_INDEX("verifyNotSelectedIndex"),
    @XmlEnumValue("waitForSelectedIndex")
    WAIT_FOR_SELECTED_INDEX("waitForSelectedIndex"),
    @XmlEnumValue("waitForNotSelectedIndex")
    WAIT_FOR_NOT_SELECTED_INDEX("waitForNotSelectedIndex"),
    @XmlEnumValue("assertSelectedIndexes")
    ASSERT_SELECTED_INDEXES("assertSelectedIndexes"),
    @XmlEnumValue("assertNotSelectedIndexes")
    ASSERT_NOT_SELECTED_INDEXES("assertNotSelectedIndexes"),
    @XmlEnumValue("verifySelectedIndexes")
    VERIFY_SELECTED_INDEXES("verifySelectedIndexes"),
    @XmlEnumValue("verifyNotSelectedIndexes")
    VERIFY_NOT_SELECTED_INDEXES("verifyNotSelectedIndexes"),
    @XmlEnumValue("waitForSelectedIndexes")
    WAIT_FOR_SELECTED_INDEXES("waitForSelectedIndexes"),
    @XmlEnumValue("waitForNotSelectedIndexes")
    WAIT_FOR_NOT_SELECTED_INDEXES("waitForNotSelectedIndexes"),
    @XmlEnumValue("assertSelectedLabel")
    ASSERT_SELECTED_LABEL("assertSelectedLabel"),
    @XmlEnumValue("assertNotSelectedLabel")
    ASSERT_NOT_SELECTED_LABEL("assertNotSelectedLabel"),
    @XmlEnumValue("verifySelectedLabel")
    VERIFY_SELECTED_LABEL("verifySelectedLabel"),
    @XmlEnumValue("verifyNotSelectedLabel")
    VERIFY_NOT_SELECTED_LABEL("verifyNotSelectedLabel"),
    @XmlEnumValue("waitForSelectedLabel")
    WAIT_FOR_SELECTED_LABEL("waitForSelectedLabel"),
    @XmlEnumValue("waitForNotSelectedLabel")
    WAIT_FOR_NOT_SELECTED_LABEL("waitForNotSelectedLabel"),
    @XmlEnumValue("assertSelectedLabels")
    ASSERT_SELECTED_LABELS("assertSelectedLabels"),
    @XmlEnumValue("assertNotSelectedLabels")
    ASSERT_NOT_SELECTED_LABELS("assertNotSelectedLabels"),
    @XmlEnumValue("verifySelectedLabels")
    VERIFY_SELECTED_LABELS("verifySelectedLabels"),
    @XmlEnumValue("verifyNotSelectedLabels")
    VERIFY_NOT_SELECTED_LABELS("verifyNotSelectedLabels"),
    @XmlEnumValue("waitForSelectedLabels")
    WAIT_FOR_SELECTED_LABELS("waitForSelectedLabels"),
    @XmlEnumValue("waitForNotSelectedLabels")
    WAIT_FOR_NOT_SELECTED_LABELS("waitForNotSelectedLabels"),
    @XmlEnumValue("assertSelectedValue")
    ASSERT_SELECTED_VALUE("assertSelectedValue"),
    @XmlEnumValue("assertNotSelectedValue")
    ASSERT_NOT_SELECTED_VALUE("assertNotSelectedValue"),
    @XmlEnumValue("verifySelectedValue")
    VERIFY_SELECTED_VALUE("verifySelectedValue"),
    @XmlEnumValue("verifyNotSelectedValue")
    VERIFY_NOT_SELECTED_VALUE("verifyNotSelectedValue"),
    @XmlEnumValue("waitForSelectedValue")
    WAIT_FOR_SELECTED_VALUE("waitForSelectedValue"),
    @XmlEnumValue("waitForNotSelectedValue")
    WAIT_FOR_NOT_SELECTED_VALUE("waitForNotSelectedValue"),
    @XmlEnumValue("assertSelectedValues")
    ASSERT_SELECTED_VALUES("assertSelectedValues"),
    @XmlEnumValue("assertNotSelectedValues")
    ASSERT_NOT_SELECTED_VALUES("assertNotSelectedValues"),
    @XmlEnumValue("verifySelectedValues")
    VERIFY_SELECTED_VALUES("verifySelectedValues"),
    @XmlEnumValue("verifyNotSelectedValues")
    VERIFY_NOT_SELECTED_VALUES("verifyNotSelectedValues"),
    @XmlEnumValue("waitForSelectedValues")
    WAIT_FOR_SELECTED_VALUES("waitForSelectedValues"),
    @XmlEnumValue("waitForNotSelectedValues")
    WAIT_FOR_NOT_SELECTED_VALUES("waitForNotSelectedValues"),
    @XmlEnumValue("assertSelectOptions")
    ASSERT_SELECT_OPTIONS("assertSelectOptions"),
    @XmlEnumValue("assertNotSelectOptions")
    ASSERT_NOT_SELECT_OPTIONS("assertNotSelectOptions"),
    @XmlEnumValue("verifySelectOptions")
    VERIFY_SELECT_OPTIONS("verifySelectOptions"),
    @XmlEnumValue("verifyNotSelectOptions")
    VERIFY_NOT_SELECT_OPTIONS("verifyNotSelectOptions"),
    @XmlEnumValue("waitForSelectOptions")
    WAIT_FOR_SELECT_OPTIONS("waitForSelectOptions"),
    @XmlEnumValue("waitForNotSelectOptions")
    WAIT_FOR_NOT_SELECT_OPTIONS("waitForNotSelectOptions"),
    @XmlEnumValue("assertSpeed")
    ASSERT_SPEED("assertSpeed"),
    @XmlEnumValue("assertNotSpeed")
    ASSERT_NOT_SPEED("assertNotSpeed"),
    @XmlEnumValue("verifySpeed")
    VERIFY_SPEED("verifySpeed"),
    @XmlEnumValue("verifyNotSpeed")
    VERIFY_NOT_SPEED("verifyNotSpeed"),
    @XmlEnumValue("waitForSpeed")
    WAIT_FOR_SPEED("waitForSpeed"),
    @XmlEnumValue("waitForNotSpeed")
    WAIT_FOR_NOT_SPEED("waitForNotSpeed"),
    @XmlEnumValue("assertTable")
    ASSERT_TABLE("assertTable"),
    @XmlEnumValue("assertNotTable")
    ASSERT_NOT_TABLE("assertNotTable"),
    @XmlEnumValue("verifyTable")
    VERIFY_TABLE("verifyTable"),
    @XmlEnumValue("verifyNotTable")
    VERIFY_NOT_TABLE("verifyNotTable"),
    @XmlEnumValue("waitForTable")
    WAIT_FOR_TABLE("waitForTable"),
    @XmlEnumValue("waitForNotTable")
    WAIT_FOR_NOT_TABLE("waitForNotTable"),
    @XmlEnumValue("assertText")
    ASSERT_TEXT("assertText"),
    @XmlEnumValue("assertNotText")
    ASSERT_NOT_TEXT("assertNotText"),
    @XmlEnumValue("verifyText")
    VERIFY_TEXT("verifyText"),
    @XmlEnumValue("verifyNotText")
    VERIFY_NOT_TEXT("verifyNotText"),
    @XmlEnumValue("waitForText")
    WAIT_FOR_TEXT("waitForText"),
    @XmlEnumValue("waitForNotText")
    WAIT_FOR_NOT_TEXT("waitForNotText"),
    @XmlEnumValue("assertTitle")
    ASSERT_TITLE("assertTitle"),
    @XmlEnumValue("assertNotTitle")
    ASSERT_NOT_TITLE("assertNotTitle"),
    @XmlEnumValue("verifyTitle")
    VERIFY_TITLE("verifyTitle"),
    @XmlEnumValue("verifyNotTitle")
    VERIFY_NOT_TITLE("verifyNotTitle"),
    @XmlEnumValue("waitForTitle")
    WAIT_FOR_TITLE("waitForTitle"),
    @XmlEnumValue("waitForNotTitle")
    WAIT_FOR_NOT_TITLE("waitForNotTitle"),
    @XmlEnumValue("assertValue")
    ASSERT_VALUE("assertValue"),
    @XmlEnumValue("assertNotValue")
    ASSERT_NOT_VALUE("assertNotValue"),
    @XmlEnumValue("verifyValue")
    VERIFY_VALUE("verifyValue"),
    @XmlEnumValue("verifyNotValue")
    VERIFY_NOT_VALUE("verifyNotValue"),
    @XmlEnumValue("waitForValue")
    WAIT_FOR_VALUE("waitForValue"),
    @XmlEnumValue("waitForNotValue")
    WAIT_FOR_NOT_VALUE("waitForNotValue"),
    @XmlEnumValue("assertAlertPresent")
    ASSERT_ALERT_PRESENT("assertAlertPresent"),
    @XmlEnumValue("assertAlertNotPresent")
    ASSERT_ALERT_NOT_PRESENT("assertAlertNotPresent"),
    @XmlEnumValue("verifyAlertPresent")
    VERIFY_ALERT_PRESENT("verifyAlertPresent"),
    @XmlEnumValue("verifyAlertNotPresent")
    VERIFY_ALERT_NOT_PRESENT("verifyAlertNotPresent"),
    @XmlEnumValue("waitForAlertPresent")
    WAIT_FOR_ALERT_PRESENT("waitForAlertPresent"),
    @XmlEnumValue("waitForAlertNotPresent")
    WAIT_FOR_ALERT_NOT_PRESENT("waitForAlertNotPresent"),
    @XmlEnumValue("assertChecked")
    ASSERT_CHECKED("assertChecked"),
    @XmlEnumValue("assertNotChecked")
    ASSERT_NOT_CHECKED("assertNotChecked"),
    @XmlEnumValue("verifyChecked")
    VERIFY_CHECKED("verifyChecked"),
    @XmlEnumValue("verifyNotChecked")
    VERIFY_NOT_CHECKED("verifyNotChecked"),
    @XmlEnumValue("waitForChecked")
    WAIT_FOR_CHECKED("waitForChecked"),
    @XmlEnumValue("waitForNotChecked")
    WAIT_FOR_NOT_CHECKED("waitForNotChecked"),
    @XmlEnumValue("assertConfirmationPresent")
    ASSERT_CONFIRMATION_PRESENT("assertConfirmationPresent"),
    @XmlEnumValue("assertConfirmationNotPresent")
    ASSERT_CONFIRMATION_NOT_PRESENT("assertConfirmationNotPresent"),
    @XmlEnumValue("verifyConfirmationPresent")
    VERIFY_CONFIRMATION_PRESENT("verifyConfirmationPresent"),
    @XmlEnumValue("verifyConfirmationNotPresent")
    VERIFY_CONFIRMATION_NOT_PRESENT("verifyConfirmationNotPresent"),
    @XmlEnumValue("waitForConfirmationPresent")
    WAIT_FOR_CONFIRMATION_PRESENT("waitForConfirmationPresent"),
    @XmlEnumValue("waitForConfirmationNotPresent")
    WAIT_FOR_CONFIRMATION_NOT_PRESENT("waitForConfirmationNotPresent"),
    @XmlEnumValue("assertEditable")
    ASSERT_EDITABLE("assertEditable"),
    @XmlEnumValue("assertNotEditable")
    ASSERT_NOT_EDITABLE("assertNotEditable"),
    @XmlEnumValue("verifyEditable")
    VERIFY_EDITABLE("verifyEditable"),
    @XmlEnumValue("verifyNotEditable")
    VERIFY_NOT_EDITABLE("verifyNotEditable"),
    @XmlEnumValue("waitForEditable")
    WAIT_FOR_EDITABLE("waitForEditable"),
    @XmlEnumValue("waitForNotEditable")
    WAIT_FOR_NOT_EDITABLE("waitForNotEditable"),
    @XmlEnumValue("assertElementPresent")
    ASSERT_ELEMENT_PRESENT("assertElementPresent"),
    @XmlEnumValue("assertElementNotPresent")
    ASSERT_ELEMENT_NOT_PRESENT("assertElementNotPresent"),
    @XmlEnumValue("verifyElementPresent")
    VERIFY_ELEMENT_PRESENT("verifyElementPresent"),
    @XmlEnumValue("verifyElementNotPresent")
    VERIFY_ELEMENT_NOT_PRESENT("verifyElementNotPresent"),
    @XmlEnumValue("waitForElementPresent")
    WAIT_FOR_ELEMENT_PRESENT("waitForElementPresent"),
    @XmlEnumValue("waitForElementNotPresent")
    WAIT_FOR_ELEMENT_NOT_PRESENT("waitForElementNotPresent"),
    @XmlEnumValue("assertOrdered")
    ASSERT_ORDERED("assertOrdered"),
    @XmlEnumValue("assertNotOrdered")
    ASSERT_NOT_ORDERED("assertNotOrdered"),
    @XmlEnumValue("verifyOrdered")
    VERIFY_ORDERED("verifyOrdered"),
    @XmlEnumValue("verifyNotOrdered")
    VERIFY_NOT_ORDERED("verifyNotOrdered"),
    @XmlEnumValue("waitForOrdered")
    WAIT_FOR_ORDERED("waitForOrdered"),
    @XmlEnumValue("waitForNotOrdered")
    WAIT_FOR_NOT_ORDERED("waitForNotOrdered"),
    @XmlEnumValue("assertPromptPresent")
    ASSERT_PROMPT_PRESENT("assertPromptPresent"),
    @XmlEnumValue("assertPromptNotPresent")
    ASSERT_PROMPT_NOT_PRESENT("assertPromptNotPresent"),
    @XmlEnumValue("verifyPromptPresent")
    VERIFY_PROMPT_PRESENT("verifyPromptPresent"),
    @XmlEnumValue("verifyPromptNotPresent")
    VERIFY_PROMPT_NOT_PRESENT("verifyPromptNotPresent"),
    @XmlEnumValue("waitForPromptPresent")
    WAIT_FOR_PROMPT_PRESENT("waitForPromptPresent"),
    @XmlEnumValue("waitForPromptNotPresent")
    WAIT_FOR_PROMPT_NOT_PRESENT("waitForPromptNotPresent"),
    @XmlEnumValue("assertSomethingSelected")
    ASSERT_SOMETHING_SELECTED("assertSomethingSelected"),
    @XmlEnumValue("assertNotSomethingSelected")
    ASSERT_NOT_SOMETHING_SELECTED("assertNotSomethingSelected"),
    @XmlEnumValue("verifySomethingSelected")
    VERIFY_SOMETHING_SELECTED("verifySomethingSelected"),
    @XmlEnumValue("verifyNotSomethingSelected")
    VERIFY_NOT_SOMETHING_SELECTED("verifyNotSomethingSelected"),
    @XmlEnumValue("waitForSomethingSelected")
    WAIT_FOR_SOMETHING_SELECTED("waitForSomethingSelected"),
    @XmlEnumValue("waitForNotSomethingSelected")
    WAIT_FOR_NOT_SOMETHING_SELECTED("waitForNotSomethingSelected"),
    @XmlEnumValue("assertTextPresent")
    ASSERT_TEXT_PRESENT("assertTextPresent"),
    @XmlEnumValue("assertTextNotPresent")
    ASSERT_TEXT_NOT_PRESENT("assertTextNotPresent"),
    @XmlEnumValue("verifyTextPresent")
    VERIFY_TEXT_PRESENT("verifyTextPresent"),
    @XmlEnumValue("verifyTextNotPresent")
    VERIFY_TEXT_NOT_PRESENT("verifyTextNotPresent"),
    @XmlEnumValue("waitForTextPresent")
    WAIT_FOR_TEXT_PRESENT("waitForTextPresent"),
    @XmlEnumValue("waitForTextNotPresent")
    WAIT_FOR_TEXT_NOT_PRESENT("waitForTextNotPresent"),
    @XmlEnumValue("assertVisible")
    ASSERT_VISIBLE("assertVisible"),
    @XmlEnumValue("assertNotVisible")
    ASSERT_NOT_VISIBLE("assertNotVisible"),
    @XmlEnumValue("verifyVisible")
    VERIFY_VISIBLE("verifyVisible"),
    @XmlEnumValue("verifyNotVisible")
    VERIFY_NOT_VISIBLE("verifyNotVisible"),
    @XmlEnumValue("waitForVisible")
    WAIT_FOR_VISIBLE("waitForVisible"),
    @XmlEnumValue("waitForNotVisible")
    WAIT_FOR_NOT_VISIBLE("waitForNotVisible");
    private final String value;

    SeleneseAssertion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeleneseAssertion fromValue(String v) {
        for (SeleneseAssertion c: SeleneseAssertion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
