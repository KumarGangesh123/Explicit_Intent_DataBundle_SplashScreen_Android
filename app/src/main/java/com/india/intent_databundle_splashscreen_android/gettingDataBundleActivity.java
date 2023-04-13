package com.india.intent_databundle_splashscreen_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class gettingDataBundleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_data_bundle);

        Intent iGet = getIntent();

        TextView text1 = findViewById(R.id.textView3);
        TextView text2 = findViewById(R.id.textView2);

        String name = iGet.getStringExtra("Name");
        String password = iGet.getStringExtra("Password");

        text1.setText(name);
        text2.setText(password);

    }
}