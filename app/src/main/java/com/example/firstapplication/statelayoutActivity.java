package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.TextView;

public class statelayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.statelayout);
        boolean available=false;
        boolean writable=false;
        String state= Environment.getExternalStorageState();
        if(state.equals(Environment.MEDIA_MOUNTED)){
            available=true;
            writable=true;
        }else if(state.equals(Environment.MEDIA_MOUNTED_READ_ONLY)){
            available=true;
            writable=false;
        }else {
            available=false;
            writable=false;
        }
        TextView availableTV=(TextView)findViewById(R.id.available);
        availableTV.setText("外部存储介质是否可用:"+available);
        TextView writableTV=(TextView)findViewById(R.id.writable);
        writableTV.setText("外部介质是否可用："+writable);

    }
}
