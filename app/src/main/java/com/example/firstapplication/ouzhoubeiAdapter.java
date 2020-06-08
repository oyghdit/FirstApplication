package com.example.firstapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ouzhoubeiAdapter extends ArrayAdapter<Country> {
    private int resourceId;

    public ouzhoubeiAdapter(Context context, int textViewResourceId, List<Country> objiect) {
        super(context, textViewResourceId, objiect);
        resourceId=textViewResourceId;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Country country = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView countryImg = (ImageView) view.findViewById(R.id.imgv1);
        TextView countryName = (TextView) view.findViewById(R.id.textv1);
        countryImg.setImageResource(country.getImgeId());
        countryName.setText(country.getName());
        return view;
    }
}
