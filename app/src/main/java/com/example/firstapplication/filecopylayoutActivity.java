package com.example.firstapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class filecopylayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.filecopylayout);
        File file=new File(Environment.getExternalStorageState(),"Background1.png");
        @SuppressLint("ResourceType") InputStream is=getResources().openRawResource(R.drawable.gamebackground);
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(file);
            byte[] buffer=new byte[is.available()];
            is.read(buffer);
            fos.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            {
                if(fos!=null){
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            }
        }

    }
}
