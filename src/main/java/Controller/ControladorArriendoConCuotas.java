
package Controller;

import Model.ArriendoCuota;
import Model.Cliente;
import Model.Vehiculo;
import View.AgregarCliente;
import View.ArriendoConCuotas;
import java.util.ArrayList;
import javax.swing.JFrame;

public class ControladorArriendoConCuotas {
    
    private static ArrayList<ArriendoCuota> listArriendo = new ArrayList<>();
    
     public static void abrirVentanaAgregar(){
        JFrame ventana = new JFrame("Arrendador de autos");
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setSize(750,400);
        AgregarCliente agregar = new AgregarCliente();
        
         ventana.setContentPane(agregar);    
        
    }
     public static String crearArriendo(Cliente Cli, Vehiculo Veh, String Fec, int Cuot, int Dias,int precioDia){
         ArriendoCuota arriendo = new ArriendoCuota(Cuot,Fec,Dias,Cli,Veh);
         arriendo.ingresarArriendoConCuota(precioDia);
         listArriendo.add(arriendo);
         
         return calcularMonto(arriendo,precioDia);
     }
     
     public static ArriendoCuota arriendo( int Cuot,String Fec, int Dias,Cliente Cli, Vehiculo Veh, int precioDia ){
         ArriendoCuota arriendo = new ArriendoCuota(Cuot,Fec,Dias,Cli,Veh);
         arriendo.ingresarArriendoConCuota(precioDia);
         listArriendo.add(arriendo);   
         System.out.println(arriendo);
         return arriendo;
     }
     
     public static String calcularMonto(ArriendoCuota arriendo,int precioDia){
     return Integer.toString(arriendo.obtenerMontoApagar(precioDia));
     }
     
     

     


}
