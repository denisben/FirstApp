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

public class Progr3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progr3);

        final EditText S1 = (EditText) findViewById(R.id.s1);
        final EditText S2 = (EditText) findViewById(R.id.s2);
        final EditText S3 = (EditText) findViewById(R.id.s3);
        final EditText S4 = (EditText) findViewById(R.id.s4);
        final EditText S5 = (EditText) findViewById(R.id.s5);
        final EditText A7 = (EditText) findViewById(R.id.a7);
        final EditText A8 = (EditText) findViewById(R.id.a8);
        final EditText S8 = (EditText) findViewById(R.id.s8);
        final EditText S9 = (EditText) findViewById(R.id.s9);
        final EditText S10 = (EditText) findViewById(R.id.s10);
        final EditText S11 = (EditText) findViewById(R.id.s11);
        final EditText S12 = (EditText) findViewById(R.id.s12);
        final EditText S13 = (EditText) findViewById(R.id.s13);
        final EditText S14 = (EditText) findViewById(R.id.s14);
        final EditText S15 = (EditText) findViewById(R.id.s15);
        final EditText S16 = (EditText) findViewById(R.id.s16);

        final EditText A1 = (EditText) findViewById(R.id.a1);
        final EditText A2 = (EditText) findViewById(R.id.a2);

        final EditText A4 = (EditText) findViewById(R.id.a4);
        final EditText A5 = (EditText) findViewById(R.id.a5);
        final EditText A6 = (EditText) findViewById(R.id.a6);

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
                AlertDialog.Builder builder = new AlertDialog.Builder(Progr3.this);

                View view = LayoutInflater.from(Progr3.this).inflate(R.layout.show_image, null);

                TextView title = (TextView) view.findViewById(R.id.title);
                ImageView imageView = (ImageView) view.findViewById(R.id.image);

                imageView.setImageResource(R.drawable.p3);

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
                if (A1.getText().toString().equals("ΠΡΟΓΡΑΜΜΑ Π3")) {
                } else {
                    A1.setError("ΠΡΟΓΡΑΜΜΑ Π3");

                }

                if (A2.getText().toString().equals("ΜΕΤΑΒΛΗΤΕΣ")) {
                } else {
                    A2.setError("ΜΕΤΑΒΛΗΤΕΣ");
                }

                if (S1.getText().toString().equals("ΠΡΑΓΜΑΤΙΚΕΣ")) {
                } else {
                    S1.setError("ΓΙΑ i απο 1 ΜΕΧΡΙ 10");
                }

                if (S2.getText().toString().equals("ΓΙΑ i απο 1 ΜΕΧΡΙ 10")) {
                } else {
                    S2.setError("ΓΙΑ i απο 1 ΜΕΧΡΙ 10");
                }

                if (S3.getText().toString().equals("ΔΙΑΒΑΣΕ αριθμός")) {
                } else {
                    S3.setError("ΔΙΑΒΑΣΕ αριθμός");
                }
                if (S4.getText().toString().equals("α{i]<-αριθμός")) {
                } else {
                    S4.setError("α[i]<-αριθμός");
                }

                if (S5.getText().toString().equals("ΤΕΟΣ_ΕΠΑΝΑΛΗΨΗΣ")) {
                } else {
                    S5.setError("ΤΕΛΟΣ_ΕΠΑΝΑΛΗΨΗΣ");
                }


                if (A4.getText().toString().equals("ΑΡΧΗ")) {
                } else {
                    A4.setError("ΑΡΧΗ");
                }

                if (A5.getText().toString().equals("ΓΡΑΨΕ 'Δώσε αριθμό'")) {
                } else {
                    A5.setError("ΓΡΑΨΕ 'Δώσε αριθμό'");
                }

                if (A6.getText().toString().equals("ΤΕΛΟΣ_ΠΡΟΓΡΑΜΜΑΤΟΣ")) {
                } else {
                    A6.setError("ΤΕΛΟΣ_ΠΡΟΓΡΑΜΜΑΤΟΣ");
                }

                if (A7.getText().toString().equals("min<-α[1]")) {
                } else {
                    A7.setError("min<-α[1]");
                }


                if (A8.getText().toString().equals("max<-α[1]")) {
                } else {
                    A8.setError("max<-α[1]");
                }

                if (S8.getText().toString().equals("ΓΙΑ i ΑΠΟ 1 ΜΕΧΡΙ 10")) {
                } else {
                    S8.setError("ΓΙΑ i ΑΠΟ 1 ΜΕΧΡΙ 10");
                }

                if (S9.getText().toString().equals("ΑΝ α[i]<min ΤΟΤΕ")) {
                } else {
                    S9.setError("ΑΝ α[i]<min ΤΟΤΕ");
                }

                if (S10.getText().toString().equals("min<-α[i]")) {
                } else {
                    S10.setError("min<-α[i]");
                }

                if (S11.getText().toString().equals("ΤΕΛΟΣ_ΑΝ")) {
                } else {
                    S11.setError("ΤΕΛΟΣ_ΑΝ");
                }

                if (S12.getText().toString().equals("ΑΝ α[i]>max ΤΟΤΕ")) {
                } else {
                    S12.setError("ΑΝ α[i]>max ΤΟΤΕ");
                }

                if (S13.getText().toString().equals("max<-α[i]")) {
                } else {
                    S13.setError("max<-α[i]");
                }

                if (S14.getText().toString().equals("ΤΕΛΟΣ_ΑΝ")) {
                } else {
                    S14.setError("ΤΕΛΟΣ_ΑΝ");
                }

                if (S15.getText().toString().equals("ΤΕΛΟΣ_ΕΠΑΝΑΛΗΨΗΣ")) {
                } else {
                    S15.setError("ΤΕΛΟΣ_ΕΠΑΝΑΛΗΨΗΣ");
                }

                if (S16.getText().toString().equals("ΓΡΑΨΕ min,max")) {
                } else {
                    S16.setError("ΓΡΑΨΕ min,max");
                }


            }

        });

    }
    public void openNext () {
        Intent intent = new Intent(this, Progr3.class);
        startActivity(intent);
    }




}






