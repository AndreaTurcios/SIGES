package ptcproyecto;

import clases.TipoEstados;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15-CW0001la
 */
public class TipoEstado extends javax.swing.JInternalFrame {
DefaultTableModel m;
    /**
     * Creates new form TipoEstado
     */
    public TipoEstado() {
        initComponents();
        ListarTipoE();
        jTextField2.setVisible(false);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        btnCerrar1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel21.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel21.setText("Tipo estado:");

        jTextField1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(240, 240, 240));
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jLabel22.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel22.setText("Tipo estado se refiere al estado en el que se puede encontrar una cita o consulta, se puede ");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextField4.setBackground(new java.awt.Color(240, 240, 240));
        jTextField4.setBorder(null);

        btnLimpiar.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jButton2.setText("Guardar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpiar)
                .addGap(55, 55, 55)
                .addComponent(jButton3)
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addGap(58, 58, 58)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );

        jLabel23.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel23.setText("estipular variando en la empresa.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel2.setkGradientFocus(600);
        kGradientPanel2.setkStartColor(new java.awt.Color(1, 163, 201));

        btnCerrar1.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
        btnCerrar1.setBorder(null);
        btnCerrar1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tipo estado");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(259, 259, 259)
                .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 552, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void ListarTipoE(){
        TipoEstados obj = new TipoEstados();
        obj.Cargar(jTable3);
    }
    public void Limpiar(){
        jTextField1.setText("");
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if  (jTextField1.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else {
        TipoEstados obj = new TipoEstados();
        obj.setEstado(jTextField1.getText());
        clases.Bitacora Bit = new clases.Bitacora();
        Bit.setID(Integer.parseInt(jLabel1.getText()));
        if (obj.guardar()) {
           JOptionPane.showMessageDialog(this,"Datos ingresados correctamente"); 
           ListarTipoE();
           Bit.BitacoraCreateTipoEstado();
           }else{ 
           JOptionPane.showMessageDialog(this,"Error al guardar datos"); 
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jTextField1.setText(" ");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if  (jTextField1.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else {
        String ID_estado;
        int fsel = jTable3.getSelectedRow();
        
        if (fsel==-1) {
        JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
        }else{
         m = (DefaultTableModel)jTable3.getModel();
         ID_estado = jTable3.getValueAt(fsel, 0).toString();
         jTextField2.setText(ID_estado);
         
         TipoEstados u = new TipoEstados();
         int estad = Integer.parseInt(jTextField2.getText());
         u.setID_estado(estad);
         
          u.setEstado(jTextField1.getText());
         clases.Bitacora Bit = new clases.Bitacora();
         Bit.setID(Integer.parseInt(jLabel1.getText()));
         if (u.modificar()) {
            JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
             ListarTipoE();
             Limpiar();
             Bit.BitacoraUpdateTipoEstado();
        }else{
           JOptionPane.showMessageDialog(null,"Error al modificar los datos");
           }
         }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String ID;
        int fsel = jTable3.getSelectedRow();
        if (fsel==-1) {

            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia",
                JOptionPane.WARNING_MESSAGE);
        }else{
            m = (DefaultTableModel)jTable3.getModel();
            ID = jTable3.getValueAt(fsel, 0).toString();
            jTextField2.setText(ID);

            TipoEstados obj = new TipoEstados();
            obj.setID_estado(Integer.parseInt(jTextField2.getText()));
            clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText()));
            int eliminar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?",
                "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (eliminar == 0) {

                if (obj.Eliminar()) {
                    JOptionPane.showMessageDialog(this, "Datos eliminados");
                    ListarTipoE();
                    Bit.BitacoraDeleteTipoEstado();
                }else{
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char valida=evt.getKeyChar();
        if (Character.isDigit(valida)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se pueden ingresar letras");
        }
    }//GEN-LAST:event_jTextField1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
