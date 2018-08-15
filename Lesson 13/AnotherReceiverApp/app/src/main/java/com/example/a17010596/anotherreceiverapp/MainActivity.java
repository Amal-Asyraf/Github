package com.example.a17010596.anotherreceiverapp;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver br = new AnotherBroadcastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        filter.addAction("com.example.broadcast.MY_BROADCAST");
        this.registerReceiver(br, filter);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        this.unregisterReceiver(br);
    }
}