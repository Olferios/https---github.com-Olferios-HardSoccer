package com.hardsoccer.vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hardsoccer.Controller;
import com.hardsoccer.clase.Actividad;
import com.hardsoccer.clase.Entrenamiento;
import com.hardsoccer.clase.Equipo;
import com.hardsoccer.clase.Jugador;

public class ViewEntrenamiento {
    public static Controller controlador;

    public void startEntrenamiento() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar Entrenamiento");
            System.out.println("2. Actualizar Entrenamiento");
            System.out.println("3. Eliminar Entrenamiento");
            System.out.println("4. Listar Entrenamientos");
            System.out.println("5. Salir");

            int choice = scanner.nextInt();
            scanner.nextInt();
            switch (choice) {
                case 1:
                    Entrenamiento entrenamiento = new Entrenamiento();
                    System.out.println("ingrese id de entrenamiento");
                    int idEntrenamiento = scanner.nextInt();
                    entrenamiento.setId(idEntrenamiento);
                    scanner.nextLine();

                    System.out.println("ingrese id del equipo");
                    int idequipo = scanner.nextInt();
                    scanner.nextLine();
                    Equipo equipo = controlador.equipos.get(String.valueOf(idequipo));
                    if (equipo == null) {
                        System.out.println("equipo no existe");
                        break;
                    } else {
                        entrenamiento.setEquipo(equipo);
                    }

                    System.out.println("Ingrese fecha de entrenamiento");
                    String fechaEntrenamiento = scanner.nextLine();
                    entrenamiento.setFecha(fechaEntrenamiento);

                    System.out.println("Ingrese hora de entrenamiento");
                    String horaEntrenamiento = scanner.nextLine();
                    entrenamiento.setHora(horaEntrenamiento);

                    while (true) {
                        System.out.println("Agregar actividad");
                        System.out.println("ingrese id Actividad");
                        int idActividad = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("ingrese descripcion actividad");
                        String descripcionActividad = scanner.nextLine();

                        System.out.println("ingrese duracion actividad");
                        int duracionActividad = scanner.nextInt();
                        scanner.nextLine();

                        Actividad actividad = new Actividad(idActividad, descripcionActividad, duracionActividad);
                        entrenamiento.setLstActividades(actividad);
                        controlador.actividades.put(String.valueOf(idActividad), actividad);

                        System.out.println("Quiere agregar otra actividad? (s/n)");
                        String respuesta = scanner.nextLine();
                        if (!respuesta.equalsIgnoreCase("s")) {
                            break;
                        }

                    }

                    System.out.println("agregar jugadores");
                    while (true) {
                        System.out.println("ingrese id jugador");
                        int idJugador = scanner.nextInt();
                        scanner.nextLine();
                        Jugador jugador = controlador.jugadores.get(String.valueOf(idJugador));
                        if (jugador == null) {
                            System.out.println("jugador no existe");
                            break;
                        } else {
                            entrenamiento.setLstJugadores(jugador);
                        }
                        System.out.println("Quiere agregar otro jugador? (s/n)");
                        String respuestaJug = scanner.nextLine();
                        if (!respuestaJug.equalsIgnoreCase("s")) {
                            break;
                        }

                    }

                    break;
                case 2:
                    System.out.println("Ingrese id del entrenamiento");
                    int idEntrenamientoUpdate = scanner.nextInt();
                    scanner.nextLine();
                    if(controlador.entrenamientos.containsKey(String.valueOf(idEntrenamientoUpdate))){
                        System.out.println("ingrese fecha de entrenamiento");
                        String fechaEntrenamientoUpdate = scanner.nextLine();
                        controlador.entrenamientos.get(String.valueOf(idEntrenamientoUpdate)).setFecha(fechaEntrenamientoUpdate);
                        System.out.println("ingrese hora de entrenamiento");
                        String horaEntrenamientoUpdate = scanner.nextLine();
                        controlador.entrenamientos.get(String.valueOf(idEntrenamientoUpdate)).setHora(horaEntrenamientoUpdate);
                        System.out.println("ingrese lugar de entrenamiento");
                        String lugarEntrenamientoUpdate = scanner.nextLine();
                        controlador.entrenamientos.get(String.valueOf(idEntrenamientoUpdate)).setLugar(lugarEntrenamientoUpdate);

                        System.out.println("ingrese id de actividades");

                        List<Actividad> lstTemporalActividad= new ArrayList<Actividad>();
                        lstTemporalActividad=controlador.entrenamientos.get(String.valueOf(idEntrenamientoUpdate)).getLstActividades();



                //     }
                //     break;
                // case 3:
                //     controlador.eliminarEntrenamiento();
                //     break;
                // case 4:
                //     controlador.listarEntrenamientos();
                //     break;
                // case 5:
                //     System.exit(0);
                //     break;
                // default:
                //     scanner.close();
                //     break;
            }

        }
    }
}
