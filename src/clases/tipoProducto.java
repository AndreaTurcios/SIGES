package Clases;
import ptcproyecto.frmTipo_producto;
import clases.conexion;
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
public class tipoProducto {
    private Connection cn;
    private Integer ID_tipoProducto;
    private String Tipo_Producto;

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
    
    public tipoProducto(){
        conexion con = new conexion();
        cn = con.conectar();
    }
    
    public boolean guardar(){
        boolean resp  = false;
        try{
            //Realizar consulta INSERT
            String sql = "INSERT INTO Tipo_producto (tipo_producto) "
            + "VALUES( ?)";//Se pasan por referencia por seguridad        
            //Pide importar clase PreparedStateMent
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla 
            cmd.setString(1, Tipo_Producto);//codigo es como se definio en la clase aunque en la base se llama correlativo
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
    
    public boolean consultar(){
        boolean resp = false;
        try{
            //Realizar consulta SELECT
            String sql = "SELECT  tipo_producto "
                    + "FROM Tipo_producto WHERE ID_tipoProducto = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);//Llenar los parametros
            //Ejecutar la consulta
            //pedira importar la ResultSet
            cmd.setInt(1, ID_tipoProducto);
            //Recorrer la lista de registros
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next()) {
                resp = true;
                //asignandole a los atributos de la clase
                Tipo_Producto = rs.getString(1);
                
            }
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
            String sql = "UPDATE Tipo_producto SET tipo_producto = ? WHERE ID_tipoProducto = ?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros como esta en la clase 
            cmd.setString(1, Tipo_Producto);
            cmd.setInt(2, ID_tipoProducto);
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
    
    public void listarTipoProductos(Connection cn, JTable tabla){
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Tipo de Producto"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM Tipo_producto ORDER BY ID_tipoProducto";
        String [] filas = new String[2];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 2; i++) {
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
    public void CargarTipoProductos(JTable tabla){
        listarTipoProductos(getCn(), tabla);
    }

    /**
     * @return the ID_tipoProducto
     */
    public Integer getID_tipoProducto() {
        return ID_tipoProducto;
    }

    /**
     * @param ID_tipoProducto the ID_tipoProducto to set
     */
    public void setID_tipoProducto(Integer ID_tipoProducto) {
        this.ID_tipoProducto = ID_tipoProducto;
    }

    /**
     * @return the tipoProducto
     */
    public String getTipo_Producto() {
        return Tipo_Producto;
    }

    /**
     * @param Tipo_Producto the tipoProducto to set
     */
    public void setTipo_Producto(String Tipo_Producto) {
        this.Tipo_Producto = Tipo_Producto;
    }
}
