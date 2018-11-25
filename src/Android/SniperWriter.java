package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import java.io.RandomAccessFile;

public class SniperWriter extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray payload, CallbackContext callbackContext) throws JSONException {

        if (action.equals("write")) {
            callbackContext.success(payload);
            // File location = new File(String path)
            // RandomAccessFile random_access_file = new RandomAccessFile(File location, String mode)
            return true;
        } else {
            return false;
        }
    }
}