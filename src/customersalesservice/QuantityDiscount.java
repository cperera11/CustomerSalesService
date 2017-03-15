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
public class QuantityDiscount implements Discount {

    private double percentOff;
    private int minQty;

    public QuantityDiscount(double percentOff, int minQty) {
        this.percentOff = percentOff;
        this.minQty = minQty;
    }


    @Override
    public double getDiscount(double productRetailprice, double qty) {
        double discountAmt = 0.00;

        if (qty >= minQty) {
            discountAmt = productRetailprice * qty * percentOff;
        }
        
        return discountAmt;
    }
    
    
}
