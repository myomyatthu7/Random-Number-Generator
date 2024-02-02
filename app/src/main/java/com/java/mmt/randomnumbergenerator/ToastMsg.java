package com.java.mmt.randomnumbergenerator;

import android.content.Context;
import android.widget.Toast;

public class ToastMsg {
    protected static void toastMsg(Context context, String Msg) {
        Toast.makeText(context,Msg,Toast.LENGTH_SHORT).show();
    }
}
