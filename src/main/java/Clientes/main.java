
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
        Menu menu = new Menu();
        JFrame ventana = new JFrame("Arrendador de autos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(menu);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setSize(700,400);
        
       
       

  }
}
