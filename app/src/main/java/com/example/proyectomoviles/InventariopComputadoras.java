package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.proyectomoviles.recyclerPComp.AdaptadorPComputadoras;
import com.example.proyectomoviles.recyclerPComp.DPComp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventariopComputadoras extends AppCompatActivity implements DataChangeListener{

    private TextView miTextView;
    private String idAmbiente;


    @Override
    public void onDataChanged() {
        // Actualiza la interfaz de usuario de la actividad
    }
    private RecyclerView recView;
    private RecyclerView.Adapter adapter;
    private List<DPComp> LComp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventariop_computadoras);

        idAmbiente = getIntent().getStringExtra("idAmbiente");

        recView = (RecyclerView) findViewById(R.id.rvComp);
        recView.setHasFixedSize(true);
        recView.setLayoutManager(new LinearLayoutManager(this));

        LComp = new ArrayList<>();
        obtenerDatosAmbientes();


    }
    private void obtenerDatosAmbientes() {
        String url = "https://utpjoser.000webhostapp.com/ProyectoMoviles/SelectComputadora.php";

        StringRequest request = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                        Date fecha = null;
                        try {
                            JSONArray array = new JSONArray(response);

                            for (int i = 0; i < array.length(); i++) {
                                JSONObject gene = (JSONObject) array.get(i);
                                fecha = formato.parse(gene.getString("FechaObtencion"));
                                LComp.add(new DPComp(

                                        gene.getInt("IDComputadora"),
                                        gene.getInt("IDAmbiente"),
                                        gene.getString("Modelo"),
                                        gene.getInt("Estado"),
                                        fecha)
                                );
                            }

                            AdaptadorPComputadoras adapter= new AdaptadorPComputadoras(getApplicationContext(), LComp);
                            recView.setAdapter(adapter);

                        }
                        catch (JSONException e) {
                            e.printStackTrace();
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
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
                parametros.put("IDAmbiente", idAmbiente);
                return parametros;
            }
        };

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    public void AgregaCom(View view)
    {
        Intent siguiente = new Intent(this,RegistrarComputadora.class);
        siguiente.putExtra("idAmbiente", idAmbiente);
        startActivity(siguiente);
    }
}