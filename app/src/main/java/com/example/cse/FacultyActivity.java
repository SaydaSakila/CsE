package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
