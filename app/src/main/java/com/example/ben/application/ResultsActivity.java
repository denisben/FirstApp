package com.example.ben.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    private QuestionLibrary rQuestionLibrary = new QuestionLibrary();
    private QuestionBook rQuestionbook = new QuestionBook();

    private int Q1 = 0;
    private int Q2 = 0;
    private int Grade = 0;
    private int gScore = 0;
    TextView mFinalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Bundle bundle = getIntent().getExtras();
        int telScore = bundle.getInt("telikoScore");

        Bundle bundle1 = getIntent().getExtras();
        int gScore = bundle1.getInt("gScore");

        Button quitb = findViewById(R.id.quit);
        Button retryb = findViewById(R.id.retry);


        mFinalScore = (TextView)findViewById(R.id.outOf);

        Q1 = rQuestionLibrary.getLength();
        Q2 = rQuestionbook.getLength();
        Grade = Q1+Q2;
        mFinalScore.setText("Youn scored  " + telScore + "      Out of  " + gScore);

        quitb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quit();

            }
        });

        retryb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retry();

            }
        });

    }

    public void Quit() {
        Intent intent1 = new Intent(this, MainActivity2.class);
        startActivity(intent1);
    }


    public void Retry() {
        Intent intent2 = new Intent(this, Kef1sl.class);
        startActivity(intent2);
    }


}


