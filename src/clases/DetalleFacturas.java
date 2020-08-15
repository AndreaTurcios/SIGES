/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DetalleFacturas {
    private Connection cn; 
    private Conexion conexion;
    private Integer ID_detalle;
    private double monto_pagar;
    private Date fecha_emision;
    private String  TipoPago;

    public String getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }
    private Integer ID_tipoPago;

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

    public Integer getID_detalle() {
        return ID_detalle;
    }

    public void setID_detalle(Integer ID_detalle) {
        this.ID_detalle = ID_detalle;
    }

    public double getMonto_pagar() {
        return monto_pagar;
    }

    public void setMonto_pagar(double monto_pagar) {
        this.monto_pagar = monto_pagar;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }
    
    public Date setfecha_emision(Date fecha_emision) {
        return fecha_emision;
    }
    
    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Integer getID_tipoPago() {
        return ID_tipoPago;
    }

    public void setID_tipoPago(Integer ID_tipoPago) {
        this.ID_tipoPago = ID_tipoPago;
    }
    public String toString() {
        return TipoPago;
    }
    public boolean EliminarFacturaD() {
        boolean resp = false;
        cn = conexion.conectar();
        try {//realizando consulta insert
            String sql = "DELETE FROM Detalle_factura WHERE ID_detalle=?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_detalle);
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
    public boolean guardarDetalle() {

        try {//realizando consulta insert
            boolean resp = false;
            cn = conexion.conectar();
            System.err.println("Estado " + cn.getClientInfo());
            String sql = "INSERT INTO Detalle_factura (monto_pagar, fecha_emision, ID_tipoPago)"+"VALUES(?,?,?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            System.out.println("preparada" + cmd);
//            cmd.setInt(1, ID_detalle);
            cmd.setDouble(1, monto_pagar);
            cmd.setDate(2, fecha_emision);
            cmd.setInt(3, ID_tipoPago);
            System.out.println("fecha" + fecha_emision);
            
            System.out.println("veamos " + cmd);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
            return resp;
        } catch (SQLException ex) {
            System.err.println("Error guardar Cliente2 " + ex);
            return false;
        }
        }
    public boolean modificarDetalle() {
       boolean resp = false;
        cn = Conexion.conectar();
       try{
       String sql = "UPDATE Detalle_factura SET monto_pagar = ?, fecha_emision=?, ID_tipoPago=? WHERE ID_detalle =?;";
       PreparedStatement cmd = cn.prepareStatement(sql);
       cmd.setDouble(1, monto_pagar);
       cmd.setDate(2, fecha_emision);
       cmd.setInt(3, ID_tipoPago);
       cmd.setInt(4, ID_detalle);
       
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
}
