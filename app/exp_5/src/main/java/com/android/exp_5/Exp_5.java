package com.android.exp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Exp_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp5);
        //AIM = Create an application which will pass the data to second activity.
        EditText editText=findViewById(R.id.edittext);
        Button button=findViewById(R.id.button1);
        button.setOnClickListener(view -> {
            String message=editText.getText().toString();
            if (message.length() > 0){
                Intent intent=new Intent(Exp_5.this,secondActivity.class);
                intent.putExtra("data",message);
                startActivity(intent);
            }else {
                Toast.makeText(Exp_5.this, "Provide valid message to pass", Toast.LENGTH_SHORT).show();
            }
        });
    }

}