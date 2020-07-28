package ptcproyecto;

import clases.*;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author 15-CW0001la
 */
public class frmConsultas extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmConsultas
     */
    public frmConsultas() {
        initComponents();
        this.setPreferredSize(new Dimension(760,714));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPConsultas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        BtnCerrar1 = new javax.swing.JButton();
        JPGestionConsultas = new javax.swing.JPanel();
        btnGuardar_Consulta = new javax.swing.JButton();
        btnMostrar_Consulta = new javax.swing.JButton();
        btnModificar_Consulta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPTablaDatosConsultas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        jPIngresoConsultas = new javax.swing.JPanel();
        CmbTurno = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CmbTipo_Cita = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Spinner_Segundo = new javax.swing.JSpinner();
        Spinner_Hora = new javax.swing.JSpinner();
        Spinner_Minuto = new javax.swing.JSpinner();
        cndFecha = new rojeru_san.componentes.RSDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtDUI = new javax.swing.JTextField();

        JPConsultas.setBackground(new java.awt.Color(157, 34, 202));
        JPConsultas.setForeground(new java.awt.Color(153, 204, 255));
        JPConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consultas");
        JPConsultas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        BtnCerrar.setToolTipText("");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        JPConsultas.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 27, 25));

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        jTextField1.setBackground(new java.awt.Color(204, 102, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        BtnCerrar1.setToolTipText("");
        BtnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(BtnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        JPConsultas.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 240, -1));

        JPGestionConsultas.setBackground(new java.awt.Color(255, 255, 255));
        JPGestionConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        JPGestionConsultas.setPreferredSize(new java.awt.Dimension(222, 330));
        JPGestionConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar_Consulta.setBackground(new java.awt.Color(0, 136, 130));
        btnGuardar_Consulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar_Consulta.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar_Consulta.setText("Guardar");
        btnGuardar_Consulta.setPreferredSize(new java.awt.Dimension(90, 60));
        btnGuardar_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar_ConsultaActionPerformed(evt);
            }
        });
        JPGestionConsultas.add(btnGuardar_Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 66, 190, 48));

        btnMostrar_Consulta.setBackground(new java.awt.Color(0, 136, 130));
        btnMostrar_Consulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMostrar_Consulta.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar_Consulta.setText("Mostrar");
        btnMostrar_Consulta.setPreferredSize(new java.awt.Dimension(90, 60));
        btnMostrar_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar_ConsultaActionPerformed(evt);
            }
        });
        JPGestionConsultas.add(btnMostrar_Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 165, 190, 53));

        btnModificar_Consulta.setBackground(new java.awt.Color(0, 136, 130));
        btnModificar_Consulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificar_Consulta.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar_Consulta.setText("Modificar");
        btnModificar_Consulta.setPreferredSize(new java.awt.Dimension(90, 60));
        JPGestionConsultas.add(btnModificar_Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 252, 190, -1));
        JPGestionConsultas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 210, 10));
        JPGestionConsultas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 236, 210, 10));

        jPTablaDatosConsultas.setBackground(new java.awt.Color(255, 255, 255));
        jPTablaDatosConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de las consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPTablaDatosConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "consulta_fecha", "consulta_hora", "tipoConsulta", "DUI"
            }
        ));
        jScrollPane2.setViewportView(tbConsultas);

        jPTablaDatosConsultas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 710, 170));

        jPIngresoConsultas.setBackground(new java.awt.Color(255, 255, 255));
        jPIngresoConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de las consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPIngresoConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        jPIngresoConsultas.add(CmbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 70, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("DUI del solicitante de la consulta:");
        jPIngresoConsultas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Hora:");
        jPIngresoConsultas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Fecha:");
        jPIngresoConsultas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Minuto:");
        jPIngresoConsultas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Turno:");
        jPIngresoConsultas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, 20));

        CmbTipo_Cita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPIngresoConsultas.add(CmbTipo_Cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 370, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Segundo:");
        jPIngresoConsultas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, 20));

        Spinner_Segundo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPIngresoConsultas.add(Spinner_Segundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 70, -1));

        Spinner_Hora.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPIngresoConsultas.add(Spinner_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 70, -1));

        Spinner_Minuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPIngresoConsultas.add(Spinner_Minuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 70, -1));
        jPIngresoConsultas.add(cndFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 310, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Seleccione el tipo de cita:");
        jPIngresoConsultas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPIngresoConsultas.add(txtDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(jPIngresoConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JPConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JPGestionConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPTablaDatosConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPIngresoConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(JPGestionConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jPTablaDatosConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrar1ActionPerformed

    private void btnGuardar_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar_ConsultaActionPerformed
       JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
       crud_consulta obj = new crud_consulta();
       String Hora = Spinner_Hora.getToolTipText();
       String Minuto = Spinner_Minuto.getToolTipText();
       String Segundo = Spinner_Segundo.getToolTipText();
       String Turno = CmbTurno.getActionCommand();
       String Hora_Exacta = Hora + ":" + Minuto + ":" + Segundo;
       obj.setconsulta_fecha(Integer.parseInt(cndFecha.getFormatoFecha()));
       obj.setconsulta_hora(Integer.parseInt(Hora_Exacta));
       obj.setID_tipoConsulta((Integer) CmbTipo_Cita.getSelectedItem());
       int DUI= Integer.parseInt(txtDUI.getText());
       obj.setID_DUI(DUI);
       if (obj.Guardar_Consulta()) {
            JOptionPane.showMessageDialog(this, "Los datos han sido guardados");
        }else{
            JOptionPane.showMessageDialog(this, "Error al guardar los datos");
        }
    }//GEN-LAST:event_btnGuardar_ConsultaActionPerformed

    private void btnMostrar_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar_ConsultaActionPerformed

    }//GEN-LAST:event_btnMostrar_ConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnCerrar1;
    public javax.swing.JComboBox<String> CmbTipo_Cita;
    public javax.swing.JComboBox<String> CmbTurno;
    private javax.swing.JPanel JPConsultas;
    private javax.swing.JPanel JPGestionConsultas;
    public javax.swing.JSpinner Spinner_Hora;
    public javax.swing.JSpinner Spinner_Minuto;
    public javax.swing.JSpinner Spinner_Segundo;
    private javax.swing.JButton btnGuardar_Consulta;
    private javax.swing.JButton btnModificar_Consulta;
    private javax.swing.JButton btnMostrar_Consulta;
    private rojeru_san.componentes.RSDateChooser cndFecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPIngresoConsultas;
    private javax.swing.JPanel jPTablaDatosConsultas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbConsultas;
    private javax.swing.JTextField txtDUI;
    // End of variables declaration//GEN-END:variables
}
