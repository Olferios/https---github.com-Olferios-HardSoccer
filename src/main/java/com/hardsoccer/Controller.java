package com.hardsoccer;

import java.util.Hashtable;

import com.hardsoccer.clase.Actividad;
import com.hardsoccer.clase.Entrenador;
import com.hardsoccer.clase.Entrenamiento;
import com.hardsoccer.clase.Equipo;
import com.hardsoccer.clase.Estadio;
import com.hardsoccer.clase.Lesion;
import com.hardsoccer.clase.Partido;
import com.hardsoccer.clase.Patrocinador;
import com.hardsoccer.clase.Resultado;
import com.hardsoccer.clase.Jugador;

public class Controller {

    public Hashtable <String,Equipo> equipos=new Hashtable<>();
    public Hashtable <String, Estadio> estadios=new Hashtable<>();
    public Hashtable <String, Entrenador> entrenadores=new Hashtable<>();
    public Hashtable <String, Patrocinador> patrocinadores=new Hashtable<>();
    public Hashtable <String, Lesion> lesiones=new Hashtable<>();
    public Hashtable <String,Jugador>jugadores=new Hashtable<>();
    public Hashtable <String,Partido>partidos=new Hashtable<>();
    public Hashtable <String,Actividad>actividades=new Hashtable<>();
    public Hashtable <String,Entrenamiento>entrenamientos=new Hashtable<>();
    public Hashtable <String,Resultado>resultados=new Hashtable<>();


}
