package com.android.exp_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Exp_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp4);
        //AIM = Create an application which will start another activity using Intent.
        Button button=findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent intent=new Intent(Exp_4.this,secondActivity.class);
            startActivity(intent);
        });
    }

}