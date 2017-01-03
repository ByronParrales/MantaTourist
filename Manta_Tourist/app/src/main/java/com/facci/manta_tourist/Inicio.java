package com.facci.manta_tourist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {

    Button btnIniciar,btnRegistrar;
    TextView tvIniciar;
    EditText etNombre, etContraseña;
    CheckBox cbdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        btnIniciar = (Button)findViewById(R.id.btnIniciar);
        btnRegistrar = (Button)findViewById(R.id.btnRegistrar);
        tvIniciar = (TextView)findViewById(R.id.tvIniciar);
        etNombre = (EditText)findViewById(R.id.etNombre);
        etContraseña = (EditText)findViewById(R.id.etContraseña);
        cbdata =(CheckBox)findViewById(R.id.cbdata);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Inicio.this, Registrar.class);
                startActivity(intent1);
            }
        });

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01 = new Intent(Inicio.this, Explorar.class);
                startActivity(intent01);
            }
        });
    }
}
