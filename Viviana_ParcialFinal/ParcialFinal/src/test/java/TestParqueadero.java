
import com.mycompany.parcialfinal.AreaTrabajo;
import com.mycompany.parcialfinal.Bahia;
import com.mycompany.parcialfinal.Conductor;
import com.mycompany.parcialfinal.Entrada;
import com.mycompany.parcialfinal.Parqueadero;
import com.mycompany.parcialfinal.Persona;
import com.mycompany.parcialfinal.TipoVehiculo;
import com.mycompany.parcialfinal.Vehiculo;
import com.mycompany.parcialfinal.Vigilante;
import com.mycompany.parcialfinal.Zona;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivid
 */
public class TestParqueadero {
    public static void main(String[] args) {
          
        Bahia bahia=new Bahia(true);
        Bahia a=new Bahia(false);
        Bahia bahias[]=new Bahia[5];
        bahias[0]=bahia;
        bahias[1]=a;
        Conductor conductor= new Conductor(AreaTrabajo.CONTABLE, 12, "vivia","david","12-nov-2001");
        Vehiculo vehiculo=new Vehiculo("ret456", TipoVehiculo.CARRO);
        Entrada entrada=new Entrada("23 ener","12:23", conductor, vehiculo,bahia,true);
        ArrayList<Entrada>entradas=new ArrayList<>();
        entradas.add(entrada);
        Parqueadero parqueadero=new Parqueadero("feliz", bahias,entradas);
        parqueadero.imprimirBahias();
        parqueadero.imprimirEntradas();
       //Parqueadero parqueadero=new Parqueadero();
      // parqueadero.registrarbahia(bahia);
     // parqueadero.imprimir();
        
        //parqueadero.agregarentrada(entrada);
        
       
       
    }
}
