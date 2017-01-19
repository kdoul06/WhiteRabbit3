package com.example.accel.whiterabbit3.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.accel.whiterabbit3.R;
import com.example.accel.whiterabbit3.models.Poi;
import com.example.accel.whiterabbit3.models.Users;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("poi");

    }

    public void onReadBtnClick(View view){

    }

    public void onWritePoiBtnClick(View view){
        // Write POI to the database
        String key1 = myRef.child("poi").push().getKey();
        String key2 = myRef.child("fav").push().getKey();

        Poi poi = new Poi( "1",2,3,"1","cat");
//        myRef.child(key1).setValue(poi);
        myRef.child(key2).setValue(poi);
//        String keyFav = database.getReference("fav").push().getKey();
        database.getReference("fav").child(key1).setValue(poi);
        database.getReference("fav").child(key2).setValue("tra la la");

//        key = myRef.child("poi").push().getKey();
//        poi  = new Poi( "1",2,3,"1","cat_" + key);
//        myRef.child(key).setValue(poi);

    }

    public void onWriteUserBtnClick(View view){

        String userKey = myRef.child("Users").push().getKey();

        myRef.child("Users").setValue(new Users(R.layout.activity_main.))
        String usersEmail = view.w




    }

}
