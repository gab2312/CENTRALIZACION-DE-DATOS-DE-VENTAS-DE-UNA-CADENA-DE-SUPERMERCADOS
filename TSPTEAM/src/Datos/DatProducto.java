package Datos;

import Negocio.NegProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author GAb
 */
public class DatProducto {
    
    public static void insertAll(Connection conexion, NegProducto negProducto) throws Exception
    {
        try
        {
            PreparedStatement stmt = conexion.prepareStatement("INSERT INTO [T_Producto] ([nombreProducto],[precioUnitario],[codMarca],[stockInicial],[stockMinimo],[codSucursal],[codImpuesto],[fechaVencimiento]) "
                                                                + "VALUES (?,?,?,?,?,?,?,?);");
            
            stmt.setString(1, negProducto.getNombreProducto());
            stmt.setLong(2, negProducto.getPrecioUnitario());
            stmt.setInt(3, negProducto.getCodMarca());
            stmt.setLong(4, negProducto.getStockInicial());
            stmt.setLong(5, negProducto.getStockMinimo());
            stmt.setInt(6, negProducto.getCodSucursal());
            stmt.setInt(7, negProducto.getTipoImpuesto());
            stmt.setString(8, negProducto.getFechaVencimiento());
            
            stmt.executeUpdate();
            
        }
        catch(SQLException ex)
        {
            throw new Exception(ex.getMessage());
        }
    }
}
