/*
 * Format for Selenium Remote Control Java client.
 */



this.name = "java-rc-junit4";

function useSeparateEqualsForArray() {
	return true;
}

function testMethodName(testName) {
	return "test" + capitalize(testName);
}

function assertTrue(expression) {
	return "assertTrue(" + expression.toString() + ");";
}

function verifyTrue(expression) {
	return "verifyTrue(" + expression.toString() + ");";
}

function assertFalse(expression) {
	return "assertFalse(" + expression.toString() + ");";
}

function verifyFalse(expression) {
	return "verifyFalse(" + expression.toString() + ");";
}

function assignToVariable(type, variable, expression) {
	return type + " " + variable + " = " + expression.toString();
}

function ifCondition(expression, callback) {
    return "if (" + expression.toString() + ") {\n" + callback() + "}";
}

function joinExpression(expression) {
    return "join(" + expression.toString() + ", ',')";
}

function waitFor(expression) {
	return "for (int second = 0;; second++) {\n" +
		"\tif (second >= 60) fail(\"timeout\");\n" +
		"\ttry { " + (expression.setup ? expression.setup() + " " : "") +
		"if (" + expression.toString() + ") break; } catch (Exception e) {}\n" +
		"\tThread.sleep(1000);\n" +
		"}\n";
	//return "while (" + not(expression).toString() + ") { Thread.sleep(1000); }";
}

function assertOrVerifyFailure(line, isAssert) {
	var message = '"expected failure"';
    var failStatement = "fail(" + message + ");";
	return "try { " + line + " " + failStatement + " } catch (Throwable e) {}";
}

/**
 * Compose lines for onload function.
 * @param command
 * @returns
 */
function onload(command) {
	var line = null;
	if(command.command == 'onloadCloseAlert') {
		// 32 key code is for a space key
		line = '' + 
		'\n\tThread.sleep(3000);\n' +
		'\tselenium.keyDownNative("32");\n' +
		'\tselenium.keyUpNative("32");\n';
	}
	return line;
}

Equals.prototype.toString = function() {
    if (this.e1.toString().match(/^\d+$/)) {
        // int
	    return this.e1.toString() + " == " + this.e2.toString();
    } else {
        // string
	    return this.e1.toString() + ".equals(" + this.e2.toString() + ")";
    }
};

Equals.prototype.assert = function() {
	return "assertEquals(" + this.e1.toString() + ", " + this.e2.toString() + ");";
};

Equals.prototype.verify = function() {
	return "verifyEquals(" + this.e1.toString() + ", " + this.e2.toString() + ");";
};

NotEquals.prototype.toString = function() {
	return "!" + this.e1.toString() + ".equals(" + this.e2.toString() + ")";
};

NotEquals.prototype.assert = function() {
	return "assertNotEquals(" + this.e1.toString() + ", " + this.e2.toString() + ");";
};

NotEquals.prototype.verify = function() {
	return "verifyNotEquals(" + this.e1.toString() + ", " + this.e2.toString() + ");";
};

RegexpMatch.prototype.toString = function() {
	if (this.pattern.match(/^\^/) && this.pattern.match(/\$$/)) {
		return this.expression + ".matches(" + string(this.pattern) + ")";
	} else {
		return "Pattern.compile(" + string(this.pattern) + ").matcher(" + this.expression + ").find()";
	}
};

function pause(milliseconds) {
	return "Thread.sleep(" + parseInt(milliseconds, 10) + ");";
}

function echo(message) {
	return "System.out.println(" + xlateArgument(message) + ");";
}

function statement(expression) {
	return expression.toString() + ';';
}

function array(value) {
	var str = 'new String[] {';
	for (var i = 0; i < value.length; i++) {
		str += string(value[i]);
		if (i < value.length - 1) str += ", ";
	}
	str += '}';
	return str;
}

function nonBreakingSpace() {
    return "\"\\u00a0\"";
}

CallSelenium.prototype.toString = function() {
	var result = '';
	if (this.negative) {
		result += '!';
	}
	if (options.receiver) {
		result += options.receiver + '.';
	}
	result += this.message;
	result += '(';
	for (var i = 0; i < this.args.length; i++) {
		result += this.args[i];
		if (i < this.args.length - 1) {
			result += ', ';
		}
	}
	result += ')';
	return result;
};

function formatComment(comment) {
	return comment.comment.replace(/.+/mg, function(str) {
			return "// " + str;
		});
}

