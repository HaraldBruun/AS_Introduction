package com.example.gruppe07_appsjov;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Harald extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button knap;
        setContentView(R.layout.harald);
        knap = findViewById(R.id.button3);
        knap.setText("Hej smukke");

    }
}
