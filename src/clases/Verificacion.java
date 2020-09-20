/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Estrada
 */
public class Verificacion {
    private Connection cn;
    private Integer ID_usuario;
    private String Usuario;

    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /**
     * @return the ID_usuario
     */
    public Integer getID_usuario() {
        return ID_usuario;
    }

    /**
     * @param ID_usuario the ID_usuario to set
     */
    public void setID_usuario(Integer ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public Verificacion(){
        Conexion con = new Conexion();
        cn = con.conectar(); 
    }
    
    public boolean consultar(String Usuario){
        boolean resp = false;
        try{
            //Realizar consulta SELECT
            String sql = "SELECT nombre_usuario FROM Usuarios WHERE nombre_usuario = '"+Usuario+"'";
            PreparedStatement cmd = cn.prepareStatement(sql);//Llenar los parametros
            //Ejecutar la consulta
            //pedira importar la ResultSet
            
            //Recorrer la lista de registros
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next()) {
                resp = true;
                
                
            }
            cmd.close();
            cn.close();           
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }
    
    
}
