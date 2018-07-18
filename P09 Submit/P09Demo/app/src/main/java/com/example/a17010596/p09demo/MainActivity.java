package com.example.a17010596.p09demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MovieItem> alMovieList;
    CustomAdapter caMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie1);

        alMovieList = new ArrayList<>();

        MovieItem item1 = new MovieItem("Avenger Infinity War","Release Date: 2017.11");
        MovieItem item2 = new MovieItem("Justice League","Release Date: 2017.11");

        alMovieList.add(item1);
        alMovieList.add(item2);


        caMovie = new CustomAdapter(this,R.layout.movie_item,alMovieList);

        lvMovie.setAdapter(caMovie);
}
}