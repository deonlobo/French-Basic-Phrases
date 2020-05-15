package com.deonlobo.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){

        int id = view.getId();
        String ourid="";
        ourid=view.getResources().getResourceEntryName(id);

        int resourcesId = getResources().getIdentifier(ourid , "raw" , "com.deonlobo.basicphrases");

        MediaPlayer mplayer = MediaPlayer.create(this, resourcesId);
        mplayer.start();

        Log.i("Button Tapped",ourid);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
