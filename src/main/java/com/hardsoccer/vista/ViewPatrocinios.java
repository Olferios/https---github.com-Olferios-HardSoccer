package com.hardsoccer.vista;

import java.util.Scanner;

import com.hardsoccer.Controller;
import com.hardsoccer.clase.Patrocinador;

public class ViewPatrocinios {
    public static Controller controlador;
    public void startPatrocinio(){
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("1. Agregar patrocinio");
            System.out.println("2. Actualizar patrocinio");
            System.out.println("3. Eliminar patrocinio");
            System.out.println("4. Listar patrocinios ");
            System.out.println("5. Salir");
            
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                Patrocinador patrocinador=new Patrocinador();
                System.out.println("ingrese id del patrocinio");
                int idPatrocinador=scanner.nextInt();
                patrocinador.setId(idPatrocinador);
                scanner.nextLine();

                System.out.println("ingrese nombre patrocinador ");
                String nombrePatrocinador=scanner.nextLine();
                patrocinador.setNombre(nombrePatrocinador);

                System.out.println(" ingrese Tipo Patrocinio");
                String tipoPatrocinador=scanner.nextLine();
                patrocinador.setTipo(tipoPatrocinador);
                
                System.out.println("ingrese monto de patrocinio");
                int montoPatrocinador=scanner.nextInt();
                patrocinador.setMonto(montoPatrocinador);

                System.out.println("ingrese fecha inicio patrociniio");
                String fechaInicio=scanner.nextLine();
                patrocinador.setFechaInicio(fechaInicio);
                
                System.out.println("ingrese fecha fin patrocinio ");
                String fechaFin=scanner.nextLine();
                patrocinador.setFechaFin(fechaFin);
                
                controlador.patrocinadores.put(String.valueOf(idPatrocinador), patrocinador);
                break;

                case 2:
                System.out.println("Ingrese codigo del patrocinador");
                int upidPatrocinador=scanner.nextInt();
                scanner.nextLine();
                if(controlador.patrocinadores.containsKey(String.valueOf(upidPatrocinador))){
                    Patrocinador upPatrocinador=controlador.patrocinadores.get(String.valueOf(upidPatrocinador));
                    System.out.println("Ingrese nuevo nombre del patrocinador");
                    String upNombrePatrocinador=scanner.nextLine();
                    upPatrocinador.setNombre(upNombrePatrocinador);

                    System.out.println("ingrese nuevo tipo patrocinador");
                    String upTipoPatrocinador=scanner.nextLine();
                    upPatrocinador.setTipo(upTipoPatrocinador);
                    
                    System.out.println("ingrese nuevo monto del patrocinador");
                    int upMontoPatrocinador=scanner.nextInt();
                    upPatrocinador.setMonto(upMontoPatrocinador);
                    
                    System.out.println("ingrese nueva fecha inicio patrocinio");
                    String upFechaInicio=scanner.nextLine();
                    upPatrocinador.setFechaInicio(upFechaInicio);
                    
                    System.out.println("ingrese nueva fecha fin patrocinio");
                    String upFechaFin=scanner.nextLine();
                    upPatrocinador.setFechaFin(upFechaFin);
                    System.out.println("Patrocinador actualizado");

                }else{
                    System.out.println("Patrocinador no encontrado");

                }
                break;

                case 3:
                System.out.println("Ingrese codigo del patrocinador a eliminar");
                int delidPatrocinador=scanner.nextInt();
                scanner.nextLine();
                if(controlador.patrocinadores.containsKey(String.valueOf(delidPatrocinador))){
                    controlador.patrocinadores.remove(String.valueOf(delidPatrocinador));
                    System.out.println("Patrocinador eliminado con éxito!");
                }else{
                    System.out.println("El patrocinador no existe menso");
                }
                break;

                case 4:
                System.out.println("listado de patrocinadores");
                for(String key:controlador.patrocinadores.keySet()){
                    Patrocinador lisPatrocinador=controlador.patrocinadores.get(key);
                    System.out.println("id: "+lisPatrocinador.getId());
                    System.out.println("nombre: "+lisPatrocinador.getNombre());
                    System.out.println("tipo: "+lisPatrocinador.getTipo());
                    System.out.println("monto: "+lisPatrocinador.getMonto());
                    System.out.println("fecha inicio: "+lisPatrocinador.getFechaInicio());
                    System.out.println("fecha fin: "+lisPatrocinador.getFechaFin());

                }
                break;

                case 5:
                System.out.println("Saliendo...");
                scanner.close();
                return;
                default:
                System.out.println("Opción no válida.");


            }

        }

    }
}