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
public class Startup {
    public static void main(String[] args) {
        
        DataAccessStrategy db = new InMemoryDataAccess();
        Discount dis = new PercentDiscount();
        Receipt receipt = new JOptionPaneReceipt("300",db);
        PosTerminal pos = new PosTerminal(receipt); 
        
        receipt.addLineItem("300", "2", db);
        pos.startSale(pos,"300");
         pos.endSale();

       pos.addItemToSale("A111","3",dis);
       

    }
    
}
