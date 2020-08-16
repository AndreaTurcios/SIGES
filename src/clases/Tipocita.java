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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Tipocita {

private Connection cn;
private Integer ID_tipoCita;
private String tipo_Cita;


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
        return tipo_Cita;
    }
    
    public void settipo_cita(String tipo_cita){
        this.tipo_Cita = tipo_cita;
    }

    

    public boolean guardar() {
        boolean resp = false;
        try {String sql = "INSERT INTO Tipo_cita(ID_tipoCita, )"+" VALUES (?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
       cmd.setInt(1, ID_tipoCita);
       cmd.setString(2, tipo_Cita);
    
        
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
        cmd.setString(2, tipo_Cita);
    
        
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
             tipo_Cita = rs.getString(2);
             
        }
        cmd.close();
        cn.close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    Pool metodospool = new Pool();
    public void consultarCitas(JComboBox cbox_mascotat) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;

        String SSQL = "SELECT ID_tipoCita, tipo_cita FROM Tipo_citas";
        try {
         
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_mascotat.addItem("Seleccione una opción");
            while (resultado.next()) {
                tipoMascota tm = new tipoMascota();
                tm.setID_tipoMascota(resultado.getInt("ID_tipoCita"));
                tm.setTipo_animal(resultado.getString("tipo_cita"));
                cbox_mascotat.addItem(tm);
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
    public String tipo_Cita() {
        return tipo_Cita;
    }
    
}
