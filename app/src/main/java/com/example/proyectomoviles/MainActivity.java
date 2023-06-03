package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Mètodo boton LActividades
    public void LActividades(View view)
    {
        Intent siguiente = new Intent(this,ListaAmbientes.class);
        startActivity(siguiente);
    }

    //Mètodo boton Herramientas
    public void Herramientas(View view)
    {
        Intent siguiente = new Intent(this,Herramientas.class);
        startActivity(siguiente);
    }

    //Mètodo boton Ade
    public void Ade(View view)
    {
        Intent siguiente = new Intent(this,Acercade.class);
        startActivity(siguiente);
    }

}