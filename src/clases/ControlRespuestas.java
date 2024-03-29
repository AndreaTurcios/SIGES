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
public class ControlRespuestas {
    private Connection cn;
    private Integer ID_respuesta;
    private String respuesta;
    private Integer ID_pregunta;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Integer getID_respuesta() {
        return ID_respuesta;
    }

    public void setID_respuesta(Integer ID_respuesta) {
        this.ID_respuesta = ID_respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Integer getID_pregunta() {
        return ID_pregunta;
    }

    public void setID_pregunta(Integer ID_pregunta) {
        this.ID_pregunta = ID_pregunta;
    }
    
     public boolean guardar() {
        boolean resp = false;
        try {String sql = "INSERT INTO respuestas(respuesta, ID_pregunta)"+" VALUES (?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setString(1, respuesta);
        cmd.setInt(2,ID_pregunta );
        
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
