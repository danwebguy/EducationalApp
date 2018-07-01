package com.example.android.educationalapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {

    // Answer to Question 1
    RadioButton question1Answer1;
    // Answer to Question 2
    EditText question2Answer;
    // Answer to Question 3
    CheckBox question3Answer1;
    CheckBox question3Answer2;
    CheckBox question3Answer3;
    CheckBox question3Answer4;
    CheckBox question3Answer5;
    // Answer to  Question 4
    EditText question4Answer;
    // Answer to Question 5
    RadioButton question5Answer2;
    // Question 6
    EditText question6Answer;
    // Answer to Question 7
    CheckBox question7Answer1;
    CheckBox question7Answer2;
    CheckBox question7Answer3;
    CheckBox question7Answer4;
    CheckBox question7Answer5;
    // Answer to Question 8
    EditText question8Answer;
    // Answer to Question 9
    RadioButton question9Answer4;
    // Answer to  Question 10
    EditText question10Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        // Get the Full Name from MainActivity
        Intent intent = getIntent();
        String text = intent.getStringExtra(Intent.EXTRA_TEXT);

        // Set the Welcome Message
        TextView textView = (TextView) findViewById(R.id.welcomeText);
        textView.setText(getString(R.string.welcomeMessage) + text + getString(R.string.welcomeMessage1));
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitAnswers(View view) {

        CharSequence resultsDisplay;
        int answer1Score;
        int answer2Score;
        int answer3Score;
        int answer4Score;
        int answer5Score;
        int answer6Score;
        int answer7Score;
        int answer8Score;
        int answer9Score;
        int answer10Score;
        int finalScore;

        /**
         * Question 1 - Correct Answer is "Herbert Macaulay"
         * Checks if the correct answer for Question1 is selected
         * Adds a score (0 if the answer is not correct and 1 if the answer is correct) to the answer1Score variable
         */
        Boolean answer1;

        question1Answer1 = (RadioButton) this.findViewById(R.id.question1Answer1);
        answer1 = question1Answer1.isChecked();
        if (answer1) {
            answer1Score = 1;
        } else {
            answer1Score = 0;
        }

        /**
         * Question 2 - Correct Answer is "President Muhammadu Buhari"
         * This checks if the correct answer for Question2 is typed
         * Removes the white spaces and changes the text inputted to lowercase
         * Adds a score (0 if the answer is not correct and 1 if the answer is correct) to the answer2Score variable
         */
        String answer2;
        question2Answer = (EditText) this.findViewById(R.id.question2Answer);
        answer2 = question2Answer.getText().toString().trim().toLowerCase();
        if (answer2.equals("president muhammadu buhari")) {
            answer2Score = 1;
        } else {
            answer2Score = 0;
        }

        /**
         * Question 3 - Correct Answers are 1. (1985) 2. (1993) 3. (2007) 4. (2013)
         * This checks if the correct answers for Question3 are selected
         * Adds a score (0 if the answer is not correct and 1 if the answer is correct) to the answer3Score variable
         */
        Boolean answer3Answer1;
        Boolean answer3Answer2;
        Boolean answer3Answer3;
        Boolean answer3Answer4;
        Boolean answer3Answer5;
        question3Answer1 = (CheckBox) this.findViewById(R.id.question3Answer1);
        question3Answer2 = (CheckBox) this.findViewById(R.id.question3Answer2);
        question3Answer3 = (CheckBox) this.findViewById(R.id.question3Answer3);
        question3Answer4 = (CheckBox) this.findViewById(R.id.question3Answer4);
        question3Answer5 = (CheckBox) this.findViewById(R.id.question3Answer5);
        answer3Answer1 = question3Answer1.isChecked();
        answer3Answer2 = question3Answer2.isChecked();
        answer3Answer3 = question3Answer3.isChecked();
        answer3Answer4 = question3Answer4.isChecked();
        answer3Answer5 = question3Answer5.isChecked();
        if (answer3Answer1 && answer3Answer2 && answer3Answer3 && answer3Answer4 && !answer3Answer5) {
            answer3Score = 1;
        } else {
            answer3Score = 0;
        }

        /**
         * Question 4 - Correct Answer is "Super Eagles"
         * This checks if the correct answer for Question4 is typed
         * Removes the white spaces and changes the text inputted to lowercase
         * Adds a score (0 if the answer is not correct and 1 if the answer is correct) to the answer4Score variable
         */
        String answer4;
        question4Answer = (EditText) this.findViewById(R.id.question4Answer);
        answer4 = question4Answer.getText().toString().trim().toLowerCase();
        if (answer4.equals("super eagles")) {
            answer4Score = 1;
        } else {
            answer4Score = 0;
        }
        /**
         * Question 5  - Correct Answers is #2 "Strength"
         * This Checks if the correct answer for Question5 is selected
         * Adds a score (0 if the answer is not correct and 1 if the answer is correct) to the answer5Score variable
         */
        Boolean answer5;
        question5Answer2 = (RadioButton) this.findViewById(R.id.question5Answer2);
        answer5 = question5Answer2.isChecked();
        if (answer5) {
            answer5Score = 1;
        } else {
            answer5Score = 0;
        }
        /**
         * Question 6 - Correct Answer is "Calabar"
         * This checks if the correct answer for Question6 is typed
         * Removes the white spaces and changes the text inputted to lowercase
         * Adds a score (0 if the answer is not correct and 1 if the answer is correct) to the answer6Score variable
         */
        String answer6;
        question6Answer = (EditText) this.findViewById(R.id.question6Answer);
        answer6 = question6Answer.getText().toString().trim().toLowerCase();
        if (answer6.equals("calabar")) {
            answer6Score = 1;
        } else {
            answer6Score = 0;
        }
        /**
         * Question 7  - Correct Answers are #1 (Benue), #2 (Niger) and #4 (Osun)
         * This checks if the correct answers for Question7 are selected
         * Adds a score (0 if the answer is not correct and 1 if the answer is correct) to the answer7Score variable
         */
        Boolean answer7Answer1;
        Boolean answer7Answer2;
        Boolean answer7Answer3;
        Boolean answer7Answer4;
        Boolean answer7Answer5;
        question7Answer1 = (CheckBox) this.findViewById(R.id.question7Answer1);
        question7Answer2 = (CheckBox) this.findViewById(R.id.question7Answer2);
        question7Answer3 = (CheckBox) this.findViewById(R.id.question7Answer3);
        question7Answer4 = (CheckBox) this.findViewById(R.id.question7Answer4);
        question7Answer5 = (CheckBox) this.findViewById(R.id.question7Answer5);
        answer7Answer1 = question7Answer1.isChecked();
        answer7Answer2 = question7Answer2.isChecked();
        answer7Answer3 = question7Answer3.isChecked();
        answer7Answer4 = question7Answer4.isChecked();
        answer7Answer5 = question7Answer5.isChecked();
        if (answer7Answer1 && answer7Answer2 && !answer7Answer3 && answer7Answer4 && !answer7Answer5) {
            answer7Score = 1;
        } else {
            answer7Score = 0;
        }
        /**
         * Question 8 - Correct Answer is "Wole Soyinka"
         * This checks if the correct answer for Question8 is typed
         * Removes the white spaces and changes the text inputted to lowercase
         * Adds a score (0 if the answer is not correct and 1 if the answer is correct) to the answer8Score variable
         */
        String answer8;
        question8Answer = (EditText) this.findViewById(R.id.question8Answer);
        answer8 = question8Answer.getText().toString().trim().toLowerCase();
        if (answer8.equals("wole soyinka")) {
            answer8Score = 1;
        } else {
            answer8Score = 0;
        }
        /**
         * Question 9  - Correct Answers is #4 "1966"
         * Checks if the correct answer for Question9 is selected
         * Adds a score (0 if the answer is not correct and 1 if the answer is correct) to the answer9Score variable
         */
        Boolean answer9;
        question9Answer4 = (RadioButton) this.findViewById(R.id.question9Answer4);
        answer9 = question9Answer4.isChecked();
        if (answer9) {
            answer9Score = 1;
        } else {
            answer9Score = 0;
        }

        /**
         * Question 10 - Correct Answer is "Lord Lugard"
         * This checks if the correct answer for Question6 is typed
         * Removes the white spaces and changes the text inputted to lowercase
         * Adds a score (0 if the answer is not correct and 1 if the answer is correct) to the answer6Score variable
         */
        String answer10;
        question10Answer = (EditText) this.findViewById(R.id.question10Answer);
        answer10 = question10Answer.getText().toString().trim().toLowerCase();
        if (answer10.equals("lord lugard")) {
            answer10Score = 1;
        } else {
            answer10Score = 0;
        }
        /**
         * Final Score
         * This sums all the score variables and displays the results with the final score
         */
        finalScore = answer1Score + answer2Score + answer3Score + answer4Score + answer5Score +
                answer6Score + answer7Score + answer8Score + answer9Score + answer10Score;

        if (finalScore == 10) {
            resultsDisplay = "Congratulations! You Scored "  + finalScore + " / 10";
        } else {
            resultsDisplay = "Try again. You Scored " + finalScore + " / 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}

