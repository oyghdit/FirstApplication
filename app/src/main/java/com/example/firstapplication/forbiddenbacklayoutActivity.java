package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public class forbiddenbacklayoutActivity extends Activity {
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.forbiddenbacklayout);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK)
        { return true;}
        return super.onKeyDown(keyCode,event);
    }
}