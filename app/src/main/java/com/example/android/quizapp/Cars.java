package com.example.android.quizapp;

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
    int points, correct,wrong;

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


        rdgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup1.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.year) {
                    answer = "1973";
                    points = points + 20;
                    correct++;
                }
                else if (checkedId !=  R.id.id_sabcCoo)
                {

                    answer = "wrong answer";
                    points = points + 0;
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
                    points = points + 20;
                    correct++;
                }
                else if (checkedId !=  R.id.id_gabon)
                {

                    answer = "wrong answer";
                    points = points + 0;
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
                    points = points + 20;
                    correct++;
                }
                else if (checkedId !=  R.id.id_des)
                {

                    answer = "wrong answer";
                    points = points + 0;
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
                    points = points + 20;
                    correct++;
                }
                else if (checkedId !=  R.id.id_xi)
                {

                    answer = "wrong answer";
                    points = points + 0;
                }
            }
        });

        rdgroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup5.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.built) {
                    answer = "Port Elizabeth";
                    points = points + 20;
                    correct++;
                }
                else if (checkedId !=  R.id.carPlant)
                {

                    answer = "wrong answer";
                    points = points + 0;
                }
            }
        });}

    public void quizAnswer(View view){

        AlertDialog.Builder builder= new AlertDialog.Builder(this) ;
        builder.setIcon(R.drawable.quiz);
        builder.setTitle("QuizApp");
        builder.setMessage("Points :"+points+"\nCorrect Answers: "+correct);
        builder.setNegativeButton("OK",null);
        builder.show();

    }



}

