
package com.mycompany.parcialfinal;

/**
 *
 * @author vivid 
 */
public class Entrada {//funciona
    //creo atributos 
    private String fechaentrada;
    private String hora;
    private boolean estado;
    Conductor conductor;
    Vehiculo vehiculo;
    Bahia bahia;
    
    //creo los constructores

    public Entrada() {
    }

    public Entrada(String fechaentrada, String hora, Conductor conductor, Vehiculo vehiculo, Bahia bahia, Boolean estado) {
        this.fechaentrada = fechaentrada;
        this.hora = hora;
        this.conductor=conductor;
        this.vehiculo=vehiculo;
        this.bahia=bahia;
        this.estado=estado;
    }
    //creo los get 

    public String getFechaentrada() {
        return fechaentrada;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Bahia getBahia() {
        return bahia;
    }

    public boolean isEstado() {
        return estado;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setBahia(Bahia bahia) {
        this.bahia = bahia;
    }
    

    public String getHora() {
        return hora;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Entrada{" + "fechaentrada=" + fechaentrada + ", hora=" + hora + ", estado=" + estado + ", conductor=" + conductor + ", vehiculo=" + vehiculo + ", bahia=" + bahia + '}';
    }

   

   

    

   
    
    
}
