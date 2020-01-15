package com.example.ben.application;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);

        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity9();

            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              msg2();

            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg1();

            }
        });




    }
    public void openActivity3() {
        Intent intent2 = new Intent(this, Kef1sl.class);
        startActivity(intent2);

    }

    public void openActivity4() {
        Intent intent3 = new Intent(this, Kef2sl.class);
        startActivity(intent3);

    }

    public void openActivity5() {
        Intent intent4 = new Intent(this, Kef3sl.class);
        startActivity(intent4);

    }

    public void openActivity6() {
        Intent intent5 = new Intent(this, Kef4sl.class);
        startActivity(intent5);

    }

    public void openActivity7() {
        Intent intent6 = new Intent(this, Kef5sl.class);
        startActivity(intent6);

    }

    public void openActivity8() {
        Intent intent7 = new Intent(this, Kef6sl.class);
        startActivity(intent7);

    }

    public void openActivity9() {
        Intent intent8 = new Intent(this, Kef7sl.class);
        startActivity(intent8);

    }



    public void openActivity11() {
        Intent intent9 = new Intent(this, Algor1.class);
        startActivity(intent9);



    }

    public void openActivity12() {
        Intent intent10 = new Intent(this, Progr1.class);
        startActivity(intent10);

    }


    @Override
    public void onBackPressed() {
        Close();
    }



    private void Close (){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
        builder.setMessage("Are you sure you want to close?");
        builder.setCancelable(true);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                System.exit(id);
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


    private void msg1(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity2.this);
        alertDialogBuilder
                .setMessage("Προσοχή!! Κάθε φορά που μια εντολή χρειάζεται εμφόλευση, θα πρέπει να αφήνετε ένα κενό γράμμα και μετά να γράφεται την εντολή." +
                        "Το ίδιο ισχύει και για πολλαπλά εμφολευμένες εντολές. Επίσης θα πρέπει να κλείνεται τις εμφολεύσεις όταν πρέπει  "  )
                .setCancelable(false)
                .setPositiveButton("ΟΚ",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                openActivity12();

                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

        private void msg2(){
            AlertDialog.Builder alertDialogBuilder2 = new AlertDialog.Builder(MainActivity2.this);
            alertDialogBuilder2
                    .setMessage("Προσοχή!! Κάθε φορά που μια εντολή χρειάζεται εμφόλευση, θα πρέπει να αφήνετε ένα κενό γράμμα και μετά να γράφεται την εντολή." +
                            "Το ίδιο ισχύει και για πολλαπλά εμφολευμένες εντολές. Επίσης θα πρέπει να κλείνεται τις εμφολεύσεις όταν πρέπει  "  )
                    .setCancelable(false)
                    .setPositiveButton("ΟΚ",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int i) {
                                    openActivity11();

                                }
                            });


        AlertDialog alertDialog = alertDialogBuilder2.create();
        alertDialog.show();
    }
}



