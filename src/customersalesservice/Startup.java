
package customersalesservice;

/**
 *
 * @author CPerera
 */
public class Startup {
    public static void main(String[] args) {
        
        try {
        DataAccessStrategy db = new InMemoryDataAccess();
        PosTerminal pos = new PosTerminal(); 
        ReceiptOutPutStrategy jReceiptOutPut  = new JOptionPaneOutput();
        ReceiptOutPutStrategy cReceiptOutPut = new ConsoleOutput();
        GreetingGenerator greeting = new GreetingGenerator();
        
        greeting.generateGreeting("Welcome to Kohls!");
        pos.startSale("300",db,greeting);
        pos.addItemToSale("A101", 2, db);
        pos.addItemToSale("C222", 3, db);
        pos.endSale(jReceiptOutPut,cReceiptOutPut );


        pos.startSale("",db,greeting);
        pos.addItemToSale("D333", 1, db);
        pos.addItemToSale("B205", 2, db);
        pos.endSale(jReceiptOutPut,cReceiptOutPut );
        }
        catch (MandatoryStringException mse){
            mse.getMessage();
        
        }

    }
    
}
