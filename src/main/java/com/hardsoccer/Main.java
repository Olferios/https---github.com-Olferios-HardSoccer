package com.hardsoccer;

import java.util.Scanner;

import com.hardsoccer.vista.ViewEntrenador;
import com.hardsoccer.vista.ViewEntrenamiento;
import com.hardsoccer.vista.ViewEstadio;
import com.hardsoccer.vista.ViewJugador;
import com.hardsoccer.vista.ViewLesion;
import com.hardsoccer.vista.ViewPartidos;
import com.hardsoccer.vista.ViewPatrocinios;
import com.hardsoccer.vista.viewEquipo;

public class Main {
    public static void main(String[] args) {
        Controller controlJugadores = new Controller();
        ViewJugador.controlador = controlJugadores;

        Controller controlLesiones = new Controller();
        ViewLesion.controlador = controlLesiones;

        Controller controlEstadios = new Controller();
        ViewEstadio.controlador = controlEstadios;

        Controller controlEquipos = new Controller();
        viewEquipo.controlador = controlEquipos;

        Controller controlEntrenadores = new Controller();
        ViewEntrenador.controlador = controlEntrenadores;

        Controller controlEntrenamiento = new Controller();
        ViewEntrenamiento.controlador = controlEntrenamiento;

        Controller controlPatrocinio = new Controller();
        ViewPatrocinios.controlador = controlPatrocinio;

        Controller controlPartidos = new Controller();
        ViewPartidos.controlador = controlPartidos;

        Scanner eleccion = new Scanner(System.in);
        while (true) {
            System.out.println("1. Gestionar Jugadores");
            System.out.println("2. Gestionar Lesiones");
            System.out.println("3. Gestionar estadios");
            System.out.println("4. Gestion equipos ");
            System.out.println("5. Gestionar entrenadores ");
            System.out.println("6. Gestionar Entrenamientos ");
            System.out.println("7. Gestionar Patrocinios ");
            System.out.println("8. Gestionar Partidos ");

            System.out.println("9. Salir");

            int opcion = eleccion.nextInt();
            eleccion.nextLine();

            switch (opcion) {
                case 1:
                    ViewJugador vistaJugador = new ViewJugador();
                    vistaJugador.startJugador();
                    break;
                case 2:
                    ViewLesion vistaLesion = new ViewLesion();
                    vistaLesion.startLesion();
                    break;
                case 3:
                    ViewEstadio vistaEstadio = new ViewEstadio();
                    vistaEstadio.startEstadio();
                    break;

                case 4:
                    viewEquipo vistaEquipo = new viewEquipo();
                    vistaEquipo.startEquipo();
                    break;

                case 5:
                    ViewEntrenador vistaEntrenador = new ViewEntrenador();
                    vistaEntrenador.startEntrenador();
                    break;
                case 6:
                    ViewEntrenamiento vistaEntrenamiento = new ViewEntrenamiento();
                    vistaEntrenamiento.startEntrenamiento();
                    break;
                case 7:
                    ViewPatrocinios vistaPatrocinios = new ViewPatrocinios();
                    vistaPatrocinios.startPatrocinio();
                    break;
                case 8:
                    ViewPartidos vistaPartido = new ViewPartidos();
                    vistaPartido.startPartido();
                    break;

                case 9:
                    System.out.println("Saliendo...");

                    break;
                default:
                    System.out.println("Opción inválida");
                    eleccion.close();
            }
        }

        // Controller ctrlEstadio=new Controller();
        // ViewEstadio.controlador=ctrlEstadio;

        // ViewEstadio ve=new ViewEstadio();
        // ve.start();
    }
}