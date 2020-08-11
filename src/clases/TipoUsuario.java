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
public class TipoUsuario {
    private Connection cn;
    private Conexion conexion;
    private Integer ID_TipoUsuario;
    private String tipo_empleado;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public Integer getID_TipoUsuario() {
        return ID_TipoUsuario;
    }

    public void setID_TipoUsuario(Integer ID_usuario) {
        this.ID_TipoUsuario = ID_usuario;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }
    public String toString() {
        return tipo_empleado;
    }
}
