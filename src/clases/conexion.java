package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class conexion {
    
    public static Connection conectar()
    {
        Connection cn=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-1ABIBEI5\\SQLEXPRESS;"
                    + "databaseName=SIGES;integratedSecurity=true;");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return cn;
    }
}