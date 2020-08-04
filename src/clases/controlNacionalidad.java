/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Nanos
 */
public class controlNacionalidad 
{
    private Connection Con;
    private Integer ID_nacionalidad;
    private String nacionalidad;
    
    public Integer getID_nacionalidad()
    {
        return ID_nacionalidad;
    }
    
    public void setID_nacionalidad(Integer ID_nacionalidad)
    {
        this.ID_nacionalidad = ID_nacionalidad;
    }
    
    public String getnacionalidad()
    {
        return nacionalidad;
    }
    
    public void setnacionalidad(String nacionalidad)
    {
        this.nacionalidad = nacionalidad;
    }

    public boolean GuardarNacionalidad() 
    {
        boolean Guardar = false;
        try 
        {
            String sql = "INSERT INTO nacionalidad (ID_nacionalidad, nacionalidad)"+" VALUES (?, ?)";
            PreparedStatement cmd = Con.prepareStatement(sql);
            cmd.setInt(1, ID_nacionalidad);
            cmd.setString(2, nacionalidad);
            if (!cmd.execute()) 
            {
                Guardar = true;
            }
            cmd.close();
            Con.close();
        }
        catch(Exception e) 
        {
            System.out.println(e.toString());
        }
        return Guardar;
    }

    public boolean ConsultarNacionalidad() 
    {
        boolean Consultar = false;
        try 
        {
            String sql = "SELECT * FROM nacionalidad WHERE ID_nacionalidad = ? ";
            PreparedStatement cmd = Con.prepareStatement(sql);
            cmd.setInt(1, ID_nacionalidad);
            if (!cmd.execute()) 
            {
                Consultar = true;
            }
            cmd.close();
            Con.close();
        }
        catch(Exception e) 
        {
            System.out.println(e.toString());
        }
        return Consultar;
    }

    public boolean ModificarNacionalidad() 
    {
         boolean Modificar = false;
        try 
        {
            String sql = "UPDATE SET nacionalidad, ID_nacionalidad = ?, nacionalidad = ?";
            PreparedStatement cmd = Con.prepareStatement(sql);        
            cmd.setInt(1, ID_nacionalidad);
            cmd.setString(2, nacionalidad);
            if (!cmd.execute()) 
            {
                Modificar = true;
            }
            cmd.close();
            Con.close();
        }
        catch(Exception e) 
        {
            System.out.println(e.toString());
        }
        return Modificar;
    }
}
