package com.example.firstapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;


import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class radiobuttonlayout extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.radiolayout);
         final RadioGroup sex= (RadioGroup)findViewById(R.id.rbg1);
         sex.setOnCheckedChangeListener(new OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                 RadioButton r=(RadioButton)findViewById(checkedId);
                 //Log.i("选择单选按钮","您选择了;"+r.getText());
                 Toast.makeText(radiobuttonlayout.this,"您选择了"+r.getText(),Toast.LENGTH_SHORT).show();

             }
         });
         Button button=(Button)findViewById(R.id.but1);
         button.setOnClickListener(new View.OnClickListener() {


                                       public void onClick(View V) {
                                           for (int i = 0; i < sex.getChildCount(); i++) {
                                               RadioButton radioButton = (RadioButton) sex.getChildAt(i);
                                               if (radioButton.isChecked()) {
                                                  // Log.i("单选按钮", "您选择了：" + radioButton.getText());
                                                   Toast.makeText(radiobuttonlayout.this,radioButton.getText(),Toast.LENGTH_SHORT).show();
                                                   break;

                                               }//if
                                           }//for
                                       }//OnClick
                                   }//OnClickListener
         );









        }


}