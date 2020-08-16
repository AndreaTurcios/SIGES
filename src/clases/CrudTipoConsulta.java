/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import clases.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nanos
 */
public class CrudTipoConsulta 
{
    private Connection cn;
    private Conexion conexion;
    private Integer IDTipoConsulta;
    private String TipoConsulta;
    
    Pool metodospool = new Pool();

    public Connection getcn() 
    {
        return cn;
    }

    public void setCn(Connection cn) 
    {
        this.cn = cn;
    }

    public Conexion getConexion() 
    {
        return conexion;
    }

    public void setConexion(Conexion conexion) 
    {
        this.conexion = conexion;
    }

    public Integer IDTipoConsulta() 
    {
        return IDTipoConsulta;
    }

    public void setIDTipoConsulta(Integer IDTipoConsulta) 
    {
        this.IDTipoConsulta = IDTipoConsulta;
    }

    public String getTipoConsulta() 
    {
        return TipoConsulta;
    }

    public void setTipoConsulta(String TipoConsulta) 
    {
        this.TipoConsulta = TipoConsulta;
    }
    public String toString() 
    {
        return TipoConsulta;
    }
        
    public CrudTipoConsulta() 
    {
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    public boolean GuardarTipoConsulta ()
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO Tipo_consulta (tipo_consulta) VALUES (?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, TipoConsulta);
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
            JOptionPane.showMessageDialog(null, "No se puede guardar el registro, Error en el CrudTipoConsulta.java - GuardarTipoConsulta"+a);
        }
        return resp;
    }
    
    public boolean ModificarTipoConsulta () 
    {
        boolean resp = false;
        try
        {
            String sql = "UPDATE Tipo_consulta SET tipo_consulta = ? WHERE ID_tipoConsulta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, TipoConsulta);
            cmd.setInt(2, IDTipoConsulta);
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
            JOptionPane.showMessageDialog(null, "No se puede modificar el registro, Error en el CrudTipoConsulta.java - ModificarTipoConsulta ERROR:" + a);
        }
        return resp;
    }
    
    public boolean EliminarTipoPago ()
    {
        boolean resp = false;
        try 
        {
            String sql = "DELETE * FROM Tipo_consulta WHERE ID_tipoConsulta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, IDTipoConsulta);
            if (!cmd.execute())
            {
                resp = true;
            }
            cmd.close();
            cn.close();
        } 
        catch(Exception a) 
        {
            System.out.println(a.toString());
            JOptionPane.showMessageDialog(null, "No se puede eliminar el registro, Error en el crud_tipo_pago.java - EliminarTipoConsulta ERROR:" + a);        
        }
        return resp;
    }
    
    public void EjecutarTipoConsulta(Connection cn, JTable tabla)
    {
        cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_tipoConsulta","tipo_consulta"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Tipo_consulta ORDER BY ID_tipoConsulta";
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
                for (int i = 0; i < 2; i++) 
                {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "No se puede cargar la tabla del registro, Error en el CrudTipoPago.java - EjecutarTipoConsulta ERROR:" + e);        
        }
    }   
    
    public void CargarTipoConsulta(JTable tabla) 
    {
        EjecutarTipoConsulta(cn ,tabla);
    }
}
