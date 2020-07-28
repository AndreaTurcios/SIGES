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
public class crud_consulta 
{
    private Connection cn;
    private Integer ID_consulta;
    private Integer consulta_fecha;
    private Integer consulta_hora;
    private Integer ID_tipoConsulta;
    private Integer ID_DUI;
    
    public Connection getcn(){
        return cn;
    }
    
    public void setcn(Connection cn)
    {
        this.cn = cn;
    }
    
    public Integer getID_consulta()
    {
        return ID_consulta;
    }
    
    public void setID_consulta(Integer ID_consulta)
    {
        this.ID_consulta = ID_consulta;
    }
     
    public Integer getconsulta_fecha()
    {
        return consulta_fecha;
    }
    
    public void setconsulta_fecha(Integer consulta_fecha)
    {
        this.consulta_fecha = consulta_fecha;
    }
    
    public Integer getconsulta_hora()
    {
        return consulta_hora;
    }
    
    public void setconsulta_hora(Integer consulta_hora)
    {
        this.consulta_hora = consulta_hora;
    }
    
    public Integer getID_tipoConsulta()
    {
        return ID_tipoConsulta;
    }
    
    public void setID_tipoConsulta(Integer ID_tipoConsulta)
    {
        this.ID_tipoConsulta = ID_tipoConsulta;
    }
    
    public Integer getID_DUI()
    {
        return ID_DUI;
    }
    
    public void setID_DUI(Integer ID_DUI)
    {
        this.ID_DUI = ID_DUI;
    }

    public boolean Guardar_Consulta() 
    {
        boolean Guardar = false;
        try 
        {
            String sql = "INSERT INTO Consulta (ID_consulta, consulta_fecha, consulta_hora, ID_tipoConsulta, ID_DUI)"+" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_consulta);
            cmd.setInt(2, consulta_fecha);
            cmd.setInt(3, consulta_hora);
            cmd.setInt(4, ID_tipoConsulta);
            cmd.setInt(5, ID_DUI);
            if (!cmd.execute()) 
            {
                Guardar = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception e) 
        {
            System.out.println(e.toString());
        }
        return Guardar;
    }

    public boolean Consultar_Consulta() 
    {
        boolean Consultar = false;
        try 
        {
            String sql = "SELECT * FROM Consulta WHERE ID_consulta = ? ";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_consulta);
            if (!cmd.execute()) 
            {
                Consultar = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception e) 
        {
            System.out.println(e.toString());
        }
        return Consultar;
    }

    public boolean Modificar_Consulta() 
    {
         boolean Modificar = false;
        try 
        {
            String sql = "UPDATE SET Consulta, ID_consulta  = ?, consulta_fecha  = ?, consulta_hora  = ?, ID_tipoConsulta  = ?, ID_DUI  = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);        
            cmd.setInt(1, ID_consulta);
            cmd.setInt(2, consulta_fecha);
            cmd.setInt(3, consulta_hora);
            cmd.setInt(4, ID_tipoConsulta);
            cmd.setInt(5, ID_DUI);
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
    }
}
