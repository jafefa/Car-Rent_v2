
package View;

import java.awt.*;
import javax.swing.*;


public class agregarCliente extends JPanel{

    private final JLabel ced,nombre,vig;
    private final JTextField txtCed,txtNombre,txtVig;
    private final JButton agregar;
    
    public agregarCliente(){
    
        this.ced = new JLabel("Cédula");
        this.nombre = new JLabel("Nombre");
        this.vig = new JLabel("¿Vigente?");
        
        this.txtCed = new JTextField(10);
        this.txtNombre = new JTextField(20);
        this.txtVig = new JTextField(6);
        this.txtVig.setEditable(false);
        this.agregar = new JButton("agregar");
        
    }
    
    public void crearGUI(JFrame ventana){

        JPanel vista = new JPanel();
        vista.setLayout(new GridLayout(4,2));
        vista.add(this.ced,BorderLayout.WEST);
        vista.add(this.txtCed,BorderLayout.CENTER);
        vista.add(this.nombre,BorderLayout.WEST);
        vista.add(this.txtNombre,BorderLayout.CENTER);
        vista.add(this.vig,BorderLayout.WEST);
        vista.add(this.txtVig,BorderLayout.CENTER);
        vista.add(this.agregar,BorderLayout.EAST);
        
        
        ventana.add(vista);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setSize(800,300);
                
              
        
        
    
    }
}
