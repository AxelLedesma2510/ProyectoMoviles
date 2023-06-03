package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListaAmbientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_ambientes);
    }

    //Mètodo boton Agregar
    public void Agregar(View view)
    {
        Intent siguiente = new Intent(this,Ambiente.class);
        startActivity(siguiente);
    }
}