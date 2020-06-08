package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

public class chronometerlayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.chronometer);
        Chronometer chronometer=(Chronometer)findViewById(R.id.chronometer1);
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.setFormat("已用时间：%s");
        chronometer.start();
        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if(SystemClock.elapsedRealtime()-chronometer.getBase()>=10000){
                    chronometer.stop();
                }
            }
        });
    }
}
