/* Modified:
 * New function
 */
SeleniumWebDriverAdaptor.prototype.captureScreenshot = function(locator, text) {
	var filePath = xlateArgument(this.rawArgs[0]);
	return 'captureScreenshot('+filePath+')';
};
