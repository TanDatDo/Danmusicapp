package com.dan.danmusicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dan.danmusicapp.databinding.ActivityArtistsBinding;
import com.dan.danmusicapp.databinding.ActivityMyMusicBinding;

public class MyMusicActivity extends AppCompatActivity {
//    My Music is one of the 4 main screens, which can navigate to three other main screens
//    the main functions is to allow users to explore the music library
//    The screen contains 3 buttons which are songs, artists, and albums and allows user to navigate to
//    those screens by pressing the button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMyMusicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_my_music);

        //        using data binding to find and set OnClickListener to Song button in the layout file of this activity
        binding.buttonMyMusicActivitySongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Song Activity
                Intent homeIntent = new Intent(MyMusicActivity.this, SongsActivity.class);
                //Start the new activity
                startActivity(homeIntent);
            }
        });
        //        using data binding to find and set OnClickListener to Artist button in the layout file of this activity
        binding.buttonMyMusicActivityArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Artist Activity
                Intent homeIntent = new Intent(MyMusicActivity.this, ArtistsActivity.class);
                //Start the new activity
                startActivity(homeIntent);
            }
        });
        //        using data binding to find and set OnClickListener to Albums button in the layout file of this activity
        binding.buttonMyMusicActivityAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Album Activity
                Intent homeIntent = new Intent(MyMusicActivity.this, AlbumsActivity.class);
                //Start the new activity
                startActivity(homeIntent);
            }
        });
        //        using data binding to find and set OnClickListener to Home button in the layout file of this activity
        binding.buttonMyMusicActivityHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Home Activity
                Intent homeIntent = new Intent(MyMusicActivity.this, MainActivity.class);
                //Start the new activity
                startActivity(homeIntent);
            }
        });
//        using data binding to find and set OnClickListener to Search button in the layout file of this activity
        binding.buttonMyMusicActivitySearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Search Activity
                Intent searchIntent = new Intent(MyMusicActivity.this, SearchActivity.class);
                //Start the new activity
                startActivity(searchIntent);
            }
        });
//        using data binding to find and set OnClickListener Now Playing button in the layout file of this activity
        binding.buttonMyMusicActivityNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the NowPlaying Activity
                Intent nowPlayingIntent = new Intent(MyMusicActivity.this, NowPlayingActivity.class);
                //Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }
}
