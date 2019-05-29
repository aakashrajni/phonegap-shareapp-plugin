var exec = require('cordova/exec'),
   cordova = require('cordova');

function Share() {

}
Share.prototype.addItem = function(item, sharetext, successCallback, errorCallback) {
   exec(successCallback, errorCallback, "Share", "addItem", [item,sharetext]);
};

module.exports = new Share();