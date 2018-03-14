package com.example.ausrine.quizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Name
    EditText nameInput;

    //Grading
    int grading;

    //Radio Buttons Score
    int scoreRadioButtonSetQ1;
    int scoreRadioButtonSetQ2;
    int scoreRadioButtonSetQ3;
    int scoreRadioButtonSetQ4;

    //Radio Buttons

    //Q1
    private RadioButton radioButtonQ1A1;
    private RadioButton radioButtonQ1A2;
    private RadioButton radioButtonQ1A3;

    //Q2
    private RadioButton radioButtonQ2A1;
    private RadioButton radioButtonQ2A2;
    private RadioButton radioButtonQ2A3;

    //Q3
    private RadioButton radioButtonQ3A1;
    private RadioButton radioButtonQ3A2;
    private RadioButton radioButtonQ3A3;

    //Q4
    private RadioButton radioButtonQ4A1;
    private RadioButton radioButtonQ4A2;
    private RadioButton radioButtonQ4A3;

    //Check Box Score
    int scoreCheckBoxQ1;
    int scoreCheckBoxQ2;
    int scoreCheckBoxQ3;
    int scoreCheckBoxQ4;

    //Radio Buttons

    //Q1
    private CheckBox checkBoxQ1A1;
    private CheckBox checkBoxQ1A2;
    private CheckBox checkBoxQ1A3;
    private CheckBox checkBoxQ1A4;
    private CheckBox checkBoxQ1A5;
    private CheckBox checkBoxQ1A6;

    //Q2
    private CheckBox checkBoxQ2A1;
    private CheckBox checkBoxQ2A2;
    private CheckBox checkBoxQ2A3;
    private CheckBox checkBoxQ2A4;
    private CheckBox checkBoxQ2A5;
    private CheckBox checkBoxQ2A6;

    //Q3
    private CheckBox checkBoxQ3A1;
    private CheckBox checkBoxQ3A2;
    private CheckBox checkBoxQ3A3;
    private CheckBox checkBoxQ3A4;
    private CheckBox checkBoxQ3A5;
    private CheckBox checkBoxQ3A6;

    //Q4
    private CheckBox checkBoxQ4A1;
    private CheckBox checkBoxQ4A2;
    private CheckBox checkBoxQ4A3;
    private CheckBox checkBoxQ4A4;
    private CheckBox checkBoxQ4A5;
    private CheckBox checkBoxQ4A6;

    //EditText Answer
    EditText editTextAnswer;

    //EditText's Score
    int scoreEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //The reset button is not visible
        Button resetButton = this.findViewById(R.id.btn_toast_reset);
        resetButton.setVisibility(View.GONE);

        //Retrieve views

        //Check Boxes

        //Q1
        checkBoxQ1A1 = findViewById(R.id.typeq1a1_true);
        checkBoxQ1A2 = findViewById(R.id.typeq1a2);
        checkBoxQ1A3 = findViewById(R.id.typeq1a3_true);
        checkBoxQ1A4 = findViewById(R.id.typeq1a4);
        checkBoxQ1A5 = findViewById(R.id.typeq1a5);
        checkBoxQ1A6 = findViewById(R.id.typeq1a6);


        //Q2
        checkBoxQ2A1 = findViewById(R.id.typeq2a1_true);
        checkBoxQ2A2 = findViewById(R.id.typeq2a2);
        checkBoxQ2A3 = findViewById(R.id.typeq2a3);
        checkBoxQ2A4 = findViewById(R.id.typeq2a4);
        checkBoxQ2A5 = findViewById(R.id.typeq2a5_true);
        checkBoxQ2A6 = findViewById(R.id.typeq2a6);

        //Q3
        checkBoxQ3A1 = findViewById(R.id.typeq3a1);
        checkBoxQ3A2 = findViewById(R.id.typeq3a2);
        checkBoxQ3A3 = findViewById(R.id.typeq3a3_true);
        checkBoxQ3A4 = findViewById(R.id.typeq3a4_true);
        checkBoxQ3A5 = findViewById(R.id.typeq3a5);
        checkBoxQ3A6 = findViewById(R.id.typeq3a6);

        //Q4
        checkBoxQ4A1 = findViewById(R.id.typeq4a1);
        checkBoxQ4A2 = findViewById(R.id.typeq4a2_true);
        checkBoxQ4A3 = findViewById(R.id.typeq4a3);
        checkBoxQ4A4 = findViewById(R.id.typeq4a4);
        checkBoxQ4A5 = findViewById(R.id.typeq4a5_true);
        checkBoxQ4A6 = findViewById(R.id.typeq4a6);

        //Radio Buttons

        //Q1
        radioButtonQ1A1 = findViewById(R.id.q1a1);
        radioButtonQ1A2 = findViewById(R.id.q1a2);
        radioButtonQ1A3 = findViewById(R.id.q1a3_true);

        //Q1
        radioButtonQ2A1 = findViewById(R.id.q2a1_true);
        radioButtonQ2A2 = findViewById(R.id.q2a2);
        radioButtonQ2A3 = findViewById(R.id.q2a3);

        //Q1
        radioButtonQ3A1 = findViewById(R.id.q3a1_true);
        radioButtonQ3A2 = findViewById(R.id.q3a2);
        radioButtonQ3A3 = findViewById(R.id.q3a3);

        //Q1
        radioButtonQ4A1 = findViewById(R.id.q4a1);
        radioButtonQ4A2 = findViewById(R.id.q4a2_true);
        radioButtonQ4A3 = findViewById(R.id.q4a3);
    }

    //Total Answer Sum
    public void showGrading(View view) {

        //Reset score to 0
        grading = 0;

        //Check EditText Question
        editTextAnswer = findViewById(R.id.answerInput);
        String textNumber = editTextAnswer.getText().toString().trim();
        if (textNumber == null | textNumber.isEmpty()) {
            Toast.makeText(this, getString(R.string.missingInfo), Toast.LENGTH_LONG).show();
            return;
        } else {
            int numberChosen = Integer.parseInt(editTextAnswer.getText().toString());
            //What is the current ranking?
            if (numberChosen == 807) {
                scoreEditText = 1;
            }
            if (numberChosen != 807) {
                scoreEditText = 0;
            }
        }

        //Check Check Box Questions

        //Q1
        if (checkBoxQ1A1.isChecked() && !checkBoxQ1A2.isChecked() && checkBoxQ1A3.isChecked() && !checkBoxQ1A4.isChecked() && !checkBoxQ1A5.isChecked() && !checkBoxQ1A6.isChecked())
            scoreCheckBoxQ1 = 1;
        //Q2
        if (checkBoxQ2A1.isChecked() && !checkBoxQ2A2.isChecked() && !checkBoxQ2A3.isChecked() && !checkBoxQ2A4.isChecked() && checkBoxQ2A5.isChecked() && !checkBoxQ2A6.isChecked())
            scoreCheckBoxQ2 = 1;
        //Q3
        if (!checkBoxQ3A1.isChecked() && !checkBoxQ3A2.isChecked() && checkBoxQ3A3.isChecked() && checkBoxQ3A4.isChecked() && !checkBoxQ3A5.isChecked() && !checkBoxQ3A6.isChecked())
            scoreCheckBoxQ3 = 1;
        //Q4
        if (!checkBoxQ4A1.isChecked() && checkBoxQ4A2.isChecked() && !checkBoxQ4A3.isChecked() && !checkBoxQ4A4.isChecked() && checkBoxQ4A5.isChecked() && !checkBoxQ4A6.isChecked())
            scoreCheckBoxQ4 = 1;

        // Check Radio Button Questions
        //Q1
        if (!radioButtonQ1A1.isChecked() && !radioButtonQ1A2.isChecked() && radioButtonQ1A3.isChecked())
            scoreRadioButtonSetQ1 = 1;

        //Q2
        if (radioButtonQ2A1.isChecked() && !radioButtonQ2A2.isChecked() && !radioButtonQ2A3.isChecked())
            scoreRadioButtonSetQ2 = 1;

        //Q3
        if (radioButtonQ3A1.isChecked() && !radioButtonQ3A2.isChecked() && !radioButtonQ3A3.isChecked())
            scoreRadioButtonSetQ3 = 1;

        //Q4
        if (!radioButtonQ4A1.isChecked() && radioButtonQ4A2.isChecked() && !radioButtonQ4A3.isChecked())
            scoreRadioButtonSetQ4 = 1;

        //Calculate Final Score
        grading = scoreRadioButtonSetQ1 + scoreRadioButtonSetQ2 + scoreRadioButtonSetQ3 +
                scoreRadioButtonSetQ4 + scoreCheckBoxQ1 + scoreCheckBoxQ2 + scoreCheckBoxQ3 + scoreCheckBoxQ4 + scoreEditText;

        //Prepare Toast
        nameInput = findViewById(R.id.nameInput);
        String nameOfPerson = nameInput.getText().toString();
        Context context = getApplicationContext();
        CharSequence text = (nameOfPerson + ", " + getString(R.string.yourScoreIs) + " " + grading + " " + getString(R.string.yourScoreMessage));
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        showResetButton();
    }

    //Show Reset Button
    private void showResetButton() {
        Button resetButton = this.findViewById(R.id.btn_toast_reset);
        resetButton.setVisibility(View.VISIBLE);
    }

    //Reset Grading
    public void resetGrading(View view) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
        grading = 0;
    }
}
