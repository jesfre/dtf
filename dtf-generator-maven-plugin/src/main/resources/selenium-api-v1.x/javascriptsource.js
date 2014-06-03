

/** ======================================================================= **/
/** 							remoteControl.js 							**/
/** ======================================================================= **/

/*
 * Common classes / functions for Selenium RC format.
 */

function formatHeader(testCase) {
    var className = testCase.getTitle();
	if (!className) {
		className = "NewTest";
	}

	var formatLocal = testCase.formatLocal(this.name);
	methodName = testMethodName(className.replace(/Test$/, "").replace(/^Test/, "").
								replace(/^[A-Z]/, function(str) { return str.toLowerCase(); }));
	var header = (options.getHeader ? options.getHeader() : options.header).
		replace(/\$\{screenshotsDirectory\}/g, screenshotsDirectory).
		replace(/\\/g, '/').
		replace(/\$\{success\}/g, success).
		replace(/\$\{packageName\}/g, packageName).
		replace(/\$\{seleniumHost\}/g, seleniumHost).
		replace(/\$\{seleniumPort\}/g, seleniumPort).
		replace(/\$\{environment\}/g, browser).
		replace(/\$\{baseURL\}/g, baseurl).
		replace(/\$\{className\}/g, className).
		replace(/\$\{timeout\}/g, timeout).
		replace(/\$\{speed\}/g, speed).
		replace(/\$\{methodName\}/g, methodName).
		replace(/\$\{baseURL\}/g, testCase.getBaseURL()).
		replace(/\$\{dbSnapshot\}/g, (dbSnapshot == 'true')?"\t\tsuper.setUp();\n":"").
		replace(/\$\{([a-zA-Z0-9_]+)\}/g, function(str, name) { return options[name]; });
	this.lastIndent = indents(parseInt(options.initialIndents, 10));
	formatLocal.header = header;
	return formatLocal.header;
}

function formatFooter(testCase) {
	var formatLocal = testCase.formatLocal(this.name);
	var footer = (options.getFooter ? options.getFooter() : options.footer).
		replace(/\$\{screenshotsDirectory\}/g, screenshotsDirectory).
		replace(/\$\{dbRestore\}/g, (dbRestore == 'true')?"\t\tsuper.tearDown();\n":"").
		replace(/\\/g, '/');
	formatLocal.footer = footer;
	return formatLocal.footer;
}

function indents(num) {
	function repeat(c, n) {
		var str = "";
		for (var i = 0; i < n; i++) {
			str += c;
		}
		return str;
	}

    try {        
    	var indent = options.indent;
    	if ('tab' == indent) {
    		return repeat("\t", num);
    	} else {
    		return repeat(" ", num * parseInt(options.indent, 10));
    	}
    } catch (error) {
        return repeat(" ", 0);
    }
}

function capitalize(string) {
	return string.replace(/^[a-z]/, function(str) { return str.toUpperCase(); });
}

function underscore(text) {
	return text.replace(/[A-Z]/g, function(str) {
			return '_' + str.toLowerCase();
		});
}

function notOperator() {
	return "!";
}

function logicalAnd(conditions) {
    return conditions.join(" && ");
}

function equals(e1, e2) {
	return new Equals(e1, e2);
}

function Equals(e1, e2) {
	this.e1 = e1;
	this.e2 = e2;
}

Equals.prototype.invert = function() {
	return new NotEquals(this.e1, this.e2);
};

function NotEquals(e1, e2) {
	this.e1 = e1;
	this.e2 = e2;
	this.negative = true;
}

NotEquals.prototype.invert = function() {
	return new Equals(this.e1, this.e2);
};

function RegexpMatch(pattern, expression) {
	this.pattern = pattern;
	this.expression = expression;
}

RegexpMatch.prototype.invert = function() {
	return new RegexpNotMatch(this.pattern, this.expression);
};

RegexpMatch.prototype.assert = function() {
	return assertTrue(this.toString());
};

RegexpMatch.prototype.verify = function() {
	return verifyTrue(this.toString());
};

function RegexpNotMatch(pattern, expression) {
	this.pattern = pattern;
	this.expression = expression;
	this.negative = true;
}

RegexpNotMatch.prototype.invert = function() {
	return new RegexpMatch(this.pattern, this.expression);
};

RegexpNotMatch.prototype.toString = function() {
	return notOperator() + RegexpMatch.prototype.toString.call(this);
};

RegexpNotMatch.prototype.assert = function() {
	return assertFalse(this.invert());
};

RegexpNotMatch.prototype.verify = function() {
	return verifyFalse(this.invert());
};

function seleniumEquals(type, pattern, expression) {
	if (type == 'String[]') {
		return seleniumEquals('String', pattern.replace(/\\,/g, ',') , joinExpression(expression));
	} else if (type == 'String' && pattern.match(/^regexp:/)) {
		return new RegexpMatch(pattern.substring(7), expression);
	} else if (type == 'String' && pattern.match(/^regex:/)) {
		return new RegexpMatch(pattern.substring(6), expression);
	} else if (type == 'String' && (pattern.match(/^glob:/) || pattern.match(/[\*\?]/))) {
		pattern = pattern.replace(/^glob:/, '');
		pattern = pattern.replace(/([\]\[\\\{\}\$\(\).])/g, "\\$1");
		pattern = pattern.replace(/\?/g, "[\\s\\S]");
		pattern = pattern.replace(/\*/g, "[\\s\\S]*");
		return new RegexpMatch("^" + pattern + "$", expression);
	} else {
		pattern = pattern.replace(/^exact:/, '');
		return new Equals(xlateValue(type, pattern), expression);
	}
}

