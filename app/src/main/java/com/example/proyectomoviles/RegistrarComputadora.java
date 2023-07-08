package com.example.proyectomoviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RegistrarComputadora extends AppCompatActivity {

    EditText eTNomCom;
    Button btnAgregaCo;

    private String idAmbiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_computadora);

        eTNomCom=(EditText)findViewById(R.id.eTNomComp);
        btnAgregaCo = (Button) findViewById(R.id.btnAgregaComp);

        idAmbiente = getIntent().getStringExtra("idAmbiente");



        btnAgregaCo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarServicio("https://utpjoser.000webhostapp.com/ProyectoMoviles/InsertComputadora.php");
                eTNomCom.setText("");
                DataManager.getInstance().notifyDataChanged();
                Retornar();
            }

        });
    }

    private void ejecutarServicio(String URL)
    {
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaMySQL = formato.format(fechaActual);

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
        }){
            @Override
            protected Map<String, String>getParams() throws AuthFailureError{
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("IDAmbiente",idAmbiente);
                parametros.put("Estado","1");
                parametros.put("Modelo",eTNomCom.getText().toString());
                parametros.put("Fecha",fechaMySQL);
                return parametros;
            }
        };

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    public void Retornar()
    {
        Intent siguiente = new Intent(this,ListaAmbientes.class);
        startActivity(siguiente);
    }
}