package com.example.firstapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class comegamelayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.comegamelayout);
        ImageView imageView=(ImageView)findViewById(R.id.comegameimg1);
        imageView.setOnClickListener(new View.OnClickListener(){


            public void onClick(View view) {
                Toast.makeText(comegamelayoutActivity.this,"进入游戏......",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
