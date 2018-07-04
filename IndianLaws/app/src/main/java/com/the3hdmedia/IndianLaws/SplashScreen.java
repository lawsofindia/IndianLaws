package com.the3hdmedia.IndianLaws;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable()
        {
            public void run()
            {
                Intent homeIntent = new Intent(SplashScreen.this,HomeActivity.class);
                startActivity(homeIntent);
                finish();

            }

        },SPLASH_TIME_OUT);


    }

    }

