package com.example.gruppe07_appsjov;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Anton extends AppCompatActivity {
    Button enKnap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anton);
        enKnap = findViewById(R.id.testButton);

    }

    public void onClick(View v) {
        Toast toast = new Toast("Hej");

    }

}
