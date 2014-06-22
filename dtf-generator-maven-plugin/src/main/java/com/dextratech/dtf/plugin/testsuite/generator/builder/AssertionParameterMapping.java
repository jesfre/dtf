/**
 * 
 */
package com.dextratech.dtf.plugin.testsuite.generator.builder;


/**
 * A mapping for correspondence command parameters.
 * This is, which parameter in a Selenese command is corresponding to parameter position (parameter1, parameter2). 
 * @author <a href="jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 * 20/06/2014
 */
public enum AssertionParameterMapping {

	Alert("pattern", null),
	AlertNotPresent(null, null),
	AlertPresent(null, null),
	AllButtons("pattern", null),
	AllFields("pattern", null),
	AllLinks("pattern", null),
	AllWindowIds("pattern", null),
	AllWindowNames("pattern", null),
	AllWindowTitles("pattern", null),
	Attribute("attributeLocator", "pattern"),
	AttributeFromAllWindows("attributeName", "pattern"),
	BodyText("pattern", null),
	Checked("locator", null),
	Confirmation("pattern", null),
	ConfirmationNotPresent(null, null),
	ConfirmationPresent(null, null),
	Cookie("pattern", null),
	CookieByName("name", "pattern"),
	CookieNotPresent("name", null),
	CookiePresent("name", null),
	CursorPosition("locator", "pattern"),
	Editable("locator", null),
	ElementHeight("locator", "pattern"),
	ElementIndex("locator", "pattern"),
	ElementNotPresent("locator", null),
	ElementPositionLeft("locator", "pattern"),
	ElementPositionTop("locator", "pattern"),
	ElementPresent("locator", null),
	ElementWidth("locator", "pattern"),
	ErrorOnNext("message", null),
	Eval("script", "pattern"),
	Expression("expression", "pattern"),
	FailureOnNext("message", null),
	HtmlSource("pattern", null),
	Location("pattern", null),
	MouseSpeed("pattern", null),
	NotAlert("pattern", null),
	NotAllButtons("pattern", null),
	NotAllFields("pattern", null),
	NotAllLinks("pattern", null),
	NotAllWindowIds("pattern", null),
	NotAllWindowNames("pattern", null),
	NotAllWindowTitles("pattern", null),
	NotAttribute("attributeLocator", "pattern"),
	NotAttributeFromAllWindows("attributeName", "pattern"),
	NotBodyText("pattern", null),
	NotChecked("locator", null),
	NotConfirmation("pattern", null),
	NotCookie("pattern", null),
	NotCookieByName("name", "pattern"),
	NotCursorPosition("locator", "pattern"),
	NotEditable("locator", null),
	NotElementHeight("locator", "pattern"),
	NotElementIndex("locator", "pattern"),
	NotElementPositionLeft("locator", "pattern"),
	NotElementPositionTop("locator", "pattern"),
	NotElementWidth("locator", "pattern"),
	NotErrorOnNext("message", null),
	NotEval("script", "pattern"),
	NotExpression("expression", "pattern"),
	NotFailureOnNext("message", null),
	NotHtmlSource("pattern", null),
	NotLocation("pattern", null),
	NotMouseSpeed("pattern", null),
	NotOrdered("locator1", "locator2"),
	NotPrompt("pattern", null),
	NotSelected("selectLocator", "optionLocator"),
	NotSelectedId("selectLocator", "pattern"),
	NotSelectedIds("selectLocator", "pattern"),
	NotSelectedIndex("selectLocator", "pattern"),
	NotSelectedIndexes("selectLocator", "pattern"),
	NotSelectedLabel("selectLocator", "pattern"),
	NotSelectedLabels("selectLocator", "pattern"),
	NotSelectedValue("selectLocator", "pattern"),
	NotSelectedValues("selectLocator", "pattern"),
	NotSelectOptions("selectLocator", "pattern"),
	NotSomethingSelected("selectLocator", null),
	NotSpeed("pattern", null),
	NotTable("tableCellAddress", "pattern"),
	NotText("locator", "pattern"),
	NotTitle("pattern", null),
	NotValue("locator", "pattern"),
	NotVisible("locator", null),
	NotWhetherThisFrameMatchFrameExpression("currentFrameString", "target"),
	NotWhetherThisWindowMatchWindowExpression("currentWindowString", "target"),
	NotXpathCount("xpath", "pattern"),
	Ordered("locator1", "locator2"),
	Prompt("pattern", null),
	PromptNotPresent(null, null),
	PromptPresent(null, null),
	Selected("selectLocator", "optionLocator"),
	SelectedId("selectLocator", "pattern"),
	SelectedIds("selectLocator", "pattern"),
	SelectedIndex("selectLocator", "pattern"),
	SelectedIndexes("selectLocator", "pattern"),
	SelectedLabel("selectLocator", "pattern"),
	SelectedLabels("selectLocator", "pattern"),
	SelectedValue("selectLocator", "pattern"),
	SelectedValues("selectLocator", "pattern"),
	SelectOptions("selectLocator", "pattern"),
	SomethingSelected("selectLocator", null),
	Speed("pattern", null),
	Table("tableCellAddress", "pattern"),
	Text("locator", "pattern"),
	TextNotPresent("pattern", null),
	TextPresent("pattern", null),
	Title("pattern", null),
	Value("locator", "pattern"),
	Visible("locator", null),
	WhetherThisFrameMatchFrameExpression("currentFrameString", "target"),
	WhetherThisWindowMatchWindowExpression("currentWindowString", "target"),
	XpathCount("xpath", "pattern");

	private String parameter1Name = null;
	private String parameter2Name = null;
	
	private AssertionParameterMapping(String parameter1Name, String parameter2Name) {
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
