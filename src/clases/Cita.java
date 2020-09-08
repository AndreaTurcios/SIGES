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
    private Integer ID_mascota;

    public Integer getID_mascota() {
        return ID_mascota;
    }

    public void setID_mascota(Integer ID_mascota) {
        this.ID_mascota = ID_mascota;
    }

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
       clases.Conexion con = new clases.Conexion();
       cn = con.conectar();
        System.out.println("Entra al maetodo guardadr");
        try {String sql = "INSERT INTO Citas(cita_fecha, cita_hora, "
                + "ID_estado, ID_tipoCita,ID_DUI, ID_mascota)"+" VALUES (?, ?, ?, ?, ?, ?)";
        
        System.out.println("Entra al maetodo guardadr 2");
        System.out.println("Entra al maetodo guardadr 2" + cn);
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        System.out.println("Entra al maetodo guardadr 3");
        cmd.setDate(1, cita_fecha);
        cmd.setTime(2,cita_hora );
        cmd.setInt(3,ID_estado);
        cmd.setInt(4,ID_tipoCita);
        System.out.println("clases.Cita.guardar()" + DUI);
        cmd.setInt(5, DUI);
        cmd.setInt(6, ID_mascota);
        
        
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
                    + "ID_tipoCita=?, ID_DUI=?, ID_mascota=? WHERE ID_cita=?";
    
       PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setDate(1, cita_fecha);
        cmd.setTime(2, cita_hora);
        cmd.setInt(3, ID_estado);
        cmd.setInt(4, ID_tipoCita);
        cmd.setInt(5, DUI);
        cmd.setInt(6, ID_mascota);
        cmd.setInt(7, ID_cita);
        
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
        String [] columnas = {"ID", "Fecha","Hora","Estado","Tipo cita", "DUI", "ID Mascota"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT\n" +
"     Citas.\"ID_cita\" AS Consulta_ID_consulta,\n" +
"     Citas.\"cita_fecha\" AS Consulta_consulta_fecha,\n" +
"     Citas.\"cita_hora\" AS Consulta_consulta_hora,\n" +
"     tipo_estado.\"estado\" AS tipo_estado_estado,\n" +
"	 Tipo_consulta.\"tipo_consulta\" AS Tipo_consulta_tipo_consulta,\n" +
"     Cliente_duenio.\"ID_DUI\" AS Cliente_duenio_ID_DUI,\n" +
"     Mascota.\"nombre_mascota\" AS Mascota_nombre_mascota\n" +
"FROM\n" +
"     \"dbo\".\"tipo_estado\" tipo_estado INNER JOIN \"dbo\".\"Citas\" Citas ON tipo_estado.\"ID_estado\" = Citas.\"ID_estado\"\n" +
"     INNER JOIN \"dbo\".\"Cliente_duenio\" Cliente_duenio ON Citas.\"ID_DUI\" = Cliente_duenio.\"ID_DUI\"\n" +
"     INNER JOIN \"dbo\".\"Tipo_consulta\" Tipo_consulta ON Citas.\"ID_tipoCita\" = Tipo_consulta.\"ID_tipoConsulta\"\n" +
"     INNER JOIN \"dbo\".\"Mascota\" Mascota ON Citas.\"ID_mascota\" = Mascota.\"ID_mascota\"\n" +
"     AND Cliente_duenio.\"ID_DUI\" = Mascota.\"ID_DUI\"\n" +
"ORDER BY Citas.\"ID_cita\" ASC";
        String [] filas = new String[7];
        Statement st = null;
        ResultSet rs = null;
        
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next()){
                for (int i = 0; i < 7; i++) {
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
    cn = Conexion.conectar();
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
