/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estrada
 */
public class MtoBitacora {
    private Connection cn;
    private String Fecha;
    
    public MtoBitacora(){
        Conexion con = new Conexion();
        cn = con.conectar();
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);  
        String Ahora = año + "-" + (mes+1) + "-" + dia;
        Fecha = Ahora;
        System.out.println(Fecha);
    }
    public void listarBitacora(Connection cn, JTable tabla){
        
        DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"ID", "Accion", "Instruccion", "Fecha y Hora", "ID_usuario"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT ID_bitacora, accion, instruccion, fecha, ID_usuario FROM bitacora "; 
//WHERE fecha = '" + Fecha + "'"
                
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 5; i++) {
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
    public void CargarBitacora(JTable tabla){
        listarBitacora(getCn(), tabla);
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
