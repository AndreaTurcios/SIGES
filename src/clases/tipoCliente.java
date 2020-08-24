/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15-CW0001la
 */
public class tipoCliente {
    private Connection cn;
    private Conexion conexion;
    private Integer ID_tipoCliente;
    private String tipocliente;

    public Connection getcn() {
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

    public Integer getID_tipoCliente() {
        return ID_tipoCliente;
    }

    public void setID_tipoCliente(Integer ID_tipoCliente) {
        this.ID_tipoCliente = ID_tipoCliente;
    }

    public String gettipocliente() 
    {
        return tipocliente;
    }

    public void settipocliente(String tipocliente) 
    {
        this.tipocliente = tipocliente;
    }
    public String toString() 
    {
        return tipocliente;
    }

    public boolean GuardarTipoCliente() 
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO Tipo_cliente (tipo_cliente) VALUES (?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, tipocliente);
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch (Exception a)
        {
            System.out.println(a.toString());
            JOptionPane.showMessageDialog(null, "No se puede guardar el registro, Error en el crud_tipo_pago.java - Guardar_Tipo_Pago"+a);
        }
        return resp;
    }

    public boolean eliminar() 
    {
        boolean resp = false;
        cn = Conexion.conectar();
        try 
        {
            String sql = "DELETE FROM Tipo_cliente WHERE tipo_cliente = ?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_tipoCliente);
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch (Exception ex) 
        {
            System.out.println("Error exception es"+ex.toString());
        }
        return resp;
    }

    public boolean modificar() 
    {
        boolean resp = false;
        try 
        {
            cn = Conexion.conectar();
            String sql = "UPDATE Tipo_cliente SET tipo_cliente = ? WHERE ID_tipoCliente = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, tipocliente);
            cmd.setInt(2, ID_tipoCliente);
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            cn.close();
            return resp;
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.toString());
        }
        return resp;
    }
    
    public void EjecutarTipoCliente(Connection cn, JTable tabla)
    {
        cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_tipoCliente","tipo_cliente"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Tipo_cliente ORDER BY ID_tipoCliente";
        String [] filas = new String[2];
        Statement st = null;
        ResultSet rs = null;
        try
        {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next())
            {
                filas[0] = rs.getString("ID_tipoCliente");
                filas[1] = rs.getString("tipo_cliente");
                model.addRow(filas);
            }
            rs.close();
            tabla.setModel(model);
            cn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "No se puede cargar la tabla del registro, Error en el tipoCliente.java - EjecutarTipoCliente ERROR:" + e);        
        }
    }   
    
    public void CargarTipoCliente(JTable tabla) 
    {
        EjecutarTipoCliente(cn ,tabla);
    }
}
