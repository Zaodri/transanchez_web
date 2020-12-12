/**
    Uso del patron de diño DAO
**/
package dao;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
/**
 * @author SAODRI
 */

public class ConexionDB {
    
    protected Connection conexionBD;
    // JDBC driver nombre, base de datos URL
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //org.postgresql.Driver
    private final String DB_URL = "jdbc:mysql://localhost/phpmyadmin/"; //jdbc:mysql://localhost
    
    // credemciales base de datos
    private final String USER = "root";
    private final String PASS = "";
    
    public void conectar(java.sql.Connection ConexionDB)throws Exception{    
        try{
            ConexionDB = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER); 
            
        }catch(Exception exce){
        throw exce;
        }
    }
    
    
}
