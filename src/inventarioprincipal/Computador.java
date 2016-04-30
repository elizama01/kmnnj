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
     private Procesador p;
     private Ram r;
     private Gabinete g;
     private TarjetaDeVideo t;
     private Almacenamiento d;
    
    public Computador(Procesador prc,Ram ram,Gabinete gab,TarjetaDeVideo tvideo,Almacenamiento disc) {
    this.p=prc;
     this.r=ram;
     this.g=gab;
      this.t=tvideo;
      this.d=disc;
    }

    public Procesador getP() {
        return p;
    }

    public void setP(Procesador p) {
        this.p = p;
    }

    public Ram getR() {
        return r;
    }

    public void setR(Ram r) {
        this.r = r;
    }

    public Gabinete getG() {
        return g;
    }

    public void setG(Gabinete g) {
        this.g = g;
    }

    public TarjetaDeVideo getT() {
        return t;
    }

    public void setT(TarjetaDeVideo t) {
        this.t = t;
    }

    public Almacenamiento getD() {
        return d;
    }

    public void setD(Almacenamiento d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Computador{" + "" + p + ", " + r + ", " + g + " " + t + " " + d + '}';
    }

    
   
    }
    
    

