package clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Nacionalidad {

    private Connection cn;
    private conexion conexion;
    private int ID_Nscionalidad;
    private String nacionalidad;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public conexion getConexion() {
        return conexion;
    }

    public void setConexion(conexion conexion) {
        this.conexion = conexion;
    }

    public int getID_Nscionalidad() {
        return ID_Nscionalidad;
    }

    public void setID_Nscionalidad(int ID_Nscionalidad) {
        this.ID_Nscionalidad = ID_Nscionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void Consultar() {
        boolean resp = false;
        try {
            //conexion = new conexion();
            String sql = "SELECT ID_nacionalidad , nacionalidad FROM nacionalidad";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            System.out.println("Valores" + cmd.executeQuery());
            cmd.close();
            cn.close();
           // return  true;
        } catch (SQLException e) {
            System.err.println("Error " + e);
         //   return false;
        }
    }

}
