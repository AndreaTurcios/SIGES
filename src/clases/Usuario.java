package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
   
    private Connection cn;
    private Integer ID_usuario;
    private String nombre_usuario;
    private String nombre_empleado ;

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public Integer getID_consulta() {
        return ID_consulta;
    }

    public void setID_consulta(Integer ID_consulta) {
        this.ID_consulta = ID_consulta;
    }

    public Integer getID_cita() {
        return ID_cita;
    }

    public void setID_cita(Integer ID_cita) {
        this.ID_cita = ID_cita;
    }
    private String empleado_apellidos ;
    private Integer ID_consulta;
    private Integer ID_cita;

    public String getEmpleado_apellidos() {
        return empleado_apellidos;
    }

    public void setEmpleado_apellidos(String empleado_apellidos) {
        this.empleado_apellidos = empleado_apellidos;
    }
    private Integer telefono;
    private String correo;
    private String domicilio;
    private String Usuario;
    private String Contraseña;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    private Integer ID_tipoUsuario;
   
    public Connection getcn(){
        return cn;
    }
    
    public void setcn(Connection cn){
        this.cn = cn;
    }
    
    public Integer getId_usuario(){
        return ID_usuario;
    }
    
    public void setID_usuario(Integer ID_usuario){
        this.ID_usuario = ID_usuario;
    }
    
    public String getnobre_usuario(){
        return nombre_usuario;
    }
    
    public void setnombre_usuario(String nombre_usuario){
        this.nombre_usuario = nombre_usuario;
    }

    
    public Integer telefono(){
        return telefono;
    }
    
    public void settelefono( Integer telefono){
        this.telefono = telefono;
    }
    
    public String correo(){
        return correo;
    }
    
    public void setcorreo(String correo){
        this.correo = correo;
    }
    
    public  String domicilio(){
        return domicilio;
    }
    
    public void setdomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    public String Usuario(){
        return Usuario;
    }
    
    public void setUsuario(String Usuario){
        this.Usuario = Usuario;
    }
    
     public String Contraseña(){
        return Contraseña;
    }
    
    public void setContraseña(String Contraseña){
        this.Contraseña = Contraseña;
    }
    
    public String Rcontraseña(){
        return correo;
    }
    
    public Integer ID_tipoUsuario(){
        return ID_tipoUsuario;
    }
    
    public void setID_tipoUsuario(Integer ID_tipoUsuario){
        this.ID_tipoUsuario = ID_tipoUsuario;
    }
    
    public Usuario() {
        Conexion u = new Conexion();
        cn = u.conectar();
    }
    
    public boolean modificar() {
         boolean resp = false;
        try {String sql = "UPDATE SET Usuarios , nombre_usuario = ?, contrasenia_usuario = = ?"
                + " nombre_empleado = ?, empleado_apellidos = ?,"
                + "empleado_domicilio = ?, empleado_correo = ?, ID_tipoUsuarios = ? ,ID_usuario = ?";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
       
        cmd.setInt(1, ID_usuario);
        cmd.setString(2, nombre_usuario);
        cmd.setString(3,empleado_apellidos );
        cmd.setInt(4,telefono);
        cmd.setString(5, correo);
        cmd.setString(2, domicilio);
        cmd.setString(6, Usuario);
        cmd.setString(7, Contraseña);
        cmd.setInt(8, ID_tipoUsuario);
        
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

      public Usuario ConsultarUser() {
        boolean resp = false;
        Usuario u = new Usuario();
        String encriptada = md5(Contraseña);
        try {String sql = "SELECT ID_usuario, nombre_usuario, contrasenia_usuario"
                + " nombre_empleado, empleado_apellidos,"
                + "empleado_domicilio, empleado_correo, ID_tipoUsuarios "
                +"FROM Usuarios where nombre_usuario = ? and contrasenia_usuario = ? ";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        cmd.setString(1, nombre_usuario);
        cmd.setString(1, encriptada);
        
        ResultSet rs = cmd.executeQuery();
        
        if (rs.next()) {
            resp = true;
             //ID_usuario = ;
             u.setID_usuario(rs.getInt(1));
             u.setNombre_usuario(rs.getString(1));
             //nombre_usuario = ;
             //empleado_apellidos = rs.getString(2);
             //u.setEmpleado_apellidos();
             //correo = rs.getString(3);
             //domicilio = rs.getString(4);
             //Usuario = rs.getString(5);
             u.setContraseña(rs.getString(3));
             //Contraseña = ;
             //ID_tipoUsuario = rs.getInt(7);
        }
        cmd.close();
        cn.close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return u;
        }
    
    public boolean Consultar() {
        boolean resp = false;
        try {String sql = "SELECT ID_usuario, nombre_usuario, contrasenia_usuario"
                + " nombre_empleado, empleado_apellidos,"
                + "empleado_domicilio, empleado_correo, ID_tipoUsuarios FROM Usuarios WHERE ID_usuario = ? ";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        cmd.setInt(1, ID_usuario);
        
        ResultSet rs = cmd.executeQuery();
        
        if (rs.next()) {
            resp = true;
             ID_usuario = rs.getInt(1);
             nombre_usuario = rs.getString(1);
             empleado_apellidos = rs.getString(2);
             correo = rs.getString(3);
             domicilio = rs.getString(4);
             Usuario = rs.getString(5);
             Contraseña = rs.getString(6);
             ID_tipoUsuario = rs.getInt(7);
        }
        cmd.close();
        cn.close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
        }
        public boolean guardar() {
        boolean resp = false;
        try {String sql = "INSERT INTO Usuarios(nombre_usuario, contrasenia_usuario,"
                + " nombre_empleado, empleado_apellidos,"
                + "empleado_domicilio, empleado_correo, ID_tipoUsuarios)"+" VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setString(1, nombre_usuario);
        cmd.setString(2, Contraseña);
        cmd.setString(3, nombre_empleado);
        cmd.setString(4, empleado_apellidos);
        cmd.setString(5, domicilio);
        cmd.setString(6, correo);
        cmd.setInt(7, ID_tipoUsuario);
        
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
        public boolean guardarP() {
        boolean resp = false;
        try {String sql = "INSERT INTO Usuarios(nombre_usuario, contrasenia_usuario,"
                + " nombre_empleado, empleado_apellidos,"
                + "empleado_domicilio, empleado_correo, ID_tipoUsuarios)"+" VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setString(1, nombre_usuario);
        cmd.setString(2, Contraseña);
        cmd.setString(3, nombre_empleado);
        cmd.setString(4, empleado_apellidos);
        cmd.setString(5, domicilio);
        cmd.setString(6, correo);
        cmd.setInt(7, ID_tipoUsuario);
        
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
    @Override
    public String toString() {
        return Usuario;
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
    
    }

    
    
        
        
    
        

