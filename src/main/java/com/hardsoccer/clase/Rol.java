package com.hardsoccer.clase;

import java.util.ArrayList;
import java.util.List;

public class Rol {
    private int id;
    private String nombre;
    private List<Permiso> lstPermisos;
    public Rol(){
        lstPermisos = new ArrayList<>();
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
    public List<Permiso> getLstPermisos() {
        return lstPermisos;
    }
    public void setLstPermisos(Permiso permiso) {
        this.lstPermisos.add(permiso);
    }
    
    

}
