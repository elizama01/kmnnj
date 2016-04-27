/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioprincipal;

/**
 *
 * @author pcccasd
 */
public class Procesador {
private String Tipo; 
private int Valor; 
    public Procesador(String tipo,int valor) {
    this.Tipo=tipo;
    this.Valor=valor;
    }

    @Override
    public String toString() {
        return "Procesador{" + "Tipo=" + Tipo + ", Valor=" + Valor + '}';
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    
}
