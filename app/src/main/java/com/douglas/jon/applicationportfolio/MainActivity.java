package com.douglas.jon.applicationportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Button btnSpotifyStreamer;
    private Button btnScoresApp;
    private Button btnLibraryApp;
    private Button btnBuildItBigger;
    private Button btnBaconReader;
    private Button btnCapstoneMyOwnApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpotifyStreamer = (Button) findViewById(R.id.btnSpotifyStreamer);
        btnSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.launch_spotify_streamer, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnScoresApp = (Button) findViewById(R.id.btnScoresApp);
        btnScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.launch_scores_app, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.launch_library_app, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.launch_build_it_bigger, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnBaconReader = (Button) findViewById(R.id.btnBaconReader);
        btnBaconReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.launch_bacon_reader, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnCapstoneMyOwnApp = (Button) findViewById(R.id.btnCapstoneMyOwnApp);
        btnCapstoneMyOwnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.launch_capstone_my_own_app, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
