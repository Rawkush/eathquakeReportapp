package com.example.ankush.eathquakereportapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter {


    public EarthquakeAdapter(@NonNull Context context, List<EarthquakeData> earthquakes) {
        super(context, 0,earthquakes);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;

        if(listView== null){

            listView= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);
        }

       // EarthquakeData currentEarthquake = getItem(position);


        return super.getView(position, convertView, parent);
    }
}
