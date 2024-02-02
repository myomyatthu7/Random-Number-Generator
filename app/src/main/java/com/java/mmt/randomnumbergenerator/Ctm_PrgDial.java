package com.java.mmt.randomnumbergenerator;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.airbnb.lottie.LottieAnimationView;

public class Ctm_PrgDial extends Dialog {
    LottieAnimationView lottie;
    protected Ctm_PrgDial(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener, String str) {
        super(context, cancelable, cancelListener);
        View v = LayoutInflater.from(context).inflate(R.layout.progress_bar,null,false);
        TextView tv = v.findViewById(R.id.tvProBar);
        lottie = v.findViewById(R.id.lottie);
        lottie.animate();
        tv.setText(str);
        setContentView(v);
    }
}
