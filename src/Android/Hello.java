package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.File;
import java.io.RandomAccessFile;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {
            // File path = new File();
            JSONObject file = data.getJSONObject(0);
            JSONObject blob = data.getJSONObject(1);
            callbackContext.success(data.getJSONObject(0).getClass().getSimpleName()+"|"+data.getJSONObject(1).getClass().getSimpleName());
            return true;

        } else {
            
            return false;

        }
    }
}