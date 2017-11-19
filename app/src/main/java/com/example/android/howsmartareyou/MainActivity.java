package com.example.android.howsmartareyou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText quistion1Answer;
    RadioButton question2Option1;
    RadioButton question3Option2;
    RadioButton question4Option1;
    RadioButton question5Option2;
    CheckBox question6Option1;
    CheckBox question6Option2;
    CheckBox question6Option3;
    RadioButton question7Option2;
    RadioButton question8Option3;
    RadioButton question9Option3;
    RadioButton question10Option3;
    Button result;
    int score;
    String finalResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quistion1Answer = (EditText) findViewById(R.id.question1_answer_field);
        question2Option1 = (RadioButton) findViewById(R.id.question2Option1_RadioButton);
        question3Option2 = (RadioButton) findViewById(R.id.question3Option2_RadioButton);
        question4Option1 = (RadioButton) findViewById(R.id.question4Option1_RadioButton);
        question5Option2 = (RadioButton) findViewById(R.id.question5Option2_RadioButton);
        question6Option1 = (CheckBox) findViewById(R.id.question6Option1_CheckBox);
        question6Option2 = (CheckBox) findViewById(R.id.question6Option2_CheckBox);
        question6Option3 = (CheckBox) findViewById(R.id.question6Option3_CheckBox);
        question7Option2 = (RadioButton) findViewById(R.id.question7Option2_RadioButton);
        question7Option2 = (RadioButton) findViewById(R.id.question7Option2_RadioButton);
        question8Option3 = (RadioButton) findViewById(R.id.question8Option3_RadioButton);
        question9Option3 = (RadioButton) findViewById(R.id.question9Option3_RadioButton);
        question10Option3 = (RadioButton) findViewById(R.id.question10Option3_RadioButton);
        result = (Button) findViewById(R.id.result_Button);

    }

    public void result(View view) {
        score = 0;
        if (quistion1Answer.getText().toString().trim().equals("4")) {
            score++;
        }
        if (question2Option1.isChecked()) {
            score++;
        }
        if (question3Option2.isChecked()) {
            score++;
        }
        if (question4Option1.isChecked()) {
            score++;
        }
        if (question5Option2.isChecked()) {
            score++;
        }
        if (question6Option1.isChecked() && question6Option2.isChecked() && !question6Option3.isChecked()) {
            score++;
        }
        if (question7Option2.isChecked()) {
            score++;
        }
        if (question8Option3.isChecked()) {
            score++;
        }
        if (question9Option3.isChecked()) {
            score++;
        }
        if (question10Option3.isChecked()) {
            score++;
        }

        finalResult = String.valueOf(score);
        if (score > 5) {
            Toast.makeText(this, "Your Smart level is :" + finalResult + "/10 \n you are very smart!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Your Smart level is :" + finalResult + "/10 \n you are in normal average", Toast.LENGTH_SHORT).show();

        }
    }
}

