
package com.mycompany.parcialfinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vivid 
 */
public class MenuParqueadero implements Menu{
    //sobreescribimos los metodos abstractos de la interfaz
    //menu para implementarlos y que se puedan entender
    Parqueadero parqueaderofeliz;//<-----voy a usar este atributo para todoo el menu ya que es el que me vana  ingresar en la case test
    //creo un constructor que ingrese un parametro parqueadero, solo si hay parqueadet hay menu
    public MenuParqueadero(Parqueadero parqueadero) {
        this.parqueaderofeliz=parqueadero;
    }
    //sobreescribo los metodos de la interfaz
    @Override
    public void mostrarmenu() {
        //paso a escribir de lo que quiero que haga cada metodo
        System.out.println("Bienvenido al menu principal Parqueadero: ");
        System.out.println("1. Registrar entrada");
        System.out.println("2. Consultar si vehiculo esta al interior del parqueadero");
        System.out.println("3. Registrar salida");
        System.out.println("4. Consultar estadisticas");
        System.out.println("5. Listar bahias libres y ocupadas");
        System.out.println("6. Listar entradas");
        System.out.println("7. salir");
    }

    @Override
    public void seleccionaropcion() {
       
         
      
        //necesitamos que se repita el menu tantas veces como el usuario ingrese una opcion
       
         //creamos un escaner para leer la opcion que digitara el vigilante
          Scanner scanner=new Scanner(System.in);
        System.out.println("Sr digite una opcion del menu: ");
        int opcion=scanner.nextInt();  
        
        
        
        //con un swich hacemos cada opcion
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la Opción 1");
                /* ingreso todosl los datos del vehiculo para asi crear un objeto vehiculo*/
                
                System.out.println("Ingrese la placa del vehículo");
                String placaVehiculo = scanner.next();
                //tenemos que hacer un scaner para que el vigilante ingrese la plca y un mini menu parq eu me diga si es carro o es moto 
                System.out.println("digite el numero en dependencia si es carro o moto");
                System.out.println("1. carro");
                System.out.println("2. moto");
                int opcion9=scanner.nextInt();
                //creamos un objeto vehiculo que va a entrar al swich y se modificara en dependencia del caso del mismo
                Vehiculo vehiculo11=null;
                switch(opcion9){
                    
                    case 1:
                          vehiculo11=new Vehiculo(placaVehiculo, TipoVehiculo.CARRO); 
                    break;
                    case 2:
                         vehiculo11=new Vehiculo(placaVehiculo, TipoVehiculo.MOTO); 
                    break;
                    default:
                        System.out.println("opcion invalida ");
                        break;
                        
                }
                /* ingreso todosl los datos del conductor para asi crear un objeto conductor*/
                System.out.println("Digite datos del conductor");
                System.out.println("Digite el nombre del conductor");
                String nombre = scanner.next();
                System.out.println("Digite el apellido del conductor");
                String apellido = scanner.next();
                System.out.println("Digite la fecha de nacimiento");
                String fechanacimiento= scanner.next();
                 System.out.println("Digite el número de identificación");
                int numeroidentificacion= scanner.nextInt();
                //ahora creamos un switch para llenar la informacion del area de trabajpo en la que esta
                System.out.println("digite el área en la que trabaja");
                System.out.println("1. Atención al cliente");
                System.out.println("2. Contable");
                System.out.println("3. Seguridad");
                int opcion10=scanner.nextInt();
                //creamos un objeto vehiculo que va a entrar al swich y se modificara en dependencia del caso del mismo
                Conductor conductor = null;
                switch(opcion10){
                    
                    case 1:
                          conductor=new Conductor(AreaTrabajo.ATENCIONCLIENTE, numeroidentificacion, nombre, apellido, fechanacimiento); 
                    break;
                    case 2:
                         conductor=new Conductor(AreaTrabajo.CONTABLE, numeroidentificacion, nombre, apellido, fechanacimiento); 
                    break;
                    case 3:
                        conductor=new Conductor(AreaTrabajo.SEGURIDAD, numeroidentificacion, nombre, apellido, fechanacimiento); 
                    break;
                    default:
                        System.out.println("opcion invalida ");
                        break;
                        
                } 
                /* ingreso todosl los datos de la entrada para asi crear un objeto entrada
                pero tengo que condiderar que si hay una entrada es porque una bahia esta ocupada, entonces debe
                cambiar de null a true, con el metodo de parqueadero registrar bahia, y aque cada vez que haya una entrada una bahia se ocupara*/
                Bahia bahia2 = new Bahia(true);
                parqueaderofeliz.registrarbahia(bahia2);
                
                System.out.println("Digite los datos de la entrada");
                System.out.println("Digite la fecha de entrada");
                String fechaentrada = scanner.next();
                System.out.println("Digite la hora de entrada");
                String horaentrada = scanner.next();
                Entrada entrada = new Entrada (fechaentrada, horaentrada, conductor, vehiculo11, bahia2, true);
                
                //como aqui ya tengo una entrada y agregarle al arqueadero del menu una entrada mediante un metodo
                parqueaderofeliz.agregarentrada(entrada);
                //parqueaderofeliz.imprimirEntradas();<----esta linea demuestra que si se estan guardando entradas
                //HASTA AQUI FUNCIONA, GUARDA LAS ENTRADAS EN MEMORIA Y TAMBIEN LAS IMPRIME COMO UNA LISTA-------------------
                
                break;
                
            case 2:
                System.out.println("Has seleccionado la Opción 2");
                System.out.println("ingrese la plca del vehiculo que desea buscar");
                String placaabuscar=scanner.next();
                /*Consulta si un vehículo está en el parqueadero a partir de una placa. Si el vehículo se encuentra en el parqueadero se
debe imprimir por pantalla los datos de la entrada. Si el vehículo no se encuentra en el parqueadero, se debe lanzar mediante
throw una excepción de tipo VehiculoNoEncontrado, se debe capturar, y se debe gestionar con un catch. La gestión implica mostrar
el siguiente mensaje: el vehículo no se encuentra al interior del parqueadero.//tenemos que hacer un scaner para que el vigilante ingrese la plca y un mini menu para que me diga si es carro o es moto 
                System.out.println("digite el numero en dependencia si es carro o moto");
                System.out.println("1. carro");
                System.out.println("2. moto");
                int opcion2=scanner.nextInt();
                //creamos un objeto vehiculo que va a entrar al swich y se modificara en dependencia del caso del mismo
                Vehiculo vehiculo=null;
                switch(opcion2){
                    case 1:
                          vehiculo=new Vehiculo(placaabuscar, TipoVehiculo.CARRO); 
                    break;
                    case 2:
                         vehiculo=new Vehiculo(placaabuscar, TipoVehiculo.MOTO); 
                    break;
                    default:
                        System.out.println("opcion invalida ");
                        break;
                }
              //hacemos el  try catch ya que esta opcion es para ver si un vehiculo esta dentro del parqueadero         
              //va a entrar el vehiculo con placa y tipo de vehiculo a ser buscado y si no se encuentra no se va a romper
               //Vehiculo vehiculo3=new Vehiculo();
               /*creo un arraylist auxiliar en el cual guarde el arraylist de parqueadero y en el try 
               catch recorra ese arreglo y me diga si el vehiculo esta o no esta  dentro del parqueadero*/
               
               ArrayList<Entrada>entradas;
               entradas=parqueaderofeliz.getEntradas();
               for(int i=0; i<entradas.size();i++){
                   Entrada auxiliar=entradas.get(i);
                   if(auxiliar.getVehiculo().getPlaca().equals(placaabuscar)){
                       System.out.println("el vehiculo se encuentra dentro del parqueadero");
                       System.out.println("Los datos de la entrada del vehiculo que buscas son: ");
                       System.out.println(auxiliar.toString());
                   }else{
                        
                   }
               }
               try{
                        String NoEncontrado = Error.NoEncontrado(placaabuscar, entradas);
                            System.out.println(NoEncontrado);
                        }catch(VehiculoNoEncontado e){
                            System.out.println("ocurrio el error de tipo vehiculo no encontrado");
                            System.out.println(e.getMessage());
                            //e es la variable que almacena la excepcion del vehiculo de la placa  de la linea 43
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            System.out.println("ocurrio un error de tipo excepxion");
                        }
                        //finnally siempre se va a ejecutar su puede utilizar para cerrar recursos como 
                        //conexion a bases de bases de datos o archivos abirtos
                        finally{
                            System.out.println("el vehículo no se encuentra al interior del parqueadero.");
                        }
               
                
                //este caso no 
                
                
                break;
            case 3:
                /* Se le solicita al usuario una placa, el programa consulta si el vehículo se encuentra al interior del parqueadero, si se
encuen              encutra libera la bahía y coloca la entrada en estado inactivo.*/
                System.out.println("Has seleccionado la opcion 3");
                System.out.println("Ingrese la placa del vehiculo: ");
                String placa=scanner.next();
                /*//tenemos que hacer un scaner para que el vigilante ingrese la plca y un mini menu parq eu me diga si es carro o es moto 
                System.out.println("digite el numero en dependencia si es carro o moto");
                System.out.println("1. carro");
                System.out.println("2. moto");
                int opcion3=scanner.nextInt();
                //creamos un objeto vehiculo que va a entrar al swich y se modificara en dependencia del caso del mismo
                Vehiculo vehiculo5=null;
                switch(opcion3){
                    case 1:
                          vehiculo5=new Vehiculo(placa, TipoVehiculo.CARRO); 
                    break;
                    case 2:
                         vehiculo5=new Vehiculo(placa, TipoVehiculo.MOTO); 
                    break;
                    default:
                        System.out.println("opcion invalida ");
                        break;
                }
                //sebe consultar si este vehiculo se encuentra en el parqueadero
                NO FUNCIONO COMPARANDOLO CON UN EQUALS POR LO QUE SOLO LO OCMPARAREMOS CON LA PLACA DEL VEHICULO
                Y SI COINCIDE LA PLACA ENTONCES LIBERAMOS LA BAHIA E INACTIVAMOS LA ENTRADA, ES DECIR QUE EL VEHICULO SALE*/
                ArrayList<Entrada>entradas3=parqueaderofeliz.getEntradas();
                
                boolean estaenparqueadero=false;
                for(int i=0; i<entradas3.size(); i++){
                    Entrada aux=entradas3.get(i);
                    if(aux.getVehiculo().getPlaca().equals(placa)){
                        estaenparqueadero=true;
                        if(estaenparqueadero=true){
                        aux.setEstado(false);
                        Bahia bahiaux=aux.getBahia();
                        bahiaux.setEstado(false);
                            System.out.println("la entrada se inactiva");
                            System.out.println("la bahia se libera");
                        }
                    
                    }else{
                    System.out.println("el vehiculo no se encuentra al iterior del parqueadero");
                    }
                }
               
               /* if(estaenparqueadero=true){
                    aux.setEstado(false);
                    //si es true se libera la bahia y se coloca en estado inactivo
                    Bahia bahias0[]=parqueaderofeliz.getBahias();
                    ArrayList<Entrada>entradas4=parqueaderofeliz.getEntradas();
                    for(int i=0; i<bahias0.length; i++){
                        //Bahia aux=bahias0[i];
                    if(aux.isEstado()){
                        aux.setEstado(false);
                    }
                    }
                   
                    System.out.println("la bahia fue liberada y esta inactiva");
                    
                }else{
                    
                }*/
               // parqueaderofeliz.imprimirEntradas();//<----esta linea demuestra que si se actualiza el array de entradas cuando se va un vehiculo
                //es como si se dejara un registro de que ese vehiculo estuvo ahi pero ya no
                //HASATA AQUI FUNCIONA LA SALIDA DE VEHICULOS
                
                break;
            case 4:
                System.out.println("Has seleccionado la opcion 4");
                System.out.println("Estadísticas del parqueadero:");
               
                System.out.println("Cantidad de entradas activas: " + parqueaderofeliz.cantidadentradasactivas());
                System.out.println("Cantidad de entradas inactivas: " + parqueaderofeliz.cantidadentradasinactivas());
                System.out.println("Cantidad de bahías ocupadas: " + parqueaderofeliz.consultarbahiasocupadas());
                break;
            case 5:
                System.out.println("Has seleccionado la opcion 5");
                System.out.println("Lista de bahias libres y ocupadas"); 
                System.out.println("Hay: "+parqueaderofeliz.consultarbahiaslibres()+" bahias libres");
                System.out.println("Hay: "+parqueaderofeliz.consultarbahiasocupadas()+" bahias ocupadas");
                break;
            case 6:
                System.out.println("Lista de entradas");
               parqueaderofeliz.imprimirEntradas();
                break;
            case 7:
                System.out.println("Saliendo del menú...");
                break;
            default:
                System.out.println("Opción inválida, porfavor digite una opcion del menu");
                
                break;
            }
        
         
    }

   

   
    
    
    
}
