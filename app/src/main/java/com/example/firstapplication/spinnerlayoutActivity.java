package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class spinnerlayoutActivity extends Activity {
    String[] str=new String[]{
            "身份证","学生","军人证","其他"
    };
    protected void onCraete(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.spinnerlayout);
        Spinner spinner=(Spinner)findViewById(R.id.spinner1);
        spinner.getSelectedItem();
        spinner.setOnItemClickListener(new OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                String result=adapterView.getItemAtPosition(pos).toString();
                Toast.makeText(spinnerlayoutActivity.this,result,Toast.LENGTH_SHORT).show();

            }

            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(spinnerlayoutActivity.this,android.R.layout.simple_spinner_item,str);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

}
