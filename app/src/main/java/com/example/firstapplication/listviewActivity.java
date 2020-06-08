package com.example.firstapplication;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listviewActivity extends ListActivity {
    private String[]data={"apple","orange","li","caodi","rabbit","qq1","qq2","qq3","qq4","qq5","qq6"};
    protected void onCreate(Bundle s){
        super.onCreate(s);
        //setContentView(R.layout.listviewlayout);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(listviewActivity.this,android.R.layout.simple_list_item_1,data);
       // ListView listView=(ListView)findViewById(R.id.listview1);
        //listView.setAdapter(adapter);
        setListAdapter(adapter);
    }
    protected void onListItemClick(ListView listView, View view,int pos,long id){
        super.onListItemClick(listView,view,pos,id);
        String result=listView.getItemAtPosition(pos).toString();
        Toast.makeText(listviewActivity.this,result,Toast.LENGTH_SHORT).show();

    }
}
