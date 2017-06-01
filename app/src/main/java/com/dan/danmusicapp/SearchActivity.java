package com.dan.danmusicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dan.danmusicapp.databinding.ActivityAlbumsBinding;
import com.dan.danmusicapp.databinding.ActivitySearchBinding;

public class SearchActivity extends AppCompatActivity {
//    Search screen is one of 4 main screens, which can navigate to 3 other main screens including the home screens
//    The main function of the search screen is to search the songs, artists, etc... It allows users
//    to type using the EditText. Proper functions will further establish later!!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySearchBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_search);
        //        using data binding to find and set OnClickListener to Home button in the layout file of this activity
        binding.buttonSearchActivityHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Home Activity
                Intent homeIntent = new Intent(SearchActivity.this, MainActivity.class);
                //Start the new activity
                startActivity(homeIntent);
            }
        });
//        using data binding to find and set OnClickListener Now Playing button in the layout file of this activity
        binding.buttonSearchActivityNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the NowPlaying Activity
                Intent nowPlayingIntent = new Intent(SearchActivity.this, NowPlayingActivity.class);
                //Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
        //        using data binding to find and set OnClickListener to My Music button in the layout file of this activity
        binding.buttonSearchActivityMyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open My Music Activity
                Intent myMusicIntent = new Intent(SearchActivity.this, MyMusicActivity.class);
                //Start the new activity
                startActivity(myMusicIntent);
            }
        });

    }
}

