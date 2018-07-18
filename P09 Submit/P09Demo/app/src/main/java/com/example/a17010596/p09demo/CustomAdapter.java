package com.example.a17010596.p09demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;


public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<MovieItem> movieList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull  ArrayList<MovieItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent,false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);
        MovieItem currentItem = movieList.get(position);
        tvName.setText(currentItem.getMovieName());
        tvDate.setText(currentItem.getReleaseDate());
        return rowView;
    }
}






