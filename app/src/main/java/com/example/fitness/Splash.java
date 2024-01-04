package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    ImageView imageView4;
    ImageView imageView5;
    Animation Splash_top, Splash_bottom;

    private final long splashScreenDuration = 5000; // Duration in milliseconds (5 seconds)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);

        Splash_top = AnimationUtils.loadAnimation(this, R.anim.splash_top);
        Splash_bottom = AnimationUtils.loadAnimation(this, R.anim.splash_bottom);

        imageView4.setAnimation(Splash_top);
        imageView5.setAnimation(Splash_bottom);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent dashboardIntent = new Intent(Splash.this, Dashboard.class);
            startActivity(dashboardIntent);
            finish(); // Close the splash screen
        }, splashScreenDuration);
    }
}
