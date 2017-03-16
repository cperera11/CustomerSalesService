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
public class PosTerminal {
  private Receipt receipt;

     
    public final void startSale(String custId, Receipt receipt) {
        this.receipt = receipt;
        receipt.findCustomerName(custId);
    }

    public final void addItemToSale(String productID, double quantity,DataAccessStrategy db) {
      
        receipt.addLineItem(productID, quantity, db);
    }

    public final void endSale() {
      receipt.outputReceipt();
    }
    
    
}
