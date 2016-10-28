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

public class Cars extends AppCompatActivity {

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
        setContentView(R.layout.activity_cars);


        btnDisplay = (Button) findViewById(R.id.submit);
        rdgroup1 = (RadioGroup) findViewById(R.id.electric);
        rdgroup2 = (RadioGroup) findViewById(R.id.cars);
        rdgroup3 = (RadioGroup) findViewById(R.id.amg);
        rdgroup4 = (RadioGroup) findViewById(R.id.expensive);
        rdgroup5 = (RadioGroup) findViewById(R.id.built);
        points = 0;

        rdgroup1.clearCheck();
        rdgroup2.clearCheck();
        rdgroup3.clearCheck();
        rdgroup4.clearCheck();
        rdgroup5.clearCheck();


        rdgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup1.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.year) {
                    answer = "1973";
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

                if (checkedId == R.id.fast) {
                    answer = "Bugatti Veyron Super Sport ";
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

                if (checkedId == R.id.founder) {
                    answer = "Hans-Werner Aufrecht  and  Erhard Melcher";
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

                if (checkedId == R.id.most) {
                    answer = " Koenigsegg CCXR Trevita";
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

                if (checkedId == R.id.carPlant) {
                    answer = "Port Elizabeth";
                    points = points + 20;
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
        builder.setTitle("QuizApp");
        builder.setMessage("Points :" + points + "\nCorrect Answers: " + correct + "\n\n The correct answers are" + "\n1.1973"
                + "\n2.Bugatti Veyron Super Sport" + "\n3.Hans-Werner Aufrecht  and  Erhard Melcher" + "\n4.Koenigsegg CCXR Trevita" + "\n5.Port Elizabeth");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), Cars.class);
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

