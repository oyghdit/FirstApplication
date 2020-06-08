package com.example.firstapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class menulayoutActivity extends Activity {
    private TextView tv;
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.menulayout);
        tv=(TextView)findViewById(R.id.show);
        registerForContextMenu(tv);


    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo info){
        MenuInflater inflator=new MenuInflater(this);
        inflator.inflate(R.menu.contextmenu,menu);
        menu.setHeaderIcon(R.drawable.rabbf);
        menu.setHeaderTitle("请选择文字颜色");

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.color1:
            tv.setTextColor(Color.rgb(255,0,0));
            break;
            case R.id.color2:
                tv.setTextColor(Color.rgb(0,255,0));
                break;
            case R.id.color3:
                tv.setTextColor(Color.rgb(0,0,255));
                break;
            case R.id.color4:
                tv.setTextColor(Color.rgb(255,180,0));
                break;
            default:
                tv.setTextColor(Color.rgb(255,255,255));

        }
        return true;
    }
}
