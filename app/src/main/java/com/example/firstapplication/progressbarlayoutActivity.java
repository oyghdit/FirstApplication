package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class progressbarlayoutActivity extends Activity {
    private ProgressBar horontalP;
    private ProgressBar attP;
    private Handler handler;
    private int progressstaus=0;
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.progressbarlayout);
        horontalP=(ProgressBar)findViewById(R.id.progressbar1);
        attP=(ProgressBar)findViewById(R.id.progressbar2);
        handler=new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                if(msg.what == 0x110){
                    horontalP.setProgress(progressstaus);
                }else {
                    Toast.makeText(progressbarlayoutActivity.this,"耗时已经完成",Toast.LENGTH_SHORT).show();
                    horontalP.setVisibility(View.VISIBLE);
                    attP.setVisibility(View.VISIBLE);

                }
            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    progressstaus=doWork();
                    Message m=new Message();
                    if(progressstaus<100){
                        m.what=0x111;
                        handler.sendMessage(m);
                    }else{
                        m.what=0x110;
                        handler.sendMessage(m);
                        break;
                    }
                }

            }

            private int doWork() {
                progressstaus+=Math.random()*10;
                try{
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                return progressstaus;
            }

        }).start();


    }
}
