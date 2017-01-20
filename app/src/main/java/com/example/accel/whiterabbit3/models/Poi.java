package com.example.accel.whiterabbit3.models;

/**
 * Created by accel on 1/18/2017.
 */

public class Poi {


    public String userId;
    public double lon;
    public double lat;
    public String catId;
    public String catDescr;


    public Poi(String userId, double lon, double lat, String catId, String catDescr) {
        this.userId = userId;
        this.lon = lon;
        this.lat = lat;
        this.catId = catId;
        this.catDescr = catDescr;
    }

    public Poi () {

    }

}