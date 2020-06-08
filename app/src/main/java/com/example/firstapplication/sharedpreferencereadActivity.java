package com.example.firstapplication;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class sharedpreferencereadActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.sharedresultlayout);
        TextView usernameTV=(TextView)findViewById(R.id.username);
        TextView passwordTV=(TextView)findViewById(R.id.password);
        SharedPreferences sp=getSharedPreferences("morsoft",MODE_PRIVATE);
        String username=sp.getString("username","mr");
        String password=sp.getString("password","001");
        usernameTV.setText("用户名"+username);
        passwordTV.setText("密码"+password);
    }
}
