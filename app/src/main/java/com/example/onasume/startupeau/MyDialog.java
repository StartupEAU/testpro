package com.example.onasume.startupeau;

import android.app.AlertDialog;

import android.content.Context;
import android.content.DialogInterface;


/**
 * Created by maxz on 9/7/16 AD.
 */
public class MyDialog  {

    public void MyDialog (Context context, String strtitle, String strmessage) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setTitle(strtitle);
        builder.setMessage(strmessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                dialog.dismiss();
            }
        });
        builder.show();
    }
}
