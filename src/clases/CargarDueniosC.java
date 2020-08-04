/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 15-CW0001la
 */
public class CargarDueniosC {
    Pool metodospool = new Pool();
    
     public void listarProductos(Connection cn, JTable tabla){
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "nacionalidad"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM nacionalidad ORDER BY ID_nacionalidad";
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
    public void CargarDuenios(JTable tabla){
        listarProductos(cn(), tabla);
    }
    
    public void consultar_datos(JComboBox cbox_duenios){
    java.sql.Connection cn= null;    
    PreparedStatement st = null;
    ResultSet resultado = null;

    String SSQL = "SELECT nacionalidad FROM nacionalidad ORDER BY ID_nacionalidad";
    try {
       cn = metodospool.dataSource.getConnection();  
       st = cn.prepareStatement(SSQL);
       resultado = st.executeQuery();
       cbox_duenios.addItem("Seleccione una opción");
       while(resultado.next()){
      cbox_duenios.addItem(resultado.getString("nacionalidad"));
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

    private Connection cn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
