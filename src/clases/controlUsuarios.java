/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;

/**
 *
 * @author 15-CW0001la
 */
public class controlUsuarios {
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

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Integer getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(Integer ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getEmpleado_apellidos() {
        return empleado_apellidos;
    }

    public void setEmpleado_apellidos(String empleado_apellidos) {
        this.empleado_apellidos = empleado_apellidos;
    }

    public String getEmpleado_telefono() {
        return empleado_telefono;
    }

    public void setEmpleado_telefono(String empleado_telefono) {
        this.empleado_telefono = empleado_telefono;
    }

    public String getEmpleado_correo() {
        return empleado_correo;
    }

    public void setEmpleado_correo(String empleado_correo) {
        this.empleado_correo = empleado_correo;
    }

    public String getEmpleado_domicilio() {
        return empleado_domicilio;
    }

    public void setEmpleado_domicilio(String empleado_domicilio) {
        this.empleado_domicilio = empleado_domicilio;
    }

    public Integer getID_tipoUsuarios() {
        return ID_tipoUsuarios;
    }

    public void setID_tipoUsuarios(Integer ID_tipoUsuarios) {
        this.ID_tipoUsuarios = ID_tipoUsuarios;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia_usuario() {
        return contrasenia_usuario;
    }

    public void setContrasenia_usuario(String contrasenia_usuario) {
        this.contrasenia_usuario = contrasenia_usuario;
    }
    private Connection Con;
    
    /*public controlUsuario() {
    conexion o = new conexion();
    Con = o.conectar();
    }*/
}
