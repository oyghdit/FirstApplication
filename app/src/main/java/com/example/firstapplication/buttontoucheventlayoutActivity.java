package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class buttontoucheventlayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.buttontoucheventlayout);
        Button button=(Button)findViewById(R.id.touchbu1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(buttontoucheventlayoutActivity.this,R.string.short_click,Toast.LENGTH_SHORT).show();
            }
        });
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(buttontoucheventlayoutActivity.this,R.string.long_click,Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}
