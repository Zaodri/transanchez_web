/*
  Conexion a base de datos mysql
 */
package persistence;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author SAODRI
 */
public class Conexion {
    
    Connection conectar = null;
    
    public Connection conexion(){
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        
        conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/transanchez","root","");
        
        JOptionPane.showMessageDialog(null,"conexion Exitosa");
                
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de conexion" + e.getMessage());
        }
        
        return conectar;
    }
    
    
}
