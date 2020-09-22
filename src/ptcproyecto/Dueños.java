package ptcproyecto;

import clases.*;
import clases.tipoCliente;
import java.awt.Toolkit;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dueños extends javax.swing.JInternalFrame {
DefaultTableModel m;
    public Dueños() {
        initComponents();
        CargarDuenios();
        ListarDuenios();
        Login ventana = new Login();
        jLabel1.setText(ventana.ID.toString());
        System.out.println(ventana.ID);
        jLabel1.setVisible(false);
        
    }
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater
        (
            new Runnable() 
            {
                public void run() 
                {
                    new Dueños().setVisible(true);
                }
            }
        );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        tfDUeñonombre = new javax.swing.JTextField();
        tfCorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfDomicilio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbTipoCliente = new javax.swing.JComboBox<>();
        cmbZona = new javax.swing.JComboBox<>();
        cmbNacionalidad = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnReporte1 = new javax.swing.JButton();
        tfDUI = new javax.swing.JFormattedTextField();
        calendar = new rojeru_san.componentes.RSDateChooser();
        tfTelefono = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnCerrar1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Correo:");

        tfApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidosKeyTyped(evt);
            }
        });

        tfDUeñonombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfDUeñonombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDUeñonombreKeyTyped(evt);
            }
        });

        tfCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCorreoKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Guardar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Domicilio:");

        tfDomicilio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha expiración del DUI:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DUI:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Nacionalidad:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Codigo zona:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tipo cliente:");

        cmbTipoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cmbZona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbZonaActionPerformed(evt);
            }
        });

        cmbNacionalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnReporte.setBackground(new java.awt.Color(0, 153, 153));
        btnReporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnReporte1.setBackground(new java.awt.Color(0, 153, 153));
        btnReporte1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte1.setText("Modificar");
        btnReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte1ActionPerformed(evt);
            }
        });

        try {
            tfDUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbZona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(38, 38, 38)
                                    .addComponent(tfDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(38, 38, 38)
                                        .addComponent(tfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(33, 33, 33))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(tfDUeñonombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(133, 133, 133))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfDUeñonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmbTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

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
        jLabel13.setText("Dueños");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(219, 219, 219)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void CargarDuenios(){
        ClienteDuenio obj = new ClienteDuenio();
        obj.consultarNacionalidad(cmbNacionalidad);
        obj.ConsultarCodigozona(cmbZona);
        obj.consultarTipoC(cmbTipoCliente);
    }
    public void ListarDuenios(){
        ClienteDuenio obj = new ClienteDuenio();
        obj.CargarDuenio(jTable1);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String opcion = cmbNacionalidad.getSelectedItem().toString();
         String opcion1 = cmbZona.getSelectedItem().toString();
         String opcion2 = cmbTipoCliente.getSelectedItem().toString();
        if (opcion=="Seleccione una opción"||opcion1=="Seleccione una opción"||opcion2=="Seleccione una opción") {
             JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else if  (tfDUI.getText().isEmpty() || tfTelefono.getText().isEmpty()||tfDomicilio.getText().isEmpty()||tfDUeñonombre.getText().isEmpty()||tfApellidos.getText().isEmpty()||tfCorreo.getText().isEmpty()||calendar.getDatoFecha() == null){
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else {
             String cor = tfCorreo.getText();
        if(isEmail(cor)){
        JOptionPane.showMessageDialog(null, "Formato de correo correcto"); 
        controlNacionalidad n = new controlNacionalidad();
        n.Consultar();
        ClienteDuenio obj = new ClienteDuenio();
        int DUI= Integer.parseInt(tfDUI.getText());
        obj.setID_DUI(DUI);
        System.out.println("LLega");
        obj.setDuenio_nombre(tfDUeñonombre.getText());
        obj.setDuenio_apellidos(tfApellidos.getText());
        String Telefono= tfTelefono.getText();
        System.out.println("LLega telefono");
        obj.setDuenio_telefono(Telefono);
        obj.setDuenio_domicilio(tfDomicilio.getText());
        obj.setDuenio_correo(tfCorreo.getText());
        System.out.println("LLega correo");
        System.err.println("Calendar "+ calendar);
        System.err.println("Calendar "+ calendar.getDatoFecha());
        obj.setFecha_e_DUI(new java.sql.Date(calendar.getDatoFecha().getTime()));
        controlNacionalidad nac = (controlNacionalidad)cmbNacionalidad.getSelectedItem();
        System.out.println("Item " + nac.getID_nacionalidad());
        System.out.println("Item " +cmbNacionalidad.getSelectedObjects().getClass());
        obj.setNacionalidad_id(nac.getID_nacionalidad());
        obj.setNacionalidad2(nac);
        tipoCliente ti = (tipoCliente)cmbTipoCliente.getSelectedItem();
        System.out.println("Cliente tipo " + ti.getID_tipoCliente());
        obj.setID_tipoCliente(ti.getID_tipoCliente());
        controlCodigoZona coza = (controlCodigoZona)cmbZona.getSelectedItem();
        System.out.println("Codigo zona " + coza.getID_codigo());
        obj.setCodigo_zona(coza.getID_codigo());
        clases.Bitacora Bit = new clases.Bitacora();
        Bit.setID(Integer.parseInt(jLabel1.getText()));
        if (obj.guardarCliente()) {
           JOptionPane.showMessageDialog(this,"Datos ingresados correctamente"); 
           ListarDuenios();
           Bit.BitacoraCreateDuenio();
           }else{ 
           JOptionPane.showMessageDialog(this,"Error al guardar datos"); 
        }/**/
        
        }else{
            JOptionPane.showMessageDialog(null, "Formato de correo incorrecto"); 
        }
      }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void Limpiar(){
        tfDUI.setText(" ");
        tfTelefono.setText(" ");
        tfDomicilio.setText(" ");
        tfDUeñonombre.setText(" ");
        tfApellidos.setText(" ");
        tfCorreo.setText(" ");
//        tfDUI.setValue(" ");
//        tfTelefono.setValue(" ");
        ListarDuenios();
        cmbNacionalidad.setSelectedIndex(0);
        cmbZona.setSelectedIndex(0);
        cmbTipoCliente.setSelectedIndex(0);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbZonaActionPerformed
    public void validator() {
        String cor = tfCorreo.getText();
        if(isEmail(cor)){
            JOptionPane.showMessageDialog(null, "Formato de correo correcto"); 
        }else{
            JOptionPane.showMessageDialog(null, "Formato de correo incorrecto"); 
        }
        }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ID;
        int fsel = jTable1.getSelectedRow();
         if (fsel==-1) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Advertencia", 
        JOptionPane.WARNING_MESSAGE);
         }else{
         m = (DefaultTableModel)jTable1.getModel();
         ID = jTable1.getValueAt(fsel, 0).toString();
         tfDUI.setText(ID);
         ClienteDuenio obj = new ClienteDuenio();
         int DUI= Integer.parseInt(tfDUI.getText());
         obj.setID_DUI(DUI);
         clases.Bitacora Bit = new clases.Bitacora();
         Bit.setID(Integer.parseInt(jLabel1.getText()));
        int eliminar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?",
                "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       if (eliminar == 0) {
          if (obj.EliminarCliente()) {
                JOptionPane.showMessageDialog(this, "Datos eliminados");
                ListarDuenios();
                Bit.BitacoraDeleteDuenio();
            }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar, tiene una mascota asociada.");
            }
        }
      } 
        //EliminarCliente
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try {
            Connection con = Conexion.conectar();
//            Connection conn = con.getConexion();
            
            JasperReport reporte = null;
            String path = "src\\Reportes\\Reporte Emascota - 100%.jasper";
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
                    
        } catch (JRException ex) {
            Logger.getLogger(frmFichaClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte1ActionPerformed

        String ID_DUI;
        int fsel = jTable1.getSelectedRow();
          String opcion = cmbNacionalidad.getSelectedItem().toString();
          String opcion1 = cmbZona.getSelectedItem().toString();
         String opcion2 = cmbTipoCliente.getSelectedItem().toString();
        if (opcion=="Seleccione una opción"||opcion1=="Seleccione una opción"||opcion2=="Seleccione una opción") {
             JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else if  (tfDUI.getText().isEmpty() || tfTelefono.getText().isEmpty()||tfDomicilio.getText().isEmpty()||tfDUeñonombre.getText().isEmpty()||tfApellidos.getText().isEmpty()||tfCorreo.getText().isEmpty()||calendar.getDatoFecha() == null){
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        if (fsel==-1) {
        JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
        }else{
         m = (DefaultTableModel)jTable1.getModel();
         ID_DUI = jTable1.getValueAt(fsel, 0).toString();
         tfDUI.setText(ID_DUI);
         //9 digitos sin contar guion
         
        ClienteDuenio obj = new ClienteDuenio();
        int DUI= Integer.parseInt(tfDUI.getText());
        obj.setID_DUI(DUI);
        System.out.println("LLega dui "+ obj.getID_DUI());
        obj.setDuenio_nombre(tfDUeñonombre.getText());
        obj.setDuenio_apellidos(tfApellidos.getText());
        String Telefono= tfTelefono.getText();
        System.out.println("LLega telefono" +Telefono );
        obj.setDuenio_telefono(Telefono);
        System.out.println("LLega telefono" + obj.getDuenio_telefono() );
        obj.setDuenio_domicilio(tfDomicilio.getText());
        obj.setDuenio_correo(tfCorreo.getText());
        System.out.println("LLega correo");
        System.out.println("Calendar "+ calendar);
        System.out.println("Calendar "+ calendar.getDatoFecha());
        //Date fecha = calendar.getDatoFecha();
        //Long f = fecha.getTime();
        //java.sql.Date;
        //obj.setFecha_e_DUI(obj.formatoDate(f));
        //obj.setFecha_e_DUI(fecha);
        //obj.setFecha_e_DUI(new java.sql.Date(f));
       
         System.out.println("valor de calendario" + calendar.getDatoFecha().getTime());
        obj.setFecha_e_DUI(new java.sql.Date(calendar.getDatoFecha().getTime()));
       
        
        controlNacionalidad nac = (controlNacionalidad)cmbNacionalidad.getSelectedItem();
        System.out.println("Item " + nac.getID_nacionalidad());
        System.out.println("Item " +cmbNacionalidad.getSelectedObjects().getClass());
        //obj.setNacionalidad(nac.getID_nacionalidad());
        obj.setNacionalidad_id(nac.getID_nacionalidad());
        obj.setNacionalidad2(nac);
        
        tipoCliente ti = (tipoCliente)cmbTipoCliente.getSelectedItem();
        System.out.println("Cliente tipo " + ti.getID_tipoCliente());
        obj.setID_tipoCliente(ti.getID_tipoCliente());
        
        controlCodigoZona coza = (controlCodigoZona)cmbZona.getSelectedItem();
        System.out.println("Codigo zona " + coza.getID_codigo());
        obj.setCodigo_zona(coza.getID_codigo());
        clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText()));
        if (obj.modificarDuenio()) {
         //if (u.modificarDuenio()) {
            JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
             ListarDuenios();
             Bit.BitacoraUpdateDuenio();
        }else{
           JOptionPane.showMessageDialog(null,"Error al modificar los datos");
           }
         }
    }//GEN-LAST:event_btnReporte1ActionPerformed
    public boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;        
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }        
    }
    
    public boolean valida(){
    String validar=tfCorreo.getText();
    if(validar.indexOf("@")==0){
    return false;
    }
    return true;
    }
    
    private void tfCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCorreoKeyTyped
   
    }//GEN-LAST:event_tfCorreoKeyTyped

    private void tfDUeñonombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDUeñonombreKeyTyped
       char valida=evt.getKeyChar();
        if (Character.isDigit(valida)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se pueden ingresar letras");
        }
    }//GEN-LAST:event_tfDUeñonombreKeyTyped

    private void tfApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidosKeyTyped
        char valida=evt.getKeyChar();
        if (Character.isDigit(valida)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se pueden ingresar letras");
        }
    }//GEN-LAST:event_tfApellidosKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnReporte1;
    private rojeru_san.componentes.RSDateChooser calendar;
    private javax.swing.JComboBox<String> cmbNacionalidad;
    private javax.swing.JComboBox<String> cmbTipoCliente;
    private javax.swing.JComboBox<String> cmbZona;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JFormattedTextField tfDUI;
    private javax.swing.JTextField tfDUeñonombre;
    private javax.swing.JTextField tfDomicilio;
    private javax.swing.JFormattedTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
