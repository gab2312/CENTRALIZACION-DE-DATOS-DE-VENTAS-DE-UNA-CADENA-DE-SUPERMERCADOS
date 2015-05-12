/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author GAb
 */
public class ConexionDB 
{
    
    private final static String HOST = "192.168.56.102";
    private final static String DBNAME = "DBVentas";
    private final static String PORT = "1433";
    private final static String USER = "sa";
    private final static String PSW = "Abcd1234";

    
    public static Connection GetConnection()
    {
        Connection conexion = null;
      
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String connectionUrl = "jdbc:sqlserver://"+ConexionDB.HOST+":"+ConexionDB.PORT+";"
                    + "databaseName="+ConexionDB.DBNAME+";user="+ConexionDB.USER+";"
                    + "password="+ConexionDB.PSW+";";
      
            conexion= DriverManager.getConnection(connectionUrl);
            //System.out.println("Connection succesfull!!");
        }
        catch(ClassNotFoundException | SQLException ex)
        {
             JOptionPane.showMessageDialog(null, ex, "Error en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
	     conexion = null;
        }        

         return conexion;
    }
}
