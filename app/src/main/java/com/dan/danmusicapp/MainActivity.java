package com.dan.danmusicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dan.danmusicapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
// The app including 4 main screens
// This is theHome screen of the app, which can navigate to other main screens such as search, nowplaying, mymusic
//this screen is aimed to show the trendy music etc...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        using data binding to find and set OnClickListener to Search button in the layout file of this activity
        binding.buttonMainActivitySearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Search Activity
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                //Start the new activity
                startActivity(searchIntent);
            }
        });
//        using data binding to find and set OnClickListener Now Playing button in the layout file of this activity
        binding.buttonMainActivityNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the NowPlaying Activity
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                //Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
        //        using data binding to find and set OnClickListener to My Music button in the layout file of this activity
        binding.buttonMainActivityMyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open My Music Activity
                Intent myMusicIntent = new Intent(MainActivity.this, MyMusicActivity.class);
                //Start the new activity
                startActivity(myMusicIntent);
            }
        });

    }
}

