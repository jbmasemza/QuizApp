package com.example.android.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Sport extends AppCompatActivity {

    RadioGroup rdgroup1, rdgroup2, rdgroup3, rdgroup4, rdgroup5;

    Button btnDisplay;
    RadioButton selected;
    String answer;
    int points, correct;
    int correct1, correct2, correct3, correct4, correct5;
    int incorrect1, incorrect2, incorrect3, incorrect4, incorrect5;
    int answer1, answer2, answer3, answer4, answer5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        btnDisplay = (Button) findViewById(R.id.submit);
        rdgroup1 = (RadioGroup) findViewById(R.id.record);
        rdgroup2 = (RadioGroup) findViewById(R.id.soccer);
        rdgroup3 = (RadioGroup) findViewById(R.id.fifa);
        rdgroup4 = (RadioGroup) findViewById(R.id.coach);
        rdgroup5 = (RadioGroup) findViewById(R.id.champion);
        points = 0;


        rdgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup1.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.marathon) {
                    answer = "Mr Wyde Van Nieker";
                    answer1 = 20;
                    correct1 = 1;

                } else {
                    answer1 = 0;
                    incorrect1 = 0;
                    answer = "wrong answer";
                }
            }
        });

        rdgroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup2.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.player) {
                    answer = "Mr Christiano Ronaldo ";
                    answer1 = 20;
                    correct1 = 1;

                } else {
                    answer1 = 0;
                    incorrect1 = 0;
                    answer = "wrong answer";
                }
            }
        });

        rdgroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup3.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.fifap) {
                    answer = "Mr Gianni Infantino";
                    answer1 = 20;
                    correct1 = 1;

                } else {
                    answer1 = 0;
                    incorrect1 = 0;
                    answer = "wrong answer";
                }
            }
        });

        rdgroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup4.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.manchester) {
                    answer = "Mr Jose Mourinho";
                    answer1 = 20;
                    correct1 = 1;

                } else {
                    answer1 = 0;
                    incorrect1 = 0;
                    answer = "wrong answer";
                }
            }
        });

        rdgroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup5.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.sundowns) {
                    answer = "Mamelodi sundowns";
                    answer1 = 20;
                    correct1 = 1;

                } else {
                    answer1 = 0;
                    incorrect1 = 0;
                    answer = "wrong answer";
                }
            }
        });
    }

    public void quizAnswer(View view) {

        points = answer1 + answer2 + answer3 + answer4 + answer5;
        correct = correct1 + correct2 + correct3 + correct4 + correct5;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.quiz);
        builder.setTitle("QuizApp results");
        builder.setMessage("Points :" + points + "\nCorrect Answers: " + correct + "\n\n The correct answers are" + "\n1.Mr Wyde Van Nieker"
                + "\n2.Mr Christiano Ronaldo" + "\n3.Mr Gianni Infantino" + "\n4.Mr Jose Mourinho" + "\n5.Mamelodi sundowns");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), Sport.class);
                startActivity(intent);
            }
        });
        builder.show();

    }

    public void onClick(View v) {
        Intent i;
        i = new Intent(this, QuizApp.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(), QuizApp.class);
        startActivity(intent);

    }

}

