package com.example.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends MainActivity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.loginlayout);
        Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text=(EditText)findViewById(R.id.usename1);
                String usename=text.getText().toString();
                EditText text2=(EditText)findViewById(R.id.pass1);
                String usepass=text2.getText().toString();
                //创建意图
                Intent intent=new Intent();
                intent.putExtra("usename",usename);
                intent.putExtra("usepass",usepass);
                intent.setClass(loginActivity.this,loginsecondActivity.class);
                startActivity(intent);

            }
        });//button
        Button button1=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_MAIN);//返回主页面
                startActivity(intent);
            }
        });//button1
        Button button2=(Button)findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });
    }
}
