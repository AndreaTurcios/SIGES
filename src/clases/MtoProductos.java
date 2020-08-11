/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estrada
 */
public class MtoProductos {
        private Connection cn;
        private Integer ID_producto;
        private String Producto;
        private Integer Codigo;
        private String FechaE;
        private Double Costo;
        private String FechaEx;
        private Integer DUI;
        private Integer Tipo_producto;
        
    public MtoProductos(){
        conexion con = new conexion();
        cn = con.conectar();
    }
    public boolean guardar(){
        boolean resp  = false;
        try{
            //Realizar consulta INSERT
            String sql = "INSERT INTO Productos (producto, codigo_producto , fecha_entrada, costo_producto, fecha_expiracion, ID_DUI, ID_tipoProductos) "
            + "VALUES( ?, ?, ?, ?, ?, ?, ?)";//Se pasan por referencia por seguridad        
            //Pide importar clase PreparedStateMent
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla 
            cmd.setString(1, Producto);//codigo es como se definio en la clase aunque en la base se llama correlativo
            cmd.setInt(2, Codigo);
            cmd.setString(3, FechaE);
            cmd.setDouble(4, Costo);
            cmd.setString(5, FechaEx);
            cmd.setInt(6, DUI);
            cmd.setInt(7, Tipo_producto);
            //si da error devuelve 1, caso contrario 0
            //Tomar en cuenta el "!" de negacion
            
            if (!cmd.execute()) {
                resp = true;
            }
            //cerrando conexion
            cmd.close();
            cn.close();            
        }
    catch(Exception e){
        System.out.println(e.toString());
    }
        return resp;    
    } 
    public boolean modificar(){
        boolean resp = false;
        try{
            //Realizar consulta UPDATE 
            String sql = "UPDATE Productos SET producto = ? , codigo_producto = ?, fecha_entrada = ?, costo_producto = ?, fecha_expiracion = ?, ID_DUI = ? , ID_tipoProductos = ? WHERE ID_producto = ?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros como esta en la clase 
            cmd.setString(1, Producto);
            cmd.setInt(2, Codigo);
            cmd.setString(3, FechaE);
            cmd.setDouble(4, Costo);
            cmd.setString(5, FechaEx);
            cmd.setInt(6, DUI);
            cmd.setInt(7, Tipo_producto);
            cmd.setInt(8, ID_producto);
            //Si da error devuelve 1, caso contrario 0
            //Tomar en cuenta el "!" de negacion
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();           
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }
    public boolean consultar(){
        boolean resp = false;
        try{
            //Realizar consulta SELECT
            String sql = "SELECT  producto, codigo_producto , fecha_entrada, costo_producto, fecha_expiracion, ID_DUI, ID_tipoProductos "
                    + "FROM Productos WHERE ID_producto = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);//Llenar los parametros
            //Ejecutar la consulta
            //pedira importar la ResultSet
            cmd.setInt(1, ID_producto);
            //Recorrer la lista de registros
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next()) {
                resp = true;
                //asignandole a los atributos de la clase
                Producto = rs.getString(1);
                Codigo = rs.getInt(2);
                FechaE = rs.getString(3);
                Costo = rs.getDouble(4);
                FechaEx = rs.getString(5);
                DUI = rs.getInt(6);
                Tipo_producto = rs.getInt(7);
                
            }
            cmd.close();
            cn.close();           
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }
    public void listarProductos(Connection cn, JTable tabla){
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Producto", "Codigo", "Fecha de entrada", "Costo", "Fecha de expiracion", "DUI", "Tipo de producto"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM Productos ORDER BY ID_producto";
        String [] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 8; i++) {
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
    public void CargarProductos(JTable tabla){
        listarProductos(getCn(), tabla);
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
     * @return the ID_producto
     */
    public Integer getID_producto() {
        return ID_producto;
    }

    /**
     * @param ID_producto the ID_producto to set
     */
    public void setID_producto(Integer ID_producto) {
        this.ID_producto = ID_producto;
    }

    /**
     * @return the Producto
     */
    public String getProducto() {
        return Producto;
    }

    /**
     * @param Producto the Producto to set
     */
    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    /**
     * @return the FechaE
     */
    public String getFechaE() {
        return FechaE;
    }

    /**
     * @param FechaE the FechaE to set
     */
    public void setFechaE(String FechaE) {
        this.FechaE = FechaE;
    }

    /**
     * @return the Costo
     */
    public Double getCosto() {
        return Costo;
    }

    /**
     * @param Costo the Costo to set
     */
    public void setCosto(Double Costo) {
        this.Costo = Costo;
    }

    /**
     * @return the FechaEx
     */
    public String getFechaEx() {
        return FechaEx;
    }

    /**
     * @param FechaEx the FechaEx to set
     */
    public void setFechaEx(String FechaEx) {
        this.FechaEx = FechaEx;
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
     * @return the Tipo_producto
     */
    public Integer getTipo_producto() {
        return Tipo_producto;
    }

    /**
     * @param Tipo_producto the Tipo_producto to set
     */
    public void setTipo_producto(Integer Tipo_producto) {
        this.Tipo_producto = Tipo_producto;
    }

    /**
     * @return the Codigo
     */
    public Integer getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }
}
