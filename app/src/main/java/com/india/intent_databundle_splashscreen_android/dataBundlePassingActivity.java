package com.india.intent_databundle_splashscreen_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class dataBundlePassingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_bundle_passing);

        EditText edit1 =  findViewById(R.id.edit1);
        EditText edit2 =  findViewById(R.id.edit2);

        String name = edit1.getText().toString();
        String password = edit2.getText().toString();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext = new Intent(getApplicationContext(),gettingDataBundleActivity.class);
                iNext.putExtra("Name",name);
                iNext.putExtra("Password",password);
                startActivity(iNext);
            }
        });

    }
}