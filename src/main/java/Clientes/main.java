
package Clientes;
import Model.ArriendoCuota;
import Model.Cliente;
import Model.Vehiculo;
import View.agregarCliente;
import View.arriendoCuotasImpl;
import View.pagarCuota;
import javax.swing.*;

public class main {
      public static void main(String[] args){
      Cliente[] arrCli = new Cliente[3];
      arrCli[0] = new Cliente("153654255","Javier");
      arrCli[1] = new Cliente("153654255","pablo");
      arrCli[2] = new Cliente("153654255","Jose");
      
      Vehiculo veh = new Vehiculo("ljhd54");
      ArriendoCuota arr = new ArriendoCuota(6,1,"12-12-2021",2,arrCli[0],veh);
      arr.ingresarArriendoConCuota(1000);
          System.out.println(arr.toString());
          System.out.println(arr.getCli().toString()+","+arr.getVeh().toString());
      arr.pagarCuota(0);
          System.out.println(arr.toString());
          
        JFrame ventana = new JFrame("Arrendador de autos");
        arriendoCuotasImpl vista = new arriendoCuotasImpl(arrCli);
        agregarCliente vista2 = new agregarCliente();
        pagarCuota vista3 = new pagarCuota();
       
        //ventana.setContentPane(vista3);
        //vista3.crearGUI(ventana);
        
        //ventana.setContentPane(vista2);
        //vista2.crearGUI(ventana);
        
        ventana.setContentPane(vista);
        vista.crearGUI(ventana);
          
          
      

  }
}
