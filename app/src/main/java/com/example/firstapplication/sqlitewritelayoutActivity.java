package com.example.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.util.DBHelper;
import com.example.util.User;

public class sqlitewritelayoutActivity extends Activity {
    public void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.sqlitewritelayout);
        final EditText usernameET=(EditText)findViewById(R.id.username);
        final EditText passwordET=(EditText)findViewById(R.id.password);
        Button login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=usernameET.getText().toString();
                String password=passwordET.getText().toString();
                User user=new User(username,password);
                DBHelper helper=new DBHelper(sqlitewritelayoutActivity.this);
                helper.insert(user);
                Intent intent=new Intent();
                intent.setClass(sqlitewritelayoutActivity.this,sqlitereadlayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
