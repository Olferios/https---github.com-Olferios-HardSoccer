package com.hardsoccer.clase;

import java.util.ArrayList;
import java.util.List;

public class Comunicacion {
    private int id;
    private String titulo;
    private String contenido;
    private String fecha;
    private List<Usuario> lstUsuarios;

    public Comunicacion(){
        lstUsuarios = new ArrayList<>();
    }

    public Comunicacion(int id, String titulo, String contenido, String fecha) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Usuario> getLstUsuarios() {
        return lstUsuarios;
    }

    public void setLstUsuarios(Usuario usuario) {
        this.lstUsuarios.add(usuario);
    }
    

    

}
