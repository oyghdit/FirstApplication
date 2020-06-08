package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class tupianlayoutActivity extends Activity {
    private ImageView[] img=new ImageView[12];
    private int[] imagePath=new int[]{R.drawable.qq1,R.drawable.qq2,R.drawable.qq3,R.drawable.qq4,R.drawable.qq5,R.drawable.qq6,
            R.drawable.qq7,R.drawable.qq8,R.drawable.qq9,R.drawable.qq10,R.drawable.qq11,R.drawable.qq12

    };
protected void onCreate(Bundle s){
    super.onCreate(s);
    setContentView(R.layout.tupianlayout);
    GridLayout layout=(GridLayout)findViewById(R.id.grid1);
    for(int i=0;i<imagePath.length;i++){
        img[i]=new ImageView(tupianlayoutActivity.this);
        img[i].setImageResource(imagePath[i]);
        img[i].setPadding(2,2,2,2);
        ViewGroup.LayoutParams params=new ViewGroup.LayoutParams(116,88);
        img[i].setLayoutParams(params);
        layout.addView(img[i]);
    }
}


}
