package com.example.firstapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sharedprelayoutActivity extends Activity {
    private EditText worldReadET;
    private EditText worldWriteET;
    private EditText worldReadWriteET;
    private SharedPreferences worldReadSP;
    private SharedPreferences worldWriteSP;
    private SharedPreferences worldReadWriteSP;
    @Override
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.sharedfrelayout);
        worldReadET=(EditText)findViewById(R.id.worldRead);
        worldReadET=(EditText)findViewById(R.id.worldWrite);
        worldReadET=(EditText)findViewById(R.id.worldReadWrite);
        worldReadSP=getSharedPreferences("worldRead", MODE_WORLD_READABLE);
        worldWriteSP=getSharedPreferences("worldWrite",MODE_WORLD_WRITEABLE);
        worldReadWriteSP=getSharedPreferences("worldReadWrite", MODE_WORLD_WRITEABLE + MODE_WORLD_READABLE);
        Button save=(Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String worldReadS=worldReadET.getText().toString();
                String worldWriteS=worldWriteET.getText().toString();
                String worldReadWriteS=worldReadWriteET.getText().toString();
                SharedPreferences.Editor worldReadE=worldReadSP.edit();
                SharedPreferences.Editor worldWriteE=worldWriteSP.edit();
                SharedPreferences.Editor worldReadWriteE=worldReadWriteSP.edit();
                worldReadE.putString("key",worldReadS);
                worldWriteE.putString("key",worldWriteS);
                worldReadWriteE.putString("key",worldReadWriteS);
                worldReadE.commit();
                worldWriteE.commit();
                worldReadWriteE.commit();

            }
        });

    }
}
