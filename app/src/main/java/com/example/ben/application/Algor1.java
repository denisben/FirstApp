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

public class Algor1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algor1);


            final EditText S1 = (EditText) findViewById(R.id.s1);
            final EditText S2 = (EditText) findViewById(R.id.s2);
            final EditText S3 = (EditText) findViewById(R.id.s3);
            final EditText S4 = (EditText) findViewById(R.id.s4);
            final EditText S5 = (EditText) findViewById(R.id.s5);
            final EditText A1 = (EditText) findViewById(R.id.a1);
            final EditText A2 = (EditText) findViewById(R.id.a2);
            final EditText A3 = (EditText) findViewById(R.id.a3);
            final EditText S7 = (EditText) findViewById(R.id.s7);
            final EditText S8 = (EditText) findViewById(R.id.s8);
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
                    AlertDialog.Builder builder = new AlertDialog.Builder(Algor1.this);

                    View view = LayoutInflater.from(Algor1.this).inflate(R.layout.show_image, null);

                    TextView title = (TextView) view.findViewById(R.id.title);
                    ImageView imageView = (ImageView) view.findViewById(R.id.image);

                    imageView.setImageResource(R.drawable.a1);

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
                    if (S1.getText().toString().equals("Αλγόριθμος Αλγόριθμος1")) {
                    } else {
                        S1.setError("Αλγόριθμος Αλγόριθμος1");

                    }



                    if (A1.getText().toString().equals("Δεδομένα //table//")) {
                    } else {
                        A1.setError("Δεδομένα: table");
                    }


                    if (S2.getText().toString().equals("min<-table[1]")) {
                    } else {
                        S2.setError("min<-table[1]");
                    }

                    if (S3.getText().toString().equals("Για i από 2 μέχρι 10")) {
                    } else {
                        S3.setError("Για i από 2 μέχρι 10");
                    }

                    if (S4.getText().toString().equals("Αν table[i]<min τότε")) {
                    } else {
                        S4.setError("Αν table[i]<min τότε");
                    }


                    if (S7.getText().toString().equals("min<-table[i]")) {
                    } else {
                        S7.setError("min<-table[i]");
                    }


                    if (S8.getText().toString().equals("Τέλος_αν")) {
                    } else {
                        S8.setError("Τέλος_αν");
                    }

                    if (S5.getText().toString().equals("Τέλος_επανάληψης")) {
                    } else {
                        S5.setError("Τέλος_επανάληψης");
                    }


                    if (A2.getText().toString().equals("Τέλος Αλγόριθμος1")) {
                    } else {
                        A2.setError("Τέλος Αλγόριθμος1");
                    }


                }
            });
        }

    public void openNext () {
        Intent intent = new Intent(this, Algor2.class);
        startActivity(intent);
    }


        private void askToClose () {
            AlertDialog.Builder builder = new AlertDialog.Builder(Algor1.this);
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