package com.example.diyanfang.finalprojectadventuregame;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by diyanfang on 4/22/18.
 */

public class QuizViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public ImageView quizImage;
    public TextView quizName;
    public TextView aboutThisCity;
    public boolean isQuizFinished;

    public QuizViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);

        quizImage = (ImageView) itemView.findViewById(R.id.quiz_image);
        quizName = (TextView) itemView.findViewById(R.id.quiz_name);
        aboutThisCity = (TextView) itemView.findViewById(R.id.about_this_city);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context, questionCountry.getText(),Toast.LENGTH_SHORT).show();
                int messageId = 0;
                //show the correct answer
                if (isQuizFinished) {
                    messageId = R.string.quiz_finished_toast;
                } else {
                    messageId = R.string.quiz_unfinished_toast;
                }
                Toast.makeText(context, messageId, Toast.LENGTH_SHORT).show();
            }
        });

        quizImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (quizName.getText().toString().equalsIgnoreCase("aqua city")) {
                    context.startActivity(new Intent(context, AquaCity.class));
                }
            }
        });

        quizName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (quizName.getText().toString().equalsIgnoreCase("aqua city")) {
                    context.startActivity(new Intent(context, AquaCity.class));
                }

            }
        });

    }

}
