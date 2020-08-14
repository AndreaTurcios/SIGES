/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author estef
 */
public class Facturas {
     private Connection Cn;
    private Conexion conexion;
    private Integer ID_factura;
    private String nombre_pagador;
    private Integer ID_detalle;
    private Integer ID_consulta;
    private Integer ID_producto;

    public Connection getCn() {
        return Cn;
    }

    public void setCn(Connection Cn) {
        this.Cn = Cn;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public Integer getID_factura() {
        return ID_factura;
    }

    public void setID_factura(Integer ID_factura) {
        this.ID_factura = ID_factura;
    }

    public String getnombre_pagador() {
        return nombre_pagador;
    }

    public void setnombre_pagador(String nombre_pagador) {
        this.nombre_pagador = nombre_pagador;
    }
    
    public Integer getID_detalle() {
        return ID_detalle;
    }

    public void setID_detalle(Integer ID_detalle) {
        this.ID_detalle = ID_detalle;
    }
    
    public Integer getID_consulta() {
        return ID_consulta;
    }

    public void setID_consulta(Integer ID_consulta) {
        this.ID_consulta = ID_consulta;
    }
    
    public Integer getID_producto() {
        return ID_producto;
    }

    public void setID_producto(Integer ID_producto) {
        this.ID_producto = ID_producto;
    }

    public boolean guardar() {
         try {
            boolean resp = false;
            Cn = conexion.conectar();
            String sql = "INSERT  INTO Factura  (nombre_pagador, ID_detalle, ID_consulta, ID_producto) VALUES (?, ?, ? ,?) ";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setString(1, nombre_pagador);
            cmd.setInt(2, ID_detalle);
            cmd.setInt(3, ID_consulta);
            cmd.setInt(4, ID_producto);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error guardar codigo zona " + ex);
            return false;
        }
    }

    public boolean modificar() {
        try {
            boolean resp = false;
            Cn = conexion.conectar();
            String sql = "UPDATE  Factura SET nombre_pagador = ?, ID_detalle = ?, ID_consulta = ?, ID_producto = ?,   WHERE ID_factura = ?";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            System.out.println("preparada" + cmd);
            cmd.setString(1, nombre_pagador);
            cmd.setInt(2, ID_detalle);
            cmd.setInt(3, ID_consulta);
            cmd.setInt(4, ID_producto);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error modificar tipo cliente " + ex);
            return false;
        }
    }
    

    public boolean eliminar() {
        try {
            boolean resp = false;
            Cn = conexion.conectar();
            String sql = "DELETE FROM  Factura  WHERE ID_factura = ? ";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            System.out.println("preparada" + cmd);
            cmd.setInt(1, ID_factura);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error eliminar tipo cliente " + ex);
            return false;
        }
    }
}
