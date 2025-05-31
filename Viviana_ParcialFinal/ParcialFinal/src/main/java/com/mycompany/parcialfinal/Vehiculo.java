/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialfinal;

/**
 *
 * @author vivid 
 */
public class Vehiculo {//terminado y funcional
    //creo los atributos 
    private String placa;
    TipoVehiculo tipovehiculo;
    //creo los constructores

    public Vehiculo() {
    }
    
    public Vehiculo(String placa, TipoVehiculo tipovehiculo) {
        this.placa = placa;
        this.tipovehiculo = tipovehiculo;
    }
    //creo los get and set 

    public String getPlaca() {
        return placa;
    }

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    //el vehiculo no tiene set de tipo de vehiculo
    //creo el tostring 

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", tipovehiculo=" + tipovehiculo + '}';
    }
        
    
}
