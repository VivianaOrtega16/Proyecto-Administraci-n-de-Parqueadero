/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialfinal;

/**
 *
 * @author vivid 
 */
public class Conductor extends Persona {//terminado funcional
    //creo atributos solo uno los demas los hereda de persona
    AreaTrabajo area;
    // creo el super constructor

    public Conductor(AreaTrabajo area) {
        this.area = area;
    }

    public Conductor(AreaTrabajo area, int identificacion, String nombres, String apellidos, String fechanac) {
        super(identificacion, nombres, apellidos, fechanac);
        this.area = area;
    }
    //creo el get porque es una constante no debe ser cambiado, y los demas get estan en la clase padre

    public AreaTrabajo getArea() {
        return area;
    }

    @Override
    public String toString() {
        return super.toString()+"Conductor{" + "area=" + area + '}';
    }
    
    
    
}
