package plugin.sample;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.apache.cordova.LOG;

import android.content.Context;
import android.content.Intent;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class Sample extends CordovaPlugin {

    private static final String LOG_TAG = "MySamplePlugin";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        LOG.d(LOG_TAG, "testのログです");

        Context context = cordova.getActivity().getApplicationContext();
        Intent intent = new Intent(context, NewActivity.class);
        cordova.getActivity().startActivity(intent);

        callbackContext.success("ok");
        return true;
    }
}
