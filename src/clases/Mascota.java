package clases;
import clases.Pool;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Mascota {
    private Connection cn;
    private Integer ID_mascota;
    private String nombre_mascota;
    private String mascota_genero;
    private String ARescatado;

    public String getARescatado() {
        return ARescatado;
    }

    public void setARescatado(String ARescatado) {
        this.ARescatado = ARescatado;
    }
    private Integer ID_tipoMascota;
    private Integer ID_DUI;

    public Integer getID_DUI() {
        return ID_DUI;
    }

    public void setID_DUI(Integer ID_DUI) {
        this.ID_DUI = ID_DUI;
    }

    public Pool getMetodospool() {
        return metodospool;
    }

    public void setMetodospool(Pool metodospool) {
        this.metodospool = metodospool;
    }
    

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

    Pool metodospool = new Pool();
    public void consultarTipoMascota(JComboBox cbox_mascotat) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;

        String SSQL = "SELECT ID_tipoMascota, tipo_animal FROM Tipo_mascota ORDER BY ID_tipoMascota";
        try {
         
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_mascotat.addItem("Seleccione una opción");
            while (resultado.next()) {
                tipoMascota tm = new tipoMascota();
                tm.setID_tipoMascota(resultado.getInt("ID_tipoMascota"));
                tm.setTipo_animal(resultado.getString("tipo_animal"));
                cbox_mascotat.addItem(tm);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                    resultado.close();
                    resultado = null;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    public void CargarMascota(Connection cn, JTable tabla){
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_mascota", "nombre mascota", "mascota genero", "mascota rescatada", "Tipo mascota", "DUI"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT\n" +
"     Mascota.\"ID_mascota\" AS Mascota_ID_mascota,\n" +
"     Mascota.\"nombre_mascota\" AS Mascota_nombre_mascota,\n" +
"     Mascota.\"mascota_genero\" AS Mascota_mascota_genero,\n" +
"     Mascota.\"mascota_rescatada\" AS Mascota_mascota_rescatada,\n" +
"	Tipo_mascota.\"tipo_animal\" AS Tipo_mascota_tipo_animal,\n" +
"     Mascota.\"ID_DUI\" AS Mascota_ID_DUI,\n" +
"     \n" +
"     Cliente_duenio.\"ID_DUI\" AS Cliente_duenio_ID_DUI,\n" +
"     Cliente_duenio.\"duenio_nombre\" AS Cliente_duenio_duenio_nombre,\n" +
"     Cliente_duenio.\"duenio_apellidos\" AS Cliente_duenio_duenio_apellidos\n" +
"FROM\n" +
"     \"dbo\".\"Tipo_mascota\" Tipo_mascota INNER JOIN \"dbo\".\"Mascota\" Mascota ON Tipo_mascota.\"ID_tipoMascota\" = Mascota.\"ID_tipoMascota\"\n" +
"     INNER JOIN \"dbo\".\"Cliente_duenio\" Cliente_duenio ON Mascota.\"ID_DUI\" = Cliente_duenio.\"ID_DUI\"\n" +
"ORDER BY\n" +
"     Mascota.\"ID_mascota\" ASC";
        String [] filas = new String[6];
        Statement st = null;
        
        ResultSet rs = null;
        
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next()){
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar "+e);
        }
    }   
    
    public void CargarMascotas(JTable tabla){
        CargarMascota(getCn(), tabla);
    }
    
    public Mascota() {
        //estableciendo la conexion 
       clases.Conexion con = new clases.Conexion();
       cn = con.conectar();
       }
    //creando el metodo para modificar
    public boolean modificarMascota(){
    boolean resp = false;
    clases.Conexion con = new clases.Conexion();
    cn = con.conectar();
    try{//realizando consulta update
    String sql="UPDATE Mascota SET nombre_mascota=?, mascota_genero=?, " 
            + "mascota_rescatada=?,ID_tipoMascota=?,ID_DUI=? WHERE ID_mascota=?";
    PreparedStatement cmd = cn.prepareStatement(sql);
    //llenar los parametros como se encuentran en las clases
    cmd.setString(1, nombre_mascota);
    cmd.setString(2, mascota_genero);
    cmd.setString(3, ARescatado);
    cmd.setInt(4, ID_tipoMascota);
    cmd.setInt(5, ID_DUI);
    cmd.setInt(6, ID_mascota);
        
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
    public boolean guardarMascota(Mascota a){
        boolean resp = false;
        try{//realizando consulta insert
            String sql = "INSERT INTO Mascota (nombre_mascota, mascota_genero, mascota_rescatada, ID_tipoMascota, ID_DUI)"+"VALUES(?,?,?,?,?)";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setString(1, nombre_mascota);
    cmd.setString(2, mascota_genero);
    cmd.setString(3, ARescatado);
    cmd.setInt(4, ID_tipoMascota);
    cmd.setInt(5, ID_DUI);
//    cmd.setInt(6, ID_mascota);
            if (!cmd.execute()) {
                resp=true;
            }
            cmd.close();
            cn.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
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
            ARescatado = rs.getString(3);
            ID_tipoMascota = rs.getInt(6);
            }
            cmd.close();
            cn.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return resp;
        
    }

    @Override
    public String toString() {
        return nombre_mascota; //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getTipo_mascota() {
        return ID_tipoMascota;
    }
}
