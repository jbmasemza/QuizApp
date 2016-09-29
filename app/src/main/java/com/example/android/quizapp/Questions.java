package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Questions extends AppCompatActivity {

    EditText edtSabc, edtGabon;
    Boolean tempSabc, tempGabon = false;
    int rightA, wrongA = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        edtSabc = (EditText) findViewById(R.id.id_sabcCoo);
        edtGabon = (EditText) findViewById(R.id.id_gabon);

        String sabcCoo = edtSabc.getText().toString();
        String gabon = edtGabon.getText().toString();

        if(sabcCoo.equals("Hlaudi"))
        {
            tempSabc = true;
            //TExtView for displaying
            rightA = rightA + 1;
        }
        else
        {
            wrongA = wrongA + 1;
        }

        if(gabon.equals("Zuma"))
        {
            tempGabon = true;
        }





}}
