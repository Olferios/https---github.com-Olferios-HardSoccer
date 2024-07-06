package com.hardsoccer.vista;

import java.util.Scanner;

import com.hardsoccer.Controller;
import com.hardsoccer.clase.Entrenador;

public class ViewEntrenador {
    public static Controller controlador;

    public void startEntrenador() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Crear Entrenador");
            System.out.println("2. Actualizar Entrenador");
            System.out.println("3. Eliminar Entrenador");
            System.out.println("4. Listar Entrenadores");
            System.out.println("5. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Ingrese id del entrenador");
                    int idEntrenador = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese nombre del entrenador");
                    String nombreEntrenador = scanner.nextLine();

                    System.out.println("Ingrese apellido del entrenador");
                    String apellidoEntrenador = scanner.nextLine();

                    System.out.println("Ingrese edad del entrenador");
                    int edadEntrenador = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese ciudad del entrenador");
                    String ciudadEntrenador = scanner.nextLine();

                    System.out.println("Ingrese experiencia del entrenador");
                    String experienciaEntrenador = scanner.nextLine();

                    Entrenador entrenador = new Entrenador(idEntrenador, nombreEntrenador, apellidoEntrenador,
                            edadEntrenador, ciudadEntrenador, experienciaEntrenador);
                    controlador.entrenadores.put(String.valueOf(idEntrenador), entrenador);

                    System.out.println("Entrenador agregado con éxito!");
                    break;

                case 2:
                    System.out.println("Ingrese id del entrenador a actualizar");
                    int upIdEntrenador = scanner.nextInt();
                    scanner.nextLine();

                    if (controlador.entrenadores.containsKey(String.valueOf(upIdEntrenador))) {
                        Entrenador upEntrenador = controlador.entrenadores.get(String.valueOf(upIdEntrenador));
                        System.out.println("Ingrese nuevo nombre del entrenador");
                        String upNombreEntrenador = scanner.nextLine();
                        upEntrenador.setNombre(upNombreEntrenador);

                        System.out.println("Ingrese nuevo apellido del entrenador");
                        String upApellidoEntrenador = scanner.nextLine();
                        upEntrenador.setApellido(upApellidoEntrenador);

                        System.out.println("Ingrese nueva edad del entrenador");
                        int upEdadEntrenador = scanner.nextInt();
                        upEntrenador.setEdad(upEdadEntrenador);
                        scanner.nextLine();

                        System.out.println("Ingrese nueva ciudad del entrenador");
                        String upCiudadEntrenador = scanner.nextLine();
                        upEntrenador.setCiudad(upCiudadEntrenador);

                        System.out.println("Ingrese nueva experiencia del entrenador");
                        String upExperienciaEntrenador = scanner.nextLine();
                        upEntrenador.setExperiencia(upExperienciaEntrenador);

                        System.out.println("Entrenador actualizado con éxito!");
                    } else {
                        System.out.println("Entrenador no encontrado");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese id del entrenador a eliminar");
                    int delIdEntrenador = scanner.nextInt();
                    scanner.nextLine();

                    if (controlador.entrenadores.containsKey(String.valueOf(delIdEntrenador))) {
                        controlador.entrenadores.remove(String.valueOf(delIdEntrenador));
                        System.out.println("Entrenador eliminado con éxito!");
                    } else {
                        System.out.println("Entrenador no encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Listado de entrenadores");
                    for (String key : controlador.entrenadores.keySet()) {
                        Entrenador listEntrenador = controlador.entrenadores.get(key);
                        System.out.println("ID: " + listEntrenador.getId());
                        System.out.println("Nombre: " + listEntrenador.getNombre());
                        System.out.println("Apellido: " + listEntrenador.getApellido());
                        System.out.println("Edad: " + listEntrenador.getEdad());
                        System.out.println("Ciudad: " + listEntrenador.getCiudad());
                        System.out.println("Experiencia: " + listEntrenador.getExperiencia());
                    }
                    break;

                case 5:
                    System.out.println("Volver atras");
                    return;
                default:
                    scanner.close();
            }
        }
    }
}
