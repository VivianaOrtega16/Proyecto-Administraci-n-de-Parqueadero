/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialfinal;

/**
 *
 * @author vivid
 */
public enum Zona {//terminado
    NORTE("parqueadero"),
    SUR("parqueadero");
    
    private final String descripcion;

    private Zona(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
