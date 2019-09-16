package com.example.gruppe07_appsjov;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Harald extends AppCompatActivity implements View.OnClickListener {
    Button knap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.harald);
        knap = findViewById(R.id.button3);
        knap.setText("Hej smukke");
        knap.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
