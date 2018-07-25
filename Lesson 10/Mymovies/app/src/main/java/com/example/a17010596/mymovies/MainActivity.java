package com.example.a17010596.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<MovieList> alMovie;
    CustomeAdapter caMovie;

    TextView tvName;
    TextView tvType;
    TextView tvGenre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alMovie = new ArrayList<>();
        MovieList movie1 = new MovieList("The Avengers","2017","Action | Sci-fi",false);
        MovieList movie2 = new MovieList("Planes","2013","Animation | Comedy",true);
        alMovie.add(movie1);
        alMovie.add(movie2);


        tvName = findViewById(R.id.textViewName);
        tvType = findViewById(R.id.textViewType);
        tvGenre = findViewById(R.id.textViewGenre);
        lvMovie = findViewById(R.id.listViewToDo);




        caMovie = new CustomeAdapter(this,R.layout.movie_list,alMovie);
        lvMovie.setAdapter(caMovie);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent intent = new Intent(getBaseContext(),AnswerActivity.class);
                    MovieList current=alMovie.get(i);

                    intent.putExtra("title",current.getTitle());
                    intent.putExtra("year",current.getYear());
                    intent.putExtra("genre",current.getGenre());
                    intent.putExtra("description",current.getDescryption());
                    intent.putExtra("watched",current.getWatched_on());
                    intent.putExtra("theatre",current.getIn_theatre());
                    intent.putExtra("rating",current.getRated());
                    startActivity(intent);

                }

        });
    }

}

