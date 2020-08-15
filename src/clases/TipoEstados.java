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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15-CW0001la
 */
public class TipoEstados {
     private Connection cn; 
    private Conexion conexion;
    private Integer ID_estado;
    private String estado;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public Integer getID_estado() {
        return ID_estado;
    }

    public void setID_estado(Integer ID_estado) {
        this.ID_estado = ID_estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
     public boolean guardar() {

        try {
            boolean resp = false;
            cn = conexion.conectar();
            String sql = "INSERT INTO tipo_estado (estado)"+"VALUES(?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
//            cmd.setInt(1, ID_detalle);
            cmd.setString(1, estado);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error guardar tipo estado " + ex);
            return false;
        }
        }
     public void listarEstados(Connection cn, JTable tabla){
        cn = conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID","estado"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM tipo_estado ORDER BY ID_estado";
        String [] filas = new String[2];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next()){
                for (int i = 0; i < 2; i++) {
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
    public void Cargar(JTable tabla) {
        listarEstados(cn ,tabla);
    }
    public boolean Eliminar() {
        boolean resp = false;
        cn = conexion.conectar();
        try {//realizando consulta insert
            String sql = "DELETE FROM tipo_estado WHERE ID_estado=?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_estado);
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
    public boolean modificar() {
       boolean resp = false;
        cn = Conexion.conectar();
       try{
       String sql = "UPDATE tipo_estado SET estado = ? WHERE ID_estado =?;";
       PreparedStatement cmd = cn.prepareStatement(sql);
       cmd.setString(1, estado);
       cmd.setInt(2, ID_estado);
       
           if (!cmd.execute()) {
               resp = true;
           }
           cmd.close();
           cn.close();
       }catch(Exception e){
       System.out.println(e.toString());
       }
       return resp;
    }
}
