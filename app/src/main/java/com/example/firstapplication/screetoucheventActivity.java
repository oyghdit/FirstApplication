package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public abstract class screetoucheventActivity extends Activity implements View.OnTouchListener {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        LinearLayout linearLayout=new LinearLayout(this);
        linearLayout.setOnTouchListener( this);
        linearLayout.setBackgroundResource(R.drawable.caodi);

    }
}
