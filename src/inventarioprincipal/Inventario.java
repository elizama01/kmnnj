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
    ArrayList<Computador>armado;
    public Inventario() {
 armado=new ArrayList<Computador>();
    
    }
    
    
    public void menu(){
     
    }
      public void listaRam(){
     System.out.println("1° Ram");
     int ram1 = (int) 18.000;
        System.out.println ("Ram dd3 ,1866,2 GB = 18.000 ");
        int  Ram2=(int) 32.000;
          System.out.println("Ram dd4 ,1866,2 GB =32.000 ");
       System.out.println("");
    }
    public void listaProcesador(){
     System.out.println("2° Procesador");
        String cpu1=("AMD® APU A4 7300 / Radeon R3 (FM2+) = 39.000 ");
        String cpu2=("AMD® APU A10  / Radeon R5 (FM2+)=  100.000");
       System.out.println("");
    }
    public void listaAlmacenamiento(){
     System.out.println("2° Procesador");
        String disco1=("Seagate® Disco Duro 500GB Sata3 7200 rpm 16MB Barracuda=49.990");
        String disco2=("Seagate® Disco Duro 1TB Sata3 7200 rpm 16MB Barracuda=70.000");
       System.out.println("");
    }
    public void listaTajetaVIdeo(){
     System.out.println("2° Procesador");
        String tVideo=("Nvidia x2 PCI 3.0 2 GB =49.990");
        String tvideo=("Nvidia x3 PCI 3.0 4 GB =80.990");
        System.out.println("");
    }
    public void listaGabinete(){
     System.out.println("2° Procesador");
        String Gabinete=("Gabinete 1 fuente de poder 500w = 15.000");
        String Gabinete2=("Gabinete 1 fuente de poder 650w = 30.000");
        
        System.out.println("");}
   
}
