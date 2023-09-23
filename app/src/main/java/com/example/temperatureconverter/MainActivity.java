package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText a;
    Button b,b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.editTextNumber);
        b=findViewById(R.id.button);
        b1=findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c=Double.parseDouble(a.getText().toString());
                 double d=((1.8*c)+32);
                 a.setText(String.format("%.2f",d));
                Toast.makeText(MainActivity.this, String.format("%.2f",d)+" F", Toast.LENGTH_LONG).show();
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c1=Double.parseDouble(a.getText().toString());
                double d1=((c1-32)*5)/9;
                a.setText(String.format("%.2f",d1));
                Toast.makeText(MainActivity.this, String.format("%.2f",d1)+" C", Toast.LENGTH_LONG).show();
            }
        });
    }
}