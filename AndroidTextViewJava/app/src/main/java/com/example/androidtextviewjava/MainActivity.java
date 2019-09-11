package com.example.androidtextviewjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hello = new TextView(this);
        hello = findViewById(R.id.helloClass);
        hello.setText("Hello! I am Thao");
//        hello.setTextColor(Color.RED);
        hello.setTextColor(getResources().getColor(R.color.colorPr));
        hello.setTextSize(50);


//        TextView helloClass1;
//        helloClass1 = findViewById(R.id.helloClass);
//        helloClass1.setText("Hello Class");

    }
}
