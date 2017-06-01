package com.dan.danmusicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dan.danmusicapp.databinding.ActivityArtistsBinding;
import com.dan.danmusicapp.databinding.ActivityNowPlayingBinding;

public class NowPlayingActivity extends AppCompatActivity {
//Now playing screen is one of the 4 main screens, which can navigate to other 3 main ones.
//    Now playing screen is aimed to show the status of the song is playing, allow to stop the songs etc...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityNowPlayingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_now_playing);
        //        using data binding to find and set OnClickListener to Home button in the layout file of this activity
        binding.buttonNowPlayingActivityHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Home Activity
                Intent homeIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                //Start the new activity
                startActivity(homeIntent);
            }
        });
//        using data binding to find and set OnClickListener to Search button in the layout file of this activity
        binding.buttonNowPlayingActivitySearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Search Activity
                Intent searchIntent = new Intent(NowPlayingActivity.this, SearchActivity.class);
                //Start the new activity
                startActivity(searchIntent);
            }
        });
        //        using data binding to find and set OnClickListener to My Music button in the layout file of this activity
        binding.buttonNowPlayingActivityMyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open My Music Activity
                Intent myMusicIntent = new Intent(NowPlayingActivity.this, MyMusicActivity.class);
                //Start the new activity
                startActivity(myMusicIntent);
            }
        });

    }
}

