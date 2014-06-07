//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.06 a las 11:39:07 PM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para seleneseCommand.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="seleneseCommand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="click"/>
 *     &lt;enumeration value="doubleClick"/>
 *     &lt;enumeration value="contextMenu"/>
 *     &lt;enumeration value="clickAt"/>
 *     &lt;enumeration value="doubleClickAt"/>
 *     &lt;enumeration value="contextMenuAt"/>
 *     &lt;enumeration value="fireEvent"/>
 *     &lt;enumeration value="focus"/>
 *     &lt;enumeration value="keyPress"/>
 *     &lt;enumeration value="shiftKeyDown"/>
 *     &lt;enumeration value="shiftKeyUp"/>
 *     &lt;enumeration value="metaKeyDown"/>
 *     &lt;enumeration value="metaKeyUp"/>
 *     &lt;enumeration value="altKeyDown"/>
 *     &lt;enumeration value="altKeyUp"/>
 *     &lt;enumeration value="controlKeyDown"/>
 *     &lt;enumeration value="controlKeyUp"/>
 *     &lt;enumeration value="keyDown"/>
 *     &lt;enumeration value="keyUp"/>
 *     &lt;enumeration value="mouseOver"/>
 *     &lt;enumeration value="mouseOut"/>
 *     &lt;enumeration value="mouseDown"/>
 *     &lt;enumeration value="mouseDownRight"/>
 *     &lt;enumeration value="mouseDownAt"/>
 *     &lt;enumeration value="mouseDownRightAt"/>
 *     &lt;enumeration value="mouseUp"/>
 *     &lt;enumeration value="mouseUpRight"/>
 *     &lt;enumeration value="mouseUpAt"/>
 *     &lt;enumeration value="mouseUpRightAt"/>
 *     &lt;enumeration value="mouseMove"/>
 *     &lt;enumeration value="mouseMoveAt"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="typeKeys"/>
 *     &lt;enumeration value="setSpeed"/>
 *     &lt;enumeration value="getSpeed"/>
 *     &lt;enumeration value="check"/>
 *     &lt;enumeration value="uncheck"/>
 *     &lt;enumeration value="select"/>
 *     &lt;enumeration value="addSelection"/>
 *     &lt;enumeration value="removeSelection"/>
 *     &lt;enumeration value="removeAllSelections"/>
 *     &lt;enumeration value="submit"/>
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="openWindow"/>
 *     &lt;enumeration value="selectWindow"/>
 *     &lt;enumeration value="selectPopUp"/>
 *     &lt;enumeration value="deselectPopUp"/>
 *     &lt;enumeration value="selectFrame"/>
 *     &lt;enumeration value="getWhetherThisFrameMatchFrameExpression"/>
 *     &lt;enumeration value="getWhetherThisWindowMatchWindowExpression"/>
 *     &lt;enumeration value="waitForPopUp"/>
 *     &lt;enumeration value="chooseCancelOnNextConfirmation"/>
 *     &lt;enumeration value="chooseOkOnNextConfirmation"/>
 *     &lt;enumeration value="answerOnNextPrompt"/>
 *     &lt;enumeration value="goBack"/>
 *     &lt;enumeration value="refresh"/>
 *     &lt;enumeration value="close"/>
 *     &lt;enumeration value="isAlertPresent"/>
 *     &lt;enumeration value="isPromptPresent"/>
 *     &lt;enumeration value="isConfirmationPresent"/>
 *     &lt;enumeration value="getAlert"/>
 *     &lt;enumeration value="getConfirmation"/>
 *     &lt;enumeration value="getPrompt"/>
 *     &lt;enumeration value="getLocation"/>
 *     &lt;enumeration value="getTitle"/>
 *     &lt;enumeration value="getBodyText"/>
 *     &lt;enumeration value="getValue"/>
 *     &lt;enumeration value="getText"/>
 *     &lt;enumeration value="highlight"/>
 *     &lt;enumeration value="getEval"/>
 *     &lt;enumeration value="isChecked"/>
 *     &lt;enumeration value="getTable"/>
 *     &lt;enumeration value="getSelectedLabels"/>
 *     &lt;enumeration value="getSelectedLabel"/>
 *     &lt;enumeration value="getSelectedValues"/>
 *     &lt;enumeration value="getSelectedValue"/>
 *     &lt;enumeration value="getSelectedIndexes"/>
 *     &lt;enumeration value="getSelectedIndex"/>
 *     &lt;enumeration value="getSelectedIds"/>
 *     &lt;enumeration value="getSelectedId"/>
 *     &lt;enumeration value="isSomethingSelected"/>
 *     &lt;enumeration value="getSelectOptions"/>
 *     &lt;enumeration value="getAttribute"/>
 *     &lt;enumeration value="isTextPresent"/>
 *     &lt;enumeration value="isElementPresent"/>
 *     &lt;enumeration value="isVisible"/>
 *     &lt;enumeration value="isEditable"/>
 *     &lt;enumeration value="getAllButtons"/>
 *     &lt;enumeration value="getAllLinks"/>
 *     &lt;enumeration value="getAllFields"/>
 *     &lt;enumeration value="getAttributeFromAllWindows"/>
 *     &lt;enumeration value="dragdrop"/>
 *     &lt;enumeration value="setMouseSpeed"/>
 *     &lt;enumeration value="getMouseSpeed"/>
 *     &lt;enumeration value="dragAndDrop"/>
 *     &lt;enumeration value="dragAndDropToObject"/>
 *     &lt;enumeration value="windowFocus"/>
 *     &lt;enumeration value="windowMaximize"/>
 *     &lt;enumeration value="getAllWindowIds"/>
 *     &lt;enumeration value="getAllWindowNames"/>
 *     &lt;enumeration value="getAllWindowTitles"/>
 *     &lt;enumeration value="getHtmlSource"/>
 *     &lt;enumeration value="setCursorPosition"/>
 *     &lt;enumeration value="getElementIndex"/>
 *     &lt;enumeration value="isOrdered"/>
 *     &lt;enumeration value="getElementPositionLeft"/>
 *     &lt;enumeration value="getElementPositionTop"/>
 *     &lt;enumeration value="getElementWidth"/>
 *     &lt;enumeration value="getElementHeight"/>
 *     &lt;enumeration value="getCursorPosition"/>
 *     &lt;enumeration value="getExpression"/>
 *     &lt;enumeration value="getXpathCount"/>
 *     &lt;enumeration value="getCssCount"/>
 *     &lt;enumeration value="assignId"/>
 *     &lt;enumeration value="allowNativeXpath"/>
 *     &lt;enumeration value="ignoreAttributesWithoutValue"/>
 *     &lt;enumeration value="waitForCondition"/>
 *     &lt;enumeration value="setTimeout"/>
 *     &lt;enumeration value="waitForPageToLoad"/>
 *     &lt;enumeration value="waitForFrameToLoad"/>
 *     &lt;enumeration value="getCookie"/>
 *     &lt;enumeration value="getCookieByName"/>
 *     &lt;enumeration value="isCookiePresent"/>
 *     &lt;enumeration value="createCookie"/>
 *     &lt;enumeration value="deleteCookie"/>
 *     &lt;enumeration value="deleteAllVisibleCookies"/>
 *     &lt;enumeration value="setBrowserLogLevel"/>
 *     &lt;enumeration value="runScript"/>
 *     &lt;enumeration value="addLocationStrategy"/>
 *     &lt;enumeration value="captureScreenshot"/>
 *     &lt;enumeration value="captureEntirePageScreenshot"/>
 *     &lt;enumeration value="rollup"/>
 *     &lt;enumeration value="addScript"/>
 *     &lt;enumeration value="removeScript"/>
 *     &lt;enumeration value="useXpathLibrary"/>
 *     &lt;enumeration value="pause"/>
 *     &lt;enumeration value="echo"/>
 *     &lt;enumeration value="clickAndWait"/>
 *     &lt;enumeration value="selectAndWait"/>
 *     &lt;enumeration value="typeAndWait"/>
 *     &lt;enumeration value="store"/>
 *     &lt;enumeration value="storeAlert"/>
 *     &lt;enumeration value="storeAllButtons"/>
 *     &lt;enumeration value="storeAllFields"/>
 *     &lt;enumeration value="storeAllLinks"/>
 *     &lt;enumeration value="storeAllWindowIds"/>
 *     &lt;enumeration value="storeAllWindowNames"/>
 *     &lt;enumeration value="storeAllWindowTitles"/>
 *     &lt;enumeration value="storeAttribute"/>
 *     &lt;enumeration value="storeAttributeFromAllWindows"/>
 *     &lt;enumeration value="storeBodyText"/>
 *     &lt;enumeration value="storeConfirmation"/>
 *     &lt;enumeration value="storeCookie"/>
 *     &lt;enumeration value="storeCookieByName"/>
 *     &lt;enumeration value="storeCursorPosition"/>
 *     &lt;enumeration value="storeElementHeight"/>
 *     &lt;enumeration value="storeElementIndex"/>
 *     &lt;enumeration value="storeElementPositionLeft"/>
 *     &lt;enumeration value="storeElementPositionTop"/>
 *     &lt;enumeration value="storeElementWidth"/>
 *     &lt;enumeration value="storeEval"/>
 *     &lt;enumeration value="storeExpression"/>
 *     &lt;enumeration value="storeHtmlSource"/>
 *     &lt;enumeration value="storeLocation"/>
 *     &lt;enumeration value="storeMouseSpeed"/>
 *     &lt;enumeration value="storePrompt"/>
 *     &lt;enumeration value="storeSelectedId"/>
 *     &lt;enumeration value="storeSelectedIds"/>
 *     &lt;enumeration value="storeSelectedIndex"/>
 *     &lt;enumeration value="storeSelectedIndexes"/>
 *     &lt;enumeration value="storeSelectedLabel"/>
 *     &lt;enumeration value="storeSelectedLabels"/>
 *     &lt;enumeration value="storeSelectedValue"/>
 *     &lt;enumeration value="storeSelectedValues"/>
 *     &lt;enumeration value="storeSelectOptions"/>
 *     &lt;enumeration value="storeSpeed"/>
 *     &lt;enumeration value="storeTable"/>
 *     &lt;enumeration value="storeText"/>
 *     &lt;enumeration value="storeTitle"/>
 *     &lt;enumeration value="storeValue"/>
 *     &lt;enumeration value="storeWhetherThisFrameMatchFrameExpression"/>
 *     &lt;enumeration value="storeWhetherThisWindowMatchWindowExpression"/>
 *     &lt;enumeration value="storeXpathCount"/>
 *     &lt;enumeration value="storeAlertPresent"/>
 *     &lt;enumeration value="storeChecked"/>
 *     &lt;enumeration value="storeConfirmationPresent"/>
 *     &lt;enumeration value="storeCookiePresent"/>
 *     &lt;enumeration value="storeEditable"/>
 *     &lt;enumeration value="storeElementPresent"/>
 *     &lt;enumeration value="storeOrdered"/>
 *     &lt;enumeration value="storePromptPresent"/>
 *     &lt;enumeration value="storeSomethingSelected"/>
 *     &lt;enumeration value="storeTextPresent"/>
 *     &lt;enumeration value="storeVisible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "seleneseCommand")
