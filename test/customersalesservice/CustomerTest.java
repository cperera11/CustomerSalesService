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
public class CustomerTest {
    private Customer instance;
    public CustomerTest() {
    }
    
    @Before
    public void setUp() {
      instance = new Customer();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
       instance.setName("Sam");
        String expResult = "Sam";
        String result = instance.getName();
        assertEquals("Customer getName method not valid",expResult, result);
        
    }

    /**
     * Test of setName method, of class Customer.
     */
    
    @Test(expected = IllegalArgumentException.class)
    public void SetNameShouldThrowIaeIfCustomerNameIsNull() {

        instance.setName(null);
    }
     @Test(expected = IllegalArgumentException.class)
    public void SetNameShouldThrowIaeIfCustomerNameIsEmpty() {

        instance.setName("");

    }

    /**
     * Test of getCustomerId method, of class Customer.
     */
    
     @Test(expected = IllegalArgumentException.class)
    public void SetCustomerIdShouldThrowIaeIfCustomerIdIsNull() {

        instance.setCustomerId(null);

    }

    @Test(expected = IllegalArgumentException.class)
    public void SetCustomerIDShouldThrowIaeIfCustomerIdIsEmpty() {

        instance.setCustomerId("");

    }
    @Test
    public void testGetCustomerId() {
       instance.setCustomerId("H109");
        String expResult = "H109";
        String result = instance.getCustomerId();
        assertEquals("GetCustomerId method does not produce a valid output",expResult, result);
       
    }

}
