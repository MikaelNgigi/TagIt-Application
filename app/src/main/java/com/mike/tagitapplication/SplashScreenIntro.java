package com.mike.tagitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreenIntro extends AppCompatActivity {
    ImageView logo;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_intro);

        logo = findViewById(R.id.tag_it_logo);
        lottieAnimationView = findViewById(R.id.target_splash);

        logo.animate().translationY(-1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1600).setDuration(500).setStartDelay(4000);
    }
}