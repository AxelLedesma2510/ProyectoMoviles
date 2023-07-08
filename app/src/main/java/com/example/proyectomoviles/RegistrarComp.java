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

public class RegistrarComp extends AppCompatActivity {

    EditText eTNomId, eTNomAcc, eTTipo;
    Button btnAgregaAcc;

    private String idAmbiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_accesorio);

        eTNomId=(EditText)findViewById(R.id.eTidComp);
        eTNomAcc=(EditText)findViewById(R.id.eTNomAcc);
        eTTipo=(EditText)findViewById(R.id.eTTipo);

        btnAgregaAcc = (Button) findViewById(R.id.btnAgregaAcc);

        idAmbiente = getIntent().getStringExtra("idAmbiente");



        btnAgregaAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarServicio("https://utpjoser.000webhostapp.com/ProyectoMoviles/InsertComputadora.php");
                eTNomAcc.setText("");
                eTTipo.setText("");
                eTNomId.setText("");
                DataManager.getInstance().notifyDataChanged();
                Retornar();
            }

        });
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
        }){
            @Override
            protected Map<String, String>getParams() throws AuthFailureError{
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("IDComputadora",eTNomId.getText().toString());
                parametros.put("Modelo",eTNomAcc.getText().toString());
                parametros.put("Tipo",eTTipo.getText().toString());

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
