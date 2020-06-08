package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class patchenableaActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.patchenablelayout);
        final Button but1=(Button)findViewById(R.id.patchenbut1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b=(Button)view;
                b.setEnabled(false);
                b.setText("我是不可用按钮");
                Toast.makeText(patchenableaActivity.this,"按钮变为不可用",Toast.LENGTH_SHORT).show();
            }
        });
        Button b2=(Button)findViewById(R.id.patchenbut2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but1.setEnabled(true);
                but1.setText("我是可用按钮");

            }
        });
    }
}
