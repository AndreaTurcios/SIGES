/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import clases.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nanos
 */
public class FrmCodigoZona extends javax.swing.JFrame {

    /**
     * Creates new form FrmCodigoZona
     */
    public FrmCodigoZona() {
        initComponents();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcodigoZona = new javax.swing.JTable();
        btnlimpiar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtcodigozona1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPForm.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo Zona");

        BtnCerrar.setToolTipText("");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPFormLayout = new javax.swing.GroupLayout(JPForm);
        JPForm.setLayout(JPFormLayout);
        JPFormLayout.setHorizontalGroup(
            JPFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303)
                .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPFormLayout.setVerticalGroup(
            JPFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPFormLayout.createSequentialGroup()
                .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(JPForm);
        JPForm.setBounds(0, 0, 858, 51);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Codigo Zona");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(32, 15, 78, 29);
        jPanel2.add(txtid);
        txtid.setBounds(120, 60, 20, 22);

        btnguardar.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        btnguardar.setText("Guardar ");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardar);
        btnguardar.setBounds(404, 16, 89, 27);

        btnmodificar.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnmodificar);
        btnmodificar.setBounds(511, 16, 89, 27);

        tblcodigoZona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblcodigoZona.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblcodigoZonaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblcodigoZona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcodigoZonaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcodigoZona);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(17, 103, 830, 242);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnlimpiar);
        btnlimpiar.setBounds(720, 20, 97, 25);

        btneliminar.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btneliminar);
        btneliminar.setBounds(607, 16, 97, 27);
        jPanel2.add(txtcodigozona1);
        txtcodigozona1.setBounds(128, 19, 258, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-3, 55, 860, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int codigo_zona = Integer.parseInt (txtid.getText());
        
        try{
        Connection con = conexion.conectar();
        PreparedStatement ps = con.prepareStatement("INSERT INTO codigo_zona(codigo_zona) VALUES (?)");
        ps.setInt(1, codigo_zona);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro guardado");
        limpiar();
        cargarTabla();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        }
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        int id = Integer.parseInt(txtid.getText());
        int codigo_zona = Integer.parseInt (txtid.getText());
        
        try{
        Connection con = conexion.conectar();
        PreparedStatement ps = con.prepareStatement("UPDATE codigo_zona SET codigo_zona=? WHERE id =?");
        ps.setInt(1, codigo_zona);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro modificado");
        limpiar();
        cargarTabla();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void tblcodigoZonaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblcodigoZonaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblcodigoZonaAncestorAdded

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
         int id = Integer.parseInt(txtid.getText());
        
        
        try{
        Connection con = conexion.conectar();
        PreparedStatement ps = con.prepareStatement("DELETE FROM  codigo_zona WHERE id =?");
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Eliminado");
        limpiar();
        cargarTabla();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void tblcodigoZonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcodigoZonaMouseClicked
        try{
        int fila = tblcodigoZona.getSelectedRow();
        int id = Integer.parseInt(tblcodigoZona.getValueAt(fila, 0).toString());
        PreparedStatement ps;
        ResultSet rs;
        
        
        Connection con = conexion.conectar();
        ps = con.prepareStatement("SELECT codigo_zona FROM codigo_zona WHERE id=? ");
        ps.setInt(1, id);
        rs = ps.executeQuery();
        
        
        while(rs.next()) {
        txtid.setText(rs.getString(String.valueOf(id)));
       txtcodigozona1.setText(rs.getString("codigo_zona"));
        }
        
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblcodigoZonaMouseClicked

    private void limpiar() {
    txtid.setText("");
    }
    
    private void cargarTabla(){
    DefaultTableModel modeloTabla = (DefaultTableModel) tblcodigoZona.getModel();
    modeloTabla.setRowCount(0);
    
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    
    try{
    
        Connection con = conexion.conectar();
        ps = con.prepareStatement("SELECT codigo_zona FROM codigo_zona ");
        rs = ps.executeQuery();
        rsmd = rs.getMetaData();
        columnas = rsmd.getColumnCount();
        
        while(rs.next()){
        Object [] fila =new  Object [columnas];
        for(int indice =0; indice<columnas; indice ++){
        fila [indice] = rs.getObject(indice + 1);
        }
         modeloTabla.addRow(fila)    ;
        }
                
    }catch(SQLException e){
    JOptionPane.showMessageDialog(null, e.toString());
    }
    }
    
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
            java.util.logging.Logger.getLogger(FrmCodigoZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCodigoZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCodigoZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCodigoZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCodigoZona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JPanel JPForm;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcodigoZona;
    private javax.swing.JTextField txtcodigozona1;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
