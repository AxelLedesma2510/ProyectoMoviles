package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.proyectomoviles.recyclerAmb.AdaptadorAmbientes;
import com.example.proyectomoviles.recyclerAmb.DAmbientes;
import com.google.android.material.snackbar.Snackbar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ListaAmbientes extends AppCompatActivity implements DataChangeListener{

    @Override
    public void onDataChanged() {
        // Actualiza la interfaz de usuario de la actividad
    }
   private RecyclerView recView;
   private RecyclerView.Adapter adapter;
   private List<DAmbientes> LAmbientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_ambientes);

        recView = (RecyclerView) findViewById(R.id.recView);
        recView.setHasFixedSize(true);
        recView.setLayoutManager(new LinearLayoutManager(this));

        LAmbientes = new ArrayList<>();
        obtenerDatosAmbientes();
    }

    private void obtenerDatosAmbientes() {
        String url = "https://utpjoser.000webhostapp.com/ProyectoMoviles/SelectAmbiente.php";

        StringRequest request = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray array = new JSONArray(response);

                            for (int i = 0; i < array.length(); i++) {
                                JSONObject ambi = (JSONObject) array.get(i);
                                LAmbientes.add(new DAmbientes(
                                        ambi.getString("Descripcion"),
                                        ambi.getString("IDAmbiente")
                                ));
                            }
                            AdaptadorAmbientes adapter= new AdaptadorAmbientes(getApplicationContext(),LAmbientes);
                            recView.setAdapter(adapter);

                        }
                        catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },   new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_SHORT).show();
                    }
                });

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(request);
    }


    //Mètodo boton Agregar
    public void Agregar(View view)
    {
        Intent siguiente = new Intent(this,Ambiente.class);
        startActivity(siguiente);
    }


}