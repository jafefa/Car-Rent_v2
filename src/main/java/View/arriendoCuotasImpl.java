package View;
import Model.Cliente;
import java.awt.*;
import javax.swing.*;

public class arriendoCuotasImpl extends JPanel {
    private final JComboBox selCli;
    private final JComboBox selVeh;
    private final JButton ingrCli;
    private final JButton save,pagar;
    private final JLabel fecArr,dias,preDia,Monto,cuotas,titulo,apagar;
    private final JTextField txtFecArr,txtDias,txtPreDia,txtMonto,txtCuotas;
    private final JTextArea ArrCuotas; 
    
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
        this.cuotas =  new JLabel("Cant. Cuotas");
        this.txtFecArr = new JTextField(8);
        this.txtDias = new JTextField(2);
        this.txtPreDia = new JTextField(6);
        this.txtMonto = new JTextField(10);
        this.txtCuotas = new JTextField(2);
        this.save = new JButton("Guardar Arriendo");
        this.apagar = new JLabel("CUOTAS A PAGAR");
        this.ArrCuotas = new JTextArea(6,10);
        this.pagar = new JButton("Pagar Primera Cuota");
        
        
    }
    public void crearGUI(JFrame ventana){
        //primer panel con selectores
       
        
        JPanel panel = new JPanel(); //titulo
        JPanel panel2 = new JPanel(); //combobox
        JPanel panel3 = new JPanel(); //datos
        JPanel panel4 = new JPanel(); //boton guadar
        JPanel panel5 = new JPanel(); // cuotas
        JPanel contenedor = new JPanel(); // contenedor
        
        //layout del panel
        panel.setLayout(new FlowLayout());              //titulo
        panel2.setLayout(new GridLayout(2,3,100,10));   //combobox
        panel3.setLayout(new GridLayout(4,3));          //campos de texto   
        panel4.setLayout(new FlowLayout());          //guardar
        panel5.setLayout(new BorderLayout());             //caja de texto
        contenedor.setLayout(new BorderLayout());       //contenedor
        
        
        //configuro posicion del panel
        this.setLayout(new BorderLayout());
        this.add(panel,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.CENTER);
        this.add(contenedor,BorderLayout.SOUTH);
        //this.add(panel3,BorderLayout.SOUTH);

        //atributos panel 1
        panel.add(this.titulo,BorderLayout.NORTH);

        
        //atributos panel 2
        panel2.add(this.selCli,BorderLayout.WEST);
        panel2.add(this.selVeh,BorderLayout.EAST); 
        panel2.add(this.ingrCli,BorderLayout.SOUTH);
        
        //atributos panel 3 datos para ingresar
        
        panel3.add(this.fecArr, BorderLayout.WEST);
        panel3.add(this.txtFecArr,BorderLayout.CENTER);
        panel3.add(this.dias, BorderLayout.WEST);
        panel3.add(this.txtDias,BorderLayout.CENTER);
        panel3.add(this.preDia,BorderLayout.WEST);
        panel3.add(this.txtPreDia,BorderLayout.CENTER);
        panel3.add(this.Monto,BorderLayout.WEST);
        panel3.add(this.txtMonto,BorderLayout.CENTER);
        
       //atributos panel 4 cuotas
       panel4.add(this.cuotas,BorderLayout.WEST);
       panel4.add(this.txtCuotas,BorderLayout.CENTER);
       panel4.add(this.save,BorderLayout.SOUTH);
       
       //atributos panel 5 caja de texto
       panel5.add(this.apagar, BorderLayout.NORTH);
       panel5.add(this.ArrCuotas,BorderLayout.CENTER);
       panel5.add(this.pagar,BorderLayout.SOUTH);
       
       //contenedor
       contenedor.add(panel3,BorderLayout.WEST);
       contenedor.add(panel4,BorderLayout.CENTER);
       contenedor.add(panel5,BorderLayout.EAST);
       
        

        
        
        panel.setBackground(new Color(100,204,255));
        panel2.setBackground(new Color(100,204,255));
        panel3.setBackground(new Color(100,204,255));
        panel4.setBackground(new Color(100,204,255)); 
        panel5.setBackground(new Color(100,204,255));
        
        
       
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setSize(800,400);
        

    
    }
}
