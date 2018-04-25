package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AquaCityQuiz extends AppCompatActivity {

    private ImageView scissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aqua_city_quiz);

        scissors = (ImageView) findViewById(R.id.scissors);

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AquaCityQuiz.this, "I'm free!", Toast.LENGTH_SHORT).show();
                
            }
        });
    }


}
