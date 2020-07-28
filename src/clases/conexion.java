package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class conexion {
    
    public static Connection conectar()
    {
        Connection con=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-1ABIBEI5\\SQLEXPRESS;"
                    + "databaseName=SIGES;User=SIGES;Password=2020SIGES");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return  con;
    }
}