package clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Cliente_duenio {

    private Connection cn;
    private conexion conexion;
    private Integer ID_DUI;
    private String duenio_nombre;
    private String duenio_apellidos;
    private Integer duenio_telefono;
    private String duenio_domicilio;
    private String duenio_correo;
    private Date Fecha_e_DUI;
    private String nacionalidad;
    private Integer codigo_zona;
    private Integer ID_tipoCliente;
    private Integer ID_Mascota;

    public String getDuenio_nombre() {
        return duenio_nombre;
    }

    public void setDuenio_nombre(String duenio_nombre) {
        this.duenio_nombre = duenio_nombre;
    }

    public String getDuenio_apellidos() {
        return duenio_apellidos;
    }

    public void setDuenio_apellidos(String duenio_apellidos) {
        this.duenio_apellidos = duenio_apellidos;
    }

    public Integer getDuenio_telefono() {
        return duenio_telefono;
    }

    public void setDuenio_telefono(Integer duenio_telefono) {
        this.duenio_telefono = duenio_telefono;
    }

    public String getDuenio_domicilio() {
        return duenio_domicilio;
    }

    public void setDuenio_domicilio(String duenio_domicilio) {
        this.duenio_domicilio = duenio_domicilio;
    }

    public String getDuenio_correo() {
        return duenio_correo;
    }

    public void setDuenio_correo(String duenio_correo) {
        this.duenio_correo = duenio_correo;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Integer getID_DUI() {
        return ID_DUI;
    }

    public void setID_DUI(Integer ID_DUI) {
        this.ID_DUI = ID_DUI;
    }

    public Date getFecha_e_DUI() {
        return Fecha_e_DUI;
    }

    public void setFecha_e_DUI(Date Fecha_e_DUI) {
        this.Fecha_e_DUI = Fecha_e_DUI;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getCodigo_zona() {
        return codigo_zona;
    }

    public void setCodigo_zona(Integer codigo_zona) {
        this.codigo_zona = codigo_zona;
    }

    public Integer getID_tipoCliente() {
        return ID_tipoCliente;
    }

    public void setID_tipoCliente(Integer ID_tipoCliente) {
        this.ID_tipoCliente = ID_tipoCliente;
    }

    public Integer getID_Mascota() {
        return ID_Mascota;
    }

    public void setID_Mascota(Integer ID_Mascota) {
        this.ID_Mascota = ID_Mascota;
    }

    public boolean modificarCliente() {
        boolean resp = false;
        try {//realizando consulta update
            // conexion = new conexion();
            System.err.println("conexion" + cn);
            String sql = "UPDATE Cliente_duenio SET ID_DUI=?,duenio_nombre=?, duenio_apellidos=?, "
                    + "duenio_telefono=?, duenio_domicilio=?, duenio_correo=?,Fecha_e_DUI=?,nacionalidad=?,codigo_zona=?,ID_tipoCliente=? WHERE ID_Mascota=?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //llenar los parametros como se encuentran en las clases
            cmd.setInt(1, ID_DUI);
            System.out.println(ID_DUI);
            cmd.setString(2, duenio_nombre);
            System.out.println(duenio_nombre);
            cmd.setString(3, duenio_apellidos);
            System.out.println(duenio_apellidos);
            cmd.setInt(4, duenio_telefono);
            System.out.println(duenio_telefono);
            cmd.setString(5, duenio_domicilio);
            System.out.println(duenio_domicilio);
            cmd.setString(6, duenio_correo);
            System.out.println(duenio_correo);
            cmd.setDate(7, Fecha_e_DUI);
            System.out.println(Fecha_e_DUI);
            cmd.setString(8, nacionalidad);
            System.out.println(nacionalidad);
            cmd.setInt(9, codigo_zona);
            System.out.println(codigo_zona);
            cmd.setInt(10, ID_tipoCliente);
            System.out.println(ID_tipoCliente);
            cmd.setInt(11, ID_Mascota);
            System.out.println(ID_Mascota);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return resp;
    }

    public boolean EliminarCliente() {
        boolean resp = false;
        try {//realizando consulta insert
            String sql = "DELETE FROM Cliente_duenio WHERE ID_mascota=?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_DUI);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return resp;
    }

    public boolean guardarCliente() {

        try {//realizando consulta insert
            boolean resp = false;
            cn = conexion.conectar();
            System.err.println("Estado " + cn.getClientInfo());
            String sql = "INSERT INTO Cliente_duenio (ID_DUI,duenio_nombre, duenio_apellidos, "
                    + "duenio_telefono, duenio_domicilio, duenio_correo,Fecha_e_DUI,nacionalidad,codigo_zona,ID_tipoCliente,ID_Mascota)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            String sql2 = "INSERT INTO Cliente_duenio"
                    + "           (ID_DUI"
                    + "           ,duenio_nombre"
                    + "           ,duenio_apellidos"
                    + "           ,duenio_telefono"
                    + "           ,duenio_domicilio"
                    + "           ,duenio_correo"
                    + "           ,Fecha_e_DUI"
                    + "           ,nacionalidad"
                    + "           ,codigo_zona"
                    + "           ,ID_tipoCliente"
                    + "           ,ID_Mascota)"
                    + "     VALUES"
                    + "           (?"
                    + "           ,?"
                    + "           ,?"
                    + "           ,?"
                    + "		   ,?"
                    + "           ,?"
                    + "           ,?"
                    + "           ,?"
                    + "           ,?"
                    + "           ,?"
                    + "           ,?)";
            PreparedStatement cmd = cn.prepareStatement(sql2);
            System.out.println("preparada" + cmd);
            cmd.setInt(1, ID_DUI);
            System.out.println("dui " + ID_DUI);
            cmd.setString(2, duenio_nombre);
            System.out.println(duenio_nombre);
            cmd.setString(3, duenio_apellidos);
            System.out.println(duenio_apellidos);
            cmd.setInt(4, duenio_telefono);
            System.out.println(duenio_telefono);
            cmd.setString(5, duenio_domicilio);
            System.out.println(duenio_domicilio);
            cmd.setString(6, duenio_correo);
            System.out.println(duenio_correo);
            cmd.setDate(7, Fecha_e_DUI);
            System.out.println("feca" + Fecha_e_DUI);
            cmd.setString(8, "hola");
            System.out.println("naci" + nacionalidad);
            cmd.setInt(9, codigo_zona);
            System.out.println("cod zona" + codigo_zona);
            cmd.setInt(10, 1);
            System.out.println("TIPO " + ID_tipoCliente);
            cmd.setInt(11, 1);
            System.out.println("mas " + ID_Mascota);
            /*cmd.setInt(1, ID_DUI);
            cmd.setString(2, duenio_nombre);
            cmd.setString(3, duenio_apellidos);
            cmd.setInt(4, duenio_telefono);
            cmd.setString(5, duenio_domicilio);
            cmd.setString(6, duenio_correo);
            cmd.setDate(7, Fecha_e_DUI);
            cmd.setString(8, nacionalidad);
            cmd.setInt(9, codigo_zona);
            cmd.setInt(10, ID_tipoCliente);
            cmd.setInt(11, ID_Mascota);*/
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

    public boolean consultarCliente() {
        boolean resp = false;
        try {//realizando consulta insert
            String sql = "SELECT ID_DUI=?,duenio_nombre=?, duenio_apellidos=?, "
                    + "duenio_telefono=?, duenio_domicilio=?, duenio_correo=?,Fecha_e_DUI=?,nacionalidad=?,codigo_zona=?,ID_tipoCliente=? FROM Cliente_dueño WHERE ID_DUI=?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, ID_DUI);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                resp = true;
                duenio_nombre = rs.getString(1);
                duenio_apellidos = rs.getString(2);
                duenio_telefono = rs.getInt(3);
                duenio_domicilio = rs.getString(4);
                duenio_correo = rs.getString(5);
                Fecha_e_DUI = rs.getDate(6);
                nacionalidad = rs.getString(7);
                codigo_zona = rs.getInt(8);
                ID_tipoCliente = rs.getInt(9);
                ID_Mascota = rs.getInt(10);
            }
            cmd.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return resp;

    }
    
    public Date formatoDate(long f){
        return new Date(f);
    }
}
