# cordova-plugin-statusbar-height
> 获取Android，iOS状态栏高度

## Installation

```bash
cordova plugin add https://github.com/wangjunget/cordova-plugin-statusbar-height.git
```

## Methods

### cordova.plugins.StatusBarHeight.getValue



## cordova.plugins.StatusBarHeight.getValue

### Description

获取状态栏高度值，值类型为设备独立像素值。

###  Demo

```javascript
document.addEventListener('deviceready', getStatusbarHeight, false);
function getStatusbarHeight() {
    cordova.plugins.StatusBarHeight.getValue(
        function(value) {
            console.log(value);
        },
        function(error) {
            console.log(error);
        }
    )
}
```


### Tips

* 该插件获取到的值为设备独立像素值，如需要物理像素值可自行转换

  ```javascript
  var value; // 插件获取到的独立像素值
  var pdr = window.devicePixelRatio; // 获取设备独立像素比
  var px = value * pdr; // 得到物理像素值
  ```

  

### Supported Platforms

* andorid
* ios

