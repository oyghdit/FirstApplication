package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.util.DBHelper;
import com.example.util.User;

public class sqlitereadlayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.sqlitereadlayout);
        TextView usernameTV=(TextView)findViewById(R.id.username);
        TextView passwordTV=(TextView)findViewById(R.id.password);
        DBHelper helper=new DBHelper(sqlitereadlayoutActivity.this);
        User user=helper.query(1);
        usernameTV.setText("用户名："+user.getUsername());
        passwordTV.setText("用户："+user.getPassword());
    }
}
