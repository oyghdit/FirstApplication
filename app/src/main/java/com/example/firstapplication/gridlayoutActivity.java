package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gridlayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.gridlayout);
        GridView gridView=(GridView)findViewById(R.id.grid1);
        int[] image={R.drawable.qq12,R.drawable.qq12,R.drawable.qq12,R.drawable.qq12,R.drawable.qq12,R.drawable.qq12,
                R.drawable.qq12,R.drawable.qq12,R.drawable.qq12,R.drawable.qq12,R.drawable.qq12,R.drawable.qq12

        };
        String[] title={"花好月圆1","春江2","良辰3","月圆4","花好5","花开富贵6","海天一色7","一枝独秀8",
                "蒲公英9","云10","填入11","银河12"};
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        for (int i=0;i<image.length;i++){
            Map<String,Object> map=new HashMap<String, Object>();
            map.put("gridimage1",image[i]);
            map.put("gridtext1",title[i]);
            list.add(map);

        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,list,R.layout.griditemlayout,new String[]{"gridimage1","gridtext1"},new int[]{R.id.gridimage1,R.id.gridtext1});
        gridView.setAdapter(simpleAdapter);

    }
}
