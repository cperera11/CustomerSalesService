/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customersalesservice;

/**
 *
 * @author CPere
 */
public enum DiscountOnProductInventory {
    
    FLAT_AMOUNT_DISCOUNT_1(5.00),FLAT_AMOUNT_DISCOUNT_2(10.00),FLAT_AMOUNT_DISCOUNT_3(15.00),FLAT_AMOUNT_DISCOUNT_4(20.00),
    PERCENT_DISCOUNT_1(0.05),PERCENT_DISCOUNT_2(0.10),PERCENT_DISCOUNT_3(0.15),PERCENT_DISCOUNT_4(0.20),
    BUY_ONE_GET_ONE_FREE(0.5), BUY_ONE_GET_HALF_OFF_SECOND_ITEM (0.25);
    
    
    public double discount;
    
    DiscountOnProductInventory(double d){
         discount = d;
}
    
}
