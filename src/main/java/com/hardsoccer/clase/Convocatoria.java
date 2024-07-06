package com.hardsoccer.clase;

import java.util.ArrayList;
import java.util.List;

public class Convocatoria {
    private int id;
    Partido partido;
    private List<Jugador> lstJugadores;
    private String fecha;
    public Convocatoria() {
        lstJugadores = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public List<Jugador> getLstJugadores() {
        return lstJugadores;
    }
    public void setLstJugadores(Jugador jugador) {
        this.lstJugadores.add(jugador);
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

}
