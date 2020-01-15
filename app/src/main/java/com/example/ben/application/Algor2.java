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

public class Algor2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algor2);

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
        final EditText S13 = (EditText) findViewById(R.id.s13);
        final EditText A1 = (EditText) findViewById(R.id.a1);
        final EditText A2 = (EditText) findViewById(R.id.a2);
        final EditText A3 = (EditText) findViewById(R.id.a3);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(Algor2.this);

                View view = LayoutInflater.from(Algor2.this).inflate(R.layout.show_image, null);

                TextView title = (TextView) view.findViewById(R.id.title);
                ImageView imageView = (ImageView) view.findViewById(R.id.image);

                imageView.setImageResource(R.drawable.a2);

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
                if (S1.getText().toString().equals("Δεδομένα //Ν//")) {
                } else {
                    S1.setError("Δεδομένα //Ν//");

                }

                if (S2.getText().toString().equals("Διάβασε αριθμό")) {
                } else {
                    S2.setError("Διάβασε αριθμό");
                }

                if (A1.getText().toString().equals("Αλγόριθμος Αλγόριθμος2")) {
                } else {
                    A1.setError("Αλγόριθμος Αλγόριθμος2");
                }
                if (A2.getText().toString().equals("Γράψε ‘Δώσε αριθμό’")) {
                } else {
                    A2.setError("Γράψε ‘Δώσε αριθμό’");
                }

                if (S3.getText().toString().equals("done<-ψευδής")) {
                } else {
                    S3.setError("done<-ψευδής");
                }

                if (S4.getText().toString().equals("θέση<-0")) {
                } else {
                    S4.setError("θέση<-0");
                }


                if (S5.getText().toString().equals("i<-1")) {
                } else {
                    S5.setError("i<-1");
                }

                if (A3.getText().toString().equals("Οσο (done=ψεθδής) και (i<=N) επανέλαβε")) {
                } else {
                    A3.setError("Οσο (done=ψεθδής) και (i<=N) επανέλαβε");
                }
                if (A4.getText().toString().equals(" Αν table[i]=αριθμός τότε")) {
                } else {
                    A4.setError(" Αν table[i]=αριθμός τότε");
                }

                if (S6.getText().toString().equals("  done<-αληθής")) {
                } else {
                    S6.setError("  done<-αληθής");
                }

                if (S7.getText().toString().equals("  θέση<-i")) {
                } else {
                    S7.setError("  θέση<-i");
                }

                if (S8.getText().toString().equals(" αλλιώς")) {
                } else {
                    S8.setError(" αλλιώς");
                }

                if (S9.getText().toString().equals("  i<-i+1")) {
                } else {
                    S9.setError("  i<-i+1");
                }
                if (A5.getText().toString().equals(" Τέλος_αν")) {
                } else {
                    A5.setError(" Τέλος_αν");
                }

                if (S10.getText().toString().equals("Τέλος_επανάληψης")) {
                } else {
                    S10.setError("Τέλος_επανάληψης");
                }

                if (S11.getText().toString().equals("Αν done<-αληθής τότε")) {
                } else {
                    S11.setError("Αν done<-αληθής τότε");
                }

                if (A6.getText().toString().equals("  Εμφάνισε ‘Βρέθηκε στην θέση’, θέση")) {
                } else {
                    A6.setError("  Εμφάνισε ‘Βρέθηκε στην θέση’, θέση");
                }

                if (S12.getText().toString().equals("Τέλος_αν")) {
                } else {
                    S12.setError("Τέλος_αν");
                }

                if (S13.getText().toString().equals("Τέλος Αλγόριθμος2")) {
                } else {
                    S13.setError("Τέλος Αλγόριθμος2");
                }




            }
        });
    }

    public void openNext () {
        Intent intent = new Intent(this, Algor3.class);
        startActivity(intent);
    }


    private void askToClose () {
        AlertDialog.Builder builder = new AlertDialog.Builder(Algor2.this);
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