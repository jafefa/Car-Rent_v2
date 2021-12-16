
package View;
import Model.Cliente;
import java.awt.*;
import javax.swing.*;


public class arriendoCuotasImpl extends JPanel {
    private JComboBox selCli;
    private JComboBox selVeh;
    private JButton ingrCli,save,pagar;
    private JLabel fecArr,dias,preDia,Monto,cuotas;
    private JTextField txtFecArr,txtDias,txtPreDia,txtMonto,txtCuotas;
    private JTextArea ArrCuotas; 
    
    public arriendoCuotasImpl(Cliente[] arrCli){
        String[] arrNom = new String[3];
        int i = 0;
        for(Cliente arr:arrCli){
            arrNom[i]=arr.getNombre();
            i++;
        }
        this.selCli = new JComboBox(arrNom);
        this.cuotas = new JLabel("Cantidad de cuotas");
        this.txtCuotas = new JTextField(2);
        
    }
    public void crearGUI(JFrame ventana){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(this.txtCuotas);
        panel.add(this.cuotas);
        panel.add(this.selCli);

        
        this.setLayout(new BorderLayout());
        this.add(panel,BorderLayout.CENTER);
        //setBackground(Color.GRAY);
        panel.setBackground(Color.WHITE);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setSize(800,200);
    
    }
}
