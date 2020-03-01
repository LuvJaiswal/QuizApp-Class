package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        textView = (TextView)findViewById(R.id.textView);
        Intent intent =getIntent();

        String score = intent.getStringExtra("SCORE");   //takes the string from Quiz activity
        textView.setText(score);
    }
}
