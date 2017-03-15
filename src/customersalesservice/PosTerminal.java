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

    public PosTerminal(Receipt receipt) {
        this.receipt = receipt;
    }
  
  
    public final void startSale(PosTerminal pos, String custId) {
      //  System.out.println(receipt.findCustomerName(custId).getName());
    }

    public final void addItemToSale(String productID, String quantity,Discount dis) {
      // receipt.getLineItemsHeading();
      //System.out.println(receipt.getLineItems(productID, quantity, dis));
    }

    public final void endSale() {
      //  System.out.println(receipt.getLineItemsHeading());
    }
    
    
}
