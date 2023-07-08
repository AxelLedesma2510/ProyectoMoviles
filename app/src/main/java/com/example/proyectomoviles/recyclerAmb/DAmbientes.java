package com.example.proyectomoviles.recyclerAmb;

public class DAmbientes {
    private String Descr;
    private String idAmb;

    public DAmbientes(String tit, String sub){
        Descr = tit;
        idAmb = sub;
    }
    public String getDescr(){
        return Descr;
    }
    public String getIdAmb(){
        return idAmb;
    }
}

