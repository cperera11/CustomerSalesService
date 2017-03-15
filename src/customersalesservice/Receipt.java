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
public class Receipt {
    private DataAccessStrategy db; 
    private Customer customer;
    private String receiptId;
    private LineItem[] lineItems = new LineItem[0];
    
    public Receipt(String customerId, DataAccessStrategy db) {
        this.db = db;
       customer = findCustomerName(customerId);
    }

    
    public final Customer findCustomerName(String custId ){
       return db.findCustomer(custId);
    }
  
    public final String getLineItemsHeading(){
        return(lineItems[0].generateLineItemHeading());
    }
    
       public final String getLineItems(){
         String data = "";
         for(LineItem item : lineItems){
         data += item;
         }
        
        return data ; 
    }
    public final String getReceiptDate(){
        
        String data = "";
//      data += greeting
//      data += date time
        data += getLineItemsHeading();
        data += getLineItems();
        data += lineItems[0].generateLineItemFooter();
        
        return data;
    }
    
    public final void addLineItem(String ProdId, double quantity, DataAccessStrategy db){
        LineItem Item = new LineItem(ProdId, quantity, db);
        addToArray(Item);
    }
    
    public final void addToArray(final LineItem item) {
        if(item == null){
        throw new IllegalArgumentException();
        }
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }
    
    public void outputReceipt() {
        
    }
}
 