package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {

    private Button SubmitBtn;
    private String score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        SubmitBtn=(Button)findViewById(R.id.submitBtn);

        SubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = "10/10";
                Intent intent = new Intent(QuizActivity.this,ScoreActivity.class);
                intent.putExtra( "SCORE",score);  //name should be same in the score activity
                startActivity(intent);
            }
        });
    }
}
