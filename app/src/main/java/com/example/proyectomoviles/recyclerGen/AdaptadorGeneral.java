package com.example.proyectomoviles.recyclerGen;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectomoviles.Ambiente;
import com.example.proyectomoviles.R;
import com.example.proyectomoviles.recyclerAmb.DAmbientes;

import java.util.List;

public class AdaptadorGeneral extends RecyclerView.Adapter<AdaptadorGeneral.ViewHolder>{

    private Context mCtx;
    private List<DGeneral> LGeneral;




    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtDescA, txtIdA, txtTipo, txtEst;

        ImageButton boton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtDescA = itemView.findViewById(R.id.txtDescA);
            txtIdA = itemView.findViewById(R.id.txtIdA);
            txtTipo = itemView.findViewById(R.id.txtTipo);
            txtEst = itemView.findViewById(R.id.txtEst);
            boton = itemView.findViewById(R.id.btnDelet);

        }
    }


    public AdaptadorGeneral(Context mCtx, List<DGeneral> LGeneral) {
        this.mCtx = mCtx;
        this.LGeneral = LGeneral;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_item_accesorios, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DGeneral damb= LGeneral.get(position);
        holder.txtDescA.setText(damb.getDecrArt());
        holder.txtIdA.setText(String.valueOf(damb.getIdAcc()));
        holder.txtTipo.setText(damb.getTipo());
        holder.txtEst.setText(String.valueOf(damb.getEstado()));
    }

    @Override
    public int getItemCount() {
        return LGeneral.size();
    }


}
