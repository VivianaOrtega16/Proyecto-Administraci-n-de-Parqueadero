
package com.mycompany.parcialfinal;

import java.util.ArrayList;

/**
 *
 * @author vivid 
 */
public class Error {
    public static String NoEncontrado(String placa, ArrayList<Entrada>entradas) throws VehiculoNoEncontado{
    /* si el vehiculo que ingresa a error no esta en el parqueadero va a ser atrapado por el trycatch
        
        */
    for (int i=0; i<entradas.size(); i++){
    Entrada entrada=entradas.get(i);
    if (entrada.getVehiculo().getPlaca()!= placa){
    throw new VehiculoNoEncontado("el vehiculo no fue encontrado en el parqueadero");
    }
    
    }
        return placa;
    }

}
