package com.example.ankush.eathquakereportapp;

public class EarthquakeData {

    private String mLocation;
    private String mMagnitude;
    private long timeInMilliSeconds;

    EarthquakeData(String Location, String Magnitude, long timeInMilliSeconds){
        mLocation=Location;
        mMagnitude=Magnitude;
        this.timeInMilliSeconds=timeInMilliSeconds;
    }

    public long getTimeInMilliSeconds(){
        return timeInMilliSeconds;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

}
