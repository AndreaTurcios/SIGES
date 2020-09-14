/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
public class MtoInventario {
    private Connection cn;
    private Integer ID_inventario;
    private String Producto;
    private Integer Codigo;
    private Date FechaE;
    private String Costo;
    private Date FechaEx;
    private Integer Tipo_producto;
    private Integer Proveedor;
    
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
    
    public boolean guardar(){
        boolean resp  = false;
        try{
            //Realizar consulta INSERT
            String sql = "INSERT INTO Inventario (producto, codigo_producto , fecha_entrada, costo_producto, fecha_expiracion, ID_tipoProductos, ID_proveedor) "
            + "VALUES( ?, ?, ?, ?, ?, ?, ?)";//Se pasan por referencia por seguridad        
            //Pide importar clase PreparedStateMent
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla 
            cmd.setString(1, Producto);//codigo es como se definio en la clase aunque en la base se llama correlativo
            cmd.setInt(2, Codigo);
            cmd.setDate(3, FechaE);
            cmd.setString(4, Costo);
            cmd.setDate(5, FechaEx);
            cmd.setInt(6, Tipo_producto);
            cmd.setInt(7, Proveedor);
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
            String sql = "UPDATE Inventario SET producto = ? , codigo_producto = ?, fecha_entrada = ?, costo_producto = ?, fecha_expiracion = ?, ID_tipoProductos = ?, ID_proveedor = ? WHERE ID_inventario = ?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros como esta en la clase 
            cmd.setString(1, Producto);
            cmd.setInt(2, Codigo);
            cmd.setDate(3, FechaE);
            cmd.setString(4, Costo);
            cmd.setDate(5, FechaEx);
            cmd.setInt(6, Tipo_producto);
            cmd.setInt(7, Proveedor);
            cmd.setInt(8, ID_inventario);
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
    
    public boolean eliminar(){
         boolean resp = false;
          try {
              String sql = "DELETE FROM Inventario WHERE ID_inventario = ?";
              PreparedStatement cmd = cn.prepareStatement(sql);
              
              cmd.setInt(1, ID_inventario);

              if (!cmd.execute()) {
                resp = true;
                }
                
                cmd.close();
                cn.close();
          } catch (Exception e) {
              System.out.println(e.toString());
          }
         return resp;
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
     * @return the ID_inventario
     */
    public Integer getID_inventario() {
        return ID_inventario;
    }

    /**
     * @param ID_inventario the ID_inventario to set
     */
    public void setID_inventario(Integer ID_inventario) {
        this.ID_inventario = ID_inventario;
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

    /**
     * @return the FechaE
     */
    public Date getFechaE() {
        return FechaE;
    }

    /**
     * @param FechaE the FechaE to set
     */
    public void setFechaE(Date FechaE) {
        this.FechaE = FechaE;
    }

    /**
     * @return the Costo
     */
    public String getCosto() {
        return Costo;
    }

    /**
     * @param Costo the Costo to set
     */
    public void setCosto(String Costo) {
        this.Costo = Costo;
    }

    /**
     * @return the FechaEx
     */
    public Date getFechaEx() {
        return FechaEx;
    }

    /**
     * @param FechaEx the FechaEx to set
     */
    public void setFechaEx(Date FechaEx) {
        this.FechaEx = FechaEx;
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
     * @return the Proveedor
     */
    public Integer getProveedor() {
        return Proveedor;
    }

    /**
     * @param Proveedor the Proveedor to set
     */
    public void setProveedor(Integer Proveedor) {
        this.Proveedor = Proveedor;
    }

}
