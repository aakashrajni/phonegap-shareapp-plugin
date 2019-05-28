package org.sample.share;

 import android.content.Context;
 import android.content.Intent;

 import org.apache.cordova.CallbackContext;
 import org.apache.cordova.CordovaPlugin;
 import org.json.JSONArray;
 import org.json.JSONException;

 import java.util.ArrayList;

 public class Share extends CordovaPlugin {
     public ArrayList itemsList = new ArrayList();
     public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
         try {
             if (action.equals("addItem")) {
                //  String item = args.getString(0);
                //  String className = args.getString(1);
                //  Context context = cordova.getActivity().getApplicationContext();
                //  Intent intent = new Intent(context,Class.forName(className));
                //  itemsList.add(item);
                //  intent.putStringArrayListExtra("items", itemsList);
                
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
            "Hey check out my app at: paste app link here");
                sendIntent.setType("text/plain");
                // context.startActivity(sendIntent);
                 cordova.startActivityForResult(this,sendIntent,1);
                 callbackContext.success();
                 return true;
             }
             callbackContext.error("Invalid action");
             return false;
         } catch(Exception e) {
             System.err.println("Exception: " + e.getMessage());
             callbackContext.error(e.getMessage());
             return false;
         }
     }
     public void onActivityResult(int requestCode, int resultCode, Intent data) {
         // Handle a result here if one set in the Activity class started
         System.out.println("Activity Result: " + resultCode); //-1 is RESULT_OK
         if (resultCode==cordova.getActivity().RESULT_OK) {
             System.out.println("All good!");
         }
     }     
 }