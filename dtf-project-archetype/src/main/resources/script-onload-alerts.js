//TODO to delete. Only for testing mode.
var _openAlert = true;
setTimeout(function() {
	_openAlert = false;
	if(console) console.log('Canceled: _openAlert');
},2000);
window._alert = window.alert;
window.alert = function(str) {
	if(_openAlert) {
		if(console) console.log(str);
		setTimeout(function() {
			window._alert(str);
			_openAlert = false;
		},1500);
	} else {
		window._alert(str);
	}
};
