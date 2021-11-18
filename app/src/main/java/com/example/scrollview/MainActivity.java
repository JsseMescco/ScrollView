package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btncereza , btnframbuesa, btnfresa, btnMango, btnNaranja, btnPera,btnPiña, btnPlatano,
    btnSandia, btnUva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncereza = findViewById(R.id.ibCereza);
        btnframbuesa = findViewById(R.id.ibFrambuesa);
        btnfresa = findViewById(R.id.ibFresa);
        btnMango = findViewById(R.id.ibMango);
        btnNaranja = findViewById(R.id.ibNaranja);
        btnPera = findViewById(R.id.ibPera);
        btnPiña = findViewById(R.id.ibPina);
        btnPlatano = findViewById(R.id.ibPlatano);
        btnSandia = findViewById(R.id.ibSandia);
        btnUva = findViewById(R.id.ibUva);

        btncereza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Estas son Cerezas", Toast.LENGTH_SHORT).show();
            }
        });
        btnframbuesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Esta es frambuesa", Toast.LENGTH_SHORT).show();
            }
        });
        btnfresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Esta es una fresa", Toast.LENGTH_SHORT).show();
            }
        });
        btnMango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Este es un mango", Toast.LENGTH_SHORT).show();
            }
        });
        btnNaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Esta es una naranja", Toast.LENGTH_SHORT).show();
            }
        });
        btnPera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Esta es una Pera", Toast.LENGTH_SHORT).show();
            }
        });
        btnPiña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Esta es una Piña", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlatano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Este es un Platano", Toast.LENGTH_SHORT).show();
            }
        });
        btnSandia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Esta es una Sandia", Toast.LENGTH_SHORT).show();
            }
        });
        btnUva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Esta es una Uva", Toast.LENGTH_SHORT).show();
            }
        });

    }
}