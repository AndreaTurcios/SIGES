/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Conexion;
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
 * @author estef
 */
public class Facturas {
     private Connection Cn;
    private Conexion conexion;
    private Integer ID_factura;
    private String nombre_pagador;
    private Integer ID_detalle;
    private Integer ID_consulta;
    private Integer ID_producto;

    public Connection getCn() {
        return Cn;
    }

    public void setCn(Connection Cn) {
        this.Cn = Cn;
    }

    public Conexion getconexion() {
        return conexion;
    }

    public void setconexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public Integer getID_factura() {
        return ID_factura;
    }

    public void setID_factura(Integer ID_factura) {
        this.ID_factura = ID_factura;
    }

    public String getnombre_pagador() {
        return nombre_pagador;
    }

    public void setnombre_pagador(String nombre_pagador) {
        this.nombre_pagador = nombre_pagador;
    }
    
    public Integer getID_detalle() {
        return ID_detalle;
    }

    public void setID_detalle(Integer ID_detalle) {
        this.ID_detalle = ID_detalle;
    }
    
    public Integer getID_consulta() {
        return ID_consulta;
    }

    public void setID_consulta(Integer ID_consulta) {
        this.ID_consulta = ID_consulta;
    }
    
    public Integer getID_producto() {
        return ID_producto;
    }

    public void setID_producto(Integer ID_producto) {
        this.ID_producto = ID_producto;
    }
    
    public Pool getMetodospool(){
        return metodospool;
    }
    
    private void  setMetodospool(Pool metodospool ){
       this.metodospool = metodospool;
    }
        
    
    
     Pool metodospool = new Pool();
    public boolean Guardar(){
        try {
            boolean resp = false;
            Cn = Conexion.conectar();
            String sql = "INSERT INTO Factura (nombre_pagador, ID_detalle, ID_consulta, ID_producto)"+"VALUES(?, ?, ?, ?)";
            PreparedStatement cmd = Cn.prepareStatement(sql);

            cmd.setString(1, nombre_pagador);
            cmd.setInt(2, ID_detalle);
            cmd.setInt(3, ID_consulta);
            cmd.setInt(4, ID_producto);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error guardar Factura " + ex);
            return false;
        }
    }
    public boolean modificar() {

        try {
            boolean resp = false;
            Cn = Conexion.conectar();
            String sql = "UPDATE Factura SET nombre_pagador = ?, ID_detalle = ?, ID_consulta = ?, ID_producto = ? WHERE ID_factura = ?";
            PreparedStatement cmd = Cn.prepareStatement(sql);

            cmd.setString(1, nombre_pagador);
            cmd.setInt(2, ID_detalle);
            cmd.setInt(3, ID_consulta);
            cmd.setInt(4, ID_producto);
            cmd.setInt(5, ID_factura);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error guardar tipo empleado " + ex);
            return false;
        }
        }
    public boolean Eliminar() {
        boolean resp = false;
        Cn = Conexion.conectar();
        try {//realizando consulta insert
            String sql = "DELETE FROM Factura WHERE ID_factura =?;";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setInt(1, ID_factura);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
        } catch (Exception ex) {
            System.out.println("Error exception es"+ex.toString());
        }
        return resp;
    }     
    public void listarFactura(Connection Cn, JTable tabla){
        Cn = conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID_factura"," nombre_pagador", "ID_detalle", "ID_consulta", "ID_producto"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM Factura ORDER BY ID_factura";
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = Cn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("datos obtenidos "+rs);
            while (rs.next()){
                for (int i = 0; i < 5; i++) {
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
    public void CargarF (JTable tabla) {
        listarFactura(Cn ,tabla);
    }
    }