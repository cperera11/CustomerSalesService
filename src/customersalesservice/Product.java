/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customersalesservice;

/**
 *
 * @author CPerera
 */
public class Product {
    private String productID;
    private String productName;
    private Double retailPrice;
    private Discount discount;

    public Product(String productID, String productName, String retailPrice) {
        
        setProductID(productID);
        setProductName(productName);
        setRetailPrice(retailPrice);
    }

    public Product() {
    }
    
    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
         if(productID == null || productID.isEmpty() ){
        throw new IllegalArgumentException();
        }
        this.productID = productID;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        if(productName == null || productName.isEmpty() ){
        throw new IllegalArgumentException();
        }
        this.productName = productName;
    }

    public final Double getRetailPrice() {
        return retailPrice;
    }

    public final void setRetailPrice(String retailPrice) {
        double rlp;
        if(retailPrice == null || retailPrice.isEmpty() ) {
        throw new IllegalArgumentException();
        }else{
            try {
            rlp = Double.parseDouble(retailPrice);
            }
            catch(NumberFormatException nfe){
            throw new NumberFormatException();
            }
        this.retailPrice = rlp;
        }
    }
    public final double getDiscountAmount(double productRetailprice, String qty, Discount discount){
        setDiscount(discount);
        return discount.getDiscount(0, 0);
    }
    
    public final Discount getDiscount() {
        return discount;
    }

    public final void setDiscount(Discount discount) {
        if(discount == null){
        throw new IllegalArgumentException();
        }
        this.discount = discount;
    }
    
    
}
