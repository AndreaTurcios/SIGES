package clases;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class usuarios {
    private Connection cn;
    private Integer ID_usuario;
    private String nombre_empleado;
    private String empleado_apellidos;
    private String empleado_telefono;
    private String empleado_correo;
    private String empleado_domicilio;
    private Integer ID_tipoUsuarios;
    private String  nombre_usuario;
    private String  contrasenia_usuario;

   
    public Connection getcn(){
        return cn;
    }
    
    public void setcn(Connection cn){
        this.cn = cn;
    }
    
    public Integer getID_usuario(){
        return ID_usuario;
    }
    
    public void setID_usuario(Integer ID_usuario){
        this.ID_usuario = ID_usuario;
    }
    
    public String getnombre_empleado(){
        return nombre_empleado;
    }
    
    public void setnombre_empleado(String nombre_empleado){
        this.nombre_empleado = nombre_empleado;
    }
    
    public String getempleado_apellidos(){
        return empleado_apellidos;
    }
    
    public void setempleado_apellidos(String empleado_apellidos){
        this.empleado_apellidos = empleado_apellidos;
    }
    
    public String getempleado_telefono(){
        return empleado_telefono;
    }
    
    public void setempleado_telefono(String empleado_telefono){
        this.empleado_telefono = empleado_telefono;
    }
    
    public String getempleado_correo(){
        return empleado_correo;
    }
    
    public void setnempleado_correo(String empleado_correo){
        this.empleado_correo = empleado_correo;
    }
    
    public String getempleado_domicilio(){
        return empleado_domicilio;
    }
    
    public void setempleado_domicilio(String empleado_domicilio){
        this.empleado_domicilio = empleado_domicilio;
    }
    
    public Integer getID_tipoUsuarios(){
        return ID_tipoUsuarios;
    }
    
    public void setID_tipoUsuarios(Integer ID_tipoUsuarios){
        this.ID_tipoUsuarios = ID_tipoUsuarios;
    }
    
    public String getnombre_usuario(){
        return nombre_usuario;
    }
    
    public void setnombre_usuario(String nombre_usuario){
        this.nombre_usuario = nombre_usuario;
    }
    
    public String getcontrasenia_usuario(){
        return contrasenia_usuario;
    }
    
    public void setcontrasenia_usuario(String contrasenia_usuario){
        this.contrasenia_usuario = contrasenia_usuario;
    }
    public String md5(String md5){
       try{
           java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
           byte[] array = md.digest(md5.getBytes());
           StringBuffer sb = new StringBuffer();  
           for (int i = 0; i < array.length; i++) {
               sb.append(Integer.toHexString((array[i] & 0xFF ) | 0x100).substring(1,3));
           }
           return sb.toString();
       }catch(java.security.NoSuchAlgorithmException c){
           
       }
    return null;
    }
    
    
    public boolean guardar() {
        boolean resp = false;
        try {String sql = "INSERT INTO Usuarios(ID_usuario, nombre_usuario, contrasenia_usuario"
                + " nombre_empleado, empleado_apPaterno, empleadoapMaterno, empleado_telefono "
                + "empleado_domicilio, empleado_correo, ID_tipoUsuarios)"+" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setInt(1, ID_usuario);
        cmd.setString(2, nombre_usuario);
        cmd.setString(3,empleado_apellidos );
        cmd.setString(4,empleado_telefono);
        cmd.setString(5, empleado_correo);
        cmd.setString(2, empleado_domicilio);
        cmd.setInt(6, ID_tipoUsuarios);
        cmd.setString(7, nombre_usuario);
        cmd.setString(8, contrasenia_usuario);
        
        if (!cmd.execute()) {
            resp = true;
        }
        cmd.close();
        cn.close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    public boolean modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Pool metodospool = new Pool();
    public void consultarCargos (JComboBox cbox_cargos) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        String SSQL = "SELECT ID_tipoUsuarios, tipo_empleado FROM Tipo_usuarios ORDER BY ID_tipoUsuarios";
        try {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_cargos.addItem("Seleccione una opcion");
            while (resultado.next()) {
                TipoUsuario tipouser = new TipoUsuario();
                tipouser.setID_TipoUsuario(resultado.getInt("ID_tipoUsuarios"));
                tipouser.setTipo_empleado(resultado.getString("tipo_empleado"));
                cbox_cargos.addItem(tipouser);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                    resultado.close();
                    resultado = null;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
         }
            }
        }
            
    public void consultarPreguntas (JComboBox cbox_preguntas) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        String SSQL = "SELECT ID_Pregunta, pregunta FROM preguntas ORDER BY ID_Pregunta";
        try {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_preguntas.addItem("Seleccione una opcion");
            while (resultado.next()) {
                controlPreguntas preguntas = new controlPreguntas();
                preguntas.setID_pregunta(resultado.getInt("ID_Pregunta"));
                preguntas.setPregunta(resultado.getString("pregunta"));
                cbox_preguntas.addItem(preguntas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                    resultado.close();
                    resultado = null;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
         }
       
         }
    }
    public void CargarUsuarios(Connection cn, JTable tabla){
        cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_usuario", "usuario","contrasenia","nombre","apellidos", "domicilio", "correo", "tipo usuario","id consulta", "id cita"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Usuarios ORDER BY ID_usuario";
        String [] filas = new String[11];
        Statement st = null;
        ResultSet rs = null;     
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next()){
                for (int i = 0; i < 10; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar "+e);
        }
    }   
    public void CargarUsuario(JTable tabla) {
        CargarUsuarios(cn ,tabla);
    }
    public void consultarUsuario(JComboBox cbox_usuario) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        String SSQL = "SELECT ID_usuario, nombre_usuario FROM Usuarios ORDER BY ID_usuario";
        try {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_usuario.addItem("Usuarios");
            while (resultado.next()) {
                Usuario user = new Usuario();
                user.setID_usuario(resultado.getInt("ID_usuario"));
                user.setUsuario(resultado.getString("nombre_usuario"));
                cbox_usuario.addItem(user);
//                JOptionPane.showMessageDialog(null, "es "+user);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                    resultado.close();
                    resultado = null;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
         }
       
         }
        
    }
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    @Override
    public String toString() {
        return nombre_empleado;
    }

    
    
    
}
