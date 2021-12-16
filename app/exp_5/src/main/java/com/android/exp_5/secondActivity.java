package com.android.exp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView=findViewById(R.id.textView);
        String message=secondActivity.this.getIntent().getStringExtra("data");
        if (message != null){
            textView.setText(String.format("Welcome in second activity\nData from previous activity = %s",message));
        }
    }

}