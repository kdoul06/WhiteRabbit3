package com.example.accel.whiterabbit3.models;

/**
 * Created by accel on 1/18/2017.
 */

public class Poi {


    public String userId;
    public double lat;
    public double lon;
    public String catId;
    public String catDescr;


    public Poi(String userId, double lat, double lon, String catId, String catDescr) {
        this.userId = userId;
        this.lat = lat;
        this.lon = lon;
        this.catId = catId;
        this.catDescr = catDescr;
    }

    public Poi () {

    }

}