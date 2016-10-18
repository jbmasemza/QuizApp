package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizApp extends AppCompatActivity
{
    RadioGroup redigroup;
    RadioButton selected;
    boolean is_selected_radio = true;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_app);

        redigroup = (RadioGroup) findViewById(R.id.radiogroup);

        //redigroup.clearCheck();
        redigroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                /*RadioButton selectedButton = (RadioButton) group.findViewById(checkedId);
                boolean is_selected_radio = selectedButton.isChecked();

                */

              /*  if (is_selected_radio) {
                    //is_selected_radio = false;

                    if (checkedId == R.id.politics) {
                        Log.i("Ygritte", "Politics was selected");
                        Intent i = new Intent(QuizApp.this, Politics.class);
                        startActivity(i);
                    } else if (checkedId == R.id.sport) {
                        Log.i("Ygritte", "Sports was selected");
                        Intent i = new Intent(QuizApp.this, Sport.class);
                        startActivity(i);
                    } else if (checkedId == R.id.cars) {
                        Log.i("Ygritte", "Cars was selected");
                        Intent i = new Intent(QuizApp.this, Cars.class);
                        startActivity(i);
                    }
                }

                /*} else {
                    Log.i("Ygritte", " Selected : "+is_selected_radio);
                }
                */

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
                    Intent i = new Intent(QuizApp.this,Sport.class);
                    startActivity(i);
                }
            }
        });

    }

   /* @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onResume() {
        super.onResume();
        redigroup.clearCheck();
    }*/
}