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
    private ReceiptOutPutStrategy jReceiptOutPut;
    private ReceiptOutPutStrategy cReceiptOutPut;

    public Receipt(String customerId, DataAccessStrategy db) {
        this.db = db;
        customer = findCustomerName(customerId);
        ReceiptOutPutStrategy jReceiptOutPut = new JOptionPaneOutput();
        ReceiptOutPutStrategy cReceiptOutPut = new ConsoleOutput();
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
//      data += greeting
//      data += date time
        data += "Sold to: "+ customer.getName() + "\n";
        data += getLineItemsHeading();
        data += "-------------------------------" + "\n";
        data += getLineItems();
        data += generateLineItemTotalingArea();
        return data;
    }
// helper methods for getReceiptData()    
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
        String line = "";
        line += "Net Total: " + getNetTotal()+ "\n";
        line += "Total Saved: " + getTotalSaved()+ "\n";
        line += "Total Due: " + getTotalDue();
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

    public void outputReceipt() {
       jReceiptOutPut.outputReceipt(getReceiptData());
       
    }
}
