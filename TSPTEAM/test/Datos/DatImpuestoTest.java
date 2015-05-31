/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.lang.reflect.Array;
import java.sql.Connection;
import javax.swing.JComboBox;
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
public class DatImpuestoTest {

    DatImpuesto di = new DatImpuesto();
    Connection connection = Conexion.getConnection();
    String[] impuestos = {"IVA", "Producto sin impuesto"};
    JComboBox box = new JComboBox(impuestos);
        
    @Test
    public void testGetImpuesto() {
        System.out.println("getImpuesto");
        JComboBox comboBox = new JComboBox();
        comboBox.removeAllItems();
        
        //comboBox.removeAllItems();
        
        assertEquals(box, di.getImpuesto(comboBox, connection));

    }

    @Test
    public void testGetImpuestoID() throws Exception {
        System.out.println("getImpuestoID");

        box.setSelectedItem(1);

        int resultado = di.getImpuestoID(box, connection);
        assertEquals(1, resultado);
    }

}
