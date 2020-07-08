package ptcproyecto;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 15-CW0001la
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBarra = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        panelAbajo = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jButton1f = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panelArriba = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarra.setBackground(new java.awt.Color(204, 153, 255));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1487086345-cross_81577.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addContainerGap(982, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
        );

        getContentPane().add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        panelMenu.setBackground(new java.awt.Color(102, 51, 255));

        jButton1f.setBackground(new java.awt.Color(255, 255, 255));
        jButton1f.setText("Ficha Clínica");
        jButton1f.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1fActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Agenda");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Productos");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        panelArriba.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelArribaLayout = new javax.swing.GroupLayout(panelArriba);
        panelArriba.setLayout(panelArribaLayout);
        panelArribaLayout.setHorizontalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        panelArribaLayout.setVerticalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono1_1.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin_User");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administrador");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("En línea");

        jButton1.setText("Cerrar sesión");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Citas");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Consultas");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Empleados");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Dueños");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Mascotas");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Usuarios");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMenuLayout.createSequentialGroup()
                            .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelMenuLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel1)
                                    .addGap(28, 28, 28))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)))
                            .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMenuLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel4))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMenuLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMenuLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1f, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(7, 7, 7)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1f, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(panelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAbajoLayout = new javax.swing.GroupLayout(panelAbajo);
        panelAbajo.setLayout(panelAbajoLayout);
        panelAbajoLayout.setHorizontalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAbajoLayout.setVerticalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
        );

        getContentPane().add(panelAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 1020, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int Pregunta_UC1 = JOptionPane.showConfirmDialog(null,"¿Desea cerrar el sistema?", "Salida del sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (Pregunta_UC1 == JOptionPane.YES_OPTION) 
        {
            System.exit(0);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Se ha abortado el cierre del sistema", "Salir del sistema", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton1f.setBackground(Color.WHITE);
        jButton1f.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton3.setBackground(Color.BLACK);
        jButton3.setForeground(Color.WHITE);
        jButton7.setBackground(Color.WHITE);
        jButton7.setForeground(Color.BLACK);
        jButton8.setBackground(Color.WHITE);
        jButton8.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);
        jButton5.setBackground(Color.WHITE);
        jButton5.setForeground(Color.BLACK);
        jButton9.setBackground(Color.WHITE);
        jButton9.setForeground(Color.BLACK);
        jButton10.setBackground(Color.WHITE);
        jButton10.setForeground(Color.BLACK);
//        FrmProductos_UC2 fich= new FrmProductos_UC2();
//        panelArriba.add(fich);
//        fich.show();
        jButton3.setEnabled(false);
        jButton2.setEnabled(true);
        jButton1f.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton1f.setBackground(Color.WHITE);
        jButton1f.setForeground(Color.BLACK);
        jButton2.setBackground(Color.BLACK);
        jButton2.setForeground(Color.WHITE);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton7.setBackground(Color.WHITE);
        jButton7.setForeground(Color.BLACK);
        jButton8.setBackground(Color.WHITE);
        jButton8.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);
        jButton5.setBackground(Color.WHITE);
        jButton5.setForeground(Color.BLACK);
        jButton9.setBackground(Color.WHITE);
        jButton9.setForeground(Color.BLACK);
        jButton10.setBackground(Color.WHITE);
        jButton10.setForeground(Color.BLACK);
        frmAgenda fich= new frmAgenda();
        panelArriba.add(fich);
        fich.show();
        jButton2.setEnabled(false);
        jButton1f.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1fActionPerformed
        jButton1f.setBackground(Color.BLACK);
        jButton1f.setForeground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton7.setBackground(Color.WHITE);
        jButton7.setForeground(Color.BLACK);
        jButton8.setBackground(Color.WHITE);
        jButton8.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);
        jButton5.setBackground(Color.WHITE);
        jButton5.setForeground(Color.BLACK);
        jButton9.setBackground(Color.WHITE);
        jButton9.setForeground(Color.BLACK);
        jButton10.setBackground(Color.WHITE);
        jButton10.setForeground(Color.BLACK);
        frmFichaClinica fich= new frmFichaClinica();
        panelArriba.add(fich);
        fich.show();
        jButton1f.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton1fActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int Pregunta_UC1 = JOptionPane.showConfirmDialog(null,"¿Desea cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (Pregunta_UC1 == JOptionPane.YES_OPTION) 
        {
            Login llamar = new Login();
            llamar.setVisible(true);
            llamar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Se ha abortado el cierre de sesión", "Cerrar Sesión", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton1f.setBackground(Color.WHITE);
        jButton1f.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton7.setBackground(Color.WHITE);
        jButton7.setForeground(Color.BLACK);
        jButton8.setBackground(Color.WHITE);
        jButton8.setForeground(Color.BLACK);
        jButton4.setBackground(Color.BLACK);
        jButton4.setForeground(Color.WHITE);
        jButton5.setBackground(Color.WHITE);
        jButton5.setForeground(Color.BLACK);
        jButton9.setBackground(Color.WHITE);
        jButton9.setForeground(Color.BLACK);
        jButton10.setBackground(Color.WHITE);
        jButton10.setForeground(Color.BLACK);
        frmEmpleados fich= new frmEmpleados();
        panelArriba.add(fich);
        fich.show();
        jButton1f.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton1f.setBackground(Color.WHITE);
        jButton1f.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton7.setBackground(Color.WHITE);
        jButton7.setForeground(Color.BLACK);
        jButton8.setBackground(Color.WHITE);
        jButton8.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);
        jButton5.setBackground(Color.BLACK);
        jButton5.setForeground(Color.WHITE);
        jButton9.setBackground(Color.WHITE);
        jButton9.setForeground(Color.BLACK);
        jButton10.setBackground(Color.WHITE);
        jButton10.setForeground(Color.BLACK);
        Dueños fich= new Dueños();
        panelArriba.add(fich);
        fich.show();
        jButton1f.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton1f.setBackground(Color.WHITE);
        jButton1f.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton7.setBackground(Color.BLACK);
        jButton7.setForeground(Color.WHITE);
        jButton8.setBackground(Color.WHITE);
        jButton8.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);
        jButton5.setBackground(Color.WHITE);
        jButton5.setForeground(Color.BLACK);
        jButton9.setBackground(Color.WHITE);
        jButton9.setForeground(Color.BLACK);
        jButton10.setBackground(Color.WHITE);
        jButton10.setForeground(Color.BLACK);
        Citas fich= new Citas();
        panelArriba.add(fich);
        fich.show();
        jButton1f.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton1f.setBackground(Color.WHITE);
        jButton1f.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton7.setBackground(Color.WHITE);
        jButton7.setForeground(Color.BLACK);
        jButton8.setBackground(Color.BLACK);
        jButton8.setForeground(Color.WHITE);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);
        jButton5.setBackground(Color.WHITE);
        jButton5.setForeground(Color.BLACK);
        jButton9.setBackground(Color.WHITE);
        jButton9.setForeground(Color.BLACK);
        jButton10.setBackground(Color.WHITE);
        jButton10.setForeground(Color.BLACK);
        //Consultas fich= new Consultas();
//        panelArriba.add(fich);
//        fich.show();
        jButton1f.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton1f.setBackground(Color.WHITE);
        jButton1f.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton7.setBackground(Color.WHITE);
        jButton7.setForeground(Color.BLACK);
        jButton8.setBackground(Color.WHITE);
        jButton8.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);
        jButton5.setBackground(Color.WHITE);
        jButton5.setForeground(Color.BLACK);
        jButton9.setBackground(Color.BLACK);
        jButton9.setForeground(Color.WHITE);
        jButton10.setBackground(Color.WHITE);
        jButton10.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton1f.setBackground(Color.WHITE);
        jButton1f.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton7.setBackground(Color.WHITE);
        jButton7.setForeground(Color.BLACK);
        jButton8.setBackground(Color.WHITE);
        jButton8.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);
        jButton5.setBackground(Color.WHITE);
        jButton5.setForeground(Color.BLACK);
        jButton9.setBackground(Color.WHITE);
        jButton9.setForeground(Color.BLACK);
        jButton10.setBackground(Color.BLACK);
        jButton10.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton10ActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton1f;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelArriba;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
