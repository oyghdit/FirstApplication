package com.example.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class internaldatawritelayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.internaldatawritelayout);
        final EditText usernameET = (EditText) findViewById(R.id.username);// 获得用户名控件
        final EditText passwordET = (EditText) findViewById(R.id.password);// 获得密码控件
        Button login = (Button) findViewById(R.id.login);// 获得按钮控件
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameET.getText().toString();// 获得用户名
                String password = passwordET.getText().toString();// 获得密码
                FileOutputStream fos=null;
                try {
                    fos=openFileOutput("login",MODE_PRIVATE);// 获得文件输出流

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                try {
                    fos.write((username+""+password).getBytes());// 保存用户名和密码
                    fos.flush();//清除缓存

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
                        }
                    }
                    Intent intent=new Intent();
                    intent.setClass(internaldatawritelayoutActivity.this,internaldatareadlayoutActivity.class);
                    startActivity(intent);
                }


            }
        });

    }

}
