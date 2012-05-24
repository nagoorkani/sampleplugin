
function Welcome() {
};

Welcome.prototype.display = function(successCallback, failureCallback) {
	cordova.exec(successCallback, failureCallback, "welcome", '', []);
}

/*
Welcome.install = function(){
    return window.plugins.welcome;
};*/


cordova.addConstructor(function() {
    cordova.addPlugin("welcome", new Welcome());
});