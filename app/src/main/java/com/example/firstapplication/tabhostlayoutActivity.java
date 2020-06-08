package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

public class tabhostlayoutActivity extends Activity {
    private TabHost tabHost;
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.tabhostlayout);
        tabHost=(TabHost)findViewById(R.id.tabhost1);
        tabHost.setup();//初始化
        LayoutInflater inflater=LayoutInflater.from(this);
        inflater.inflate(R.layout.tabhostab1layout,tabHost.getTabContentView());
        inflater.inflate(R.layout.tabhostab2layout,tabHost.getTabContentView());
        tabHost.addTab(tabHost.newTabSpec("tab01").setIndicator("未接来电").setContent(R.id.tabhostbar1));
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("已接来电").setContent(R.id.tabhostbar2));

    }
}
