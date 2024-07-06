package com.hardsoccer.clase;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private int id;
    private String nombre;
    private String ciudad;
    Estadio estadio;
    Entrenador entrenador;
    private List <Jugador> lstJugadores;
    private List <Partido> lstPartido;
    public Equipo() {
       
        lstJugadores = new ArrayList<Jugador>();
        lstPartido = new ArrayList<Partido>();
    }
    
    public Equipo(int id, String nombre, String ciudad, Estadio estadio, Entrenador entrenador) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.entrenador = entrenador;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    public Entrenador getEntrenador() {
        return entrenador;
    }
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    public List<Jugador> getLstJugadores() {
        return lstJugadores;
    }
    public void setLstJugadores(Jugador jugador) {
        this.lstJugadores.add(jugador) ;
    }
    public List<Partido> getLstPartido() {
        return lstPartido;
    }
    public void setLstPartido(Partido partido) {
        this.lstPartido.add(partido);
    }

}
