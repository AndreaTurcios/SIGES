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
    private Integer IDRespuesta;
    private String Respuesta;
    private Integer IDPregunta;
    private Integer ID_usuario;

    public Integer getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(Integer ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public Pool getMetodospool() {
        return metodospool;
    }

    public void setMetodospool(Pool metodospool) {
        this.metodospool = metodospool;
    }
    
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

    public Integer getIDRespuesta() 
    {
        return IDRespuesta;
    }

    public void setIDRespuesta(Integer IDRespuesta) 
    {
        this.IDRespuesta = IDRespuesta;
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
    
    public Integer getIDPregunta() 
    {
        return IDPregunta;
    }

    public void setIDPregunta(Integer ID_Pregunta) 
    {
        this.IDPregunta = ID_Pregunta;
    }
    
    public CrudRespuestas() 
    {
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    public boolean GuardarRespuesta ()
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO respuestas (respuesta, ID_Pregunta) VALUES (?, ?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Respuesta);
            cmd.setInt(2, IDPregunta);
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
    
    public boolean ModificarRespuesta () 
    {
        boolean resp = false;
        try
        {
            String sql = "UPDATE respuestas SET respuesta = ?, ID_Pregunta = ? WHERE ID_respuesta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Respuesta);
            cmd.setInt(2, IDPregunta);
            cmd.setInt(3, IDRespuesta);
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
            JOptionPane.showMessageDialog(null, "No se puede modificar el registro, Error en el CrudRespuestas.java - Modificar_Respuesta ERROR:" + a);
        }
        return resp;
    }
    
    public boolean EliminarRespuesta ()
    {
        boolean resp = false;
        try 
        {
            String sql = "DELETE FROM respuestas WHERE ID_respuesta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, IDRespuesta);
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
            JOptionPane.showMessageDialog(null, "No se puede eliminar el registro, Error en el CrudRespuestas.java - Eliminar_Respuesta ERROR:" + a);        
        }
        return resp;
    }
    
    public boolean ConsultarRespuesta ()
    {
        boolean resp = false;
        try 
        {
            String sql = "SELECT * FROM respuestas WHERE ID_respuesta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, IDRespuesta);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) 
            {
                resp = true;
                IDRespuesta = rs.getInt(1);
                Respuesta = rs.getString(2);
                IDPregunta = rs.getInt(3);
            }
            cmd.close();
            cn.close();
        }
        catch (Exception a) 
        {
            System.out.println(a.toString());
            JOptionPane.showMessageDialog(null, "No se puede mostrar el registro, Error en el CrudRespuestas.java - Consultar_Respuesta ERROR:" + a);        
        }
        return resp;
    }
    
    public void EjecutarRespuestas(Connection cn, JTable tabla)
    {
        cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_respuesta","respuesta","ID_Pregunta"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Respuestas ORDER BY ID_respuesta";
        String [] filas = new String[3];
        Statement st = null;
        ResultSet rs = null;
        try
        {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next())
            {
                for (int i = 0; i < 3; i++) 
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
            JOptionPane.showMessageDialog(null, "No se puede cargar la tabla del registro, Error en el CrudRespuestas.java - Ejecutar_Respuestas ERROR:" + e);        
        }
    }   
    
    public void CargarRespuestas(JTable tabla) 
    {
        EjecutarRespuestas(cn ,tabla);
    }
    
    public void ConsultarPregunta(JComboBox cmbPregunta) 
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
