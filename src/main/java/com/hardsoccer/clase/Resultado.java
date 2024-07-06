package com.hardsoccer.clase;

public class Resultado {
    private int id;
    Partido partido;
    private int golesLocal;
    private int golesVisitante;

    public Resultado() {
    }

    public Resultado(int id, Partido partido, int golesLocal, int golesVisitante) {
        this.id = id;
        this.partido = partido;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
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

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    
    

}
