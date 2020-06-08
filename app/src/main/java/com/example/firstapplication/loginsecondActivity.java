package com.example.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginsecondActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.loginsecondlayout);
        //获得意图
        Intent intent=getIntent();
        String name=intent.getStringExtra("usename");
        String pass=intent.getStringExtra("usepass");
        TextView textView=(TextView)findViewById(R.id.log_text);
        textView.setText("欢迎您！"+name);

    }
}
