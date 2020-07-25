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
/**
 *
 * @author estef
 */
public class Cita {
    
    private Connection cn;
    private Integer ID_cita;
    private Integer cita_hora;
    private Integer cita_fecha;
    private Integer ID_tipoCita;
    private Integer DUI;
    
    public Connection getcn(){
        return cn;
    }
    
    public void setcn(Connection cn){
        this.cn = cn;
    }
    
    public Integer getID_cita(){
        return ID_cita;
    }
    
    public void setID_cita(Integer ID_cita){
        this.ID_cita = ID_cita;
    }
     
    public Integer getcita_hora(){
        return cita_hora;
    }
    
    public void setcita_hora(Integer cita_hora){
        this.cita_hora = cita_hora;
    }
    
    public Integer getcita_fecha(){
        return cita_fecha;
    }
    
    public void setcita_fecha(Integer cita_fecha){
        this.cita_fecha = cita_fecha;
    }
    
    public Integer getID_tipoCita(){
        return ID_tipoCita;
    }
    
    public void setID_tipoCita(Integer ID_tipoCita){
        this.ID_tipoCita = ID_tipoCita;
    }
    
    public Integer getDUI(){
        return DUI;
    }
    
    public void setDUI(Integer DUI){
        this.DUI = DUI;
    }
     
    public Cita () {
        conexion u = new conexion();
        cn = u.conectar();
    }

    public boolean guardar() {
        boolean resp = false;
        try {String sql = "INSERT INTO Citas(ID_cita, cita_fecha, cita_hora, ID_tipoCita, DUI )"+" VALUES (?, ?, ?, ?, ?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setInt(1, ID_cita);
        cmd.setInt(2, cita_fecha);
        cmd.setInt(3,cita_hora );
        cmd.setInt(4,ID_tipoCita);
        cmd.setInt(5, DUI);
        
        
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
        try {String sql = "SELECT ID_cita, cita_fecha, cita_hora, ID_tipoCita,DUI FROM Citas, WERE ID_cita = ? ";
         
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setInt(1, ID_cita);
        cmd.setInt(2, cita_fecha);
        cmd.setInt(3,cita_hora );
        cmd.setInt(4,ID_tipoCita);
        cmd.setInt(5, DUI);
        
        
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

    public boolean Modificar() {
         boolean resp = false;
        try {String sql = "UPDATE SET Citas, ID_cita  = ?, cita_fecha  = ?, cita_hora  = ?, ID_tipoCita = ?, DUI  = ?" ;
         
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setInt(1, ID_cita);
        cmd.setInt(2, cita_fecha);
        cmd.setInt(3,cita_hora );
        cmd.setInt(4,ID_tipoCita);
        cmd.setInt(5, DUI);
        
        
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
