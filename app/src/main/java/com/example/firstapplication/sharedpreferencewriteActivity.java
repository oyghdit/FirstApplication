package com.example.firstapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sharedpreferencewriteActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.sharedreferencelayout);
        final EditText usernameET=(EditText)findViewById(R.id.username);
        @SuppressLint("WrongViewCast") final EditText passwordET=(EditText)findViewById(R.id.password);
        Button login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=usernameET.getText().toString();
                String password=passwordET.getText().toString();
                SharedPreferences sp=getSharedPreferences("morsoft",MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("username",username);
                editor.putString("password",password);
                editor.commit();
                Intent intent=new Intent();
                intent.setClass(sharedpreferencewriteActivity.this,sharedpreferencereadActivity.class);
                startActivity(intent);

            }
        });
    }
}
