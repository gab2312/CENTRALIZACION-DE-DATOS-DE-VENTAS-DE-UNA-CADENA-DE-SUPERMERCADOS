/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

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
public class FrmRegistroProductosTest {
    
    FrmRegistroProductos frp = new FrmRegistroProductos();

    @Test
    public void testIsNull_a() {
        System.out.println("isNull_a");
        String a = "a";
        String b = "b";
        String resultado = frp.isNull(a,b);
        assertEquals("a",resultado );
    }
    
    @Test
    public void testIsNull_b() {
        System.out.println("isNull_b");
        String a = "";
        String b = "b";
        String resultado = frp.isNull(a,b);
        assertEquals("b",resultado );
    }
    
    @Test
    public void testValidarNumerico(){
        System.out.println("validarNumerico");
         frp.validarNumerico(null);
    }
}
