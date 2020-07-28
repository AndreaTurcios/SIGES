/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
/**
 *
 * @author Estrada
 */
public class CargarTipoProducto {
    Pool metodospool = new Pool();

    public void consultar_datos(JComboBox cbox_productos){
    java.sql.Connection cn= null;    
    PreparedStatement st = null;
    ResultSet resultado = null;

    String SSQL = "SELECT tipo_producto FROM Tipo_producto ORDER BY ID_tipoProducto";
    try {
       cn = metodospool.dataSource.getConnection();  
       st = cn.prepareStatement(SSQL);
       resultado = st.executeQuery();
       cbox_productos.addItem("Seleccione una opción");
       while(resultado.next()){
      cbox_productos.addItem(resultado.getString("tipo_producto"));
       }  
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }finally{
        if(cn!=null){
            try {
                cn.close();
                resultado.close();
                resultado=null;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    }

}    

