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
import ptcproyecto.CodigoZn;

/**
 *
 * @author estef
 */
public class controlCodigoZona {
    
    private Connection Cn;
    private Integer ID_codigo;
    private int codigo_zona;
    
    public Connection getCn()
    {
        return Cn;
    }
    
    public void setCn(Connection Cn)
    {
        this.Cn = Cn;
    }
     public Integer getID_codigo()
    {
        return ID_codigo;
    }
    
    public void setID_codigo(Integer ID_codigo)
    {
        this.ID_codigo = ID_codigo;
    }
    
    
    public int getCodigo_zona() {
        return codigo_zona;
    }

    public void setCodigo_zona(int codigo_zona) {
        this.codigo_zona = codigo_zona;
    }
    public void setcodigo_zona(int codigo_zona)
    {
        this.codigo_zona = codigo_zona;
    }
    
    public boolean Guardar() {
       try {
            boolean resp = false;
            Cn = Conexion.conectar();
            String sql = "INSERT INTO codigo_zona (codigo_zona) VALUES (?) ";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            System.out.println("preparada" + cmd);
            cmd.setInt(1, codigo_zona);
            System.out.println("Cz " + codigo_zona);
            
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

    public void setcodigo_zona(String text) {
        this.codigo_zona = codigo_zona;
    }

    public boolean modificar() {
        try {
            boolean resp = false;
            Cn = Conexion.conectar();
            String sql = "UPDATE SET codigo_zona  WHERE codigo_zona ";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            System.out.println("preparada" + cmd);
            cmd.setInt(1, codigo_zona);
            System.out.println("Cz " + codigo_zona);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error modificar codigo zona " + ex);
            return false;
        }
    }

    public boolean eliminar() {
        try {
            boolean resp = false;
            Cn = Conexion.conectar();
            String sql = "DELETE FROM  codigo_zona  WHERE codigo_zona ";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            System.out.println("preparada" + cmd);
            cmd.setInt(1, codigo_zona);
            System.out.println("Cz " + codigo_zona);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error eliminar codigo zona " + ex);
            return false;
        }
    }
     public String toString() {
        String codigo= Integer.toString(codigo_zona);
        return codigo;
    }
    
}
    

