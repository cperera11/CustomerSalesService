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
public class FlatAmountDiscount implements Discount {
    private double flatAmountDiscount;

    public FlatAmountDiscount(double flatAmountDiscount) {
        this.flatAmountDiscount = flatAmountDiscount;
    }

    
    @Override
    public double getDiscount(double productRetailprice, double qty) {
                
        return flatAmountDiscount;
    }
    
}
