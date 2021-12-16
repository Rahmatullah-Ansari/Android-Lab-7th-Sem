package com.android.experiment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Exp_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp_1);
        Objects.requireNonNull(getSupportActionBar()).hide();
        //AIM = Create an application to print "Hello world".
    }

    public void Show(View view) {
        TextView textView=findViewById(R.id.textview);
        String message=textView.getText().toString();
        if (!message.isEmpty()){
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }

}