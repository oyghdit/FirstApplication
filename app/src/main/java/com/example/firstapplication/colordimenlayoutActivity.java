package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class colordimenlayoutActivity extends Activity {
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.colordimenlayout);
        int tv[] = new int[]{R.id.str1, R.id.str2, R.id.str3, R.id.str4, R.id.str5, R.id.str6, R.id.str7,};
        int color[]=new int[]{R.color.color1,R.color.color2,R.color.color3,R.color.color4,R.color.color5,R.color.color6,R.color.color7};
        for(int i=0;i<7;i++){
            TextView textView=(TextView)findViewById(tv[i]);
            textView.setGravity(Gravity.CENTER);
            textView.setBackgroundColor(getResources().getColor(color[i]));
            textView.setHeight((int) (getResources().getDimension(R.dimen.basic)) * (i + 2)/2);


        }

    }
}
