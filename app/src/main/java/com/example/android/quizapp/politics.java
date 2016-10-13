package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Politics extends AppCompatActivity {

    RadioGroup rdgroup1, rdgroup2, rdgroup3, rdgroup4, rdgroup5;
    Button btnDisplay,bckbtn;
    RadioButton selected;
    String answer;
    int points, correct,wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politics);
        btnDisplay = (Button) findViewById(R.id.submit);
        bckbtn = (Button) findViewById(R.id.back);
        rdgroup1 = (RadioGroup) findViewById(R.id.sabc);
        rdgroup2 = (RadioGroup) findViewById(R.id.gabons);
        rdgroup3 = (RadioGroup) findViewById(R.id.cogta);
        rdgroup4 = (RadioGroup) findViewById(R.id.chinese);
        rdgroup5 = (RadioGroup) findViewById(R.id.saa);
        points = 0;



        rdgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selected = (RadioButton) rdgroup1.findViewById(checkedId);

                String answer = selected.getText().toString();

                if (checkedId == R.id.id_sabcCoo) {
                    answer = "Mr Hlaudi Motsoeneng";
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

                if (checkedId == R.id.id_gabon) {
                    answer = "Mr Ali Bongo Ondimba ";
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

                if (checkedId == R.id.id_des) {
                    answer = "Mr Des Van Royen";
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

                if (checkedId == R.id.id_xi) {
                    answer = "Mr Xi Jinping";
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

                if (checkedId == R.id.id_myeni) {
                    answer = "Ms Dudu Cynthis Myeni";
                    points = points + 20;
                    correct++;
                }
                else if (checkedId !=  R.id.id_myeni)
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
            builder.setMessage("Points :"+points+"\nCorrect Answers: "+correct+"\n\n The correct answers are"+"\n1.Mr Hlaudi Motsoeneng"
                    +"\n2.Mr Ali Bongo Ondimba"+"\n3.Mr Des Van Royen"+"\n4.Mr Xi Jinping"+"\n5.Ms Dudu Cynthis Myeni");
            builder.setPositiveButton("OK",null);
            builder.show();

    }

public void onClick(View v)
        {
        Intent i;
        i = new Intent(this,QuizApp.class);
        startActivity(i);
        }

}