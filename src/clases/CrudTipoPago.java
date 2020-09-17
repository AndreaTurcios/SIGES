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
public class CrudTipoPago 
{ 
    private Connection cn;
    private Conexion conexion;
    private Integer IDtipoPago;
    private String tipopago;
    
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

    public Integer getIDtipoPago() 
    {
        return IDtipoPago;
    }

    public void setIDtipoPago(Integer IDtipoPago) 
    {
        this.IDtipoPago = IDtipoPago;
    }

    public String gettipopago() 
    {
        return tipopago;
    }

    public void settipopago(String tipopago) 
    {
        this.tipopago = tipopago;
    }
    public String toString() 
    {
        return tipopago;
    }
        
    public CrudTipoPago() 
    {
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    
    public boolean GuardarTipoPago ()
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO Tipo_pago (tipo_pago) VALUES (?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, tipopago);
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
    
    public boolean ModificarTipoPago () 
    {
        boolean resp = false;
        try 
        {
            cn = Conexion.conectar();
            String sql = "UPDATE Tipo_pago SET tipo_pago = ? WHERE ID_tipoPago = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, tipopago);
            cmd.setInt(2, IDtipoPago);
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
    
    public boolean EliminarTipoPago ()
    {
        boolean resp = false;
        cn = Conexion.conectar();
        try 
        {
            String sql = "DELETE FROM Tipo_pago WHERE ID_tipoPago=?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, IDtipoPago);
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
    
    public void EjecutarTipoPago(Connection cn, JTable tabla)
    {
        cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_tipoPago","tipo_pago"};
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
                filas[0] = rs.getString("ID_tipoPago");
                filas[1] = rs.getString("tipo_pago");
                model.addRow(filas);
            }
            rs.close();
            tabla.setModel(model);
            cn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "No se puede cargar la tabla del registro, Error en el crud_tipo_pago.java - Ejecutar_Tipo_Pago ERROR:" + e);        
        }
    }   
    
    public void CargarTipoPago(JTable tabla) 
    {
        EjecutarTipoPago(cn ,tabla);
    }
    
    public void ConsultarUsuario(JComboBox cmbUsuario) 
    {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        String SSQL = "SELECT ID_Usuario, nombre_usuario FROM Usuarios ORDER BY ID_usuario";
        try 
        {
            //cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cmbUsuario.addItem("Seleccione una opción");
            while (resultado.next()) 
            {
                controlPreguntas tm = new controlPreguntas();
                tm.setID_pregunta(resultado.getInt("ID_Pregunta"));
                tm.setPregunta(resultado.getString("pregunta"));
                cmbUsuario.addItem(tm);
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "No se puede consultar el registro, Error en el CrudRespuestas.java - Consultar_Pregunta-1 ERROR:" + e);        
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
                    JOptionPane.showMessageDialog(null, "No se puede consultar el registro, Error en el CrudRespuestas.java - Consultar_Pregunta-2 ERROR:" + ex);        
                }
            }
        }
    }
     public void consultartipoPago(JComboBox cbox_tPago) 
    {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        String SSQL = "SELECT ID_tipoPago,tipo_pago FROM Tipo_pago ORDER BY ID_tipoPago";
//        java.sql.Connection cn = null;
//        PreparedStatement st = null;
//        ResultSet resultado = null;
//        String SSQL = "SELECT tipo_pago FROM Tipo_pago ORDER BY ID_tipoPago";
        try 
        {
            cn = conexion.conectar();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_tPago.addItem("Seleccione una opción");
            while (resultado.next()) 
            {
                CrudTipoPago tipoPago = new CrudTipoPago();
                tipoPago.setIDtipoPago(resultado.getInt("ID_tipoPago"));
                tipoPago.settipopago(resultado.getString("Tipo_pago"));
                //cbox_tPago.addItem(resultado.getString("Tipo_pago"));
                cbox_tPago.addItem(tipoPago);
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
    public void ConsultarPregunta(JComboBox cmbPregunta) 
    {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        String SSQL = "SELECT ID_Pregunta, pregunta FROM preguntas ORDER BY ID_Pregunta";
        try 
        {
            //cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cmbPregunta.addItem("Seleccione una opción");
            while (resultado.next()) 
            {
                controlPreguntas tm = new controlPreguntas();
                tm.setID_pregunta(resultado.getInt("ID_Pregunta"));
                tm.setPregunta(resultado.getString("pregunta"));
                cmbPregunta.addItem(tm);
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "No se puede consultar el registro, Error en el CrudRespuestas.java - Consultar_Pregunta-1 ERROR:" + e);        
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
                    JOptionPane.showMessageDialog(null, "No se puede consultar el registro, Error en el CrudRespuestas.java - Consultar_Pregunta-2 ERROR:" + ex);        
                }
            }
        }
    }
    
}
