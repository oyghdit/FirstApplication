package com.example.firstapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;



public class checkboxlayoutActivity extends Activity {
    private OnCheckedChangeListener checklisten=new OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if(isChecked){
                Log.i("复选框","选择了"+button.getText());
            }

        }

    };

    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.checkboxlayout);
       final CheckBox like1=(CheckBox)findViewById(R.id.checkbox1);
       final CheckBox like2=(CheckBox)findViewById(R.id.checkbox2);
       final CheckBox like3=(CheckBox)findViewById(R.id.checkbox3);

        like1.setOnCheckedChangeListener(checklisten);
        like2.setOnCheckedChangeListener(checklisten);
        like3.setOnCheckedChangeListener(checklisten);
        Button butt1=(Button)findViewById(R.id.checkboxbut1);
        butt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String like="";
                if(like1.isChecked())
                    like+=like1.getText().toString()+" ";
                if(like2.isChecked())
                    like+=like2.getText().toString()+" ";
                if(like3.isChecked())
                    like+=like3.getText().toString()+" ";
                Toast.makeText(checkboxlayoutActivity.this,like,Toast.LENGTH_SHORT).show();


            }
        });






    }
}
