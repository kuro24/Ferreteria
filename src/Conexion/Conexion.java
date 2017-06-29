
package Conexion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author manuel
 */
public class Conexion {
    
    public static Connection conectar;
    public static Statement state, state1;
    public static ResultSet result, result1;
    
    String driver = "org.postgresql.Driver";
   
    public static Connection getConectar() {
        return conectar;
    }

    public static void setConectar(Connection conectar) {
        Conexion.conectar = conectar;
    }
    
    public Conexion() throws SQLException, ClassNotFoundException {
        String url = null;
        String user = null;
        String pass = null;
        
        Properties propiedades = new Properties();
        InputStream entrada = null;        
        
        try {            
            entrada = new FileInputStream("configuracion.properties");
            propiedades.load(entrada);
            
            url = (propiedades.getProperty("url"));
            user = (propiedades.getProperty("user"));
            pass = (propiedades.getProperty("pass"));            
        } catch (FileNotFoundException ex) {            
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            try {
                if (entrada != null) { entrada.close(); }                
            } catch (IOException e) { e.printStackTrace(); }
        }     
        
        Class.forName(driver);
        conectar = DriverManager.getConnection(url, user, pass);
    }//fin del constructor
    
    public static ResultSet consulta(String sql)throws SQLException {
        state1 = (Statement) conectar.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        result1 = state1.executeQuery(sql); //aqui hago consultas y devuelvo los resultados
        return result1;
    }
}
