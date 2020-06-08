package com.example.firstapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

public class sharedprelayout2Activity extends Activity {
    private SharedPreferences worldReadSP;
    private SharedPreferences worldWriteSP;
    private SharedPreferences worldReadWriteSP;
    private TextView worldReadTV;
    private TextView worldWriteTV;
    private TextView worldReadWriteTV;
    @SuppressLint("WrongConstant")
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.sharedprelayout2);
        Context otherContext = null;
        try {
            otherContext=createPackageContext("com.example",MODE_PRIVATE);


        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
        }
        worldReadSP=otherContext.getSharedPreferences("worldRead",MODE_WORLD_READABLE);
        worldWriteSP=otherContext.getSharedPreferences("worldWrite",MODE_WORLD_WRITEABLE);
        worldReadWriteSP=otherContext.getSharedPreferences("worldReadWrite",MODE_WORLD_READABLE+MODE_WORLD_WRITEABLE);
        worldReadTV=(TextView)findViewById(R.id.worldRead);
        worldWriteTV=(TextView)findViewById(R.id.worldWrite);
        worldReadWriteTV=(TextView)findViewById(R.id.worldReadWrite);
        worldReadTV.setText("全局可读"+worldReadSP.getString("key","null"));
        worldWriteTV.setText("全局可写"+worldWriteSP.getString("key","null"));
        worldReadWriteTV.setText("全局可读可写"+worldReadWriteSP.getString("key","null"));


    }



}
