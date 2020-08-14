/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 15-CW0001la
 */
public class tipoCliente {
    private Connection Cn;
    private Conexion conexion;
    private Integer ID_tipoCliente;
    private String tipo_cliente;

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

    public Integer getID_tipoCliente() {
        return ID_tipoCliente;
    }

    public void setID_tipoCliente(Integer ID_tipoCliente) {
        this.ID_tipoCliente = ID_tipoCliente;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }
    public String toString() {
        return tipo_cliente;
    }

    public void settipo_cliente(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean Guardar() {
        try {
            boolean resp = false;
            Cn = conexion.conectar();
            String sql = "INSERT INTO Tipo_cliente (tipo_cliente) VALUES (?) ";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            System.out.println("preparada" + cmd);
            cmd.setString(1, tipo_cliente);
            System.out.println("tp " + tipo_cliente);
            
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

    public boolean eliminar() {
         try {
            boolean resp = false;
            Cn = conexion.conectar();
            String sql = "DELETE FROM  Tipo_cliente  WHERE tipo_cliente ";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            System.out.println("preparada" + cmd);
            cmd.setString(1, tipo_cliente);
            System.out.println("tp " + tipo_cliente);
            
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

    public boolean modificar() {
       try {
            boolean resp = false;
            Cn = conexion.conectar();
            String sql = "UPDATE SET Tipo_cliente  WHERE tipo_cliente ";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            System.out.println("preparada" + cmd);
            cmd.setString(1, tipo_cliente);
            System.out.println("tp " + tipo_cliente);
            
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
}
