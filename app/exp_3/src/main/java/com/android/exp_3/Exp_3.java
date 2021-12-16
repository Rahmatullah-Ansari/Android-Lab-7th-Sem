package com.android.exp_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exp_3 extends AppCompatActivity {
    int flag=0;
    @SuppressLint ("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp3);
        //AIM = Create an application with basic view like button and textview.
        TextView textView=findViewById(R.id.textView);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(view -> {
            if (flag == 0){
                textView.setVisibility(View.INVISIBLE);
                button.setText("Show");
                flag=1;
            }else {
                textView.setVisibility(View.VISIBLE);
                button.setText("Hide");
                flag=0;
            }
        });
    }

}