/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

/**
 *
 * @author TheOneAboveAll
 */
public class jFMainPantalla extends javax.swing.JFrame {

    /**
     * Creates new form jFMainPantalla
     */
    public jFMainPantalla() {
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

        jButton1 = new javax.swing.JButton();
        jBArticulos = new javax.swing.JButton();
        jBEmpleados = new javax.swing.JButton();
        jBDetallarVenta = new javax.swing.JButton();
        jBNewMateriales = new javax.swing.JButton();
        jBShowOrdenes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Lista de provedores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBArticulos.setText("Articulos");
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

        jBNewMateriales.setText("Detallar una compra de materiales");
        jBNewMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNewMaterialesActionPerformed(evt);
            }
        });

        jBShowOrdenes.setText("Mostrar Ordenes");
        jBShowOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBShowOrdenesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBShowOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNewMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDetallarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jBDetallarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBNewMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBShowOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBArticulosActionPerformed
        // TODO add your handling code here:
        JFArticulo articulo = new JFArticulo();
        articulo.setVisible(true); 
    }//GEN-LAST:event_jBArticulosActionPerformed

    private void jBEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEmpleadosActionPerformed

    private void jBDetallarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDetallarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBDetallarVentaActionPerformed

    private void jBNewMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewMaterialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNewMaterialesActionPerformed

    private void jBShowOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBShowOrdenesActionPerformed
        // TODO add your handling code here:
        JFShowOrdenes orden = new JFShowOrdenes();
        orden.setVisible(true);
        
        
    }//GEN-LAST:event_jBShowOrdenesActionPerformed

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
            java.util.logging.Logger.getLogger(jFMainPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFMainPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFMainPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFMainPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBArticulos;
    private javax.swing.JButton jBDetallarVenta;
    private javax.swing.JButton jBEmpleados;
    private javax.swing.JButton jBNewMateriales;
    private javax.swing.JButton jBShowOrdenes;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
