# cordova-plugin-statusbar-height
> 获取Android，iOS状态栏高度

## Installation

```bash
cordova plugin add https://github.com/wangjunget/cordova-plugin-statusbar-height.git
```

## Methods

### cordova.plugins.StatusBarHeight.getValue



## cordova.plugins.StatusBarHeight.getValue

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
### Supported Platforms
* andorid
* ios

