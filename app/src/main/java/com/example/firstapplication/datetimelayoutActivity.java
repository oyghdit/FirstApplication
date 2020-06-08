package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.Calendar;

public class datetimelayoutActivity extends Activity {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    private void show(int year, int month, int day,int hour,int minute) {
        String str=year+"年"+(month+1)+"月"+day+"日"+hour+":"+minute+"分";
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.datatimelayout);
        DatePicker datePicker=(DatePicker)findViewById(R.id.date1);
        TimePicker timePicker=(TimePicker)findViewById(R.id.time1);
        Calendar calendar=Calendar.getInstance();
         year=calendar.get(Calendar.YEAR);
         month=calendar.get(Calendar.MONTH);
         day=calendar.get(Calendar.DAY_OF_MONTH);
         hour=calendar.get(Calendar.HOUR_OF_DAY);
         minute=calendar.get(Calendar.MINUTE);
        datePicker.init(year,month,day,new DatePicker.OnDateChangedListener(){

            public void onDateChanged(DatePicker arg0, int year, int month, int day) {
                datetimelayoutActivity.this.year=year;
                datetimelayoutActivity.this.month=month;
                datetimelayoutActivity.this.day=day;
                show(year,month,day,hour,minute);

            }});
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hourOfDay, int minutes) {
                datetimelayoutActivity.this.hour=hourOfDay;
                datetimelayoutActivity.this.minute=minutes;
                show(year,month,day,hourOfDay,minutes);

            }
        });



    }
}
