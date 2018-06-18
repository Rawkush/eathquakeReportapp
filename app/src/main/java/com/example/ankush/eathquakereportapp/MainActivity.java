package com.example.ankush.eathquakereportapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String USGS_REQUEST_URL =
            "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&orderby=time&minmag=6&limit=10";

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



    private class EarthquakeAsyncTask extends AsyncTask<String, Void, List<EarthquakeData>> {

        @Override
        protected List<EarthquakeData> doInBackground(String... urls) {

        }

        @Override
        protected void onPostExecute(List<EarthquakeData> data) {

        }
    }
}
