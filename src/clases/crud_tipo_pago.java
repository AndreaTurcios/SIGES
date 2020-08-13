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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nanos
 */
public class crud_tipo_pago 
{
    private Connection cn;
    private Integer ID_tipoPago;
    private String tipo_pago;
    
    public Connection getcn()
    {
        return cn;
    }
    
    public void setcn(Connection cn)
    {
        this.cn = cn;
    }
    
    public Integer getID_tipoPago()
    {
        return ID_tipoPago;
    }
    
    public void setID_tipoPago(Integer ID_tipoPago)
    {
        this.ID_tipoPago = ID_tipoPago;
    }
     
    public String gettipo_pago()
    {
        return tipo_pago;
    }
    
    public void settipo_pago(String tipo_pago)
    {
        this.tipo_pago = tipo_pago;
    }

    public boolean Guardar_Tipo_Pago(crud_tipo_pago a) 
    {
        boolean resp = false;
        try
        {//realizando consulta insert
            String sql = "INSERT INTO Tipo_pago (tipo_pago)"+"VALUES (?)";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setString(1, a.tipo_pago);
            if (!cmd.execute()) 
            {
                resp=true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        return false;
    }

    public void Cargar_Tabla_Tipo_Pago(Connection cn, JTable tabla) 
    {
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_tipoPago", "tipo_pago"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Tipo_pago ORDER BY ID_tipoPago";
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
            JOptionPane.showMessageDialog(null, "No se puede mostrar "+e);
        }
    }
    
    public void Cargar_Tipo_Pago(JTable tabla)
    {
        Cargar_Tabla_Tipo_Pago(getcn(), tabla);
    }

    public boolean Modificar_Tipo_Pago() 
    {
        boolean resp = false;
        try
        {
            String sql="UPDATE Tipo_pago SET tipo_pago = ? WHERE ID_tipoPago = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, tipo_pago);
            if (!cmd.execute()) 
            {
                resp=true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        return resp;
        /*
        boolean Modificar = false;
        try 
        {
            String sql = "UPDATE SET Citas, ID_tipoPago  = ?, tipo_pago  = ?" ;         
            PreparedStatement cmd = cn.prepareStatement(sql);        
            cmd.setInt(1, ID_tipoPago);
            cmd.setInt(2, tipo_pago);                
            if (!cmd.execute()) 
            {
                Modificar = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception e) 
        {
            System.out.println(e.toString());
        }
        return Modificar;
        */
    }
    public boolean Eliminar_Tipo_Pago()
    {
        boolean resp=false;
        try
        {//realizando consulta insert
            String sql = "DELETE FROM Tipo_pago WHERE ID_tipoPago=?;";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setInt(1, ID_tipoPago);
            if (!cmd.execute()) 
            {
                resp=true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        return resp;
    }
    
    public boolean Consultar_Tipo_Pago()
    {
        boolean resp = false;
        try
        {
            String sql = "SELECT tipo_pago = ? FROM Tipo_pago WHERE ID_tipoPago = ?";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setInt(1, ID_tipoPago);
            ResultSet rs= cmd.executeQuery();
            if (rs.next()) 
            {
                resp=true;
                tipo_pago = rs.getString(1);
            }
            cmd.close();
            cn.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        return resp;
    }
}
