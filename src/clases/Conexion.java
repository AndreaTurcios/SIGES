package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexion {
    
    public static Connection conectar()
    {
        Connection con=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-NJOINKB\\SQLEXPRESS;"
                    + "databaseName=SIGES;User=SIGES;Password=2020");
            System.out.println("Conecion " + con.getMetaData() );
        return  con;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
        
    }
}