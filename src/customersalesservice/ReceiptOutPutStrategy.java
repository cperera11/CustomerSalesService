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
public interface ReceiptOutPutStrategy {
    
    public abstract void outputReceipt(String receipt);
}
