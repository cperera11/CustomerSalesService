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
public class PercentDiscount implements Discount {

    private double percentOff;

    public PercentDiscount(double percentOff) {
        if(percentOff < 0){
            throw new IllegalArgumentException("percentOff cannot be null");        
        }
        this.percentOff = percentOff;
    }



    @Override
    public double getDiscount(double productRetailprice, double qty) {

        return productRetailprice * qty * percentOff;
        
        
    }
}
