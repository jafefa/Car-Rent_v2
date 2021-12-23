
package View;


import java.awt.*;
import javax.swing.*;

public class pagarCuota extends JPanel{

    private final JLabel titulo,pagos,subTitle,selArr;
    private final JComboBox selCli;
    private final JTextArea arrAr,arrCuo;
    private final JButton mostrarPag, hacerPago;
    private final JCheckBox a,b,c,d,e,f;
    
    public pagarCuota(){
    this.titulo = new JLabel("PAGAR CUOTA ARRIENDO");
    this.pagos = new JLabel("PAGOS");
    this.selArr = new JLabel("Seleccione arriendo");
    this.subTitle = new JLabel("Número Valor ¿Pagada?");
    
    this.selCli = new JComboBox();
    this.arrAr = new JTextArea(6,10);
    arrAr.setEditable(false);
    this.arrCuo = new JTextArea(6,10);
    this.mostrarPag = new JButton("Mostrar pagos arriendo >>");
    this.hacerPago = new JButton("Realizar Pago");
    this.a = new JCheckBox();
    this.b = new JCheckBox();
    this.c = new JCheckBox();
    this.d = new JCheckBox();
    this.e = new JCheckBox();
    this.f = new JCheckBox();
      
    }
    public void crearGUI(JFrame ventana){
    
        JPanel vista = new JPanel();
        vista.setLayout(new GridLayout(3,1));
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridLayout(1,4));
        
        JPanel vistaIzq = new JPanel();
        vistaIzq.setLayout(new BorderLayout());
        
        vista.add(this.titulo);
        vista.add(this.selCli,BorderLayout.NORTH);
        //vista.add(contenedor,BorderLayout.SOUTH);
        
        vistaIzq.add(this.selArr,BorderLayout.NORTH);
        vistaIzq.add(this.arrAr,BorderLayout.CENTER);
       
        contenedor.add(vistaIzq);
        contenedor.add(this.mostrarPag, BorderLayout.CENTER);
        
       
        
        ventana.setLayout(new GridLayout(2,1));
        ventana.add(vista);
        ventana.add(contenedor);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setResizable(true);
        ventana.setSize(800,300);

    }
    
}
