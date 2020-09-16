/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Conexion;
import java.sql.Connection;
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
 * @author estef
 */
public class Facturas 
{
    private Connection Cn;
    private Conexion conexion;
    private Integer ID_factura;
    private String nombre_pagador;
    private Integer ID_detalle;
    private Integer ID_consulta;
    private Integer ID_producto;
    private Integer ID_tipoPago;
    private Integer ID_DUI;

    public Connection getCn() 
    {
        return Cn;
    }

    public void setCn(Connection Cn) 
    {
        this.Cn = Cn;
    }

    public Conexion getconexion() 
    {
        return conexion;
    }

    public void setconexion(Conexion conexion) 
    {
        this.conexion = conexion;
    }

    public Integer getID_factura() 
    {
        return ID_factura;
    }

    public void setID_factura(Integer ID_factura) 
    {
        this.ID_factura = ID_factura;
    }

    public String getnombre_pagador() 
    {
        return nombre_pagador;
    }

    public void setnombre_pagador(String nombre_pagador) 
    {
        this.nombre_pagador = nombre_pagador;
    }
    
    public Integer getID_detalle() 
    {
        return ID_detalle;
    }

    public void setID_detalle(Integer ID_detalle) 
    {
        this.ID_detalle = ID_detalle;
    }
    
    public Integer getID_consulta() 
    {
        return ID_consulta;
    }

    public void setID_consulta(Integer ID_consulta) 
    {
        this.ID_consulta = ID_consulta;
    }
    
    public Integer getID_producto() 
    {
        return ID_producto;
    }

    public void setID_producto(Integer ID_producto) 
    {
        this.ID_producto = ID_producto;
    }
    
    public Integer getID_tipoPago() 
    {
        return ID_tipoPago;
    }

    public void setID_tipoPago(Integer ID_tipoPago) 
    {
        this.ID_tipoPago = ID_tipoPago;
    }
    
    public Integer getID_DUI() 
    {
        return ID_DUI;
    }

    public void setID_DUI(Integer ID_tipoPago) 
    {
        this.ID_DUI = ID_DUI;
    }
    
    
    
    public Pool getMetodospool()
    {
        return metodospool;
    }
    
    private void  setMetodospool(Pool metodospool )
    {
       this.metodospool = metodospool;
    }
    
    Pool metodospool = new Pool();
    
    public boolean Guardar()
    {
        try 
        {
            boolean resp = false;
            Cn = Conexion.conectar();
            String sql = "INSERT INTO Factura (nombre_pagador, ID_detalle, ID_consulta, ID_producto ,ID_tipoPago)"+"VALUES(?, ?, ?, ?, ?)";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setString(1, nombre_pagador);
            cmd.setInt(2, ID_detalle);
            cmd.setInt(3, ID_consulta);
            cmd.setInt(4, ID_producto);
            cmd.setInt(5, ID_tipoPago);
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } 
        catch (SQLException ex) 
        {
            System.err.println("Error guardar Factura " + ex);
            return false;
        }
    }
    
    public boolean modificar() 
    {
        try 
        {
            boolean resp = false;
            Cn = Conexion.conectar();
            String sql = "UPDATE Factura SET nombre_pagador = ?, ID_detalle = ?, ID_consulta = ?, ID_producto = ? WHERE ID_factura = ?";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setString(1, nombre_pagador);
            cmd.setInt(2, ID_detalle);
            cmd.setInt(3, ID_consulta);
            cmd.setInt(4, ID_producto);
            cmd.setInt(5, ID_factura);            
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } 
        catch (SQLException ex) 
        {
            System.err.println("Error guardar tipo empleado " + ex);
            return false;
        }
    }
    
    public boolean Eliminar() 
    {
        boolean resp = false;
        Cn = Conexion.conectar();
        try 
        {//realizando consulta insert
            String sql = "DELETE FROM Factura WHERE ID_factura =?;";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setInt(1, ID_factura);
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            Cn.close();
        } 
        catch (Exception ex) 
        {
            System.out.println("Error exception es"+ex.toString());
        }
        return resp;
    }   
    
    public void listarFactura(Connection Cn, JTable tabla)
    {
        Cn = conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_factura"," nombre_pagador", "ID_detalle", "ID_consulta", "ID_producto"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Factura ORDER BY ID_factura";
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        try
        {
            st = Cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next())
            {
                for (int i = 0; i < 5; i++) 
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
    public void CargarF (JTable tabla) {
        listarFactura(Cn ,tabla);
    }
    
    public void consultarProductos(JComboBox cbox_producto) 
    {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        String SSQL = "SELECT producto FROM Productos ORDER BY ID_producto";
        try 
        {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_producto.addItem("Seleccione una opción");
            while (resultado.next()) 
            {
                cbox_producto.addItem(resultado.getString("Producto"));
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e);
        } 
        finally 
        {
            if (cn != null) 
            {
                try 
                {
                    cn.close();
                    resultado.close();
                    resultado = null;
                } 
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    
    public void consultarconsulta(JComboBox cbox_consulta) 
    {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        String SSQL = "SELECT consulta_fecha FROM Consulta ORDER BY ID_consulta";
        try 
        {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_consulta.addItem("Seleccione una opción");
            while (resultado.next()) 
            {
                cbox_consulta.addItem(resultado.getString("Consulta"));
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e);
        } 
        finally 
        {
            if (cn != null) 
            {
                try 
                {
                    cn.close();
                    resultado.close();
                    resultado = null;
                } 
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
        
    public void consultartipoPago(JComboBox cbox_tPago) 
    {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        String SSQL = "SELECT tipo_pago FROM Tipo_pago ORDER BY ID_tipoPago";
        try 
        {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_tPago.addItem("Seleccione una opción");
            while (resultado.next()) 
            {
                cbox_tPago.addItem(resultado.getString("Tipo_pago"));
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e);
        } 
        finally 
        {
            if (cn != null) 
            {
                try 
                {
                    cn.close();
                    resultado.close();
                    resultado = null;
                } 
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }

    public boolean modificarTpago() 
    {
        try 
        {
            boolean resp = false;
            Cn = Conexion.conectar();
            String sql = "UPDATE Detalle_factura SET monto_pagar = ?, fecha_emision = ?, ID_tipoPago = ?WHERE ID_tipoPago = ?";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setString(1, nombre_pagador);
            cmd.setInt(2, ID_detalle);
            cmd.setInt(3, ID_consulta);
            cmd.setInt(4, ID_producto);
            cmd.setInt(5, ID_factura);
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } 
        catch (SQLException ex) 
        {
            System.err.println("Error guardar tipo empleado " + ex);
            return false;
        }
    }
    public void listarCitas(Connection cn, JTable tabla){
        cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Pagador","DUI","Detalle","Servicio", "Producto"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT*FROM Factura";
        String [] filas = new String[7];
        Statement st = null;
        ResultSet rs = null;
        
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next()){
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar "+e);
        }
    }  
}