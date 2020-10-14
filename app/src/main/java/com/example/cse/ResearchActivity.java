package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResearchActivity extends AppCompatActivity {
private Button button30,button31,button32,button20,button21,button23,button22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button30 = findViewById(R.id.btn30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage= Uri.parse("http://ijeecs.iaescore.com/index.php/IJEECS/article/view/16734");
                Intent webIntent = new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(webIntent);
            }
        });
        button31 = findViewById(R.id.btn31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage= Uri.parse("https://ieeexplore.ieee.org/document/7912872");
                Intent webIntent = new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(webIntent);
            }
        });
        button32 = findViewById(R.id.btn32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage= Uri.parse("http://iubat.edu/journal/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(webIntent);
            }
        });
        button20 = findViewById(R.id.btn20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(ResearchActivity.this,LaboratoriesActivity.class);
                startActivity(hp);
            }
        });

        button21 = findViewById(R.id.btn21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(ResearchActivity.this,CareerActivity.class);
                startActivity(hp);
            }
        });
        button23 = findViewById(R.id.btn23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(ResearchActivity.this,SocietyActivity.class);
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
