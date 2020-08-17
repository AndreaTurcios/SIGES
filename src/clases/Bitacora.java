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
 * @author Estrada
 */
public class Bitacora {
    private Connection cn;
    private Integer ID;
    
    public Bitacora() {
        //estableciendo la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }
    
    public boolean BitacoraCreate(){
            boolean retorno = false;
            try{
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso de datos','Create', @fecha, "+ID+");";
                PreparedStatement cmd = getCn().prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                    System.out.println(ID);
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }

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
     * @return the ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }
}
