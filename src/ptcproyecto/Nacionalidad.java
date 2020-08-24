package ptcproyecto;

import clases.*;
import java.net.URLDecoder;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author 15-CW0001la
 */
public class Nacionalidad extends javax.swing.JInternalFrame {
    
      DefaultTableModel m;
    
    public Nacionalidad() {
        initComponents();
        ListarNacionalidad();
        txtID.setVisible(false);
    }
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater
        (
            new Runnable() 
            {
                public void run() 
                {
                    new Nacionalidad().setVisible(true);
                }
            }
        );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Nacionalidad = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnGuardarNacionalidad = new javax.swing.JButton();
        btnModificarNacionalidad = new javax.swing.JButton();
        btnLimpiarNacionalidad = new javax.swing.JButton();
        btnImprimirNacionalidad = new javax.swing.JButton();
        txtnacionalidad = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnCerrar1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        tb_Nacionalidad.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tb_Nacionalidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tb_Nacionalidad);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nacionalidad:");

        btnGuardarNacionalidad.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarNacionalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnGuardarNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarNacionalidad.setText("Guardar");
        btnGuardarNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNacionalidadActionPerformed(evt);
            }
        });

        btnModificarNacionalidad.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarNacionalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnModificarNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarNacionalidad.setText("Modificar");
        btnModificarNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarNacionalidadActionPerformed(evt);
            }
        });

        btnLimpiarNacionalidad.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarNacionalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLimpiarNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarNacionalidad.setText("Limpiar");
        btnLimpiarNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarNacionalidadActionPerformed(evt);
            }
        });

        btnImprimirNacionalidad.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimirNacionalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnImprimirNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirNacionalidad.setText("Imprimir");
        btnImprimirNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirNacionalidadActionPerformed(evt);
            }
        });

        txtnacionalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(1, 163, 201));

        btnCerrar1.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
        btnCerrar1.setBorder(null);
        btnCerrar1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nacionalidad");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        txtID.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGuardarNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnModificarNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiarNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnImprimirNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(519, 519, 519))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnImprimirNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiarNacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(btnGuardarNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarNacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    public void ListarNacionalidad(){
        controlNacionalidad obj = new controlNacionalidad();
        obj.CargarNacionalidades(tb_Nacionalidad);
    }
        
    private void btnGuardarNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNacionalidadActionPerformed
        //Tomando los datos del formulario y pasandolos a los atributos de la clase
        if (txtnacionalidad.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else
        {
            controlNacionalidad obj = new controlNacionalidad();
            obj.setnacionalidad(txtnacionalidad.getText());
            if (obj.guardar())
            {
                JOptionPane.showMessageDialog(this, "Datos guardados");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al guardar datos");
            }
        }
    }//GEN-LAST:event_btnGuardarNacionalidadActionPerformed

    private void btnModificarNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarNacionalidadActionPerformed
        String IDnacionalidad;
        int fsel = tb_Nacionalidad.getSelectedRow();
        if (fsel==-1) 
        {
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            m = (DefaultTableModel)tb_Nacionalidad.getModel();
            IDnacionalidad = tb_Nacionalidad.getValueAt(fsel, 0).toString();
            txtID.setText(IDnacionalidad);
            CrudTipoConsulta obj = new CrudTipoConsulta();
            int ID = Integer.parseInt(txtID.getText());
            obj.setIDTipoConsulta(ID);
//            System.out.println("LLega ID "+ obj.getIDTipoConsulta());
            obj.setTipoConsulta(txtnacionalidad.getText());
            if (obj.ModificarTipoConsulta()) 
            {
                JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
                
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Error al modificar los datos");
            }
         }
    }//GEN-LAST:event_btnModificarNacionalidadActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String ID_estado;
        int fsel = tb_Nacionalidad.getSelectedRow();
        
        if (fsel==-1) {
        JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
        }else{
         m = (DefaultTableModel)tb_Nacionalidad.getModel();
         ID_estado = tb_Nacionalidad.getValueAt(fsel, 0).toString();
         txtID.setText(ID_estado);
         
         TipoEstados u = new TipoEstados();
         int estad = Integer.parseInt(txtID.getText());
         u.setID_estado(estad);
         
          u.setEstado(txtnacionalidad.getText());
         
         if (u.modificar()) {
            JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
             ListarNacionalidad();
             
        }else{
           JOptionPane.showMessageDialog(null,"Error al modificar los datos");
           }
         }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnImprimirNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirNacionalidadActionPerformed
        try 
        {
            java.sql.Connection con = Conexion.conectar();
            JasperReport reporte = null;
            String path = "src\\Reportes\\Reporte-Nacionalidad-SIGES.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } 
        catch (JRException ex) 
        {
            Logger.getLogger(frmFichaClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        String path = "";
        try
        {
            path = getClass().getResource("reportes/Reporte_Nacionalidad_SIGES.jasper").getPath();
            path = URLDecoder.decode(path, "UTF-8");
            Connection cn = new conexion().conectar();
            Map parametros = new HashMap();
            JasperReport reporte = (JasperReport)JRLoader.loadObject(path);
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametros, cn);
            JasperViewer visor = new JasperViewer(imprimir,false);
            visor.setTitle("Reporte Nacionalidad");
            visor.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error durante el proceso de presentacion del reporte. Error: " + e);
            System.out.println(e.getMessage());
        }
        */
    }//GEN-LAST:event_btnImprimirNacionalidadActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnLimpiarNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarNacionalidadActionPerformed
        txtnacionalidad.setText(" ");
    }//GEN-LAST:event_btnLimpiarNacionalidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarNacionalidad;
    private javax.swing.JButton btnImprimirNacionalidad;
    private javax.swing.JButton btnLimpiarNacionalidad;
    private javax.swing.JButton btnModificarNacionalidad;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tb_Nacionalidad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtnacionalidad;
    // End of variables declaration//GEN-END:variables
}
