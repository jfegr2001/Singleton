/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.mariadb.jdbc.Connection;
import singleton.Singleton;

/**
 *
 * @author Santiago Alzate
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
        llenarTabla();

//         String campo = txtBuscar.getText();
//        String where = "";
//        if (!"".equals(campo)) {
//            where = "WHERE codigo = '" + campo + "'";
//        }
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFabricante = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombreFabricante = new javax.swing.JTextField();
        txtCodigoFabricante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnFabricanteFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("FABRICANTE"));

        tbFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbFabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFabricanteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFabricante);

        jLabel1.setText("CODIGO DE FABRICANTE");

        txtNombreFabricante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreFabricanteKeyTyped(evt);
            }
        });

        txtCodigoFabricante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoFabricanteKeyTyped(evt);
            }
        });

        jLabel2.setText("NOMBRE DEL FABRICANTE");

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnProducto.setText("REGISTRAR UN PRODUCTO ");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnFabricanteFiltrar.setText("BUSCAR POR NOMBRE ");
        btnFabricanteFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFabricanteFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigoFabricante)
                            .addComponent(jLabel1))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnFabricanteFiltrar))
                            .addComponent(btnAgregar)
                            .addComponent(btnEliminar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(btnProducto)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnAgregar))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar)
                            .addComponent(btnFabricanteFiltrar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtNombreFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnProducto)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(306, 306, 306))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        PreparedStatement ps = null;
        try {

            Singleton objCon = Singleton.getInstancia();
           Connection conn = objCon.getConnection();

            int Fila = tbFabricante.getSelectedRow();
            String codigo = tbFabricante.getValueAt(Fila, 0).toString();

            ps = conn.prepareStatement("DELETE FROM fabricante WHERE codigo=?");
            ps.setString(1, codigo);
            ps.execute();

            modelo.removeRow(Fila);
            JOptionPane.showMessageDialog(null, "Fabricante Eliminado");
            limpiarCampos();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar ");
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed

        VentanaCrudProducto newframe = new VentanaCrudProducto();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (txtCodigoFabricante.getText().isEmpty() || txtNombreFabricante.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Llene los campos para realizar un registro");
            return;
        }
        PreparedStatement ps = null;
        try {
            // Obtén la instancia única de ConexionBD
            Singleton objCon = Singleton.getInstancia();
            Connection conn = objCon.getConnection();

            ps = conn.prepareStatement("INSERT INTO fabricante (codigo, nombre) VALUES (?,?)");
            ps.setString(1, txtCodigoFabricante.getText());
            ps.setString(2, txtNombreFabricante.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Fabricante registrado");
            Object[] fila = new Object[4];
            fila[0] = txtCodigoFabricante.getText();
            fila[1] = txtNombreFabricante.getText();

            modelo.addRow(fila);

            limpiarCampos();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registro ");
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tbFabricanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFabricanteMouseClicked

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Singleton objCon = Singleton.getInstancia();
            Connection conn = objCon.getConnection();

            int Fila = tbFabricante.getSelectedRow();
            String codigo = tbFabricante.getValueAt(Fila, 0).toString();

            ps = conn.prepareStatement("SELECT codigo, nombre FROM fabricante  WHERE codigo=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtCodigoFabricante.setText(rs.getString("codigo"));
                txtNombreFabricante.setText(rs.getString("nombre"));

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_tbFabricanteMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int Fila = tbFabricante.getSelectedRow();
        PreparedStatement ps = null;

        try {
            Singleton objCon = Singleton.getInstancia();
            Connection conn = objCon.getConnection();
            ps = conn.prepareStatement("UPDATE fabricante SET  codigo=?, nombre=? WHERE codigo=?");

            ps.setString(1, txtCodigoFabricante.getText());
            ps.setString(2, txtNombreFabricante.getText());
            ps.setString(3, txtCodigoFabricante.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Fabricante editado");

            llenarTabla();

            limpiarCampos();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al editar el fabricante");
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnFabricanteFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFabricanteFiltrarActionPerformed
        VentanaFiltrarFabricante newframe = new VentanaFiltrarFabricante();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFabricanteFiltrarActionPerformed

    private void txtCodigoFabricanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoFabricanteKeyTyped

        char keyChar = evt.getKeyChar();
        if (!(Character.isDigit(keyChar) && !(keyChar == KeyEvent.VK_DELETE))) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros en el codigo");
        }
    }//GEN-LAST:event_txtCodigoFabricanteKeyTyped

    private void txtNombreFabricanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreFabricanteKeyTyped

        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo son puede ingresar letras");
        }

    }//GEN-LAST:event_txtNombreFabricanteKeyTyped

    public void llenarTabla() {
        try {

            tbFabricante.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Singleton objCon = Singleton.getInstancia();
            Connection conn = objCon.getConnection();

            String sql = "SELECT codigo, nombre FROM fabricante";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("codigo");
            modelo.addColumn("nombre");

            int[] anchos = {100, 100};
            for (int i = 0; i < tbFabricante.getColumnCount(); i++) {
                tbFabricante.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

    }

    public void limpiarCampos() {

        txtCodigoFabricante.setText("");
        txtNombreFabricante.setText("");
    }

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFabricanteFiltrar;
    private javax.swing.JButton btnProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFabricante;
    private javax.swing.JTextField txtCodigoFabricante;
    private javax.swing.JTextField txtNombreFabricante;
    // End of variables declaration//GEN-END:variables
}
