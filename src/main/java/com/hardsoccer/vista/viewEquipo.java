package com.hardsoccer.vista;

import java.util.Scanner;

import com.hardsoccer.Controller;
import com.hardsoccer.clase.Entrenador;
import com.hardsoccer.clase.Equipo;
import com.hardsoccer.clase.Estadio;

public class viewEquipo {
    public static Controller controlador;

    public void startEquipo() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar Equipo");
            System.out.println("2. Actualizar Equipo");
            // System.out.println("3. Eliminar Equipo");
            // System.out.println("4. Listar Equipos");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    Equipo equipo = new Equipo();
                    System.out.println("Ingrese id del equipo");
                    int idEquipo = scanner.nextInt();
                    equipo.setId(idEquipo);
                    scanner.nextLine();

                    System.out.println("Ingrese nombre de equipo");
                    String nombreEquipo = scanner.nextLine();
                    equipo.setNombre(nombreEquipo);

                    System.out.println("Ingrese Ciudad de equipo");
                    String ciudadEquipo = scanner.nextLine();
                    equipo.setCiudad(ciudadEquipo);

                    System.out.println("Ingrese id Estadio");
                    int idEstadioEquipo = scanner.nextInt();
                    Estadio estadio = controlador.estadios.get(String.valueOf(idEstadioEquipo));
                    equipo.setEstadio(estadio);

                    System.out.println("ingrese id entrenador");
                    int idEntrenadorEquipo = scanner.nextInt();
                    Entrenador entrenador = controlador.entrenadores.get(String.valueOf(idEntrenadorEquipo));
                    equipo.setEntrenador(entrenador);

                    controlador.equipos.put(String.valueOf(idEquipo), equipo);

                    break;

                case 2:
                    System.out.println("Ingrese Id equipo actualizar");
                    int upIntEquipo = scanner.nextInt();
                    scanner.nextLine();
                    if (controlador.equipos.containsKey(String.valueOf(upIntEquipo))) {
                        Equipo upEquipo = controlador.equipos.get(String.valueOf(upIntEquipo));
                        System.out.println("Ingrese nuevo nombre del equipo");
                        String upNombreEquipo = scanner.nextLine();
                        upEquipo.setNombre(upNombreEquipo);

                        System.out.println("nuevo ciudad equipo");
                        String upCiudadEquipo = scanner.nextLine();
                        upEquipo.setCiudad(upCiudadEquipo);

                        System.out.println("nuevo id Estadio");
                        int upIdEstadioEquipo = scanner.nextInt();
                        Estadio upEstadio = controlador.estadios.get(String.valueOf(upIdEstadioEquipo));
                        if (upEstadio == null) {
                            System.out.println("Error: Estadio no encontrado.");
                        } else {
                            upEquipo.setEstadio(upEstadio);
                            System.out.println("Estadio del equipo actualizado con éxito.");
                        }

                    }

                case 3:
                    System.out.println("Ingrese id equipo eliminar");
                    int delIntEquipo = scanner.nextInt();
                    scanner.nextLine();
                    if (controlador.equipos.containsKey(String.valueOf(delIntEquipo))) {
                        controlador.equipos.remove(String.valueOf(delIntEquipo));
                        System.out.println("Equipo eliminado");
                    } else {
                        System.out.println("Equipo no encontrado");
                    }

                case 4:
                    System.out.println("Listado de equipos");
                    for (String key : controlador.equipos.keySet()) {
                        Equipo equipoShow = controlador.equipos.get(key);
                        System.out.println("id;" + equipoShow.getId());
                        System.out.println("Nombre;" + equipoShow.getNombre());
                        System.out.println("Ciudad;" + equipoShow.getCiudad());
                        System.out.println("Estadio;" + equipoShow.getEstadio().getId());
                        System.out.println("Entrenador;" + equipoShow.getEntrenador().getId());
                        System.out.println("-------------------------");

                    }

                    case 5:
                    System.out.println("Saliendo siuuuu");
                    return;
                    default:
                    scanner.close();

            }
        }

    }
}