package com.example.literstogallons;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText literInput;
    private TextView resultText;

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        literInput = findViewById(R.id.literInput);
        @SuppressLint("MissingInflatedId") Button convertButton = findViewById(R.id.convertButton);
        resultText = findViewById(R.id.resultText);

        convertButton.setOnClickListener(v -> {
            try {
                double liters = Double.parseDouble(literInput.getText().toString());
                double gallons = liters * 0.219;
                resultText.setText(String.format("%.2f gallons", gallons));
            } catch (NumberFormatException e) {
                resultText.setText("Invalid input");
            }
        });
    }
}