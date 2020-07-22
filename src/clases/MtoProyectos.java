package Clases;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    //Metodos, Sentencias y otros - Edwin//
    //Dejo esta seccion separado porque puede que las sentencia y/o metodos a continuacion no puedan servir//
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int Guardar_Usuario_UC1 (String nombre, String apellido_1, String apellido_2, String telefono, String domicilio, String foto,  String correo, String contraseña) throws SQLException 
    {
        int resultado = 0;
        Connection conexion_UC1 = null;
        String Sentencia_Guardar = ("INSERT INTO Usuarios (nombre_usuario, usuario_apMaterno, usuario_apPaterno, usuario_telefono, usuario_domicilio, usuario_correo, foto_usuario, usuario_contraseña) VALUES (?,?,?,?,?,?,?,?)");
        try 
        {
            conexion_UC1 = conexion.conectar();
            sentencia_preparada = conexion.;
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellido_1);
            sentencia_preparada.setString(3, apellido_2);
            sentencia_preparada.setString(4, telefono);
            sentencia_preparada.setString(5, domicilio);
            sentencia_preparada.setString(6, correo);
            sentencia_preparada.setString(7, foto);
            sentencia_preparada.setString(8, contraseña);
        }catch(Exception a)
        {
            
        }
    }
    
    public static String BuscarUsuarioRegistrado (String usuario, String contraseña)
    { 
        String busqueda_usuario = null;
        Connection conexion_UC1 = null;
        try 
        {
            conexion_UC1= conexion.conectar();
            //String Sentencia_Buscar_Usuario = ("SELECT nombre_usuario,usuario_apMaterno,usuario_apMaterno,usuario_apPaterno,usuario_telefono, usuario_domicilio, usuario_correo, foto_usuario, ID_tipoUsuario, ID_consulta");//
            String Sentencia_Buscar_Usuario = ("SELECT nombre_usuario, contraseña_usuario, recuperacion_usuario FROM usuarios WHERE correo = '" + usuario + "'&& contraseña = '" + contraseña + "' ");
            Resultado = 
        }
        catch (Exception a) 
        {
            
        }
    }

    
//    public boolean modificarCita(){
//        boolean resp=false;
//        try{
//            
//        }
//        
//    }
    
}
