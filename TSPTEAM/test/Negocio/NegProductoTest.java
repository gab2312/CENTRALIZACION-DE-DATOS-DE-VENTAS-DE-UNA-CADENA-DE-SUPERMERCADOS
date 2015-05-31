/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GAb
 */
public class NegProductoTest {
    
    @Test
    public void testInsertProducto() {
        System.out.println("insertProducto");
        NegProducto negProducto = new NegProducto();
        negProducto.setCodMarca(1);
        negProducto.setCodSucursal(1);
        negProducto.setFechaVencimiento("20150809");
        negProducto.setNombreProducto("Producto JUnit");
        negProducto.setPrecioUnitario(12345);
        negProducto.setStockInicial(12345);
        negProducto.setStockMinimo(12345);
        negProducto.setTipoImpuesto(1);
        boolean resultado = NegProducto.insertProducto(negProducto);
        assertEquals(true, resultado);
    }
    
}
