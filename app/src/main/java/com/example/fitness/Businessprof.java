package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.fitness.ui.dashboard.DashboardFragment;

public class Businessprof extends AppCompatActivity {

    public ImageView imageView17;
    public ImageView imageView39;
    public ImageView imageView18;
    public ImageView backD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_businessprof);

        imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Businessprof.this,Pormotion.class);
                startActivity(intent);
            }
        });

        imageView39 = (ImageView) findViewById(R.id.imageView39);
        imageView39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Businessprof.this,Talktous.class);
                startActivity(intent);
            }
        });


        imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Businessprof.this,Details.class);
                startActivity(intent);
            }
        });

        backD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Businessprof.this, Dashboard.class);
                startActivity(intent);
            }});

        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}