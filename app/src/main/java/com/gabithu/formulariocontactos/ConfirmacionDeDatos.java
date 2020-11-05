package com.gabithu.formulariocontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ConfirmacionDeDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_de_datos);

        Bundle parametros = getIntent().getExtras();
        String nombre= parametros.getString(getResources().getString(R.string.pnombre));//nombre
        String fechadenacimiento= parametros.getString(getResources().getString(R.string.pfechadenacimiento));//fechadenacimiento
        String telefono= parametros.getString(getResources().getString(R.string.ptelefono));//telefono
        String email= parametros.getString(getResources().getString(R.string.email));//email
        String descripcioncomentario= parametros.getString(getResources().getString(R.string.pdescripcioncomentario));//descripcioncomentario


    }
}