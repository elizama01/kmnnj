/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioprincipal;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class InventarioPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int opc;
     do { 
      try {  
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese datos");
        System.out.println("1°ingresar Procesador");
        System.out.println("2°ingresar Almacenamiento");
        System.out.println("3°ingresar Ram");
        System.out.println("4°ingresar tarjeta de Video");
        System.out.println("5°Gabinete");
                    
         
        System.out.println(" 4 salir   ");
      
         opc=entrada.nextInt();
        switch (opc){
            case 1:
               
               
                
                break;
            case 2:
                ; 
            
                break;
        
            case 3:
               
                break;
            case 4:
                
                break;
            case 5:
              
                break;
            case 6:
                
                 System.exit(2);
                break;
               default:
                   System.out.println("Numero ingresado no es valido ");
        }
         
     } catch (java.util.InputMismatchException e) {
          System.out.println("Error!!!! no se ingreso  lo solicitado  ");
     }
         
        } while (opc<=6 || opc<=1);
    }
    
}
