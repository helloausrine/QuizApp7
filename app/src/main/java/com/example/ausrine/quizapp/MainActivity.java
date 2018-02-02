package com.example.ausrine.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Radio Groups

    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;
    RadioGroup radioGroup8;
    RadioGroup radioGroup9;
    RadioGroup radioGroup10;
    RadioGroup radioGroup11;
    RadioGroup radioGroup12;
    RadioGroup radioGroup13;
    RadioGroup radioGroup14;
    RadioGroup radioGroup15;

    // Radio Buttons

    RadioButton q1a1_radioButton;
    RadioButton q1a2_radioButton;
    RadioButton q1a3_radioButton;

    RadioButton q2a1_radioButton;
    RadioButton q2a2_radioButton;
    RadioButton q2a3_radioButton;

    RadioButton q3a1_radioButton;
    RadioButton q3a2_radioButton;
    RadioButton q3a3_radioButton;

    RadioButton q4a1_radioButton;
    RadioButton q4a2_radioButton;
    RadioButton q4a3_radioButton;

    RadioButton q5a1_radioButton;
    RadioButton q5a2_radioButton;
    RadioButton q5a3_radioButton;

    RadioButton q6a1_radioButton;
    RadioButton q6a2_radioButton;
    RadioButton q6a3_radioButton;

    RadioButton q7a1_radioButton;
    RadioButton q7a2_radioButton;
    RadioButton q7a3_radioButton;

    RadioButton q8a1_radioButton;
    RadioButton q8a2_radioButton;
    RadioButton q8a3_radioButton;

    RadioButton q9a1_radioButton;
    RadioButton q9a2_radioButton;
    RadioButton q9a3_radioButton;

    RadioButton q10a1_radioButton;
    RadioButton q10a2_radioButton;
    RadioButton q10a3_radioButton;

    RadioButton q11a1_radioButton;
    RadioButton q11a2_radioButton;
    RadioButton q11a3_radioButton;

    RadioButton q12a1_radioButton;
    RadioButton q12a2_radioButton;
    RadioButton q12a3_radioButton;

    RadioButton q13a1_radioButton;
    RadioButton q13a2_radioButton;
    RadioButton q13a3_radioButton;

    RadioButton q14a1_radioButton;
    RadioButton q14a2_radioButton;
    RadioButton q14a3_radioButton;

    RadioButton q15a1_radioButton;
    RadioButton q15a2_radioButton;
    RadioButton q15a3_radioButton;

    //Check Boxes
