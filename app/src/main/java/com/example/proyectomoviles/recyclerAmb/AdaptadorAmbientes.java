package com.example.proyectomoviles.recyclerAmb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.proyectomoviles.R;

public class AdaptadorAmbientes extends RecyclerView.Adapter<AdaptadorAmbientes.ViewHolder>{

    private Context mCtx;
    private List<DAmbientes> LAmbientes;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtDescA, txtIdA;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDescA = itemView.findViewById(R.id.txtDescA);
            txtIdA = itemView.findViewById(R.id.txtIdA);
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
    }

    @Override
    public int getItemCount() {
        return LAmbientes.size();
    }


}
