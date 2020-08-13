/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import clases.*;
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
 * @author 15-CW0001la
 */
public class controlPreguntas {
    private Connection cn;
    private Integer ID_pregunta;
    private String pregunta;
    private int ID_usuario;

    public int getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(int ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Integer getID_pregunta() {
        return ID_pregunta;
    }

    public void setID_pregunta(Integer ID_pregunta) {
        this.ID_pregunta = ID_pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    public String toString() {
        return pregunta;
    }
     public void listarPreguntas(Connection cn, JTable tabla){
        cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID Pregunta","pregunta", "ID usuario"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM preguntas ORDER BY ID_Pregunta";
        String [] filas = new String[3];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next()){
                for (int i = 0; i < 3; i++) {
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
     
    public void CargarPreguntass(JTable tabla) {
        listarPreguntas(cn ,tabla);
    }
    public boolean guardar() {
        boolean resp = false;
        cn = Conexion.conectar();
        try {
            String sql = "INSERT INTO preguntas(pregunta, ID_usuario)"+" VALUES (?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setString(1, pregunta);
        cmd.setInt(2, ID_usuario);
        
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
    Pool metodospool = new Pool();
    public void consultarUsuarioP(JComboBox cbox_duenios) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;

        String SSQL = "SELECT ID_usuario, nombre_usuario FROM Usuarios ORDER BY ID_usuario";
        try {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_duenios.addItem("Seleccione una opción");
            while (resultado.next()) {
                usuarios cz = new usuarios();
                cz.setID_usuario(resultado.getInt("ID_usuario"));
                cz.setnombre_usuario(resultado.getString("nombre_usuario"));
                cbox_duenios.addItem(cz);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                    resultado.close();
                    resultado = null;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    public double toInteger() {
        return ID_usuario;
    }
}
