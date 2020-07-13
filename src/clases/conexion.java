package Clases;
import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    private static Connection con;  
    private static String Usuario = "sa";
    private static String BaseDatos= "SIGES";
    private static String Contraseña = "2020";
    
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName="+BaseDatos, Usuario, Contraseña);
        }
        catch (Exception e)
        {
            con= null;
            System.out.println(e);
        }
        return con;
    }
}