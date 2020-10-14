package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdmissionActivity extends AppCompatActivity {
private Button button20,button36;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button36 = findViewById(R.id.btn36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage= Uri.parse("http://iubat.edu/admission/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(webIntent);
            }
        });
        button20 = findViewById(R.id.btn20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(AdmissionActivity.this,LaboratoriesActivity.class);
                startActivity(hp);
            }
        });
    }
}
