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
public class JOptionPaneReceipt implements Receipt {
    private DataAccessStrategy db; 
    private Customer customer;
    private String receiptId;
    private LineItem[] lineItems;
    
    public JOptionPaneReceipt(String customerId, DataAccessStrategy db) {
        this.db = db;
       customer = findCustomerName(customerId);
    }

     @Override
    public final Customer findCustomerName(String custId ){
       return db.findCustomer(custId);
    }
    
     @Override
    public final String getLineItemsHeading(){
   // return(lineItem.generateLineItemHeading());
    }
    
     @Override
    public final String getLineItems(){
         String data = "";
         for(LineItem item : lineItems){
         data += item.
         }
        
        return ; 
    }
    
    @Override
    public final void addLineItem(String ProdId, String quantity, DataAccessStrategy db){
    LineItem Item = new LineItem(ProdId, quantity, db);
    addToArray(Item);
    }
    
    private void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }
    
    
}
 