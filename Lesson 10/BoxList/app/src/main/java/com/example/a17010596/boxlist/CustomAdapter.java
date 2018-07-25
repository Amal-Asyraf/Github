package com.example.a17010596.boxlist;

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
import java.util.Calendar;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<BoxItem> BoxList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<BoxItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        BoxList = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        BoxItem currentItem = BoxList.get(position);
        View rowView = inflater.inflate(layout_id, parent, false);
        ImageView ivBox = rowView.findViewById(R.id.imageViewBox);

        if(currentItem.getColor().equalsIgnoreCase("Blue")){
            ivBox.setImageResource(R.drawable.blue_box);
        }else if(currentItem.getColor().equalsIgnoreCase("Orange")){
            ivBox.setImageResource(R.drawable.orange_box);
        }else{
            ivBox.setImageResource(R.drawable.brown_box);
        }
        return rowView;
    }
}
