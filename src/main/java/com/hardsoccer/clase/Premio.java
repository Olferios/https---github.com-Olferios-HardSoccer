package com.hardsoccer.clase;

public class Premio {
    private int id;
    private String nombre;
    private String descripcion;
    private String criterios;
    private String destinatario;
    private String fecha;
    public Premio() {
    }
    public Premio(int id, String nombre, String descripcion, String criterios, String destinatario, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.criterios = criterios;
        this.destinatario = destinatario;
        this.fecha = fecha;
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
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCriterios() {
        return criterios;
    }
    public void setCriterios(String criterios) {
        this.criterios = criterios;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    
}
