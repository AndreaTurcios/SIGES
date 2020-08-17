/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Estrada
 */
public class MtoUsuarios {
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
     * @return the nombre_empleado
     */
    public String getNombre_empleado() {
        return nombre_empleado;
    }

    /**
     * @param nombre_empleado the nombre_empleado to set
     */
    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    /**
     * @return the empleado_apellidos
     */
    public String getEmpleado_apellidos() {
        return empleado_apellidos;
    }

    /**
     * @param empleado_apellidos the empleado_apellidos to set
     */
    public void setEmpleado_apellidos(String empleado_apellidos) {
        this.empleado_apellidos = empleado_apellidos;
    }

    /**
     * @return the empleado_telefono
     */
    public String getEmpleado_telefono() {
        return empleado_telefono;
    }

    /**
     * @param empleado_telefono the empleado_telefono to set
     */
    public void setEmpleado_telefono(String empleado_telefono) {
        this.empleado_telefono = empleado_telefono;
    }

    /**
     * @return the empleado_correo
     */
    public String getEmpleado_correo() {
        return empleado_correo;
    }

    /**
     * @param empleado_correo the empleado_correo to set
     */
    public void setEmpleado_correo(String empleado_correo) {
        this.empleado_correo = empleado_correo;
    }

    /**
     * @return the empleado_domicilio
     */
    public String getEmpleado_domicilio() {
        return empleado_domicilio;
    }

    /**
     * @param empleado_domicilio the empleado_domicilio to set
     */
    public void setEmpleado_domicilio(String empleado_domicilio) {
        this.empleado_domicilio = empleado_domicilio;
    }

    /**
     * @return the ID_tipoUsuarios
     */
    public Integer getID_tipoUsuarios() {
        return ID_tipoUsuarios;
    }

    /**
     * @param ID_tipoUsuarios the ID_tipoUsuarios to set
     */
    public void setID_tipoUsuarios(Integer ID_tipoUsuarios) {
        this.ID_tipoUsuarios = ID_tipoUsuarios;
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
     * @return the contrasenia_usuario
     */
    public String getContrasenia_usuario() {
        return contrasenia_usuario;
    }

    /**
     * @param contrasenia_usuario the contrasenia_usuario to set
     */
    public void setContrasenia_usuario(String contrasenia_usuario) {
        this.contrasenia_usuario = contrasenia_usuario;
    }
    
    public MtoUsuarios() {
        //estableciendo la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }
    
    
    public boolean guardar() {
        boolean resp = false;
//        String encriptada = md5(contrasenia_usuario);
        try {String sql = "INSERT INTO Usuarios (nombre_usuario, contrasenia_usuario, nombre_empleado, empleado_apellidos, empleado_domicilio, empleado_correo, ID_tipoUsuarios)"+" VALUES (?, ?, ?, ?, ?, ?, ? )";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setString(1, nombre_usuario);
        cmd.setString(2, contrasenia_usuario);
        cmd.setString(3,  nombre_empleado);
        cmd.setString(4,empleado_apellidos );
        cmd.setString(5, empleado_domicilio);
        cmd.setString(6, empleado_correo);
        cmd.setInt(7, ID_tipoUsuarios);
        
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
    public boolean modificar(){
        boolean resp = false;
        try{
            //Realizar consulta UPDATE 
            String sql = "UPDATE Usuarios nombre_usuario = ?, contrasenia_usuario = ?, nombre_empleado = ?, empleado_apellidos = ?, empleado_domicilio = ?, empleado_correo = ?, ID_tipoUsuarios = ? WHERE ID_usuario = ?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros como esta en la clase 
            cmd.setString(1, nombre_usuario);
            cmd.setString(2, contrasenia_usuario);
            cmd.setString(3,  nombre_empleado);
            cmd.setString(4,empleado_apellidos );
            cmd.setString(5, empleado_domicilio);
            cmd.setString(6, empleado_correo);
            cmd.setInt(7, ID_tipoUsuarios);
            cmd.setInt(8, ID_usuario);
            //Si da error devuelve 1, caso contrario 0
            //Tomar en cuenta el "!" de negacion
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();           
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }
}
