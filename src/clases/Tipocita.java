/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Tipocita {

private Connection cn;
private Integer ID_tipoCita;
private String tipo_cita;


 public Connection getcn(){
        return cn;
    }
    
    public void setcn(Connection cn){
        this.cn = cn;
    }
    
    public Integer getID_tipoCita(){
        return ID_tipoCita;
    }
    
    public void setID_tipoCita(Integer ID_tipoCita){
        this.ID_tipoCita = ID_tipoCita;
    }
    
    public String gettipo_cita(){
        return tipo_cita;
    }
    
    public void settipo_cita(String tipo_cita){
        this.tipo_cita = tipo_cita;
    }

    

    public boolean guardar() {
        boolean resp = false;
        try {String sql = "INSERT INTO Tipo_cita(ID_tipoCita, )"+" VALUES (?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
       cmd.setInt(1, ID_tipoCita);
       cmd.setString(2, tipo_cita);
    
        
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

    public boolean modificar() {
         boolean resp = false;
        try {String sql = "UPDATE SET Tipo_citas , ID_tipoCita = ?, tipo_cita = ?";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
       
        cmd.setInt(1, ID_tipoCita);
        cmd.setString(2, tipo_cita);
    
        
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

    public boolean Consultar() {
        boolean resp = false;
        try {String sql = "SELECT ID_tipoCita, tipo_cita FROM Tipo_cita WERE ID_tipoCita = ? ";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        cmd.setInt(1, ID_tipoCita);
        
        ResultSet rs = cmd.executeQuery();
        
        if (rs.next()) {
            resp = true;
             ID_tipoCita = rs.getInt(1);
             tipo_cita = rs.getString(2);
             
        }
        cmd.close();
        cn.close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    
}
