/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main.Logic_root;


/**
 *
 * @author TheOneAboveAll
 */
public class JFMainPantalla_Root extends javax.swing.JFrame {

    
    /**
     * Creates new form jFMainPantalla
     */
    public JFMainPantalla_Root() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBProveedores = new javax.swing.JButton();
        jBArticulos = new javax.swing.JButton();
        jBEmpleados = new javax.swing.JButton();
        jBDetallarVenta = new javax.swing.JButton();
        jBShowOrdenes = new javax.swing.JButton();
        jBShowUsers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBProveedores.setText("Proveedores");
        jBProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProveedoresActionPerformed(evt);
            }
        });

        jBArticulos.setText("Productos");
        jBArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBArticulosActionPerformed(evt);
            }
        });

        jBEmpleados.setText("Empleados");
        jBEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmpleadosActionPerformed(evt);
            }
        });

        jBDetallarVenta.setText("Detallar una venta");
        jBDetallarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDetallarVentaActionPerformed(evt);
            }
        });

        jBShowOrdenes.setText("Mostrar Ordenes");
        jBShowOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBShowOrdenesActionPerformed(evt);
            }
        });

        jBShowUsers.setText("Tabla de usuarios");
        jBShowUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBShowUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                        .addComponent(jBArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                        .addComponent(jBDetallarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBShowOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBShowUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jBArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBDetallarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBShowOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBShowUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProveedoresActionPerformed
        JFProvedores proveedores = new JFProvedores();
        proveedores.setVisible(true);
    }//GEN-LAST:event_jBProveedoresActionPerformed

    private void jBArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBArticulosActionPerformed
        // TODO add your handling code here:
        JFArticulo articulo = new JFArticulo();
        articulo.setVisible(true); 
    }//GEN-LAST:event_jBArticulosActionPerformed

    private void jBEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmpleadosActionPerformed
        JFEmpleados empleados = new JFEmpleados();
        empleados.setVisible(true);
    }//GEN-LAST:event_jBEmpleadosActionPerformed

    private void jBDetallarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDetallarVentaActionPerformed
        JFDetalleVenta detalleV = new JFDetalleVenta();
        detalleV.setVisible(true);
    }//GEN-LAST:event_jBDetallarVentaActionPerformed

    private void jBShowOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBShowOrdenesActionPerformed
        // TODO add your handling code here:
        JFShowOrdenes orden = new JFShowOrdenes();
        orden.setVisible(true);
        
    }//GEN-LAST:event_jBShowOrdenesActionPerformed

    private void jBShowUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBShowUsersActionPerformed
       JFBitacoraUsers users = new JFBitacoraUsers();
       users.setVisible(true);
    }//GEN-LAST:event_jBShowUsersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMainPantalla_Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMainPantalla_Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMainPantalla_Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMainPantalla_Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBArticulos;
    private javax.swing.JButton jBDetallarVenta;
    private javax.swing.JButton jBEmpleados;
    private javax.swing.JButton jBProveedores;
    private javax.swing.JButton jBShowOrdenes;
    private javax.swing.JButton jBShowUsers;
    // End of variables declaration//GEN-END:variables
}
