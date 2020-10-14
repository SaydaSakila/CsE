package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgramActivity extends AppCompatActivity {
    private Button button20, button21,button23,button22,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button20 = findViewById(R.id.btn20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(ProgramActivity.this,LaboratoriesActivity.class);
                startActivity(hp);
            }
        });

        button21 = findViewById(R.id.btn21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(ProgramActivity.this,CareerActivity.class);
                startActivity(hp);
            }
        });
        button23 = findViewById(R.id.btn23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(ProgramActivity.this,SocietyActivity.class);
                startActivity(hp);
            }
        });
        button22 = findViewById(R.id.btn22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage= Uri.parse("http://iubat.edu/student/tuition-and-fees/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(webIntent);
            }
        });

    }
}
