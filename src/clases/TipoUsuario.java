
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
 * @author 15-CW0001la
 */
public class TipoUsuario {
    private Connection cn;
    private Conexion conexion;
    private Integer ID_tipoUsuarios;
    private String tipo_empleado;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Conexion getConexion() {
        return conexion;
    }
    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
    
    
    public Integer getID_TipoUsuario() {
        return ID_tipoUsuarios;
    }
    public void setID_tipoUsuarios(Integer ID_tipoUsuarios) {
        this.ID_tipoUsuarios = ID_tipoUsuarios;
    }
    
    
   public String gettipo_empleado() {
        return tipo_empleado;
    }

    public void settipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }
    
    
    
    public boolean Guardar() {
        try {
            boolean resp = false;
            cn = Conexion.conectar();
            String sql = "INSERT INTO Tipo_usuarios (tipo_empleado)"+"VALUES(?)";
            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, tipo_empleado);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error guardar tipo mpleado " + ex);
            return false;
        }
        }
    public boolean modificar() {

        try {
            boolean resp = false;
            cn = Conexion.conectar();
            String sql = "UPDATE Tipo_usuarios SET tipo_empleado = ? WHERE ID_tipoUsuarios = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, tipo_empleado);
            cmd.setInt(2, ID_tipoUsuarios);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error guardar tipo empleado " + ex);
            return false;
        }
        }
    public boolean Eliminar() {
        boolean resp = false;
        cn = Conexion.conectar();
        try {//realizando consulta insert
            String sql = "DELETE FROM Tipo_usuarios WHERE ID_tipoUsuarios=?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_tipoUsuarios);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println("Error exception es"+ex.toString());
        }
        return resp;
    }
    public void listarTusuario(Connection cn, JTable tabla){
        cn = conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_tipoUsuarios","Tipo empleado"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Tipo_usuarios ORDER BY ID_tipoUsuarios";
        String [] filas = new String[2];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next()){
                for (int i = 0; i < 2; i++) {
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
    public void CargarTusuario (JTable tabla) {
        listarTusuario(cn ,tabla);
    }

    @Override
    public String toString() {
        return  tipo_empleado;
    }
    
    
}
