package com.android.exp_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class exp_10 extends AppCompatActivity {
    ImageView imageView,imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp10);
        //AIM = Create an application to show frame layout.
        imageView=findViewById(R.id.imageview);
        imageView1=findViewById(R.id.imageview1);
        imageView.setOnClickListener(view -> {
            imageView.setVisibility(View.GONE);
            imageView1.setVisibility(View.VISIBLE);
        });
        imageView1.setOnClickListener(view -> {
            imageView1.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
        });

    }

}