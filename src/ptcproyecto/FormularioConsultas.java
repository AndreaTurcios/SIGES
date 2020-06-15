package ptcproyecto;

import java.awt.Dimension;

public class FormularioConsultas extends javax.swing.JFrame {

    /**
     * Creates new form FormularioConsultas
     */
    public FormularioConsultas() {
        initComponents();
        this.setMinimumSize(new Dimension(850,480));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jPTablaDatosConsultas.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPConsultas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPIngresoConsultas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFHoraConsultas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        JPGestionConsultas = new javax.swing.JPanel();
        JBGuardarConsultas = new javax.swing.JButton();
        JBMostrarConsultas = new javax.swing.JButton();
        JBModificarConsultas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPTablaDatosConsultas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPConsultas.setBackground(new java.awt.Color(153, 204, 255));
        JPConsultas.setForeground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cosultas");

        javax.swing.GroupLayout JPConsultasLayout = new javax.swing.GroupLayout(JPConsultas);
        JPConsultas.setLayout(JPConsultasLayout);
        JPConsultasLayout.setHorizontalGroup(
            JPConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPConsultasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1))
        );
        JPConsultasLayout.setVerticalGroup(
            JPConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPConsultasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(JPConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        jPIngresoConsultas.setBackground(new java.awt.Color(204, 204, 255));
        jPIngresoConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de las consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPIngresoConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Fecha:");
        jPIngresoConsultas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Hora:");
        jPIngresoConsultas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 102, -1, -1));
        jPIngresoConsultas.add(JTFHoraConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 123, 73, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Seleccione el tipo de cita:");
        jPIngresoConsultas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 154, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPIngresoConsultas.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 182, -1, -1));

        getContentPane().add(jPIngresoConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 580, 380));

        JPGestionConsultas.setBackground(new java.awt.Color(153, 204, 255));
        JPGestionConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        JPGestionConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBGuardarConsultas.setBackground(new java.awt.Color(153, 153, 255));
        JBGuardarConsultas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBGuardarConsultas.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardarConsultas.setText("Guardar");
        JBGuardarConsultas.setPreferredSize(new java.awt.Dimension(90, 60));
        JBGuardarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarConsultasActionPerformed(evt);
            }
        });
        JPGestionConsultas.add(JBGuardarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 200, 48));

        JBMostrarConsultas.setBackground(new java.awt.Color(153, 153, 255));
        JBMostrarConsultas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBMostrarConsultas.setForeground(new java.awt.Color(255, 255, 255));
        JBMostrarConsultas.setText("Mostrar");
        JBMostrarConsultas.setPreferredSize(new java.awt.Dimension(90, 60));
        JBMostrarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMostrarConsultasActionPerformed(evt);
            }
        });
        JPGestionConsultas.add(JBMostrarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, 200, 53));

        JBModificarConsultas.setBackground(new java.awt.Color(153, 153, 255));
        JBModificarConsultas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBModificarConsultas.setForeground(new java.awt.Color(255, 255, 255));
        JBModificarConsultas.setText("Modificar");
        JBModificarConsultas.setPreferredSize(new java.awt.Dimension(90, 60));
        JPGestionConsultas.add(JBModificarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 252, 200, -1));
        JPGestionConsultas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 210, 10));
        JPGestionConsultas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 236, 210, 10));

        getContentPane().add(JPGestionConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, -1, 380));

        jPTablaDatosConsultas.setBackground(new java.awt.Color(204, 204, 255));
        jPTablaDatosConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de las consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPTablaDatosConsultasLayout = new javax.swing.GroupLayout(jPTablaDatosConsultas);
        jPTablaDatosConsultas.setLayout(jPTablaDatosConsultasLayout);
        jPTablaDatosConsultasLayout.setHorizontalGroup(
            jPTablaDatosConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTablaDatosConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPTablaDatosConsultasLayout.setVerticalGroup(
            jPTablaDatosConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTablaDatosConsultasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(jPTablaDatosConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarConsultasActionPerformed

    }//GEN-LAST:event_JBGuardarConsultasActionPerformed

    private void JBMostrarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMostrarConsultasActionPerformed
        jPTablaDatosConsultas.setVisible(true);
        jPIngresoConsultas.setVisible(false);
    }//GEN-LAST:event_JBMostrarConsultasActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardarConsultas;
    private javax.swing.JButton JBModificarConsultas;
    private javax.swing.JButton JBMostrarConsultas;
    private javax.swing.JPanel JPConsultas;
    private javax.swing.JPanel JPGestionConsultas;
    private javax.swing.JTextField JTFHoraConsultas;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPIngresoConsultas;
    private javax.swing.JPanel jPTablaDatosConsultas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
