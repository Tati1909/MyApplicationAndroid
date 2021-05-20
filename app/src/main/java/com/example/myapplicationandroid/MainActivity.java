package com.example.myapplicationandroid;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button buttonTykTyk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTykTyk = findViewById(R.id.button1);
        buttonTykTyk.setOnClickListener(v -> buttonTykTyk.setText("ФАЗАН"));
    }


}