package clases;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;

public class Cliente_dueño {
    private Connection cn;
    private Integer ID_DUI;
    private String dueño_nombre;
    private String dueño_apellidos;
    private Integer dueño_telefono;
    private String dueño_domicilio;
    private String dueño_correo;
    private Date Fecha_e_DUI;
    private String nacionalidad;
    private Integer codigo_zona;
    private Integer ID_tipoCliente;
    private Integer ID_Mascota;

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

    public String getDueño_nombre() {
        return dueño_nombre;
    }

    public void setDueño_nombre(String dueño_nombre) {
        this.dueño_nombre = dueño_nombre;
    }

    public String getDueño_apellidos() {
        return dueño_apellidos;
    }

    public void setDueño_apellidos(String dueño_apellidos) {
        this.dueño_apellidos = dueño_apellidos;
    }

    public Integer getDueño_telefono() {
        return dueño_telefono;
    }

    public void setDueño_telefono(Integer dueño_telefono) {
        this.dueño_telefono = dueño_telefono;
    }

    public String getDueño_domicilio() {
        return dueño_domicilio;
    }

    public void setDueño_domicilio(String dueño_domicilio) {
        this.dueño_domicilio = dueño_domicilio;
    }

    public String getDueño_correo() {
        return dueño_correo;
    }

    public void setDueño_correo(String dueño_correo) {
        this.dueño_correo = dueño_correo;
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
    public boolean modificarCliente(){
    boolean resp = false;
    try{//realizando consulta update
    String sql="UPDATE Cliente_dueño SET ID_DUI=?,dueño_nombre=?, dueño_apellidos=?, " 
            + "dueño_telefono=?, dueño_domicilio=?, dueño_correo=?,Fecha_e_DUI=?,nacionalidad=?,codigo_zona=?,ID_tipoCliente=? WHERE ID_Mascota=?";
    PreparedStatement cmd = cn.prepareStatement(sql);
    //llenar los parametros como se encuentran en las clases
    cmd.setInt(1, ID_DUI);
    cmd.setString(2, dueño_nombre);
    cmd.setString(3, dueño_apellidos);
    cmd.setInt(4, dueño_telefono);
    cmd.setString(5, dueño_domicilio);
    cmd.setString(6, dueño_correo);
    cmd.setDate(7, Fecha_e_DUI);
    cmd.setString(8, nacionalidad);
    cmd.setInt(9, codigo_zona);
    cmd.setInt(10, ID_tipoCliente);
    cmd.setInt(11, ID_Mascota);
    
        if (!cmd.execute()) {
            resp=true;
        }
    cmd.close();
    cn.close();
    }catch(Exception ex){
        System.out.println(ex.toString());
    }
    return resp;
    }
    
    public boolean EliminarCliente(){
    boolean resp=false;
    try{//realizando consulta insert
            String sql = "DELETE FROM Cliente_dueño WHERE ID_mascota=?;";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setInt(1, ID_DUI );
            if (!cmd.execute()) {
                resp=true;
            }
            cmd.close();
            cn.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return resp;
    }
    public boolean guardarCliente(){
        boolean resp = false;
        try{//realizando consulta insert
            String sql = "INSERT INTO Cliente_dueño (ID_DUI=?,dueño_nombre=?, dueño_apellidos=?, " 
            + "dueño_telefono=?, dueño_domicilio=?, dueño_correo=?,Fecha_e_DUI=?,nacionalidad=?,codigo_zona=?,ID_tipoCliente=?,ID_Mascota=?)"+"VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setInt(1, ID_DUI);
            cmd.setString(2, dueño_nombre);
            cmd.setString(3, dueño_apellidos);
            cmd.setInt(4, dueño_telefono);
            cmd.setString(5, dueño_domicilio);
            cmd.setString(6, dueño_correo);
            cmd.setDate(7, Fecha_e_DUI);
            cmd.setString(8, nacionalidad);
            cmd.setInt(9, codigo_zona);
            cmd.setInt(10, ID_tipoCliente);
            cmd.setInt(11, ID_Mascota);
            if (!cmd.execute()) {
                resp=true;
            }
            cmd.close();
            cn.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return resp;
        
    }
    public boolean consultarMascota(){
        boolean resp = false;
        try{//realizando consulta insert
            String sql = "SELECT ID_DUI=?,dueño_nombre=?, dueño_apellidos=?, " 
            + "dueño_telefono=?, dueño_domicilio=?, dueño_correo=?,Fecha_e_DUI=?,nacionalidad=?,codigo_zona=?,ID_tipoCliente=? FROM Cliente_dueño WHERE ID_DUI=?";
            PreparedStatement cmd= cn.prepareStatement(sql);
            cmd.setInt(1, ID_DUI );
            ResultSet rs= cmd.executeQuery();
            if (rs.next()) {
                resp=true;
            dueño_nombre = rs.getString(1);
            dueño_apellidos = rs.getString(2);
            dueño_telefono = rs.getInt(3);
            dueño_domicilio = rs.getString(4);
            dueño_correo = rs.getString(5);
            Fecha_e_DUI = rs.getDate(6);
            nacionalidad = rs.getString(7);
            codigo_zona = rs.getInt(8);
            ID_tipoCliente = rs.getInt(9);
            ID_Mascota = rs.getInt(10);
            }
            cmd.close();
            cn.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return resp;
        
    }
}
