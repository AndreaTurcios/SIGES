package ptcproyecto;

import clases.Usuario;
import clases.conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author estef
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

    public frmUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        BtnCerrar2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        JCBPregunta = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jtfRespuesta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtbModificar = new javax.swing.JToggleButton();
        jtbConsultar = new javax.swing.JToggleButton();
        jtbGuardar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBImprimir = new javax.swing.JToggleButton();
        jtfUsuario = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jtfContraseña = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        JCBcargoE = new javax.swing.JComboBox<>();

        jPanel13.setBackground(new java.awt.Color(157, 34, 202));

        jLabel32.setFont(new java.awt.Font("Ubuntu Mono", 0, 24)); // NOI18N
        jLabel32.setText("Usuarios");

        BtnCerrar2.setToolTipText("");
        BtnCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(321, 321, 321)
                .addComponent(BtnCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(BtnCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel33.setText("Nombre:");
        jLabel33.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombrejTextField4ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel34.setText("Apellido:");
        jLabel34.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel35.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel35.setText("E-mail:");
        jLabel35.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel36.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel36.setText("Direccion:");
        jLabel36.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Guardar respuesta");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Seleccionar pregunta:");
        jLabel42.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        JCBPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel43.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Ingresar respuesta:");
        jLabel43.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(0, 83, Short.MAX_VALUE))
                            .addComponent(jtfRespuesta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JCBPregunta, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCBPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jLabel9.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel9.setText("Telefono");
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jtfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidojTextField4ActionPerformed(evt);
            }
        });

        jtbModificar.setBackground(new java.awt.Color(0, 153, 153));
        jtbModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jtbModificar.setText("Modificar");
        jtbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbModificarActionPerformed(evt);
            }
        });

        jtbConsultar.setBackground(new java.awt.Color(0, 153, 153));
        jtbConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtbConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jtbConsultar.setText("Consultar");
        jtbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbConsultarActionPerformed(evt);
            }
        });

        jtbGuardar.setBackground(new java.awt.Color(0, 153, 153));
        jtbGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jtbGuardar.setText("Guardar");
        jtbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbGuardarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        JBImprimir.setBackground(new java.awt.Color(0, 153, 153));
        JBImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JBImprimir.setForeground(new java.awt.Color(255, 255, 255));
        JBImprimir.setText("Imprimir");
        JBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImprimirActionPerformed(evt);
            }
        });

        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel39.setText("Usuario:");
        jLabel39.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel40.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel40.setText("Contraseña:");
        jLabel40.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel41.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel41.setText("Cargo del empleado:");
        jLabel41.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        JCBcargoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(jtfDireccion))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(25, 25, 25)
                                .addComponent(jtfTelefono))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(jtfUsuario)
                                    .addComponent(jtfNombre)
                                    .addComponent(jtfApellido)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBcargoE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(JCBcargoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jtbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombrejTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombrejTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombrejTextField4ActionPerformed

    private void BtnCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrar2ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrar2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jtfApellidojTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidojTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidojTextField4ActionPerformed

    private void jtbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbGuardarActionPerformed
    Usuario obj = new Usuario();
        obj.setnombre_usuario(jtfNombre.getText());
        obj.setEmpleado_apellidos(jtfApellido.getText());
        obj.setTelefono(Integer.parseInt(jtfTelefono.getText ()));
        obj.setCorreo(jtfEmail.getText());
        obj.setDomicilio(jtfDireccion.getText());
        obj.setUsuario(jtfUsuario.getText());
        obj.setContraseña(jtfContraseña.getText());
        obj.setID_tipoUsuario((Integer) JCBcargoE.getSelectedItem());
//        ((Integer) JCBPregunta.getSelectedItem());
//        obj.setRespuesta(jtfRespuesta.getText());
        if (obj.guardar()) {
            JOptionPane.showMessageDialog(this, "Los datos han sido guardados");
        }else{
            JOptionPane.showMessageDialog(this, "Error al guardar los datos");
        }
    }//GEN-LAST:event_jtbGuardarActionPerformed

    private void jtbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbModificarActionPerformed
       Usuario obj = new Usuario();
        obj.setNombre_usuario(jtfNombre.getText());
        obj.setEmpleado_apellidos(jtfApellido.getText());
        obj.setTelefono(Integer.parseInt(jtfTelefono.getText ()));
        obj.setCorreo(jtfEmail.getText());
        obj.setDomicilio(jtfDireccion.getText());
        obj.setUsuario(jtfUsuario.getText());
        obj.setContraseña(jtfContraseña.getText());
        obj.setID_tipoUsuario((Integer) JCBcargoE.getSelectedItem());
//        obj.setPregunta((Integer) JCBPregunta.getSelectedItem());
//        obj.setRespuesta(jtfRespuesta.getText());
        
        if (obj.modificar()) {
            JOptionPane.showMessageDialog(this, "Los datos han sido modificados");
        }else{
            JOptionPane.showMessageDialog(this, "Error al modificar los datos");
        }
    }//GEN-LAST:event_jtbModificarActionPerformed

    private void jtbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbConsultarActionPerformed
        Usuario obj = new Usuario();
        if (obj.Consultar()) {
        obj.setNombre_usuario(jtfNombre.getText());
        obj.setEmpleado_apellidos(jtfApellido.getText());
        obj.setTelefono(Integer.parseInt(jtfTelefono.getText ()));
        obj.setCorreo(jtfEmail.getText());
        obj.setDomicilio(jtfDireccion.getText());
        obj.setUsuario(jtfUsuario.getText());
        obj.setContraseña(jtfContraseña.getText());
        obj.setID_tipoUsuario((Integer) JCBcargoE.getSelectedItem());
//        obj.setPregunta((Integer) JCBPregunta.getSelectedItem());
//        obj.setRespuesta(jtfRespuesta.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Los datos consultados no han sido encontrados");
        }
    }//GEN-LAST:event_jtbConsultarActionPerformed

    private void JBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImprimirActionPerformed
        try 
        {
            java.sql.Connection con = conexion.conectar();
            JasperReport reporte = null;
            String path = "src\\Reportes\\Empleados.jasper";
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
    }//GEN-LAST:event_JBImprimirActionPerformed

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar2;
    private javax.swing.JToggleButton JBImprimir;
    private javax.swing.JComboBox<String> JCBPregunta;
    private javax.swing.JComboBox<String> JCBcargoE;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jtbConsultar;
    private javax.swing.JToggleButton jtbGuardar;
    private javax.swing.JToggleButton jtbModificar;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfContraseña;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRespuesta;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
