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
public class Customer {
   private String name;
   private String customerId;

    public Customer(String customerId, String name) {
        setCustomerId(customerId);
        setName(name);
    }

   
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name == null || name.isEmpty()){
        throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
       // cannot validate because the sale should be started even without the customer ID
        this.customerId = customerId;
    }
   
   
    
}
