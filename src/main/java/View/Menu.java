
package View;
import Controller.ControladorMenu;
import javax.swing.JFrame;
public class Menu extends javax.swing.JPanel implements IVista {

    public Menu() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	@Override
    public void initComponents() {

        BotonCrearCliente = new javax.swing.JButton();
        botonArriendoCuotas = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(650, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU PRINCIPAL");

        BotonCrearCliente.setText("Crear Cliente");
        BotonCrearCliente.setToolTipText("");
        BotonCrearCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCrearClienteMouseClicked(evt);
            }
        });
        BotonCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearClienteActionPerformed(evt);
            }
        });

        botonArriendoCuotas.setText("Arriendo con cuotas");
        botonArriendoCuotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonArriendoCuotasMouseClicked(evt);
            }
        });
        botonArriendoCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArriendoCuotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonCrearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonArriendoCuotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BotonCrearCliente)
                .addGap(18, 18, 18)
                .addComponent(botonArriendoCuotas)
                .addContainerGap(310, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearClienteMouseClicked

        ControladorMenu.abrirVentanaAgregar();

        
    }//GEN-LAST:event_BotonCrearClienteMouseClicked

    private void botonArriendoCuotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArriendoCuotasMouseClicked
       ControladorMenu.abrirVentanaArriendo();
    }//GEN-LAST:event_botonArriendoCuotasMouseClicked

    private void botonArriendoCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArriendoCuotasActionPerformed
        
    }//GEN-LAST:event_botonArriendoCuotasActionPerformed

    private void BotonCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCrearClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearCliente;
    private javax.swing.JButton botonArriendoCuotas;
    private final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
