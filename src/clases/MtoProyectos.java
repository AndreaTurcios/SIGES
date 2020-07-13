package Clases;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

public class MtoProyectos {
    //declaracion de los atributos
    private Connection cn;
    private Date cita_fecha;
    private Time cita_hora;
    private Integer ID_tipoCita;
    
    public MtoProyectos() {
        //estableciendo la conexion
       conexion con = new conexion();
       cn = con.conectar();
       }
    public Date getCita_fecha() {
        return cita_fecha;
    }

    public void setCita_fecha(Date cita_fecha) {
        this.cita_fecha = cita_fecha;
    }
    public Time getCita_hora() {
        return cita_hora;
    }

    public void setCita_hora(Time cita_hora) {
        this.cita_hora = cita_hora;
    }
    public boolean guardarCita(){
        boolean resp = false;
        try{//realizando consulta insert
            String sql = "INSERT INTO Citas (cita_fecha, cita_hora, ID_tipoCita)"+"VALUES(?,?,?)";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setDate(1, cita_fecha );
            cmd.setTime(2, cita_hora);
            cmd.setInt(3, ID_tipoCita);
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

    
//    public boolean modificarCita(){
//        boolean resp=false;
//        try{
//            
//        }
//        
//    }
    
}
