package com.android.exp_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class exp_9 extends AppCompatActivity {
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp9);
        //AIM = Create an application to show checkbox.
        checkBox1=findViewById(R.id.checkbox1);
        checkBox2=findViewById(R.id.checkbox2);
        checkBox3=findViewById(R.id.checkbox3);
        checkBox4=findViewById(R.id.checkbox4);
        checkBox1.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b){
                checkBox1.setChecked(b);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                Toast.makeText(exp_9.this,checkBox1.getText().toString()+ " is selected", Toast.LENGTH_SHORT).show();
            }
        });
        checkBox2.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b){
                checkBox2.setChecked(b);
                checkBox1.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                Toast.makeText(exp_9.this,checkBox2.getText().toString()+ " is selected", Toast.LENGTH_SHORT).show();
            }
        });
        checkBox3.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b){
                checkBox3.setChecked(b);
                checkBox2.setChecked(false);
                checkBox1.setChecked(false);
                checkBox4.setChecked(false);
                Toast.makeText(exp_9.this,checkBox3.getText().toString()+ " is selected", Toast.LENGTH_SHORT).show();
            }
        });
        checkBox4.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b){
                checkBox4.setChecked(b);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox1.setChecked(false);
                Toast.makeText(exp_9.this,checkBox4.getText().toString()+ " is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

}