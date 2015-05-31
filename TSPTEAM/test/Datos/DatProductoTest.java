/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.NegProducto;
import java.sql.Connection;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GAb
 */
public class DatProductoTest {
    
    public DatProductoTest() {
    }
    
    private DatProducto datProducto;
            
    
    @Test
    public void testInsertAll() throws Exception {
        
        System.out.println("insertAll");
        NegProducto negProducto = new NegProducto();
        negProducto.setCodMarca(1);
        negProducto.setCodSucursal(1);
        negProducto.setFechaVencimiento("20150809");
        negProducto.setNombreProducto("Producto JUnit");
        negProducto.setPrecioUnitario(12345);
        negProducto.setStockInicial(12345);
        negProducto.setStockMinimo(12345);
        negProducto.setTipoImpuesto(1);
        Connection connection = Conexion.getConnection();
        
        datProducto.insertAll(connection, negProducto);
        long id = negProducto.getCodProducto();
        Assert.assertNotNull(id);
        
        
        
    }
    
}
