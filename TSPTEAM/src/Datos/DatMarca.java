/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class DatMarca {


    public static JComboBox getMarca(JComboBox comboMarca, Connection conexion) {

        try {
            Statement statement = conexion.createStatement();

            ResultSet rs = statement.executeQuery("SELECT nombreMarca FROM [dbo].[T_Marca]");
            while (rs.next()) {
                comboMarca.addItem(rs.getString("nombreMarca"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            return comboMarca;
        }
    }

    public static int getMarcaID(JComboBox comboMarca, Connection conexion) throws SQLException {
        Statement statement = conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT codMarca FROM [dbo].[T_Marca] where [nombreMarca] = '" + comboMarca.getSelectedItem() + "'");
        rs.next();
        int marcaID = rs.getInt("codMarca");;
        return marcaID;
    }
}
