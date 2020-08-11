package clases;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import ptcproyecto.FrmMain;
import clases.conexion;


public class LoginMetodo {
    //declaracion de los atributos
    private Connection cn;
    private Date cita_fecha;
    private Time cita_hora;
    private Integer ID_tipoCita;
    
    public LoginMetodo() {
        //estableciendo la Conexion
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
    
//    public static PreparedStatement sentencia_preparada;
//    public static ResultSet resultado;
//    public static String sql;
//    public static int resultado_numero = 0;
//    
//    public int Guardar_Usuario_UC1 (String nombre_usuario, String contrasenia_usuario, String nombre_empleado, String empleado_apMaterno, String empleado_apPaterno, String empleado_telefono,  String empleado_domicilio, String empleado_correo, String foto_empleado)
//    {
//        int resultado = 0;
//        Connection conexion_UC1 = null;
//        String Sentencia_Guardar = ("INSERT INTO Usuarios (nombre_usuario, contrasenia_usuario, nombre_empleado, empleado_apMaterno, empleado_apPaterno, empleado_telefono, empleado_domicilio, empleado_correo, foto_empleado) VALUES (?,?,?,?,?,?,?,?,?)");
//        try 
//        {
//            conexion_UC1 = Conexion.conectar();
//            sentencia_preparada = conexion_UC1.prepareStatement(Sentencia_Guardar);
//            sentencia_preparada.setString(1, nombre_usuario);
//            sentencia_preparada.setString(2, contrasenia_usuario);
//            sentencia_preparada.setString(3, nombre_empleado);
//            sentencia_preparada.setString(4, empleado_apMaterno);
//            sentencia_preparada.setString(5, empleado_apPaterno);
//            sentencia_preparada.setString(6, empleado_telefono);
//            sentencia_preparada.setString(7, empleado_domicilio);
//            sentencia_preparada.setString(8, empleado_correo);
//            sentencia_preparada.setString(9, foto_empleado);
//            resultado = sentencia_preparada.executeUpdate();
//            sentencia_preparada.close();
//            conexion_UC1.close();
//        }catch(Exception a)
//        {
//            /*Variante A*/
//            /*
//            JTextArea msg = new JTextArea("Error en la busqueda del nombre/na/Error: '"+a+"'");
//            msg.setLineWrap(true);
//            msg.setWrapStyleWord(true);
//            JScrollPane scrollPane = new JScrollPane(msg);
//            JOptionPane.showMessageDialog(null,scrollPane, "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);
//            */
//            /*Variante B*/
//            /*JOptionPane.showMessageDialog(null,"Error en la busqueda del nombre/n/Error: '"+a+"'", "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);*/
//            /*Variante C*/
//            JOptionPane.showMessageDialog(null,"<html>Error ocurrido durante el guardado del usuario<br>Error: '"+a+"'</html>", "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);
//        }
//        return resultado;
//    }
//    
//    public static String BuscarNombre (String nombre_usuario)
//    { 
//        String busqueda_nombre = null;
//        Connection conexion_UC1 = null;
//        try 
//        {
//            conexion_UC1= Conexion.conectar();
//            String Sentencia_Buscar_Nombre = ("SELECT nombre_empleado, empleado_apMaterno, empleado_apPaterno FROM Usuarios WHERE nombre_usuario = '"+nombre_usuario+"'");
//            sentencia_preparada = conexion_UC1.prepareStatement(Sentencia_Buscar_Nombre);
//            resultado = sentencia_preparada.executeQuery();
//            if (resultado.next()) 
//            {
//                String nombre_empleado = resultado.getString("nombre_empleado");
//                String empleado_apMaterno = resultado.getString("empleado_apMaterno");
//                String empleado_apPaterno = resultado.getString("empleado_apPaterno");
//                busqueda_nombre = (nombre_empleado +" "+ empleado_apPaterno +" "+ empleado_apMaterno);
//            }
//            conexion_UC1.close();
//        }
//        catch (Exception a) 
//        {
//            /*Variante A*/
//            /*
//            JTextArea msg = new JTextArea("Error en la busqueda del nombre/na/Error: '"+a+"'");
//            msg.setLineWrap(true);
//            msg.setWrapStyleWord(true);
//            JScrollPane scrollPane = new JScrollPane(msg);
//            JOptionPane.showMessageDialog(null,scrollPane, "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);
//            */
//            /*Variante B*/
//            /*JOptionPane.showMessageDialog(null,"Error en la busqueda del nombre/n/Error: '"+a+"'", "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);*/
//            /*Variante C*/
//            JOptionPane.showMessageDialog(null,"<html>Error ocurrido durante la busqueda del nombre<br>Error: '"+a+"'</html>", "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);
//        }
//        return busqueda_nombre;
//    }
//    
//    public static String BuscarUsuarioRegistrado (String nombre_usuario, String contrasenia_usuario) 
//    {
//        //Variante A//
//        String busqueda_usuario = null;
//        Connection conexion_UC1 = null;
//        try 
//        {
//            conexion_UC1 = Conexion.conectar();
//            String Sentencia_Buscar_Usuario = ("SELECT nombre_usuario, contrasenia_usuario, nombre_empleado FROM Usuarios WHERE nombre_usuario = '"+nombre_usuario+"' && contrasenia_usuario = '"+contrasenia_usuario+"'");
//            sentencia_preparada = conexion_UC1.prepareStatement(Sentencia_Buscar_Usuario);
//            resultado = sentencia_preparada.executeQuery();
//            if (resultado.next()) 
//            {
//                busqueda_usuario = "usuario encontrado";                
//            }
//            else
//            {
//                busqueda_usuario = "usuario no encontrado";
//            }
//            
//        }
//        catch (Exception a)
//        {
//            /*Variante A*/
//            /*
//            JTextArea msg = new JTextArea("Error en la busqueda del nombre/na/Error: '"+a+"'");
//            msg.setLineWrap(true);
//            msg.setWrapStyleWord(true);
//            JScrollPane scrollPane = new JScrollPane(msg);
//            JOptionPane.showMessageDialog(null,scrollPane, "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);
//            */
//            /*Variante B*/
//            /*JOptionPane.showMessageDialog(null,"Error en la busqueda del nombre/n/Error: '"+a+"'", "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);*/
//            /*Variante C*/
//            JOptionPane.showMessageDialog(null,"<html>Error ocurrido durante la busqueda del usuario<br>Error: '"+a+"'</html>", "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);
//        }
//        return busqueda_usuario;
//        //Variante B//
//        /*
//        String busqueda_usuario = null;
//        Connection conexion_UC1 = null;
//        try 
//        {
//            conexion_UC1 = Conexion.conectar();
//            String Sentencia_Buscar_Usuario = ("SELECT nombre_usuario, contrasenia_usuario, nombre_empleado FROM Usuarios WHERE nombre_usuario = '"+nombre_usuario+"' && contrasenia_usuario = '"+contrasenia_usuario+"'");
//            sentencia_preparada = conexion_UC1.prepareStatement(Sentencia_Buscar_Usuario);
//            resultado = sentencia_preparada.executeQuery();
//            if (resultado.next()) 
//            {
//                JOptionPane.showMessageDialog(null,"Se ha encontrado el usuario ingresado", "Exito en el inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
//                FrmMain llamar = new FrmMain();
//                llamar.setVisible(true);
//                llamar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null,"No se ha encontrado el usuario ingresado", "Fallo en el inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
//            }
//            conexion_UC1.close();
//            }
//        catch (Exception a)
//        {
//            JOptionPane.showMessageDialog(null,"Error en el inicio de sesión/Error: '"+a+"'", "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);
//        }
//        return busqueda_usuario;
//        */
//    }

    
//    public boolean modificarCita(){
//        boolean resp=false;
//        try{
//            
//        }
//        
//    }
    public boolean login(String usuario, String clave) {
        boolean retorno = false;
        try {
            String consulta;
            consulta = "Select * from Usuarios where nombre_usuario = ? and contrasenia_usuario = ?";

            PreparedStatement Prepared;
            conexion con = new conexion();

            Prepared = con.conectar().prepareStatement(consulta);
            Prepared.setString(1, usuario);
            Prepared.setString(2, clave);

            ResultSet Resultado = Prepared.executeQuery();
        if (Resultado.next()) {
                  retorno = true;
              }
          } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Error"+ex);
          }   
          return retorno;
      }
}
