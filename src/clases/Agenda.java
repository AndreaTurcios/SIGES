package clases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 15-CW0001la
 */
public class Agenda {
      private Connection cn;
            String and;
            String and1;
            String and2;
            private String Fecha;
            private Integer Citas_P = 1;
            private Integer Citas_Co = 2;
            private Integer Citas_Ca = 3;
            private Integer DUI;
    
      public Agenda(){
        Conexion con = new Conexion();
        cn = con.conectar(); 
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);  
        String Ahora = año + "-" + (mes+1) + "-" + dia;
        Fecha = Ahora;
        
    }       
        
    public DefaultTableModel BuscarTabla(String busqueda) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Estado");
        modelo.addColumn("Dui del cliente");
        try {
            String sql = "SELECT c.ID_consulta, c.consulta_fecha, c.consulta_hora, e.estado, c.ID_DUI FROM Consulta c, Tipo_estado e \n" +
            "WHERE c.ID_estado = e.ID_estado \n"
            + "and ID_DUI = ?";
            Conexion con = new Conexion();
            cn = con.conectar();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, busqueda);
            ResultSet rs = ps.executeQuery();
            Object[] cas = new Object[5];
            while (rs.next()) {
                cas[0] = rs.getInt(1);
                cas[1] = rs.getString(2);
                cas[2] = rs.getString(3);
                cas[3] = rs.getString(4);
                cas[4] = rs.getString(5);
                modelo.addRow(cas);
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return modelo;
    }
    
    public void listarCitas(Connection cn, JTable tabla) {
        //cn = conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Fecha", "Hora", "Estado", "Dui del cliente"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT c.ID_cita, c.cita_fecha, c.cita_hora, e.estado, c.ID_DUI FROM Citas c, Tipo_estado e \n" +
            "WHERE c.ID_estado = e.ID_estado ";
        System.out.println("datos "+sql);
        String [] filas = new String[6];
        Statement st = null;
       // PreparedStatement cnn = null;
        ResultSet rs = null;
         System.out.println("ingresa");
        try{
            st = cn.createStatement();
//            cnn = cn.prepareStatement(sql);
            rs = st.executeQuery(sql);
  //          rs = cnn.executeQuery();
            System.out.println("comprobacion "+rs);
            while (rs.next()){
                for (int i = 1; i < 6; i++) {
                    filas[i-1] = rs.getString(i);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar "+e);
        }
    }
    public void CargarCitas(JTable tabla) {
        listarCitas(cn ,tabla);
    }
    public void listarProgramados(Connection cn, JTable tabla) {        
        and1= "and c.cita_fecha = '" + Fecha + "' \n";
        and2= "and e.ID_estado = '" + Citas_P + "'";
        
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Fecha", "Hora", "Estado", "Dui del cliente"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT c.ID_cita, c.cita_fecha, c.cita_hora, e.estado, c.ID_DUI FROM Citas c, Tipo_estado e \n" +
        "WHERE c.ID_estado = e.ID_estado\n" 
        + and1 
        + and2;

        
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }   
    public void CargarProgramados(JTable tabla){
        listarProgramados(cn, tabla);
    }
    
    public void listarConsultasProgramadas(Connection cn, JTable tabla) {        
        and1= "and c.consulta_fecha = '" + Fecha + "' \n";
        and2= "and e.ID_estado = '" + Citas_P + "'";
        
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Fecha", "Hora", "Estado", "Dui del cliente"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT c.ID_consulta, c.consulta_fecha, c.consulta_hora, e.estado, c.ID_DUI FROM Consulta c, Tipo_estado e \n" +
        "WHERE c.ID_estado = e.ID_estado\n" 
        + and1 
        + and2;

        
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }   
    public void CargarConsultasProgramadas(JTable tabla){
        listarConsultasProgramadas(cn, tabla);
    }
    
    public void listarCompletadas(Connection cn, JTable tabla) {        
        and1= "and c.cita_fecha = '" + Fecha + "' \n";
        and2= "and e.ID_estado = '" + Citas_Co + "'";
        
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Fecha", "Hora", "Estado", "Dui del cliente"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT c.ID_cita, c.cita_fecha, c.cita_hora, e.estado, c.ID_DUI FROM Citas c, Tipo_estado e \n" +
        "WHERE c.ID_estado = e.ID_estado\n" 
        + and1 
        + and2;

        
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }   
    public void CargarCompletadas(JTable tabla){
        listarCompletadas(cn, tabla);
    }
    
    public void listarConsultasCompletadas(Connection cn, JTable tabla) {        
        and1= "and c.consulta_fecha = '" + Fecha + "' \n";
        and2= "and e.ID_estado = '" + Citas_Co + "'";
        
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Fecha", "Hora", "Estado", "Dui del cliente"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT c.ID_consulta, c.consulta_fecha, c.consulta_hora, e.estado, c.ID_DUI FROM Consulta c, Tipo_estado e \n" +
        "WHERE c.ID_estado = e.ID_estado\n" 
        + and1 
        + and2;

        
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }   
    public void CargarConsultasCompletadas(JTable tabla){
        listarConsultasCompletadas(cn, tabla);
    }
    public void listarCanceladas(Connection cn, JTable tabla) {        
        and1= "and c.cita_fecha = '" + Fecha + "' \n";
        and2= "and e.ID_estado = '" + Citas_Ca + "'";
        
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Fecha", "Hora", "Estado", "Dui del cliente"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT c.ID_cita, c.cita_fecha, c.cita_hora, e.estado, c.ID_DUI FROM Citas c, Tipo_estado e \n" +
        "WHERE c.ID_estado = e.ID_estado\n" 
        + and1 
        + and2;

        
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }   
    public void CargarCanceladas(JTable tabla){
        listarCanceladas(cn, tabla);
    }
    public void listarConsultasCanceladas(Connection cn, JTable tabla) {        
        and1= "and c.consulta_fecha = '" + Fecha + "' \n";
        and2= "and e.ID_estado = '" + Citas_Ca + "'";
        
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Fecha", "Hora", "Estado", "Dui del cliente"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT c.ID_consulta, c.consulta_fecha, c.consulta_hora, e.estado, c.ID_DUI FROM Consulta c, Tipo_estado e \n" +
        "WHERE c.ID_estado = e.ID_estado\n" 
        + and1 
        + and2;

        
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }   
    public void CargarConsultasCanceladas(JTable tabla){
        listarConsultasCanceladas(cn, tabla);
    }
    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Citas_P
     */
    public Integer getCitas_P() {
        return Citas_P;
    }

    /**
     * @param Citas_P the Citas_P to set
     */
    public void setCitas_P(Integer Citas_P) {
        this.Citas_P = Citas_P;
    }

    /**
     * @return the Citas_Co
     */
    public Integer getCitas_Co() {
        return Citas_Co;
    }

    /**
     * @param Citas_Co the Citas_Co to set
     */
    public void setCitas_Co(Integer Citas_Co) {
        this.Citas_Co = Citas_Co;
    }

    /**
     * @return the Citas_Ca
     */
    public Integer getCitas_Ca() {
        return Citas_Ca;
    }

    /**
     * @param Citas_Ca the Citas_Ca to set
     */
    public void setCitas_Ca(Integer Citas_Ca) {
        this.Citas_Ca = Citas_Ca;
    }

    /**
     * @return the DUI
     */
    public Integer getDUI() {
        return DUI;
    }

    /**
     * @param DUI the DUI to set
     */
    public void setDUI(Integer DUI) {
        this.DUI = DUI;
    }



}
