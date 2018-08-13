package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create image view
        ImageView profile_picture = (ImageView) findViewById(R.id.profile_picture);


        //Create text views
        TextView name = (TextView) findViewById(R.id.name);
        TextView birthday = (TextView) findViewById(R.id.birthday);
        TextView country = (TextView) findViewById(R.id.country);

        //Set text values
        name.setText("Fred");
        birthday.setText("4 January 1991");
        country.setText("South Africa");

        //Set image value
        profile_picture.setImageResource(R.drawable.userprofile);
    }
}
