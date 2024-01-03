package com.example.fitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Booking extends AppCompatActivity {

    public Button button2;

    CalendarView calendarView;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        button2 = (Button)  findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Booking.this,Confirmed.class);
                startActivity(intent);
            }
        });



        Spinner spinner = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);


        String[] duration = {"5 minutes", "10 minutes", "15 minutes"};
        String[] sessiontype = {"Cardio", "Strength Training", "Flexibility", "Balance", "HIIT"};


        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, duration);
        ArrayAdapter<String> spinner2Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sessiontype);


        spinner.setAdapter(spinnerAdapter);
        spinner2.setAdapter(spinner2Adapter);

        calendarView = (CalendarView)
                findViewById(R.id.calendarView);
        textView4 = (TextView)
                findViewById(R.id.textView4);
        calendarView
                .setOnDateChangeListener(
                        new  CalendarView
                                .OnDateChangeListener() {
                            @Override

                            public void onSelectedDayChange(
                                    @NonNull CalendarView view,
                                    int year,
                                    int month,
                                    int dayOfMonth)
                            {
                                String Date
                                        = dayOfMonth + "-"
                                        +(month + 1) + "-" + year;
                                textView4.setText(Date);
                            }
                        }
                );


    }
}