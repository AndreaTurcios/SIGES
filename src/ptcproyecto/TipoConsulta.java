/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

import clases.*;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
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
        obj.CargarTipoConsulta(tblconsulta);
    }
    
    DefaultTableModel m;
    /**
     * Creates new form TipoConsulta
     */
    public TipoConsulta() 
    {
        initComponents();
        CargarTablaTipoConsulta();
        txtID.setVisible(false);
        cargarTabla();
        Login ventana = new Login();
        jLabel1.setText(ventana.ID.toString());
        System.out.println(ventana.ID);
        jLabel1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblconsulta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNombreTipoConsulta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnTipoPago = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnCerrar1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGuardarTipoConsulta = new javax.swing.JButton();
        btnModificarTipoConsulta = new javax.swing.JButton();
        btnEliminarTipoConsulta = new javax.swing.JButton();
        btnMostrarTipoConsulta = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        tblconsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblconsulta);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 650, 220);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        txtNombreTipoConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreTipoConsultaKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombreTipoConsulta);
        txtNombreTipoConsulta.setBounds(170, 60, 290, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del tipo de consulta:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 30, 176, 17);

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
        btnTipoPago.setBounds(360, 90, 110, 30);

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
        btnImprimir.setBounds(160, 90, 130, 30);

        txtID.setFocusable(false);
        jPanel2.add(txtID);
        txtID.setBounds(20, 100, 6, 20);

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
        jLabel13.setText("Tipo consulta");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(279, 279, 279)
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

        btnGuardarTipoConsulta.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarTipoConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardarTipoConsulta.setText("Guardar");
        btnGuardarTipoConsulta.setBorder(null);
        btnGuardarTipoConsulta.setPreferredSize(new java.awt.Dimension(90, 60));
        btnGuardarTipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTipoConsultaActionPerformed(evt);
            }
        });

        btnModificarTipoConsulta.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarTipoConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificarTipoConsulta.setText("Modificar");
        btnModificarTipoConsulta.setBorder(null);
        btnModificarTipoConsulta.setPreferredSize(new java.awt.Dimension(90, 60));
        btnModificarTipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTipoConsultaActionPerformed(evt);
            }
        });

        btnEliminarTipoConsulta.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarTipoConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminarTipoConsulta.setText("Eliminar");
        btnEliminarTipoConsulta.setBorder(null);
        btnEliminarTipoConsulta.setPreferredSize(new java.awt.Dimension(90, 60));
        btnEliminarTipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoConsultaActionPerformed(evt);
            }
        });

        btnMostrarTipoConsulta.setBackground(new java.awt.Color(204, 204, 204));
        btnMostrarTipoConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMostrarTipoConsulta.setText("Mostrar");
        btnMostrarTipoConsulta.setBorder(null);
        btnMostrarTipoConsulta.setPreferredSize(new java.awt.Dimension(90, 60));
        btnMostrarTipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTipoConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnGuardarTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarTipoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarTipoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarTipoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarTipoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(67, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(384, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarTipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTipoConsultaActionPerformed
        CargarTablaTipoConsulta();
    }//GEN-LAST:event_btnMostrarTipoConsultaActionPerformed

    private void btnGuardarTipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTipoConsultaActionPerformed
        if  (txtNombreTipoConsulta.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }else{
        tipoConsultas tc = new tipoConsultas();
        String tic = txtNombreTipoConsulta.getText();
        tc.setTipo_consulta(tic);
        clases.Bitacora Bit = new clases.Bitacora();
        Bit.setID(Integer.parseInt(jLabel1.getText()));
        if (tc.guardar()) {   
           JOptionPane.showMessageDialog(this,"Datos ingresados correctamente"); 
           cargarTabla();
           Bit.BitacoraCreatePreguntas();
           }else{ 
           cargarTabla();
           JOptionPane.showMessageDialog(this,"Error al guardar datos"); 
        }
       }
    }//GEN-LAST:event_btnGuardarTipoConsultaActionPerformed

    private void btnEliminarTipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoConsultaActionPerformed
       String ID;
        int fsel = tblconsulta.getSelectedRow();
        if (fsel==-1) {

            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia",
                JOptionPane.WARNING_MESSAGE);
        }else{
            m = (DefaultTableModel)tblconsulta.getModel();
            ID = tblconsulta.getValueAt(fsel, 0).toString();
            txtID.setText(ID);

            CrudTipoConsulta obj = new CrudTipoConsulta();
            obj.setIDTipoConsulta(Integer.parseInt(txtID.getText()));
            clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText())); 
            int eliminar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?",
                "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (eliminar == 0) {

                if (obj.EliminarTipoConsulta()) {
                    JOptionPane.showMessageDialog(this, "Datos eliminados");
                    CargarTablaTipoConsulta();
                    Bit.BitacoraDeleteTipoConsulta();
                }else{
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarTipoConsultaActionPerformed

    private void btnModificarTipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTipoConsultaActionPerformed
        String IDTipoConsulta;
        int fsel = tblconsulta.getSelectedRow();
        if (fsel==-1) 
        {
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        {if  (txtNombreTipoConsulta.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else {
            m = (DefaultTableModel)tblconsulta.getModel();
            IDTipoConsulta = tblconsulta.getValueAt(fsel, 0).toString();
            txtID.setText(IDTipoConsulta);
            tipoConsultas obj = new tipoConsultas();
            int ID = Integer.parseInt(txtID.getText());
            obj.setID_tipoConsulta(ID);
//            System.out.println("LLega ID "+ obj.getIDTipoConsulta());
            
            obj.setTipo_consulta(txtNombreTipoConsulta.getText());
            clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText())); 
            if (obj.ModificarTipoConsulta()) 
            {
                JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
                CargarTablaTipoConsulta();
                Bit.BitacoraUpdateTipoConsulta();
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Error al modificar los datos");
            }
         }
        }
    }//GEN-LAST:event_btnModificarTipoConsultaActionPerformed

    private void btnTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoPagoActionPerformed
        txtNombreTipoConsulta.setText("");
    }//GEN-LAST:event_btnTipoPagoActionPerformed

    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblconsulta.getModel();
        modeloTabla.setRowCount(0);
        
         PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        //tamaños para la tabla
        int[] anchos = {10, 100};
        for (int i = 0; i < tblconsulta.getColumnCount(); i++) {
            tblconsulta.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            Connection cn = Conexion.conectar();
            ps = cn.prepareStatement("SELECT ID_tipoConsulta, tipo_consulta FROM Tipo_consulta ORDER BY ID_tipoConsulta");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
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

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void txtNombreTipoConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreTipoConsultaKeyTyped
        char valida=evt.getKeyChar();
        if (Character.isDigit(valida)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se pueden ingresar letras");
        }
    }//GEN-LAST:event_txtNombreTipoConsultaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnEliminarTipoConsulta;
    private javax.swing.JButton btnGuardarTipoConsulta;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificarTipoConsulta;
    private javax.swing.JButton btnMostrarTipoConsulta;
    private javax.swing.JButton btnTipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblconsulta;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombreTipoConsulta;
    // End of variables declaration//GEN-END:variables
}
