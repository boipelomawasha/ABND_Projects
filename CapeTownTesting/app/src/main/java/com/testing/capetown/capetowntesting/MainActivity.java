package com.testing.capetown.capetowntesting;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    String getUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Slack imageButton
        ImageButton imageButtonSlack = (ImageButton)findViewById(R.id.slack);
        // When clicked, this imageButton will start a new intent to open the browser
        imageButtonSlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUrl = getString(R.string.slack);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getUrl));
                startActivity(browserIntent);
            }
        });

        //Get Meetup imageButton
        ImageButton imageButtonMeetup = (ImageButton)findViewById(R.id.meetup);
        // When clicked, this imageButton will start a new intent to open the browser
        imageButtonMeetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUrl = getString(R.string.meetup);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getUrl));
                startActivity(browserIntent);
            }
        });

        //Get Twitter imageButton
        ImageButton imageButtonTwitter = (ImageButton)findViewById(R.id.twitter);
        // When clicked, this imageButton will start a new intent to open the browser
        imageButtonTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUrl = getString(R.string.twitter);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getUrl));
                startActivity(browserIntent);
            }
        });

        //Get YouTube imageButton
        ImageButton imageButtonYoutube = (ImageButton)findViewById(R.id.youtube);
        // When clicked, this imageButton will start a new intent to open the browser
        imageButtonYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUrl = getString(R.string.youtube);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getUrl));
                startActivity(browserIntent);
            }
        });

        //Get Github imageButton
        ImageButton imageButtonGithub = (ImageButton)findViewById(R.id.github);
        // When clicked, this imageButton will start a new intent to open the browser
        imageButtonGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUrl = getString(R.string.github);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getUrl));
                startActivity(browserIntent);
            }
        });
    }


}
