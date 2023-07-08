package com.example.proyectomoviles.recyclerPComp;

import java.util.Date;


public class DPComp {
    private String modelo;
    private Date fecha;
    private int  idComp, IDAmb, estado;

    public DPComp() {
    }

    public DPComp(int idComp, int IDAmb, String modelo, int estado, Date fecha) {
        this.modelo = modelo;
        this.fecha = fecha;
        this.idComp = idComp;
        this.IDAmb = IDAmb;
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdComp() {
        return idComp;
    }

    public void setIdComp(int idComp) {
        this.idComp = idComp;
    }

    public int getIDAmb() {
        return IDAmb;
    }

    public void setIDAmb(int IDAmb) {
        this.IDAmb = IDAmb;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
