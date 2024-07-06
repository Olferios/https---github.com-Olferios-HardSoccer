package com.hardsoccer.vista;

import java.util.Scanner;

import com.hardsoccer.Controller;
import com.hardsoccer.clase.Equipo;
import com.hardsoccer.clase.Jugador;
import com.hardsoccer.clase.Partido;
import com.hardsoccer.clase.Resultado;

public class ViewResultado {
    public static Controller controlador;
    public void startResultado(){
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("1. Anotar Resultado");
            System.out.println("2. Corregir Resultado");
            System.out.println("3. Listar Resultados");
            System.out.println("4. Salir");
            
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    Resultado resultado=new Resultado();
                    System.out.println("ingrese id del resultado");
                    int idResultado=scanner.nextInt();
                    resultado.setId(idResultado);
                    scanner.nextLine();

                    System.out.println("ingrese id del partido");
                    int idPartido=scanner.nextInt();
                    Partido partido=controlador.partidos.get(String.valueOf(idPartido));
                    if(partido==null){
                        System.out.println("partido no existe");
                        break;
                    }else{
                        resultado.setPartido(partido); 
                    }

                    System.out.println("ingrese cantidad goles del local");
                    int golesLocal=scanner.nextInt();
                    
                    for (int i=1;i<=golesLocal;i++){
                        System.out.println("Ingrese id del gol");
                        int idGol=scanner.nextInt();
                        
                        System.out.println("id jugador");
                        int idJugador=scanner.nextInt();
                        Jugador jugador=controlador.jugadores.get(String.valueOf(idJugador));
                        if(jugador==null){
                            System.out.println("jugador no existe");
                            break;
                        }gol.setJugador(jugador);

                        System.out.println("Ingrese id equipo");
                        int idEquipo=scanner.nextInt();
                        Equipo equipo=controlador.equipos.get(String.valueOf(idEquipo));
                        if(equipo==null){
                            System.out.println("equipo no existe");
                            break;
                        }gol.setEquipo(equipo);
                        
                        System.out.println("");

                        
                        






                    }
                    resultado.setGolesLocal(golesLocal);
                    scanner.nextLine();

                    System.out.println("Ingrese goles visitante");
                    int golesVisitante=scanner.nextInt();
                    resultado.setGolesVisitante(golesVisitante);
                    
                    partido.agregarGoles(golesLocal, golesVisitante);
                    controlador.resultados.put(String.valueOf(idResultado), resultado);
                    controlador.partidos.put(String.valueOf(idPartido),partido);

                    System.out.println("agregado");
                    break;
                 
                case 2:
                    System.out.println("ingrese id del resultado a modificar ");
                    int idResultadoCorregir=scanner.nextInt();
                    scanner.nextLine();
                    if (controlador.resultados.containsKey(String.valueOf(idResultadoCorregir))){
                        Resultado resultadoUpdt=controlador.resultados.get(String.valueOf(idResultadoCorregir));
                        System.out.println("ingrese goles del local");
                        int golesLocalCorregidos=scanner.nextInt();
                        resultadoUpdt.setGolesLocal(golesLocalCorregidos);
                        scanner.nextLine();
                    }
                    System.out.println("ingrese goles corregidos");
                    int golesCorregidos=scanner.nextInt();
                }
            }
        }
    }

    


