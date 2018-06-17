package com.example.ankush.eathquakereportapp;

public class EarthquakeData {

    private String mLocation;
    private String mMagnitude;
    private String mDate;

    EarthquakeData(String Location, String Magnitude, String date){
        mLocation=Location;
        mMagnitude=Magnitude;
        mDate=date;
    }

    public String getDate(){
        return mDate;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

}