/**
 * Returns a string representing the suite for this formatter language.
 *
 * @param testSuite  the suite to format
 * @param filename   the file the formatted suite will be saved as
 */
function formatSuite(testSuite, filename) {
    var suiteClass = /^(\w+)/.exec(filename)[1];
    suiteClass = suiteClass[0].toUpperCase() + suiteClass.substring(1);
    
    var formattedSuite = "import junit.framework.Test;\n"
        + "import junit.framework.TestSuite;\n"
        + "\n"
        + "public class " + suiteClass + " {\n"
        + "\n"
        + indents(1) + "public static Test suite() {\n"
        + indents(2) + "TestSuite suite = new TestSuite();\n";
        
    for (var i = 0; i < testSuite.tests.length; ++i) {
        var testClass = testSuite.tests[i].getTitle();
        formattedSuite += indents(2)
            + "suite.addTestSuite(" + testClass + ".class);\n";
    }

    formattedSuite += indents(2) + "return suite;\n"
        + indents(1) + "}\n"
        + "\n"
        + indents(1) + "public static void main(String[] args) {\n"
        + indents(2) + "junit.textui.TestRunner.run(suite());\n"
        + indents(1) + "}\n"
        + "}\n";
    
    return formattedSuite;
}

function defaultExtension() {
  return this.options.defaultExtension;
}

this.options = {
	receiver: "selenium",
	environment: "*googlechrome",
	screenshotsDirectory: "/screenshots/",
	packageName: "com.example.tests",
	superClass: "DextraTestCase",
    indent:	'tab',
    initialIndents:	'2',
    defaultExtension: "java",
    timeout: '3000',
    speed: '1000'
};

options.header =
	"package ${packageName};\n" +
	"\n" +
	"import com.dextratech.dtf.DextraTestCase;\n"+
	"import com.dextratech.dtf.exception.DextraSeleniumException;\n"+
	"import com.thoughtworks.selenium.*;\n" +
	"import org.junit.After;\n" +
	"import org.junit.Before;\n" +
	"import org.junit.Test;\n" +
	"import java.util.regex.Pattern;\n" +
	"\n" +
    "public class ${className} extends ${superClass} {\n" +
    "\tprivate boolean success = ${success};\n" +
    '\tprivate String screenshotDirectory = "${screenshotsDirectory}/";\n\n' +
    "\t@Before\n" +
    "\tpublic void setUp() throws Exception {\n" +
    "${dbSnapshot}" +
    '\t\tselenium = new DefaultSelenium("${seleniumHost}", ${seleniumPort}, "${environment}", "${baseURL}");\n' +
	"\t\tselenium.start();\n" +
	'\t\tselenium.setTimeout("${timeout}");\n' +
    "\t}\n" +
	"\n" +
	"\t@Test\n" +
    "\tpublic void ${methodName}() throws Throwable {\n" + 
    "\t\tselenium.windowMaximize();\n"+
    "\t\tselenium.windowFocus();\n"+
    '\t\tselenium.setSpeed("${speed}");\n'+
    '\t\ttry {\n';

options.footer =
	'\t\t} catch (Throwable e) {\n'+
	'\t\t\tString screenshotFile = captureScreenshot(screenshotDirectory);\n'+
	'\t\t\trunAfterErrorCommands();\n'+
	'\t\t\tif (success && errorCommands.size() == 0 || !success && !currentCommand.getErrorStep()) {\n'+
	'\t\t\t\tfireDextraSeleniumException(e, screenshotFile);\n'+
	'\t\t\t}\n'+
	'\t\t}\n'+
	'\t\tif (errorCommands.size() > 0) {\n'+
	'\t\t\tfireNoErrorOccurredException();\n' +
	'\t\t}\n' +
	'\t}\n' +
	'\n' +
	"\t@After\n" +
	"\tpublic void tearDown() throws Exception {\n" +
	"${dbRestore}"+
	"\t\tselenium.stop();\n" +
	"\t}\n" +
	"\t\n" +
	"\tprivate void runAfterErrorCommands() {\n" +
	"\t}\n" +
	"}\n";

this.configForm = 
	'<description>Variable for Selenium instance</description>' +
	'<textbox id="options_receiver" />' +
	'<description>Environment</description>' +
	'<textbox id="options_environment" />' +
	'<description>Package</description>' +
	'<textbox id="options_packageName" />' +
	'<description>Superclass</description>' +
	'<textbox id="options_superClass" />';