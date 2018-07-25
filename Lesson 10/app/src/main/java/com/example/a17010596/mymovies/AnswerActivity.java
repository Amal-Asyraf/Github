package com.example.a17010596.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvTitleAns;
    TextView tvYearAns;
    TextView tvGenreAns;
    TextView tvDescAns;
    TextView tvWatchAns;
    TextView tvTheatreAns;
    ImageView imMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvTitleAns = findViewById(R.id.textViewTitle);
        tvYearAns = findViewById(R.id.textViewYear);
        tvGenreAns = findViewById(R.id.textViewGenre1);
        tvDescAns = findViewById(R.id.textViewDescr);
        tvWatchAns = findViewById(R.id.textViewWatch);
        tvTheatreAns = findViewById(R.id.textViewTheatre);
        imMovie = findViewById(R.id.imageViewMovie);


        Intent intentReceived = getIntent();
        String titleSelected = intentReceived.getStringExtra("title");
        tvTitleAns.setText(titleSelected);
        Intent intentReceived1 = getIntent();
        String yearSelected = intentReceived1.getStringExtra("year");
        tvTitleAns.setText(yearSelected);
        Intent intentReceived2 = getIntent();
        String genreSelected = intentReceived2.getStringExtra("genre");
        tvGenreAns.setText(genreSelected);
        Intent intentReceived3 = getIntent();
        String descSelected = intentReceived3.getStringExtra("description");
        tvDescAns.setText(descSelected);
        Intent intentReceived4 = getIntent();
        String watchSelected = intentReceived4.getStringExtra("watched");
        tvWatchAns.setText(watchSelected);
        Intent intentReceived5 = getIntent();
        String theatreSelected = intentReceived5.getStringExtra("theatre");
        tvTheatreAns.setText(theatreSelected);

    }
}
