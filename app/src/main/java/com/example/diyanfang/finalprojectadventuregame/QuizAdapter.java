package com.example.diyanfang.finalprojectadventuregame;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by diyanfang on 4/22/18.
 */

public class QuizAdapter extends RecyclerView.Adapter<QuizViewHolder> {

    private List<Quiz> quizzes;
    private Context context;

    public QuizAdapter(List<Quiz>quizzes, Context context) {
        this.quizzes = quizzes;
        this.context = context;
    }

    @Override
    public QuizViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_quiz, parent, false);
        return new QuizViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(QuizViewHolder holder, int position) {
        Quiz quiz = quizzes.get(position);

//        holder.quizName.setText(quiz.cityName);
//        holder.aboutThisCity.setText(quiz.description);
//        holder.quizImage.setImageResource(quiz.photoId);
//        //add the value of .isFinished to the ViewHolder
//        holder.isQuizFinished = quiz.isFinished();

        holder.bind(quiz);
    }

    @Override
    public int getItemCount() {
        return quizzes.size();
    }
}
