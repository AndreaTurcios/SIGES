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
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15-CW0001la
 */
public class TipoUsuario {
    private Connection cn;
    private Conexion conexion;
    private Integer ID_usuario;
    private Integer ID_TipoUsuario;
    private String tipo_empleado;

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
    public Integer getID_TipoUsuario() {
        return ID_TipoUsuario;
    }

    public void setID_TipoUsuario(Integer ID_usuario) {
        this.ID_TipoUsuario = ID_usuario;
    }
    public Integer getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(Integer ID_usuario) {
        this.ID_usuario = ID_usuario;
    }
   public String getTipo_empleado() {
        return tipo_empleado;
    }
    public String gettipo_empleado() {
        return tipo_empleado;
    }

    public void settipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }
    public String toString() {
        return tipo_empleado;
    }
    
    public boolean guardar() {

        try {
            boolean resp = false;
            cn = Conexion.conectar();
            String sql = "INSERT INTO Tipo_usuarios (tipo_empleado)"+"VALUES(?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
//            cmd.setInt(1, ID_detalle);
            cmd.setString(1, tipo_empleado);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error guardar tipoe mpleado " + ex);
            return false;
        }
        }
    public boolean modificar() {

        try {
            boolean resp = false;
            cn = Conexion.conectar();
            String sql = "UPDATE Tipo_usuarios SET tipo_empleado = ? WHERE ID_usuario = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
//            cmd.setInt(1, ID_detalle);
            cmd.setString(1, tipo_empleado);
            cmd.setInt(2, ID_usuario);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error guardar tipo empleado " + ex);
            return false;
        }
        }
    public boolean Eliminar() {
        boolean resp = false;
        cn = Conexion.conectar();
        try {//realizando consulta insert
            String sql = "DELETE FROM Tipo_usuarios WHERE ID_usuario=?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_usuario);
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
    public void listarEstados(Connection cn, JTable tabla){
        cn = conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID","estado"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Tipo_usuarios ORDER BY ID_usuario";
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
    public void CargarE (JTable tabla) {
        listarEstados(cn ,tabla);
    }
}
