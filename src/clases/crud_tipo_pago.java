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
public class crud_tipo_pago 
{
    private Connection cn;
    private Integer ID_tipoPago;
    private Integer tipo_pago;
    
    public Connection getcn(){
        return cn;
    }
    
    public void setcn(Connection cn){
        this.cn = cn;
    }
    
    public Integer getID_tipoPago(){
        return ID_tipoPago;
    }
    
    public void setID_tipoPago(Integer ID_tipoPago){
        this.ID_tipoPago = ID_tipoPago;
    }
     
    public Integer gettipo_pago(){
        return tipo_pago;
    }
    
    public void setcita_hora(Integer tipo_pago){
        this.tipo_pago = tipo_pago;
    }

    public boolean Guardar_Tipo_Pago() 
    {
        boolean Guardar = false;
        try 
        {
            String sql = "INSERT INTO Tipo_pago(ID_tipoPago, tipo_pago)"+" VALUES (?, ?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_tipoPago);
            cmd.setInt(2, tipo_pago);
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

    public boolean Consultar_Tipo_Pago() 
    {
        boolean Consultar = false;
        try 
        {
            String sql = "SELECT * FROM Tipo_pago WHERE ID_tipoPago = ? ";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_tipoPago);
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

    public boolean Modificar_Tipo_Pago() 
    {
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
    }
}
