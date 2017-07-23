package com.dan.danmusicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dan.danmusicapp.databinding.ActivityPaymentBinding;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPaymentBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_payment);

        //using data binding to find and set OnClickListener to Home button in the layout file of this activity
        binding.paymentToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Home Activity
                Intent homeIntent = new Intent(PaymentActivity.this, MainActivity.class);
                //Start the new activity
                startActivity(homeIntent);
            }
        });
        //using data binding to find and set OnClickListener to Search button in the layout file of this activity
        binding.paymentToSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the Search Activity
                Intent searchIntent = new Intent(PaymentActivity.this, SearchActivity.class);
                //Start the new activity
                startActivity(searchIntent);
            }
        });
        //using data binding to find and set OnClickListener Now Playing button in the layout file of this activity
        binding.paymentToPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the NowPlaying Activity
                Intent nowPlayingIntent = new Intent(PaymentActivity.this, NowPlayingActivity.class);
                //Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
        //navigate to the website for more detail instruction about this screen
        binding.buttonPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the url of the website from current news object
                String url = getString(R.string.link_payment);
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
