package ptcproyecto;

import clases.*;
import clases.Usuario;
import clases.Conexion;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
 * @author estef
 */
public class frmUsuarios extends javax.swing.JInternalFrame {
DefaultTableModel m;
    public frmUsuarios() {
        initComponents();
        ListarUsuarios();
        CargarCargos();
        Login ventana = new Login();
        jLabel1.setText(ventana.ID.toString());
        System.out.println(ventana.ID);
        jLabel1.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jtfContraseña = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        JCBcargoE = new javax.swing.JComboBox<>();
        jtfEmail = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtbModificar = new javax.swing.JToggleButton();
        jtbConsultar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtbGuardar = new javax.swing.JToggleButton();
        jtbImprimir = new javax.swing.JToggleButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnCerrar1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

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

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel39.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel39.setText("Usuario:");
        jLabel39.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel40.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel40.setText("Contraseña:");
        jLabel40.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel41.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel41.setText("Cargo del empleado:");
        jLabel41.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40)
                            .addComponent(JCBcargoE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel39)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCBcargoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jtfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidojTextField4ActionPerformed(evt);
            }
        });

        jtbModificar.setBackground(new java.awt.Color(204, 204, 204));
        jtbModificar.setText("Modificar");
        jtbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbModificarActionPerformed(evt);
            }
        });

        jtbConsultar.setBackground(new java.awt.Color(204, 204, 204));
        jtbConsultar.setText("Consultar");
        jtbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbConsultarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jtbGuardar.setBackground(new java.awt.Color(204, 204, 204));
        jtbGuardar.setText("Guardar");
        jtbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbGuardarActionPerformed(evt);
            }
        });

        jtbImprimir.setBackground(new java.awt.Color(204, 204, 204));
        jtbImprimir.setText("Imprimir");
        jtbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel33)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jtfEmail)
                            .addComponent(jtfApellido)
                            .addComponent(jtfDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jtbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtbImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(1, 1, 1)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jtbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
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
        jLabel13.setText("Usuarios");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(279, 279, 279)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void ListarUsuarios(){
        usuarios obj = new usuarios();
        obj.CargarUsuario(jTable1);
    }
    
    public void Limpiar(){
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfEmail.setText("");
        jtfDireccion.setText("");
        jtfUsuario.setText("");
        jtfContraseña.setText("");
        JCBcargoE.setSelectedIndex(0);
    }
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
    
    public void CargarCargos(){
        usuarios obj = new usuarios();
        obj.consultarCargos(JCBcargoE);
    }
    private void jtfNombrejTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombrejTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombrejTextField4ActionPerformed

    private void jtfApellidojTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidojTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidojTextField4ActionPerformed

    private void jtbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbGuardarActionPerformed
        
        if (jtfNombre.getText().isEmpty() || jtfApellido.getText().isEmpty() || jtfEmail.getText().isEmpty() || jtfDireccion.getText().isEmpty()|| jtfUsuario.getText().isEmpty() || jtfContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }else   {   
            String cor = jtfEmail.getText(); 
            if (isEmail(cor)) {
                MtoUsuarios obj = new MtoUsuarios();
                clases.Bitacora Bit = new clases.Bitacora();
                Bit.setID(Integer.parseInt(jLabel1.getText()));
                obj.setNombre_empleado(jtfNombre.getText());
                obj.setEmpleado_apellidos(jtfApellido.getText());
                obj.setEmpleado_correo(jtfEmail.getText());
                obj.setEmpleado_domicilio(jtfDireccion.getText());
                obj.setNombre_usuario(jtfUsuario.getText());
                usuarios u = new usuarios();
                String password = jtfContraseña.getText();
                obj.setContrasenia_usuario(u.md5(password));
                int Tipo = JCBcargoE.getSelectedIndex();
                obj.setID_tipoUsuarios(Tipo);
                if (obj.guardar()) {
                    JOptionPane.showMessageDialog(this, "Los datos han sido guardados");
                    ListarUsuarios();
                    Limpiar();
                    Bit.BitacoraCreateUsuario();
                }else{
                    JOptionPane.showMessageDialog(this, "Error al guardar los datos");
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Favor de ingresar un correo valido.");
            }
        }
            
        
        
    }//GEN-LAST:event_jtbGuardarActionPerformed

    private void jtbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbModificarActionPerformed
        
        String ID;
            int fsel = jTable1.getSelectedRow();
             if (fsel==-1) {
                 
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", 
            JOptionPane.WARNING_MESSAGE);
            }else{
             m = (DefaultTableModel)jTable1.getModel();
            ID = jTable1.getValueAt(fsel, 0).toString();
            MtoUsuarios obj = new MtoUsuarios();
            clases.Bitacora Bit = new clases.Bitacora();
        
            if (jtfNombre.getText().isEmpty() || jtfApellido.getText().isEmpty() || jtfEmail.getText().isEmpty() || jtfDireccion.getText().isEmpty()|| jtfUsuario.getText().isEmpty() || jtfContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
            }else   {
                String cor = jtfEmail.getText(); 
            if (isEmail(cor)) {
            Bit.setID(Integer.parseInt(jLabel1.getText()));
            obj.setID_usuario(Integer.parseInt(ID));
            obj.setNombre_empleado(jtfNombre.getText());
            obj.setEmpleado_apellidos(jtfApellido.getText());
            obj.setEmpleado_correo(jtfEmail.getText());
            obj.setEmpleado_domicilio(jtfDireccion.getText());
            obj.setNombre_usuario(jtfUsuario.getText());
            usuarios u = new usuarios();
            String password = jtfContraseña.getText();
            obj.setContrasenia_usuario(u.md5(password));
            int Tipo = JCBcargoE.getSelectedIndex();
                System.out.println(Tipo);
            obj.setID_tipoUsuarios(Tipo);
            if (obj.modificar()) {
                JOptionPane.showMessageDialog(this, "Los datos han sido modificados");
                ListarUsuarios();
                Limpiar();
                Bit.BitacoraUpdateUsuario();
            }else{
                JOptionPane.showMessageDialog(this, "Error al modificar los datos");
            }
            }else {
                JOptionPane.showMessageDialog(this, "Favor de ingresar un correo valido.");
            }
            
            }
            }
        
    }//GEN-LAST:event_jtbModificarActionPerformed

    private void jtbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbConsultarActionPerformed
        String ID;
            int fsel = jTable1.getSelectedRow();
             if (fsel==-1) {

            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", 
            JOptionPane.WARNING_MESSAGE);
            }else{
             m = (DefaultTableModel)jTable1.getModel();
            ID = jTable1.getValueAt(fsel, 0).toString();
            clases.Bitacora Bit = new clases.Bitacora();
            MtoUsuarios obj = new MtoUsuarios();
            Bit.setID(Integer.parseInt(jLabel1.getText()));
            obj.setID_usuario(Integer.parseInt(ID));
            if (obj.consultar()) {
                jtfNombre.setText(obj.getNombre_empleado());
                jtfApellido.setText(obj.getEmpleado_apellidos());
                jtfDireccion.setText(obj.getEmpleado_domicilio());
                jtfUsuario.setText(obj.getNombre_usuario());
                jtfEmail.setText(obj.getEmpleado_correo());
                jtfContraseña.setText(obj.getContrasenia_usuario());
                jtfContraseña.setEnabled(false);
                JCBcargoE.setSelectedIndex(obj.getID_tipoUsuarios());
                JOptionPane.showMessageDialog(this, "Datos Consultados exitosamente");
                Bit.BitacoraReadUsuario();
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al consultar datos");
                
            }
            
            }
    }//GEN-LAST:event_jtbConsultarActionPerformed

    private void JBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImprimirActionPerformed
        try 
        {
            java.sql.Connection con = Conexion.conectar();
            JasperReport reporte = null;
            String path = "src\\Reportes\\Reporte-empleados(D).jasper";
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

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void jtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefonoActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void jtbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbImprimirActionPerformed
                try {
            Connection con = Conexion.conectar();
//            Connection conn = con.getConexion();
            
            JasperReport reporte = null;
            String path = "src\\Reportes\\R.t_empleado.jasper";
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
                    
        } catch (JRException ex) {
            Logger.getLogger(frmFichaClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtbImprimirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        
        JCBcargoE.setSelectedItem(String.valueOf(jTable1.getValueAt(fila, 7)));
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBcargoE;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jtbConsultar;
    private javax.swing.JToggleButton jtbGuardar;
    private javax.swing.JToggleButton jtbImprimir;
    private javax.swing.JToggleButton jtbModificar;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfContraseña;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfUsuario;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
