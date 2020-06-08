package com.example.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class rabbitlayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.rabbitlayout);
        FrameLayout frameLayout=(FrameLayout)findViewById(R.id.fra1);
        final Rabbit rabbit=new Rabbit(this);
        rabbit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                rabbit.bitmapX= motionEvent.getX();
                rabbit.bitmapY=motionEvent.getY();
                rabbit.invalidate();
                return true;
            }
        });
        frameLayout.addView(rabbit);


    }
}
