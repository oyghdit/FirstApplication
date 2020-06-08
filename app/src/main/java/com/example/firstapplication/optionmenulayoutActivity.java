package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class optionmenulayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=new MenuInflater(this);
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getGroupId()==R.id.setting){
            if(item.isChecked()){
                item.setChecked(false);
            }else item.setChecked(true);
        }
        if(item.getItemId()!=R.id.item2){
            Toast.makeText(optionmenulayoutActivity.this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }

        return true;
    }

}
