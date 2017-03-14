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

    private DiscountOnProductInventory discount;
    private Product product = new Product();


    @Override
    public double getDiscount(double productRetailprice, double qty) {
        double discountAmt;
        String firstThreeCharsOfProductId = product.getProductID().substring(0, 2);
        switch (firstThreeCharsOfProductId) {
            case "A11":
                discountAmt = (discount.PERCENT_DISCOUNT_1.discount * productRetailprice);
                break;
            case "B22":
                discountAmt = (discount.PERCENT_DISCOUNT_2.discount * productRetailprice);
                break;
            case "C33":
            case "D44":
                discountAmt = (discount.PERCENT_DISCOUNT_3.discount * productRetailprice);
                break;
            case "E55":
                discountAmt = (discount.PERCENT_DISCOUNT_4.discount * productRetailprice);
                break;
            default:
                discountAmt = 0.00;
        }

        return discountAmt;
    }
}
