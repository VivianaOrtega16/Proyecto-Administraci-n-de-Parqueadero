/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialfinal;

/**
 *
 * @author vivid 
 */
public class Vigilante extends Persona {//terminado funcional
    //creo los atributos 
    Zona zona;
    //creo los super cosntructores

    public Vigilante(Zona zona, int identificacion, String nombres, String apellidos, String fechanac) {
        super(identificacion, nombres, apellidos, fechanac);
        this.zona = zona;
    }
    //creo el get de la zona los demas get estan en la clase padre y pueden ser llamados desde la clase hija

    public Zona getZona() {
        return zona;
    }

    @Override
    public String toString() {
        return super.toString()+ "Vigilante{" + "zona=" + zona + '}';
    }
    
    
}
