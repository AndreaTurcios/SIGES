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
public class CrudRespuestas 
{
    private Connection cn;
    private Conexion conexion;
    private Integer ID_Respuesta;
    private String Respuesta;
    private Integer ID_Pregunta;
    
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

    public Integer getID_Respuesta() 
    {
        return ID_Respuesta;
    }

    public void setID_Respuesta(Integer ID_Respuesta) 
    {
        this.ID_Respuesta = ID_Respuesta;
    }

    public String getRespuesta() 
    {
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) 
    {
        this.Respuesta = Respuesta;
    }
    public String toString() 
    {
        return Respuesta;
    }
    
    public Integer getID_Pregunta() 
    {
        return ID_Pregunta;
    }

    public void setID_Pregunta(Integer ID_Pregunta) 
    {
        this.ID_Pregunta = ID_Pregunta;
    }
    
    public CrudRespuestas() 
    {
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    public boolean Guardar_Respuesta ()
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO respuestas (ID_respuesta, respuesta, ID_Pregunta) VALUES (?, ?, ?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_Respuesta);
            cmd.setString(2, Respuesta);
            cmd.setInt(3, ID_Pregunta);
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
            JOptionPane.showMessageDialog(null, "No se puede guardar el registro, Error en el CrudRespuestas.java - Guardar_Respuesta"+a);
        }
        return resp;
    }
    
    public boolean Modificar_Respuesta () 
    {
        boolean resp = false;
        try
        {
            String sql = "UPDATE respuestas SET respuesta = ?, ID_Pregunta = ? WHERE ID_respuesta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Respuesta);
            cmd.setInt(2, ID_Pregunta);
            cmd.setInt(3, ID_Respuesta);
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
            JOptionPane.showMessageDialog(null, "No se puede guardar el registro, Error en el CrudRespuestas.java - Modificar_Respuesta ERROR:" + a);
        }
        return resp;
    }
    
    public boolean Eliminar_Respuesta ()
    {
        boolean resp = false;
        try 
        {
            String sql = "DELETE FROM respuestas WHERE ID_respuesta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_Respuesta);
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
            JOptionPane.showMessageDialog(null, "No se puede guardar el registro, Error en el CrudRespuestas.java - Eliminar_Respuesta ERROR:" + a);        
        }
        return resp;
    }
    
    public boolean Consultar_Respuesta ()
    {
        boolean resp = false;
        try 
        {
            String sql = "SELECT * FROM respuestas WHERE ID_respuesta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_Respuesta);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) 
            {
                resp = true;
                ID_Respuesta = rs.getInt(1);
                Respuesta = rs.getString(2);
                ID_Pregunta = rs.getInt(3);
            }
            cmd.close();
            cn.close();
        }
        catch (Exception a) 
        {
            System.out.println(a.toString());
            JOptionPane.showMessageDialog(null, "No se puede guardar el registro, Error en el CrudRespuestas.java - Consultar_Respuesta ERROR:" + a);        
        }
        return resp;
    }
    
    public void Consultar_Pregunta(JComboBox cmb_Pregunta) 
    {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        String SSQL = "SELECT ID_Pregunta, pregunta FROM preguntas ORDER BY ID_Pregunta";
        try 
        {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cmb_Pregunta.addItem("Seleccione una opción");
            while (resultado.next()) 
            {
                controlPreguntas tm = new controlPreguntas();
                tm.setID_pregunta(resultado.getInt("ID_Pregunta"));
                tm.setPregunta(resultado.getString("pregunta"));
                cmb_Pregunta.addItem(tm);
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "No se puede guardar el registro, Error en el CrudRespuestas.java - Consultar_Pregunta-1 ERROR:" + e);        
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
                    JOptionPane.showMessageDialog(null, "No se puede guardar el registro, Error en el CrudRespuestas.java - Consultar_Pregunta-2 ERROR:" + ex);        
                }
            }
        }
    }
}
