package com.hardsoccer.clase;

public class Actividad {
    private int id;
    private String descripcion;
    private int duracion;
    public Actividad() {
    }
    public Actividad(int id, String descripcion, int duracion) {
        this.id = id;
        this.descripcion = descripcion;
        this.duracion = duracion;
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
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    

}
