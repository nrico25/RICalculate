package com.rico.cobafragment.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rico.cobafragment.R;

public class segitiga extends AppCompatActivity {
    EditText input1,input2;
    Button sum;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        input1 = findViewById(R.id.alas);
        input2 = findViewById(R.id.tinggi);
        sum = findViewById(R.id.hitung);
        result = findViewById(R.id.hasil);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {hitung();}
        });
    }

    private void hitung() {
        String alasStr = input1.getText().toString().trim();
        String tinggiStr = input2.getText().toString().trim();

        double alas = Double.parseDouble(alasStr);
        double tinggi = Double.parseDouble(tinggiStr);
        double hasil = 0.5 * alas*tinggi;
        String hasilStr = String.format("%.2f", hasil);

        result.setText(hasilStr+ "CM");




    }
}