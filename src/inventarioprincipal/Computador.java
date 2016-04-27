/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioprincipal;

/**
 *
 * @author Esteban
 */
public class Computador {
String ram,procesador,gabinete,tarjetavideo,almacenamiento;
    
    public Computador() {
    }

    @Override
    public String toString() {
        return "computador{" + "ram=" + ram + ", procesador=" + procesador + ", gabinete=" + gabinete + ", tarjetavideo=" + tarjetavideo + ", almacenamiento=" + almacenamiento + '}';
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getTarjetavideo() {
        return tarjetavideo;
    }

    public void setTarjetavideo(String tarjetavideo) {
        this.tarjetavideo = tarjetavideo;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
   
    }
    
    
}
