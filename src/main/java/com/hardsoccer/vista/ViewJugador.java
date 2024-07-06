package com.hardsoccer.vista;

import java.util.Scanner;

import com.hardsoccer.Controller;
import com.hardsoccer.clase.Equipo;
import com.hardsoccer.clase.Jugador;

public class ViewJugador {

    public static Controller controlador;
    public void startJugador(){
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("1. Agregar Jugador");
            System.out.println("2. Actualizar Jugador");
            System.out.println("3. Eliminar Jugador");
            
            System.out.println("4. Listar Jugadores");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    Jugador jugador=new Jugador();
                    System.out.println("ingrese id del jugador");
                    int idJugador=scanner.nextInt();
                    jugador.setId(idJugador);
                    scanner.nextLine();
                    
                    System.out.println("ingrese nombre del jugador");
                    String nombreJugador=scanner.nextLine();
                    jugador.setNombre(nombreJugador);

                    System.out.println("ingrese edad del jugador");
                    int edadJugador=scanner.nextInt();
                    jugador.setEdad(edadJugador);
                    scanner.nextLine();
                    
                    System.out.println("ingrese posicion del jugador");
                    String posicionJugador=scanner.nextLine();
                    jugador.setPosicion(posicionJugador);

                    System.out.println("ingrese nacionalidad");
                    String nacionalidadJugador=scanner.nextLine();
                    jugador.setNacionalidad(nacionalidadJugador);

                    System.out.println("ingrese dorsal de camiseta");
                    String dorsalCamisetaJugador=scanner.nextLine();
                    jugador.setDorsal(dorsalCamisetaJugador);
                    

                    System.out.println("ingrese id del equipo");
                    int idEquipoJugador=scanner.nextInt();
                    Equipo equipo= controlador.equipos.get(String.valueOf(idEquipoJugador));
                    jugador.setEquipo(equipo);

                    controlador.jugadores.put(String.valueOf(idJugador),jugador);

                    break;
                case 2:
                    System.out.println("Ingrese Id jugador actualizar");
                    int upIntJugador=scanner.nextInt();
                    scanner.nextLine();
                    if(controlador.jugadores.containsKey(String.valueOf(upIntJugador))){
                        Jugador upJugador=controlador.jugadores.get(String.valueOf(upIntJugador));
                        System.out.println("Ingrese nuevo nombre del jugador");
                        String upNombreJugador=scanner.nextLine();
                        upJugador.setNombre(upNombreJugador);

                        System.out.println("nuevo apellido Jugador");
                        String upApellidoJugador=scanner.nextLine();
                        upJugador.setApellido(upApellidoJugador);
                        
                        System.out.println("Ingrese nueva edad del jugador");
                        int upEdadJugador=scanner.nextInt();
                        upJugador.setEdad(upEdadJugador);

                        System.out.println("Ingrese nueva posicion del jugador");
                        String upPosicionJugador=scanner.nextLine();
                        upJugador.setPosicion(upPosicionJugador);

                        System.out.println("Ingrese nueva nacionalidad");
                        String upNacionalidadJugador=scanner.nextLine();
                        upJugador.setNacionalidad(upNacionalidadJugador);

                        System.out.println("Ingrese nueva dorsal");
                        String upDorsalJugador=scanner.nextLine();
                        upJugador.setDorsal(upDorsalJugador);

                        System.out.println("Jugador Actualizado");                        
                    }else{
                        System.out.println("Jugador no encontrado");
                    }

                    break;
                case 3:
                System.out.println("Ingrese Id jugador eliminar");
                int delIntJugador=scanner.nextInt();
                scanner.nextLine();
                if(controlador.jugadores.containsKey(String.valueOf(delIntJugador))){
                    controlador.jugadores.remove(String.valueOf(delIntJugador));
                    System.out.println("Jugador Eliminado");
                    }else{
                    System.out.println("Jugador no encontrado");
                    }
                break;

                case 4:
                System.out.println("Listado de Jugadores");
                for(String key : controlador.jugadores.keySet()){
                    Jugador jugadorShow=controlador.jugadores.get(key);
                    System.out.println("ID: "+jugadorShow.getId());
                    System.out.println("Nombre: "+jugadorShow.getNombre());
                    System.out.println("Apellido: "+jugadorShow.getApellido());
                    System.out.println("Edad: "+jugadorShow.getEdad());
                    System.out.println("Posicion: "+jugadorShow.getPosicion());
                    System.out.println("Nacionalidad: "+jugadorShow.getNacionalidad());
                    System.out.println("Dorsal: "+jugadorShow.getDorsal());
                    Equipo equipoShow=jugadorShow.getEquipo();
                    if (equipoShow!= null){
                        System.out.println("Equipo: "+equipoShow.getNombre());

                    }else{
                        System.out.println("EQuipo sin asignar");
                    }
                    System.out.println("----------------------------------");
                }
                case 5:
                    System.out.println("Volver atras");
                    return;
                default:
                    scanner.close();

            }
        }
    }
}
