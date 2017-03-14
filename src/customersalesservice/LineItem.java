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
public class LineItem {
    private double quantity;
    private Product product =  new Product();

    public LineItem(String ProdId, String quantity, DataAccessStrategy db) {
        setQuantity(quantity);
        product = findProduct(ProdId, db);
    }
  
     public final Product findProduct(String ProdId, DataAccessStrategy db) {
        return db.findProduct(ProdId);
    }
    public final double getQuantity() {
        return quantity;
    }

    public final void setQuantity(String quantity) {
        double qty;
        if(quantity == null || quantity.isEmpty() ) {
        throw new IllegalArgumentException();
        }else{
            try {
            qty = Double.parseDouble(quantity);
            }
            catch(NumberFormatException nfe){
            throw new NumberFormatException();
            }
            this.quantity = qty;
        }
    }
  
    
    public final double calculateSubTotal(String quantity){
        setQuantity(quantity);
        return (product.getRetailPrice() * getQuantity());
    }
    
    public final String generateLineItem(String quantity,Discount discount){
       
        setQuantity(quantity);
        
        String line = "";
        line += product.getProductID() + "\t";
        line += product.getProductName() + "\t";
        line += product.getRetailPrice() + "\t";
        line += getQuantity() + "\t";
        line += calculateSubTotal(quantity) + "\t";
        line += discount.getDiscount(product.getRetailPrice(),getQuantity()) + "\n";
        
        return line;
    }
    
    public final String generateLineItemHeading(){
        
        String line = "";
        line += "ID" + "\t";
        line += "Item" + "\t";
        line += "Price" + "\t";
        line += "Quantity" + "\t";
        line += "Sub Total" + "\t";
        line += "Discount" + "\n";
        
        return line;
    }
}
