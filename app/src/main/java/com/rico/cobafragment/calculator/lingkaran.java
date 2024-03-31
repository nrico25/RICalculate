package com.rico.cobafragment.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rico.cobafragment.R;

public class lingkaran extends AppCompatActivity {
    EditText input;
    Button sum;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        input = findViewById(R.id.panjang);
        sum = findViewById(R.id.hitung);
        result = findViewById(R.id.hasil);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {hitung();}
        });
    }

    private void hitung() {
        String jariStr = input.getText().toString().trim();
        double jari = Double.parseDouble(jariStr);
        double hasil = 3.14*jari*jari;
        String hasilStr = String.format("%.2f", hasil);

        result.setText(hasilStr+ "CM");


    }
}