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

public class Algor3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algor3);

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
        final EditText S12 = (EditText) findViewById(R.id.s12);

        final EditText A1 = (EditText) findViewById(R.id.a1);
        final EditText A2 = (EditText) findViewById(R.id.a2);
        final EditText A3 = (EditText) findViewById(R.id.a3);
        final EditText A4 = (EditText) findViewById(R.id.a4);

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
                AlertDialog.Builder builder = new AlertDialog.Builder(Algor3.this);

                View view = LayoutInflater.from(Algor3.this).inflate(R.layout.show_image, null);

                TextView title = (TextView) view.findViewById(R.id.title);
                ImageView imageView = (ImageView) view.findViewById(R.id.image);

                imageView.setImageResource(R.drawable.a3);

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


                if (A1.getText().toString().equals("Δεδομένα: // //")) {
                } else {
                    A1.setError("Δεδομένα: // //");
                }

                if (A2.getText().toString().equals("Γράψε ‘Δώσε θετικό αριθμό μικρότερο του 20’")) {
                } else {
                    A2.setError("Γράψε ‘Δώσε θετικό αριθμό μικρότερο του 20’");
                }
                if (A3.getText().toString().equals("Τέλος_επανάληψης")) {
                } else {
                    A3.setError("Τέλος_επανάληψης");
                }
                if (A4.getText().toString().equals("Τέλος_αν")) {
                } else {
                    A4.setError("Τέλος_αν");
                }

                if (S1.getText().toString().equals("Αλγόριθμος Αλγόριθμος3")) {
                } else {
                    S1.setError("Αλγόριθμος Αλγόριθμος3");

                }

                if (S2.getText().toString().equals("Διάβασε αριθμός")) {
                } else {
                    S2.setError("Διάβασε αριθμός");
                }

                if (S3.getText().toString().equals("Οσο αριθμός<0 και αριθμός>20 επανέλαβε")) {
                } else {
                    S3.setError("Οσο αριθμός<0 και αριθμός>20 επανέλαβε");
                }

                if (S4.getText().toString().equals(" Γράψε ‘Ξανά δώσε σωστό αριθμό’")) {
                } else {
                    S4.setError(" Γράψε ‘Ξανά δώσε σωστό αριθμό’");
                }


                if (S5.getText().toString().equals(" Διάβασε αριθμός")) {
                } else {
                    S5.setError(" Διάβασε αριθμός");
                }


                if (S6.getText().toString().equals("Αν αριθμόςmod2=0 τότε")) {
                } else {
                    S6.setError("Αν αριθμόςmod2=0 τότε");
                }

                if (S7.getText().toString().equals(" Γράψε ‘Ο αριθμός είναι άρτιος’")) {
                } else {
                    S7.setError(" Γράψε ‘Ο αριθμός είναι άρτιος'");
                }

                if (S8.getText().toString().equals("Αλλιώς_αν αριθμόςmod2=1 τότε")) {
                } else {
                    S8.setError("Αλλιώς_αν αριθμόςmod2=1 τότε");
                }

                if (S9.getText().toString().equals(" Γράψε ‘Ο αριθμός είναι περιττός’")) {
                } else {
                    S9.setError(" Γράψε ‘Ο αριθμός είναι περιττός’");
                }

                if (S10.getText().toString().equals("Αλλιώς")) {
                } else {
                    S10.setError("Αλλιώς");
                }

                if (S11.getText().toString().equals(" Γράψε ‘Ο αριθμός είναι πραγματικός’")) {
                } else {
                    S11.setError(" Γράψε ‘Ο αριθμός είναι πραγματικός’");
                }
                if (S12.getText().toString().equals("Τέλος Αλγόριθμος3")) {
                } else {
                    S12.setError("Τέλος Αλγόριθμος3");
                }




            }
        });
    }

    public void openNext () {
        Intent intent = new Intent(this, Algor4.class);
        startActivity(intent);
    }


    private void askToClose () {
        AlertDialog.Builder builder = new AlertDialog.Builder(Algor3.this);
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
