
package View;
import Model.Cliente;
import java.awt.*;
import javax.swing.*;


public class arriendoCuotasImpl extends JPanel {
    private JComboBox selCli;
    private JComboBox selVeh;
    private JButton ingrCli,save,pagar;
    private JLabel fecArr,dias,preDia,Monto,cuotas,titulo;
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
        
        this.selCli = new JComboBox(arrNom); 
        this.selVeh = new JComboBox(arrPat);
        this.titulo = new JLabel("ARRIENDO CON CUOTAS");
        this.ingrCli = new JButton("Ingresar Cliente");
        
        this.fecArr = new JLabel("Fecha Arriendo");
        this.dias = new JLabel("días");
        this.preDia =new JLabel("Precio por Dia");
        this.Monto = new JLabel("Monto a Pagar");
        this.txtFecArr = new JTextField(8);
        this.txtDias = new JTextField(2);
        this.txtPreDia = new JTextField(6);
        this.txtMonto = new JTextField(10);
        
        
    }
    public void crearGUI(JFrame ventana){
        //primer panel con selectores
       
        
        JPanel panel = new JPanel(); //titulo
        JPanel panel2 = new JPanel(); //combobox
        JPanel panel3 = new JPanel(); //datos
        JPanel panel4 = new JPanel(); //boton guadar
        JPanel panel5 = new JPanel(); // cuotas
        
        //layout del panel
        panel.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(2,3,100,10));
        panel3.setLayout(new GridLayout(4,2));
        panel4.setLayout(new FlowLayout());
        panel5.setLayout(new FlowLayout());
        
        //configuro posicion del panel
        this.setLayout(new BorderLayout());
        this.add(panel,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.CENTER);
        this.add(panel3,BorderLayout.SOUTH);
        //this.add(panel4,BorderLayout.SOUTH);
        
        //atributos panel 1
        panel.add(this.titulo,BorderLayout.NORTH);

        
        //atributos panel 2
        panel2.add(this.selCli,BorderLayout.WEST);
        panel2.add(this.selVeh,BorderLayout.EAST); 
        panel2.add(this.ingrCli,BorderLayout.SOUTH);
        
        //atributos panel 3
        
        panel3.add(this.fecArr, BorderLayout.WEST);
        panel3.add(this.txtFecArr,BorderLayout.CENTER);
        panel3.add(this.dias, BorderLayout.WEST);
        panel3.add(this.txtDias,BorderLayout.CENTER);
        panel3.add(this.preDia,BorderLayout.WEST);
        panel3.add(this.txtPreDia,BorderLayout.CENTER);
        panel3.add(this.Monto,BorderLayout.WEST);
        panel3.add(this.txtMonto,BorderLayout.CENTER);
        
       
        

        
        setBackground(new Color(200,204,255));
        panel.setBackground(new Color(100,204,255));
        
       
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setSize(800,200);
    
    }
}
