/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialfinal;

/**
 *
 * @author vivid
 */

import java.util.Date;

public class Persona {//termiando y funcional
    //esta sera la clase padre para conductor y vigilante que tambien son personas 
    //atributos
    private int identificacion;
    private String nombres, apellidos;
    private String fechanac;
    
    
    //constructores

    public Persona() {
    }

    public Persona(int identificacion, String nombres, String apellidos , String fechanac ) { 
        this.fechanac=fechanac;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    //creo los metodos

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFecha() {
        return fechanac;
    }
    //la fecha no podra ser cambiada por lo que no tendra set 

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    //creo un to string

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" + identificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fecha=" + fechanac + '}';
    }

    
    
    
    
}