/*

    CheckBox q1a1_checkBox;
    CheckBox q1a2_checkBox;
    CheckBox q1a3_checkBox;
    CheckBox q1a4_checkBox;
    CheckBox q1a5_checkBox;
    CheckBox q1a6_checkBox;

    CheckBox q2a1_checkBox;
    CheckBox q2a2_checkBox;
    CheckBox q2a3_checkBox;
    CheckBox q2a4_checkBox;
    CheckBox q2a5_checkBox;
    CheckBox q2a6_checkBox;

    CheckBox q3a1_checkBox;
    CheckBox q3a2_checkBox;
    CheckBox q3a3_checkBox;
    CheckBox q3a4_checkBox;
    CheckBox q3a5_checkBox;
    CheckBox q3a6_checkBox;

    CheckBox q4a1_checkBox;
    CheckBox q4a2_checkBox;
    CheckBox q4a3_checkBox;
    CheckBox q4a4_checkBox;
    CheckBox q4a5_checkBox;
    CheckBox q4a6_checkBox;

    CheckBox q5a1_checkBox;
    CheckBox q5a2_checkBox;
    CheckBox q5a3_checkBox;
    CheckBox q5a4_checkBox;
    CheckBox q5a5_checkBox;
    CheckBox q5a6_checkBox;

    CheckBox q6a1_checkBox;
    CheckBox q6a2_checkBox;
    CheckBox q6a3_checkBox;
    CheckBox q6a4_checkBox;
    CheckBox q6a5_checkBox;
    CheckBox q6a6_checkBox;

    CheckBox q7a1_checkBox;
    CheckBox q7a2_checkBox;
    CheckBox q7a3_checkBox;
    CheckBox q7a4_checkBox;
    CheckBox q7a5_checkBox;
    CheckBox q7a6_checkBox;

    CheckBox q8a1_checkBox;
    CheckBox q8a2_checkBox;
    CheckBox q8a3_checkBox;
    CheckBox q8a4_checkBox;
    CheckBox q8a5_checkBox;
    CheckBox q8a6_checkBox;

    CheckBox q9a1_checkBox;
    CheckBox q9a2_checkBox;
    CheckBox q9a3_checkBox;
    CheckBox q9a4_checkBox;
    CheckBox q9a5_checkBox;
    CheckBox q9a6_checkBox;

    CheckBox q10a1_checkBox;
    CheckBox q10a2_checkBox;
    CheckBox q10a3_checkBox;
    CheckBox q10a4_checkBox;
    CheckBox q10a5_checkBox;
    CheckBox q10a6_checkBox;

    CheckBox q11a1_checkBox;
    CheckBox q11a2_checkBox;
    CheckBox q11a3_checkBox;
    CheckBox q11a4_checkBox;
    CheckBox q11a5_checkBox;
    CheckBox q11a6_checkBox;

    CheckBox q12a1_checkBox;
    CheckBox q12a2_checkBox;
    CheckBox q12a3_checkBox;
    CheckBox q12a4_checkBox;
    CheckBox q12a5_checkBox;
    CheckBox q12a6_checkBox;

    CheckBox q13a1_checkBox;
    CheckBox q13a2_checkBox;
    CheckBox q13a3_checkBox;
    CheckBox q13a4_checkBox;
    CheckBox q13a5_checkBox;
    CheckBox q13a6_checkBox;

    CheckBox q14a1_checkBox;
    CheckBox q14a2_checkBox;
    CheckBox q14a3_checkBox;
    CheckBox q14a4_checkBox;
    CheckBox q14a5_checkBox;
    CheckBox q14a6_checkBox;

    CheckBox q15a1_checkBox;
    CheckBox q15a2_checkBox;
    CheckBox q15a3_checkBox;
    CheckBox q15a4_checkBox;
    CheckBox q15a5_checkBox;
    CheckBox q15a6_checkBox;
*/

    EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Radio Groups

        radioGroup1 = findViewById(R.id.q1);
        radioGroup2 = findViewById(R.id.q2);
        radioGroup3 = findViewById(R.id.q3);
        radioGroup4 = findViewById(R.id.q4);
        radioGroup5 = findViewById(R.id.q5);
        radioGroup6 = findViewById(R.id.q6);
        radioGroup7 = findViewById(R.id.q7);
        radioGroup8 = findViewById(R.id.q8);
        radioGroup9 = findViewById(R.id.q9);
        radioGroup10 = findViewById(R.id.q10);
        radioGroup11 = findViewById(R.id.q11);
        radioGroup12 = findViewById(R.id.q12);
        radioGroup13 = findViewById(R.id.q13);
        radioGroup14 = findViewById(R.id.q14);
        radioGroup15 = findViewById(R.id.q15);

        // Radio Buttons

        q1a1_radioButton = findViewById(R.id.q1a1);
        q1a2_radioButton = findViewById(R.id.q1a2);
        q1a3_radioButton = findViewById(R.id.q1a3);

        q2a1_radioButton = findViewById(R.id.q2a1);
        q2a2_radioButton = findViewById(R.id.q2a2);
        q2a3_radioButton = findViewById(R.id.q2a3);

        q3a1_radioButton = findViewById(R.id.q3a1);
        q3a2_radioButton = findViewById(R.id.q3a2);
        q3a3_radioButton = findViewById(R.id.q3a3);

        q4a1_radioButton = findViewById(R.id.q4a1);
        q4a2_radioButton = findViewById(R.id.q4a2);
        q4a3_radioButton = findViewById(R.id.q4a3);

        q5a1_radioButton = findViewById(R.id.q5a1);
        q5a2_radioButton = findViewById(R.id.q5a2);
        q5a3_radioButton = findViewById(R.id.q5a3);

        q6a1_radioButton = findViewById(R.id.q6a1);
        q6a2_radioButton = findViewById(R.id.q6a2);
        q6a3_radioButton = findViewById(R.id.q6a3);

        q7a1_radioButton = findViewById(R.id.q7a1);
        q7a2_radioButton = findViewById(R.id.q7a2);
        q7a3_radioButton = findViewById(R.id.q7a3);

        q8a1_radioButton = findViewById(R.id.q8a1);
        q8a2_radioButton = findViewById(R.id.q8a2);
        q8a3_radioButton = findViewById(R.id.q8a3);

        q9a1_radioButton = findViewById(R.id.q9a1);
        q9a2_radioButton = findViewById(R.id.q9a2);
        q9a3_radioButton = findViewById(R.id.q9a3);

        q10a1_radioButton = findViewById(R.id.q10a1);
        q10a2_radioButton = findViewById(R.id.q10a2);
        q10a3_radioButton = findViewById(R.id.q10a3);

        q11a1_radioButton = findViewById(R.id.q11a1);
        q11a2_radioButton = findViewById(R.id.q11a2);
        q11a3_radioButton = findViewById(R.id.q11a3);

        q12a1_radioButton = findViewById(R.id.q12a1);
        q12a2_radioButton = findViewById(R.id.q12a2);
        q12a3_radioButton = findViewById(R.id.q12a3);

        q13a1_radioButton = findViewById(R.id.q13a1);
        q13a2_radioButton = findViewById(R.id.q13a2);
        q13a3_radioButton = findViewById(R.id.q13a3);

        q14a1_radioButton = findViewById(R.id.q14a1);
        q14a2_radioButton = findViewById(R.id.q14a2);
        q14a3_radioButton = findViewById(R.id.q14a3);

        q15a1_radioButton = findViewById(R.id.q15a1);
        q15a2_radioButton = findViewById(R.id.q15a2);
        q15a3_radioButton = findViewById(R.id.q15a3);

        // Check Boxes

