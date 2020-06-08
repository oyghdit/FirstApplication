package com.example.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ouzhoubeilayoutActivity extends Activity {
    private List<Country> countryList=new ArrayList<>();
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.ouzhoubeilayout);
        initCountry();
        ouzhoubeiAdapter adapter=new ouzhoubeiAdapter(ouzhoubeilayoutActivity.this,R.layout.countrylayout,countryList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

    private void initCountry() {
            Country Russian=new Country("Russian",R.drawable.russian);
            countryList.add(Russian);
            Country Poland=new Country("Poland",R.drawable.poland);
            countryList.add(Poland);
            Country Greece=new Country("Greece",R.drawable.greece);
            countryList.add(Greece);Country Czech=new Country("Czech",R.drawable.czech);
            countryList.add(Czech);Country Netherlands=new Country("Netherlands",R.drawable.netherlands);
            countryList.add(Netherlands);Country Germany=new Country("Germany",R.drawable.germany);
            countryList.add(Germany);
            Country Portugal=new Country("Portugal",R.drawable.portugal);
            countryList.add(Portugal);
            Country Denmark=new Country("Denmark",R.drawable.denmark);
            countryList.add(Denmark);
            Country Spain=new Country("Spain",R.drawable.spain);
            countryList.add(Spain);
            Country Italy=new Country("Italy",R.drawable.italy);
            countryList.add(Italy);
            Country Ireland=new Country("Ireland",R.drawable.ireland);
            countryList.add(Ireland);
            Country Croatia=new Country("Croatia",R.drawable.croatia);
            countryList.add(Croatia);
            Country England=new Country("England",R.drawable.england);
           countryList.add(England);
            Country France=new Country("France",R.drawable.france);
           countryList.add(France);
            Country Sweden=new Country("Sweden",R.drawable.sweden);
           countryList.add(Sweden);
            Country Ukraine=new Country("Ukraine",R.drawable.ukraine);
            countryList.add(Ukraine);








    }
}
