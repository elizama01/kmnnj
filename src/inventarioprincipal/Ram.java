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
public class Ram {
private String Tipo; 
private int Valor; 

    Ram() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTipo() {
        return Tipo;
    }

    @Override
    public String toString() {
        return "Ram{" + "Tipo=" + Tipo + ", Valor=" + Valor + '}';
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
    public Ram(String tipo,int valor) {
    this.Tipo=tipo;
    this.Valor=valor;
    }
}