/*        q1a1_checkBox = findViewById(R.id.typeq1a1);
        q1a2_checkBox = findViewById(R.id.typeq1a2);
        q1a3_checkBox = findViewById(R.id.typeq1a3);
        q1a4_checkBox = findViewById(R.id.typeq1a4);
        q1a5_checkBox = findViewById(R.id.typeq1a5);
        q1a6_checkBox = findViewById(R.id.typeq1a6);

        q2a1_checkBox = findViewById(R.id.typeq2a1);
        q2a2_checkBox = findViewById(R.id.typeq2a2);
        q2a3_checkBox = findViewById(R.id.typeq2a3);
        q2a4_checkBox = findViewById(R.id.typeq2a4);
        q2a5_checkBox = findViewById(R.id.typeq2a5);
        q2a6_checkBox = findViewById(R.id.typeq2a6);

        q3a1_checkBox = findViewById(R.id.typeq3a1);
        q3a2_checkBox = findViewById(R.id.typeq3a2);
        q3a3_checkBox = findViewById(R.id.typeq3a3);
        q3a4_checkBox = findViewById(R.id.typeq3a4);
        q3a5_checkBox = findViewById(R.id.typeq3a5);
        q3a6_checkBox = findViewById(R.id.typeq3a6);

        q4a1_checkBox = findViewById(R.id.typeq4a1);
        q4a2_checkBox = findViewById(R.id.typeq4a2);
        q4a3_checkBox = findViewById(R.id.typeq4a3);
        q4a4_checkBox = findViewById(R.id.typeq4a4);
        q4a5_checkBox = findViewById(R.id.typeq4a5);
        q4a6_checkBox = findViewById(R.id.typeq4a6);

        q5a1_checkBox = findViewById(R.id.typeq5a1);
        q5a2_checkBox = findViewById(R.id.typeq5a2);
        q5a3_checkBox = findViewById(R.id.typeq5a3);
        q5a4_checkBox = findViewById(R.id.typeq5a4);
        q5a5_checkBox = findViewById(R.id.typeq5a5);
        q5a6_checkBox = findViewById(R.id.typeq5a6);

        q6a1_checkBox = findViewById(R.id.typeq6a1);
        q6a2_checkBox = findViewById(R.id.typeq6a2);
        q6a3_checkBox = findViewById(R.id.typeq6a3);
        q6a4_checkBox = findViewById(R.id.typeq6a4);
        q6a5_checkBox = findViewById(R.id.typeq6a5);
        q6a6_checkBox = findViewById(R.id.typeq6a6);

        q7a1_checkBox = findViewById(R.id.typeq7a1);
        q7a2_checkBox = findViewById(R.id.typeq7a2);
        q7a3_checkBox = findViewById(R.id.typeq7a3);
        q7a4_checkBox = findViewById(R.id.typeq7a4);
        q7a5_checkBox = findViewById(R.id.typeq7a5);
        q7a6_checkBox = findViewById(R.id.typeq7a6);

        q8a1_checkBox = findViewById(R.id.typeq8a1);
        q8a2_checkBox = findViewById(R.id.typeq8a2);
        q8a3_checkBox = findViewById(R.id.typeq8a3);
        q8a4_checkBox = findViewById(R.id.typeq8a4);
        q8a5_checkBox = findViewById(R.id.typeq8a5);
        q8a6_checkBox = findViewById(R.id.typeq8a6);

        q9a1_checkBox = findViewById(R.id.typeq9a1);
        q9a2_checkBox = findViewById(R.id.typeq9a2);
        q9a3_checkBox = findViewById(R.id.typeq9a3);
        q9a4_checkBox = findViewById(R.id.typeq9a4);
        q9a5_checkBox = findViewById(R.id.typeq9a5);
        q9a6_checkBox = findViewById(R.id.typeq9a6);

        q10a1_checkBox = findViewById(R.id.typeq10a1);
        q10a2_checkBox = findViewById(R.id.typeq10a2);
        q10a3_checkBox = findViewById(R.id.typeq10a3);
        q10a4_checkBox = findViewById(R.id.typeq10a4);
        q10a5_checkBox = findViewById(R.id.typeq10a5);
        q10a6_checkBox = findViewById(R.id.typeq10a6);

        q11a1_checkBox = findViewById(R.id.typeq11a1);
        q11a2_checkBox = findViewById(R.id.typeq11a2);
        q11a3_checkBox = findViewById(R.id.typeq11a3);
        q11a4_checkBox = findViewById(R.id.typeq11a4);
        q11a5_checkBox = findViewById(R.id.typeq11a5);
        q11a6_checkBox = findViewById(R.id.typeq11a6);

        q12a1_checkBox = findViewById(R.id.typeq12a1);
        q12a2_checkBox = findViewById(R.id.typeq12a2);
        q12a3_checkBox = findViewById(R.id.typeq12a3);
        q12a4_checkBox = findViewById(R.id.typeq12a4);
        q12a5_checkBox = findViewById(R.id.typeq12a5);
        q12a6_checkBox = findViewById(R.id.typeq12a6);

        q13a1_checkBox = findViewById(R.id.typeq13a1);
        q13a2_checkBox = findViewById(R.id.typeq13a2);
        q13a3_checkBox = findViewById(R.id.typeq13a3);
        q13a4_checkBox = findViewById(R.id.typeq13a4);
        q13a5_checkBox = findViewById(R.id.typeq13a5);
        q13a6_checkBox = findViewById(R.id.typeq13a6);

        q14a1_checkBox = findViewById(R.id.typeq14a1);
        q14a2_checkBox = findViewById(R.id.typeq14a2);
        q14a3_checkBox = findViewById(R.id.typeq14a3);
        q14a4_checkBox = findViewById(R.id.typeq14a4);
        q14a5_checkBox = findViewById(R.id.typeq14a5);
        q14a6_checkBox = findViewById(R.id.typeq14a6);

        q15a1_checkBox = findViewById(R.id.typeq15a1);
        q15a2_checkBox = findViewById(R.id.typeq15a2);
        q15a3_checkBox = findViewById(R.id.typeq15a3);
        q15a4_checkBox = findViewById(R.id.typeq15a4);
        q15a5_checkBox = findViewById(R.id.typeq15a5);
        q15a6_checkBox = findViewById(R.id.typeq15a6);*/

        // Name

        nameInput = ( EditText ) findViewById(R.id.nameInput);
    }

    // Checking Answers

    public void CheckAnswers(View view) {

        boolean[][] userCheckAnswers = {
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
        };

        boolean[][] correctAnswers = {
                //1
                {false, true, false},
                //2
                {true, false, false},
                //3
                {false, false, true},
                //4
                {false, true, false},
                //5
                {false, true, false},
                //6
                {false, false, true},
                //7
                {true, false, false},
                //8
                {true, false, false},
                //9
                {false, true, false},
                //10
                {false, false, true},
                //11
                {true, false, false},
                //12
                {true, false, false},
                //13
                {false, true, false},
                //14
                {true, false, false},
                //15
                {false, false, true},
        };

        // User name

        String userName = nameInput.getText().toString();

        // Radio Buttons

        //Question 1
        userCheckAnswers[0][0] = q1a1_radioButton.isChecked();
        userCheckAnswers[0][1] = q1a2_radioButton.isChecked();
        userCheckAnswers[0][2] = q1a3_radioButton.isChecked();

        //Question 2
        userCheckAnswers[1][0] = q2a1_radioButton.isChecked();
        userCheckAnswers[1][1] = q2a2_radioButton.isChecked();
        userCheckAnswers[1][2] = q2a3_radioButton.isChecked();

        //Question 3
        userCheckAnswers[2][0] = q3a1_radioButton.isChecked();
        userCheckAnswers[2][1] = q3a2_radioButton.isChecked();
        userCheckAnswers[2][2] = q3a3_radioButton.isChecked();

        //Question 4
        userCheckAnswers[3][0] = q4a1_radioButton.isChecked();
        userCheckAnswers[3][1] = q4a2_radioButton.isChecked();
        userCheckAnswers[3][2] = q4a3_radioButton.isChecked();

        //Question 5
        userCheckAnswers[4][0] = q5a1_radioButton.isChecked();
        userCheckAnswers[4][1] = q5a2_radioButton.isChecked();
        userCheckAnswers[4][2] = q5a3_radioButton.isChecked();

        //Question 6
        userCheckAnswers[5][0] = q6a1_radioButton.isChecked();
        userCheckAnswers[5][1] = q6a2_radioButton.isChecked();
        userCheckAnswers[5][2] = q6a3_radioButton.isChecked();

        //Question 7
        userCheckAnswers[6][0] = q7a1_radioButton.isChecked();
        userCheckAnswers[6][1] = q7a2_radioButton.isChecked();
        userCheckAnswers[6][2] = q7a3_radioButton.isChecked();

        //Question 8
        userCheckAnswers[7][0] = q8a1_radioButton.isChecked();
        userCheckAnswers[7][1] = q8a2_radioButton.isChecked();
        userCheckAnswers[7][2] = q8a3_radioButton.isChecked();

        //Question 9
        userCheckAnswers[8][0] = q9a1_radioButton.isChecked();
        userCheckAnswers[8][1] = q9a2_radioButton.isChecked();
        userCheckAnswers[8][2] = q9a3_radioButton.isChecked();

        //Question 10
        userCheckAnswers[9][0] = q10a1_radioButton.isChecked();
        userCheckAnswers[9][1] = q10a2_radioButton.isChecked();
        userCheckAnswers[9][2] = q10a3_radioButton.isChecked();

        //Question 11
        userCheckAnswers[10][0] = q11a1_radioButton.isChecked();
        userCheckAnswers[10][1] = q11a2_radioButton.isChecked();
        userCheckAnswers[10][2] = q11a3_radioButton.isChecked();

        //Question 12
        userCheckAnswers[11][0] = q12a1_radioButton.isChecked();
        userCheckAnswers[11][1] = q12a2_radioButton.isChecked();
        userCheckAnswers[11][2] = q12a3_radioButton.isChecked();

        //Question 13
        userCheckAnswers[12][0] = q13a1_radioButton.isChecked();
        userCheckAnswers[12][1] = q13a2_radioButton.isChecked();
        userCheckAnswers[12][2] = q13a3_radioButton.isChecked();

        //Question 14
        userCheckAnswers[13][0] = q14a1_radioButton.isChecked();
        userCheckAnswers[13][1] = q14a2_radioButton.isChecked();
        userCheckAnswers[13][2] = q14a3_radioButton.isChecked();

        //Question 15
        userCheckAnswers[14][0] = q15a1_radioButton.isChecked();
        userCheckAnswers[14][1] = q15a2_radioButton.isChecked();
        userCheckAnswers[14][2] = q15a3_radioButton.isChecked();


        //Checking arrays and making toast

        Context context = getApplicationContext();
        CharSequence text;
        int duration = Toast.LENGTH_LONG;
        int errorCount = 0;

        if (Arrays.deepEquals(userCheckAnswers, correctAnswers)) {
            text = "Congratulations " + userName + "\nYou are a true Pokemon master!";
        } else {

            for (int i = 0; i < 15; i++) {d
                for (int j = 0; j < 3; j++) {
                    if (!(userCheckAnswers[i][j] == correctAnswers[i][j])) {
                        ++errorCount;
                    }
                    Log.v("MainActivity", "ErrorCount: " + errorCount + " at i= " + i + " j= " + j);
                }

            }

            text = "Sorry " + userName + "\nYou have made " + errorCount + " mistakes.\nPlease try again.";
        }

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //Resetting Answers

        RadioGroup radioGroup1 = findViewById(R.id.q1);
        RadioGroup radioGroup2 = findViewById(R.id.q2);
        RadioGroup radioGroup3 = findViewById(R.id.q3);
        RadioGroup radioGroup4 = findViewById(R.id.q4);
        RadioGroup radioGroup5 = findViewById(R.id.q5);
        RadioGroup radioGroup6 = findViewById(R.id.q6);
        RadioGroup radioGroup7 = findViewById(R.id.q7);
        RadioGroup radioGroup8 = findViewById(R.id.q8);
        RadioGroup radioGroup9 = findViewById(R.id.q9);
        RadioGroup radioGroup10 = findViewById(R.id.q10);
        RadioGroup radioGroup11 = findViewById(R.id.q11);
        RadioGroup radioGroup12 = findViewById(R.id.q12);
        RadioGroup radioGroup13 = findViewById(R.id.q13);
        RadioGroup radioGroup14 = findViewById(R.id.q14);
        RadioGroup radioGroup15 = findViewById(R.id.q15);

        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();
        radioGroup7.clearCheck();
        radioGroup8.clearCheck();
        radioGroup9.clearCheck();
        radioGroup10.clearCheck();
        radioGroup11.clearCheck();
        radioGroup12.clearCheck();
        radioGroup13.clearCheck();
        radioGroup14.clearCheck();
        radioGroup15.clearCheck();
/*

        if (q1a1_checkBox.isChecked()) q1a1_checkBox.toggle();
        if (q1a2_checkBox.isChecked()) q1a2_checkBox.toggle();
        if (q1a3_checkBox.isChecked()) q1a3_checkBox.toggle();
        if (q1a4_checkBox.isChecked()) q1a4_checkBox.toggle();
        if (q1a5_checkBox.isChecked()) q1a5_checkBox.toggle();
        if (q1a6_checkBox.isChecked()) q1a6_checkBox.toggle();

        if (q2a1_checkBox.isChecked()) q2a1_checkBox.toggle();
        if (q2a2_checkBox.isChecked()) q2a2_checkBox.toggle();
        if (q2a3_checkBox.isChecked()) q2a3_checkBox.toggle();
        if (q2a4_checkBox.isChecked()) q2a4_checkBox.toggle();
        if (q2a5_checkBox.isChecked()) q2a5_checkBox.toggle();
        if (q2a6_checkBox.isChecked()) q2a6_checkBox.toggle();

        if (q3a1_checkBox.isChecked()) q3a1_checkBox.toggle();
        if (q3a2_checkBox.isChecked()) q3a2_checkBox.toggle();
        if (q3a3_checkBox.isChecked()) q3a3_checkBox.toggle();
        if (q3a4_checkBox.isChecked()) q3a4_checkBox.toggle();
        if (q3a5_checkBox.isChecked()) q3a5_checkBox.toggle();
        if (q3a6_checkBox.isChecked()) q3a6_checkBox.toggle();

        if (q4a1_checkBox.isChecked()) q4a1_checkBox.toggle();
        if (q4a2_checkBox.isChecked()) q4a2_checkBox.toggle();
        if (q4a3_checkBox.isChecked()) q4a3_checkBox.toggle();
        if (q4a4_checkBox.isChecked()) q4a4_checkBox.toggle();
        if (q4a5_checkBox.isChecked()) q4a5_checkBox.toggle();
        if (q4a6_checkBox.isChecked()) q4a6_checkBox.toggle();

        if (q5a1_checkBox.isChecked()) q5a1_checkBox.toggle();
        if (q5a2_checkBox.isChecked()) q5a2_checkBox.toggle();
        if (q5a3_checkBox.isChecked()) q5a3_checkBox.toggle();
        if (q5a4_checkBox.isChecked()) q5a4_checkBox.toggle();
        if (q5a5_checkBox.isChecked()) q5a5_checkBox.toggle();
        if (q5a6_checkBox.isChecked()) q5a6_checkBox.toggle();

        if (q6a1_checkBox.isChecked()) q6a1_checkBox.toggle();
        if (q6a2_checkBox.isChecked()) q6a2_checkBox.toggle();
        if (q6a3_checkBox.isChecked()) q6a3_checkBox.toggle();
        if (q6a4_checkBox.isChecked()) q6a4_checkBox.toggle();
        if (q6a5_checkBox.isChecked()) q6a5_checkBox.toggle();
        if (q6a6_checkBox.isChecked()) q6a6_checkBox.toggle();

        if (q7a1_checkBox.isChecked()) q7a1_checkBox.toggle();
        if (q7a2_checkBox.isChecked()) q7a2_checkBox.toggle();
        if (q7a3_checkBox.isChecked()) q7a3_checkBox.toggle();
        if (q7a4_checkBox.isChecked()) q7a4_checkBox.toggle();
        if (q7a5_checkBox.isChecked()) q7a5_checkBox.toggle();
        if (q7a6_checkBox.isChecked()) q7a6_checkBox.toggle();

        if (q8a1_checkBox.isChecked()) q8a1_checkBox.toggle();
        if (q8a2_checkBox.isChecked()) q8a2_checkBox.toggle();
        if (q8a3_checkBox.isChecked()) q8a3_checkBox.toggle();
        if (q8a4_checkBox.isChecked()) q8a4_checkBox.toggle();
        if (q8a5_checkBox.isChecked()) q8a5_checkBox.toggle();
        if (q8a6_checkBox.isChecked()) q8a6_checkBox.toggle();

        if (q9a1_checkBox.isChecked()) q9a1_checkBox.toggle();
        if (q9a2_checkBox.isChecked()) q9a2_checkBox.toggle();
        if (q9a3_checkBox.isChecked()) q9a3_checkBox.toggle();
        if (q9a4_checkBox.isChecked()) q9a4_checkBox.toggle();
        if (q9a5_checkBox.isChecked()) q9a5_checkBox.toggle();
        if (q9a6_checkBox.isChecked()) q9a6_checkBox.toggle();

        if (q10a1_checkBox.isChecked()) q10a1_checkBox.toggle();
        if (q10a2_checkBox.isChecked()) q10a2_checkBox.toggle();
        if (q10a3_checkBox.isChecked()) q10a3_checkBox.toggle();
        if (q10a4_checkBox.isChecked()) q10a4_checkBox.toggle();
        if (q10a5_checkBox.isChecked()) q10a5_checkBox.toggle();
        if (q10a6_checkBox.isChecked()) q10a6_checkBox.toggle();

        if (q11a1_checkBox.isChecked()) q11a1_checkBox.toggle();
        if (q11a2_checkBox.isChecked()) q11a2_checkBox.toggle();
        if (q11a3_checkBox.isChecked()) q11a3_checkBox.toggle();
        if (q11a4_checkBox.isChecked()) q11a4_checkBox.toggle();
        if (q11a5_checkBox.isChecked()) q11a5_checkBox.toggle();
        if (q11a6_checkBox.isChecked()) q11a6_checkBox.toggle();

        if (q12a1_checkBox.isChecked()) q12a1_checkBox.toggle();
        if (q12a2_checkBox.isChecked()) q12a2_checkBox.toggle();
        if (q12a3_checkBox.isChecked()) q12a3_checkBox.toggle();
        if (q12a4_checkBox.isChecked()) q12a4_checkBox.toggle();
        if (q12a5_checkBox.isChecked()) q12a5_checkBox.toggle();
        if (q12a6_checkBox.isChecked()) q12a6_checkBox.toggle();

        if (q13a1_checkBox.isChecked()) q13a1_checkBox.toggle();
        if (q13a2_checkBox.isChecked()) q13a2_checkBox.toggle();
        if (q13a3_checkBox.isChecked()) q13a3_checkBox.toggle();
        if (q13a4_checkBox.isChecked()) q13a4_checkBox.toggle();
        if (q13a5_checkBox.isChecked()) q13a5_checkBox.toggle();
        if (q13a6_checkBox.isChecked()) q13a6_checkBox.toggle();

        if (q14a1_checkBox.isChecked()) q14a1_checkBox.toggle();
        if (q14a2_checkBox.isChecked()) q14a2_checkBox.toggle();
        if (q14a3_checkBox.isChecked()) q14a3_checkBox.toggle();
        if (q14a4_checkBox.isChecked()) q14a4_checkBox.toggle();
        if (q14a5_checkBox.isChecked()) q14a5_checkBox.toggle();
        if (q14a6_checkBox.isChecked()) q14a6_checkBox.toggle();

        if (q15a1_checkBox.isChecked()) q15a1_checkBox.toggle();
        if (q15a2_checkBox.isChecked()) q15a2_checkBox.toggle();
        if (q15a3_checkBox.isChecked()) q15a3_checkBox.toggle();
        if (q15a4_checkBox.isChecked()) q15a4_checkBox.toggle();
        if (q15a5_checkBox.isChecked()) q15a5_checkBox.toggle();
        if (q15a6_checkBox.isChecked()) q15a6_checkBox.toggle();
*/

    }
}