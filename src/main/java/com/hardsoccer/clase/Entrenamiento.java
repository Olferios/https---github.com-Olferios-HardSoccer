package com.hardsoccer.clase;

import java.util.ArrayList;
import java.util.List;

public class Entrenamiento {
    private int id;
    Equipo equipo;
    private String fecha;
    private String hora;
    private String lugar;
    private List<Actividad>lstActividades;
    private List<Jugador>lstJugadores;

    public Entrenamiento(){
        lstActividades = new ArrayList<>();
        lstJugadores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Actividad> getLstActividades() {
        return lstActividades;
    }

    public void setLstActividades(Actividad actividad) {
        this.lstActividades.add(actividad);
    }

    public List<Jugador> getLstJugadores() {
        return lstJugadores;
    }

    public void setLstJugadores(Jugador jugador) {
        this.lstJugadores.add(jugador);
    }
    


}
