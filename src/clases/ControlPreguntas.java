/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;

/**
 *
 * @author 15-CW0001la
 */
public class ControlPreguntas {
    private Connection cn;
    private Integer ID_pregunta;
    private String pregunta;

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
}
