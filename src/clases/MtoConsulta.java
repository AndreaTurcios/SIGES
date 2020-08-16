/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estrada
 */
public class MtoConsulta {
    
    private Connection cn;
    private Conexion conexion;
    private Integer ID;
    private Date Fecha;
    private Integer Tipo;
    private Integer DUI;
    private Integer Estado;
    
    public MtoConsulta(){
        Conexion con = new Conexion();
        cn = con.conectar(); 
    }    
    
    private Pool metodospool = new Pool();
    
    public Date formatoDate(long f) {
        return new Date(f);
    }
        
    public boolean guardar() {

        try {//realizando consulta insert
            boolean resp = false;  
            cn = conexion.conectar();
            System.err.println("Estado " + cn.getClientInfo());
            String sql = "INSERT INTO Consulta (consulta_fecha, ID_estado, ID_tipoConsulta, ID_DUI)"+"VALUES(?,?,?, ?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            System.out.println("preparada" + cmd);
            cmd.setDate(1, Fecha);
            cmd.setInt(2, Estado);
            cmd.setInt(3, Tipo);
            cmd.setInt(4, DUI);
            System.out.println("fecha" + Fecha);
            System.out.println(Estado);
            System.out.println(Tipo);
            System.out.println(DUI);
            
            System.out.println("veamos " + cmd);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error al guardar la consulta " + ex);
            return false;
        }
    }
    
    public boolean modificar() {
       boolean resp = false;
        cn = Conexion.conectar();
       try{
       String sql = "UPDATE Consulta SET consulta_fecha = ?, ID_estado=?, ID_tipoConsulta=? ,ID_DUI = ? WHERE ID_consulta =?;";
       PreparedStatement cmd = cn.prepareStatement(sql);
       cmd.setDate(1, Fecha);
       cmd.setInt(2, Estado);
       cmd.setInt(3, Tipo);
       cmd.setInt(4, DUI);
       cmd.setInt(5, ID);
       
           if (!cmd.execute()) {
               resp = true;
           }
           cmd.close();
           cn.close();
       }catch(Exception e){
       System.out.println(e.toString());
       }
       return resp;
    }
    
    public boolean consultar(){
        boolean resp = false;
        try{
            //Realizar consulta SELECT
            String sql = "SELECT  consulta_fecha, ID_estado , ID_tipoConsulta, ID_DUI"
                    + "FROM Consulta WHERE ID_consulta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);//Llenar los parametros
            //Ejecutar la consulta
            //pedira importar la ResultSet
            cmd.setInt(1, ID);
            //Recorrer la lista de registros
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next()) {
                resp = true;
                //asignandole a los atributos de la clase
                Fecha = rs.getDate(1);
                Estado = rs.getInt(2);
                Tipo = rs.getInt(3);
                DUI = rs.getInt(4);
                
            }
            cmd.close();
            cn.close();           
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }   
        
    
    public void listarConsultas(Connection cn, JTable tabla) {        

        
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Fecha", "Hora", "Tipo de consulta", "Dui del cliente"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT c.ID_consulta, c.consulta_fecha, c.consulta_hora, c.ID_tipoConsulta ,c.ID_DUI FROM Consulta c";

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
    public void CargarConsultas(JTable tabla){
        listarConsultas(cn, tabla);
    }
    
    public void consultarTipoConsulta(JComboBox cbox_consulta) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;

        String SSQL = "SELECT tipo_consulta FROM Tipo_consulta ORDER BY ID_tipoConsulta";
        try {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_consulta.addItem("Seleccione una opción");
            while (resultado.next()) {
                cbox_consulta.addItem(resultado.getString("tipo_consulta"));
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
    
    public void consultarDUI(JComboBox cbox_DUI) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;

        String SSQL = "SELECT ID_DUI FROM Cliente_duenio ORDER BY ID_DUI";
        try {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_DUI.addItem("Seleccione una opción");
            while (resultado.next()) {
                cbox_DUI.addItem(resultado.getString("ID_DUI"));
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
    
     public void consultarEstado(JComboBox cbox_Estado) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;

        String SSQL = "SELECT estado FROM Tipo_estado ORDER BY ID_estado";
        try {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_Estado.addItem("Seleccione una opción");
            while (resultado.next()) {
                cbox_Estado.addItem(resultado.getString("estado"));
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
     * @return the ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Tipo
     */
    public Integer getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(Integer Tipo) {
        this.Tipo = Tipo;
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

    /**
     * @return the Estado
     */
    public Integer getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(Integer Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the metodospool
     */
    public Pool getMetodospool() {
        return metodospool;
    }

    /**
     * @param metodospool the metodospool to set
     */
    public void setMetodospool(Pool metodospool) {
        this.metodospool = metodospool;
    }
}
