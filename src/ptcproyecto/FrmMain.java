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
        jLabel14.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBarra = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        panelAbajo = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        panelArriba = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblTipo_Usuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarra.setBackground(new java.awt.Color(81, 50, 255));
        panelBarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
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
                .addGap(0, 980, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        panelMenu.setBackground(new java.awt.Color(53, 99, 190));
        panelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        panelArriba.setBackground(new java.awt.Color(153, 153, 255));
        panelArriba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout panelArribaLayout = new javax.swing.GroupLayout(panelArriba);
        panelArriba.setLayout(panelArribaLayout);
        panelArribaLayout.setHorizontalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        panelArribaLayout.setVerticalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/person_icon-icons.com_50075.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Admin_User");

        lblTipo_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipo_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo_Usuario.setText("Administrador");

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

        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("                   Ficha clínica");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("                        Agenda");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("                      Productos");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("                         Citas");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("                      Consultas");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("                        Dueños");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("                       Mascotas");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("                        Usuarios");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel14.setText("                        Preguntas");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel15.setText("                      Tipo mascota");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel17.setText("                      Tipo producto");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("                    Nacionalidad");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel19.setText("                      Tipo pago");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel20.setText("                  Codigo zona");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblTipo_Usuario)
                            .addComponent(jLabel4)))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addComponent(lblUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTipo_Usuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(panelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout panelAbajoLayout = new javax.swing.GroupLayout(panelAbajo);
        panelAbajo.setLayout(panelAbajoLayout);
        panelAbajoLayout.setHorizontalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAbajoLayout.setVerticalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 1020, 700));

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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jLabel5.setForeground(Color.BLACK);
        jLabel6.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.WHITE);
        jLabel18.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.WHITE);
        frmFichaClinica fich= new frmFichaClinica();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.WHITE);
        jLabel6.setForeground(Color.BLACK);
        jLabel18.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.WHITE);
        Agenda fich= new Agenda();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.BLACK);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.WHITE);
        jLabel6.setForeground(Color.WHITE);
        jLabel18.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.WHITE);
        Productos fich= new Productos();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.BLACK);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.WHITE);
        jLabel6.setForeground(Color.WHITE);
        jLabel18.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.WHITE);
        Citas fich= new Citas();
        panelArriba.add(fich);
        fich.show();    
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.BLACK);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.WHITE);
        jLabel6.setForeground(Color.WHITE);
        jLabel18.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.WHITE);
        frmConsultas fich =new frmConsultas();
       panelArriba.add(fich);
       fich.show();  
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.BLACK);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.WHITE);
        jLabel6.setForeground(Color.WHITE);
        jLabel18.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.WHITE);
        Dueños fich= new Dueños();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.BLACK);
        jLabel13.setForeground(Color.WHITE);
        jLabel6.setForeground(Color.WHITE);
        jLabel18.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.WHITE);
        Mascotas fich= new Mascotas();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jLabel14.setVisible(true);
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.BLACK);
        jLabel6.setForeground(Color.WHITE);
        jLabel18.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.WHITE);
        frmUsuarios fich= new frmUsuarios();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        
        FrmPreguntas fich= new FrmPreguntas();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        TipoMascota fich= new TipoMascota();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        jLabel14.setVisible(true);
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.BLACK);
        jLabel6.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        TipoProducto fich= new TipoProducto();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        jLabel14.setVisible(true);
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.BLACK);
        jLabel6.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        Nacionalidad fich = new Nacionalidad();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        jLabel14.setVisible(true);
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.BLACK);
        jLabel6.setForeground(Color.WHITE);;
        jLabel17.setForeground(Color.WHITE);        
        TipoPago fich= new TipoPago ();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        jLabel14.setVisible(true);
        jLabel5.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.BLACK);
        jLabel6.setForeground(Color.WHITE);;
        jLabel17.setForeground(Color.WHITE);        
        codigoZona fich= new codigoZona ();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel20MouseClicked
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel lblTipo_Usuario;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelArriba;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
