package com.hardsoccer.clase;

public class Incidente {
    private int id;
    Partido partido;
    private String descripcion;
    private String minuto;
    public Incidente(int id, String descripcion, String minuto) {
        this.id = id;
        this.descripcion = descripcion;
        this.minuto = minuto;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getMinuto() {
        return minuto;
    }
    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }
    

}
