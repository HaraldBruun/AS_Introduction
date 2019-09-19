package com.example.gruppe07_appsjov;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Anton extends AppCompatActivity implements View.OnClickListener {
    Button enKnap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anton);
        enKnap = findViewById(R.id.testButton);
        enKnap.setOnClickListener(this);
    }

    public void onClick(View v) {
        System.out.println("Hej");
        Toast.makeText(this, "This is my Toast message!",
                Toast.LENGTH_LONG).show();
    }

}
