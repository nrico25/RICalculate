package com.rico.cobafragment.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rico.cobafragment.R;

public class kerucut extends AppCompatActivity {
    EditText input1,input2;
    Button sum;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        input1 = findViewById(R.id.jari);
        input2 = findViewById(R.id.tinggi);
        sum = findViewById(R.id.hitung);
        result = findViewById(R.id.hasil);

        sum.setOnClickListener(v -> hitung(v));
    }

    private void hitung(View v) {
        String jariStr = input1.getText().toString().trim();
        String tinggiStr = input2.getText().toString().trim();

        if(jariStr.isEmpty() || tinggiStr.isEmpty()) {
            Toast.makeText(v.getContext(), "Kedua angka harus diisi", Toast.LENGTH_LONG);
            return;
        }
        double jari = Double.parseDouble(jariStr);
        double tinggi = Double.parseDouble(tinggiStr);
        double hasil = 3.14 * jari*(jari+tinggi);
        String hasilStr = String.format("%.2f", hasil);

        result.setText(hasilStr+ "CM");
    }
}