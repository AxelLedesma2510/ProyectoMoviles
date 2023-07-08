package com.example.proyectomoviles.recyclerPComp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectomoviles.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AdaptadorPComputadoras extends RecyclerView.Adapter<AdaptadorPComputadoras.ViewHolder>{

    private Context mCtx;
    private List<DPComp> LCom;




    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtIdComp, txtDescC, txtIdA, txtMod, txtEst, txtFecha;

        ImageButton boton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtIdComp = itemView.findViewById(R.id.txtIdComp);
            txtDescC = itemView.findViewById(R.id.txtDescC);
            txtIdA = itemView.findViewById(R.id.txtIdA);
            txtMod = itemView.findViewById(R.id.txtMod);
            txtEst = itemView.findViewById(R.id.txtEst);
            txtFecha = itemView.findViewById(R.id.txtFecha);
            boton = itemView.findViewById(R.id.btnDelet);

        }
    }


    public AdaptadorPComputadoras(Context mCtx, List<DPComp> LCom) {
        this.mCtx = mCtx;
        this.LCom = LCom;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_item_computadoras, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DPComp damb= LCom.get(position);

        Date fechaActual = damb.getFecha();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaTexto = formato.format(fechaActual);

        // Imprimir la fecha convertida
        System.out.println("Fecha en formato texto: " + fechaTexto);
        holder.txtIdComp.setText(String.valueOf(damb.getIdComp()));
        holder.txtDescC.setText("PC"+damb.getIdComp());
        holder.txtIdA.setText(String.valueOf(damb.getIDAmb()));
        holder.txtMod.setText(damb.getModelo());
        holder.txtEst.setText(String.valueOf(damb.getEstado()));
        holder.txtFecha.setText(fechaTexto);
    }

    @Override
    public int getItemCount() {
        return LCom.size();
    }


}
