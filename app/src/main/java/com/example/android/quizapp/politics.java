package com.example.android.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Politics extends AppCompatActivity {

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
        setContentView(R.layout.activity_politics);
        btnDisplay = (Button) findViewById(R.id.submit);
        rdgroup1 = (RadioGroup) findViewById(R.id.sabc);
        rdgroup2 = (RadioGroup) findViewById(R.id.gabons);
        rdgroup3 = (RadioGroup) findViewById(R.id.cogta);
        rdgroup4 = (RadioGroup) findViewById(R.id.chinese);
        rdgroup5 = (RadioGroup) findViewById(R.id.saa);
        points = 0;


        rdgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) group.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.id_sabcCoo) {
                    answer = "Mr Hlaudi Motsoeneng";
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

                String selected_answer = selected.getText().toString();

                if (checkedId == R.id.id_gabon) {

                    answer2 = 20;
                    correct2 = 1;
                    answer = "Mr Ali Bongo Ondimba";

                } else {
                    answer2 = 0;
                    incorrect2 = 0;
                    answer = "wrong answer";
                }

            }
        });

        rdgroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup3.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.id_des) {
                    answer = "Mr Des Van Royen";

                    answer3 = 20;
                    correct3 = 1;

                } else {
                    answer3 = 0;
                    incorrect3 = 0;
                    answer = "wrong answer";
                }
            }
        });

        rdgroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup4.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.id_xi) {
                    answer = "Mr Des Van Royen";

                    answer4 = 20;
                    correct4 = 1;

                } else {
                    answer4 = 0;
                    incorrect4 = 0;
                    answer = "wrong answer";
                }


            }
        });

        rdgroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup5.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.id_myeni) {
                    answer = "Ms Dudu Cynthis Myeni";

                    answer5 = 20;
                    correct5 = 1;

                } else {
                    answer5 = 0;
                    incorrect5 = 0;
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
        builder.setTitle("QuizApp");
        builder.setMessage("Points :" + points + "\nCorrect Answers: " + correct + "\n\n The correct answers are" + "\n1.Mr Hlaudi Motsoeneng"
                + "\n2.Mr Ali Bongo Ondimba" + "\n3.Mr Des Van Royen" + "\n4.Mr Xi Jinping" + "\n5.Ms Dudu Cynthis Myeni");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), Politics.class);
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