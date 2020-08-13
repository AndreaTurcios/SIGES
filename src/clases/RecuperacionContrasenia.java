package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author 15-CW0001la
 */
public class RecuperacionContrasenia {
     public boolean recuperacion(Integer ID_Pregunta, String respuesta) {
        boolean retorno = false;
        try {
            String consulta;
            consulta = "Select * from respuestas where ID_Pregunta= ? and respuesta = ?";
            PreparedStatement Prepared;
            Conexion con = new Conexion();

            Prepared = con.conectar().prepareStatement(consulta);
            Prepared.setString(1, respuesta);
            Prepared.setInt(2, ID_Pregunta);
            ResultSet Resultado = Prepared.executeQuery();
        if (Resultado.next()) {
                  retorno = true;
              }
          } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Error "+ex);
          }   
          return retorno;
      }
}
