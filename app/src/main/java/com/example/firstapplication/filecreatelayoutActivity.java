package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;

public class filecreatelayoutActivity extends Activity {
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.filecreatelayout);
        TextView tv = (TextView) findViewById(R.id.message);
        File root = Environment.getExternalStorageDirectory();
        if (root.exists() && root.canWrite()) {
            File file = new File(root, "DemoFile4.png");
            try {
                if (file.createNewFile()) {
                    tv.setText(file.getName() + "创建成功！");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            tv.setText("SD卡不存在或者不可写");

        }

    }
}
