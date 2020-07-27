package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class conexion {
    private static String Usuario = "SIGES";
    private static String BaseDatos= "SIGES";
    private static String Contraseña = "2020";
    public static Connection conectar()
    {
        Connection cn=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver:LAPTOP-1ABIBEI5\\SQLEXPRESS;"+"databaseName="+BaseDatos, Usuario, Contraseña);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return cn;
    }
    Connection conectar=null;
    public Connection conexion()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conectar=(Connection) DriverManager.getConnection("jdbc:sqlserver://DESKTOP-V6LBS8T\\UNLIMITED_084;"+"databaseName="+BaseDatos, Usuario, Contraseña);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return conectar;
    }
}