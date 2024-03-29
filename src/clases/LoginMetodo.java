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
import clases.Conexion;
import static clases.Conexion.conectar;
import java.sql.Statement;


public class LoginMetodo {
    //declaracion de los atributos
    private Connection cn;
    private Integer ID_usuario;
    private Date cita_fecha;
    private Time cita_hora;
    private Integer ID_tipoCita;
    private Integer ID_tipoUsuarios;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Integer getID_tipoCita() {
        return ID_tipoCita;
    }

    public void setID_tipoCita(Integer ID_tipoCita) {
        this.ID_tipoCita = ID_tipoCita;
    }

    public Integer getID_tipoUsuarios() {
        return ID_tipoUsuarios;
    }

    public void setID_tipoUsuarios(Integer ID_tipoUsuarios) {
        this.ID_tipoUsuarios = ID_tipoUsuarios;
    }
    
    public LoginMetodo() {
        //estableciendo la conexion
       Conexion con = new Conexion();
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
//    public boolean comprobarLvl(String usuario, String clave){
//     boolean retorno = false;
//        try {
//            String consulta;
//            
//            String encriptada = md5(clave);
//            consulta = "Select ID_usuario from Usuarios where nombre_usuario = ? and contrasenia_usuario = ?";
//
//            PreparedStatement Prepared;
//            Conexion con = new Conexion();
//
//            Prepared = con.conectar().prepareStatement(consulta);
//            Prepared.setString(1, usuario);
//            Prepared.setString(2, encriptada);
//
//            ResultSet Resultado = Prepared.executeQuery();
//        if (Resultado.next()) {
//                  retorno = true;
//                  ID_usuario   = Resultado.getInt(1);
//                  System.out.println(ID_usuario);
//              }
//          } catch (Exception ex) {
//          JOptionPane.showMessageDialog(null, "Error"+ex);
//          }   
//          return retorno;
//    }
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
//            conexion_UC1 = conexion.conectar();
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
//            conexion_UC1= conexion.conectar();
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
//            conexion_UC1 = conexion.conectar();
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
//            conexion_UC1 = conexion.conectar();
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
            
            String encriptada = md5(clave);
            consulta = "Select ID_usuario, ID_tipoUsuarios  from Usuarios where nombre_usuario = ? and contrasenia_usuario = ?";

            PreparedStatement Prepared;
            Conexion con = new Conexion();

            Prepared = con.conectar().prepareStatement(consulta);
            Prepared.setString(1, usuario);
            Prepared.setString(2, encriptada);

            ResultSet Resultado = Prepared.executeQuery();
        if (Resultado.next()) {
//            System.out.println("despues del " +ID_usuario);
//                  retorno = true;
//                  String sQLSelect2 = "Select ID_usuario , ID_tipoUsuarios from Usuarios where nombre_usuario = ? and contrasenia_usuario = ?";
//                  PreparedStatement cmd2 = cn.prepareStatement(sQLSelect2);
//                  System.out.println("despues del2" +ID_usuario);
//                  Prepared.setString(1, usuario);
//                  Prepared.setString(2, encriptada);
//<<<<<<< Upstream, based on origin/master
//                    ID_usuario   = Resultado.getInt(1);
////                  ID_tipoUsuarios   = Resultado.getInt(2);
//=======
////                  
//>>>>>>> 699ce74 Casi finalizando lo mio... Ya he trabajado: - Recuperación de contraseña por preguntas  - Mascotas - Dueños - Primer uso con encriptacion de contraseña - crud ficha clínica  - preguntas - detalle factura - Tipo estado - Login - Login admin //intentando hacer inicio de sesion por rol intentando citas (esta el crud, pero da error y no sé porque)
//                  System.out.println(ID_usuario);
//                  Resultado = cmd2.setInt(0, 0)
//                  Resultado = cmd2.executeQuery();
//                  if (Resultado.next()) {
                      ID_usuario   = Resultado.getInt("ID_usuario");
                  ID_tipoUsuarios  = Resultado.getInt("ID_tipoUsuarios");
                  retorno = true;
                  
//              }
              }
          } catch (SQLException ex) {
              System.out.println("clases.LoginMetodo.login()"+ ex);
          JOptionPane.showMessageDialog(null, "Error"+ex);
          }   
          return retorno;
      }
    
        public boolean agregarBitacora(){
            boolean retorno = false;
            try{
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Inicio de sesion','Select', @fecha, "+ID_usuario+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(SQLException e){
                System.out.println("login"+e.toString());
            }
            return retorno;

        }
     public boolean loginR(Integer ID_usuario, Integer ID_pregunta) {
        boolean retorno = false;
        try {
            String consulta;
            
            consulta = "Select * from preguntas where ID_usuario = ? and ID_pregunta = ?";

            PreparedStatement Prepared;
            Conexion con = new Conexion();

            Prepared = con.conectar().prepareStatement(consulta);
            Prepared.setInt(2, ID_pregunta);
            Prepared.setInt(1, ID_usuario);

            ResultSet Resultado = Prepared.executeQuery();
        if (Resultado.next()) {
                  retorno = true;
              }
          } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Error"+ex);
          }   
          return retorno;
      }
    public boolean loginadmin (String usuario, String contrasenia) {
        boolean retorno = false;
        try {
            String encriptada = md5(contrasenia);
            String consulta;
            consulta = "Select * from Usuarios where ID_tipoUsuarios=1 and nombre_usuario = ? and contrasenia_usuario = ?;";

            PreparedStatement Prepared;
            Conexion con = new Conexion();

            Prepared = con.conectar().prepareStatement(consulta);
            Prepared.setString(1, usuario);
            Prepared.setString(2, encriptada);
            

            ResultSet Resultado = Prepared.executeQuery();
        if (Resultado.next()) {
                  retorno = true;
              }
          } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Ha ocurrido un error, consulte a un tecnico para resolver el problema "+ex);
          }   
          return retorno;
      }
    
        public String md5(String md5){
       try{
           java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
           byte[] array = md.digest(md5.getBytes());
           StringBuffer sb = new StringBuffer();  
           for (int i = 0; i < array.length; i++) {
               sb.append(Integer.toHexString((array[i] & 0xFF ) | 0x100).substring(1,3));
           }
           return sb.toString();
       }catch(java.security.NoSuchAlgorithmException c){
           
       }
    return null;
    }
     public static ResultSet Consulta(String consulta){
      Connection con = conectar();
      Statement declara;
      try{
            declara= con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
      }catch(Exception e){
         System.out.println(e.getMessage());
     }
      return null;
    }

    /**
     * @return the ID_usuario
     */
    public Integer getID_usuario() {
        return ID_usuario;
    }

    /**
     * @param ID_usuario the ID_usuario to set
     */
    public void setID_usuario(Integer ID_usuario) {
        this.ID_usuario = ID_usuario;
    }
}
