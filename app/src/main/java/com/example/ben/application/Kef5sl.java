package com.example.ben.application;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Kef5sl extends AppCompatActivity {

    TextView mScoreView;
    private TextView mQuestion;
    private ImageView mImageView;
    private Button mTrueButton, mFalseButton;
    private boolean mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kef5sl);

        mScoreView = (TextView)findViewById(R.id.points);
        mImageView = (ImageView)findViewById(R.id.imageView);
        mQuestion = (TextView)findViewById(R.id.question);
        mTrueButton = (Button)findViewById(R.id.trueButton);
        mFalseButton = (Button)findViewById(R.id.falseButton);

        updateQuestion();


        //Logic for true button
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mAnswer == true) {
                    mScore++;
                    updateScore(mScore);

                    //perform check before you update the question
                    if (mQuestionNumber == QuestionBook5.questions.length) {
                        Intent i = new Intent(Kef5sl.this, Kef5m.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        Kef5sl.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(Kef5sl.this, "Correct", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    if (mQuestionNumber == QuestionBook5.questions.length) {
                        Intent i = new Intent(Kef5sl.this, Kef5m.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        Kef5sl.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(Kef5sl.this, "Wrong", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



        //Logic for false button
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAnswer == false) {
                    mScore++;
                    updateScore(mScore);

                    //perform check before you update the question
                    if (mQuestionNumber == QuestionBook5.questions.length) {
                        Intent i = new Intent(Kef5sl.this, Kef5m.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);

                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(Kef5sl.this, "Correct", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    if (mQuestionNumber == QuestionBook5.questions.length) {
                        Intent i = new Intent(Kef5sl.this, Kef5m.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        Kef5sl.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(Kef5sl.this, "Wrong", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }



    private void updateQuestion() {

        mImageView.setImageResource(QuestionBook5.images[mQuestionNumber]);
        mQuestion.setText(QuestionBook5.questions[mQuestionNumber]);
        mAnswer = QuestionBook5.answers[mQuestionNumber];
        mQuestionNumber++;
    }



    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }



    public void clickExit(View view) {
        askToClose();
    }




    @Override
    public void onBackPressed() {
        askToClose();
    }



    private void askToClose (){
        AlertDialog.Builder builder = new AlertDialog.Builder(Kef5sl.this);
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

