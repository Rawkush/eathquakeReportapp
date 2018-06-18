package com.example.ankush.eathquakereportapp;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getName();

    private static final String USGS_REQUEST_URL =
            "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&orderby=time&minmag=6&limit=10";

    private EarthquakeAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //using temp dummy data

        ArrayList<EarthquakeData> earthquakes= new ArrayList<>();

        mAdapter = new EarthquakeAdapter(this, new ArrayList<EarthquakeData>());


        ListView earthquakeListView= (ListView) findViewById(R.id.list);
     //   ArrayAdapter<String> adapter= new ArrayAdapter<String >( this, android.R.layout.simple_list_item_1, earthquakes);
        EarthquakeAsyncTask task = new EarthquakeAsyncTask();
        task.execute(USGS_REQUEST_URL);

        earthquakeListView.setAdapter(mAdapter);



    }



    private class EarthquakeAsyncTask extends AsyncTask<String, Void, List<EarthquakeData>> {

        @Override
        protected List<EarthquakeData> doInBackground(String... urls) {
            // Don't perform the request if there are no URLs, or the first URL is null.
            if (urls.length < 1 || urls[0] == null) {
                return null;
            }

            List<EarthquakeData> result = QueryUtils.fetchEarthquakeData(urls[0]);
            return result;
        }


        @Override
        protected void onPostExecute(List<EarthquakeData> data) {
            // Clear the adapter of previous earthquake data
            mAdapter.clear();

            // If there is a valid list of {@link Earthquake}s, then add them to the adapter's
            // data set. This will trigger the ListView to update.
            if (data != null && !data.isEmpty()) {
                mAdapter.addAll(data);
            }
        }
    }
}
