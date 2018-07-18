package com.example.a17010596.quiz;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Math_item> alMovieList;
    CustomAdapter caMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie1);

        alMovieList = new ArrayList<>();

        Math_item item1 = new Math_item("Area of Rectangle","Length x Width","Formula type is: Area");
        Math_item item2 = new Math_item("Area of Triangle","(Length of base x Height) / 2","Formula type is: Area" );
        Math_item item3 = new Math_item("Volume of Cube ","Length x Height x Width ","Formula type is: Volume");

        alMovieList.add(item1);
        alMovieList.add(item2);
        alMovieList.add(item3);


        caMovie = new CustomAdapter(this,R.layout.math_item,alMovieList);

        lvMovie.setAdapter(caMovie);
    }
}
