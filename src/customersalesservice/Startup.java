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

       
        PosTerminal pos = new PosTerminal(); 
        ReceiptOutPutStrategy jReceiptOutPut  = new JOptionPaneOutput();
        ReceiptOutPutStrategy cReceiptOutPut = new ConsoleOutput();
        
        pos.startSale("",db);
        pos.addItemToSale("A101", 2, db);
        pos.addItemToSale("C222", 3, db);
        pos.endSale(jReceiptOutPut,cReceiptOutPut );


//        pos.startSale("");
//        pos.addItemToSale("D333", 1, db);
//        pos.addItemToSale("B205", 2, db);
//        pos.endSale(jReceiptOutPut,cReceiptOutPut );
       

    }
    
}
