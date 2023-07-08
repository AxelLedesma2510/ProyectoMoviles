package com.example.proyectomoviles.recyclerAmb;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.proyectomoviles.Ambiente;
import com.example.proyectomoviles.R;

public class AdaptadorAmbientes extends RecyclerView.Adapter<AdaptadorAmbientes.ViewHolder>{

    private Context mCtx;
    private List<DAmbientes> LAmbientes;




    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtDescA, txtIdA;

        ImageButton boton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtDescA = itemView.findViewById(R.id.txtDescA);
            txtIdA = itemView.findViewById(R.id.txtIdA);
            boton = itemView.findViewById(R.id.btnDelet);

        }
    }


    public AdaptadorAmbientes(Context mCtx, List<DAmbientes> LAmbientes) {
        this.mCtx = mCtx;
        this.LAmbientes = LAmbientes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_item_ambientes, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DAmbientes damb= LAmbientes.get(position);
        holder.txtDescA.setText(damb.getDescr());
        holder.txtIdA.setText(damb.getIdAmb());
        holder.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener los datos del elemento actual
                String descripcion = damb.getDescr();
                String idAmbiente = damb.getIdAmb();

                // Crear un intent para iniciar la nueva actividad
                Intent intent = new Intent(mCtx, Ambiente.class);
                intent.putExtra("descripcion", descripcion);
                intent.putExtra("idAmbiente", idAmbiente);
                mCtx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return LAmbientes.size();
    }


}
