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

    //Radio Groups Score
    int scoreRadioButtonSetQ1;
    int scoreRadioButtonSetQ2;
    int scoreRadioButtonSetQ3;
    int scoreRadioButtonSetQ4;

    //Check Box Score
    int scoreCheckBoxQ1;
    int scoreCheckBoxQ2;
    int scoreCheckBoxQ3;
    int scoreCheckBoxQ4;

    //EditText Answer
    EditText editTextAnswer;

    //EditText's score
    int scoreEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //The reset button is not visible
        Button resetButton = this.findViewById(R.id.btn_toast_reset);
        resetButton.setVisibility(View.GONE);
    }

    //RadioButton Questions

    //Q1
    public void onRadioButtonSetQ1Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q1a3_true:
                if (checked) {
                    scoreRadioButtonSetQ1 = 1;
                } else {
                    scoreRadioButtonSetQ1 = 0;
                }
        }
    }

    //Q2
    public void onRadioButtonSetQ2Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q2a1_true:
                if (checked) {
                    scoreRadioButtonSetQ2 = 1;
                } else {
                    scoreRadioButtonSetQ2 = 0;
                }
        }
    }

    //Q3
    public void onRadioButtonSetQ3Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q3a1_true:
                if (checked) {
                    scoreRadioButtonSetQ3 = 1;
                } else {
                    scoreRadioButtonSetQ3 = 0;
                }
        }
    }

    //Q4
    public void onRadioButtonSetQ4Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q4a2_true:
                if (checked) {
                    scoreRadioButtonSetQ4 = 1;
                } else {
                    scoreRadioButtonSetQ4 = 0;
                }
        }
    }

    //CheckBox Questions

    //Q1
    public void onCheckBoxClicked1(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.typeq1a1_true & R.id.typeq1a3_true:
                if (checked) {
                    scoreCheckBoxQ1 = 1;
                } else {
                    scoreCheckBoxQ1 = 0;
                }
        }
    }

    //Q2
    public void onCheckBoxClicked2(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.typeq2a1_true & R.id.typeq2a5_true:
                if (checked) {
                    scoreCheckBoxQ2 = 1;
                } else {
                    scoreCheckBoxQ2 = 0;
                }
        }
    }

    //Q3
    public void onCheckBoxClicked3(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.typeq3a3_true & R.id.typeq3a4_true:
                if (checked) {
                    scoreCheckBoxQ3 = 1;
                } else {
                    scoreCheckBoxQ3 = 0;
                }
        }
    }

    //Q4
    public void onCheckBoxClicked4(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.typeq4a2_true & R.id.typeq4a5_true:
                if (checked) {
                    scoreCheckBoxQ4 = 1;
                } else {
                    scoreCheckBoxQ4 = 0;
                }
        }
    }

    //Last Question - EditText Question
    public void checkEditText() {
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
    }

    //Total Answer Sum
    public void showGrading(View view) {

        //Reset score to 0
        grading = 0;

        //Check EditText Question
        checkEditText();

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