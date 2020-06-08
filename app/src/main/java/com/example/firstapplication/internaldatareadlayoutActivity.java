package com.example.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class internaldatareadlayoutActivity extends Activity {
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.internaldatareadlayout);
        FileInputStream fis=null;
        byte[] buffer=null;
        try {
            fis=openFileInput("login");
            buffer=new byte[fis.available()];
            fis.read(buffer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            {
                if(fis!=null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
           // Intent intent=getIntent();
            TextView usernameTV=(TextView)findViewById(R.id.username);
            TextView passwordTV=(TextView)findViewById(R.id.password);
            String data=new String(buffer);
            String username=data.split(" ")[0];
            String password=data.split(" ")[1];
            usernameTV.setText("用户名："+username);
            passwordTV.setText("密码："+password);
        }
    }
}
