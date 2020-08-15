/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 15-CW0001la
 */
public class ControlFicha {
     private Connection cn;
     private Integer ID_Ficha;
     private String Tratamiento;
     private String Dosis;
     private String Frecuencia;
     private Integer ID_DUI;
     private Integer ID_Mascota;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Integer getID_Ficha() {
        return ID_Ficha;
    }

    public void setID_Ficha(Integer ID_Ficha) {
        this.ID_Ficha = ID_Ficha;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }

    public String getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(String Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public Integer getID_DUI() {
        return ID_DUI;
    }

    public void setID_DUI(Integer ID_DUI) {
        this.ID_DUI = ID_DUI;
    }

    public Integer getID_Mascota() {
        return ID_Mascota;
    }

    public void setID_Mascota(Integer ID_Mascota) {
        this.ID_Mascota = ID_Mascota;
    }
     public boolean modificarFicha() {
       boolean resp = false;
        cn = Conexion.conectar();
        System.out.println("clases.ControlFicha.modificarFicha()" +  cn);
       try{
       String sql = "UPDATE Ficha_clinica SET Tratamiento=?, Dosis=?, Frecuencia=?, ID_DUI=?, ID_Mascota=?"
               + " WHERE ID_Ficha =?;";
       PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(6, ID_Ficha);
            cmd.setString(1, Tratamiento);
            cmd.setString(2, Dosis);
            cmd.setString(3, Frecuencia);
            cmd.setInt(4, ID_DUI);
            cmd.setInt(5, ID_Mascota);
       
           if (!cmd.execute()) {
               resp = true;
           }
           cmd.close();
           cn.close();
       }catch(SQLException e){
       System.out.println(e.toString());
       }
       return resp;
    }
    public boolean EliminarFicha() {
        boolean resp = false;
         cn = Conexion.conectar();
        try {//realizando consulta insert
            String sql = "DELETE FROM Ficha_clinica WHERE ID_Ficha=?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_Ficha);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println("Error exception es"+ex.toString());
        }
        return resp;
    }
    public boolean guardar() {
        boolean resp = false;
        cn = Conexion.conectar();
        try {
            String sql = "INSERT INTO Ficha_clinica(Tratamiento, Dosis, Frecuencia, ID_DUI, ID_Mascota)"+
                    " VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setString(1, Tratamiento);
        cmd.setString(2, Dosis);
        cmd.setString(3, Frecuencia);
        cmd.setInt(4, ID_DUI);
        cmd.setInt(5, ID_Mascota);
        
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
     
}
