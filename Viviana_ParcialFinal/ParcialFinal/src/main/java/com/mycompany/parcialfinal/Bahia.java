
package com.mycompany.parcialfinal;

/**
 *
 * @author vivid
 */
public class Bahia {//funciona
    //creo atributos
    private int noBahia;
    private int contadorbahias=0;
    private boolean estado;
    
    //creo los constructores

    public Bahia() {
    }

    public Bahia( boolean estado) { 
        this.noBahia = contadorbahias++;
        this.estado = estado;
       
    }
    //creo metodos

    public int getNoBahia() {
        return noBahia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setNoBahia(int noBahia) {
        this.noBahia = noBahia;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bahia{" + "noBahia=" + noBahia + ", estado=" + estado + '}';
    }
    
    
}
