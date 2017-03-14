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
public interface DataAccessStrategy {

    // find a customer
    public abstract Customer findCustomer(final String custId);

    // find a poroduct
    public abstract Product findProduct(final String prodId);
    
}
