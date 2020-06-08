package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class imageswitchlayoutActivity extends Activity {
    private ImageSwitcher imageSwitcher;
    private int index;
    private int[] image={
            R.drawable.qq1,R.drawable.qq2,R.drawable.qq3,R.drawable.qq4,R.drawable.qq5,R.drawable.qq6,
            R.drawable.qq7,R.drawable.qq8,R.drawable.qq9

    };
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.imageswitchlayout);
        imageSwitcher=(ImageSwitcher)findViewById(R.id.imageswitch1);
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_out));
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(imageswitchlayoutActivity.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });
        imageSwitcher.setImageResource(image[index]);
        Button up=(Button)findViewById(R.id.imageswitchbu1);
        Button dowm=(Button)findViewById(R.id.imageswitchbu2);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index>0){
                    index--;
                }else {
                    index=image.length-1;
                }
                imageSwitcher.setImageResource(image[index]);

            }
        });
        dowm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<image.length-1){
                    index++;
                }else {
                    index=0;
                }
                imageSwitcher.setImageResource(image[index]);

            }
        });
    }



}
