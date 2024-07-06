package com.hardsoccer.clase;

public class Transferencia {
    private int id;
    Jugador jugador;
    Equipo equipoOrigen;
    Equipo equipoDestino;
    private int monto;
    private String fecha;

    public Transferencia() {
    }

    public Transferencia(int id, Jugador jugador, Equipo equipoOrigen, Equipo equipoDestino, int monto, String fecha) {
        this.id = id;
        this.jugador = jugador;
        this.equipoOrigen = equipoOrigen;
        this.equipoDestino = equipoDestino;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Equipo getEquipoOrigen() {
        return equipoOrigen;
    }

    public void setEquipoOrigen(Equipo equipoOrigen) {
        this.equipoOrigen = equipoOrigen;
    }

    public Equipo getEquipoDestino() {
        return equipoDestino;
    }

    public void setEquipoDestino(Equipo equipoDestino) {
        this.equipoDestino = equipoDestino;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    

}
