package com.rico.cobafragment.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rico.cobafragment.R;

public class kubus extends AppCompatActivity {
    EditText input;
    Button sum;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        input = findViewById(R.id.sisi);
        sum = findViewById(R.id.hitung);
        result = findViewById(R.id.hasil);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {hitung(v);}
        });
    }

    private void hitung(View v) {
        String sisiStr = input.getText().toString().trim();
        if(sisiStr.isEmpty()) {
            Toast.makeText(v.getContext(), "Kedua angka harus diisi", Toast.LENGTH_LONG);
            return;
        }
        double sisi = Double.parseDouble(sisiStr);
        double hasil = 6 * sisi * sisi;
        String hasilStr = String.format("%.2f", hasil);

        result.setText(hasilStr+ "CM");
    }
}