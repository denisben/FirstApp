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

public class Algor7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algor7);
        final EditText S1 = (EditText) findViewById(R.id.s1);
        final EditText S2 = (EditText) findViewById(R.id.s2);
        final EditText S3 = (EditText) findViewById(R.id.s3);
        final EditText S4 = (EditText) findViewById(R.id.s4);
        final EditText S5 = (EditText) findViewById(R.id.s5);
        final EditText S6 = (EditText) findViewById(R.id.s6);
        final EditText S8 = (EditText) findViewById(R.id.s8);
        final EditText S9 = (EditText) findViewById(R.id.s9);
        final EditText S11 = (EditText) findViewById(R.id.s11);
        final EditText S12 = (EditText) findViewById(R.id.s12);
        final EditText S13 = (EditText) findViewById(R.id.s13);
        final EditText S14 = (EditText) findViewById(R.id.s14);
        final EditText S15 = (EditText) findViewById(R.id.s15);
        final EditText S16 = (EditText) findViewById(R.id.s16);
        final EditText S17 = (EditText) findViewById(R.id.s17);
        final EditText S18 = (EditText) findViewById(R.id.s18);
        final EditText S19 = (EditText) findViewById(R.id.s19);
        final EditText S20 = (EditText) findViewById(R.id.s20);
        final EditText S21 = (EditText) findViewById(R.id.s21);
        final EditText S22 = (EditText) findViewById(R.id.s21);


        final EditText A1 = (EditText) findViewById(R.id.a1);
        final EditText A2 = (EditText) findViewById(R.id.a2);
        final EditText A3 = (EditText) findViewById(R.id.a3);
        final EditText A4 = (EditText) findViewById(R.id.a4);
        final EditText A5 = (EditText) findViewById(R.id.a5);
        final EditText A6 = (EditText) findViewById(R.id.a6);
        final EditText A7 = (EditText) findViewById(R.id.a7);
        final EditText A8 = (EditText) findViewById(R.id.a8);
        final EditText A9 = (EditText) findViewById(R.id.a8);
        final EditText A10 = (EditText) findViewById(R.id.a10);


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
                AlertDialog.Builder builder = new AlertDialog.Builder(Algor7.this);

                View view = LayoutInflater.from(Algor7.this).inflate(R.layout.show_image, null);

                TextView title = (TextView) view.findViewById(R.id.title);
                ImageView imageView = (ImageView) view.findViewById(R.id.image);

                imageView.setImageResource(R.drawable.a7);

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


                if (A1.getText().toString().equals("Αλγόριθμος Αλγόριθμος7")) {
                } else {
                    A1.setError("Αλγόριθμος Αλγόριθμος7");
                }
                if (A8.getText().toString().equals("Δεδομένα: // //")) {
                } else {
                    A8.setError("Δεδομένα: // //");
                }

                if (A2.getText().toString().equals("Για i από 1 μέχρι 20")) {
                } else {
                    A2.setError("Για i από 1 μέχρι 20");
                }
                if (A3.getText().toString().equals(" Αλλιώς_αν αριθμός<0 τότε")) {
                } else {
                    A3.setError(" Αλλιώς_αν αριθμός<0 τότε");
                }
                if (A4.getText().toString().equals("  αρνητικός[λ]<-αριθμός")) {
                } else {
                    A4.setError("  αρνητικός[λ]<-αριθμός");
                }
                if (A5.getText().toString().equals("Τέλος_επανάληψης")) {
                } else {
                    A5.setError("Τέλος_επανάληψης");
                }
                if (A6.getText().toString().equals("Εμφάνισε ‘Το άθροισμα των αρνητικών αριθμών είναι’, sum2")) {
                } else {
                    A6.setError("Εμφάνισε ‘Το άθροισμα των αρνητικών αριθμών είναι’, sum2");
                }
                if (A7.getText().toString().equals("Eμφάνισε ‘Ο πίνακας αρνητικών περιέχει ‘,  λ,‘ στοιχεία ‘")) {
                } else {
                    A7.setError("Eμφάνισε ‘Ο πίνακας αρνητικών περιέχει ‘,  λ,‘ στοιχεία ‘");
                }

                if (A9.getText().toString().equals("  Αν αριθμός>0 τότε")) {
                } else {
                    A9.setError("  Αν αριθμός>0 τότε");
                }
                if (A10.getText().toString().equals("  sum1<-sum1+θετικός[κ]")) {
                } else {
                    A10.setError("  sum1<-sum1+θετικός[κ]");
                }

                if (S1.getText().toString().equals("κ<-0")) {
                } else {
                    S1.setError("κ<-0");
                }

                if (S2.getText().toString().equals("sum1<-0")) {
                } else {
                    S2.setError("sum1<-0");
                }
                if (S3.getText().toString().equals("λ<-0")) {
                } else {
                    S3.setError("λ<-0");
                }
                if (S4.getText().toString().equals("sum2<-0")) {
                } else {
                    S4.setError("sum2<-0");
                }
                if (S5.getText().toString().equals("j<-0")) {
                } else {
                    S5.setError("j<-0");
                }

                if (S6.getText().toString().equals(" Διάβασε αριθμός")) {
                } else {
                    S6.setError(" Διάβασε αριθμός");
                }




                if (S8.getText().toString().equals("  θετικός[κ]<-αριθμός")) {
                } else {
                    S8.setError("  θετικός[κ]<-αριθμός");
                }


                if (S9.getText().toString().equals("  κ<-κ+1")) {
                } else {
                    S9.setError("  κ<-κ+1");
                }



                if (S11.getText().toString().equals(" Τέλος_αν")) {
                } else {
                    S11.setError(" Τέλος_αν");
                }

                if (S12.getText().toString().equals("  sum2<-sum2+αρνητικός[λ]")) {
                } else {
                    S12.setError("  sum2<-sum2+αρνητικός[λ]");
                }
                if (S13.getText().toString().equals("  λ<-λ+1")) {
                } else {
                    S13.setError("  λ<-λ+1");
                }
                if (S14.getText().toString().equals(" Τέλος_αν")) {
                } else {
                    S14.setError(" Τέλος_αν");
                }
                if (S15.getText().toString().equals(" Αλλιώς")) {
                } else {
                    S15.setError(" Αλλιώς");
                }
                if (S16.getText().toString().equals("  μηδενικά[j]<-αριθμός")) {
                } else {
                    S16.setError("  μηδενικά[j]<-αριθμός");
                }
                if (S17.getText().toString().equals("  j<-j+1")) {
                } else {
                    S17.setError("  j<-j+1");
                }
                if (S18.getText().toString().equals(" Τέλος_αν")) {
                } else {
                    S18.setError(" Τέλος_αν");
                }
                if (S19.getText().toString().equals("Εμφάνισε ‘Το άθροισμα των θετικών αριθμών είναι’, sum1")) {
                } else {
                    S19.setError("Εμφάνισε ‘Το άθροισμα των θετικών αριθμών είναι’, sum1");
                }
                if (S20.getText().toString().equals("Eμφάνισε ‘Ο πίνακας θετικών περιέχει ‘,  κ, ‘ στοιχεία ‘")) {
                } else {
                    S20.setError("Eμφάνισε ‘Ο πίνακας θετικών περιέχει ‘,  κ, ‘ στοιχεία ‘");
                }
                if (S21.getText().toString().equals("Eμφάνισε ‘Ο πίνακας μηδενικών περιέχει ‘,  j, ‘ στοιχεία ‘")) {
                } else {
                    S21.setError("Eμφάνισε ‘Ο πίνακας μηδενικών περιέχει ‘,  j, ‘ στοιχεία ‘");
                }
                if (S22.getText().toString().equals("Τέλος Αλγόριθμος7")) {
                } else {
                    S22.setError("Τέλος Αλγόριθμος7");
                }
            }

        });
    }

    public void openNext () {
        Intent intent = new Intent(this, Algor7.class);
        startActivity(intent);
    }


    private void askToClose () {
        AlertDialog.Builder builder = new AlertDialog.Builder(Algor7.this);
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




