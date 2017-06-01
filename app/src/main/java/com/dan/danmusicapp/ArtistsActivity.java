package com.dan.danmusicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dan.danmusicapp.databinding.ActivityArtistsBinding;

public class ArtistsActivity extends AppCompatActivity {
    //    this is the artists activity, one of the subscreens of mymusic screens
//    can navigate to 4 main screens
//    is aimed to show the list of artists name which can be gathered from the info inside mp3 music file in the storage


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityArtistsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_artists);
        //        using data binding to find and set OnClickListener to Home button in the layout file of this activity
        binding.buttonArtistsActivityHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Home Activity
                Intent homeIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                //Start the new activity
                startActivity(homeIntent);
            }
        });
//        using data binding to find and set OnClickListener to Search button in the layout file of this activity
        binding.buttonArtistsActivitySearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Search Activity
                Intent searchIntent = new Intent(ArtistsActivity.this, SearchActivity.class);
                //Start the new activity
                startActivity(searchIntent);
            }
        });
//        using data binding to find and set OnClickListener Now Playing button in the layout file of this activity
        binding.buttonArtistsActivityNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the NowPlaying Activity
                Intent nowPlayingIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                //Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
        //        using data binding to find and set OnClickListener to My Music button in the layout file of this activity
        binding.buttonArtistsActivityMyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open My Music Activity
                Intent myMusicIntent = new Intent(ArtistsActivity.this, MyMusicActivity.class);
                //Start the new activity
                startActivity(myMusicIntent);
            }
        });

    }
}