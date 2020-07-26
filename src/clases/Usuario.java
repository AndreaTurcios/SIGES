
        
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author estef
 */
public class Usuario {
   
    private Connection cn;
    private Integer ID_usuario;
    private String Usuario;
    private String Contrasenia;
    private String nombre_usuario;
    private String apellidos_usuario;
    private Integer telefono;
    private String domicilio;
    private String correo;
    private Integer Pregunta;
    private String Respuesta;
    private Integer Tipo_usuario;
   
    public boolean guardar() {
        boolean resp = false;
        try {String sql = "INSERT INTO Usuarios(nombre_usuario, contrasenia_usuario"
                + " nombre_empleado, empleado_apellidos, empleado_telefono "
                + "empleado_domicilio, empleado_correo, ID_tipoUsuarios)"+" VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement cmd = getCn().prepareStatement(sql);
        
        cmd.setString(1, getNombre_usuario());
        cmd.setString(2, getApellidos_usuario());
        cmd.setInt(3, getTelefono());
        cmd.setString(4, getCorreo());
        cmd.setString(5, getDomicilio());
        cmd.setString(6, getUsuario());
        cmd.setString(7, getContrasenia());
        cmd.setInt(8, getTipo_usuario());
        
        if (!cmd.execute()) {
            resp = true;
        }
        cmd.close();
            getCn().close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    
     
    
    public boolean modificar() {
         boolean resp = false;
        try {String sql = "UPDATE SET Usuarios , nombre_usuario = ?, contrasenia_usuario = = ?"
                + " nombre_empleado = ?, apellidos_usuario = ?, empleado_telefono = ? "
                + "empleado_domicilio = ?, empleado_correo = ?, ID_tipoUsuarios = ? ,ID_usuario = ?";
        
        PreparedStatement cmd = getCn().prepareStatement(sql);
       
        cmd.setString(1, getNombre_usuario());
        cmd.setString(2, getApellidos_usuario());
        cmd.setInt(3, getTelefono());
        cmd.setString(4, getCorreo());
        cmd.setString(5, getDomicilio());
        cmd.setString(6, getUsuario());
        cmd.setString(7, getContrasenia());
        cmd.setInt(8, getTipo_usuario());
        cmd.setInt(9, getID_usuario());
        
        if (!cmd.execute()) {
            resp = true;
        }
        cmd.close();
            getCn().close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    
    public boolean Consultar() {
        boolean resp = false;
        try {String sql = "SELECT ID_usuario ,nombre_usuario, contrasenia_usuario"
                + " nombre_empleado, apellidos_empleado, empleado_telefono "
                + "empleado_domicilio, empleado_correo, ID_tipoUsuarios FROM Usuarios WHERE ID_usuario = ? ";
        
        PreparedStatement cmd = getCn().prepareStatement(sql);
        cmd.setInt(1, getID_usuario());
        
        ResultSet rs = cmd.executeQuery();
        
        if (rs.next()) {
            resp = true;
            cmd.setInt(1, getID_usuario());
            cmd.setString(2, getNombre_usuario());
            cmd.setString(3, getApellidos_usuario());
            cmd.setInt(4, getTelefono());
            cmd.setString(5, getCorreo());
            cmd.setString(6, getDomicilio());
            cmd.setString(7, getUsuario());
            cmd.setString(8, getContrasenia());
            cmd.setInt(9, getTipo_usuario());
        }
        cmd.close();
            getCn().close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
        }

    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /**
     * @return the ID_usuario
     */
    public Integer getID_usuario() {
        return ID_usuario;
    }

    /**
     * @param ID_usuario the ID_usuario to set
     */
    public void setID_usuario(Integer ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Contrasenia
     */
    public String getContrasenia() {
        return Contrasenia;
    }

    /**
     * @param Contrasenia the Contrasenia to set
     */
    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    /**
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usuario the nombre_usuario to set
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * @return the apellidos_usuario
     */
    public String getApellidos_usuario() {
        return apellidos_usuario;
    }

    /**
     * @param apellidos_usuario the apellidos_usuario to set
     */
    public void setApellidos_usuario(String apellidos_usuario) {
        this.apellidos_usuario = apellidos_usuario;
    }

    /**
     * @return the telefono
     */
    public Integer getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the Pregunta
     */
    public Integer getPregunta() {
        return Pregunta;
    }

    /**
     * @param Pregunta the Pregunta to set
     */
    public void setPregunta(Integer Pregunta) {
        this.Pregunta = Pregunta;
    }

    /**
     * @return the Respuesta
     */
    public String getRespuesta() {
        return Respuesta;
    }

    /**
     * @param Respuesta the Respuesta to set
     */
    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    /**
     * @return the Tipo_usuario
     */
    public Integer getTipo_usuario() {
        return Tipo_usuario;
    }

    /**
     * @param Tipo_usuario the Tipo_usuario to set
     */
    public void setTipo_usuario(Integer Tipo_usuario) {
        this.Tipo_usuario = Tipo_usuario;
    }


     
    }

    
    
        
        
    
        

