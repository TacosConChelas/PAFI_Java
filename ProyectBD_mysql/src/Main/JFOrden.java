/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author TheOneAboveAll
 */
public class JFOrden extends javax.swing.JFrame {

    Conexion conect = new Conexion();
    Connection con;
    Statement st;
    ResultSet rs;
     DefaultTableModel modeloArticulo;
     
    /**
     * Creates new form JFOrden
     */
    public JFOrden() {
        initComponents();
        getDatosCarrito(jCBCarrito);
        getDatosArticulos( jCBArticulos);
    }
    
    
    //
    public void getDatosCarrito(JComboBox jBAgregarOrden){
        try {
           //en nuestro caso la tabla no se llama carrito se llama detallev ya que es el detalle de la venta
           String sql = "select idCarrito from carrito;"; //la tabla es carrito
           con=conect.getConnection();
           st=con.createStatement();
           rs = st.executeQuery(sql);
           JOptionPane.showMessageDialog(null, "Registro exitoso a la base de datos");
           while(rs.next()){
              jBAgregarOrden.addItem(rs.getInt("idCarrito")); //Se coloca el nombre de la tabla del id del carrito
           }
        } catch(Exception e){
            System.out.println("Error en " + e);
        }
    }
    
    public void getDatosArticulos(JComboBox jCBArticulos){
        try {
           
           String sql = "select nombre from articulos;"; //la tabla es carrito
           con=conect.getConnection();
           st=con.createStatement();
           rs = st.executeQuery(sql);
           
           JOptionPane.showMessageDialog(null, "Registro exitoso a la base de datos");
           while(rs.next()){
              jCBArticulos.addItem(rs.getString("nombre")); //Se coloca el nombre de la tabla del id del carrito
           }
        } catch(Exception e){
            System.out.println("Error en " + e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCBArticulos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBCarrito = new javax.swing.JComboBox<>();
        jTFCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBAgregarOrden = new javax.swing.JButton();
        jTFShowSubtotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCBArticulos.setFocusTraversalPolicyProvider(true);

        jLabel1.setText("Carrito");

        jLabel2.setText("Articulos");

        jCBCarrito.setFocusTraversalPolicyProvider(true);

        jTFCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCantidad.setText("1");
        jTFCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCantidadActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad");

        jBAgregarOrden.setText("Agregar");
        jBAgregarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarOrdenActionPerformed(evt);
            }
        });

        jTFShowSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFShowSubtotal.setText("1");
        jTFShowSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFShowSubtotalActionPerformed(evt);
            }
        });

        jLabel4.setText("Subtotal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jCBCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jBAgregarOrden)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTFShowSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCBArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(178, 178, 178)
                .addComponent(jLabel2)
                .addGap(143, 143, 143)
                .addComponent(jLabel3)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jTFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jBAgregarOrden)
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFShowSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarOrdenActionPerformed
        // Se objtiene el id del carrito seleccionado 
        int indiceCarrito = this.jCBCarrito.getSelectedIndex();
        
        
        int idCarrito = Integer.parseInt(this.jCBCarrito.getItemAt(indiceCarrito));
        
        
        int indiceArticulo = this.jCBArticulos.getSelectedIndex();
        String nameArticulo = this.jCBArticulos.getItemAt(indiceArticulo);
       
        try {
           
           String sql = "select idArticulo from articulo where nombre = '" + nameArticulo + "';"; //la tabla es carrito
           con=conect.getConnection();
           st=con.createStatement();
           rs = st.executeQuery(sql);
           JOptionPane.showMessageDialog(null, "Registro exitoso a la base de datos");
           while(rs.next()){
               indiceArticulo = rs.getInt("idArticulo");
              
           }
           String sql2 = "insert into detalleV values(" + indiceArticulo + ", " + idCarrito + ", " + Integer.parseInt(this.jTFCantidad.getText() + ", 0);")  ;
           st.executeUpdate(sql2);
        } catch(Exception e){
            System.out.println("Error en " + e);
        }
    }//GEN-LAST:event_jBAgregarOrdenActionPerformed

    private void jTFCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCantidadActionPerformed

    private void jTFShowSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFShowSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFShowSubtotalActionPerformed

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
            java.util.logging.Logger.getLogger(JFOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarOrden;
    private javax.swing.JComboBox<String> jCBArticulos;
    private javax.swing.JComboBox<String> jCBCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCantidad;
    private javax.swing.JTextField jTFShowSubtotal;
    // End of variables declaration//GEN-END:variables
}
