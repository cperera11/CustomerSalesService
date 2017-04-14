package customersalesservice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CPerera
 */
public class ProductTest {

    private Product instance;
    private Discount discount;

    public ProductTest() {

    }

    @Before
    public void setUp() {
        instance = new Product();

        Discount discount;

    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of setProductID method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void SetProductIDShouldThrowIaeIfProductIdIsNull() {

        instance.setProductID(null);

    }

    @Test(expected = IllegalArgumentException.class)
    public void SetProductIDShouldThrowIaeIfProductIdIsEmpty() {

        instance.setProductID("");

    }

    /**
     * Test of setProductName method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void SetProductNameShouldThrowIaeIfProductNameIsNull() {

        instance.setProductName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SetProductNameShouldThrowIaeIfProductNameIsEmpty() {

        instance.setProductName("");
    }

    /**
     * Test of setRetailPrice method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void SetRetailPriceShouldThrowIoeIfRetailPriceLessThanZero() {

        instance.setRetailPrice(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SetRetailPriceShouldThrowIoeIfRetailPriceGraterThanOneThousand() {

        instance.setRetailPrice(1002);
    }

    /**
     * Test of setRetailPrice method, of class Product for valid values.
     */
    @Test
    public void testSetRetailPriceShouldAllow1To1000() {

        for (int i = 1; i < 1001; i++) {
            try {
                instance.setRetailPrice(i);
            } catch (IllegalArgumentException iae) {
                fail("Arguments from 1 to 1000 inclusive should be legal,"
                        + " but fails with IllegalArgumentException");
            }
        }
    }

    /**
     * Test of setDiscount method, of class Product.
     */
    @Test(expected = NullPointerException.class)
    public void SetDiscountShouldThrowIaeIfDiscountIsNull() {
        instance.setDiscount(discount);
    }

    /**
     * Test of getRetailPrice method, of class Product.
     */
    @Test
    public void testGetRetailPrice() {
        instance.setRetailPrice(10);
        double expResult = 10;
        double result = instance.getRetailPrice();
        assertEquals("Retail price is not valid", expResult, result, 0.0);

    }

    /**
     * Test of getDiscount method, of class Product.
     */
    @Test
    public void testGetDiscount() {

        Discount expResult = null;
        Discount result = instance.getDiscount();
        assertEquals("getDiscount method is null", expResult, result);

    }

}
