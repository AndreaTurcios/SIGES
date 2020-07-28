/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Estrada
 */
public class conexion1 {
       public Connection conectar(){
        Connection cn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            cn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-J7LU3FU\\SQLEXPRESS;"
                    + "databaseName=SIGES;integratedSecurity=true;");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return cn;
    }
}