@XmlEnum
public enum SeleneseCommand {

    @XmlEnumValue("click")
    CLICK("click"),
    @XmlEnumValue("doubleClick")
    DOUBLE_CLICK("doubleClick"),
    @XmlEnumValue("contextMenu")
    CONTEXT_MENU("contextMenu"),
    @XmlEnumValue("clickAt")
    CLICK_AT("clickAt"),
    @XmlEnumValue("doubleClickAt")
    DOUBLE_CLICK_AT("doubleClickAt"),
    @XmlEnumValue("contextMenuAt")
    CONTEXT_MENU_AT("contextMenuAt"),
    @XmlEnumValue("fireEvent")
    FIRE_EVENT("fireEvent"),
    @XmlEnumValue("focus")
    FOCUS("focus"),
    @XmlEnumValue("keyPress")
    KEY_PRESS("keyPress"),
    @XmlEnumValue("shiftKeyDown")
    SHIFT_KEY_DOWN("shiftKeyDown"),
    @XmlEnumValue("shiftKeyUp")
    SHIFT_KEY_UP("shiftKeyUp"),
    @XmlEnumValue("metaKeyDown")
    META_KEY_DOWN("metaKeyDown"),
    @XmlEnumValue("metaKeyUp")
    META_KEY_UP("metaKeyUp"),
    @XmlEnumValue("altKeyDown")
    ALT_KEY_DOWN("altKeyDown"),
    @XmlEnumValue("altKeyUp")
    ALT_KEY_UP("altKeyUp"),
    @XmlEnumValue("controlKeyDown")
    CONTROL_KEY_DOWN("controlKeyDown"),
    @XmlEnumValue("controlKeyUp")
    CONTROL_KEY_UP("controlKeyUp"),
    @XmlEnumValue("keyDown")
    KEY_DOWN("keyDown"),
    @XmlEnumValue("keyUp")
    KEY_UP("keyUp"),
    @XmlEnumValue("mouseOver")
    MOUSE_OVER("mouseOver"),
    @XmlEnumValue("mouseOut")
    MOUSE_OUT("mouseOut"),
    @XmlEnumValue("mouseDown")
    MOUSE_DOWN("mouseDown"),
    @XmlEnumValue("mouseDownRight")
    MOUSE_DOWN_RIGHT("mouseDownRight"),
    @XmlEnumValue("mouseDownAt")
    MOUSE_DOWN_AT("mouseDownAt"),
    @XmlEnumValue("mouseDownRightAt")
    MOUSE_DOWN_RIGHT_AT("mouseDownRightAt"),
    @XmlEnumValue("mouseUp")
    MOUSE_UP("mouseUp"),
    @XmlEnumValue("mouseUpRight")
    MOUSE_UP_RIGHT("mouseUpRight"),
    @XmlEnumValue("mouseUpAt")
    MOUSE_UP_AT("mouseUpAt"),
    @XmlEnumValue("mouseUpRightAt")
    MOUSE_UP_RIGHT_AT("mouseUpRightAt"),
    @XmlEnumValue("mouseMove")
    MOUSE_MOVE("mouseMove"),
    @XmlEnumValue("mouseMoveAt")
    MOUSE_MOVE_AT("mouseMoveAt"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("typeKeys")
    TYPE_KEYS("typeKeys"),
    @XmlEnumValue("setSpeed")
    SET_SPEED("setSpeed"),
    @XmlEnumValue("getSpeed")
    GET_SPEED("getSpeed"),
    @XmlEnumValue("check")
    CHECK("check"),
    @XmlEnumValue("uncheck")
    UNCHECK("uncheck"),
    @XmlEnumValue("select")
    SELECT("select"),
    @XmlEnumValue("addSelection")
    ADD_SELECTION("addSelection"),
    @XmlEnumValue("removeSelection")
    REMOVE_SELECTION("removeSelection"),
    @XmlEnumValue("removeAllSelections")
    REMOVE_ALL_SELECTIONS("removeAllSelections"),
    @XmlEnumValue("submit")
    SUBMIT("submit"),
    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("openWindow")
    OPEN_WINDOW("openWindow"),
    @XmlEnumValue("selectWindow")
    SELECT_WINDOW("selectWindow"),
    @XmlEnumValue("selectPopUp")
    SELECT_POP_UP("selectPopUp"),
    @XmlEnumValue("deselectPopUp")
    DESELECT_POP_UP("deselectPopUp"),
    @XmlEnumValue("selectFrame")
    SELECT_FRAME("selectFrame"),
    @XmlEnumValue("getWhetherThisFrameMatchFrameExpression")
    GET_WHETHER_THIS_FRAME_MATCH_FRAME_EXPRESSION("getWhetherThisFrameMatchFrameExpression"),
    @XmlEnumValue("getWhetherThisWindowMatchWindowExpression")
    GET_WHETHER_THIS_WINDOW_MATCH_WINDOW_EXPRESSION("getWhetherThisWindowMatchWindowExpression"),
    @XmlEnumValue("waitForPopUp")
    WAIT_FOR_POP_UP("waitForPopUp"),
    @XmlEnumValue("chooseCancelOnNextConfirmation")
    CHOOSE_CANCEL_ON_NEXT_CONFIRMATION("chooseCancelOnNextConfirmation"),
    @XmlEnumValue("chooseOkOnNextConfirmation")
    CHOOSE_OK_ON_NEXT_CONFIRMATION("chooseOkOnNextConfirmation"),
    @XmlEnumValue("answerOnNextPrompt")
    ANSWER_ON_NEXT_PROMPT("answerOnNextPrompt"),
    @XmlEnumValue("goBack")
    GO_BACK("goBack"),
    @XmlEnumValue("refresh")
    REFRESH("refresh"),
    @XmlEnumValue("close")
    CLOSE("close"),
    @XmlEnumValue("isAlertPresent")
    IS_ALERT_PRESENT("isAlertPresent"),
    @XmlEnumValue("isPromptPresent")
    IS_PROMPT_PRESENT("isPromptPresent"),
    @XmlEnumValue("isConfirmationPresent")
    IS_CONFIRMATION_PRESENT("isConfirmationPresent"),
    @XmlEnumValue("getAlert")
    GET_ALERT("getAlert"),
    @XmlEnumValue("getConfirmation")
    GET_CONFIRMATION("getConfirmation"),
    @XmlEnumValue("getPrompt")
    GET_PROMPT("getPrompt"),
    @XmlEnumValue("getLocation")
    GET_LOCATION("getLocation"),
    @XmlEnumValue("getTitle")
    GET_TITLE("getTitle"),
    @XmlEnumValue("getBodyText")
    GET_BODY_TEXT("getBodyText"),
    @XmlEnumValue("getValue")
    GET_VALUE("getValue"),
    @XmlEnumValue("getText")
    GET_TEXT("getText"),
    @XmlEnumValue("highlight")
    HIGHLIGHT("highlight"),
    @XmlEnumValue("getEval")
    GET_EVAL("getEval"),
    @XmlEnumValue("isChecked")
    IS_CHECKED("isChecked"),
    @XmlEnumValue("getTable")
    GET_TABLE("getTable"),
    @XmlEnumValue("getSelectedLabels")
    GET_SELECTED_LABELS("getSelectedLabels"),
    @XmlEnumValue("getSelectedLabel")
    GET_SELECTED_LABEL("getSelectedLabel"),
    @XmlEnumValue("getSelectedValues")
    GET_SELECTED_VALUES("getSelectedValues"),
    @XmlEnumValue("getSelectedValue")
    GET_SELECTED_VALUE("getSelectedValue"),
    @XmlEnumValue("getSelectedIndexes")
    GET_SELECTED_INDEXES("getSelectedIndexes"),
    @XmlEnumValue("getSelectedIndex")
    GET_SELECTED_INDEX("getSelectedIndex"),
    @XmlEnumValue("getSelectedIds")
    GET_SELECTED_IDS("getSelectedIds"),
    @XmlEnumValue("getSelectedId")
    GET_SELECTED_ID("getSelectedId"),
    @XmlEnumValue("isSomethingSelected")
    IS_SOMETHING_SELECTED("isSomethingSelected"),
    @XmlEnumValue("getSelectOptions")
    GET_SELECT_OPTIONS("getSelectOptions"),
    @XmlEnumValue("getAttribute")
    GET_ATTRIBUTE("getAttribute"),
    @XmlEnumValue("isTextPresent")
    IS_TEXT_PRESENT("isTextPresent"),
    @XmlEnumValue("isElementPresent")
    IS_ELEMENT_PRESENT("isElementPresent"),
    @XmlEnumValue("isVisible")
    IS_VISIBLE("isVisible"),
    @XmlEnumValue("isEditable")
    IS_EDITABLE("isEditable"),
    @XmlEnumValue("getAllButtons")
    GET_ALL_BUTTONS("getAllButtons"),
    @XmlEnumValue("getAllLinks")
    GET_ALL_LINKS("getAllLinks"),
    @XmlEnumValue("getAllFields")
    GET_ALL_FIELDS("getAllFields"),
    @XmlEnumValue("getAttributeFromAllWindows")
    GET_ATTRIBUTE_FROM_ALL_WINDOWS("getAttributeFromAllWindows"),
    @XmlEnumValue("dragdrop")
    DRAGDROP("dragdrop"),
    @XmlEnumValue("setMouseSpeed")
    SET_MOUSE_SPEED("setMouseSpeed"),
    @XmlEnumValue("getMouseSpeed")
    GET_MOUSE_SPEED("getMouseSpeed"),
    @XmlEnumValue("dragAndDrop")
    DRAG_AND_DROP("dragAndDrop"),
    @XmlEnumValue("dragAndDropToObject")
    DRAG_AND_DROP_TO_OBJECT("dragAndDropToObject"),
    @XmlEnumValue("windowFocus")
    WINDOW_FOCUS("windowFocus"),
    @XmlEnumValue("windowMaximize")
    WINDOW_MAXIMIZE("windowMaximize"),
    @XmlEnumValue("getAllWindowIds")
    GET_ALL_WINDOW_IDS("getAllWindowIds"),
    @XmlEnumValue("getAllWindowNames")
    GET_ALL_WINDOW_NAMES("getAllWindowNames"),
    @XmlEnumValue("getAllWindowTitles")
    GET_ALL_WINDOW_TITLES("getAllWindowTitles"),
    @XmlEnumValue("getHtmlSource")
    GET_HTML_SOURCE("getHtmlSource"),
    @XmlEnumValue("setCursorPosition")
    SET_CURSOR_POSITION("setCursorPosition"),
    @XmlEnumValue("getElementIndex")
    GET_ELEMENT_INDEX("getElementIndex"),
    @XmlEnumValue("isOrdered")
    IS_ORDERED("isOrdered"),
    @XmlEnumValue("getElementPositionLeft")
    GET_ELEMENT_POSITION_LEFT("getElementPositionLeft"),
    @XmlEnumValue("getElementPositionTop")
    GET_ELEMENT_POSITION_TOP("getElementPositionTop"),
    @XmlEnumValue("getElementWidth")
    GET_ELEMENT_WIDTH("getElementWidth"),
    @XmlEnumValue("getElementHeight")
    GET_ELEMENT_HEIGHT("getElementHeight"),
    @XmlEnumValue("getCursorPosition")
    GET_CURSOR_POSITION("getCursorPosition"),
    @XmlEnumValue("getExpression")
    GET_EXPRESSION("getExpression"),
    @XmlEnumValue("getXpathCount")
    GET_XPATH_COUNT("getXpathCount"),
    @XmlEnumValue("getCssCount")
    GET_CSS_COUNT("getCssCount"),
    @XmlEnumValue("assignId")
    ASSIGN_ID("assignId"),
    @XmlEnumValue("allowNativeXpath")
    ALLOW_NATIVE_XPATH("allowNativeXpath"),
    @XmlEnumValue("ignoreAttributesWithoutValue")
    IGNORE_ATTRIBUTES_WITHOUT_VALUE("ignoreAttributesWithoutValue"),
    @XmlEnumValue("waitForCondition")
    WAIT_FOR_CONDITION("waitForCondition"),
    @XmlEnumValue("setTimeout")
    SET_TIMEOUT("setTimeout"),
    @XmlEnumValue("waitForPageToLoad")
    WAIT_FOR_PAGE_TO_LOAD("waitForPageToLoad"),
    @XmlEnumValue("waitForFrameToLoad")
    WAIT_FOR_FRAME_TO_LOAD("waitForFrameToLoad"),
    @XmlEnumValue("getCookie")
    GET_COOKIE("getCookie"),
    @XmlEnumValue("getCookieByName")
    GET_COOKIE_BY_NAME("getCookieByName"),
    @XmlEnumValue("isCookiePresent")
    IS_COOKIE_PRESENT("isCookiePresent"),
    @XmlEnumValue("createCookie")
    CREATE_COOKIE("createCookie"),
    @XmlEnumValue("deleteCookie")
    DELETE_COOKIE("deleteCookie"),
    @XmlEnumValue("deleteAllVisibleCookies")
    DELETE_ALL_VISIBLE_COOKIES("deleteAllVisibleCookies"),
    @XmlEnumValue("setBrowserLogLevel")
    SET_BROWSER_LOG_LEVEL("setBrowserLogLevel"),
    @XmlEnumValue("runScript")
    RUN_SCRIPT("runScript"),
    @XmlEnumValue("addLocationStrategy")
    ADD_LOCATION_STRATEGY("addLocationStrategy"),
    @XmlEnumValue("captureScreenshot")
    CAPTURE_SCREENSHOT("captureScreenshot"),
    @XmlEnumValue("captureEntirePageScreenshot")
    CAPTURE_ENTIRE_PAGE_SCREENSHOT("captureEntirePageScreenshot"),
    @XmlEnumValue("rollup")
    ROLLUP("rollup"),
    @XmlEnumValue("addScript")
    ADD_SCRIPT("addScript"),
    @XmlEnumValue("removeScript")
    REMOVE_SCRIPT("removeScript"),
    @XmlEnumValue("useXpathLibrary")
    USE_XPATH_LIBRARY("useXpathLibrary"),
    @XmlEnumValue("pause")
    PAUSE("pause"),
    @XmlEnumValue("echo")
    ECHO("echo"),
    @XmlEnumValue("clickAndWait")
    CLICK_AND_WAIT("clickAndWait"),
    @XmlEnumValue("selectAndWait")
    SELECT_AND_WAIT("selectAndWait"),
    @XmlEnumValue("typeAndWait")
    TYPE_AND_WAIT("typeAndWait"),
    @XmlEnumValue("store")
    STORE("store"),
    @XmlEnumValue("storeAlert")
    STORE_ALERT("storeAlert"),
    @XmlEnumValue("storeAllButtons")
    STORE_ALL_BUTTONS("storeAllButtons"),
    @XmlEnumValue("storeAllFields")
    STORE_ALL_FIELDS("storeAllFields"),
    @XmlEnumValue("storeAllLinks")
    STORE_ALL_LINKS("storeAllLinks"),
    @XmlEnumValue("storeAllWindowIds")
    STORE_ALL_WINDOW_IDS("storeAllWindowIds"),
    @XmlEnumValue("storeAllWindowNames")
    STORE_ALL_WINDOW_NAMES("storeAllWindowNames"),
    @XmlEnumValue("storeAllWindowTitles")
    STORE_ALL_WINDOW_TITLES("storeAllWindowTitles"),
    @XmlEnumValue("storeAttribute")
    STORE_ATTRIBUTE("storeAttribute"),
    @XmlEnumValue("storeAttributeFromAllWindows")
    STORE_ATTRIBUTE_FROM_ALL_WINDOWS("storeAttributeFromAllWindows"),
    @XmlEnumValue("storeBodyText")
    STORE_BODY_TEXT("storeBodyText"),
    @XmlEnumValue("storeConfirmation")
    STORE_CONFIRMATION("storeConfirmation"),
    @XmlEnumValue("storeCookie")
    STORE_COOKIE("storeCookie"),
    @XmlEnumValue("storeCookieByName")
    STORE_COOKIE_BY_NAME("storeCookieByName"),
    @XmlEnumValue("storeCursorPosition")
    STORE_CURSOR_POSITION("storeCursorPosition"),
    @XmlEnumValue("storeElementHeight")
    STORE_ELEMENT_HEIGHT("storeElementHeight"),
    @XmlEnumValue("storeElementIndex")
    STORE_ELEMENT_INDEX("storeElementIndex"),
    @XmlEnumValue("storeElementPositionLeft")
    STORE_ELEMENT_POSITION_LEFT("storeElementPositionLeft"),
    @XmlEnumValue("storeElementPositionTop")
    STORE_ELEMENT_POSITION_TOP("storeElementPositionTop"),
    @XmlEnumValue("storeElementWidth")
    STORE_ELEMENT_WIDTH("storeElementWidth"),
    @XmlEnumValue("storeEval")
    STORE_EVAL("storeEval"),
    @XmlEnumValue("storeExpression")
    STORE_EXPRESSION("storeExpression"),
    @XmlEnumValue("storeHtmlSource")
    STORE_HTML_SOURCE("storeHtmlSource"),
    @XmlEnumValue("storeLocation")
    STORE_LOCATION("storeLocation"),
    @XmlEnumValue("storeMouseSpeed")
    STORE_MOUSE_SPEED("storeMouseSpeed"),
    @XmlEnumValue("storePrompt")
    STORE_PROMPT("storePrompt"),
    @XmlEnumValue("storeSelectedId")
    STORE_SELECTED_ID("storeSelectedId"),
    @XmlEnumValue("storeSelectedIds")
    STORE_SELECTED_IDS("storeSelectedIds"),
    @XmlEnumValue("storeSelectedIndex")
    STORE_SELECTED_INDEX("storeSelectedIndex"),
    @XmlEnumValue("storeSelectedIndexes")
    STORE_SELECTED_INDEXES("storeSelectedIndexes"),
    @XmlEnumValue("storeSelectedLabel")
    STORE_SELECTED_LABEL("storeSelectedLabel"),
    @XmlEnumValue("storeSelectedLabels")
    STORE_SELECTED_LABELS("storeSelectedLabels"),
    @XmlEnumValue("storeSelectedValue")
    STORE_SELECTED_VALUE("storeSelectedValue"),
    @XmlEnumValue("storeSelectedValues")
    STORE_SELECTED_VALUES("storeSelectedValues"),
    @XmlEnumValue("storeSelectOptions")
    STORE_SELECT_OPTIONS("storeSelectOptions"),
    @XmlEnumValue("storeSpeed")
    STORE_SPEED("storeSpeed"),
    @XmlEnumValue("storeTable")
    STORE_TABLE("storeTable"),
    @XmlEnumValue("storeText")
    STORE_TEXT("storeText"),
    @XmlEnumValue("storeTitle")
    STORE_TITLE("storeTitle"),
    @XmlEnumValue("storeValue")
    STORE_VALUE("storeValue"),
    @XmlEnumValue("storeWhetherThisFrameMatchFrameExpression")
    STORE_WHETHER_THIS_FRAME_MATCH_FRAME_EXPRESSION("storeWhetherThisFrameMatchFrameExpression"),
    @XmlEnumValue("storeWhetherThisWindowMatchWindowExpression")
    STORE_WHETHER_THIS_WINDOW_MATCH_WINDOW_EXPRESSION("storeWhetherThisWindowMatchWindowExpression"),
    @XmlEnumValue("storeXpathCount")
    STORE_XPATH_COUNT("storeXpathCount"),
    @XmlEnumValue("storeAlertPresent")
    STORE_ALERT_PRESENT("storeAlertPresent"),
    @XmlEnumValue("storeChecked")
    STORE_CHECKED("storeChecked"),
    @XmlEnumValue("storeConfirmationPresent")
    STORE_CONFIRMATION_PRESENT("storeConfirmationPresent"),
    @XmlEnumValue("storeCookiePresent")
    STORE_COOKIE_PRESENT("storeCookiePresent"),
    @XmlEnumValue("storeEditable")
    STORE_EDITABLE("storeEditable"),
    @XmlEnumValue("storeElementPresent")
    STORE_ELEMENT_PRESENT("storeElementPresent"),
    @XmlEnumValue("storeOrdered")
    STORE_ORDERED("storeOrdered"),
    @XmlEnumValue("storePromptPresent")
    STORE_PROMPT_PRESENT("storePromptPresent"),
    @XmlEnumValue("storeSomethingSelected")
    STORE_SOMETHING_SELECTED("storeSomethingSelected"),
    @XmlEnumValue("storeTextPresent")
    STORE_TEXT_PRESENT("storeTextPresent"),
    @XmlEnumValue("storeVisible")
    STORE_VISIBLE("storeVisible");
    private final String value;

    SeleneseCommand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeleneseCommand fromValue(String v) {
        for (SeleneseCommand c: SeleneseCommand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
