/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;
                 
import clases.*;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.net.URLDecoder;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
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
public class TipoPago extends javax.swing.JInternalFrame {
    DefaultTableModel m;

    /**
     * Creates new form TipoPago
     */
    public TipoPago() 
    {
        initComponents();
        CargarTablaTipoPago();
        InputMap map2 = txtTipoPago.getInputMap(txtTipoPago.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        txtID.setVisible(false);
        Login ventana = new Login();
        jLabel1.setText(ventana.ID.toString());
        System.out.println(ventana.ID);
        jLabel1.setVisible(false);
    }
    
    public void LimpiarCampos() 
    {
        txtTipoPago.setText("");
    }
    
    public void CargarTablaTipoPago()
    {
        CrudTipoPago obj = new CrudTipoPago();
        obj.CargarTipoPago(jTableTipoPago);
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
                    new TipoPago().setVisible(true);
                }
            }
        );
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
        btnMostrarTipoPago = new javax.swing.JButton();
        btnEliminarTipoPago = new javax.swing.JButton();
        btnModificarTipoPago1 = new javax.swing.JButton();
        btnGuardarTipoPago = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoPago = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtTipoPago = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnTipoPago = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnCerrar1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(744, 560));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnMostrarTipoPago.setBackground(new java.awt.Color(204, 204, 204));
        btnMostrarTipoPago.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMostrarTipoPago.setText("Mostrar");
        btnMostrarTipoPago.setBorder(null);
        btnMostrarTipoPago.setPreferredSize(new java.awt.Dimension(90, 60));
        btnMostrarTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTipoPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarTipoPago);
        btnMostrarTipoPago.setBounds(20, 20, 130, 50);

        btnEliminarTipoPago.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarTipoPago.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminarTipoPago.setText("Eliminar");
        btnEliminarTipoPago.setBorder(null);
        btnEliminarTipoPago.setPreferredSize(new java.awt.Dimension(90, 60));
        btnEliminarTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarTipoPago);
        btnEliminarTipoPago.setBounds(160, 20, 130, 50);

        btnModificarTipoPago1.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarTipoPago1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificarTipoPago1.setText("Modificar");
        btnModificarTipoPago1.setBorder(null);
        btnModificarTipoPago1.setPreferredSize(new java.awt.Dimension(90, 60));
        btnModificarTipoPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTipoPago1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarTipoPago1);
        btnModificarTipoPago1.setBounds(300, 20, 140, 50);

        btnGuardarTipoPago.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarTipoPago.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardarTipoPago.setText("Guardar");
        btnGuardarTipoPago.setBorder(null);
        btnGuardarTipoPago.setPreferredSize(new java.awt.Dimension(90, 60));
        btnGuardarTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTipoPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarTipoPago);
        btnGuardarTipoPago.setBounds(450, 20, 140, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 220, 660, 90);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jTableTipoPago.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableTipoPago);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 640, 230);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 320, 660, 250);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        txtTipoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoPagoKeyPressed(evt);
            }
        });
        jPanel2.add(txtTipoPago);
        txtTipoPago.setBounds(190, 60, 290, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del tipo de pago:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(190, 40, 160, 17);

        btnTipoPago.setBackground(new java.awt.Color(204, 204, 204));
        btnTipoPago.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnTipoPago.setText("Limpiar");
        btnTipoPago.setBorder(null);
        btnTipoPago.setPreferredSize(new java.awt.Dimension(90, 60));
        btnTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoPagoActionPerformed(evt);
            }
        });
        jPanel2.add(btnTipoPago);
        btnTipoPago.setBounds(380, 90, 110, 30);

        btnImprimir.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorder(null);
        btnImprimir.setPreferredSize(new java.awt.Dimension(90, 60));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel2.add(btnImprimir);
        btnImprimir.setBounds(180, 90, 130, 30);

        txtID.setFocusable(false);
        jPanel2.add(txtID);
        txtID.setBounds(20, 100, 6, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 70, 660, 140);

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
        jLabel13.setText("Tipo pago");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(253, 253, 253)
                .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 680, 54);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTipoPagoActionPerformed
        CargarTablaTipoPago();
    }//GEN-LAST:event_btnMostrarTipoPagoActionPerformed

    private void btnGuardarTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTipoPagoActionPerformed
       if  (txtTipoPago.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        } else
        {
            CrudTipoPago obj = new CrudTipoPago();
            String TipoPago = (txtTipoPago.getText());
            obj.settipopago(TipoPago);
            clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText())); 
            if (obj.GuardarTipoPago()) 
            {
               JOptionPane.showMessageDialog(this,"Datos ingresados correctamente"); 
               CargarTablaTipoPago();
               LimpiarCampos();
               Bit.BitacoraCreateTipoPago();
            }
            else
            { 
               JOptionPane.showMessageDialog(this,"Error al guardar datos"); 
               JOptionPane.showMessageDialog(this,obj.GuardarTipoPago()); 
            }
        }
    }//GEN-LAST:event_btnGuardarTipoPagoActionPerformed

    private void btnEliminarTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoPagoActionPerformed
        String ID;
        int fsel = jTableTipoPago.getSelectedRow();
        if (fsel==-1) 
        {   
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            m = (DefaultTableModel)jTableTipoPago.getModel();
            ID = jTableTipoPago.getValueAt(fsel, 0).toString();
            txtTipoPago.setText(ID);
            CrudTipoPago obj = new CrudTipoPago();
            obj.setIDtipoPago(Integer.parseInt(txtTipoPago.getText()));
            clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText())); 
            int Eliminar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?","Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (Eliminar == 0) 
            {
                if (obj.EliminarTipoPago()) 
                {
                    JOptionPane.showMessageDialog(this, "Datos eliminados");
                    CargarTablaTipoPago();
                    LimpiarCampos();
                    Bit.BitacoraDeleteTipoPago();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarTipoPagoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try 
        {
            java.sql.Connection con = Conexion.conectar();
            JasperReport reporte = null;
            String path = "src\\Reportes\\Reporte-Tipo-Pago-SIGES.jasper";
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
        //fasdasdasd
        /*
        String path = "";
        try
        {
            path = getClass().getResource("src/Reportes/Reporte_Tipo_Pago_SIGES.jasper").getPath();
            path = URLDecoder.decode(path, "UTF-8");
            Connection cn = new conexion().conectar();
            Map parametros = new HashMap();
            JasperReport reporte = (JasperReport)JRLoader.loadObject(path);
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametros, cn);
            JasperViewer visor = new JasperViewer(imprimir,false);
            visor.setTitle("Reporte Tipos de Pago");
            visor.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error durante el proceso de presentacion del reporte. Error: " + e);
            System.out.println(e.getMessage());
        }
        */
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoPagoActionPerformed
        txtTipoPago.setText("");
    }//GEN-LAST:event_btnTipoPagoActionPerformed

    private void btnModificarTipoPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTipoPago1ActionPerformed
        String IDTipoPago;
        int fsel = jTableTipoPago.getSelectedRow();
        if (fsel==-1) 
        {
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        { if  (txtTipoPago.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        } else
        {
            m = (DefaultTableModel)jTableTipoPago.getModel();
            IDTipoPago = jTableTipoPago.getValueAt(fsel, 0).toString();
            txtID.setText(IDTipoPago);
            int idm = Integer.parseInt(txtID.getText());
            CrudTipoPago u = new CrudTipoPago();
            u.setIDtipoPago(idm);
            u.settipopago(txtTipoPago.getText());
            clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText())); 
            if (u.ModificarTipoPago()) 
            {
                JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
                 CargarTablaTipoPago();
                 LimpiarCampos();
                 Bit.BitacoraUpdateTipoPago();
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Error al modificar los datos");
            }
        }
      }
    }//GEN-LAST:event_btnModificarTipoPago1ActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void txtTipoPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoPagoKeyPressed
        if((evt.getKeyCode() < 64 || evt.getKeyCode() > 90) && (evt.getKeyCode() < 97 || evt.getKeyCode() > 122) && (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) && evt.getKeyCode() != 164 && evt.getKeyCode() != 165 && evt.getKeyCode() != 44 && evt.getKeyCode() != 46 && evt.getKeyCode() != 127)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtTipoPagoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnEliminarTipoPago;
    private javax.swing.JButton btnGuardarTipoPago;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificarTipoPago1;
    private javax.swing.JButton btnMostrarTipoPago;
    private javax.swing.JButton btnTipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTipoPago;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTipoPago;
    // End of variables declaration//GEN-END:variables
}
