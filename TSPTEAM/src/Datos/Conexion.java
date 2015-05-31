package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author GAb
 */
public class Conexion 
{
    
    private final static String HOST = "192.168.56.102";
    private final static String DBNAME = "DBVentas";
    private final static String PORT = "1433";
    private final static String USER = "sa";
    private final static String PSW = "Abcd1234";

    public static Connection getConnection()
    {
        Connection conexion = null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String connectionUrl = "jdbc:sqlserver://"+Conexion.HOST+":"+Conexion.PORT+";"
                    + "databaseName="+Conexion.DBNAME+";user="+Conexion.USER+";"
                    + "password="+Conexion.PSW+";";
      
            conexion = DriverManager.getConnection(connectionUrl);
            //System.out.println("Connection succesfull!!");
        }
        catch(ClassNotFoundException | SQLException ex)
        {
             JOptionPane.showMessageDialog(null, ex, "Error en la Conexión con la BD " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
	     conexion = null;
        }        
         return conexion;
    }
}
