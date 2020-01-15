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

public class Progr1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progr1);



        final EditText S1 = (EditText) findViewById(R.id.s1);
        final EditText S2 = (EditText) findViewById(R.id.s2);
        final EditText S3 = (EditText) findViewById(R.id.s3);
        final EditText S4 = (EditText) findViewById(R.id.s4);
        final EditText S5 = (EditText) findViewById(R.id.s5);
        final EditText S6 = (EditText) findViewById(R.id.s6);
        final EditText S7 = (EditText) findViewById(R.id.s7);
        final EditText S8 = (EditText) findViewById(R.id.s8);
        final EditText S9 = (EditText) findViewById(R.id.s9);
        final EditText S10 = (EditText) findViewById(R.id.s10);
        final EditText S11 = (EditText) findViewById(R.id.s11);
        final EditText A1 = (EditText) findViewById(R.id.a1);
        final EditText A2 = (EditText) findViewById(R.id.a2);
        final EditText A3 = (EditText) findViewById(R.id.a3);
        final EditText A4 = (EditText) findViewById(R.id.a4);
        final EditText A5 = (EditText) findViewById(R.id.a5);
        final EditText A6 = (EditText) findViewById(R.id.a6);
        final EditText A7 = (EditText) findViewById(R.id.a7);
        final EditText A8 = (EditText) findViewById(R.id.a8);
        final EditText A9 = (EditText) findViewById(R.id.a9);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(Progr1.this);

                View view = LayoutInflater.from(Progr1.this).inflate(R.layout.show_image, null);

                TextView title = (TextView) view.findViewById(R.id.title);
                ImageView imageView = (ImageView) view.findViewById(R.id.image);

                imageView.setImageResource(R.drawable.p1);

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
                if (A1.getText().toString().equals("ΠΡΟΓΡΑΜΜΑ Π1")) {
                } else {
                    A1.setError("ΠΡΟΓΡΑΜΜΑ Π1");

                }

                if (A2.getText().toString().equals("ΣΤΑΘΕΡΕΣ")) {
                } else {
                    A2.setError("ΣΤΑΘΕΡΕΣ");
                }

                if (S1.getText().toString().equals("ΦΠΑ=0")) {
                } else {
                    S1.setError("ΦΠΑ=0");
                }

                if (A3.getText().toString().equals("ΜΕΤΑΒΛΗΤΕΣ")) {
                } else {
                    A3.setError("ΜΕΤΑΒΛΗΤΕΣ");
                }

                if (S2.getText().toString().equals("ΧΑΡΑΚΤΗΡΕΣ")) {
                } else {
                    S2.setError("ΧΑΡΑΚΤΗΡΕΣ");
                }
                if (S3.getText().toString().equals("ΑΚΕΡΑΙΕΣ")) {
                } else {
                    S3.setError("ΑΚΕΡΑΙΕΣ");
                }

                if (S4.getText().toString().equals("ΠΡΑΓΜΑΤΙΚΕΣ")) {
                } else {
                    S4.setError("ΠΡΑΓΜΑΤΙΚΕΣ");
                }

                if (A4.getText().toString().equals("ΑΡΧΗ")) {
                } else {
                    A4.setError("ΑΡΧΗ");
                }

                if (A5.getText().toString().equals("ΓΡΑΨΕ 'Δώσε προϊόν'")) {
                } else {
                    A5.setError("ΓΡΑΨΕ 'Δώσε προϊόν'");
                }

                if (S5.getText().toString().equals("ΔΙΑΒΑΣΕ προϊόν")) {
                } else {
                    S5.setError("ΔΙΑΒΑΣΕ προϊόν");
                }

                if (A6.getText().toString().equals("ΓΡΑΨΕ 'Δώσε Ποσότητα'")) {
                } else {
                    A6.setError("ΓΡΑΨΕ 'Δώσε Ποσότητα'");
                }

                if (S6.getText().toString().equals("ΔΙΑΒΑΣΕ Ποσότητα")) {
                } else {
                    S6.setError("ΔΙΑΒΑΣΕ Ποσότητα");
                }

                if (A7.getText().toString().equals("ΓΡΑΨΕ 'Δώσε τιμή'")) {
                } else {
                    A7.setError("ΓΡΑΨΕ 'Δώσε τιμή'");
                }

                if (S7.getText().toString().equals("ΔΙΑΒΑΣΕ Τιμή")) {
                } else {
                    S7.setError("ΔΙΑΒΑΣΕ Τιμή");
                }

                if (S8.getText().toString().equals("Κόστος")) {
                } else {
                    S8.setError("Κόστος");
                }

                if (S9.getText().toString().equals("Αξία_ΦΠΑ<-Κόστος*ΦΠΑ")) {
                } else {
                    S9.setError("Αξία_ΦΠΑ<-Κόστος*ΦΠΑ");
                }

                if (S10.getText().toString().equals("Συνολικό_Κόστος<-Κόστος+Αξία_ΦΠΑ")) {
                } else {
                    S10.setError("Συνολικό_Κόστος<-Κόστος+Αξία_ΦΠΑ");
                }

                if (A8.getText().toString().equals("ΓΡΑΨΕ ‘Το Κόστος του/της‘, Προϊόν")) {
                } else {
                    A8.setError("ΓΡΑΨΕ ‘Το Κόστος του/της‘, Προϊόν");
                }

                if (S11.getText().toString().equals("ΓΡΑΨΕ 'Είναι', Συνολικό_Κόστος")) {
                } else {
                    S11.setError("ΓΡΑΨΕ 'Είναι', Συνολικό_Κόστος");
                }

                if (A9.getText().toString().equals("ΤΕΛΟΣ_Π1")) {
                } else {
                    A9.setError("ΤΕΛΟΣ_Π1");

                }


            }

        });
    }

    public void openNext () {
        Intent intent = new Intent(this, Progr2.class);
        startActivity(intent);
    }

    public void clickExit(View view) {
        askToClose();
    }




    @Override
    public void onBackPressed() {
        askToClose();
    }



    private void askToClose (){
        AlertDialog.Builder builder = new AlertDialog.Builder(Progr1.this);
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









