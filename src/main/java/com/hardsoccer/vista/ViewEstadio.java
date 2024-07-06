package com.hardsoccer.vista;

import java.util.Scanner;

import com.hardsoccer.Controller;
import com.hardsoccer.clase.Estadio;

public class ViewEstadio {
    public static Controller controlador;

    public void startEstadio() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Crear Estadio");
            System.out.println("2. Actualizar Estadio");
            System.out.println("3. Eliminar Estadio");
            System.out.println("4. Listar Estadio ");
            System.out.println("5. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    Estadio estadio = new Estadio();
                    System.out.println("Ingrese id del estadio: ");
                    int idEstadio = scanner.nextInt();
                    estadio.setId(idEstadio);
                    scanner.nextLine();

                    System.out.println("Ingrese nombre del estadio");
                    String nombreEstadio = scanner.nextLine();
                    estadio.setNombre(nombreEstadio);

                    System.out.println("Ingrese ubicacion del estadio");
                    String ubicacionEstadio = scanner.nextLine();
                    estadio.setUbicacion(ubicacionEstadio);

                    System.out.println("Ingrese capacidad del estadio");
                    String capacidadEstadio = scanner.nextLine();
                    estadio.setCapacidad(capacidadEstadio);
                    controlador.estadios.put(String.valueOf(idEstadio), estadio);
                    System.out.println("Estadio agregado con éxito!");
                    break;
                case 2:
                    System.out.println("Ingrese codigo del estadio");
                    String upIdEstadio = scanner.nextLine();
                    if (controlador.estadios.containsKey(upIdEstadio)) {
                        Estadio upEstadio = controlador.estadios.get(upIdEstadio);
                        System.out.println("Ingrese nuevo nombre del estadio");
                        String upNombreEstadio = scanner.nextLine();
                        upEstadio.setNombre(upNombreEstadio);

                        System.out.println("Ingrese nueva ubicacion del estadio");
                        String upUbicacionEstadio = scanner.nextLine();
                        upEstadio.setUbicacion(upUbicacionEstadio);

                        System.out.println("Ingrese nueva capacidad del estadio");
                        String upCapacidadEstadio = scanner.nextLine();
                        upEstadio.setCapacidad(upCapacidadEstadio);
                        System.out.println("Estadio actualizado con éxito!");

                    } else {
                        System.out.println("Estadio no encontrado");
                    }

                    break;
                case 3:
                    System.out.println("ingrese codigo de estadio a eliminar");
                    String delIdEstadio = scanner.nextLine();
                    if (controlador.estadios.containsKey(delIdEstadio)) {
                        controlador.estadios.remove(delIdEstadio);
                        System.out.println("Estadio eliminado con éxito!");
                    } else {
                        System.out.println("El estadio no existe menso");
                    }
                    break;
                case 4:
                    System.out.println("Listado de estadios");
                    for (String key : controlador.estadios.keySet()) {
                        Estadio listEstadio = controlador.estadios.get(key);
                        System.out.println("ID: " + listEstadio.getId());
                        System.out.println("Nombre: " + listEstadio.getNombre());
                        System.out.println("Ubicacion: " + listEstadio.getUbicacion());
                        System.out.println("Capacidad: " + listEstadio.getCapacidad());

                    }
                    break;
                case 5:
                    System.out.println("Saliendo siuuuu");
                    return;
                default:
                    scanner.close();

            }

        }

    }
}
