package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Talktous extends AppCompatActivity {

    public ImageView imageView38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talktous);

        imageView38 = (ImageView) findViewById(R.id.imageView38);
        imageView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Talktous.this,Businessprof.class);
                startActivity(intent);

            }
        });

    }
}