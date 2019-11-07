package org.apache.cordova.statusbarheight;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.res.Resources;
import android.content.Context;

/**
 * This class echoes a string called from JavaScript.
 */
public class StatusBarHeight extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        // 测试命令
        if (action.equals("echo")) {
            String message = args.getString(0);
            this.echo(message, callbackContext);
            return true;
        }
        
        // 获取状态栏高度命令
        if (action.equals("getValue")) {
          this.getValue(callbackContext);
          return true;
        }

        return false;
    }

    // 测试方法
    private void echo(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    // 获取状态栏高度
    private void getValue(CallbackContext callbackContext) {
      Context contextApplication = cordova.getActivity().getApplicationContext();
      Resources resources = contextApplication.getResources();
      int statusBarHeight = -1;
      //获取status_bar_height资源的ID
      int resourceId = resources.getIdentifier("status_bar_height", "dimen","android");
      if (resourceId > 0) {
        //根据资源ID获取响应的尺寸值
        statusBarHeight = resources.getDimensionPixelSize(resourceId);
        callbackContext.success(statusBarHeight); // 成功回调返回状态栏高度值
      } else {
        callbackContext.error("未获取到状态栏高度");
      }
    }
}


