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
public class controlCodigoZona 
{
    private Connection Con;
    private Integer ID_codigo;
    private int codigo_zona;

    public int getCodigo_zona() {
        return codigo_zona;
    }

    public void setCodigo_zona(int codigo_zona) {
        this.codigo_zona = codigo_zona;
    }
    
    public Integer getID_codigo()
    {
        return ID_codigo;
    }
    
    public void setID_codigo(Integer ID_codigo)
    {
        this.ID_codigo = ID_codigo;
    }
    
    public int getcodigo_zona()
    {
        return codigo_zona;
    }
    
    public void setcodigo_zona(int codigo_zona)
    {
        this.codigo_zona = codigo_zona;
    }

    public boolean GuardarCodigoZona() 
    {
        boolean Guardar = false;
        try 
        {
            String sql = "INSERT INTO codigo_zona (codigo_zona)"+" VALUES (?)";
            PreparedStatement cmd = Con.prepareStatement(sql);
            cmd.setInt(1, ID_codigo);
            cmd.setInt(2, codigo_zona);
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

    public boolean ConsultarCodigoZona() 
    {
        boolean Consultar = false;
        try 
        {
            String sql = "SELECT * FROM codigo_zona WHERE ID_codigo = ? ";
            PreparedStatement cmd = Con.prepareStatement(sql);
            cmd.setInt(1, ID_codigo);
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

    public boolean ModificarCodigoZona() 
    {
        boolean Modificar = false;
        try 
        {
            String sql = "UPDATE SET codigo_zona, codigo_zona = ?";
            PreparedStatement cmd = Con.prepareStatement(sql);        
            cmd.setInt(1, ID_codigo);
            cmd.setInt(2, codigo_zona);
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
    public String toString() {
        String codigo= Integer.toString(codigo_zona);
        return codigo;
    }
}
