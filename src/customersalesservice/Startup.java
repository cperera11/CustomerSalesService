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

        Receipt receipt = new Receipt("300",db);
        PosTerminal pos = new PosTerminal(); 
        
        pos.startSale("100", receipt);
        pos.addItemToSale("A111", 2, db);
        pos.endSale();

       
       

    }
    
}
