package com.hardsoccer.clase;

public class Rendimiento {
    private int id;
    Jugador jugador;
    Partido partido;
    private int minutoJugado;
    private int golesMarcados;
    private int asistencia;
    private int tarjetasAmarillas;
    private int tarjetaRoja;
    
    public Rendimiento() {
    }

    public Rendimiento(int id, Jugador jugador, Partido partido, int minutoJugado, int golesMarcados, int asistencia,
            int tarjetasAmarillas, int tarjetaRoja) {
        this.id = id;
        this.jugador = jugador;
        this.partido = partido;
        this.minutoJugado = minutoJugado;
        this.golesMarcados = golesMarcados;
        this.asistencia = asistencia;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetaRoja = tarjetaRoja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int getMinutoJugado() {
        return minutoJugado;
    }

    public void setMinutoJugado(int minutoJugado) {
        this.minutoJugado = minutoJugado;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetaRoja() {
        return tarjetaRoja;
    }

    public void setTarjetaRoja(int tarjetaRoja) {
        this.tarjetaRoja = tarjetaRoja;
    }
    

    

}
