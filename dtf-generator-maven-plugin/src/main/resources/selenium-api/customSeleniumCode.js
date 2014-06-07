var testCase = new TestCase(className);
    
var commands = [];
Command.apiDocuments = new Array(apiDocument);
log.debug('Converting to Java using [ ' + this.name + ' ]...');
for (var i in formatedSeleniumCommandList) {
	var javaCommand = formatedSeleniumCommandList[i];
	log.trace('Translating command ('+i+'): ' + javaCommand);
	var cmd = javaCommand.getName();
	cmd = String(cmd);
	var target = javaCommand.getTarget();
	target = String(target);
	var value = javaCommand.getValue();
	value = String(value);
	var errorStep = javaCommand.getErrorStep();
	errorStep = String(errorStep);
	var testingCommand = javaCommand.getTestingCommand4Testcase();
	testingCommand = String(testingCommand);
	var jsCommand = new Command(cmd, target, value, errorStep, testingCommand);
	commands.push(jsCommand);
	log.trace('Pushed JS command ('+i+'): ' + jsCommand);
}
if(commands)
	testCase.commands = commands;
if(screenshotsDirectory)
	testCase.screenshotsDirectory = screenshotsDirectory;
if(testName)
	testCase.testName = testName;
if(driver)
	testCase.driver = driver;
if(success)
	testCase.success = success;
if(packageName)
	testCase.packageName = packageName;
if(seleniumHost)
	testCase.seleniumHost = seleniumHost;
if(seleniumPort)
	testCase.seleniumPort = seleniumPort;
if(browser)
	testCase.browser = browser;
if(browserMaximized)
	testCase.browserMaximized = browserMaximized;
if(baseurl)
	testCase.baseURL = baseurl;
if(timeout) {
	testCase.timeout = timeout;
	options.timeout = timeout.toString();
}
if(speed)
	testCase.speed = speed;
if(dbSnapshot)
	testCase.dbSnapshot = dbSnapshot;
if(dbRestore)
	testCase.dbRestore = dbRestore;
testCase = format(testCase);
var result = testCase.toString();

