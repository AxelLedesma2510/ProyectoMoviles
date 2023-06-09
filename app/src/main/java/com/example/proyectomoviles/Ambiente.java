package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ambiente extends AppCompatActivity {

    private TextView miTextView;
    private String idAmbiente;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambiente);


        String descripcion = getIntent().getStringExtra("descripcion");
        idAmbiente = getIntent().getStringExtra("idAmbiente");

        String texto = descripcion;
        miTextView = findViewById(R.id.nomAmbiente);
        miTextView.setText(texto);

    }

    //Mètodo boton cAmbiente
    public void cAmbiente(View view)
    {
        Intent siguiente = new Intent(this,ListaAmbientes.class);
        siguiente.putExtra("idAmbiente", idAmbiente);
        startActivity(siguiente);
    }

    //Mètodo boton IGeneral
    public void IGeneral(View view)
    {
        Intent siguiente = new Intent(this, InventarioGeneral.class);
        siguiente.putExtra("idAmbiente", idAmbiente);
        startActivity(siguiente);
    }

    //Mètodo boton IPComputadoras
    public void IPComputadoras(View view)
    {
        Intent siguiente = new Intent(this,InventariopComputadoras.class);
        siguiente.putExtra("idAmbiente", idAmbiente);
        startActivity(siguiente);
    }
}