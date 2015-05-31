package Datos;

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
public class DatImpuesto {

    public static JComboBox getImpuesto(JComboBox comboImpuesto, Connection conexion) {

        try {
            Statement statement = conexion.createStatement();

            ResultSet rs = statement.executeQuery("SELECT nombreImpuesto FROM [dbo].[T_Impuesto]");
            while (rs.next()) {
                comboImpuesto.addItem(rs.getString("nombreImpuesto"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            return comboImpuesto;
        }
    }

    public static int getImpuestoID(JComboBox comboImpuesto, Connection conexion) throws SQLException {
        Statement statement = conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT codImpuesto FROM [dbo].[T_Impuesto] where [nombreImpuesto] = '" + comboImpuesto.getSelectedItem() + "'");
        rs.next();
        int impuestoID = rs.getInt("codImpuesto");;
        return impuestoID;

    }
}
