package com.example.a17010596.exercisep08;

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
    ArrayList<Employee> EmployeeList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull  ArrayList<Employee> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        EmployeeList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent,false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewTitle);
        TextView tvWage = rowView.findViewById(R.id.textViewWage);
        Employee currentItem = EmployeeList.get(position);
        tvName.setText(currentItem.getName());
        tvDate.setText(currentItem.getTitle());
        String wage=""+currentItem.getwage();
        tvWage.setText(wage);
        return rowView;
    }
}

