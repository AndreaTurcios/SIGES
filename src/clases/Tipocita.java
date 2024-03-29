/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tipocita {

private Connection cn;
private Integer ID_tipoCita;
private String tipo_Cita;



    public Pool getMetodospool() {
        return metodospool;
    }

    public void setMetodospool(Pool metodospool) {
        this.metodospool = metodospool;
    }
    public Tipocita() {
        //estableciendo la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }



    

    public boolean guardar() {
        boolean resp = false;
//        String encriptada = md5(contrasenia_usuario);
        try {String sql = "INSERT INTO Tipo_citas (tipo_cita)"+"VALUES (?)";
        
        PreparedStatement cmd = getCn().prepareStatement(sql);
        
        cmd.setString(1, getTipo_Cita());
        
        if (!cmd.execute()) {
            resp = true;
        }
        cmd.close();
            getCn().close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    public boolean EliminarTipoCita ()
    {
        boolean resp = false;
        try 
        {
            String sql = "DELETE FROM Tipo_citas WHERE ID_tipoCita=?;";
            PreparedStatement cmd = getCn().prepareStatement(sql);
            cmd.setInt(1, getID_tipoCita());
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            getCn().close();
        } 
        catch (Exception ex) 
        {
            System.out.println("Error exception es "+ex.toString());
        }
        return resp;
    }
    public boolean modificar() {
         boolean resp = false;
        try {String sql = "UPDATE Tipo_citas SET  tipo_cita = ? WHERE ID_tipoCita = ?";
        
        PreparedStatement cmd = getCn().prepareStatement(sql);
        
        cmd.setString(1, getTipo_Cita());
        cmd.setInt(2, getID_tipoCita());
        
    
        
        if (!cmd.execute()) {
            resp = true;
        }
        cmd.close();
            getCn().close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    public boolean Consultar() {
        boolean resp = false;
        try {String sql = "SELECT ID_tipoCita, tipo_cita FROM Tipo_cita WERE ID_tipoCita = ? ";
        
        PreparedStatement cmd = getCn().prepareStatement(sql);
        cmd.setInt(1, getID_tipoCita());
        
        ResultSet rs = cmd.executeQuery();
        
        if (rs.next()) {
            resp = true;
                setID_tipoCita((Integer) rs.getInt(1));
                setTipo_Cita(rs.getString(2));
             
        }
        cmd.close();
            getCn().close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    public void EjecutarTipoCita(Connection cn, JTable tabla)
    {
        cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_tipoCita","tipo_cita"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Tipo_citas ORDER BY ID_tipoCita";
        String [] filas = new String[2];
        Statement st = null;
        ResultSet rs = null;
        try
        {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next())
            {
                filas[0] = rs.getString("ID_tipoCita");
                filas[1] = rs.getString("tipo_cita");
                model.addRow(filas);
            }
            rs.close();
            tabla.setModel(model);
            cn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "No se puede cargar la tabla del registro, Error en el crud_tipo_pago.java - Ejecutar_Tipo_Pago ERROR:" + e);        
        }
    }   
    
    public void CargarTipoCita(JTable tabla) 
    {
        EjecutarTipoCita(getCn(),tabla);
    }
    Pool metodospool = new Pool();
    public void consultarCitas(JComboBox cbox_mascotat) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;

        String SSQL = "SELECT ID_tipoCita, tipo_cita FROM Tipo_citas";
        try {
         
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_mascotat.addItem("Seleccione una opción");
            while (resultado.next()) {
                Tipocita tm = new Tipocita();
                tm.setID_tipoCita(resultado.getInt("ID_tipoCita"));
                tm.setTipo_Cita(resultado.getString("tipo_cita"));
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
    

    @Override
    public String toString() {
        return getTipo_Cita() ;
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
     * @return the ID_tipoCita
     */
    public Integer getID_tipoCita() {
        return ID_tipoCita;
    }

    /**
     * @param ID_tipoCita the ID_tipoCita to set
     */
    public void setID_tipoCita(Integer ID_tipoCita) {
        this.ID_tipoCita = ID_tipoCita;
    }

    /**
     * @return the tipo_Cita
     */
    public String getTipo_Cita() {
        return tipo_Cita;
    }

    /**
     * @param tipo_Cita the tipo_Cita to set
     */
    public void setTipo_Cita(String tipo_Cita) {
        this.tipo_Cita = tipo_Cita;
    }
    
    
}
