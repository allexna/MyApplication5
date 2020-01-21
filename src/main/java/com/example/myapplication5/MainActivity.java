package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.TextView;
import android.widget.Button;

import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private TextView mhellotextview;
    private Button nameb;
    private int mCount=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mhellotextview=findViewById(R.id.textView);
        nameb=findViewById(R.id.button_gd);


    }
    @SuppressLint("ResourceType")
    public void onClick(View view){
        mCount=mCount+1;
        mhellotextview.setText(nameb.getText()+" "+mCount);


    }
}