function xlateArgument(value) {
	value = value.replace(/^\s+/, '');
	value = value.replace(/\s+$/, '');
	var r;
	var r2;
	var parts = [];
	if ((r = /^javascript\{([\d\D]*)\}$/.exec(value))) {
		var js = r[1];
		var prefix = "";
		while ((r2 = /storedVars\['(.*?)'\]/.exec(js))) {
			parts.push(string(prefix + js.substring(0, r2.index) + "'"));
			parts.push(variableName(r2[1]));
			js = js.substring(r2.index + r2[0].length);
			prefix = "'";
		}
		parts.push(string(prefix + js));
		return new CallSelenium("getEval", [concatString(parts)]);
	} else if ((r = /\$\{/.exec(value))) {
		var regexp = /\$\{(.*?)\}/g;
		var lastIndex = 0;
		while (r2 = regexp.exec(value)) {
		    if (this.declaredVars && this.declaredVars[r2[1]]) {
    			if (r2.index - lastIndex > 0) {
    				parts.push(string(value.substring(lastIndex, r2.index)));
    			}
    			parts.push(variableName(r2[1]));
    			lastIndex = regexp.lastIndex;
    		} else if (r2[1] == "nbsp") {
    		    if (r2.index - lastIndex > 0) {
    				parts.push(string(value.substring(lastIndex, r2.index)));
    			}
    			parts.push(nonBreakingSpace());
    			lastIndex = regexp.lastIndex;
    		}
		}
		if (lastIndex < value.length) {
			parts.push(string(value.substring(lastIndex, value.length)));
		}
		return concatString(parts);
	} else {
		return string(value);
	}
}

function addDeclaredVar(variable) {
	if (this.declaredVars == null) {
		this.declaredVars = {};
	}
	this.declaredVars[variable] = true;
}

function newVariable(prefix, index) {
	if (index == null) index = 1;
	if (this.declaredVars && this.declaredVars[prefix + index]) {
		return newVariable(prefix, index + 1);
	} else {
		addDeclaredVar(prefix + index);
		return prefix + index;
	}
}

function variableName(value) {
	return value;
}

function concatString(array) {
	return array.join(" + ");
}

function string(value) {
	if (value != null) {
		//value = value.replace(/^\s+/, '');
		//value = value.replace(/\s+$/, '');
		value = value.replace(/\\/g, '\\\\');
		value = value.replace(/\"/g, '\\"');
		value = value.replace(/\r/g, '\\r');
		value = value.replace(/\n/g, '\\n');
		return '"' + value + '"';
	} else {
		return '""';
	}
}

function CallSelenium(message, args) {
	this.message = message;
	if (args) {
		this.args = args;
	} else {
		this.args = [];
	}
}

CallSelenium.prototype.invert = function() {
	var call = new CallSelenium(this.message);
	call.args = this.args;
	call.negative = !this.negative;
	return call;
};

function xlateArrayElement(value) {
	return value.replace(/\\(.)/g, "$1");
}

function parseArray(value) {
	var start = 0;
	var list = [];
	for (var i = 0; i < value.length; i++) {
		if (value.charAt(i) == ',') {
			list.push(xlateArrayElement(value.substring(start, i)));
			start = i + 1;
		} else if (value.charAt(i) == '\\') {
			i++;
		}
	}
	list.push(xlateArrayElement(value.substring(start, value.length)));
	return list;
}

function xlateValue(type, value) {
	if (type == 'String[]') {
		return array(parseArray(value));
	} else {
		return xlateArgument(value);
	}
}

function formatCommand(command) {
	var line = null;
	if (command.type == 'command') {
		var def = command.getDefinition();
		if (def && def.isAccessor) {
			var call = new CallSelenium(def.name);
			for (var i = 0; i < def.params.length; i++) {
				call.args.push(xlateArgument(command.getParameterAt(i)));
			}
			var extraArg = command.getParameterAt(def.params.length);
			if (def.name.match(/^is/)) { // isXXX
				if (command.command.match(/^assert/) ||
					(this.assertOrVerifyFailureOnNext && command.command.match(/^verify/))) {
					line = (def.negative ? assertFalse : assertTrue)(call);
				} else if (command.command.match(/^verify/)) {
					line = (def.negative ? verifyFalse : verifyTrue)(call);
				} else if (command.command.match(/^store/)) {
					addDeclaredVar(extraArg);
					line = statement(assignToVariable('boolean', extraArg, call));
				} else if (command.command.match(/^waitFor/)) {
					line = waitFor(def.negative ? call.invert() : call);
				}
			} else { // getXXX
				if (command.command.match(/^(verify|assert)/)) {
					var eq = seleniumEquals(def.returnType, extraArg, call);
					if (def.negative) eq = eq.invert();
					var method = (!this.assertOrVerifyFailureOnNext && command.command.match(/^verify/)) ? 'verify' : 'assert';
					line = eq[method]();
				} else if (command.command.match(/^store/)) {
					addDeclaredVar(extraArg);
					line = statement(assignToVariable(def.returnType, extraArg, call));
				} else if (command.command.match(/^waitFor/)) {
					var eq = seleniumEquals(def.returnType, extraArg, call);
					if (def.negative) eq = eq.invert();
					line = waitFor(eq);
				}
			}
		} else if (this.pause && 'pause' == command.command) {
			line = pause(command.target);
		} else if (this.echo && 'echo' == command.command) {
			line = echo(command.target);
		} else if ('store' == command.command) {
			addDeclaredVar(command.value);
			line = statement(assignToVariable('String', command.value, xlateArgument(command.target)));
	    } else if (this.set && command.command.match(/^set/)) {
	        line = set(command.command, command.target);
		} else if (command.command.match(/^(assert|verify)Selected$/)) {
			var optionLocator = command.value;
			var flavor = 'Label';
			var value = optionLocator;
			var r = /^(index|label|value|id)=(.*)$/.exec(optionLocator);
			if (r) {
				flavor = r[1].replace(/^[a-z]/, function(str) { return str.toUpperCase() });
				value = r[2];
			}
			var method = (!this.assertOrVerifyFailureOnNext && command.command.match(/^verify/)) ? 'verify' : 'assert';
			var call = new CallSelenium("getSelected" + flavor);
			call.args.push(xlateArgument(command.target));
			var eq = seleniumEquals('String', value, call);
			line = statement(eq[method]());
		} else if (def) {
			if (def.name.match(/^(assert|verify)(Error|Failure)OnNext$/)) {
				this.assertOrVerifyFailureOnNext = true;
				this.assertFailureOnNext = def.name.match(/^assert/);
				this.verifyFailureOnNext = def.name.match(/^verify/);
			} else {
				var call = new CallSelenium(def.name);
                if ("open" == def.name && options.urlSuffix && !command.target.match(/^\w+:\/\//)) {
                    // urlSuffix is used to translate core-based test
                    call.args.push(xlateArgument(options.urlSuffix + command.target));
                } else {
                    for (var i = 0; i < def.params.length; i++) {
                        call.args.push(xlateArgument(command.getParameterAt(i)));
                    }
                }
				line = statement(call, command);
			}
		} else {
			this.log.info("unknown command: <" + command.command + ">");
			// TODO
			var call = new CallSelenium(command.command);
			if ((command.target != null && command.target.length > 0)
				|| (command.value != null && command.value.length > 0)) {
				call.args.push(string(command.target));
				if (command.value != null && command.value.length > 0) {
					call.args.push(string(command.value));
				}
			}
			line = formatComment(new Comment(statement(call)));
		}
	}
	if (line && this.assertOrVerifyFailureOnNext) {
		line = assertOrVerifyFailure(line, this.assertFailureOnNext);
		this.assertOrVerifyFailureOnNext = false;
		this.assertFailureOnNext = false;
		this.verifyFailureOnNext = false;
	}
	return line;
}

this.remoteControl = true;
this.playable = false;








/** ======================================================================= **/
/** 							testCase.js 								**/
/** ======================================================================= **/

/*
 * Copyright 2005 Shinya Kasatani
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

function Command(command, target, value) {
	this.command = command != null ? command : '';
    if (target != null && target instanceof Array) {
        if (target[0]) {
            this.target = target[0][0];
            this.targetCandidates = target;
        } else {
            this.target = "LOCATOR_DETECTION_FAILED";
        }
    } else {
        this.target = target != null ? target : '';
    }
	this.value = value != null ? value : '';
}

Command.prototype.createCopy = function() {
	var copy = new Command();
	for (prop in this) {
		copy[prop] = this[prop];
	}
	return copy;
};

Command.prototype.getRealValue = function() {
	if (this.value) {
		return this.value;
	} else {
		return this.target;
	}
}

Command.prototype.getRealTarget = function() {
	if (this.value) {
		return this.target;
	} else {
		return null;
	}
}

Command.innerHTML = function(element) {
	var html = "";
	var nodes = element.childNodes;
	for (var i = 0; i < nodes.length; i++) {
		var node = nodes.item(i);
		switch (node.nodeType) {
		case 1: // ELEMENT_NODE
			html += "<" + node.nodeName + ">";
			html += this.innerHTML(node);
			html += "</" + node.nodeName + ">";
			break;
		case 3: // TEXT_NODE
			html += node.data;
			break;
		}
	}
	return html;
}

Command.loadAPI = function() {
  if (!this.functions) {
    var document;
    var documents = this.apiDocuments;
    var functions = {};
    // document.length will be 1 by default, but will grow with plugins
    for (var d = 0; d < documents.length; d++) {
      // set the current document. again, by default this is the iedoc-core.xml
      document = documents[d];
      
      // <function name="someName">
      //   <param name="targetName">description</param>
      //   <param name="valueName">description</param> -- optional
      //   <return type="string">description</return> -- optional
      //   <comment>description for ide here</comment>
      // </function>
      var functionElements = document.documentElement.getElementsByTagName("function");
      for (var i = 0; i < functionElements.length; i++) {
        var element = functionElements.item(i);
        var def = new CommandDefinition(String(element.attributes.getNamedItem('name').value));
        
        var returns = element.getElementsByTagName("return");
        if (returns.length > 0) {
          var returnType = new String(returns.item(0).attributes.getNamedItem("type").value);
          returnType = returnType.replace(/string/, "String");
          returnType = returnType.replace(/number/, "Number");
          def.returnType = returnType;
          def.returnDescription = this.innerHTML(returns.item(0));
        }
        
        var comments = element.getElementsByTagName("comment");
        if (comments.length > 0) {
          def.comment = this.innerHTML(comments.item(0));
        }
        
        var params = element.getElementsByTagName("param");
        for (var j = 0; j < params.length; j++) {
          var paramElement = params.item(j);
          var param = {};
          param.name = String(paramElement.attributes.getNamedItem('name').value);
          param.description = this.innerHTML(paramElement);
          def.params.push(param);
        }
        
        functions[def.name] = def;

        // generate negative accessors
        if (def.name.match(/^(is|get)/)) {
          def.isAccessor = true;
          functions["!" + def.name] = def.negativeAccessor();
        }
        if (def.name.match(/^assert/)) { // only assertSelected should match
          var verifyDef = new CommandDefinition(def.name);
          verifyDef.params = def.params;
          functions["verify" + def.name.substring(6)] = verifyDef;
        }
      }
    }
    functions['assertFailureOnNext'] = new CommandDefinition('assertFailureOnNext');
    functions['verifyFailureOnNext'] = new CommandDefinition('verifyFailureOnNext');
    functions['assertErrorOnNext'] = new CommandDefinition('assertErrorOnNext');
    functions['verifyErrorOnNext'] = new CommandDefinition('verifyErrorOnNext');
    this.functions = functions;
  }
  return this.functions;
}

function CommandDefinition(name) {
	this.name = name;
	this.params = [];
}

CommandDefinition.prototype.getReferenceFor = function(command) {
    var paramNames = [];
	for (var i = 0; i < this.params.length; i++) {
        paramNames.push(this.params[i].name);
	}
    var originalParamNames = paramNames.join(", ");
    if (this.name.match(/^is|get/)) { // accessor
        if (command.command) {
            if (command.command.match(/^store/)) {
                paramNames.push("variableName");
            } else if (command.command.match(/^(assert|verify|waitFor)/)) {
                if (this.name.match(/^get/)) {
                    paramNames.push("pattern");
                }
            }
        }
    }
	var note = "";
	if (command.command && command.command != this.name) {
		note = "<dt>Generated from <strong>" + this.name + "(" +
            originalParamNames + ")</strong></dt>";
	}
    var params = "";
    if (this.params.length > 0) {
        params += "<div>Arguments:</div><ul>";
        for (var i = 0; i < this.params.length; i++) {
            params += "<li>" + this.params[i].name + " - " + this.params[i].description + "</li>";
        }
        params += "</ul>";
    }
    var returns = "";
    if (this.returnDescription) {
        returns += "<dl><dt>Returns:</dt><dd>" + this.returnDescription + "</dd></dl>";
    }
	return "<dl><dt><strong>" + (command.command || this.name) + "(" +
        paramNames.join(", ") + ")</strong></dt>" +
        note +
	    '<dd style="margin:5px;">' + 
        params + returns +
	    this.comment + "</dd></dl>";
}

CommandDefinition.prototype.negativeAccessor = function() {
	var def = new CommandDefinition(this.name);
	for (var name in this) {
		def[name] = this[name];
	}
	def.isAccessor = true;
	def.negative = true;
	return def;
}

Command.prototype.getDefinition = function() {
	if (this.command == null) return null;
	var commandName = this.command.replace(/AndWait$/, '');
	var api = Command.loadAPI();
	var r = /^(assert|verify|store|waitFor)(.*)$/.exec(commandName);
	if (r) {
		var suffix = r[2];
		var prefix = "";
		if ((r = /^(.*)NotPresent$/.exec(suffix)) != null) {
			suffix = r[1] + "Present";
			prefix = "!";
		} else if ((r = /^Not(.*)$/.exec(suffix)) != null) {
			suffix = r[1];
			prefix = "!";
		}
		var booleanAccessor = api[prefix + "is" + suffix];
		if (booleanAccessor) {
			return booleanAccessor;
		}
		var accessor = api[prefix + "get" + suffix];
		if (accessor) {
			return accessor;
		}
	}
	return api[commandName];
}

Command.prototype.getParameterAt = function(index) {
	switch (index) {
	case 0:
		return this.target;
	case 1:
		return this.value;
	default:
		return null;
	}
}

Command.prototype.getAPI = function() {
	return window.editor.seleniumAPI;
}

Command.prototype.type = 'command';

/**
 * The string representation of a command is the command, target, and value
 * delimited by padded pipes.
 */
Command.prototype.toString = function()
{
    var s = this.command
    if (this.target) {
        s += ' | ' + this.target;
        if (this.value) {
            s += ' | ' + this.value;
        }
    }
    return s;
}

Command.prototype.isRollup = function()
{
    return /^rollup(?:AndWait)?$/.test(this.command);
}

function Comment(comment) {
	this.comment = comment != null ? comment : '';
}

Comment.prototype.type = 'comment';

function Line(line) {
	this.line = line;
}

Line.prototype.type = 'line';

Comment.prototype.createCopy = function() {
	var copy = new Comment();
	for (prop in this) {
		copy[prop] = this[prop];
	}
	return copy;
};

function TestCase(tempTitle) {
    if (!tempTitle) tempTitle = "Untitled";
	this.log = new Log("TestCase");
    this.tempTitle = tempTitle;
	this.formatLocalMap = {};
    this.commands = [];
    this.recordModifiedInCommands();
    this.baseURL = "";
    this.screenshotsDirectory = "";
    this.success = "";
    this.packageName = "";
    this.seleniumHost = "";
    this.seleniumPort = "";
    this.browser = "";
    this.timeout = "";
    this.speed = "";
    this.dbSnapshot = "";
    this.dbRestore = "";

	var testCase = this;

	this.debugContext = {
		reset: function() {
            this.failed = false;
			this.started = false;
			this.debugIndex = -1;
		},
		
		nextCommand: function() {
			if (!this.started) {
				this.started = true;
				this.debugIndex = testCase.startPoint ? testCase.commands.indexOf(testCase.startPoint) : 0
			} else {
				this.debugIndex++;
			}
			for (; this.debugIndex < testCase.commands.length; this.debugIndex++) {
				var command = testCase.commands[this.debugIndex];
				if (command.type == 'command') {
					return command;
				}
			}
			return null;
		},

		currentCommand: function() {
			var command = testCase.commands[this.debugIndex];
            if (!command) {
                testCase.log.warn("currentCommand() not found: commands.length=" + testCase.commands.length + ", debugIndex=" + this.debugIndex);
            }
            return command;
		}
	}
}

// Create a shallow copy of testcase
TestCase.prototype.createCopy = function() {
	var copy = new TestCase();
	for (prop in this) {
		copy[prop] = this[prop];
	}
	return copy;
};


// Store variables specific to each format in this hash.
TestCase.prototype.formatLocal = function(formatName) {
	var scope = this.formatLocalMap[formatName];
	if (!scope) {
		scope = {};
		this.formatLocalMap[formatName] = scope;
	}
	return scope;
}

// For backwards compatibility
TestCase.prototype.setCommands = function(commands) {
    this.commands = commands;
    this.recordModifiedInCommands();
}

TestCase.prototype.recordModifiedInCommands = function() {
    if (this.commands.recordModified) {
        return;
    }
    this.commands.recordModified = true;
	var self = this;
    var commands = this.commands;

	var _push = commands.push;
	commands.push = function(command) {
		_push.call(commands, command);
		self.setModified();
	}

	var _splice = commands.splice;
	commands.splice = function(index, removeCount, command) {

                var removed = null;
		if (command !== undefined && command != null) {
			removed = _splice.call(commands, index, removeCount, command);
		} else {
			removed = _splice.call(commands, index, removeCount);
		}
		self.setModified();

                return removed;
	}

	var _pop = commands.pop;
	commands.pop = function() {
		var command = commands[commands.length - 1];
		commands.splice(commands.length - 1, 1);
		self.setModified();
		return command;
	}
}

TestCase.prototype.clear = function() {
	var length = this.commands.length;
	this.commands.splice(0, this.commands.length);
	this.setModified();
};

TestCase.prototype.setModified = function() {
	this.modified = true;
    this.notify("modifiedStateUpdated");
}

TestCase.prototype.clearModified = function() {
	this.modified = false;
    this.notify("modifiedStateUpdated");
}

TestCase.prototype.checkTimestamp = function() {
	if (this.file) {
		if (this.lastModifiedTime < this.file.lastModifiedTime) {
			this.lastModifiedTime = this.file.lastModifiedTime;
			return true;
		}
	}
	return false;
}

TestCase.prototype.getCommandIndexByTextIndex = function(text, index, formatter) {
	this.log.debug("getCommandIndexByTextIndex: index=" + index);
	var lineno = text.substring(0, index).split(/\n/).length - 1;
	var header = this.formatLocal(formatter.name).header;
	this.log.debug("lineno=" + lineno + ", header=" + header);
	if (header) {
		lineno -= header.split(/\n/).length - 1;
	}
	this.log.debug("this.commands.length=" + this.commands.length);
	for (var i = 0; i < this.commands.length; i++) {
		this.log.debug("lineno=" + lineno + ", i=" + i);
		if (lineno <= 0) {
			return i;
		}
		var command = this.commands[i];
		if (command.line != null) {
			lineno -= command.line.split(/\n/).length;
		}
	}
	return this.commands.length;
}

TestCase.prototype.getTitle = function() {
    if (this.title) {
        return this.title;
    } else if (this.file && this.file.leafName) {
        return this.file.leafName.replace(/\.\w+$/,'');
    } else if (this.tempTitle) {
        return this.tempTitle;
    } else {
        return null;
    }
}

TestCase.prototype.setBaseURL = function(baseURL) {
    this.baseURL = baseURL;
}

TestCase.prototype.getBaseURL = function() {
    if (!this.baseURL || this.baseURL == "") {
		return "http://change-this-to-the-site-you-are-testing/";
    } else {
		return this.baseURL;
	}
}

observable(TestCase);








/** ======================================================================= **/
/** 					formatCommandOnlyAdapter.js 						**/
/** ======================================================================= **/
/*
 * An adapter that lets you use format() function with the format
 * that only defines formatCommand() function.
 *
 */

/**
 * Parse source and update TestCase. Throw an exception if any error occurs.
 *
 * @param testCase TestCase to update
 * @param source The source to parse
 */
function parse(testCase, source) {
	testCase.header = null;
	testCase.footer = null;
	var commands = [];

	var reader = new LineReader(source);
	var line;
	while ((line = reader.read()) != null) {
		commands.push(new Line(line));
	}
	testCase.commands = commands;
	testCase.formatLocal(this.name).header = "";
	testCase.formatLocal(this.name).footer = "";
	return testCase;
}

/**
 * Format TestCase and return the source.
 *
 * @param testCase TestCase to format
 * @param name The name of the test case, if any. It may be used to embed title into the source.
 */
function format(testCase, name) {
	//this.log.info("formatting testCase: " + name);
	var result = '';
	var header = "";
	var footer = "";
	this.commandCharIndex = 0;
	if (this.formatHeader) {
		header = formatHeader(testCase);
	}
	result += header;
	this.commandCharIndex = header.length;
	testCase.formatLocal(this.name).header = header;
	result += formatCommands(testCase.commands);
	if (this.formatFooter) {
		footer = formatFooter(testCase);
	}
	result += footer;
	testCase.formatLocal(this.name).footer = footer;
	return result;
}

function filterForRemoteControl(originalCommands) {
	if (this.remoteControl) {
		var commands = [];
		for (var i = 0; i < originalCommands.length; i++) {
			var c = originalCommands[i];
			if (c.type == 'command' && c.command.match(/AndWait$/)) {
				var c1 = c.createCopy();
				c1.command = c.command.replace(/AndWait$/, '');
				commands.push(c1);
				out.println('>>>>>>>>>>>>>>>>>>>>>>>>>>> options[global.timeout]' + options['global.timeout'] );
				out.println('>>>>>>>>>>>>>>>>>>>>>>>>>>> options[global.timeout]' + options['timeout'] );
				out.println('>>>>>>>>>>>>>>>>>>>>>>>>>>> options[global.timeout]' + options.timeout);
				for(v in options) { 
					out.println(v + ' : '+ options[v]);
				}
				commands.push(new Command("waitForPageToLoad", options['global.timeout'] || "30000"));
			} else {
				commands.push(c);
			}
		}
		if (this.postFilter) {
			// formats can inject command list post-processing here
			commands = this.postFilter(commands);
		}
		return commands;
	} else {
		return originalCommands;
	}
}

function addIndent(lines) {
	return lines.replace(/.+/mg, function(str) {
			return indent() + str;
		});
}

function formatCommands(commands) {
	commands = filterForRemoteControl(commands);
	if (this.lastIndent == null) {
		this.lastIndent = '';
	}
	var result = '';
	for (var i = 0; i < commands.length; i++) {
		var line = null;
		var command = commands[i];
		if (command.type == 'line') {
			line = command.line;
		} else if (command.type == 'command') {
			line = formatCommand(command);
			if (line != null) line = addIndent(line);
			command.line = line;
		} else if (command.type == 'comment' && this.formatComment) {
			line = formatComment(command);
			if (line != null) line = addIndent(line);
			command.line = line;
		} else {
			println('type: ' + 'none');
		}
		command.charIndex = this.commandCharIndex;
		if (line != null) {
			updateIndent(line);
			line = line + "\n";
			result += line;
			this.commandCharIndex += line.length;
		}
	}
	return result;
}

function updateIndent(line) {
	var r = /^(\s*)/.exec(line);
	if (r) {
		this.lastIndent = r[1];
	}
}

function indent() {
	return this.lastIndent || '';
}

function setIndent(i) {
  this.lastIndent = indents(i);
}







/** ======================================================================= **/
/** 								format.js 								**/
/** ======================================================================= **/

/*
 * Copyright 2005 Shinya Kasatani
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * FormatCollection: manages collection of formats.
 */

function FormatCollection(options) {
    this.options = options;
    
    this.presetFormats = [new InternalFormat(options, "default", "HTML", "html.js", true)];
    this.reloadFormats();
}

FormatCollection.log = FormatCollection.prototype.log = new Log('FormatCollection');

FormatCollection.getFormatDir = function() {
    var formatDir = FileUtils.getProfileDir();
    formatDir.append("selenium-ide-scripts");
    if (!formatDir.exists()) {
        formatDir.create(Components.interfaces.nsIFile.DIRECTORY_TYPE, 0755);
    }
    formatDir.append("formats");
    if (!formatDir.exists()) {
        formatDir.create(Components.interfaces.nsIFile.DIRECTORY_TYPE, 0755);
    }
    return formatDir;
}

FormatCollection.loadUserFormats = function(options) {
    var formatFile = FormatCollection.getFormatDir();
    formatFile.append("index.txt");
    
    if (!formatFile.exists()) {
        return [];
    }
    var text = FileUtils.readFile(formatFile);
    var conv = FileUtils.getUnicodeConverter(SeleniumIDE.Preferences.getString("encoding", "UTF-8"));
    text = conv.ConvertToUnicode(text);
    var formats = [];
    while (text.length > 0) {
        var r = /^(\d+),(.*)\n?/.exec(text);
        if (r) {
            formats.push(new UserFormat(options, r[1], r[2]));
            text = text.substr(r[0].length);
        } else {
            break;
        }
    }
    return formats;
}

FormatCollection.saveUserFormats = function(formats) {
    var text = '';
    for (var i = 0; i < formats.length; i++) {
        text += formats[i].id + ',' + formats[i].name + "\n";
    }
    var conv = FileUtils.getUnicodeConverter(SeleniumIDE.Preferences.getString("encoding", "UTF-8"));
    text = conv.ConvertFromUnicode(text);
    
    var formatFile = FormatCollection.getFormatDir();
    formatFile.append("index.txt");
    var stream = FileUtils.openFileOutputStream(formatFile);
    stream.write(text, text.length);
    var fin = conv.Finish();
    if (fin.length > 0) {
        stream.write(fin, fin.length);
    }
    stream.close();
}

// this is called on se-ide startup for the current formatter, or when you change formatters
FormatCollection.loadFormatter = function(url) {
    
    var format = {};
    format.options = {};
    format.configForm = '';
    format.log = new Log("Format");
    format.playable = true;
    format.remoteControl = false;
	format.load = function(file){
		if (file.startsWith('chrome://')) {
			//extensions may load in their own files so allow an absolute URL 
			subScriptLoader.loadSubScript(file, format);
		} else {
			//otherwise assume this is a packaged format file
			subScriptLoader.loadSubScript('chrome://selenium-ide/content/formats/' + file, format);
		}
	}

    for (var prop in StringUtils) {
        // copy functions from StringUtils
        format[prop] = StringUtils[prop];
    }
    this.log.debug('loading format from ' + url);
    subScriptLoader.loadSubScript(url, format);
    if (format.configForm && format.configForm.length > 0) {
        function copyElement(doc, element) {
            var copy = doc.createElement(element.nodeName.toLowerCase());
            var atts = element.attributes;
            var i;
            for (i = 0; atts != null && i < atts.length; i++) {
                copy.setAttribute(atts[i].name, atts[i].value);
            }
            var childNodes = element.childNodes;
            for (i = 0; i < childNodes.length; i++) {
                if (childNodes[i].nodeType == 1) { // element
                    copy.appendChild(copyElement(doc, childNodes[i]));
                } else if (childNodes[i].nodeType == 3) { // text
                    copy.appendChild(doc.createTextNode(childNodes[i].nodeValue));
                }
            }
            return copy;
        }
            
        format.createConfigForm = function(document) {
            var xml = '<vbox id="format-config" xmlns="http://www.mozilla.org/keymaster/gatekeeper/there.is.only.xul">' + format.configForm + '</vbox>';
            var parser = new DOMParser();
            var element = parser.parseFromString(xml, "text/xml").documentElement;
            // If we directly return this element, "permission denied" exception occurs
            // when the user clicks on the buttons or textboxes. I haven't figured out the reason, 
            // but as a workaround I'll just re-create the element and make a deep copy.
            return copyElement(document, element);
        }
    }
    return format;
}


FormatCollection.prototype.reloadFormats = function() {
    // user formats
    this.userFormats = FormatCollection.loadUserFormats(this.options);
    this.formats = this.presetFormats.concat(this.userFormats);
    
    // plugin formats
    this.pluginFormats = FormatCollection.loadPluginFormats(this.options);
    this.formats = this.formats.concat(this.pluginFormats);
}

FormatCollection.prototype.removeUserFormatAt = function(index) {
    this.userFormats.splice(index, 1);
    this.formats = this.presetFormats.concat(this.userFormats);
    
    // plugin formats need adding in here too
    this.formats = this.formats.concat(this.pluginFormats);
}

FormatCollection.prototype.saveFormats = function() {
    FormatCollection.saveUserFormats(this.userFormats);
}

FormatCollection.prototype.selectFormat = function(id) {
    var info = this.findFormat(id);
    if (info) {
        try {
            return info;
        } catch (error) {
            this.log.error("failed to select format: " + id + ", error=" + error);
            return this.formats[0];
        }
    } else {
        //this.log.error("failed to select format: " + id);
        return this.formats[0];
    }
}

FormatCollection.prototype.findFormat = function(id) {
    for (var i = 0; i < this.formats.length; i++) {
        if (id == this.formats[i].id) {
            return this.formats[i];
        }
    }
    return null;
}

FormatCollection.prototype.getDefaultFormat = function() {
    return this.findFormat("default");
}

FormatCollection.loadPluginFormats = function(options) {
    var formats = [];
    var pluginProvided = SeleniumIDE.Preferences.getString("pluginProvidedFormatters");

    if (pluginProvided) {
        var split_pluginProvided = pluginProvided.split(",");
        for (var ppf = 0; ppf < split_pluginProvided.length; ppf++) {
            var split_ppf = split_pluginProvided[ppf].split(";");
            formats.push(new PluginFormat(options, split_ppf[0], split_ppf[1], split_ppf[2]));
        }
    }
    return formats;
}

/*
 * Format
 */

function Format() {
}

Format.TEST_CASE_DIRECTORY_PREF = "testCaseDirectory";
Format.TEST_CASE_EXPORT_DIRECTORY_PREF = "testCaseExportDirectory";

Format.prototype.log = Format.log = new Log('Format');

Format.prototype.getUnicodeConverter = function() {
    return FileUtils.getUnicodeConverter(this.options.encoding);
}

Format.prototype.getFormatter = function() {
    if (!this.formatterCache) {
        this.formatterCache = this.loadFormatter();
        for (name in this.options) {
            var r = new RegExp('formats\.' + this.id + '\.(.*)').exec(name);
            if (r) {
                this.formatterCache.options[r[1]] = this.options[name];
            } else if (name.indexOf('.') < 0) {
                this.formatterCache.options["global." + name] = this.options[name];
            }
        }
    }
    return this.formatterCache;
}

Format.prototype.save = function(testCase) {
    return this.saveAs(testCase, testCase.file && testCase.file.path, false);
};

Format.prototype.saveAsNew = function(testCase, exportTest) {
    return this.saveAs(testCase, null, exportTest);
};

Format.prototype.saveAs = function(testCase, filename, exportTest) {
    //log.debug("saveAs: filename=" + filename);
    try {
        var defaultExtension = null;
        try {
          defaultExtension = this.getFormatter().defaultExtension();
        } catch (err) {}

        var file = null;
        if (filename == null) {
            //Samit: Enh: Show the name of the test case in the save dialog title
            file = showFilePicker(window,
                                  Editor.getFormattedString("saveTestCaseAs", [testCase.getTitle()]),
                                  Components.interfaces.nsIFilePicker.modeSave,
                                  exportTest ? Format.TEST_CASE_EXPORT_DIRECTORY_PREF : Format.TEST_CASE_DIRECTORY_PREF,
                                  function(fp) {return fp.file;},
                                  defaultExtension);
        } else {
            file = FileUtils.getFile(filename);
        }
        if (file != null) {
            testCase.file = file;
            // save the directory so we can continue to load/save files from the current suite?
            var outputStream = Components.classes["@mozilla.org/network/file-output-stream;1"].createInstance( Components.interfaces.nsIFileOutputStream);
            outputStream.init(file, 0x02 | 0x08 | 0x20, 0644, 0);
            var converter = this.getUnicodeConverter();
            var text = converter.ConvertFromUnicode(this.getFormatter().format(testCase, testCase.getTitle()));
            outputStream.write(text, text.length);
            var fin = converter.Finish();
            if (fin.length > 0) {
                outputStream.write(fin, fin.length);
            }
            outputStream.close();
            this.log.info("saved " + file.path);
            testCase.lastModifiedTime = file.lastModifiedTime;
            testCase.clearModified();
            return true;
        } else {
            return false;
        }
    } catch (err) {
        alert("error: " + err);
        return false;
    }
};

/**
 * Displays a filepicker so the user can select where to export the test suite,
 * and saves the exported file there. Returns true on success, and false
 * otherwise.
 *
 * @param testSuite   the test suite to export
 * @param exportTest  ???
 */
Format.prototype.saveSuiteAsNew = function(testSuite, exportTest) {
    var formatter = this.getFormatter();
    
    try {
        var file = null;
        file = showFilePicker(window, Editor.getString("exportTestSuiteAs"),
            Components.interfaces.nsIFilePicker.modeSave,
            TestSuite.TEST_SUITE_DIRECTORY_PREF,
            function(fp) {return fp.file;});
        
        if (file != null) {
            var filepath = [];
            filepath = FileUtils.splitPath(file);
            
            var filename = filepath[filepath.length -1];
            var output = FileUtils.openFileOutputStream(file);
            var converter = FileUtils.getUnicodeConverter(SeleniumIDE.Preferences.getString("encoding", "UTF-8"));
            var text = converter.ConvertFromUnicode(formatter
                .formatSuite(testSuite, filename));
            
            output.write(text, text.length);
            
            var fin = converter.Finish();
            if (fin.length > 0) {
                output.write(fin, fin.length);
            }
            
            output.close();
            return true;
        }
    }
    catch (err) {
        alert("error: " + err);
    }
    
    return false;
};

Format.prototype.getSourceForTestCase = function(testCase) {
    return this.getFormatter().format(testCase, "New Test");
}

Format.prototype.getSourceForCommands = function(commands) {
    return this.getFormatter().formatCommands(commands);
}

Format.prototype.setSource = function(testCase, source) {
    try {
        this.getFormatter().parse(testCase, source);
        testCase.setModified();
    } catch (err) {
        alert("error: " + err);
    }
}

Format.prototype.load = function() {
    var self = this;
    return showFilePicker(window, Editor.getString("selectAFile"),
                          Components.interfaces.nsIFilePicker.modeOpen,
                          Format.TEST_CASE_DIRECTORY_PREF,
                          function(fp) {return self.loadFile(fp.file);});
}

Format.prototype.loadFile = function(file, isURL) {
    this.log.debug("start loading: file=" + file);
    
    var sis;
    if (isURL) {
        sis = FileUtils.openURLInputStream(file);
    } else {
        sis = FileUtils.openFileInputStream(file);
    }
    var text = this.getUnicodeConverter().ConvertToUnicode(sis.read(sis.available()));
    var testCase = new TestCase();
    this.getFormatter().parse(testCase, text);
    
    sis.close();
    testCase.recordModifiedInCommands();
    testCase.file = file;
    if (!isURL) {
        testCase.lastModifiedTime = file.lastModifiedTime;
    }
    
    return testCase;
}


/**
 * Format for preset formats
 */
function InternalFormat(options, id, name, file, reversible) {
    this.options = options;
    this.id = id;
    this.name = name;
    this.url = 'chrome://selenium-ide/content/formats/' + file;
    //use to determine if this format implements the parse method
    //and can switch to another format
    this.reversible = reversible;
}

InternalFormat.prototype = new Format;

InternalFormat.prototype.loadFormatter = function() {
    return FormatCollection.loadFormatter(this.url);
}

InternalFormat.prototype.getSource = function() {
    return FileUtils.readURL(this.url);
}

InternalFormat.prototype.getFormatURI = function() {
    return this.url;
}

/**
 * called to know if the format implements the parse method
 * @return true if it implements the parse method, false if nots
 */
InternalFormat.prototype.isReversible = function(){
    return this.reversible;
}

/**
 * Format created by users
 */
function UserFormat(options, id, name) {
    this.options = options;
    if (id && name) {
        this.id = id;
        this.name = name;
    } else {
        this.id = null;
        this.name = '';
    }
}

UserFormat.prototype = new Format;

UserFormat.prototype.saveFormat = function(source) {
    var formatDir = FormatCollection.getFormatDir();
    var formats = FormatCollection.loadUserFormats(this.options);
    if (!this.id) {
        var entries = formatDir.directoryEntries;
        var max = 0;
        while (entries.hasMoreElements()) {
            var file = entries.getNext().QueryInterface(Components.interfaces.nsIFile);
            var r;
            if ((r = /^(\d+)\.js$/.exec(file.leafName)) != null) {
                var id = parseInt(r[1]);
                if (id > max) max = id;
            }
        }
        max++;
        this.id = '' + max;
        formats.push(this);
    }
    var formatFile = formatDir.clone();
    formatFile.append(this.id + ".js");
    var stream = FileUtils.openFileOutputStream(formatFile);
    stream.write(source, source.length);
    stream.close();

    FormatCollection.saveUserFormats(formats);
}

UserFormat.prototype.getFormatFile = function() {
    var formatDir = FormatCollection.getFormatDir();
    var formatFile = formatDir.clone();
    formatFile.append(this.id + ".js");
    return formatFile;
}

UserFormat.prototype.getFormatURI = function() {
    return FileUtils.fileURI(this.getFormatFile());
}

UserFormat.prototype.loadFormatter = function() {
    return FormatCollection.loadFormatter(FileUtils.fileURI(this.getFormatFile()));
}

UserFormat.prototype.getSource = function() {
    if (this.id) {
        return FileUtils.readFile(this.getFormatFile());
    } else {
        return FileUtils.readURL('chrome://selenium-ide/content/formats/blank.js');
    }
}

/**
 * called to know if the user format implements the parse method
 * @return true if it implements the parse method, false if not
 */
UserFormat.prototype.isReversible = function(){
    if (this.id) {
        var parseRegExp = new RegExp("function parse\\(", 'g');
        return parseRegExp.test(FileUtils.readFile(this.getFormatFile()));
    } else {
        return false;
    }
}

/**
 * Format for plugin provided formats
 */
function PluginFormat(options, id, name, url) {
    this.options = options;
    this.id = id;
    this.name = name;
    this.url = url;
}

PluginFormat.prototype = new Format;

PluginFormat.prototype.loadFormatter = function() {
    return FormatCollection.loadFormatter(this.url);
}

PluginFormat.prototype.getSource = function() {
    return FileUtils.readURL(this.url);
}

PluginFormat.prototype.getFormatURI = function() {
    return this.url;
}

/**
 * called to know if the plugin format implements the parse method
 * @return true if it implements the parse method, false if not
 */
PluginFormat.prototype.isReversible = function(){
    var parseRegExp = new RegExp("function parse\\(", 'g');

    return parseRegExp.test(this.getSource());
}






/** ======================================================================= **/
/** 								tools.js 								**/
/** ======================================================================= **/

/*
 * Copyright 2005 Shinya Kasatani
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

if (this.SeleniumIDE && SeleniumIDE.Preferences) {
    this.Preferences = SeleniumIDE.Preferences;
} else {
    // Preferences is not available when called from xlator
    this.Preferences = {
        getString: function(name, defaultValue) {
            return defaultValue;
        }
    };
}

function Log(category) {
	var log = this;
	var self = this;
	this.category = category;
	
	function LogLevel(level, name) {
		this.level = level;
		this.name = name;
		var self = this;
		log[name.toLowerCase()] = function(msg) { log.log(self, msg) };
	}

	this.DEBUG = new LogLevel(1, "DEBUG");
	this.INFO = new LogLevel(2, "INFO");
	this.WARN = new LogLevel(3, "WARN");
	this.ERROR = new LogLevel(4, "ERROR");

	this.log = function(level, msg) {
		var threshold = this[this._getThreshold()];
		if (level.level >= threshold.level) {
			this._write("Selenium IDE [" + level.name + "] " + 
                      this._formatDate(new Date()) + " " +
					  self.category + ": " + msg);
		}
	}
}

Log.prototype = {
    _getThreshold: function() {
        if (!this.threshold) {
            this.threshold = Preferences.getString("internalLogThreshold", "INFO");
        }
        return this.threshold;
    },

    _formatDate: function(date) {
        return date.getFullYear() + 
          "-" + this._formatDigits(date.getMonth() + 1, 2) + 
          "-" + this._formatDigits(date.getDate(), 2) +
          " " + this._formatDigits(date.getHours(), 2) +
          ":" + this._formatDigits(date.getMinutes(), 2) +
          ":" + this._formatDigits(date.getSeconds(), 2) +
          "." + this._formatDigits(date.getMilliseconds(), 3);
    },

    _formatDigits: function(n, digits) {
        var s = n.toString();
        var pre = digits - s.length;
        var result = "";
        for (var i = 0; i < pre; i++) {
            result += "0";
        }
        result += s;
        return result;
    },

    _write: function(message) {
        var consoleService = Components.classes["@mozilla.org/consoleservice;1"]
		    .getService(Components.interfaces.nsIConsoleService);
        if (consoleService != null) {
            consoleService.logStringMessage(message);
        }
    }
}

function showFilePicker(window, title, mode, defaultDirPrefName, handler, defaultExtension) {
	var nsIFilePicker = Components.interfaces.nsIFilePicker;
	var fp = Components.classes["@mozilla.org/filepicker;1"].createInstance(nsIFilePicker);
	fp.init(window, title, mode);
	if (defaultExtension) {
	  fp.defaultExtension = defaultExtension;
	}
    var defaultDir = Preferences.getString(defaultDirPrefName);
    if (defaultDir) {
        fp.displayDirectory = FileUtils.getFile(defaultDir);
    }
	fp.appendFilters(nsIFilePicker.filterHTML | nsIFilePicker.filterAll);
    var res = fp.show();
    if (res == nsIFilePicker.returnOK || res == nsIFilePicker.returnReplace) {
        Preferences.setString(defaultDirPrefName, fp.file.parent.path);
        return handler(fp);
    } else {
        return null;
    }
}

/**
 * Opens the given URL in a new tab if a browser window is already open, or
 * a new window otherwise.
 *
 * @param url  the URL to open.
 */
function openTabOrWindow(url)
{
    try {
        var gBrowser = window.opener.getBrowser();
        gBrowser.selectedTab = gBrowser.addTab(url);
    }
    catch (e) {
        window.open(url);
    }
}

function exactMatchPattern(string) {
	if (string != null && (string.match(/^\w*:/) || string.indexOf('?') >= 0 || string.indexOf('*') >= 0)) {
		return "exact:" + string;
	} else {
		return string;
	}
}

function LineReader(text) {
	this.text = text;
}

LineReader.prototype.read = function() {
	var line = null;
	if (this.text.length > 0) {
		var line = /.*(\r\n|\r|\n)?/.exec(this.text)[0];
		this.text = this.text.substr(line.length);
		line = line.replace(/\r?\n?$/, '');
	}
	return line;
}

var StringUtils = {};

StringUtils.underscore = function(text) {
	return text.replace(/[A-Z]/g, function(str) {
			return '_' + str.toLowerCase();
		});
}

String.prototype.startsWith = function(str) {
	return (this.match("^" + str) == str)
}

if(typeof(String.prototype.trim) === "undefined")
{
    String.prototype.trim = function() 
    {
        return String(this).replace(/^\s+|\s+$/g, '');
    };
}

function Message(key, arg) {
    var strings = window.document.getElementById("strings");
    if (strings) {
        var message = strings.getString(key);
        if (arg) {
            message = message.replace(/%/, arg);
        }
        return message;
    } else {
        return key;
    }
}

var ExtensionsLoader = {
  getURLs: function(commaSeparatedPaths) {
    var urls = [];
    if (commaSeparatedPaths) {
      commaSeparatedPaths.split(/,/).forEach(function(path) {
          path = path.replace(/^\s*/, '');
          path = path.replace(/\s*$/, '');
          if (!path.match(/^(file|chrome):/)) {
            path = FileUtils.fileURI(FileUtils.getFile(path));
          }
          // force a reload of the extensions by adding the timestamp as parameter
          var timestamp = new Date().getTime();
          path = path + '?' + timestamp;
          urls.push(path);
        });
    }
    return urls;
  },
  
  loadSubScript: function(loader, paths, obj) {
    this.getURLs(paths).forEach(function(url) {
        if (url) {
          loader.loadSubScript(url, obj);
        }
      });
  }
};

/**
 * Returns the string with angle brackets and ampersands escaped as HTML
 * entities. This is a cleaner implementation than the escapeHTML() methods
 * defined by both the prototype and scriptaculous frameworks as it does not
 * rely on the presence of a document object which can be manipulated.
 */
String.prototype.escapeHTML2 = function() {
    return this
        .replace(/&/g, '&amp;')
        .replace(/</g, '&lt;')
        .replace(/>/g, '&gt;');
};

String.prototype.formatAsHTML = function() {
    return this.replace(/(?:\r\n|\r|\n)/g, '<br />');
};

Array.prototype["delete"] = function(value) {
    for (var i = 0; i < this.length; i++) {
        if (this[i] == value) {
            this.splice(i, 1);
            return true;
        }
    }
    return false;
}

// Samit: Ref: Split the fn to allow both objects of a class as well as the class itself to be notifiable as required
function observable(clazz) {
  classObservable(clazz.prototype);
/*    clazz.prototype.addObserver = function(observer) {
        if (!this.observers) this.observers = [];
        this.observers.push(observer);
    }

    clazz.prototype.removeObserver = function(observer) {
        if (!this.observers) return;
        this.observers["delete"](observer);
    }

    clazz.prototype.notify = function(event) {
        if (this.log) {
            this.log.debug("notify " + event);
        }
        if (!this.observers) return;
        var args = [];
        for (var i = 1; i < arguments.length; i++) {
            args.push(arguments[i]);
        }
        for (var i = 0; i < this.observers.length; i++) {
            var observer = this.observers[i];
            if (observer[event]) {
                try {
                    observer[event].apply(observer, args);
                } catch(e) {
                    //continue with the rest even if one observer fails
                }
            }
        }
    }*/
}

function classObservable(clazz) {
    clazz.addObserver = function(observer) {
        if (!this.observers) this.observers = [];
        this.observers.push(observer);
    };

    clazz.removeObserver = function(observer) {
        if (!this.observers) return;
        this.observers["delete"](observer);
    };

    clazz.notify = function(event) {
        if (this.log) {
            this.log.debug("notify " + event);
        }
        if (!this.observers) return;
        var args = [];
        for (var i = 1; i < arguments.length; i++) {
            args.push(arguments[i]);
        }
        for (var i = 0; i < this.observers.length; i++) {
            var observer = this.observers[i];
            if (observer[event]) {
                try {
                    observer[event].apply(observer, args);
                } catch(e) {
                    //continue with the rest even if one observer fails
                }
            }
        }
    };
}

function defineEnum(clazz, names) {
    var map = {};
    for (var i = 0; i < names.length; i++) {
        clazz[names[i]] = i;
        map[i] = names[i];
    }
    return map;
}

function $(id) {
    return document.getElementById(id);
}








/** ======================================================================= **/
/** 							java-rc-junit4.js 							**/
/** ======================================================================= **/

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
	environment: "*chrome",
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
    "${dbSnapshot}"+
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





/** ======================================================================= **/
/** 								CUSTOM	 								**/
/** ======================================================================= **/
var testCase = new TestCase(className);
    
var commands = [];
Command.apiDocuments = new Array(apiDocument);
for (var i in formatedSeleniumCommandList) {
	var javaCommand = formatedSeleniumCommandList[i];
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
}
if(commands)
	testCase.commands = commands;
if(screenshotsDirectory)
	testCase.screenshotsDirectory = screenshotsDirectory;
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
if(baseurl)
	testCase.baseURL = baseurl;
if(timeout)
	testCase.timeout = timeout;
if(speed)
	testCase.speed = speed;
if(dbSnapshot)
	testCase.dbSnapshot = dbSnapshot;
if(dbRestore)
	testCase.dbRestore = dbRestore;
testCase = format(testCase);
var result = testCase.toString();
//print(result);
