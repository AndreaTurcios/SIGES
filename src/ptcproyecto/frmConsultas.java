package ptcproyecto;

import clases.*;
import java.awt.Dimension;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.Time;
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
 * @author 15-CW0001la
 */
public class frmConsultas extends javax.swing.JInternalFrame {
    DefaultTableModel m;
    /**
     * Creates new form frmConsultas
     */
    public frmConsultas() {
        initComponents();
        this.setPreferredSize(new Dimension(760,714));
        listarConsultas();
        LlenarComboBox();
        jTextField1.setVisible(false);
        Login ventana = new Login();
        jLabel1.setText(ventana.ID.toString());
        System.out.println(ventana.ID);
        jLabel1.setVisible(false);
    }
    public void listarConsultas(){
        MtoConsulta obj = new MtoConsulta();
        obj.CargarConsultas(tbConsultas);
    }
    
    public void LlenarComboBox(){
        MtoConsulta obj = new MtoConsulta();
        obj.consultarTipoConsulta(CmbTipo_Consulta);
        obj.consultarDUI(jcbDUI);
        obj.consultarEstado(JCBXEstado);
        obj.consultarMascota(jcbMascota);
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
                    new Nacionalidad().setVisible(true);
                }
            }
        );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        calendar = new rojeru_san.componentes.RSDateChooser();
        jLabel9 = new javax.swing.JLabel();
        CmbTipo_Consulta = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcbDUI = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        JCBXEstado = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jSHora = new javax.swing.JSpinner();
        jSMinuto = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jcbMascota = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        JBGuardar = new javax.swing.JButton();
        JBModificar = new javax.swing.JButton();
        JBImprimir = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(642, 632));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(1, 163, 201));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consultas");

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
        BtnCerrar.setToolTipText("");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(644, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Fecha:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Seleccione el tipo de consulta:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("DUI del solicitante de la consulta:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Seleccione el estado de la consulta:");

        jSHora.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));

        jSMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 5));

        jLabel10.setText(":");

        jLabel6.setText("Hora:");

        jLabel11.setText("Minuto:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Nombre de la mascota:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jSHora, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbTipo_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JCBXEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jcbDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jcbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CmbTipo_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCBXEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcbDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jSMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        JBGuardar.setBackground(new java.awt.Color(204, 204, 204));
        JBGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBGuardar.setText("Guardar");
        JBGuardar.setPreferredSize(new java.awt.Dimension(90, 60));
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBModificar.setBackground(new java.awt.Color(204, 204, 204));
        JBModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBModificar.setText("Modificar");
        JBModificar.setPreferredSize(new java.awt.Dimension(90, 60));
        JBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarActionPerformed(evt);
            }
        });

        JBImprimir.setBackground(new java.awt.Color(204, 204, 204));
        JBImprimir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBImprimir.setText("Imprimir");
        JBImprimir.setPreferredSize(new java.awt.Dimension(90, 60));
        JBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImprimirActionPerformed(evt);
            }
        });

        JBEliminar.setBackground(new java.awt.Color(204, 204, 204));
        JBEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBEliminar.setText("Eliminar");
        JBEliminar.setPreferredSize(new java.awt.Dimension(90, 60));
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(JBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbConsultasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbConsultas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(249, 249, 249)
                .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        //Tomando los datos del formulario y pasandolos a los atributos de la clase
        if (calendar.getDatoFecha() == null) {
           JOptionPane.showMessageDialog(this,"Favor de no dejar opciones sin seleccionar  ");            
        }    
        else  {
                
                int jcb1 = CmbTipo_Consulta.getSelectedIndex();
                int jcb2 = jcbDUI.getSelectedIndex();
                int jcb3 = JCBXEstado.getSelectedIndex();
                int jcb4 = jcbMascota.getSelectedIndex();

                    if (jcb1==0||jcb2==0||jcb3==0||jcb4==0) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una entidad federativa", "Verificar", JOptionPane.WARNING_MESSAGE);
                    }

                    else {
                        MtoConsulta obj = new MtoConsulta();
                        int hora = (Integer)jSHora.getValue();
                        int minuto = (Integer)jSMinuto.getValue();
                //       String turno = (String)jComboBox1.getSelectedItem();
                         String fin = hora + ":" + minuto+":00";
                         Time.valueOf(fin);
                //       DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
                //       Date d = dateFormat.parse(fin);

                        obj.setHora(Time.valueOf(fin));
                        int Tipo = CmbTipo_Consulta.getSelectedIndex(); 
                        obj.setTipo(Tipo);
                        String DUI = jcbDUI.getSelectedItem().toString();
                        obj.setDUI(Integer.parseInt(DUI));
                        int Estado = JCBXEstado.getSelectedIndex(); 
                        obj.setEstado(Estado);
                        Integer Mascota = jcbMascota.getSelectedIndex();
                        obj.setMascota(Mascota);

                        obj.setFecha(new java.sql.Date(calendar.getDatoFecha().getTime())); 
                        
                        clases.Bitacora Bit = new clases.Bitacora();
                        Bit.setID(Integer.parseInt(jLabel1.getText()));  
                        if (obj.guardar()) {
                           JOptionPane.showMessageDialog(this,"Datos ingresados correctamente"); 
                           listarConsultas();
                           Bit.BitacoraCreateConsulta();
                           }else{ 
                           JOptionPane.showMessageDialog(this,"Error al guardar datos"); 
                        }     
                        

                    }
                
                
        }           
                       
         
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImprimirActionPerformed
        try 
        {
            java.sql.Connection con = Conexion.conectar();
            JasperReport reporte = null;
            String path = "src\\Reportes\\Reporte-Consultas-SIGES.jasper";
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
        /*
        String path = "";
        try
        {
            path = getClass().getResource("reportes/Reporte_Base_SIGES.jasper").getPath();
            path = URLDecoder.decode(path, "UTF-8");
            Connection cn = new conexion().conectar();
            Map parametros = new HashMap();
            JasperReport reporte = (JasperReport)JRLoader.loadObject(path);
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametros, cn);
            JasperViewer visor = new JasperViewer(imprimir,false);
            visor.setTitle("Reporte Consultas");
            visor.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error durante el proceso de presentacion del reporte. Error: " + e);
            System.out.println(e.getMessage());
        }
        */
    }//GEN-LAST:event_JBImprimirActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed
                String ID_Consulta;
                int fsel = tbConsultas.getSelectedRow();
        
                if (fsel==-1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
                }else{
                    int jcb1 = CmbTipo_Consulta.getSelectedIndex();
                    int jcb2 = jcbDUI.getSelectedIndex();
                    int jcb3 = JCBXEstado.getSelectedIndex();
                    int jcb4 = jcbMascota.getSelectedIndex();

                    if (jcb1==0||jcb2==0||jcb3==0||jcb4==0) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una entidad federativa", "Verificar", JOptionPane.WARNING_MESSAGE);
                    }

                    else {
                    if (calendar.getDatoFecha() == null) {
                    JOptionPane.showMessageDialog(this,"Favor de no dejar opciones sin seleccionar  ");            
                    }    
                    else  {
                m = (DefaultTableModel)tbConsultas.getModel();
                ID_Consulta = tbConsultas.getValueAt(fsel, 0).toString();
                
                MtoConsulta obj = new MtoConsulta();
                 int hora = (Integer)jSHora.getValue();
                        int minuto = (Integer)jSMinuto.getValue();
                //       String turno = (String)jComboBox1.getSelectedItem();
                         String fin = hora + ":" + minuto+":00";
                         Time.valueOf(fin);
                //       DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
                //       Date d = dateFormat.parse(fin);

                obj.setHora(Time.valueOf(fin));
                int Tipo = CmbTipo_Consulta.getSelectedIndex(); 
                obj.setTipo(Tipo);
                String DUI = jcbDUI.getSelectedItem().toString();
                obj.setDUI(Integer.parseInt(DUI));
                int Estado = JCBXEstado.getSelectedIndex();
                obj.setEstado(Estado);
                obj.setID(Integer.parseInt(ID_Consulta));
                Integer Mascota = jcbMascota.getSelectedIndex();
                obj.setMascota(Mascota);
                obj.setFecha(new java.sql.Date(calendar.getDatoFecha().getTime())); 
                
                clases.Bitacora Bit = new clases.Bitacora();
                Bit.setID(Integer.parseInt(jLabel1.getText())); 
                
                if (obj.modificar()) {
                   JOptionPane.showMessageDialog(this,"Datos modificados correctamente"); 
                   listarConsultas();
                   Bit.BitacoraUpdateConsulta();
                   }else{ 
                   JOptionPane.showMessageDialog(this,"Error al modificar datos"); 
                }     
                }
                }
                }
                
    }//GEN-LAST:event_JBModificarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        MtoConsulta obj = new MtoConsulta();
        int fsel = tbConsultas.getSelectedRow();
        String ID;
        if (fsel==-1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
            m = (DefaultTableModel)tbConsultas.getModel();
            ID = tbConsultas.getValueAt(fsel, 0).toString();
            jTextField1.setText(ID);
            
            int i = Integer.parseInt(jTextField1.getText());
            obj.setID(i);
            
            clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText())); 
            
            int eliminar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?",
            "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);    
            if (eliminar == 0) {
                if (obj.eliminar()) {
                    JOptionPane.showMessageDialog(this, "Datos eliminados");
                    listarConsultas();
                    Bit.BitacoraDeleteConsulta();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error al eliminar datos");
                }
            }
                
            

        }
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void tbConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsultasMouseClicked
        int fila = tbConsultas.getSelectedRow();
        JCBXEstado.setSelectedItem(String.valueOf(tbConsultas.getValueAt(fila, 4)));
        jcbDUI.setSelectedItem(String.valueOf(tbConsultas.getValueAt(fila, 5)));
        CmbTipo_Consulta.setSelectedItem(String.valueOf(tbConsultas.getValueAt(fila, 3)));
        jcbMascota.setSelectedItem(String.valueOf(tbConsultas.getValueAt(fila, 6)));
        JBModificar.setEnabled(true);
        JBEliminar.setEnabled(true);
    }//GEN-LAST:event_tbConsultasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    public javax.swing.JComboBox<String> CmbTipo_Consulta;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBImprimir;
    private javax.swing.JButton JBModificar;
    private javax.swing.JComboBox<String> JCBXEstado;
    private rojeru_san.componentes.RSDateChooser calendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSHora;
    private javax.swing.JSpinner jSMinuto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcbDUI;
    private javax.swing.JComboBox<String> jcbMascota;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tbConsultas;
    // End of variables declaration//GEN-END:variables
}
