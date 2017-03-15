/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customersalesservice;

/**
 * * @author CPere
 */
public interface Receipt {
    
    public abstract Customer findCustomerName(String custId);
            
    public abstract String getLineItemsHeading();
            
    public abstract String getLineItems();
            
    public abstract  void addLineItem(String ProdId, String quantity, DataAccessStrategy db, Discount discount);

    public abstract void addToArray(final LineItem item);
}
