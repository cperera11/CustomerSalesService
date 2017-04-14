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

    public Product(String productID, String productName, double retailPrice,Discount discount ) {
        
        setProductID(productID);
        setProductName(productName);
        setRetailPrice(retailPrice);
        setDiscount(discount);
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

    public final double getRetailPrice() {
        return retailPrice;
    }

    public final void setRetailPrice(double retailPrice) {
        
         if(retailPrice < 1 || retailPrice > 1000 ) {
            throw new IllegalArgumentException();
        }
        this.retailPrice = retailPrice;
        }
       
    public final Discount getDiscount() {
        return discount;
    }

    public final void setDiscount(Discount discount) {
        if(discount == null){
        throw new NullPointerException();
        }
        this.discount = discount;
    }
    
    
}
