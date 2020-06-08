package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class autocompletelayoutActivity extends Activity {
    String[] str=new String[]{"jxnu","jxsd","jxsfd","jxsdry","jxsdnu","jxsdhgh"};
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.autocompletelayout);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(autocompletelayoutActivity.this,android.R.layout.simple_spinner_dropdown_item,str);
        final AutoCompleteTextView textView=(AutoCompleteTextView)findViewById(R.id.autotv1);
        textView.setAdapter(adapter);
        Button button=(Button)findViewById(R.id.autobut1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(autocompletelayoutActivity.this,textView.getText(),Toast.LENGTH_SHORT).show();
                Log.i("您搜索的内容为：",textView.getText().toString());
            }
        });

    }

}
