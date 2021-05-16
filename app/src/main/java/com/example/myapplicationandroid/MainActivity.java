package com.example.myapplicationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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