package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrarAmbiente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_ambiente);
    }

    public void GuardarAmbiente(View view)
    {
        Intent siguiente = new Intent(this,ListaAmbientes.class);
        startActivity(siguiente);

    }
}