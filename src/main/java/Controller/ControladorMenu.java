
package Controller;

import View.AgregarCliente;
import View.ArriendoConCuotas;
import javax.swing.JFrame;

public class ControladorMenu {

    public static void handleEvents(){
        System.out.println("invocado controlador Menu");
    
    }
    public static void abrirVentanaAgregar(){
        JFrame ventana = new JFrame("Menu Principal");
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setSize(750,400);
        AgregarCliente agregar = new AgregarCliente();
        
         ventana.setContentPane(agregar);    
        
    }
    public static void abrirVentanaArriendo(){
        ArriendoConCuotas arriendo = new ArriendoConCuotas();
        JFrame ventana = new JFrame("Arriendo con cuotas");
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         ventana.setContentPane(arriendo);
        ventana.setVisible(true);
        ventana.setSize(750,400);

        

    
    }   
}
