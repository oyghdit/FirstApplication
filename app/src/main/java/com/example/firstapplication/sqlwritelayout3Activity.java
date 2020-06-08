package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;

import com.example.util.DBHelper;
import com.example.util.DataBean;

import java.io.InputStream;
import java.util.Scanner;

public class sqlwritelayout3Activity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.sqlwritelayout3);
        DBHelper helper=new DBHelper(sqlwritelayout3Activity.this);
        InputStream is=getResources().openRawResource(R.raw.data);
        Scanner scanner=new Scanner(is);
        while (scanner.hasNextLine()){
            String line=scanner.nextLine();
            String[] data=line.split(" ");
            DataBean db=new DataBean();
            db.setNumber(Integer.parseInt(data[0]));
            db.setNumber(Integer.parseInt(data[1]));
            db.setNumber(Integer.parseInt(data[2]));
            helper.insert(db);
        }

    }
}
