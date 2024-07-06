package com.hardsoccer.clase;

public class Entrenador extends Person {
    private String ciudad;
    private String experiencia;

    
    public Entrenador(int id, String nombre, String apellido, int edad, String ciudad, String experiencia) {
        super(id, nombre, apellido, edad);
        this.ciudad = ciudad;
        this.experiencia = experiencia;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public String getExperiencia() {
        return experiencia;
    }


    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    

    
    
    
}
