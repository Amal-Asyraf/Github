package com.example.a17010596.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvColor;
    ArrayList<BoxItem> alColor;
    CustomAdapter caColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColor=findViewById(R.id.listViewToDo);

        alColor= new ArrayList<>();

        BoxItem color1= new BoxItem("Blue");
        BoxItem color2= new BoxItem("Orange");
        BoxItem color3= new BoxItem("Brown");
        alColor.add(color1);
        alColor.add(color2);
        alColor.add(color3);
        caColor = new CustomAdapter(this,R.layout.box_item,alColor);
        lvColor.setAdapter(caColor);
    }
}
