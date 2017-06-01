package com.dan.danmusicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dan.danmusicapp.databinding.ActivitySongsBinding;

public class SongsActivity extends AppCompatActivity {
    //    this is the songs activity, one of 3 subscreens of mymusic screens
//    can navigate to 4 main screens
//    is aimed to show the list of songs name which can be gathered from info inside the mp3 music file in the storage


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySongsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_songs);
        //        using data binding to find and set OnClickListener to Home button in the layout file of this activity
        binding.buttonSongActivityHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Home Activity
                Intent homeIntent = new Intent(SongsActivity.this, MainActivity.class);
                //Start the new activity
                startActivity(homeIntent);
            }
        });
//        using data binding to find and set OnClickListener to Search button in the layout file of this activity
        binding.buttonSongActivitySearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Search Activity
                Intent searchIntent = new Intent(SongsActivity.this, SearchActivity.class);
                //Start the new activity
                startActivity(searchIntent);
            }
        });
//        using data binding to find and set OnClickListener Now Playing button in the layout file of this activity
        binding.buttonSongActivityNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the NowPlaying Activity
                Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                //Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
        //        using data binding to find and set OnClickListener to My Music button in the layout file of this activity
        binding.buttonSongActivityMyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open My Music Activity
                Intent myMusicIntent = new Intent(SongsActivity.this, MyMusicActivity.class);
                //Start the new activity
                startActivity(myMusicIntent);
            }
        });

    }
}
