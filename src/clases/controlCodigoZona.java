/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author estef
 */
public class controlCodigoZona {
    
    private Connection Cn;
    private Conexion conexion;
    private Integer ID_codigo;
    private Integer codigo_zona;
    
    public Connection getCn()
    {
        return Cn;
    }
    
    public void setCn(Connection Cn)
    {
        this.Cn = Cn;
    }
     public Integer getID_codigo()
    {
        return ID_codigo;
    }
     public Conexion getconexion() {
        return conexion;
    }
    public void setconexion(Conexion conexion) {
        this.conexion = conexion;
    }
    
    public void setID_codigo(Integer ID_codigo)
    {
        this.ID_codigo = ID_codigo;
    }
    
    public int getcodigo_zona() {
        return codigo_zona;
    }

    public void setcodigo_zona(int codigo_zona) {
        this.codigo_zona = codigo_zona;
    }
    
    
    public boolean guardar() {

        try {
            boolean resp = false;
            Cn = Conexion.conectar();
            String sql = "INSERT INTO codigo_zona (codigo_zona)"+"VALUES(?)";
            PreparedStatement cmd = Cn.prepareStatement(sql);
//            cmd.setInt(1, ID_detalle);
            cmd.setInt(1, codigo_zona);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error al guardar codigo zona " + ex);
            return false;
        }
        }
    
    public boolean modificar() {

        try {
            boolean resp = false;
            Cn = Conexion.conectar();
            String sql = "UPDATE codigo_zona SET codigo_zona = ? WHERE ID_codigo = ?";
            PreparedStatement cmd = Cn.prepareStatement(sql);
//            cmd.setInt(1, ID_detalle);
            cmd.setInt(1, codigo_zona);
            cmd.setInt(2, ID_codigo);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error al modificar codigo zona " + ex);
            return false;
        }
        }
    
     public boolean Eliminar() {
        boolean resp = false;
        Cn = Conexion.conectar();
        try {//realizando consulta insert
            String sql = "DELETE FROM codigo_zona WHERE ID_codigo=?;";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setInt(1, ID_codigo);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
        } catch (Exception ex) {
            System.out.println("Error exception es"+ex.toString());
        }
        return resp;
    }
    public void CargarCodigoZ(JTable tabla){
    cargarC(Cn, tabla);
}
    
     public void cargarC (Connection Cn, JTable tabla){
         Cn = conexion.conectar();
         DefaultTableModel model = new DefaultTableModel();
         String [] columnas = {"ID_codigo","codigo_zona"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM codigo_zona ORDER BY ID_codigo";
        String [] filas = new String[2];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = Cn.createStatement();
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
}
