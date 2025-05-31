
import com.mycompany.parcialfinal.Bahia;
import com.mycompany.parcialfinal.Menu;
import com.mycompany.parcialfinal.MenuParqueadero;
import com.mycompany.parcialfinal.Parqueadero;
import com.mycompany.parcialfinal.Vigilante;
import com.mycompany.parcialfinal.Zona;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        //aqui voy a crear los objetos 
        //Al iniciar la aplicación en la clase test se debe crear un objeto vigilante que registra la entrada y salida, crear un objeto
        //parqueadero, cargar en el parqueadero 5 bahías, las cuatro primeras libres y la última ocupada, y lanzar el menu. El objeto
        //parqueadero se envía al menú.
        //vamos a pedir los datos del vigilate como tal
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sr vigilante digite sus datos personales");
        System.out.println("digite su numero de identificacion");
        int identificacionvigilante=scanner.nextInt();
        System.out.println("digite su nombre");
        String nombrevigilante=scanner.next();
        System.out.println("digite su apellido");
        String apellidovigilante=scanner.next();
        System.out.println("digite su fech de nacimiento");
        String fechanacvigilante=scanner.next();
        System.out.println("digite el numero de su zona de trabajo");
        System.out.println("1. norte");
        System.out.println("2. sur");
        int opcionvigilante=scanner.nextInt();
        Vigilante vigilante=null;
        switch(opcionvigilante){
            case 1:
                vigilante=new Vigilante(Zona.NORTE,identificacionvigilante,nombrevigilante,apellidovigilante,fechanacvigilante);
                break;
            case 2:
                vigilante=new Vigilante(Zona.SUR,identificacionvigilante,nombrevigilante,apellidovigilante,fechanacvigilante);
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }
        //despues de crear el objeto vigilante debo crear el objetoparqueadero
        Parqueadero parqueadero=new Parqueadero();
        //debo cargar en ets parqueadero 5 bahias<------------------------
        //System.out.println(parqueadero.getBahias()); en esta linea me imprimio la ubiaccion de memoria del vector bahias, es decir que bahias existe, si hay composicion
        Bahia bahias[]=new Bahia[5];
        /*bahias[0]=new Bahia();
        bahias[1]=new Bahia();
        bahias[2]=new Bahia();
        bahias[3]=new Bahia();
        bahias[4]=new Bahia(true);*/
        parqueadero.setBahias(bahias);
        parqueadero.imprimirBahias();//<------aqui esta la demostracion de que las 4 primera bahias estan desocupadas y la ultima esta ocupada
        Menu menu=new MenuParqueadero(parqueadero);//<-----aqui le estoy ingresango un objeto parqueadero al menu 
        //creo un bucle para que se repita el menu
        System.out.println("si desea ingresar el menu digite la palabra true");
        //aqui voy a crear el menu con interfases pero que se comporta como una clase
          
        //hasta aqui funciona, imprime el menu, y deja seleccionar la opcion y ejectuta el switch Y SE EJECUTA TANTAS VECES COMO EL VIGILANTE QUIERA
        boolean respuesta=scanner.hasNext();
        while(respuesta=true){
         mostrar(menu);
            opcion(menu);
        }    
      
        
    }
    //aqui implementamos polimorfismo para menu principal para poder usar sus metodos de interfaz
    public static void mostrar(Menu menu){
    menu.mostrarmenu();
    }
    public static void opcion(Menu menu){
    menu.seleccionaropcion();
    }
}
