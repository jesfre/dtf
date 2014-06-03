// This script contains a badly-organised collection of miscellaneous
// functions that really better homes.

var _stringUtils_ = function() {
	
	this.capitalize = _capitalize_;

};

/*
 * Capitalizes the first character
 */
function _capitalize_(str) {
	log.trace('Capializing ['+str+']');
	
	var capitalized = str.charAt(0).toUpperCase() + str.slice(1);
	
	log.trace('Capitalized ['+capitalized+']');
	return capitalized;
}

var StringUtils = new _stringUtils_();