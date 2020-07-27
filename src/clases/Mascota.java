package clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;

public class Mascota {
    private Connection cn;
    private Integer ID_mascota;
    private String nombre_mascota;
    private String mascota_genero;
    private String mascota_razon;
    private String mascota_medicinas;
    private Integer ID_tipoMascota;

    public Integer getID_tipoMascota() {
        return ID_tipoMascota;
    }

    public void setID_tipoMascota(Integer ID_tipoMascota) {
        this.ID_tipoMascota = ID_tipoMascota;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Integer getID_mascota() {
        return ID_mascota;
    }

    public void setID_mascota(Integer ID_mascota) {
        this.ID_mascota = ID_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getMascota_genero() {
        return mascota_genero;
    }

    public void setMascota_genero(String mascota_genero) {
        this.mascota_genero = mascota_genero;
    }

    public String getMascota_razon() {
        return mascota_razon;
    }

    public void setMascota_razon(String mascota_razon) {
        this.mascota_razon = mascota_razon;
    }

    public String getMascota_medicinas() {
        return mascota_medicinas;
    }

    public void setMascota_medicinas(String mascota_medicinas) {
        this.mascota_medicinas = mascota_medicinas;
    }

    public String getMascota_horarioReserva() {
        return mascota_horarioReserva;
    }

    public void setMascota_horarioReserva(String mascota_horarioReserva) {
        this.mascota_horarioReserva = mascota_horarioReserva;
    }

    
    private String mascota_horarioReserva;
    
    
    public Mascota() {
        //estableciendo la conexion
       Clases.conexion con = new Clases.conexion();
       cn = con.conectar();
       }
    //creando el metodo para modificar
    public boolean modificarMascota(){
    boolean resp = false;
    try{//realizando consulta update
    String sql="UPDATE Mascota SET nombre_mascota=?, mascota_genero=?, " 
            + "mascota_razon=?, mascota_medicinas=?, WHERE mascota_horarioReserva=?";
    PreparedStatement cmd = cn.prepareStatement(sql);
    //llenar los parametros como se encuentran en las clases
    cmd.setString(1, nombre_mascota);
    cmd.setString(2, mascota_genero);
    cmd.setString(3, mascota_razon);
    cmd.setString(4, mascota_medicinas);
    cmd.setString(5, mascota_horarioReserva);
    
        if (!cmd.execute()) {
            resp=true;
        }
    cmd.close();
    cn.close();
    }catch(Exception ex){
        System.out.println(ex.toString());
    }
    return resp;
    }
    public boolean EliminarMascota(){
    boolean resp=false;
    try{//realizando consulta insert
            String sql = "DELETE FROM Mascota WHERE ID_mascota=?;";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setInt(1, ID_mascota );
            if (!cmd.execute()) {
                resp=true;
            }
            cmd.close();
            cn.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return resp;
    }
    public boolean guardarMascota(){
        boolean resp = false;
        try{//realizando consulta insert
            String sql = "INSERT INTO Mascota (nombre_mascota=?, mascota_genero=?, " 
            + "mascota_razon=?, mascota_medicinas=?, mascota_horarioReserva=?"+"VALUES(?,?,?,?,?,?,?)";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setString(1, nombre_mascota );
            cmd.setString(2, mascota_genero );
            cmd.setString(3, mascota_razon );
            cmd.setString(4, mascota_medicinas );
            cmd.setString(5, mascota_horarioReserva );
            cmd.setInt(6, ID_tipoMascota );
            if (!cmd.execute()) {
                resp=true;
            }
            cmd.close();
            cn.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return resp;
        
    }
    public boolean consultarMascota(){
        boolean resp = false;
        try{//realizando consulta insert
            String sql = "SELECT nombre_mascota=?, mascota_genero=?, " 
            + "mascota_razon=?, mascota_medicinas=?, mascota_horarioReserva=? FROM Mascota WHERE ID_mascota=?";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setInt(1, ID_mascota );
            ResultSet rs= cmd.executeQuery();
            if (rs.next()) {
                resp=true;
            nombre_mascota = rs.getString(1);
            mascota_genero = rs.getString(2);
            mascota_razon = rs.getString(3);
            mascota_medicinas = rs.getString(4);
            mascota_horarioReserva = rs.getString(5);
            ID_tipoMascota = rs.getInt(6);
            }
            cmd.close();
            cn.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return resp;
        
    }
}