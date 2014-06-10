//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.plugin;

/**
 * Special commands wich receives only one parameter: a pattern.
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 *         03/05/2013
 */
public enum SpecialCommand {

	assertAlert,
	assertNotAlert,
	verifyAlert,
	verifyNotAlert,
	waitForAlert,
	waitForNotAlert,

	assertAllButtons,
	assertNotAllButtons,
	verifyAllButtons,
	verifyNotAllButtons,
	waitForAllButtons,
	waitForNotAllButtons,

	assertAllFields,
	assertNotAllFields,
	verifyAllFields,
	verifyNotAllFields,
	waitForAllFields,
	waitForNotAllFields,

	assertAllLinks,
	assertNotAllLinks,
	verifyAllLinks,
	verifyNotAllLinks,
	waitForAllLinks,
	waitForNotAllLinks,

	assertAllWindowIds,
	assertNotAllWindowIds,
	verifyAllWindowIds,
	verifyNotAllWindowIds,
	waitForAllWindowIds,
	waitForNotAllWindowIds,

	assertAllWindowNames,
	assertNotAllWindowNames,
	verifyAllWindowNames,
	verifyNotAllWindowNames,
	waitForAllWindowNames,
	waitForNotAllWindowNames,

	assertAllWindowTitles,
	assertNotAllWindowTitles,
	verifyAllWindowTitles,
	verifyNotAllWindowTitles,
	waitForAllWindowTitles,
	waitForNotAllWindowTitles,

	assertBodyText,
	assertNotBodyText,
	verifyBodyText,
	verifyNotBodyText,
	waitForBodyText,
	waitForNotBodyText,

	assertConfirmation,
	assertNotConfirmation,
	verifyConfirmation,
	verifyNotConfirmation,
	waitForConfirmation,
	waitForNotConfirmation,

	assertCookie,
	assertNotCookie,
	verifyCookie,
	verifyNotCookie,
	waitForCookie,
	waitForNotCookie,

	assertHtmlSource,
	assertNotHtmlSource,
	verifyHtmlSource,
	verifyNotHtmlSource,
	waitForHtmlSource,
	waitForNotHtmlSource,

	assertLocation,
	assertNotLocation,
	verifyLocation,
	verifyNotLocation,
	waitForLocation,
	waitForNotLocation,

	assertLogMessages,
	assertNotLogMessages,
	verifyLogMessages,
	verifyNotLogMessages,
	waitForLogMessages,
	waitForNotLogMessages,

	assertPrompt,
	assertNotPrompt,
	verifyPrompt,
	verifyNotPrompt,
	waitForPrompt,
	waitForNotPrompt,

	assertTitle,
	assertNotTitle,
	verifyTitle,
	verifyNotTitle,
	waitForTitle,
	waitForNotTitle,

	assertTextPresent,
	assertTextNotPresent,
	verifyTextPresent,
	verifyTextNotPresent,
	waitForTextPresent,
	waitForTextNotPresent

}
