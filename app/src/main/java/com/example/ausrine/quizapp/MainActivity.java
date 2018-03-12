package com.example.ausrine.quizapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import java.util.Arrays;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    //EditText's score
    int totalScoreEditText = 0;

    //Ranking by question
    int ranking = 0;

    //Grading
    int grading = 0;

    //Radio Groups Score
    int scoreRadioButtonSetQ1 = 0;
    int scoreRadioButtonSetQ2 = 0;
    int scoreRadioButtonSetQ3 = 0;
    int scoreRadioButtonSetQ4 = 0;

    //Check Box Score
    int scoreCheckBoxQ1 = 0;
    int scoreCheckBoxQ2 = 0;
    int scoreCheckBoxQ3 = 0;
    int scoreCheckBoxQ4 = 0;

    EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //The reset button is not visible
        Button resetButton = this.findViewById(R.id.btn_toast_reset);
        resetButton.setVisibility(View.GONE);
    }

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


    public void onCheckBoxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // What is the current ranking?
        int scoreCheckBox = 0;
        // Check which checkbox was clicked
        switch (view.getId()) {
            //Q1
            case R.id.typeq1a1_true & R.id.typeq1a3_true:
                if (checked) {
                    scoreCheckBoxQ1 = 1;
                } else {
                    scoreCheckBoxQ1 = 0;
                }

            //Q2

            case R.id.typeq2a1_true & R.id.typeq2a5_true:
                if (checked) {
                    scoreCheckBoxQ2 = 1;
                } else {
                    scoreCheckBoxQ2 = 0;
                }

            //Q3

            case R.id.typeq3a3_true & R.id.typeq3a4_true:
                if (checked) {
                    scoreCheckBoxQ3 = 1;
                } else {
                    scoreCheckBoxQ3 = 0;
                }

            //Q4

            case R.id.typeq4a2_true & R.id.typeq4a5_true:
                if (checked) {
                    scoreCheckBoxQ4 = 1;
                } else {
                    scoreCheckBoxQ4 = 0;
                }

        }
        }

    //Total Pokemon Question
    public void checkEditText() {
        EditText textNumber = findViewById(R.id.answerInput);
        int numberChosen = Integer.parseInt(textNumber.getText().toString());
        //What is the current ranking?
        totalScoreEditText = ranking;
        if (numberChosen == 807) {
            totalScoreEditText = 1;
        }
        if (numberChosen != 807) {
            totalScoreEditText = 0;
        }
    }
        //Total answer sum
    public void showGrading(View view) {
        checkEditText();
        grading = 0;
        grading = scoreRadioButtonSetQ1 + scoreRadioButtonSetQ2 + scoreRadioButtonSetQ3 +
                scoreRadioButtonSetQ4 + scoreCheckBoxQ1 + scoreCheckBoxQ2 + scoreCheckBoxQ3 + scoreCheckBoxQ4 + totalScoreEditText;

        nameInput = ( EditText ) findViewById(R.id.nameInput);

    String nameOfPerson = nameInput.getText().toString();
    Context context = getApplicationContext();
    CharSequence text = (nameOfPerson + ", " + getString(R.string.yourScoreIs) + " " + grading + " " + getString(R.string.yourScoreMessage));
    int duration = Toast.LENGTH_SHORT;
    Toast toast = Toast.makeText(context, text, duration);
    toast.show();
    showResetButton();
}
    private void showResetButton() {
        Button resetButton = this.findViewById(R.id.btn_toast_reset);
        resetButton.setVisibility(View.VISIBLE);
    }

    public void resetGrading(View view) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
        grading = 0;
    }
}