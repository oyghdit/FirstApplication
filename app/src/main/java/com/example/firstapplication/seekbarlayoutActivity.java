package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class seekbarlayoutActivity extends Activity {
    private SeekBar seekBar;

    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.seekbarlayout);
        final TextView result;
        result=(TextView)findViewById(R.id.sektv1);
        seekBar=(SeekBar)findViewById(R.id.seekbar1);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                result.setText("当前值："+i);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(seekbarlayoutActivity.this,"开始滑动",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(seekbarlayoutActivity.this,"结束滑动",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
