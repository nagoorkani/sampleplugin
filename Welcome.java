/**
 * 
 */
package com.phonegap.plugins.welcome;

import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

import android.content.Context;
import android.telephony.TelephonyManager;

public class Welcome extends Plugin {
    
    protected static final String str = "This is my first plugin...!";

    public PluginResult execute(String action, JSONArray args, String callbackId) {

    	//TelephonyManager telephonyManager = (TelephonyManager)this.ctx.getSystemService(Context.TELEPHONY_SERVICE);
    	//return new PluginResult(PluginResult.Status.OK, telephonyManager.getDeviceId());
    	
        return new PluginResult(PluginResult.Status.OK, str);
        
    }

}