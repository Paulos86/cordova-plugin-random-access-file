/*global cordova, module*/

module.exports = {
    write: function (payload, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "SniperWriter", "write", [payload]);
    }
};