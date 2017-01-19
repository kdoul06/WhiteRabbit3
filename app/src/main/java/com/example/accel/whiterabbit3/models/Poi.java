package com.example.accel.whiterabbit3.models;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by accel on 1/18/2017.
 */

public class Poi {


    public String userId;
    public LatLng location;
    public String catId;
    public String catDescr;


    public Poi(String userId, LatLng location, String catId, String catDescr) {
        this.userId = userId;
        this.location = location;
        this.catId = catId;
        this.catDescr = catDescr;
    }

    public Poi () {

    }

}