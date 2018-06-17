package com.example.ankush.eathquakereportapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //using temp dummy data

        ArrayList<EarthquakeData> earthquakes= new ArrayList<>();

        earthquakes=QueryUtils.extractDataFromJSON();

        ListView earthquakeListView= (ListView) findViewById(R.id.list);
     //   ArrayAdapter<String> adapter= new ArrayAdapter<String >( this, android.R.layout.simple_list_item_1, earthquakes);

        EarthquakeAdapter adapter= new EarthquakeAdapter(this,earthquakes);
        earthquakeListView.setAdapter(adapter);

    }
}
