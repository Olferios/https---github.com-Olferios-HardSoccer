package com.hardsoccer.clase;

public class Tarjeta {
    private int id;
    Jugador jugador;
    Partido partido;
    private String tipo;
    private String minuto;
    public Tarjeta(int id, String tipo, String minuto) {
        this.id = id;
        this.tipo = tipo;
        this.minuto = minuto;
    }
    // getter and setter

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
    public String getMinuto() {
        return minuto;
    }
    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

}
