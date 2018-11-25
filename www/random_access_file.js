/*global cordova, module*/

module.exports = {
    write: function (payload, successCallback, errorCallback) {
        console.log('random_access_file', payload)
        cordova.exec(successCallback, errorCallback, "SniperWriter", "write", [payload]);
    }
};