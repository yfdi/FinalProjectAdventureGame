package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AquaCity extends AppCompatActivity {

    ImageView manyDolphin;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aqua_city);

        manyDolphin = findViewById(R.id.many_dolphins);
        nextButton= findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent aquzQuizIntent = new Intent (AquaCity.this, GoldCity.class);
                startActivity(aquzQuizIntent);

            }
        });

        Intent quizIntent = getIntent();
        Quiz q = (Quiz) quizIntent.getSerializableExtra(Keys.QUIZ);

    }
}
