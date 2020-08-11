package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nanos
 */
public class controlNacionalidad 
{
    private Connection Con;

    public Connection getCon() {
        return Con;
    }

    public void setCon(Connection Con) {
        this.Con = Con;
    }
    private Integer ID_nacionalidad;
    private String nacionalidad;

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public Integer getID_nacionalidad()
    {
        return ID_nacionalidad;
    }
    
    public void setID_nacionalidad(Integer ID_nacionalidad)
    {
        this.ID_nacionalidad = ID_nacionalidad;
    }
    
    public String getnacionalidad()
    {
        return nacionalidad;
    }
    
    public void setnacionalidad(String nacionalidad)
    {
        this.nacionalidad = nacionalidad;
    }
    
    public controlNacionalidad() {
    Conexion o = new Conexion();
    Con = o.conectar();
    }

    public boolean guardar() {
        boolean resp = false;
     try{
       
     String sql = "INSERT INTO nacionalidad (nacionalidad) VALUES (?) ";
                
       PreparedStatement cmd = Con.prepareStatement(sql);
       cmd.setString(1,nacionalidad);
       System.out.println(nacionalidad);
            if (!cmd.execute()){
                resp = true;
            }
                cmd.close();
                Con.close();
            }catch(Exception e)
             {
              System.out.println(e.toString());
             }
            return resp;
        } 

    public boolean modificar() {
       boolean resp = false;
     try{
       
     String sql = "UPDATE nacionalidad SET nacionalidad= ? WHERE ID_nacionalidad = ? ";
                
       PreparedStatement cmd = Con.prepareStatement(sql);
       cmd.setString(1,nacionalidad);
            if (!cmd.execute()){
                resp = true;
            }
                cmd.close();
                Con.close();
            }catch(Exception e)
             {
              System.out.println(e.toString());
             }
            return resp;
    }

   public boolean Consultar() {
        boolean resp = false;
        try {
            //conexion = new conexion();
            String sql = "SELECT ID_nacionalidad , nacionalidad FROM nacionalidad";
            PreparedStatement cmd = Con.prepareStatement(sql);
            
            System.out.println("Valores" + cmd.executeQuery());
            cmd.close();
            Con.close();
           // return  true;
        } catch (SQLException e) {
            System.err.println("Error " + e);
         //   return false;
        }
        return resp;
   }
    public void CargarNacionalidad(Connection cn, JTable tabla){
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_nacionalidad", "nacionalidad"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM nacionalidad ORDER BY ID_nacionalidad";
        String [] filas = new String[3];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 3; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar tabla "+e);
        }
    }   
    public void CargarNacionalidades(JTable tabla){
        CargarNacionalidad(getCon(), tabla);
    }
    @Override
    public String toString() {
        return nacionalidad;
    }
   
   
    }
       
    
    

   