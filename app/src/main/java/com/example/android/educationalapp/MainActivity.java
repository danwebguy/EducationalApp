package com.example.android.educationalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method is to go to Question Activity on the click of Start Quiz Button
    public void startQuiz(View view) {

        // Get the Full Name for Welcome message
        EditText editText = (EditText) findViewById(R.id.fName);
        String fName = editText.getText().toString();

        if(TextUtils.isEmpty(fName)) {
            editText.setError("Please Enter your Full Name");
            return;
        }

        Intent intent = new Intent(this, QuestionsActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT, fName);
        startActivity(intent);
    }
}