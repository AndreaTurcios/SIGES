package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nanos
 */
public class controlNacionalidad 
{
    private Connection Con;
    private Integer ID_nacionalidad;
    private String nacionalidad;
    
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
    conexion o = new conexion();
    Con = o.conectar();
    }

    public boolean guardar() {
        boolean resp = false;
     try{
       
     String sql = "INSERT INTO nacionalidad (ID_nacionalidad , nacionalidad) VALUES ( ?, ?) ";
                
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
    }
       
    
    

   