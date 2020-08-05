package ptcproyecto;

import clases.controlNacionalidad;
import javax.swing.JOptionPane;

/**
 *
 * @author 15-CW0001la
 */
public class Nacionalidad extends javax.swing.JInternalFrame {
    public Nacionalidad() {
        initComponents();
        ListarNacionalidad();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Nacionalidad = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnGuardarNacionalidad = new javax.swing.JButton();
        btnModificarNacionalidad = new javax.swing.JButton();
        btnLimpiarNacionalidad = new javax.swing.JButton();
        btnImprimirNacionalidad = new javax.swing.JButton();
        txtNacionalidad = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(157, 34, 202));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nacionalidad");

        btnConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btnConsulta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsulta)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBusqueda)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nacionalidad:");

        btnGuardarNacionalidad.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardarNacionalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnGuardarNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarNacionalidad.setText("Guardar");
        btnGuardarNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNacionalidadActionPerformed(evt);
            }
        });

        btnModificarNacionalidad.setBackground(new java.awt.Color(0, 153, 153));
        btnModificarNacionalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnModificarNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarNacionalidad.setText("Modificar");
        btnModificarNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarNacionalidadActionPerformed(evt);
            }
        });

        btnLimpiarNacionalidad.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpiarNacionalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLimpiarNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarNacionalidad.setText("Limpiar");

        btnImprimirNacionalidad.setBackground(new java.awt.Color(0, 153, 153));
        btnImprimirNacionalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnImprimirNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirNacionalidad.setText("Imprimir");

        txtNacionalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnImprimirNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificarNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiarNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 269, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnGuardarNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimirNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiarNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 359, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    public void ListarNacionalidad(){
        controlNacionalidad obj = new controlNacionalidad();
        obj.CargarNacionalidades(tb_Nacionalidad);
    }
        
    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        if (txtBusqueda.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else
        {
            controlNacionalidad obj = new controlNacionalidad();
            obj.setID_nacionalidad(Integer.parseInt(txtBusqueda.getText()));
            if (obj.Consultar())
            {
                txtNacionalidad.setText(obj.getnacionalidad());
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al consultar datos");
            }
        }
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnGuardarNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNacionalidadActionPerformed
        //Tomando los datos del formulario y pasandolos a los atributos de la clase
        if (txtNacionalidad.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else
        {
            controlNacionalidad obj = new controlNacionalidad();
            obj.setnacionalidad(txtNacionalidad.getText());
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
        if (txtNacionalidad.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else
        {

            controlNacionalidad obj = new controlNacionalidad();
            obj.setnacionalidad(txtNacionalidad.getText());
            if (obj.modificar())
            {
                JOptionPane.showMessageDialog(this, "Datos modificados");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al modificar datos");
            }

        }
    }//GEN-LAST:event_btnModificarNacionalidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnGuardarNacionalidad;
    private javax.swing.JButton btnImprimirNacionalidad;
    private javax.swing.JButton btnLimpiarNacionalidad;
    private javax.swing.JButton btnModificarNacionalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_Nacionalidad;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtNacionalidad;
    // End of variables declaration//GEN-END:variables
}
