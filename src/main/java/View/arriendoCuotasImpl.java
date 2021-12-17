
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
        String[] arrPat = {"ljhs54","ljhs54","ljhs54"};
        selCli = new JComboBox(arrNom); 
        this.selVeh = new JComboBox(arrPat);
        this.cuotas = new JLabel("Cantidad de cuotas");
        this.txtCuotas = new JTextField(2);
        
        
    }
    public void crearGUI(JFrame ventana){
        //primer panel con selectores
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        Dimension dm = new Dimension(100,10);
        panel.add(this.cuotas);
        panel.add(this.txtCuotas);
        panel.add(this.selCli);      
        panel.add(this.selVeh);

        
        this.setLayout(new BorderLayout());
        this.add(panel,BorderLayout.CENTER);
        setBackground(new Color(200,204,255));
        panel.setBackground(new Color(100,204,255));
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setSize(800,200);
    
    }
}
