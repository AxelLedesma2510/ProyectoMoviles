package com.example.proyectomoviles;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;

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

    public void Conectar(View view)
    {
        ejecutarServicio("https://webscapy.000webhostapp.com/database.php");
    }

    private void ejecutarServicio(String URL)
    {
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "OPERACION EXITOSA", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_SHORT).show();
            }
        });

         RequestQueue requestQueue= Volley.newRequestQueue(this);
         requestQueue.add(stringRequest);
    }

}