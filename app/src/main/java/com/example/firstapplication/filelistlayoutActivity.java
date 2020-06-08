package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class filelistlayoutActivity extends Activity {
    public void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.filelist1layout);
        ListView listView=(ListView)findViewById(R.id.list);
        File rootPath= Environment.getExternalStorageDirectory();
        List<String> items=new ArrayList<String>();
        for(File file:rootPath.listFiles()){
            items.add(file.getName());
        }
        ArrayAdapter<String> filelist=new ArrayAdapter<String>(this,R.layout.filelist2layout,items);
        listView.setAdapter(filelist);
    }
}
