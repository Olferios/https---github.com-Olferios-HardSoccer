package com.hardsoccer.vista;

import java.util.Scanner;

import com.hardsoccer.Controller;
import com.hardsoccer.clase.Equipo;
import com.hardsoccer.clase.Estadio;
import com.hardsoccer.clase.Partido;


public class ViewPartidos {
    public static Controller controlador;

    public void startPartido() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. crear partido");
            System.out.println("2. modificar partido");
            System.out.println("3. eliminar partido");
            System.out.println("4. listar partidos");
            System.out.println("5. salir");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Partido partido = new Partido();
                    System.out.println("Ingrese id del partido");
                    int idPartido = scanner.nextInt();
                    partido.setId(idPartido);
                    scanner.nextLine();

                    System.out.println("Ingrese Equipo Local");
                    int idEquipoLocal = scanner.nextInt();
                    scanner.nextLine();
                    Equipo equipoLocal = controlador.equipos.get(String.valueOf(idEquipoLocal));
                    if (equipoLocal == null) {
                        System.out.println("Equipo no existe");
                        break;

                    } else {
                        partido.setEquipoLocal(equipoLocal);
                    }

                    System.out.println("Ingrese Equipo Visitante");
                    int idEquipoVisitante = scanner.nextInt();
                    scanner.nextLine();
                    Equipo equipoVisitante = controlador.equipos.get(String.valueOf(idEquipoVisitante));
                    if (equipoVisitante == null) {
                        System.out.println("Equipo no existe");
                        break;

                    } else {
                        partido.setEquipoVisitante(equipoLocal);
                    }

                    System.out.println("Ingrese fecha partido");
                    String fechaPartido = scanner.nextLine();
                    partido.setFecha(fechaPartido);

                    System.out.println("ingrese hora Partido");
                    String horaPartido = scanner.nextLine();
                    partido.setHora(horaPartido);

                    System.out.println("ingrese id de estadio");
                    int idEstadio = scanner.nextInt();
                    scanner.nextLine();
                    Estadio estadio = controlador.estadios.get(String.valueOf(idEstadio));
                    if (estadio == null) {
                        System.out.println("Estadio no existe");
                        break;

                    } else {
                        partido.setEstadio(estadio);
                    }

                    System.out.println("Ingrese Resultado");
                    String resultado = scanner.nextLine();
                    partido.setResultado(resultado);

                    controlador.partidos.put(String.valueOf(idPartido), partido);
                    equipoLocal.getLstPartido().add(partido);
                    equipoVisitante.getLstPartido().add(partido);

                    break;
                case 2:
                    System.out.println("ingrese id del partido a modificar");
                    int idPartidoUpdt = scanner.nextInt();
                    scanner.nextLine();
                    if (controlador.partidos.containsKey(String.valueOf(idPartidoUpdt))) {
                        Partido partidoUpdt = controlador.partidos.get(String.valueOf(idPartidoUpdt));
                        // System.out.println("Ingrese Equipo Local");
                        // int idEquipoLocalUpdt=scanner.nextInt();
                        // scanner.nextLine();
                        // Equipo
                        // equipoLocalUpdt=controlador.equipos.get(String.valueOf(idEquipoLocalUpdt));
                        // if(equipoLocalUpdt==null){
                        // System.out.println("Equipo no existe");
                        // } else{
                        // partidoUpdt.setEquipoLocal(equipoLocalUpdt);
                        // }

                        // System.out.println("Ingrese Equipo Visitante");
                        // int idEquipoVisitanteUpdt=scanner.nextInt();
                        // scanner.nextLine();
                        // Equipo
                        // equipoVisitanteUpdt=controlador.equipos.get(String.valueOf(idEquipoVisitanteUpdt));
                        // if(equipoVisitanteUpdt==null){
                        // System.out.println("Equipo no existe");
                        // } else{
                        // partidoUpdt.setEquipoVisitante(equipoVisitanteUpdt);
                        // }

                        System.out.println("Ingrese fecha partido");
                        String fechaPartidoUpdt = scanner.nextLine();
                        partidoUpdt.setFecha(fechaPartidoUpdt);

                        System.out.println("ingrese hora Partido");
                        String horaPartidoUpdt = scanner.nextLine();
                        partidoUpdt.setHora(horaPartidoUpdt);

                        System.out.println("ingrese id de estadio");
                        int idEstadioUpdt = scanner.nextInt();
                        scanner.nextLine();
                        if (controlador.partidos.containsKey(String.valueOf(idEstadioUpdt))) {
                            Estadio estadioUpdt = controlador.estadios.get(String.valueOf(idEstadioUpdt));
                            if (estadioUpdt != null) {
                                partidoUpdt.setEstadio(estadioUpdt);
                            } else {
                                System.out.println("Estadio no existe");
                            }
                        }

                    }

                    break;
                case 3:
                    System.out.println("Ingrese id del partido a eliminar");
                    int idPartidoDelete = scanner.nextInt();
                    scanner.nextLine();

                    if (controlador.partidos.containsKey(String.valueOf(idPartidoDelete))) {
                        Partido partidoDelete = controlador.partidos.get(String.valueOf(idPartidoDelete));
                        controlador.partidos.remove(String.valueOf(idPartidoDelete));

                        Equipo localDel = partidoDelete.getEquipoLocal();
                        Equipo visitanteDel = partidoDelete.getEquipoVisitante();

                        if (localDel != null) {
                            localDel.getLstPartido().remove(partidoDelete);
                        }

                        if (visitanteDel != null) {
                            visitanteDel.getLstPartido().remove(partidoDelete);
                        }

                        System.out.println("Partido eliminado exitosamente");
                    } else {
                        System.out.println("Partido no se encontró en el sistema");
                    }
                    break;

                case 4:
                    System.out.println("Listado de partidos:");
                    for (String key : controlador.partidos.keySet()) {
                        Partido partidoShow = controlador.partidos.get(key);
                        System.out.println("Id: " + partidoShow.getId());
                        System.out.println("Equipo Local: " + partidoShow.getEquipoLocal().getNombre());
                        System.out.println("Equipo Visitante: " + partidoShow.getEquipoVisitante().getNombre());
                        System.out.println("Fecha: " + partidoShow.getFecha());
                        System.out.println("Hora: " + partidoShow.getHora());
                        System.out.println("Estadio: " + partidoShow.getEstadio().getNombre());

                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;

                default:
                    scanner.close();

            }
        }

    }
}
