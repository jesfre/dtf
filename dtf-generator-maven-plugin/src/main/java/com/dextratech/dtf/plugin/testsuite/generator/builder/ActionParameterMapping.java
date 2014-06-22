/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;


/**
 * A mapping for correspondence command parameters.
 * This is, which parameter in a Selenese command is corresponding to parameter position (errorStep, parameter1, parameter2, parameter3). 
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 21/06/2014
 */
public enum ActionParameterMapping {

	AddLocationStrategy("strategyName", "functionDefinition"),
	AddScript("scriptContent", "scriptTagId"),
	AddSelection("locator", "optionLocator"),
	AllowNativeXpath("allow", null),
	AnswerOnNextPrompt("answer", null),
	AssignId("locator", "identifier"),
	Break(null, null),
	Check("locator", null),
	ChooseCancelOnNextConfirmation(null, null),
	ChooseOkOnNextConfirmation(null, null),
	Close(null, null),
	CreateCookie("nameValuePair", "optionsString"),
	DeleteAllVisibleCookies(null, null),
	DeleteCookie("name", "optionsString"),
	DeselectPopUp(null, null),
	DragAndDrop("locator", "movementsString"),
	DragAndDropToObject("locatorOfObjectToBeDragged", "locatorOfDragDestinationObject"),
	Dragdrop("locator", "movementsString"),
	FireEvent("locator", "eventName"),
	Focus("locator", null),
	Highlight("locator", null),
	IgnoreAttributesWithoutValue("ignore", null),
	Open("url", null),
	OpenWindow("url", "windowID"),
	Pause("waitTime", null),
	RemoveAllSelections("locator", null),
	RemoveScript("scriptTagId", null),
	RemoveSelection("locator", "optionLocator"),
	Rollup("rollupName", "kwargs"),
	RunScript("script", null),
	Select("selectLocator", "optionLocator"),
	SelectFrame("locator", null),
	SelectPopUp("windowID", null),
	SelectWindow("windowID", null),
	SetBrowserLogLevel("logLevel", null),
	SetCursorPosition("locator", "position"),
	SetMouseSpeed("pixels", null),
	SetSpeed("value", null),
	SetTimeout("timeout", null),
	Submit("formLocator", null),
	Type("locator", "value"),
	TypeKeys("locator", "value"),
	Uncheck("locator", null),
	UseXpathLibrary("libraryName", null),
	Click("locator", null),
	ClickAndWait("locator", null),
	ClickAt("locator", "coordString"),
	DoubleClick("locator", null),
	DoubleClickAt("locator", "coordString"),
	ContextMenu("locator", null),
	ContextMenuAt("locator", "coordString"),
	MouseDown("locator", null),
	MouseDownAt("locator", "coordString"),
	MouseDownRight("locator", null),
	MouseDownRightAt("locator", "coordString"),
	MouseMove("locator", null),
	MouseMoveAt("locator", "coordString"),
	MouseOut("locator", null),
	MouseOver("locator", null),
	MouseUp("locator", null),
	MouseUpAt("locator", "coordString"),
	MouseUpRight("locator", null),
	MouseUpRightAt("locator", "coordString"),
	GoBack(null, null),
	Refresh(null, null),
	WindowFocus(null, null),
	WindowMaximize(null, null),
	Store("expression", "variableName"),
	StoreAlert("variableName", null),
	StoreAlertPresent("variableName", null),
	StoreAllButtons("variableName", null),
	StoreAllFields("variableName", null),
	StoreAllLinks("variableName", null),
	StoreAllWindowIds("variableName", null),
	StoreAllWindowNames("variableName", null),
	StoreAllWindowTitles("variableName", null),
	StoreAttribute("attributeLocator", "variableName"),
	StoreAttributeFromAllWindows("attributeName", "variableName"),
	StoreBodyText("variableName", null),
	StoreChecked("locator", "variableName"),
	StoreConfirmation("variableName", null),
	StoreConfirmationPresent("variableName", null),
	StoreCookie("variableName", null),
	StoreCookieByName("name", "variableName"),
	StoreCookiePresent("name", "variableName"),
	StoreCursorPosition("locator", "variableName"),
	StoreEditable("locator", "variableName"),
	StoreElementHeight("locator", "variableName"),
	StoreElementIndex("locator", "variableName"),
	StoreElementPositionLeft("locator", "variableName"),
	StoreElementPositionTop("locator", "variableName"),
	StoreElementPresent("locator", "variableName"),
	StoreElementWidth("locator", "variableName"),
	StoreEval("script", "variableName"),
	StoreExpression("expression", "variableName"),
	StoreHtmlSource("variableName", null),
	StoreLocation("variableName", null),
	StoreMouseSpeed("variableName", null),
	StorePrompt("variableName", null),
	StorePromptPresent("variableName", null),
	StoreSelectedId("selectLocator", "variableName"),
	StoreSelectedIds("selectLocator", "variableName"),
	StoreSelectedIndex("selectLocator", "variableName"),
	StoreSelectedIndexes("selectLocator", "variableName"),
	StoreSelectedLabel("selectLocator", "variableName"),
	StoreSelectedLabels("selectLocator", "variableName"),
	StoreSelectedValue("selectLocator", "variableName"),
	StoreSelectedValues("selectLocator", "variableName"),
	StoreSelectOptions("selectLocator", "variableName"),
	StoreSomethingSelected("selectLocator", "variableName"),
	StoreSpeed("variableName", null),
	StoreTable("tableCellAddress", "variableName"),
	StoreText("locator", "variableName"),
	StoreTextPresent("pattern", "variableName"),
	StoreTitle("variableName", null),
	StoreValue("locator", "variableName"),
	StoreVisible("locator", "variableName"),
	StoreXpathCount("xpath", "variableName"),
	AltKeyDown(null, null),
	AltKeyUp(null, null),
	ControlKeyDown(null, null),
	ControlKeyUp(null, null),
	KeyDown("locator", "keySequence"),
	KeyPress("locator", "keySequence"),
	KeyUp("locator", "keySequence"),
	MetaKeyDown(null, null),
	MetaKeyUp(null, null),
	ShiftKeyDown(null, null),
	ShiftKeyUp(null, null);

	private String parameter1Name = null;
	private String parameter2Name = null;
	
	private ActionParameterMapping(String parameter1Name, String parameter2Name) {
		this.parameter1Name = parameter1Name;
		this.parameter2Name = parameter2Name;
	}

	public String getParameter1Name() {
		return parameter1Name;
	}

	public String getParameter2Name() {
		return parameter2Name;
	}

}
