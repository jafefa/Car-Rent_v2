
package Controller;

import View.AgregarCliente;
import View.ArriendoConCuotas;
import javax.swing.JFrame;

public class ControladorMenu {
    
    
    public static void abrirVentanaAgregar(){
        JFrame ventana = new JFrame("Menu Principal");
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setSize(750,400);
        AgregarCliente agregar = new AgregarCliente();
        ventana.setContentPane(agregar);    
        
    }
    public static void abrirVentanaArriendo(){
        JFrame ventana = new JFrame("Menu Principal");
        ArriendoConCuotas arriendo = new ArriendoConCuotas();
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventana.setContentPane(arriendo);
        ventana.setVisible(true);
        ventana.setSize(750,400);

    }
}
