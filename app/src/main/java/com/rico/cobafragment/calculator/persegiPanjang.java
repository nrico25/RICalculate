package com.rico.cobafragment.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rico.cobafragment.R;

public class persegiPanjang extends AppCompatActivity {
    EditText input1,input2;
    Button sum;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        input1 = findViewById(R.id.panjang);
        input2 = findViewById(R.id.lebar);
        sum = findViewById(R.id.hitung);
        result = findViewById(R.id.hasil);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {hitung();}
        });
    }

    private void hitung() {
        String panjangStr = input1.getText().toString().trim();
        String lebarStr = input2.getText().toString().trim();

        double panjang = Double.parseDouble(panjangStr);
        double lebar = Double.parseDouble(lebarStr);
        double hasil = panjang*lebar;
        String hasilStr = String.format("%.2f", hasil);

        result.setText(hasilStr+ "CM");
    }
}