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
    private DiscountOnProductInventory discount;
    private Product product = new Product();

    @Override
    public double getDiscount(double productRetailprice, double qty) {
         double discountAmt;
        String firstThreeCharsOfProductId = product.getProductID().substring(0, 2);
            switch (firstThreeCharsOfProductId) {
                case "A11":
                    discountAmt = discount.FLAT_AMOUNT_DISCOUNT_1.discount;
                    break;
                case "B22":
                    discountAmt = discount.FLAT_AMOUNT_DISCOUNT_2.discount;
                    break;
                case "C33":
                    discountAmt = discount.FLAT_AMOUNT_DISCOUNT_3.discount;
                    break;
                case "E55":
                    discountAmt = discount.FLAT_AMOUNT_DISCOUNT_4.discount;
                    break;
                default:
                    discountAmt = 0.00;
            }
        return discountAmt;
    }
    
}
