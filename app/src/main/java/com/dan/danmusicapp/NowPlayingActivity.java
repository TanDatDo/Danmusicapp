package com.dan.danmusicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dan.danmusicapp.databinding.ActivityNowPlayingBinding;

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityNowPlayingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_now_playing);
        //using data binding to find and set OnClickListener to Home button in the layout file of this activity
        binding.playingToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Home Activity
                Intent homeIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                //Start the new activity
                startActivity(homeIntent);
            }
        });
        //using data binding to find and set OnClickListener to Search button in the layout file of this activity
        binding.playingToSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Search Activity
                Intent searchIntent = new Intent(NowPlayingActivity.this, SearchActivity.class);
                //Start the new activity
                startActivity(searchIntent);
            }
        });
        //        using data binding to find and set OnClickListener to My Music button in the layout file of this activity
        binding.playingToPaymnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open My Music Activity
                Intent myMusicIntent = new Intent(NowPlayingActivity.this, PaymentActivity.class);
                //Start the new activity
                startActivity(myMusicIntent);
            }
        });
        //navigate to the website for more detail instruction about this screen
        binding.buttonPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the url of the website from current news object
                String url = getString(R.string.link_play_music);
                //sent intent to the website
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                //check if there is available web-browser to implement the intent
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }
}

