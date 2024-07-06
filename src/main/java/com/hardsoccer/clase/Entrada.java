package com.hardsoccer.clase;

public class Entrada {
    private int id;
    Partido partido;
    Usuario comprador;
    private int fechaCompra;
    private int cantidad;
    private int precio;
    private String ubicacion;
    public Entrada() {
    }
    public Entrada(int id, Partido partido, Usuario comprador, int fechaCompra, int cantidad, int precio,
            String ubicacion) {
        this.id = id;
        this.partido = partido;
        this.comprador = comprador;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.precio = precio;
        this.ubicacion = ubicacion;
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
    public Usuario getComprador() {
        return comprador;
    }
    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }
    public int getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(int fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    

}
