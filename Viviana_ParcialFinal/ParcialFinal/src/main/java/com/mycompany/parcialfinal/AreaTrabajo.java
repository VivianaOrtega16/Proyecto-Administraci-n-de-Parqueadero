/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialfinal;

/**
 *
 * @author vivid
 */
public enum AreaTrabajo {//terminado
    CONTABLE("contable"),
    ATENCIONCLIENTE("edificios"),
    SEGURIDAD("parqueaderos o edificio");

    private final String descripcion;
    

    // CONSTRUCTOR
    private AreaTrabajo(String descripcion) {
        this.descripcion = descripcion;
        
    }

    // GET THERE IS NOT SET BECAUSE
    public String getDescripcion() {
        return this.descripcion;
    }

   
    
}
