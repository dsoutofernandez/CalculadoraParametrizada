/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracod;

import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dsoutofernandez
 */
public class CalculadoraCODTest {
    
    public CalculadoraCODTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CalculadoraCOD.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraCOD.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
*/
    /**
     * Test of realizaOperacion method, of class CalculadoraCOD.
     */
    @Test
    public void testRealizaOperacion() {
        
        // TODO review the generated test code and remove the default call to fail.
        
        double expectedResult =2;
        
        Modelo mod = new Modelo();
        mod.num1=1;
        mod.num2 = 1;
        mod.operacion = "suma";
        CalculadoraCOD.realizaOperacion(mod);
        double result = mod.resultado;
        assertEquals(expectedResult,result,0.0);
        //fail("The test case is a prototype.");
    }
    
}
