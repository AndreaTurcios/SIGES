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
 * @author 15-CW0001la
 */
public class ControlProveedores {
    private Connection cn;
    private Integer ID_proveedor;
    private String nombre_proveedor;
    private String rubro;
    private String direccion;
    private String correo;
    private String sitio_web;
    private Conexion conexion;

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Integer getID_proveedor() {
        return ID_proveedor;
    }

    public void setID_proveedor(Integer ID_proveedor) {
        this.ID_proveedor = ID_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSitio_web() {
        return sitio_web;
    }

    public void setSitio_web(String sitio_web) {
        this.sitio_web = sitio_web;
    }
    public boolean guardarProveedor(ControlProveedores a){
        boolean resp = false;
        try{//realizando consulta insert
            String sql = "INSERT INTO Mascota (nombre_mascota, mascota_genero, mascota_rescatada, ID_tipoMascota, ID_DUI)"+"VALUES(?,?,?,?,?)";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setString(1, nombre_proveedor);
            cmd.setString(2, rubro);
            cmd.setString(3, direccion);
            cmd.setString(4, correo);
            cmd.setString(5, sitio_web);
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
     public void CargarProveedor(Connection cn, JTable tabla){
        cn = conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_proveedor", "nombre_proveedor", "rubro", "domicilio", "correo", "sitio web"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Proveedores ORDER BY ID_proveedor";
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
    public void CargarProveedores(JTable tabla){
        CargarProveedor(getCn(), tabla); 
    }
}
