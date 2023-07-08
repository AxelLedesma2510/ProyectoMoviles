package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class RegistrarAmbiente extends AppCompatActivity {

    EditText eTNomAmbiente;
    Button btnAgregaAmb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_ambiente);

        eTNomAmbiente=(EditText)findViewById(R.id.eTNomAmbiente);
        btnAgregaAmb = (Button) findViewById(R.id.btnAgregaAmb);

        btnAgregaAmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarServicio("https://utpjoser.000webhostapp.com/ProyectoMoviles/InsertAmbiente.php");
                eTNomAmbiente.setText("");
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
                parametros.put("IDColegio","1");
                parametros.put("Descripcion",eTNomAmbiente.getText().toString());
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