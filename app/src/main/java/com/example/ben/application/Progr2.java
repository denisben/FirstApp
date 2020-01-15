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

public class Progr2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progr2);

        final EditText S1 = (EditText) findViewById(R.id.s1);
        final EditText S2 = (EditText) findViewById(R.id.s2);
        final EditText S3 = (EditText) findViewById(R.id.s3);

        final EditText S5 = (EditText) findViewById(R.id.s5);
        final EditText S6 = (EditText) findViewById(R.id.s6);
        final EditText S7 = (EditText) findViewById(R.id.s7);
        final EditText S8 = (EditText) findViewById(R.id.s8);
        final EditText S9 = (EditText) findViewById(R.id.s9);
        final EditText S10 = (EditText) findViewById(R.id.s10);

        final EditText A1 = (EditText) findViewById(R.id.a1);
        final EditText A2 = (EditText) findViewById(R.id.a2);
        final EditText A3 = (EditText) findViewById(R.id.a3);
        final EditText A4 = (EditText) findViewById(R.id.a4);
        final EditText A6 = (EditText) findViewById(R.id.a6);
        final EditText A7 = (EditText) findViewById(R.id.a7);
        final EditText A8 = (EditText) findViewById(R.id.a8);

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
                AlertDialog.Builder builder = new AlertDialog.Builder(Progr2.this);

                View view = LayoutInflater.from(Progr2.this).inflate(R.layout.show_image, null);

                TextView title = (TextView) view.findViewById(R.id.title);
                ImageView imageView = (ImageView) view.findViewById(R.id.image);

                imageView.setImageResource(R.drawable.p2);

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
                if (A1.getText().toString().equals("ΠΡΟΓΡΑΜΜΑ Π2")) {
                } else {
                    A1.setError("ΠΡΟΓΡΑΜΜΑ Π2");

                }

                if (A2.getText().toString().equals("ΣΤΑΘΕΡΕΣ")) {
                } else {
                    A2.setError("ΣΤΑΘΕΡΕΣ");
                }

                if (S1.getText().toString().equals("α_π=2")) {
                } else {
                    S1.setError("α_π=2");
                }

                if (A3.getText().toString().equals("ΜΕΤΑΒΛΗΤΕΣ")) {
                } else {
                    A3.setError("ΜΕΤΑΒΛΗΤΕΣ");
                }

                if (S2.getText().toString().equals("ΑΚΕΡΑΙΕΣ")) {
                } else {
                    S2.setError("ΑΚΕΡΑΙΕΣ");
                }
                if (S3.getText().toString().equals("ΠΡΑΓΜΑΤΙΚΕΣ")) {
                } else {
                    S3.setError("ΠΡΑΓΜΑΤΙΚΕΣ");
                }


                if (A4.getText().toString().equals("ΑΡΧΗ")) {
                } else {
                    A4.setError("ΑΡΧΗ");
                }

                if (A6.getText().toString().equals("ΓΙΑ i ΑΠΟ 1 ΜΕΧΤΙ α_π")) {
                } else {
                    A6.setError("ΓΙΑ i ΑΠΟ 1 ΜΕΧΤΙ α_π");
                }

                if (S5.getText().toString().equals("ΑΡΧΗ_ΕΠΑΝΑΛΗΨΗΣ")) {
                } else {
                    S5.setError("ΑΡΧΗ_ΕΠΑΝΑΛΗΨΗΣ");
                }


                if (S6.getText().toString().equals("ΔΙΑΒΑΣΕ βαθμός")) {
                } else {
                    S6.setError("ΔΙΑΒΑΣΕ βαθμός");
                }

                if (S7.getText().toString().equals("ΜΕΧΡΙΣ_ΟΤΟΥ βαθμός>=0 ΚΑΙ βαθμός<=20")) {
                } else {
                    S7.setError("ΜΕΧΡΙΣ_ΟΤΟΥ βαθμός>=0 ΚΑΙ βαθμός<=20");
                }
                if (A7.getText().toString().equals("ΤΕΛΟΣ-ΕΠΑΝΑΛΗΨΗΣ")) {
                } else {
                    A7.setError("ΤΕΛΟΣ-ΕΠΑΝΑΛΗΨΗΣ");
                }

                if (S8.getText().toString().equals("sum<-sum+βαθμός")) {
                } else {
                    S8.setError("sum<-sum+βαθμός");
                }

                if (S9.getText().toString().equals("μ_ο<-sum/16")) {
                } else {
                    S9.setError("μ_ο<-sum/16");
                }

                if (S10.getText().toString().equals("ΓΡΑΨΕ μ_ο")) {
                } else {
                    S10.setError("ΓΡΑΨΕ μ_ο");
                }

                if (A8.getText().toString().equals("ΤΕΛΟΣ_ΠΡΟΓΡΑΜΜΑΤΟΣ")) {
                } else {
                    A8.setError("ΤΕΛΟΣ_ΠΡΟΓΡΑΜΜΑΤΟΣ");
                }


            }

        });

    }
        public void openNext () {
            Intent intent = new Intent(this, Progr3.class);
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
        AlertDialog.Builder builder = new AlertDialog.Builder(Progr2.this);
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






