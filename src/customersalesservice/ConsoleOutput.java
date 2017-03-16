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
public class ConsoleOutput implements ReceiptOutPutStrategy {

       
    @Override
    public void outputReceipt(String receiptData) {
        System.out.println(receiptData);
    }
}
