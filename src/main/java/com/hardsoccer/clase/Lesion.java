package com.hardsoccer.clase;

public class Lesion {
    private int id;
    private Jugador jugadorLesion;
    private String tipo;
    private String gravedad;
    private String fechaInicio;
    private String fechaFin;
    public Lesion() {
    }
    public Lesion(int id, Jugador jugadorLesion, String tipo, String gravedad, String fechaInicio, String fechaFin) {
        this.id = id;
        this.jugadorLesion = jugadorLesion;
        this.tipo = tipo;
        this.gravedad = gravedad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Jugador getJugadorLesion() {
        return jugadorLesion;
    }
    public void setJugadorLesion(Jugador jugadorLesion) {
        this.jugadorLesion = jugadorLesion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getGravedad() {
        return gravedad;
    }
    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    

    

}
