package com.motatwra.newapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    TextView rez;
    Button btnsum , btnsup, btndiv, btnmul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        rez = findViewById(R.id.rez);
        btnsum = findViewById(R.id.sum);
        btnsup = findViewById(R.id.sup);
        btndiv = findViewById(R.id.div);
        btnmul = findViewById(R.id.mult);



        btnsum.setOnClickListener(view -> {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double rz = n1 + n2;
            rez.setText(String.valueOf(rz));

        });

        btnsup.setOnClickListener(view -> {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double rz = n1 - n2;
            rez.setText(String.valueOf(rz));
        });

        btndiv.setOnClickListener(view -> {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double rz = n1 / n2;
            rez.setText(String.valueOf(rz));

        });

        btnmul.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double rz = n1 * n2;
        rez.setText(String.valueOf(rz));
    }};
