package com.hardsoccer.vista;

import java.util.Scanner;

import com.hardsoccer.Controller;
import com.hardsoccer.clase.Jugador;
import com.hardsoccer.clase.Lesion;

public class ViewLesion {

    public static Controller controlador;

    public void startLesion() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar Lesión");
            System.out.println("2. Actualizar Lesión");
            System.out.println("3. Eliminar Lesión");
            System.out.println("4. Listar Lesiones");
            System.out.println("5. Salir");

            int choice = scanner.nextInt();

            scanner.nextLine();
            switch (choice) {
                case 1:
                    Lesion lesion = new Lesion();
                    System.out.println("ingrese id lesion");
                    int idLesion = scanner.nextInt();
                    lesion.setId(idLesion);
                    scanner.nextLine();

                    System.out.println("ingrese id del jugador");
                    int idJugador = scanner.nextInt();
                    scanner.nextLine();
                    Jugador jugador = controlador.jugadores.get(String.valueOf(idJugador));
                    if (jugador == null) {
                        System.out.println("jugador no existe");
                        break;
                    } else {
                        lesion.setJugadorLesion(jugador);
                    }

                    System.out.println("tipo lesion");
                    String tipoLesion = scanner.nextLine();
                    lesion.setTipo(tipoLesion);

                    System.out.println("gravedad lesion");
                    String gravedadLesion = scanner.nextLine();
                    lesion.setGravedad(gravedadLesion);

                    System.out.println("fecha inicio lesion");
                    String fechaLesion = scanner.nextLine();
                    lesion.setFechaInicio(fechaLesion);

                    System.out.println("fecha fin lesion");
                    String fechaFinLesion = scanner.nextLine();
                    lesion.setFechaFin(fechaFinLesion);

                    controlador.lesiones.put(String.valueOf(idLesion), lesion);
                    jugador.getLstLesion().add(lesion);
                    controlador.jugadores.put(String.valueOf(idJugador), jugador);

                    System.out.println("agregado correctamente");

                    break;

                case 2:
                    System.out.println("ingrese id lesion");
                    int idLesionUpdate = scanner.nextInt();
                    scanner.nextLine();
                    if (controlador.lesiones.containsKey(String.valueOf(idLesionUpdate))) {
                        Lesion lesionUpdate = controlador.lesiones.get(String.valueOf(idLesionUpdate));
                        System.out.println("ingrese nuevo tipo lesion");
                        String tipoLesionUpdate = scanner.nextLine();
                        lesionUpdate.setTipo(tipoLesionUpdate);

                        System.out.println("ingrese nueva gravedad lesion");
                        String gravedadLesionUpdate = scanner.nextLine();
                        lesionUpdate.setGravedad(gravedadLesionUpdate);

                        System.out.println("ingrese nueva fecha inicio lesion");
                        String fechaLesionUpdate = scanner.nextLine();
                        lesionUpdate.setFechaInicio(fechaLesionUpdate);

                        System.out.println("ingrese nueva fecha fin lesion");
                        String fechaFinLesionUpdate = scanner.nextLine();
                        lesionUpdate.setFechaFin(fechaFinLesionUpdate);

                        System.out.println("Lesion Actualziada");

                    } else {
                        System.out.println("Lesion no encontrado");
                    }

                    break;

                case 3:
                    System.out.println("Ingrese ID de la lesión a eliminar:");
                    int idLesionDelete = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea después de nextInt()

                    if (controlador.lesiones.containsKey(String.valueOf(idLesionDelete))) {
                        Lesion lesionDelete = controlador.lesiones.get(String.valueOf(idLesionDelete));
                        controlador.lesiones.remove(String.valueOf(idLesionDelete)); // Eliminar la lesión del
                                                                                     // controlador

                        Jugador jugadordel = lesionDelete.getJugadorLesion(); // Obtener el jugador asociado a la lesión

                        if (jugadordel != null) {
                            jugadordel.getLstLesion().remove(lesionDelete); // Eliminar la lesión de la lista del
                                                                            // jugador
                            System.out.println("Lesión eliminada con éxito.");
                        } else {
                            System.out.println("Error: No se encontró un jugador asociado a esta lesión.");
                        }
                    } else {
                        System.out.println("Lesión no encontrada.");
                    }
                    break;

                case 4:
                    System.out.println("Listado de Lesiones:");
                    for (String key : controlador.lesiones.keySet()) {
                        Lesion lesionShow = controlador.lesiones.get(key);
                        System.out.println("ID: " + lesionShow.getId());
                        System.out.println("Jugador Lesionado: " + lesionShow.getJugadorLesion().getNombre());
                        System.out.println("Tipo: " + lesionShow.getTipo());
                        System.out.println("Gravedad: " + lesionShow.getGravedad());
                        System.out.println("Fecha Inicio: " + lesionShow.getFechaInicio());
                        System.out.println("Fecha Fin: " + lesionShow.getFechaFin());

                    }
                    break;

                case 5:
                    System.out.println("Saliendo al menu anterior");
                    return;
                default:
                    scanner.close();

            }
        }
    }
}