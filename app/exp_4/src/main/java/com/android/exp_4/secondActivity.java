package com.android.exp_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.button1).setOnClickListener(view -> finish());
    }

}