var exec = require('cordova/exec'),
   cordova = require('cordova');

function Share() {

}
Share.prototype.addItem = function(item, successCallback, errorCallback) {
   exec(successCallback, errorCallback, "Share", "addItem", [item]);
};

module.exports = new Share();