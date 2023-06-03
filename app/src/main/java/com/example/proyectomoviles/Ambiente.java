package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ambiente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambiente);
    }

    //Mètodo boton cAmbiente
    public void cAmbiente(View view)
    {
        Intent siguiente = new Intent(this,ListaAmbientes.class);
        startActivity(siguiente);
    }

    //Mètodo boton IGeneral
    public void IGeneral(View view)
    {
        Intent siguiente = new Intent(this,InventarioGeneral.class);
        startActivity(siguiente);
    }

    //Mètodo boton IPComputadoras
    public void IPComputadoras(View view)
    {
        Intent siguiente = new Intent(this,InventariopComputadoras.class);
        startActivity(siguiente);
    }
}