package com.example.a17010596.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class CustomeAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<MovieList> movieLists;
    public CustomeAdapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource,  objects);
        parent_context = context;
        layout_id = resource;
        movieLists = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvType = rowView.findViewById(R.id.textViewType);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenre);
        ImageView ivImpt = rowView.findViewById(R.id.imageViewMovie);

        MovieList currentMovie = movieLists.get(position);
        tvName.setText(currentMovie.getTitle());
        tvType.setText(currentMovie.getYear());
        tvGenre.setText(currentMovie.getGenre());
        if(currentMovie.isPG()){
            ivImpt.setImageResource(R.drawable.rating_pg);
        }else{
            ivImpt.setImageResource(R.drawable.rating_pg13);
        }

        return rowView;
    }

}
