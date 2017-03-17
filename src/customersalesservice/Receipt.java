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
    private ReceiptOutPutStrategy receiptOutPut;
    //private GreetingGenerator greeting;
  

    public Receipt(String customerId, DataAccessStrategy db) {
        this.db = db;
        customer = findCustomerName(customerId);
//        GreetingGenerator greeting = new GreetingGenerator();
        
    }
// adding line items to the line item array
    public final void addLineItem(String ProdId, double quantity, DataAccessStrategy db) {
        LineItem Item = new LineItem(ProdId, quantity, db);
        addToArray(Item);
    }
    
 // expaning the size of line item array index by index as it adds items   
    public final void addToArray(final LineItem item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }
    
    
    public final String getReceiptData() {
        String data = "";
       // data += generateGreeting();
        data += "Sold to: "+ (customer == null ? "": customer.getName() ) + "\n";
        data += getLineItemsHeading();
        data += "-----------------------------------------------------------------------------" + "\n";
        data += getLineItems();
        data += generateLineItemTotalingArea();
        return data;
    }
// helper methods for getReceiptData()    
    
//    public final String generateGreeting() {
//        return greeting.generateGreeting("Welcome to Kohls!") ;
//    }
    
    public final Customer findCustomerName(String custId) {
        return db.findCustomer(custId);
    }

    public final String getLineItemsHeading() {
        return (lineItems[0].generateLineItemHeading());
    }

    public final String getLineItems() {
        String data = "";
        for (LineItem item : lineItems) {
            data += item.generateLineItem() + "\n";
        }
        return data;
    }
    
    public final String generateLineItemTotalingArea() {
        String line = String.format("%-1s %23s\n %1s %20s\n %1s %22s\n","Net Total: ", String.format("%.2f",getNetTotal()),
                                    "Total Saved: ", String.format("%.2f",getTotalSaved()), "Total Due: ", 
                                    String.format("%.2f",getTotalDue()));

        return line;

    }
// helper methods for generateLineItemTotalingArea()
    public final double getNetTotal() {
        double temp = 0.00;
        for (LineItem item : lineItems) {
            temp += item.calculateSubTotal();
        }
        return temp;
    }
    public final double getTotalSaved() {
        double temp = 0.00;
        for (LineItem item : lineItems) {
            temp += item.calculateDiscount();
        }
        return temp;
    }
    public final double getTotalDue() {
        return getNetTotal() - getTotalSaved();

    }

    public final void outputReceipt(ReceiptOutPutStrategy firstOutPut, ReceiptOutPutStrategy secondOutPut) {
        
        firstOutPut.outputReceipt(getReceiptData());
        secondOutPut.outputReceipt(getReceiptData());
   
    }
}
