package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ratingbarlayoutActivity extends Activity {
    private RatingBar ratingBar;
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.ratingbarlayout);
        ratingBar=(RatingBar)findViewById(R.id.ratingbar1);
        final Button button=(Button)findViewById(R.id.ratingbut1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=ratingBar.getNumStars();
                int progess=ratingBar.getProgress();//星级数量
                float rating=ratingBar.getRating();//星级进度
                float step=ratingBar.getStepSize();//每次最少要改变多少星级
                Toast.makeText(ratingbarlayoutActivity.this,"您得到了："+rating+"颗星",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
