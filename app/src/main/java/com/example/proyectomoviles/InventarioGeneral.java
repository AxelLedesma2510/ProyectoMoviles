package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
import com.example.proyectomoviles.recyclerAmb.AdaptadorAmbientes;
import com.example.proyectomoviles.recyclerAmb.DAmbientes;
import com.example.proyectomoviles.recyclerGen.AdaptadorGeneral;
import com.example.proyectomoviles.recyclerGen.DGeneral;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventarioGeneral extends AppCompatActivity implements DataChangeListener{

    @Override
    public void onDataChanged() {
        // Actualiza la interfaz de usuario de la actividad
    }
    private RecyclerView recView;
    private RecyclerView.Adapter adapter;
    private List<DGeneral> LGeneral;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario_general);

        recView = (RecyclerView) findViewById(R.id.rwInG);
        recView.setHasFixedSize(true);
        recView.setLayoutManager(new LinearLayoutManager(this));

        LGeneral = new ArrayList<>();
        obtenerDatosAmbientes();
    }
    private void obtenerDatosAmbientes() {
        String url = "https://utpjoser.000webhostapp.com/ProyectoMoviles/SelectAccesorio.php";

        StringRequest request = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray array = new JSONArray(response);

                            for (int i = 0; i < array.length(); i++) {
                                JSONObject gene = (JSONObject) array.get(i);
                                LGeneral.add(new DGeneral(
                                        gene.getInt("IDAccesorio"),
                                        gene.getString("Descripcion"),
                                        gene.getString("Tipo"),
                                        gene.getInt("IDComputadora"),
                                        gene.getInt("Estado")
                                ));
                            }
                            AdaptadorGeneral adapter= new AdaptadorGeneral(getApplicationContext(),LGeneral);
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
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("IDAmbiente", String.valueOf(1));
                return parametros;
            }
        };

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    public void Agregar(View view)
    {
        Intent siguiente = new Intent(this,MainActivity.class);
        startActivity(siguiente);
    }
}