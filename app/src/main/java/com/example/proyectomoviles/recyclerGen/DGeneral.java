package com.example.proyectomoviles.recyclerGen;

public class DGeneral {
    private String decrArt, tipo;

    private int  idAcc, idComp, estado;

    public DGeneral() {
    }

    public DGeneral(int idAcc, String decrArt, String tipo,  int idComp, int estado) {
        this.idAcc = idAcc;
        this.decrArt = decrArt;
        this.tipo = tipo;
        this.idComp = idComp;
        this.estado = estado;
    }

    public String getDecrArt() {
        return decrArt;
    }

    public void setDecrArt(String decrArt) {
        this.decrArt = decrArt;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(int idAcc) {
        this.idAcc = idAcc;
    }

    public int getIdComp() {
        return idComp;
    }

    public void setIdComp(int idComp) {
        this.idComp = idComp;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
