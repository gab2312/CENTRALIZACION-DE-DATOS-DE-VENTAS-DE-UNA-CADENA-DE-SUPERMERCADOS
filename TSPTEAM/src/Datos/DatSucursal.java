package Datos;

import Negocio.NegSucursal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author GAb
 */
public class DatSucursal {

    private Connection conexion = Conexion.getConnection();

    public NegSucursal[] consultarSucursales() {

        NegSucursal[] negSucursal = null;
        
        try {
            Statement statement = conexion.createStatement();

            ResultSet rs = statement.executeQuery("SELECT codSucursal, nombreSucursal FROM [dbo].[T_Sucursal]");
            rs.last();
            int size = rs.getRow();
            rs.beforeFirst();

            negSucursal = new NegSucursal[size];

            if (size != 0) {
                int i = 0;
                while (rs.next()) {
                    negSucursal[i].setCodSucursal(rs.getInt("codSucursal"));
                    negSucursal[i].setNombreSucursal(rs.getString("nombreSucursal"));
                    i++;
                    //comboSucursal.addItem(rs.getString("nombreSucursal"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            return negSucursal;
        }
    }

    public static JComboBox getSucursal(JComboBox comboSucursal, Connection conexion) {

        try {
            Statement statement = conexion.createStatement();

            ResultSet rs = statement.executeQuery("SELECT nombreSucursal FROM [dbo].[T_Sucursal]");
            while (rs.next()) {
                comboSucursal.addItem(rs.getString("nombreSucursal"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            return comboSucursal;
        }
    }

    public static int getSucursalID(JComboBox comboSucursal, Connection conexion) throws SQLException {
        Statement statement = conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT codSucursal FROM [dbo].[T_Sucursal] where [nombreSucursal] = '" + comboSucursal.getSelectedItem() + "'");
        rs.next();
        int sucursalID = rs.getInt("codSucursal");;
        return sucursalID;
    }
}
