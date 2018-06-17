package com.example.ankush.eathquakereportapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter {

    List<EarthquakeData> data;
    public EarthquakeAdapter(@NonNull Context context, List<EarthquakeData> earthquakes) {
        super(context, 0,earthquakes);
        data=earthquakes;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView== null){

            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);
        }

        EarthquakeData currentEarthquake = data.get(position);

        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthquake.getMagnitude());

        TextView Location = (TextView) listItemView.findViewById(R.id.location);
        Location.setText(currentEarthquake.getLocation());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentEarthquake.getDate());





        return super.getView(position, convertView, parent);
    }
}
