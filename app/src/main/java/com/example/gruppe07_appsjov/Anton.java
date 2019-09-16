package com.example.gruppe07_appsjov;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Anton extends AppCompatActivity {
    Button testKnap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        testKnap = new Button(this);
        setContentView(testKnap);

    }

}
