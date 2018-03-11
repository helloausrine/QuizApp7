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
    int scoreRadioButtonSetQ5 = 0;
    int scoreRadioButtonSetQ6 = 0;
    int scoreRadioButtonSetQ7 = 0;
    int scoreRadioButtonSetQ8 = 0;
    int scoreRadioButtonSetQ9 = 0;
    int scoreRadioButtonSetQ10 = 0;
    int scoreRadioButtonSetQ11 = 0;
    int scoreRadioButtonSetQ12 = 0;
    int scoreRadioButtonSetQ13 = 0;
    int scoreRadioButtonSetQ14 = 0;
    int scoreRadioButtonSetQ15 = 0;

    //Check Box Score
    int scoreCheckBoxQ1 = 0;
    int scoreCheckBoxQ2 = 0;
    int scoreCheckBoxQ3 = 0;
    int scoreCheckBoxQ4 = 0;
    int scoreCheckBoxQ5 = 0;
    int scoreCheckBoxQ6 = 0;
    int scoreCheckBoxQ7 = 0;
    int scoreCheckBoxQ8 = 0;
    int scoreCheckBoxQ9 = 0;
    int scoreCheckBoxQ10 = 0;
    int scoreCheckBoxQ11 = 0;
    int scoreCheckBoxQ12 = 0;
    int scoreCheckBoxQ13 = 0;
    int scoreCheckBoxQ14 = 0;
    int scoreCheckBoxQ15 = 0;

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
            case R.id.q1a2_true:
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
            case R.id.q3a3_true:
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

    //Q5
    public void onRadioButtonSetQ5Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q5a2_true:
                if (checked) {
                    scoreRadioButtonSetQ5 = 1;
                } else {
                    scoreRadioButtonSetQ5 = 0;
                }
        }
    }

    //Q6
    public void onRadioButtonSetQ6Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q6a3_true:
                if (checked) {
                    scoreRadioButtonSetQ6 = 1;
                } else {
                    scoreRadioButtonSetQ6 = 0;
                }
        }
    }

    //Q7
    public void onRadioButtonSetQ7Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q7a1_true:
                if (checked) {
                    scoreRadioButtonSetQ7 = 1;
                } else {
                    scoreRadioButtonSetQ7 = 0;
                }
        }
    }

    //Q8
    public void onRadioButtonSetQ8Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q8a1_true:
                if (checked) {
                    scoreRadioButtonSetQ8 = 1;
                } else {
                    scoreRadioButtonSetQ8 = 0;
                }
        }
    }

    //Q9
    public void onRadioButtonSetQ9Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q9a2_true:
                if (checked) {
                    scoreRadioButtonSetQ9 = 1;
                } else {
                    scoreRadioButtonSetQ9 = 0;
                }
        }
    }

    //Q10
    public void onRadioButtonSetQ10Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q10a3_true:
                if (checked) {
                    scoreRadioButtonSetQ10 = 1;
                } else {
                    scoreRadioButtonSetQ10 = 0;
                }
        }
    }

    //Q11
    public void onRadioButtonSetQ11Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q11a1_true:
                if (checked) {
                    scoreRadioButtonSetQ11 = 1;
                } else {
                    scoreRadioButtonSetQ11 = 0;
                }
        }
    }

    //Q12
    public void onRadioButtonSetQ12Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q12a1_true:
                if (checked) {
                    scoreRadioButtonSetQ12 = 1;
                } else {
                    scoreRadioButtonSetQ12 = 0;
                }
        }
    }

    //Q13
    public void onRadioButtonSetQ13Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // What is the current ranking?
        scoreRadioButtonSetQ13 = ranking;
        // Checks which radio button was clicked and calls the adequate ranking method if checked
        switch (view.getId()) {
            case R.id.q13a2_true:
                if (checked) {
                    scoreRadioButtonSetQ13 = 1;
                } else {
                    scoreRadioButtonSetQ13 = 0;
                }
        }
    }
    //Q14
    public void onRadioButtonSetQ14Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.q14a1_true:
                if (checked) {
                    scoreRadioButtonSetQ14 = 1;
                } else {
                    scoreRadioButtonSetQ14 = 0;
                }
        }
    }

    //Q15
    public void onRadioButtonSetQ15Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q15a3_true:
                if (checked) {
                    scoreRadioButtonSetQ15 = 1;
                } else {
                    scoreRadioButtonSetQ15 = 0;
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
            case R.id.typeq1a5_true:
                if (checked) {
                    scoreCheckBoxQ1 = 1;
                } else {
                    scoreCheckBoxQ1 = 0;
                }

            //Q2

            case R.id.typeq2a4_true:
                if (checked) {
                    scoreCheckBoxQ2 = 1;
                } else {
                    scoreCheckBoxQ2 = 0;
                }

            //Q3

            case R.id.typeq3a3_true:
                if (checked) {
                    scoreCheckBoxQ3 = 1;
                } else {
                    scoreCheckBoxQ3 = 0;
                }

            //Q4

            case R.id.typeq4a5_true:
                if (checked) {
                    scoreCheckBoxQ4 = 1;
                } else {
                    scoreCheckBoxQ4 = 0;
                }

            //Q5
            case R.id.typeq5a1_true:
                if (checked) {
                    scoreCheckBoxQ5 = 1;
                } else {
                    scoreCheckBoxQ5 = 0;
                }

            //Q6
            case R.id.typeq6a1_true & R.id.typeq6a3_true:
                if (checked) {
                    scoreCheckBoxQ6 = 1;
                } else {
                    scoreCheckBoxQ6 = 0;
                }

            //Q7
            case R.id.typeq7a1_true & R.id.typeq7a5_true:
                if (checked) {
                    scoreCheckBoxQ7 = 1;
                } else {
                    scoreCheckBoxQ7 = 0;
                }

            //Q8
            case R.id.typeq8a3_true & R.id.typeq8a4_true:
                if (checked) {
                    scoreCheckBoxQ8 = 1;
                } else {
                    scoreCheckBoxQ8 = 0;
                }

            //Q9
            case R.id.typeq9a5_true:
                if (checked) {
                    scoreCheckBoxQ9 = 1;
                } else {
                    scoreCheckBoxQ9 = 0;
                }

            case R.id.typeq9a2_true:
                if (checked) {
                    scoreCheckBoxQ9 = 1;
                } else {
                    scoreCheckBoxQ9 = 0;
                }

            //Q10

            case R.id.typeq10a2_true & R.id.typeq10a3_true:
                if (checked) {
                    scoreCheckBoxQ10 = 1;
                } else {
                    scoreCheckBoxQ10 = 0;
                }

            //Q11
            case R.id.typeq11a4_true:
                if (checked) {
                    scoreCheckBoxQ11 = 1;
                } else {
                    scoreCheckBoxQ11 = 0;
                }

            //Q12
            case R.id.typeq12a1_true:
                if (checked) {
                    scoreCheckBoxQ12 = 1;
                } else {
                    scoreCheckBoxQ12 = 0;
                }

            //Q13
            case R.id.typeq13a1_true & R.id.typeq13a2_true:
                if (checked) {
                    scoreCheckBoxQ13 = 1;
                } else {
                    scoreCheckBoxQ13 = 0;
                }

            //Q14
            case R.id.typeq14a1_true & R.id.typeq14a6_true:
                if (checked) {
                    scoreCheckBoxQ14 = 1;
                } else {
                    scoreCheckBoxQ14 = 0;
                }

            //Q15
            case R.id.typeq15a4_true:
                if (checked) {
                    scoreCheckBoxQ15 = 1;
                } else {
                    scoreCheckBoxQ15 = 0;
                }
        }
        }

        //Total answer sum
    public void showGrading(View view) {
        grading = 0;

        grading = scoreRadioButtonSetQ1 + scoreRadioButtonSetQ2 + scoreRadioButtonSetQ3 +
                scoreRadioButtonSetQ4 + scoreRadioButtonSetQ5 + scoreRadioButtonSetQ6 + scoreRadioButtonSetQ7 +
                scoreRadioButtonSetQ8 + scoreRadioButtonSetQ9 + scoreRadioButtonSetQ10 + scoreRadioButtonSetQ11 +
                scoreRadioButtonSetQ12 + scoreRadioButtonSetQ13 + scoreRadioButtonSetQ14 + scoreRadioButtonSetQ15 +
                scoreCheckBoxQ1 + scoreCheckBoxQ2 + scoreCheckBoxQ3 + scoreCheckBoxQ4 + scoreCheckBoxQ5 + scoreCheckBoxQ6 +
                scoreCheckBoxQ7 + scoreCheckBoxQ8 + scoreCheckBoxQ9 + scoreCheckBoxQ10 + scoreCheckBoxQ11 + scoreCheckBoxQ12 +
                scoreCheckBoxQ13 + scoreCheckBoxQ14 + scoreCheckBoxQ15;

        nameInput = ( EditText ) findViewById(R.id.nameInput);

    String nameOfPerson = nameInput.getText().toString();
    Context context = getApplicationContext();
    CharSequence text = (nameOfPerson + ",  " + getString(R.string.yourScoreIs) + "  " + grading + "  " + getString(R.string.yourScoreMessage));
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



/*

    //Total Pokemon Question
    public void checkEditText(View view) {
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
        //What is the new ranking?
        ranking = totalScoreEditText;
    }

    //Grading
    public void showGrading(View view) {
        //What is the final grading?
        grading = totalScoreRadioButton + totalScoreCheckBox + totalScoreEditText;
        // Inflates the Layout
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_grading,
                (ViewGroup) findViewById(R.id.custom_toast_layout));
        //Set the Text to show in TextView
        TextView text01 = findViewById(R.id.text_grading01);
        text01.setText(R.string.toast01_congrats);
        TextView text02 = findViewById(R.id.text_grading02);
        text02.setText(MessageFormat.format("{0}{1}{2}", String.format("%d", grading),
                getString(R.string.grading_out_of), getString(R.string.grading_10)));
        TextView text03 = findViewById(R.id.text_grading03);
        text03.setText(R.string.toast01_plant);
        //Show the toast
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
        showResetButton();
    }


    public void resetGrading(View view) {
        //Reset the final score
        grading = 0;
        // Inflate the Layout
        LayoutInflater inflater02 = getLayoutInflater();
        View layout02 = inflater02.inflate(R.layout.toast_reset,
                (ViewGroup) findViewById(R.id.custom_toast_layout02));
        //Set the Text to show in TextView
        TextView text04 = findViewById(R.id.text_reset01);
        text04.setText(R.string.toast02_reset);
        //Show the toast
        Toast toast02 = new Toast(getApplicationContext());
        toast02.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast02.setDuration(Toast.LENGTH_LONG);
        toast02.setView(layout02);
        toast02.show();
        switch (view.getId()) {
            case R.id.btn_toast_reset:
                Intent intent = getIntent();
                finish();
                startActivity(intent);
                break;
            default:
                break;
        }
    }
*/

}