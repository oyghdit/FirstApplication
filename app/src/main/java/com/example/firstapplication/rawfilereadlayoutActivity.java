package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class rawfilereadlayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.rawfilereadlayout);
        InputStream is=getResources().openRawResource(R.raw.login);
        byte[] buffer=null;
        try {
            buffer=new byte[is.available()];
            is.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            {
                if(is!=null){
                    try {
                        is.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            String data=new String(buffer);
            TextView usernameTV=(TextView)findViewById(R.id.username);
            TextView passwordTV=(TextView)findViewById(R.id.password);
            String username=data.split(" ")[0];
            String password=data.split(" ")[1];
            usernameTV.setText("用户名："+username);
            passwordTV.setText("密码"+password);
        }
    }
}
