package com.rico.cobafragment.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rico.cobafragment.R;

public class tabung extends AppCompatActivity {
    EditText input1,input2;
    Button sum;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);
        input1 = findViewById(R.id.jari);
        input2 = findViewById(R.id.tinggi);
        sum = findViewById(R.id.hitung);
        result = findViewById(R.id.hasil);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {hitung();}
        });
    }

    private void hitung() {
        String jariStr = input1.getText().toString().trim();
        String tinggiStr = input2.getText().toString().trim();

        if (jariStr.isEmpty() || tinggiStr.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Angka tidak boleh kosong", Toast.LENGTH_SHORT).show();
            return;
        }
        double jari = Double.parseDouble(jariStr);
        double tinggi = Double.parseDouble(tinggiStr);
        double hasil = 2* 3.14 * jari+(jari+tinggi);
        String hasilStr = String.format("%.2f", hasil);

        result.setText(hasilStr+ "CM");
    }
}