/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author estef
 */
public class Cita {
    
    private Connection cn;
    private Integer ID_cita;
    private Time cita_hora;
    private Date cita_fecha;
    private Integer ID_tipoCita;
    private Integer DUI;
    private Integer ID_estado;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Time getCita_hora() {
        return cita_hora;
    }

    public void setCita_hora(Time cita_hora) {
        this.cita_hora = cita_hora;
    }

    public Date getCita_fecha() {
        return cita_fecha;
    }

    public void setCita_fecha(Date cita_fecha) {
        this.cita_fecha = cita_fecha;
    }

    public Integer getID_estado() {
        return ID_estado;
    }

    public void setID_estado(Integer ID_estado) {
        this.ID_estado = ID_estado;
    }
    
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
     
    public Time getcita_hora(){
        return cita_hora;
    }
    
    public void setcita_hora(Time cita_hora){
        this.cita_hora = cita_hora;
    }
    
    public Date getcita_fecha(){
        return cita_fecha;
    }
    
    public void setcita_fecha(Date cita_fecha){
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
//        conexion u = new conexion();
//        cn = u.conectar();
    }

    public boolean guardar() {
        boolean resp = false;
        try {String sql = "INSERT INTO Citas(cita_fecha, cita_hora, "
                + "ID_estado, ID_tipoCita,ID_DUI)"+" VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setDate(1, cita_fecha);
        cmd.setTime(2,cita_hora );
        cmd.setInt(3,ID_estado);
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
    
        public boolean modificarCita(){
            boolean resp = false;
            clases.Conexion con = new clases.Conexion();
            cn = con.conectar();
            try{//realizando consulta update
            String sql="UPDATE Citas SET cita_fecha=?, cita_hora=?, ID_estado=?, "
                    + "ID_tipoCita=?, ID_DUI=? WHERE ID_cita=?";
    
       PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setDate(1, cita_fecha);
        cmd.setTime(2, cita_hora);
        cmd.setInt(3, ID_estado);
        cmd.setInt(2, ID_tipoCita);
        cmd.setInt(3, DUI);
        
        if (!cmd.execute()) {
            resp=true;
        }
            cmd.close();
            cn.close();
            }catch(Exception ex){
        System.out.println(ex.toString());
        }
        return resp;
        }

    public boolean Consultar() {
        boolean resp = false;
        try {String sql = "SELECT ID_cita, cita_fecha, cita_hora, ID_tipoCita,DUI FROM Citas, WERE ID_cita = ? ";
         
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setInt(1, ID_cita);
        cmd.setDate(2, cita_fecha);
        cmd.setTime(3,cita_hora );
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
        cmd.setDate(2, cita_fecha);
        cmd.setTime(3,cita_hora );
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
     public void listarCitas(Connection cn, JTable tabla){
        cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Fecha","Hora","Estado","Tipo cita", "DUI"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Citas ORDER BY ID_cita";
        String [] filas = new String[6];
        Statement st = null;
        ResultSet rs = null;
        
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next()){
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar "+e);
        }
    }  
    public boolean EliminarCita(){
    boolean resp=false;
    try{//realizando consulta insert
            String sql = "DELETE FROM Citas WHERE ID_cita=?;";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setInt(1, ID_cita );
            if (!cmd.execute()) {
                resp=true;
            }
            cmd.close();
            cn.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return resp;
    }
    
    public void listarC(JTable tabla) {
        listarCitas(cn ,tabla);
    }
    
}
