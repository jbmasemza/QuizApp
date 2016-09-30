package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizApp extends AppCompatActivity
{
    RadioGroup redigroup;
    RadioButton selected;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_app);

        redigroup = (RadioGroup) findViewById(R.id.radiogroup);


        redigroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {

                selected = (RadioButton) redigroup.findViewById(checkedId);
                if( selected.getId() == R.id.politics)
                {
                    Intent i = new Intent(QuizApp.this,Politics.class);
                    startActivity(i);
                }
                else if (selected.getId() == R.id.cars)
                {
                    Intent i = new Intent(QuizApp.this,Cars.class);
                    startActivity(i);
                }
                else if (selected.getId() == R.id.sport)
                {

                }
            }
        });

    }
}