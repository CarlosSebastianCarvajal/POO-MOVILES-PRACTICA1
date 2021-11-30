package com.example.practica1_controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNombres;
    TextView txtFNacimiento;
    TextView txtTelefono;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombres = (TextView) findViewById(R.id.txtPersonName);
        txtFNacimiento = (TextView) findViewById(R.id.txtFechaNac);
        txtTelefono = (TextView) findViewById(R.id.txtTelefono);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviar();
            }
        });

    }

    public void enviar(){
        Intent intent = new Intent(this, MainActivity2.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        Bundle b = new Bundle();
        b.putString("nombres", txtNombres.getText().toString());
        b.putString("genero", "Masculino");
        b.putString("fechanac", txtFNacimiento.getText().toString());
        b.putString("telefono", txtTelefono.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}