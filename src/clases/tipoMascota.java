/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15-CW0001la
 */
public class tipoMascota {
    private Connection Con;
    private Integer ID_tipoMascota;
    private String tipo_animal;
    
    public tipoMascota(){
        Conexion con = new Conexion();
        Con = con.conectar();
    }
    
    public Connection getCon() {
        return Con;
    }

    public void setCon(Connection Con) {
        this.Con = Con;
    }

    public Integer getID_tipoMascota() {
        return ID_tipoMascota;
    }

    public void setID_tipoMascota(Integer ID_tipoMascota) {
        this.ID_tipoMascota = ID_tipoMascota;
    }

    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }
    public String toString() {
        return tipo_animal;
    }
    
    public boolean GuardarTipoMascota ()
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO Tipo_mascota (tipo_animal) VALUES (?)";
            PreparedStatement cmd = Con.prepareStatement(sql);
            cmd.setString(1, tipo_animal);
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            Con.close();
        }
        catch (Exception a)
        {
            System.out.println(a.toString());
            JOptionPane.showMessageDialog(null, "No se puede guardar el registro, Error en el CrudTipoConsulta.java - GuardarTipoConsulta"+a);
        }
        return resp;
    }
    
    public boolean EliminarTipoMascota ()
    {
        boolean resp = false;
        try 
        {
            String sql = "DELETE FROM Tipo_mascota WHERE ID_tipoMascota=?;";
            PreparedStatement cmd = Con.prepareStatement(sql);
            cmd.setInt(1, ID_tipoMascota);
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            Con.close();
        } 
        catch (Exception ex) 
        {
            System.out.println("Error exception es"+ex.toString());
        }
        return resp;
    }
    
    
    public boolean ModificarMascota () 
    {
        boolean resp = false;
        try 
        {
            System.err.println("conexion" + Con);
            String sql = "UPDATE Tipo_consulta SET tipo_animal=? WHERE ID_tipoMascota=?";
            PreparedStatement cmd = Con.prepareStatement(sql);
            cmd.setString(1, tipo_animal);
            System.out.println(tipo_animal);
            cmd.setInt(2, ID_tipoMascota);
            System.out.println(ID_tipoMascota);
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            Con.close();
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.toString());
        }
        return resp;
    }
    
    public void EjecutarTipoMascota(Connection cn, JTable tabla)
    {
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_tipoMascota","tipo_animal"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Tipo_mascota ORDER BY ID_tipoMascota";
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
    
    public void CargarTipoMascota(JTable tabla) 
    {
        EjecutarTipoMascota(Con ,tabla);
    }
}
