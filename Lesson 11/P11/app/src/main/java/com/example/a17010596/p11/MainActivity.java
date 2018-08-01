package com.example.a17010596.p11;

import android.app.TimePickerDialog;
import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etNum;
    EditText etSize;
    EditText etDay;
    EditText etTime;
    Button btnReservation;
    Button btnReset;
    CheckBox sk;

    Calendar c = Calendar.getInstance();
    int mYear = c.get(Calendar.YEAR);
    int mMonth = c.get(Calendar.MONTH);
    int mDay = c.get(Calendar.DAY_OF_MONTH);

    int mHour = c.get(Calendar.HOUR_OF_DAY);
    int mMin = c.get(Calendar.MINUTE);

    @Override
    protected void onPause() {
        super.onPause();
        if (sk.isChecked()) {
            String name = etName.getText().toString();
            String num = etNum.getText().toString();
            String size = etSize.getText().toString();
            String time = etTime.getText().toString();
            String day = etDay.getText().toString();
            String sk = "Yes";

            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor preEdit = prefs.edit();
            preEdit.putString("name", name);
            preEdit.putString("tel", num);
            preEdit.putString("size", size);
            preEdit.putString("time", time);
            preEdit.putString("day", day);
            preEdit.putString("sk",sk);
            preEdit.commit();



        } else {

            String name = etName.getText().toString();
            String num = etNum.getText().toString();
            String size = etSize.getText().toString();
            String time = etTime.getText().toString();
            String day = etDay.getText().toString();
            String sk = "No";

            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor preEdit = prefs.edit();
            preEdit.putString("name", name);
            preEdit.putString("tel", num);
            preEdit.putString("size", size);
            preEdit.putString("time", time);
            preEdit.putString("day", day);
            preEdit.putString("sk",sk);
            preEdit.commit();

        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor prefEdit = prefs.edit();
        String name = prefs.getString("name","");
        String tel = prefs.getString("tel","");
        String size = prefs.getString("size","");
        String time = prefs.getString("time","");
        String day = prefs.getString("day","");
        String sk = prefs.getString("sk","");

        etName.setText(name);
        etSize.setText(size);
        etNum.setText(tel);
        etDay.setText(day);
        etTime.setText(time);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.editTextName);
        etNum =findViewById(R.id.editTextNumber);
        etSize = findViewById(R.id.editTextSize);
        etDay = findViewById(R.id.editTextDay);
        etTime =  findViewById(R.id.editTextTime);
        btnReservation = findViewById(R.id.buttonRes);
        btnReset = findViewById(R.id.button2Reset);
        sk = findViewById(R.id.CheckboxSmoking);







        etDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        etDay.setText("Date: " + dayOfMonth + "/" + (month+1) + "/" + year);
                        Calendar c = Calendar.getInstance();
                        mYear = year;
                        mMonth = month;
                        mDay = dayOfMonth;


                    }
                };

                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, myDateListener, mYear,mMonth,mDay);
                myDateDialog.show();
            }
        });

        etTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        etTime.setText("Time: " + hourOfDay + ":" + minute);
                        Calendar c = Calendar.getInstance();


                        mHour = hourOfDay;
                        mMin = minute;
                    }
                };

                TimePickerDialog myTimeDialog = new TimePickerDialog(MainActivity.this, myTimeListener, mHour,mMin,true);
                myTimeDialog.show();
            }
        });

        btnReservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sk.isChecked()){
                    String name = etName.getText().toString();
                    String size = etSize.getText().toString();
                    String num = etNum.getText().toString();
                    String time = etTime.getText().toString();
                    String day = etDay.getText().toString();
                    String sk = "Yes";


                    AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                    myBuilder.setTitle("Confirm Your Order");
                    myBuilder.setMessage("New Reservation" + "\n" + "Name: " + name + "\n" + "Telephone: " + num + "\n" + "Size: " + size + "\n" + "Smoking: " + sk +"\n" + "Date: " + day + "\n" + "Time: " + time);
                    myBuilder.setCancelable(false);
                    myBuilder.setPositiveButton("CONFIRM", null);
                    myBuilder.setNegativeButton("CANCEL", null);


                    AlertDialog myDialog = myBuilder.create();
                    myDialog.show();
                } else {
                    String name = etName.getText().toString();
                    String num = etNum.getText().toString();
                    String size = etSize.getText().toString();
                    String time = etTime.getText().toString();
                    String day = etDay.getText().toString();
                    String sk = "No";


                    AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                    myBuilder.setTitle("Confirm Your Order");
                    myBuilder.setMessage("New Reservation" + "\n" + "Name: " + name + "\n" + "Telephone: " + num + "\n" + "Size: " + size + "\n" + "Smoking: " + sk +"\n" + "Date: " + day + "\n" + "Time: " + time);
                    myBuilder.setCancelable(false);
                    myBuilder.setPositiveButton("CONFIRM", null);
                    myBuilder.setNegativeButton("CANCEL", null);


                    AlertDialog myDialog = myBuilder.create();
                    myDialog.show();
                }

            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.getText().clear();
                etNum.getText().clear();
                etSize.getText().clear();
                sk.setChecked(false);

                Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);

                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMin = c.get(Calendar.MINUTE);

                etDay.setText("Date: " + mDay + "/" + mMonth + "/" + mYear);
                etTime.setText("Time: " + mHour + ":" + mMin);


            }
        });


    }
}
