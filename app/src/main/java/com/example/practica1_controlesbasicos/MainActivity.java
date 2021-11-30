package com.example.practica1_controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNombres;
    TextView txtFNacimiento;
    TextView txtTelefono;
    Button btnEnviar;

    RadioButton M, F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombres = (TextView) findViewById(R.id.txtPersonName);
        txtFNacimiento = (TextView) findViewById(R.id.txtFechaNac);
        txtTelefono = (TextView) findViewById(R.id.txtTelefono);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        M = (RadioButton) findViewById(R.id.rbMasculino);
        F = (RadioButton) findViewById(R.id.rbFemenino);

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
        if(M.isChecked()){
            b.putString("genero", "Masculino");
        }else if (F.isChecked()){
            b.putString("genero", "Femenino");
        }else{
            b.putString("genero", "genero desconocido");
        }

        b.putString("fechanac", txtFNacimiento.getText().toString());
        b.putString("telefono", txtTelefono.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}