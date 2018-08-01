package com.example.a17010596.dialogdemo;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btnDemo1,btnDemo2,btnDemo3,btnDemo4,btnDemo5,btnSum;
    TextView tv1,tv2,tv3,tv4,tvSum;
    int day,month,year,min,hour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDemo1=findViewById(R.id.btnDemo1);
        btnDemo2=findViewById(R.id.btnDemo2);
        btnDemo3=findViewById(R.id.btnDemo3);
        btnDemo4=findViewById(R.id.btnDemo4);
        btnDemo5=findViewById(R.id.btnDemo5);
        btnSum=findViewById(R.id.buttonSum);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tvSum=findViewById(R.id.textViewSum);

        Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);

        btnDemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

        /*
        myBuilder.setTitle("Demo 1-Simple Dialog");
        myBuilder.setMessage("I can develop Android App.");
        myBuilder.setCancelable(false);
        myBuilder.setPositiveButton("Close", null);
        */

                myBuilder.setTitle("Congratulation");
                myBuilder.setMessage("You have completed a simple Dialog Box.");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("DISMISS", null);


                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
            {

            }
        });


        btnDemo2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setTitle("Demo 2 Buttons Dialog");
                myBuilder.setMessage("Select one of the Button below.");
                myBuilder.setCancelable(false);

                myBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tv1.setText("You have selected Positive");
                    }
                });

                myBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tv1.setText("You have selected Negative");
                    }
                });

                myBuilder.setNeutralButton("Cancel", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });

        btnDemo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.input, null);

                final EditText etInput = viewDialog.findViewById(R.id.editTextInput);

                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Demo 3-Text Input Dialog");

                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String message = etInput.getText().toString();
                        tv2.setText(message);
                    }
                });

                myBuilder.setNegativeButton("CANCEL", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.num_input, null);

                final EditText etInput1 = viewDialog.findViewById(R.id.editTextN1);
                final EditText etInput2 = viewDialog.findViewById(R.id.editTextN2);

                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Exercise 3");

                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        int num1 = Integer.parseInt(etInput1.getText().toString());
                        int num2 = Integer.parseInt(etInput2.getText().toString());

                        int total = num1 + num2;

                        tvSum.setText("The sum is " + String.valueOf(total));
                    }
                });

                myBuilder.setNegativeButton("CANCEL", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });

        btnDemo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int yYear, int mMonth, int dayOfMonth) {
                        tv3.setText("Date: " + dayOfMonth + "/" + (month+1) + "/" + year);
                        day=dayOfMonth;
                        year=yYear;
                        month=mMonth;
                    }
                };



                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, myDateListener, year,month,day);
                myDateDialog.show();


            }
        });

        btnDemo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        tv4.setText("Time: " + hourOfDay + ":" + minute);
                    }
                };

                Calendar c = Calendar.getInstance();
                int mHour = c.get(Calendar.HOUR_OF_DAY);
                int mMin = c.get(Calendar.MINUTE);
                TimePickerDialog myTimeDialog = new TimePickerDialog(MainActivity.this, myTimeListener, mHour,mMin,true);
                myTimeDialog.show();
            }
        });

    }

}
