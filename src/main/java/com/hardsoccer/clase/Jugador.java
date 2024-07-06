package com.hardsoccer.clase;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends Person {

    private String posicion;
    private String nacionalidad;
    private String dorsal;
    private Equipo equipo;
    private List<Lesion> lstLesion;
    private List<Rendimiento> lstRendimiento;
    
    // Constructor por defecto
    public Jugador() {
        lstLesion = new ArrayList<Lesion>();
        lstRendimiento = new ArrayList<Rendimiento>();
    }
    




    // Getters and setters
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<Lesion> getLstLesion() {
        return lstLesion;
    }

    public void setLstLesion(Lesion lesion) {
        this.lstLesion.add(lesion);
    }

    public List<Rendimiento> getLstRendimiento() {
        return lstRendimiento;
    }

    public void setLstRendimient(Rendimiento rendimiento) {
        this.lstRendimiento.add(rendimiento);
    }
}
