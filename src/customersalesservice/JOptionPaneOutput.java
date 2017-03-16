/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customersalesservice;

import javax.swing.JOptionPane;

/**
 *
 * @author CPere
 */
public class JOptionPaneOutput implements ReceiptOutPutStrategy{

    @Override
    public void outputReceipt(String receiptData) {
       JOptionPane.showMessageDialog(null, receiptData);
    }
  
}
