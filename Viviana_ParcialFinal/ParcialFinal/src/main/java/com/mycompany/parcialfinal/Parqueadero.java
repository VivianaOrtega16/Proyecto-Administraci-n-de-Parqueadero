
package com.mycompany.parcialfinal;

import java.util.ArrayList;


/**
 *
 * @author vivid
 */
public class Parqueadero {
    //creo los atributos
    private String nombre;
    Bahia bahias[]=new Bahia[5];//porque la composicion de de un parqueadero con 5 bahias
    ArrayList<Entrada>entradas=new ArrayList<>();//porque la agregarcion va de un parqueadero con muchas entradas
    
    // creo los cosntructores

    public Parqueadero() {
    }
    //este constructor, es especial porque tendra la composicion de bahia 
    public Parqueadero(String nombre, Bahia bahias[], ArrayList<Entrada>entradas) {
        this.nombre = nombre;
        this.bahias=bahias;//se esta instanciando,, es decir que se aparta el lugar de la memoria cuando se usa el ocsntructor
        this.entradas=entradas;
    }
    //creo los metodos propios que son 6
    
    //creamos un metdodo donde un array guarde la cantidad de vehiculos en el parqueadero
    //parta luego en el vehiculo no encontrado podemos usar este array
  
    public void agregarentrada(Entrada obj){
    this.entradas.add(obj);
    //aqui se esta ingresando un objeto al array de entradas
    }
    //-------------------------------------------------------------
    public void registrarbahia(Bahia obj){
        for(int i=0; i<bahias.length; i++){
            if (bahias[i]==null){
            bahias[i]=obj;
            
            //aqui pone al objeto en una posicion vacia
            //recorre el vetor hasta encontrar uns poscion vacia
            }else{
                System.out.println("no hay bahias registradas");
            }
        }
       //aqui se esta ingresando un objeto al vector de bahias 
    }
    //---------------------------------------------------------------
    public Bahia consultarbahia(int nobahia){
        Bahia c=null;
    for(int i =0; i<bahias.length; i++){
    Bahia bahia=bahias[i];
    
    if(bahia.getNoBahia()==nobahia){
        c=bahia;
    }else {
        c=null;
    }
    }
    return c;
    }
    //--------------------------------------------------------------------
    public int consultarbahiasocupadas(){
        int cantidadBahiasOcupadas=0;
     for (int i=0; i<this.bahias.length; i++){
        Bahia bahia=bahias[i];
            if(bahia.isEstado()==true){
                cantidadBahiasOcupadas++;
            }
      }
     return cantidadBahiasOcupadas;
    }
    //-----------------------------------------------------------------------
     public int consultarbahiaslibres(){
        int cantidadBahiaslibres=0;
     for (int i=0; i<this.bahias.length; i++){
        Bahia bahia=bahias[i];
            if(bahia.isEstado()==false){
                cantidadBahiaslibres++;
            }
      }
     return cantidadBahiaslibres;
    }
    //---------------------------------------------------------------------
     public int cantidadentradasactivas(){
     int cantidadentradasactivas=0;
     for (int i=0; i<this.entradas.size(); i++){
        Entrada entrada=entradas.get(i);
            if(entrada.isEstado()==true){
                cantidadentradasactivas++;
            }
      }
     return cantidadentradasactivas;
     }
     //-----------------------------------------------------------------
      public int cantidadentradasinactivas(){
     int cantidadentradasinactivas=0;
     for (int i=0; i<this.entradas.size(); i++){
        Entrada entrada=entradas.get(i);
            if(entrada.isEstado()==false){
                cantidadentradasinactivas++;
            }
      }
     return cantidadentradasinactivas;
     }
     //----------------------------------------------------------------
    public void imprimir(){
    for(int i=0; i<bahias.length; i++){
        System.out.println(bahias[i].toString());
    }
    //impresion de el vector bahias
    }
    public void imprimirBahias() {
    System.out.println("Bahías del parqueadero:");
    for (Bahia bahia : bahias) {
        System.out.println(bahia);
    }
}

public void imprimirEntradas() {
    System.out.println("Entradas del parqueadero:");
    for (Entrada entrada : entradas) {
        System.out.println(entrada);
    }
}
    //-------------------------------------------------------------------
    //public Bahia consultarbahia(){//ingreso objeto
        //recorremos el vector si es true esta ocupada y si es false es ta vacia
        
    
    //}
    ////public Entrada consultarentradavehiculo(){
    //}
    //crear una impresion de arraylist
    //public int consultarcantidadbahiasocupadas(){
    //aqui debo hacer algo que recorra y cuente cuales son true
    //}

   
    
    // creo los metodos 

    public String getNombre() {
        return nombre;
    }

  

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public Bahia[] getBahias() {
        return bahias;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBahias(Bahia[] bahias) {
        this.bahias = bahias;
    }

    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }
    
    //creo el tosstring

    @Override
    public String toString() {
        return "Parqueadero{" + "nombre=" + nombre + " entradas=" + entradas + '}';
    }

  

    
    
    
    
}
