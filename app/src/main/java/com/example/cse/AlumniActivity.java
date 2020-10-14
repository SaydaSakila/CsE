package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AlumniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
