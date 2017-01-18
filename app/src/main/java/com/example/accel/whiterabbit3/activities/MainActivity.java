package com.example.accel.whiterabbit3.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.accel.whiterabbit3.R;
import com.example.accel.whiterabbit3.models.Poi;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("poi");

        String key = myRef.child("poi").push().getKey();

        Poi poi = new Poi( "1",2,3,"1","cat_" + key);
        myRef.child(key).setValue(poi);

        key = myRef.child("poi").push().getKey();
        poi  = new Poi( "1",2,3,"1","cat_" + key);
        myRef.child(key).setValue(poi);
    }
}
