
package Clientes;
import Model.ArriendoCuota;
import Model.Cliente;
import Model.Vehiculo;
import View.AgregarCliente;
import View.ArriendoConCuotas;
import View.Menu;

import javax.swing.*;

public class main {
      public static void main(String[] args){
      Cliente[] arrCli = new Cliente[3];
      arrCli[0] = new Cliente("153654255","Javier");
      arrCli[1] = new Cliente("153654255","pablo");
      arrCli[2] = new Cliente("153654255","Jose");
      
      Vehiculo veh = new Vehiculo("ljhd54");
      ArriendoCuota arr = new ArriendoCuota(6,"12-12-2021",2,arrCli[0],veh);
       ArriendoCuota arr1 = new ArriendoCuota(6,"12-12-2021",2,arrCli[0],veh);
      arr.ingresarArriendoConCuota(1000);
          System.out.println(arr.toString());
          System.out.println(arr.getCli().toString()+","+arr.getVeh().toString()+arr.getNumArriendo());
          System.out.println(arr1.getCli().toString()+","+arr1.getVeh().toString()+arr1.getNumArriendo());
          arr.pagarCuota(0);
          System.out.println(arr.toString());
          
        JFrame ventana = new JFrame("Arrendador de autos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setSize(650,350);
        
        AgregarCliente agregar = new AgregarCliente();
        Menu menu = new Menu();
        ArriendoConCuotas arriendo = new ArriendoConCuotas();
       
        //ventana.setContentPane(vista2);
        //vista2.crearGUI(ventana);
        
        //ventana.setContentPane(vista2);
        //vista2.crearGUI(ventana);
        
        ventana.setContentPane(arriendo);
         
          
      

  }
}
