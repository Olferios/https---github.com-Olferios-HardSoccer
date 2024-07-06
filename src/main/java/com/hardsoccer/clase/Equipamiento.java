package com.hardsoccer.clase;

public class Equipamiento {
    private int id;
    private String tipo;
    private int cantidad;
    Equipo equipoAsociado;
    private String fechaAsociada;
    public Equipamiento() {
    }
    public Equipamiento(int id, String tipo, int cantidad, Equipo equipoAsociado, String fechaAsociada) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.equipoAsociado = equipoAsociado;
        this.fechaAsociada = fechaAsociada;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Equipo getEquipoAsociado() {
        return equipoAsociado;
    }
    public void setEquipoAsociado(Equipo equipoAsociado) {
        this.equipoAsociado = equipoAsociado;
    }
    public String getFechaAsociada() {
        return fechaAsociada;
    }
    public void setFechaAsociada(String fechaAsociada) {
        this.fechaAsociada = fechaAsociada;
    }

    

}
