/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package rel1t5_imna.rel1t5_imna.pruebas;

import java.sql.SQLException;
import junit.framework.TestCase;

/**
 *
 * @author Admin
 */
public class PruebaBDTest extends TestCase {
    
    public PruebaBDTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    
    public void testSomeMethod() throws SQLException {
        PruebaBD instance = new PruebaBD();
        int result = instance.prueba_1("Ceuta");
        int sxpResult=2;
        assertEquals(sxpResult, result);
    }
    
}
