/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class tipoConsultas {
    private Connection cn;
    private Integer ID_tipoConsulta;
    private String tipo_consulta;
    
    public tipoConsultas() {
        //estableciendo la conexion 
       clases.Conexion con = new clases.Conexion();
       cn = con.conectar();
       }
    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Integer getID_tipoConsulta() {
        return ID_tipoConsulta;
    }

    public void setID_tipoConsulta(Integer ID_tipoConsulta) {
        this.ID_tipoConsulta = ID_tipoConsulta;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }
    
    public boolean guardar(){
        boolean resp = false;
        cn = Conexion.conectar();
        try{
            String sql = "INSERT INTO Tipo_consulta (tipo_consulta)"+"VALUES(?)";
        PreparedStatement cmd = cn.prepareStatement(sql);
        cmd.setString(1, tipo_consulta);
        if (!cmd.execute()) {
            resp = true;
        }
        cmd.close();
        cn.close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    public boolean ModificarTipoConsulta () 
    {
        boolean resp = false;
        try 
        {
            System.err.println("conexion" + cn);
            String sql = "UPDATE Tipo_consulta SET tipo_consulta=? WHERE ID_tipoConsulta=?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, tipo_consulta);
            System.out.println(tipo_consulta);
            cmd.setInt(2, ID_tipoConsulta);
            System.out.println(ID_tipoConsulta);
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            cn.close();
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.toString());
        }
        return resp;
    }
    
}
