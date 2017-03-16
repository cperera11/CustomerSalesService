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

        Receipt receipt = new Receipt("0",db);
        PosTerminal pos = new PosTerminal(); 
        
//        pos.startSale("300", receipt);
//        pos.addItemToSale("A101", 2, db);
//        pos.addItemToSale("C222", 3, db);
//        pos.endSale();

        pos.startSale("0", receipt);
        pos.addItemToSale("D333", 1, db);
        pos.addItemToSale("B205", 2, db);
        pos.endSale();
       

    }
    
}
