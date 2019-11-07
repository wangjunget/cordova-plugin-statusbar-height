var exec = require('cordova/exec');

// 对外开放接, 回调函数接收状态栏高度值, 设备独立像素值
exports.getValue = function(success, error) {
    // android px to pd
    // android 返回px值
    // ios 返回pt值
    function pxToPd(value) {
        var pdr = window.devicePixelRatio;
        var pd = value / pdr;
        if (cordova.platformId == 'android') {
            success(pd)
        } else {
            success(value)
        }
    }
    exec(pxToPd, error, 'StatusBarHeight', 'getValue', []);
}
