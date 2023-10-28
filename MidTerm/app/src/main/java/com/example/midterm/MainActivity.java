package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextLiters;
    private TextView textViewResult;
    private Button buttonConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextLiters = findViewById(R.id.editTextLiters);
        textViewResult = findViewById(R.id.textViewResult);
        buttonConvert = findViewById(R.id.buttonConvert);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertLitersToGallons();
            }
        });
    }

    private void convertLitersToGallons() {
        if (!editTextLiters.getText().toString().equals("")) {
            double liters = Double.parseDouble(editTextLiters.getText().toString());
            double gallons = liters * 0.264172;
            textViewResult.setText(String.format("%.2f gallons", gallons));
        } else {
            textViewResult.setText("Please enter a value.");
        }
    }
}