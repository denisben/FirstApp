package com.example.ben.application;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Algor4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algor4);

        final EditText A4 = (EditText) findViewById(R.id.a4);
        final EditText S2 = (EditText) findViewById(R.id.s2);
        final EditText S20 = (EditText) findViewById(R.id.s20);
        final EditText S3 = (EditText) findViewById(R.id.s3);
        final EditText S4 = (EditText) findViewById(R.id.s4);
        final EditText S5 = (EditText) findViewById(R.id.s5);
        final EditText S6 = (EditText) findViewById(R.id.s6);
        final EditText S7 = (EditText) findViewById(R.id.s7);
        final EditText S8 = (EditText) findViewById(R.id.s8);
        final EditText S9 = (EditText) findViewById(R.id.s9);
        final EditText A1 = (EditText) findViewById(R.id.a1);
        final EditText A2 = (EditText) findViewById(R.id.a2);
        final EditText A3 = (EditText) findViewById(R.id.a3);


        Button B1 = (Button) findViewById(R.id.config);
        Button B2 = (Button) findViewById(R.id.show);
        Button B3 = (Button) findViewById(R.id.next);
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNext();

            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Algor4.this);

                View view = LayoutInflater.from(Algor4.this).inflate(R.layout.show_image, null);

                TextView title = (TextView) view.findViewById(R.id.title);
                ImageView imageView = (ImageView) view.findViewById(R.id.image);

                imageView.setImageResource(R.drawable.a4);

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setView(view);
                builder.show();

            }
        });


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (A1.getText().toString().equals("Για i από 1 μέχρι 10")) {
                } else {
                    A1.setError("Για i από 1 μέχρι 10");
                }
                if (A2.getText().toString().equals("  Αν a[i-1]>a[i] τότε")) {
                } else {
                    A2.setError("  Αν a[i-1]>a[i] τότε");
                }
                if (A3.getText().toString().equals(" Τέλος_επανάληψης")) {
                } else {
                    A3.setError(" Τέλος_επανάληψης");
                }

                if (A4.getText().toString().equals("Αλγόριθμος Αλγόριθμος4")) {
                } else {
                    A4.setError("Αλγόριθμος Αλγόριθμος4");

                }

                if (S2.getText().toString().equals("Δεδομένα //a[10]//")) {
                } else {
                    S2.setError("Δεδομένα //a[10]////");
                }
                if (S20.getText().toString().equals("temp<-0")) {
                } else {
                    S20.setError("temp<-0");
                }


                if (S3.getText().toString().equals(" Για j από 10 μέχρι 1 με βήμα -1")) {
                } else {
                    S3.setError(" Για j από 10 μέχρι 1 με βήμα -1");
                }

                if (S4.getText().toString().equals("   temp<-a[j-1]")) {
                } else {
                    S4.setError("   temp<-a[j-1]");
                }


                if (S5.getText().toString().equals("   a[j-1]<-a[j]")) {
                } else {
                    S5.setError("   a[j-1]<-a[j]");
                }


                if (S6.getText().toString().equals("   a[j]<-temp")) {
                } else {
                    S6.setError("   a[j]<-temp");
                }

                if (S7.getText().toString().equals("  Τέλος_αν")) {
                } else {
                    S7.setError("  Τέλος_αν");
                }

                if (S8.getText().toString().equals("Τέλος_επανάληψης")) {
                } else {
                    S8.setError("Τέλος_επανάληψης");
                }

                if (S9.getText().toString().equals("Τέλος Αλγόριθμος4")) {
                } else {
                    S9.setError("Τέλος Αλγόριθμος4");
                }
                }
        });
    }

    public void openNext () {
        Intent intent = new Intent(this, Algor5.class);
        startActivity(intent);
    }


    private void askToClose () {
        AlertDialog.Builder builder = new AlertDialog.Builder(Algor4.this);
        builder.setMessage("Are you sure you want to quit?");
        builder.setCancelable(true);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

                finish();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }


}

