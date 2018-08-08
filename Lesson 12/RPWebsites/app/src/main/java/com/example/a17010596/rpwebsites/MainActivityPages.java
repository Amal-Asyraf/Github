package com.example.a17010596.rpwebsites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivityPages extends AppCompatActivity {

    WebView wvpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_webpage);
        wvpage=findViewById(R.id.WebViewPage);
        wvpage.setWebViewClient(new WebViewClient());
        //wvpage.getSettings().setBuiltInZoomControls(true);
        //wvpage.getSettings().setJavaScriptEnabled(true);

        Intent intentReceived =getIntent();

        String URL = intentReceived.getStringExtra("URL");
        Log.i("URL",URL+"");
        wvpage.loadUrl(URL);
    }
}

