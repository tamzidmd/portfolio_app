/**
 * Copyright (C) 2015 Tamzid Mahmood
 */

package com.tamzid.android.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Manages core logic for button presses in the layout
 */

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        Button spotifyStreamer = (Button) findViewById(R.id.spotify_streamer_button);
        spotifyStreamer.setOnClickListener(launchApp);

        Button scoresApp = (Button) findViewById(R.id.scores_app_button);
        scoresApp.setOnClickListener(launchApp);

        Button libraryApp = (Button) findViewById(R.id.library_app_button);
        libraryApp.setOnClickListener(launchApp);

        Button buildItBigger = (Button) findViewById(R.id.build_it_bigger_button);
        buildItBigger.setOnClickListener(launchApp);

        Button xyzReader = (Button) findViewById(R.id.xyz_reader_button);
        xyzReader.setOnClickListener(launchApp);

        Button capstone = (Button) findViewById(R.id.capstone_button);
        capstone.setOnClickListener(launchApp);

    }

    /**
     * Finds button text value and passes it to a Toast
     */
    private View.OnClickListener launchApp = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button button = (Button) v;
            toastMessage(button.getText().toString());
        }
    };

    /**
     * Displays a Toast with the passed message
     */
    private void toastMessage(String message) {
        Toast.makeText(this, "This button will launch: " + message, Toast.LENGTH_SHORT).show();
    }

}
