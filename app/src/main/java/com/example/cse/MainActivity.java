package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

import android.view.View;

import android.widget.Button;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2,button3,button4,button5,button6,button7, button8,button9,button10,
            button11,button12,button13,button14,button15,button16,button17,button18,buttonahaqsir,buttonukd,buttonehtesamulhaq,button19,button20,
            button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,
            button31,button32,button33,button34,button35,button36,button37,button38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fp=new Intent(MainActivity.this,NewsActivity.class);
                startActivity(fp);
            }
        });
        button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,ResearchActivity.class);
                startActivity(hp);
            }
        });

        button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dp = new Intent(MainActivity.this,EventActivity.class);
                startActivity(dp);
            }
        });
        button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ep = new Intent(MainActivity.this,ProgramActivity.class);
                startActivity(ep);
            }
        });
        button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gp = new Intent(MainActivity.this,CurriculumActivity.class);
                startActivity(gp);
            }
        });

        button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,AdmissionActivity.class);
                startActivity(hp);
            }
        });
        button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,StudentActivity.class);
                startActivity(hp);
            }
        });
        button8 = findViewById(R.id.btn8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,FacultyActivity.class);
                startActivity(hp);
            }
        });
        button9 = findViewById(R.id.btn9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,AlumniActivity.class);
                startActivity(hp);
            }
        });
        button10 = findViewById(R.id.btn10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(hp);
            }
        });
        button11 = findViewById(R.id.btn11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,FacultyActivity.class);
                startActivity(hp);
            }
        });
        button12 = findViewById(R.id.btn12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,StudentActivity.class);
                startActivity(hp);
            }
        });
        button13 = findViewById(R.id.btn13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,LaboratoriesActivity.class);
                startActivity(hp);
            }
        });
        button14 = findViewById(R.id.btn14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ep = new Intent(MainActivity.this,ProgramActivity.class);
                startActivity(ep);
            }
        });
        button15 = findViewById(R.id.btn15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ep = new Intent(MainActivity.this,ProgramActivity.class);
                startActivity(ep);
            }
        });
        button16 = findViewById(R.id.btn16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ep = new Intent(MainActivity.this,ProgramActivity.class);
                startActivity(ep);
            }
        });
        button17 = findViewById(R.id.btn17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ep = new Intent(MainActivity.this,ProgramActivity.class);
                startActivity(ep);
            }
        });
        button18 = findViewById(R.id.btnf18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,FacultyActivity.class);
                startActivity(hp);
            }
        });
        button19 = findViewById(R.id.btn19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,LaboratoriesActivity.class);
                startActivity(hp);
            }
        });
        buttonahaqsir = findViewById(R.id.btnahaquesir);
        buttonahaqsir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,FacultyActivity.class);
                startActivity(hp);
            }
        });
        buttonukd = findViewById(R.id.btnukdsir);
        buttonukd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,FacultyActivity.class);
                startActivity(hp);
            }
        });
        buttonehtesamulhaq = findViewById(R.id.btnehtsmhqsir);
        buttonehtesamulhaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,FacultyActivity.class);
                startActivity(hp);
            }
        });

        button20 = findViewById(R.id.btn20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,LaboratoriesActivity.class);
                startActivity(hp);
            }
        });

        button21 = findViewById(R.id.btn21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,CareerActivity.class);
                startActivity(hp);
            }
        });
        button23 = findViewById(R.id.btn23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hp = new Intent(MainActivity.this,SocietyActivity.class);
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
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setMessage("Do You Want To Exit The App?");
        builder.setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Dialog dialogInterface = null;
                        dialogInterface.cancel();

                    }
                });
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
    }
}
