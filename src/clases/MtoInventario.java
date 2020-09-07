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

/**
 *
 * @author Estrada
 */
public class MtoInventario {
    private Connection cn;
    
    public MtoInventario(){
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    private Pool metodospool = new Pool();
    
    public void listarProductos(Connection cn, JTable tabla){
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Producto", "Codigo", "Fecha de entrada", "Costo", "Fecha de expiracion", "Tipo de producto", "Proveedor"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT ID_inventario, producto, codigo_producto, fecha_entrada, costo_producto, fecha_expiracion, t.tipo_producto, p.nombre_proveedor FROM Tipo_producto t,Inventario i, Proveedores p  WHERE i.ID_tipoProductos = t.ID_tipoProducto AND i.ID_proveedor = p.ID_proveedor ORDER BY ID_inventario";
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
    
    public void consultarProveedor(JComboBox cbox_consulta) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;

        String SSQL = "SELECT nombre_proveedor FROM Proveedores ORDER BY ID_proveedor";
        try {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_consulta.addItem("Seleccione una opción");
            while (resultado.next()) {
                cbox_consulta.addItem(resultado.getString("nombre_proveedor"));
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
    
    public void consultarTipoProducto(JComboBox cbox_consulta) {
        java.sql.Connection cn = null;
        PreparedStatement st = null;
        ResultSet resultado = null;

        String SSQL = "SELECT tipo_producto FROM Tipo_producto ORDER BY ID_tipoProducto";
        try {
            cn = metodospool.dataSource.getConnection();
            st = cn.prepareStatement(SSQL);
            resultado = st.executeQuery();
            cbox_consulta.addItem("Seleccione una opción");
            while (resultado.next()) {
                cbox_consulta.addItem(resultado.getString("tipo_producto"));
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
}
