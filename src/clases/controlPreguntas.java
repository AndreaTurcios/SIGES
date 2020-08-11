/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 15-CW0001la
 */
public class controlPreguntas {
    private Connection cn;
    private Integer ID_pregunta;
    private String pregunta;
    private Integer ID_usuario;

    public Integer getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(Integer ID_usuario) {
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
    
    public boolean guardar() {
        boolean resp = false;
        try {String sql = "INSERT INTO preguntas(ID_pregunta, pregunta, ID_usuario)"+" VALUES (?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setInt(1, ID_pregunta);
        cmd.setString(2, pregunta);
        cmd.setInt(3, ID_usuario);
        
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
