package com.example.a17010596.exercisep08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Employee> alMovieList;
    CustomAdapter caMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie1);

        alMovieList = new ArrayList<>();

        Employee item1 = new Employee("Ben","Department Head",2000.70);
        Employee item2 = new Employee("Seth","Part Timer",750.60);

        alMovieList.add(item1);
        alMovieList.add(item2);


        caMovie = new CustomAdapter(this,R.layout.employee_info,alMovieList);

        lvMovie.setAdapter(caMovie);
    }
}
