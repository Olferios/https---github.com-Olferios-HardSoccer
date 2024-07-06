package com.hardsoccer.clase;

public class Noticia {
    private int id;
    private String titulo;
    private String Descripcion;
    public Noticia() {
    }
    public Noticia(int id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        Descripcion = descripcion;
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
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    

}
