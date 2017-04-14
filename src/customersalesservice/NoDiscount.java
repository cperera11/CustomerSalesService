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
public class NoDiscount implements Discount {

   
    @Override
    public double getDiscount(double productRetailprice, double qty) {
        double discount = 0.00;
        
        return discount;
    }
}
