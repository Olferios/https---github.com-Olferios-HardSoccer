package com.hardsoccer.clase;
import java.util.ArrayList;
import java.util.List;



public class Partido {
    private int id;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String fecha;
    private String hora;
    private Estadio estadio;
    private List<Integer> lstGoles = new ArrayList<>();
    private List<Tarjeta> lstTarjeta = new ArrayList<>();
    private List<Incidente> lstIncidentes = new ArrayList<>();
    private String resultado;

    public Partido() {
    }

    // Constructor
    public Partido(int id, Equipo equipoLocal, Equipo equipoVisitante, String fecha, String hora, Estadio estadio) {
        this.id = id;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.hora = hora;
        this.estadio = estadio;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public List<Integer> getLstGoles() {
        return lstGoles;
    }

    public void setLstGoles(List<Integer> lstGoles) {
        this.lstGoles = lstGoles;
    }

    public List<Tarjeta> getLstTarjeta() {
        return lstTarjeta;
    }

    public void setLstTarjeta(List<Tarjeta> lstTarjeta) {
        this.lstTarjeta = lstTarjeta;
    }

    public List<Incidente> getLstIncidentes() {
        return lstIncidentes;
    }

    public void setLstIncidentes(List<Incidente> lstIncidentes) {
        this.lstIncidentes = lstIncidentes;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    // Método para agregar goles
    public void agregarGoles(int golesLocal, int golesVisitante) {
        this.lstGoles.add(golesLocal);
        this.lstGoles.add(golesVisitante);
    }

    // Método para obtener los goles de un partido específico
    public List<Integer> getGolesPorPartido() {
        return lstGoles;
    }
}
