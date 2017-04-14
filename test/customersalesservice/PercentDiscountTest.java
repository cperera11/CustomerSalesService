/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customersalesservice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CPere
 */
public class PercentDiscountTest {
    
    public PercentDiscountTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDiscount method, of class PercentDiscount.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        double productRetailprice = 0.0;
        double qty = 0.0;
        PercentDiscount instance = null;
        double expResult = 0.0;
        double result = instance.getDiscount(productRetailprice, qty);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
