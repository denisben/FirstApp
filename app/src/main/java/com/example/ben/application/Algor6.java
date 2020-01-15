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

public class Algor6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algor6);
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
        final EditText S14 = (EditText) findViewById(R.id.s14);
        final EditText S15 = (EditText) findViewById(R.id.s15);
        final EditText S16 = (EditText) findViewById(R.id.s16);
        final EditText S17 = (EditText) findViewById(R.id.s17);
        final EditText S18 = (EditText) findViewById(R.id.s18);
        final EditText S19 = (EditText) findViewById(R.id.s19);
        final EditText S20 = (EditText) findViewById(R.id.s20);
        final EditText S21 = (EditText) findViewById(R.id.s21);


        final EditText A1 = (EditText) findViewById(R.id.a1);
        final EditText A2 = (EditText) findViewById(R.id.a2);
        final EditText A3 = (EditText) findViewById(R.id.a3);
        final EditText A4 = (EditText) findViewById(R.id.a4);
        final EditText A5 = (EditText) findViewById(R.id.a5);
        final EditText A6 = (EditText) findViewById(R.id.a6);
        final EditText A7 = (EditText) findViewById(R.id.a7);


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
                AlertDialog.Builder builder = new AlertDialog.Builder(Algor6.this);

                View view = LayoutInflater.from(Algor6.this).inflate(R.layout.show_image, null);

                TextView title = (TextView) view.findViewById(R.id.title);
                ImageView imageView = (ImageView) view.findViewById(R.id.image);

                imageView.setImageResource(R.drawable.a6);

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


                if (A1.getText().toString().equals("Αλγόριθμος Αλγόριθμος6")) {
                } else {
                    A1.setError("Αλγόριθμος Αλγόριθμος6");
                }
                if (A2.getText().toString().equals("Για i από 1 μέχρι Ν")) {
                } else {
                    A2.setError("Για i από 1 μέχρι Ν");
                }
                if (A3.getText().toString().equals("   Γράψε ‘Δώσε σωστό φύλο’")) {
                } else {
                    A3.setError("   Γράψε ‘Δώσε σωστό φύλο’");
                }
                if (A4.getText().toString().equals("   Διάβασε φύλο")) {
                } else {
                    A4.setError("   Διάβασε φύλο");
                }
                if (A5.getText().toString().equals(" Αν μαθητές[i]=άρρεν τότε")) {
                } else {
                    A5.setError(" Αν μαθητές[i]=άρρεν τότε");
                }
                if (A6.getText().toString().equals(" Αλλιώς")) {
                } else {
                    A6.setError(" Αλλιώς");
                }
                if (A7.getText().toString().equals("Γράψε ‘Το ποσοστό των αγοριών είναι’, ποσοστό1")) {
                } else {
                    A7.setError("Γράψε ‘Το ποσοστό των αγοριών είναι’, ποσοστό1");
                }

                if (S1.getText().toString().equals("Δεδομένα //N//")) {
                } else {
                    S1.setError("Δεδομένα //N//");
                }

                if (S2.getText().toString().equals("sum1<-0")) {
                } else {
                    S2.setError("sum1<-0");
                }
                if (S3.getText().toString().equals("sum2<-0")) {
                } else {
                    S3.setError("sum2<-0");
                }
                if (S4.getText().toString().equals("ποσοστό1<-0")) {
                } else {
                    S4.setError("ποσοστό1<-0");
                }
                if (S5.getText().toString().equals("ποσοστό2<-0")) {
                } else {
                    S5.setError("ποσοστό2<-0");
                }

                if (S6.getText().toString().equals(" Γράψε ‘Δώσε φύλο’")) {
                } else {
                    S6.setError(" Γράψε ‘Δώσε φύλο’");
                }

                if (S7.getText().toString().equals("  Διάβασε φύλο")) {
                } else {
                    S7.setError("  Διάβασε φύλο");
                }


                if (S8.getText().toString().equals("  Οσο φύλο!=άρρεν η φύλο!=θηλύ")) {
                } else {
                    S8.setError("  Οσο φύλο!=άρρεν η φύλο!=θηλύ");
                }


                if (S9.getText().toString().equals("  Τέλος_επανάληψης")) {
                } else {
                    S9.setError("  Τέλος_επανάληψης");
                }

                if (S10.getText().toString().equals("  μαθητές[i]<-φύλο")) {
                } else {
                    S10.setError("  μαθητές[i]<-φύλο");
                }

                if (S11.getText().toString().equals("Τέλος_επανάληψης")) {
                } else {
                    S11.setError("Τέλος_επανάληψης");
                }

                if (S12.getText().toString().equals("Για i από 1 μέχρι Ν")) {
                } else {
                    S12.setError("Για i από 1 μέχρι Ν");
                }
                if (S13.getText().toString().equals("  sum1<-sum1+1")) {
                } else {
                    S13.setError("  sum1<-sum1+1");
                }
                if (S14.getText().toString().equals(" Τέλος_αν")) {
                } else {
                    S14.setError(" Τέλος_αν");
                }
                if (S15.getText().toString().equals("  sum2<-sum2+1")) {
                } else {
                    S15.setError("  sum2<-sum2+1");
                }
                if (S16.getText().toString().equals(" Τέλος_αν")) {
                } else {
                    S16.setError(" Τέλος_αν");
                }
                if (S17.getText().toString().equals("Τέλος_επανάληψης")) {
                } else {
                    S17.setError("Τέλος_επανάληψης");
                }
                if (S18.getText().toString().equals("ποσοστό1<=sum1/N%")) {
                } else {
                    S18.setError("ποσοστό1<=sum1/N%");
                }
                if (S19.getText().toString().equals("ποσοσοστό2<-sum2/N%")) {
                } else {
                    S19.setError("ποσοσοστό2<-sum2/N%");
                }
                if (S20.getText().toString().equals("Γράψε ‘Το ποσοστό των κοριτσιών είναι’, ποσοστό2")) {
                } else {
                    S20.setError("Γράψε ‘Το ποσοστό των κοριτσιών είναι’, ποσοστό2");
                }
                if (S21.getText().toString().equals("Τέλος Αλγόριθμος6")) {
                } else {
                    S21.setError("Τέλος Αλγόριθμος6");
                }
            }

        });
        }

    public void openNext () {
        Intent intent = new Intent(this, Algor7.class);
        startActivity(intent);
    }


    private void askToClose () {
        AlertDialog.Builder builder = new AlertDialog.Builder(Algor6.this);
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



