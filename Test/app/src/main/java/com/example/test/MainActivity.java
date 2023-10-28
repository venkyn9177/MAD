package com.example.test;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextEuro = findViewById(R.id.editTextEuro);
        Button buttonConvert = findViewById(R.id.buttonConvert);
        TextView textViewResult = findViewById(R.id.textViewResult);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String euroString = editTextEuro.getText().toString();
                if (!euroString.isEmpty()) {
                    double euro = Double.parseDouble(euroString);
                    double conversionRate = 1.18; // Assume a conversion rate of 1 Euro = 1.18 Dollars
                    double dollars = euro * conversionRate;
                    textViewResult.setText(String.format("%.2f Euros = %.2f Dollars", euro, dollars));
                } else {
                    textViewResult.setText("Please enter a valid amount in Euro.");
                }
            }
        });
    }
}