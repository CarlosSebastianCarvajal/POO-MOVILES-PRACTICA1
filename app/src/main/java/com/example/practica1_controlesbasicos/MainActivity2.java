package com.example.practica1_controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtSaludo;
    TextView txtNombre;
    TextView txtgenero;
    TextView txtFechaNac;
    TextView txtTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtSaludo = (TextView) findViewById(R.id.txtSaludo);
        txtNombre = (TextView) findViewById(R.id.txtNOMBRES);
        txtgenero = (TextView) findViewById(R.id.txtGenero);
        txtFechaNac = (TextView) findViewById(R.id.txtFECHANAC);
        txtTelefono = (TextView) findViewById(R.id.txtTELEFONO);


    }
}