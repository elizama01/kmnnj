/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioprincipal;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Esteban
 */
public class Inventario {
   private  ArrayList<Computador>armado;
  
    public Inventario() {
 armado=new ArrayList<Computador>(armado);
  
    }
    
    public void agregarArray(Computador c1){
        armado.add(c1);
    }
    public void IngresoDatos( ){
    
   
   int cantidad;   
  
      try {  
          Scanner entrada =new Scanner(System.in);
          System.out.println("indique  la cantidad de computadores que va a ingresar ");
          cantidad=entrada.nextInt();
         
          for (int j = 0; j < cantidad; j++) {
              
          System.out.println("Ingrese el computador N°"+j);
          System.out.println("ingrese nombre de la ram");
          String nameram = entrada.next() ;
          System.out.println("ingrese valor de la ram");
        int  ValorRam=entrada.nextInt() ;
       
        Ram ram=new Ram(nameram, ValorRam);
       
        System.out.println("ingrese nombre del procesador");
        String nameprocesador=entrada.next() ;
        System.out.println("ingrese valor del procesador");
        int  ValorProcesador=entrada.nextInt() ;
        
       Procesador prc=new Procesador(nameprocesador, ValorProcesador);
        
        System.out.println("Ingresar nombre de Gabinete");
        String namegabinete=entrada.next();
        System.out.println("ingrese valor del gabinete");
        
        int  ValorGabinete=entrada.nextInt();
       Gabinete gab=new Gabinete(namegabinete, ValorGabinete);
        
       System.out.println("ingrese Nombre de la tarjeta de video");
        String nametarjeta=entrada.next();
        System.out.println("ingrese valor de la Tarjeta de video ");
        int  ValorTarjeta=entrada.nextInt();
     
        TarjetaDeVideo tvideo=new TarjetaDeVideo(nametarjeta, ValorTarjeta);
         
        System.out.println("ingrese nombre del disco de almacenamiento");
        String namedisc=entrada.next();
        System.out.println("ingrese el valor  del disco de almacenamiento ");
        int  Valordisc=entrada.nextInt();
     
       Almacenamiento disc=new Almacenamiento(namedisc, Valordisc);
       
        Computador c1=new Computador(prc, ram, gab, tvideo, disc);
        agregarArray(c1);
     
          }
      } catch (java.util.InputMismatchException e) {
          System.out.println("Error!!!! no se ingreso  lo solicitado  ");
     }
         
         
         
    
    }
     
       
       
    }
     
   

