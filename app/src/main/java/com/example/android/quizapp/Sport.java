package com.example.android.quizapp;

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
    int points, correct,wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        btnDisplay = (Button) findViewById(R.id.submit);
        rdgroup1 = (RadioGroup) findViewById(R.id.soccer);
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

                if (checkedId == R.id.player) {
                    answer = "Mr Christiano Ronaldo ";
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

                if (checkedId == R.id.fifap) {
                    answer = "Mr Gianni Infantino";
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

                if (checkedId == R.id.manchester) {
                    answer = "Mr Jose Mourinho";
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

                if (checkedId == R.id.sundowns) {
                    answer = "Mamelodi sundowns";
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
        builder.setTitle("QuizApp results");
        builder.setMessage("Points :"+points+"\nCorrect Answers: "+correct+"\n\n The correct answers are"+"\n1.Mr Wyde Van Nieker"
                +"\n2.Mr Christiano Ronaldo"+"\n3.Mr Gianni Infantino"+"\n4.Mr Jose Mourinho"+"\n5.Mamelodi sundowns");
        builder.setPositiveButton("OK",null);
        builder.show();

    }

    public void onClick(View v)
    {
        rdgroup1.clearCheck();
        rdgroup2.clearCheck();
        rdgroup3.clearCheck();
        rdgroup4.clearCheck();
        rdgroup5.clearCheck();
        Intent i;
        i = new Intent(this,QuizApp.class);
        startActivity(i);
    }

}

