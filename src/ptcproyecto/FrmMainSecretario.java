package ptcproyecto;

import clases.LoginMetodo;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 15-CW0001la
 */       
public class FrmMainSecretario extends javax.swing.JFrame {
    int clicked = 0;
    /**
     * Creates new form FrmMain
     */                                     
    public FrmMainSecretario() {
        initComponents();
        this.setLocationRelativeTo(null);
//        jLabel10.setVisible(false);
        Login ventana = new Login();
        lblUsuario.setText(ventana.texto);
//        lblTipo_Usuario.setText(ventana.texto1);
        
        
    }
    
    public FrmMainSecretario(clases.Bitacora mod){
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAbajo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelArriba = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnCerrar = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel0 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblTipo_Usuario = new javax.swing.JLabel();
        jLabel01 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btntipoCliente1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAbajo.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelArriba.setBackground(new java.awt.Color(255, 255, 255));
        panelArriba.setMaximumSize(new java.awt.Dimension(32767, 32780));
        panelArriba.setPreferredSize(new java.awt.Dimension(661, 623));
        panelArriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelArribaMouseDragged(evt);
            }
        });
        panelArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelArribaMouseClicked(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondopanel.png"))); // NOI18N

        javax.swing.GroupLayout panelArribaLayout = new javax.swing.GroupLayout(panelArriba);
        panelArriba.setLayout(panelArribaLayout);
        panelArribaLayout.setHorizontalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelArribaLayout.setVerticalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 204, 255));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                kGradientPanel1MouseWheelMoved(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
        btnCerrar.setMaximumSize(new java.awt.Dimension(32767, 32767));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 989, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE)
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel2.setkGradientFocus(50);
        kGradientPanel2.setkStartColor(new java.awt.Color(1, 163, 201));
        kGradientPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseDragged(evt);
            }
        });
        kGradientPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseClicked(evt);
            }
        });

        jLabel0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/person_icon-icons.com_50075.png"))); // NOI18N
        jLabel0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Admin_User");

        lblTipo_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipo_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo_Usuario.setText("Secretario");

        jLabel01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel01.setForeground(new java.awt.Color(51, 255, 51));
        jLabel01.setText("En línea");

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setText("Cerrar sesión");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("   Agenda");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        jLabel2.setMaximumSize(new java.awt.Dimension(95, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(95, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(95, 20));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("   Citas");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        jLabel4.setMaximumSize(new java.awt.Dimension(95, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(95, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(95, 20));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("  Tipo cita");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        jLabel15.setMaximumSize(new java.awt.Dimension(95, 20));
        jLabel15.setMinimumSize(new java.awt.Dimension(95, 20));
        jLabel15.setPreferredSize(new java.awt.Dimension(95, 20));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("  Consultas");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        jLabel5.setMaximumSize(new java.awt.Dimension(159, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(159, 20));
        jLabel5.setName(""); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(159, 20));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        btntipoCliente1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btntipoCliente1.setForeground(new java.awt.Color(240, 240, 240));
        btntipoCliente1.setText("  Tipo consultas");
        btntipoCliente1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        btntipoCliente1.setMaximumSize(new java.awt.Dimension(95, 20));
        btntipoCliente1.setMinimumSize(new java.awt.Dimension(95, 20));
        btntipoCliente1.setPreferredSize(new java.awt.Dimension(95, 20));
        btntipoCliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntipoCliente1MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("   Preguntas");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        jLabel10.setMaximumSize(new java.awt.Dimension(159, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(159, 20));
        jLabel10.setName(""); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(159, 20));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("  Respuestas");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        jLabel20.setMaximumSize(new java.awt.Dimension(159, 20));
        jLabel20.setMinimumSize(new java.awt.Dimension(159, 20));
        jLabel20.setName(""); // NOI18N
        jLabel20.setPreferredSize(new java.awt.Dimension(159, 20));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTipo_Usuario)
                                    .addComponent(jLabel01)
                                    .addComponent(lblUsuario)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntipoCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel0)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipo_Usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel01)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntipoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelAbajoLayout = new javax.swing.GroupLayout(panelAbajo);
        panelAbajo.setLayout(panelAbajoLayout);
        panelAbajoLayout.setHorizontalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAbajoLayout.setVerticalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1020, 680));

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jLabel4.setForeground(Color.WHITE);
        jLabel15.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        btntipoCliente1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.BLACK);
        panelArriba.removeAll();
        Agenda fich= new Agenda();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jLabel4.setForeground(Color.BLACK);
        jLabel15.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        btntipoCliente1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
        panelArriba.removeAll();
        Citas fich= new Citas();
        panelArriba.add(fich);
        fich.show();    
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jLabel4.setForeground(Color.WHITE);
        jLabel15.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.BLACK);
        btntipoCliente1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
        panelArriba.removeAll();
        frmConsultas fich =new frmConsultas();
        panelArriba.add(fich);
        fich.show();  
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        jLabel4.setForeground(Color.WHITE);
        jLabel15.setForeground(Color.BLACK);
        jLabel5.setForeground(Color.WHITE);
        btntipoCliente1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
        lblLogo.setVisible(false);
        panelArriba.removeAll();
        frmTipo_cita fich= new frmTipo_cita ();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void btntipoCliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntipoCliente1MouseClicked
        jLabel4.setForeground(Color.WHITE);
        jLabel15.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        btntipoCliente1.setForeground(Color.BLACK);
        jLabel2.setForeground(Color.WHITE);
        lblLogo.setVisible(false);
        panelArriba.removeAll();
        TipoConsulta fich= new TipoConsulta();
        panelArriba.add(fich);
        fich.show();
    }//GEN-LAST:event_btntipoCliente1MouseClicked
 int xx,xy;
    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        xy=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void kGradientPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseWheelMoved
       
    }//GEN-LAST:event_kGradientPanel1MouseWheelMoved

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       
       this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void kGradientPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseClicked
        xy=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_kGradientPanel2MouseClicked

    private void kGradientPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseDragged
        int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       
       this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_kGradientPanel2MouseDragged

    private void panelArribaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelArribaMouseClicked
        xy=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_panelArribaMouseClicked

    private void panelArribaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelArribaMouseDragged
        int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       
       this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_panelArribaMouseDragged

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jLabel4.setForeground(Color.WHITE);
        jLabel15.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        btntipoCliente1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
        jLabel10.setForeground(Color.BLACK);
        jLabel20.setForeground(Color.WHITE);
        lblLogo.setVisible(false);
        panelArriba.removeAll();
        FrmPreguntas fich= new FrmPreguntas();
        panelArriba.add(fich);
        fich.show();

    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        jLabel4.setForeground(Color.WHITE);
        jLabel15.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        btntipoCliente1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
        jLabel10.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.BLACK);
        lblLogo.setVisible(false);
        panelArriba.removeAll();
        Respuestas fich= new Respuestas ();
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
            java.util.logging.Logger.getLogger(FrmMainSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainSecretario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel btntipoCliente1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel01;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblLogo;
    public static javax.swing.JLabel lblTipo_Usuario;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelArriba;
    // End of variables declaration//GEN-END:variables
}
