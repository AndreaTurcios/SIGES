package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class conexion {
    private static String Usuario = "SIGES";
    private static String BaseDatos= "SIGES";
    private static String Contraseña = "2020";
    public static Connection conectar(){
        Connection cn=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-J7LU3FU\\SQLEXPRESS;"+"databaseName="+BaseDatos, Usuario, Contraseña);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return cn;
    }
}