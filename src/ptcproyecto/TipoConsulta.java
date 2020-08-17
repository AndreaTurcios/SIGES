/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Nanos
 */
public class TipoConsulta extends javax.swing.JInternalFrame {
    
    public void CargarTablaTipoConsulta()
    {
        CrudTipoConsulta obj = new CrudTipoConsulta();
        obj.CargarTipoConsulta(jTableTipoConsulta);
    }
    
    DefaultTableModel m;
    /**
     * Creates new form TipoConsulta
     */
    public TipoConsulta() 
    {
        initComponents();
        CargarTablaTipoConsulta();
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
        btnMostrarTipoConsulta = new javax.swing.JButton();
        btnGuardarTipoConsulta = new javax.swing.JButton();
        btnEliminarTipoConsulta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnModificarTipoConsulta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoConsulta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNombreTipoConsulta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnTipoPago = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        BtnCerrar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Mantenimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        btnMostrarTipoConsulta.setBackground(new java.awt.Color(0, 136, 130));
        btnMostrarTipoConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMostrarTipoConsulta.setText("Mostrar");
        btnMostrarTipoConsulta.setPreferredSize(new java.awt.Dimension(90, 60));
        btnMostrarTipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTipoConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarTipoConsulta);
        btnMostrarTipoConsulta.setBounds(10, 230, 160, 50);

        btnGuardarTipoConsulta.setBackground(new java.awt.Color(0, 136, 130));
        btnGuardarTipoConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardarTipoConsulta.setText("Guardar");
        btnGuardarTipoConsulta.setPreferredSize(new java.awt.Dimension(90, 60));
        btnGuardarTipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTipoConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarTipoConsulta);
        btnGuardarTipoConsulta.setBounds(10, 20, 160, 50);

        btnEliminarTipoConsulta.setBackground(new java.awt.Color(0, 136, 130));
        btnEliminarTipoConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminarTipoConsulta.setText("Eliminar");
        btnEliminarTipoConsulta.setPreferredSize(new java.awt.Dimension(90, 60));
        btnEliminarTipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarTipoConsulta);
        btnEliminarTipoConsulta.setBounds(10, 160, 160, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 220, 200, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(-10, 80, 200, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(-10, 150, 200, 20);

        btnModificarTipoConsulta.setBackground(new java.awt.Color(0, 136, 130));
        btnModificarTipoConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificarTipoConsulta.setText("Modificar");
        btnModificarTipoConsulta.setPreferredSize(new java.awt.Dimension(90, 60));
        btnModificarTipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTipoConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarTipoConsulta);
        btnModificarTipoConsulta.setBounds(10, 90, 160, 50);

        jPanel3.setBackground(new java.awt.Color(157, 34, 202));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo Consulta");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 7, 200, 40);

        btnCerrar1.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
        btnCerrar1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrar1);
        btnCerrar1.setBounds(650, 0, 50, 60);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Datos registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel5.setLayout(null);

        jTableTipoConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableTipoConsulta);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 660, 190);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(null);
        jPanel2.add(txtNombreTipoConsulta);
        txtNombreTipoConsulta.setBounds(170, 60, 290, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del tipo de consulta:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 30, 176, 17);

        btnTipoPago.setBackground(new java.awt.Color(0, 136, 130));
        btnTipoPago.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnTipoPago.setText("Limpiar");
        btnTipoPago.setPreferredSize(new java.awt.Dimension(90, 60));
        btnTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoPagoActionPerformed(evt);
            }
        });
        jPanel2.add(btnTipoPago);
        btnTipoPago.setBounds(260, 240, 110, 30);

        btnImprimir.setBackground(new java.awt.Color(0, 136, 130));
        btnImprimir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setPreferredSize(new java.awt.Dimension(90, 60));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel2.add(btnImprimir);
        btnImprimir.setBounds(80, 240, 130, 30);

        txtID.setFocusable(false);
        jPanel2.add(txtID);
        txtID.setBounds(20, 100, 6, 20);

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
        BtnCerrar.setToolTipText("");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnCerrar)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnCerrar))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarTipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTipoConsultaActionPerformed
        CargarTablaTipoConsulta();
    }//GEN-LAST:event_btnMostrarTipoConsultaActionPerformed

    private void btnGuardarTipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTipoConsultaActionPerformed
        CrudTipoConsulta obj = new CrudTipoConsulta();
        obj.setTipoConsulta(txtNombreTipoConsulta.getText());
        if (obj.GuardarTipoConsulta())
        {
            JOptionPane.showMessageDialog(this,"Datos ingresados correctamente");
            CargarTablaTipoConsulta();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Error al guardar datos");
            JOptionPane.showMessageDialog(this,obj.GuardarTipoConsulta());
        }
    }//GEN-LAST:event_btnGuardarTipoConsultaActionPerformed

    private void btnEliminarTipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoConsultaActionPerformed
        // TODO add your handling code here:
        String IDTipoConsulta;
        int fsel = jTableTipoConsulta.getSelectedRow();
        if (fsel<0)
        {
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia",
                JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            m = (DefaultTableModel)jTableTipoConsulta.getModel();
            IDTipoConsulta = jTableTipoConsulta.getValueAt(fsel, 0).toString();
            txtID.setText(IDTipoConsulta);
            CrudTipoConsulta obj = new CrudTipoConsulta();
            int i = Integer.parseInt(txtID.getText());
            obj.setIDTipoConsulta(i);
            int eliminar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?",
                "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (eliminar == 0)
            {
//                if (obj.EliminarTipoConsulta())
//                {
//                    JOptionPane.showMessageDialog(this, "Datos eliminados");
//                    CargarTablaTipoConsulta();
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(this, "Error al eliminar "+obj.EliminarTipoConsulta());
//                }
            }
        }
    }//GEN-LAST:event_btnEliminarTipoConsultaActionPerformed

    private void btnModificarTipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTipoConsultaActionPerformed
        String IDTipoPago;
        int fsel = jTableTipoConsulta.getSelectedRow();
        if (fsel==-1) 
        {
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            m = (DefaultTableModel)jTableTipoConsulta.getModel();
            IDTipoPago = jTableTipoConsulta.getValueAt(fsel, 0).toString();
            txtID.setText(IDTipoPago);
            CrudTipoConsulta obj = new CrudTipoConsulta();
            int ID = Integer.parseInt(txtID.getText());
            obj.setIDTipoConsulta(ID);
//            System.out.println("LLega ID "+ obj.getIDTipoConsulta());
            obj.setTipoConsulta(txtNombreTipoConsulta.getText());
            if (obj.ModificarTipoConsulta()) 
            {
                JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
                CargarTablaTipoConsulta();
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Error al modificar los datos");
            }
         }
    }//GEN-LAST:event_btnModificarTipoConsultaActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoPagoActionPerformed
        txtNombreTipoConsulta.setText("");
    }//GEN-LAST:event_btnTipoPagoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try
        {
            java.sql.Connection con = Conexion.conectar();
            JasperReport reporte = null;
            String path = "src\\Reportes\\Reporte-Tipo-Consulta-SIGES.jasper";
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

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnEliminarTipoConsulta;
    private javax.swing.JButton btnGuardarTipoConsulta;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificarTipoConsulta;
    private javax.swing.JButton btnMostrarTipoConsulta;
    private javax.swing.JButton btnTipoPago;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableTipoConsulta;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombreTipoConsulta;
    // End of variables declaration//GEN-END:variables
}
