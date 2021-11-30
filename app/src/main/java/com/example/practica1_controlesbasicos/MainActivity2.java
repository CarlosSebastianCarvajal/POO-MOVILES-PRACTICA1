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

    Bundle b = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtSaludo = (TextView) findViewById(R.id.txtSaludo);
        txtNombre = (TextView) findViewById(R.id.txtNOMBRES);
        txtgenero = (TextView) findViewById(R.id.txtGenero);
        txtFechaNac = (TextView) findViewById(R.id.txtFECHANAC);
        txtTelefono = (TextView) findViewById(R.id.txtTELEFONO);

        txtSaludo.setText("Hola " + b.getString("nombres"));

        b = this.getIntent().getExtras();
        txtSaludo.setText("Hola " + b.getString("nombres") + " " +"Bienvenid@. A continuación tus datos...");
        txtNombre.setText(b.getString("nombres"));
        txtgenero.setText(b.getString("genero"));
        txtFechaNac.setText(b.getString("fechanac"));
        txtTelefono.setText(b.getString("telefono"));


    }
}