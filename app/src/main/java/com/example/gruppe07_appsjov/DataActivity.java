package com.example.gruppe07_appsjov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DataActivity extends AppCompatActivity {
    private Button button;
    InputStream inputStream;
    String[] data;
    String[][] database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        button = findViewById(R.id.button);

        Log.d("Output ", "" + accessDatabase("fisk"));
        assembleDatabase();
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < 2; j++) {
                Log.d("Data ", database[i][j]);
            }

        }

    }

    private int accessDatabase(String food) {
        inputStream = getResources().openRawResource(R.raw.mad);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null) {
                data = csvLine.split(";");
                if (data[0].equalsIgnoreCase(food)) {
                    return Integer.parseInt(data[1]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("Error ", "Cannot read file");
        }
        return 0;
    }

    private void assembleDatabase() {
        createDatabaseArray();

        inputStream = getResources().openRawResource(R.raw.mad);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        try {
            String csvLine;
            int i = 0;
            while ((csvLine = reader.readLine()) != null) {

                String splitArray[] = csvLine.split(";");

                for (int j = 0; j < 2; j++) {
                    database[i][j] = splitArray[j];
                }
                i++;

            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("Error ", "Cannot read file");
        }
    }

    private void createDatabaseArray() {
        inputStream = getResources().openRawResource(R.raw.mad);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        int rows = 0;
        int cols = 0;

        try {
            String csvLine;
            int i = 0;
            while ((csvLine = reader.readLine()) != null) {
                String splitArray[] = csvLine.split(";");
                cols = splitArray.length;
                rows++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("Error ", "Cannot read file");
        }
        database = new String[rows][cols];
    }

}
