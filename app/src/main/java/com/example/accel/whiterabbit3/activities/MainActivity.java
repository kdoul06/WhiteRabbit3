package com.example.accel.whiterabbit3.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.accel.whiterabbit3.R;
import com.example.accel.whiterabbit3.models.GeoLocation;
import com.example.accel.whiterabbit3.models.Poi;
import com.google.android.gms.vision.text.Text;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef;
    EditText emailTxt;
    TextView lonTxt, latTxt, catTxt;
    public int text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("poi");

//        emailTxt = (EditText) findViewById(R.id.userEmailTxt);
        lonTxt = (TextView) findViewById(R.id.lonTxt);
        latTxt = (TextView) findViewById(R.id.latTxt);
        catTxt = (TextView) findViewById(R.id.catTxt);

    }

    public void onReadBtnClick(View view){

    }

    public void onWritePoiBtnClick(View view){
        // Write POI to the database
        String key = myRef.child("poi").push().getKey();

        GeoLocation loc = new GeoLocation(Double.parseDouble(lonTxt.getText().toString()),Double.parseDouble(latTxt.getText().toString()));


        Poi poi = new Poi("1",loc,"1",catTxt.getText().toString());

        myRef.child(key).setValue(poi);

    }

    public void onWriteUserBtnClick(View view){

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;


        Toast toast = Toast.makeText(context, lonTxt.getText().toString(),duration);
        toast.show();





    }

}
