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
        earthquakes.add(new EarthquakeData("San Francisco","4.4","12/12/21"));
        earthquakes.add(new EarthquakeData("London","4.4","12/12/21"));
        earthquakes.add(new EarthquakeData("Tokyo","4.4","12/12/21"));
        earthquakes.add(new EarthquakeData("Mexico City","4.4","12/12/21"));
        earthquakes.add(new EarthquakeData("Moscow","4.4","12/12/21"));
        earthquakes.add(new EarthquakeData("Rio de Janeiro","4.4","12/12/21"));
        earthquakes.add(new EarthquakeData("Paris","4.4","12/12/21"));

        ListView earthquakeListView= (ListView) findViewById(R.id.list);
     //   ArrayAdapter<String> adapter= new ArrayAdapter<String >( this, android.R.layout.simple_list_item_1, earthquakes);
        //earthquakeListView.setAdapter(adapter);

    }
}
