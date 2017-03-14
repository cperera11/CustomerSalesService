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

    private DiscountOnProductInventory discount;
    private Product product = new Product();

    @Override
    public double getDiscount(double productRetailprice, double qty) {
        double discountAmt = 0.00;
        String firstThreeCharsOfProductId = product.getProductID().substring(0, 2);
        if (qty >= 2) {
            switch (firstThreeCharsOfProductId) {
                case "A11":
                case "D44":
                    discountAmt = (productRetailprice * discount.BUY_ONE_GET_ONE_FREE.discount);
                    break;
                case "E55":
                    discountAmt = (productRetailprice * discount.BUY_ONE_GET_HALF_OFF_SECOND_ITEM.discount);
                    break;
                default:
                    discountAmt = 0.00;
            }

        }
        return (discountAmt * qty);
    }
}
