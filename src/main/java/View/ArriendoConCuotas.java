
package View;

import Controller.ControladorAgregarCliente;
import Controller.ControladorArriendoConCuotas;
import Model.ArriendoCuota;
import Model.Cliente;
import Model.CuotaArriendo;
import Model.Vehiculo;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JPanel;

public class ArriendoConCuotas extends JPanel {

    public ArriendoConCuotas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selCli = new javax.swing.JComboBox<>();
        ingresarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        GuardarArriendo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaCuotas = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Titulo.setText("ARRIENDO CON CUOTAS");

        selCli.setModel(new javax.swing.DefaultComboBoxModel<>(new Vector<String>(ControladorAgregarCliente.listaNombres)));
        selCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selCliActionPerformed(evt);
            }
        });

        ingresarCliente.setText("Ingresar Nuevo Cliente");
        ingresarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarClienteMouseClicked(evt);
            }
        });
        ingresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha de Arriendo");

        jLabel2.setText("Días");

        jLabel3.setText("Precio por día");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Monto a pagar");

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        txtMonto.setEditable(false);
        txtMonto.setRequestFocusEnabled(false);

        jLabel5.setText("Cantidad de Cuotas");

        txtCuotas.setText("1");
        txtCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuotasActionPerformed(evt);
            }
        });

        GuardarArriendo.setText("Guardar Arriendo >>");
        GuardarArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarArriendoActionPerformed(evt);
            }
        });

        AreaCuotas.setColumns(20);
        AreaCuotas.setRows(5);
        AreaCuotas.setLineWrap(true);
        jScrollPane1.setViewportView(AreaCuotas);

        jButton2.setText("Pagar Cuotas");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cuotas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Número            Valor               ¿Pagada?");

        selVeh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lj-hd-94", "hf-23-23", "rh-23-23", "jh-hs-23" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selCli, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selVeh1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(GuardarArriendo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selVeh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ingresarCliente)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuardarArriendo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuotasActionPerformed

    private void selCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selCliActionPerformed

    private void ingresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarClienteActionPerformed
        ControladorArriendoConCuotas.abrirVentanaAgregar();
    }//GEN-LAST:event_ingresarClienteActionPerformed

    private void GuardarArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarArriendoActionPerformed
        ArrayList<Cliente> listaClientes = ControladorAgregarCliente.listaClientes;
        Cliente cli = null;
        ArrayList<Vehiculo> listaVehiculo = new ArrayList();
        
        for(Cliente arr:listaClientes){
            if(arr.getNombre().equals(selCli.getSelectedItem().toString()))
                cli = arr;
                Vehiculo veh = new Vehiculo((String) this.selVeh1.getSelectedItem());
                ArriendoCuota arriendo = ControladorArriendoConCuotas.arriendo(
                        Integer.parseInt(this.txtCuotas.getText()),
                        txtFecha.getText(),
                        Integer.parseInt(this.txtDias.getText()),
                        cli,
                        veh,
                        Integer.parseInt(this.txtPrecio.getText())
                        ); //instancia un arriendo
                txtMonto.setText(ControladorArriendoConCuotas.calcularMonto(arriendo,Integer.parseInt(this.txtPrecio.getText()))); //setea el monto a pagar en campo de texto
                String txtCuotas = "";
            for (CuotaArriendo arrCuota : arriendo.getArrCuota()) {
                txtCuotas = txtCuotas+String.valueOf(arrCuota.getNumCuota())+"\t"+String.valueOf(arrCuota.getValorCuota())+"\t"+String.valueOf(arrCuota.isPagada()+"\n");
                
            }
            this.AreaCuotas.setText(txtCuotas);
                
                
        }
    
        
    }//GEN-LAST:event_GuardarArriendoActionPerformed

    private void ingresarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaCuotas;
    private javax.swing.JButton GuardarArriendo;
    private final javax.swing.JLabel Titulo = new javax.swing.JLabel();
    private javax.swing.JButton ingresarCliente;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selCli;
    private final javax.swing.JComboBox<String> selVeh1 = new javax.swing.JComboBox<>();
    private final javax.swing.JTextField txtCuotas = new javax.swing.JTextField();
    private javax.swing.JTextField txtDias;
    private final javax.swing.JTextField txtFecha = new javax.swing.JTextField();
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
