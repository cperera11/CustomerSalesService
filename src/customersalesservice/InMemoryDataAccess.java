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
public class InMemoryDataAccess implements DataAccessStrategy {
 
    InMemoryDataStorage inMemoryStorage = new InMemoryDataStorage();
 
    // find a customer
   @Override
    public final Customer findCustomer(final String custId) {
        // validation is needed for method parameter
        if(custId == null || custId.isEmpty() ){
        throw new IllegalArgumentException();
        }
        
        Customer customer = null;
        for(Customer c : inMemoryStorage.customers) {
            if(custId.equals(c.getCustomerId())) {
                customer = c;
                break;
            }
        }
        
        return customer;
    }
    
    // find a poroduct
    @Override
      public final Product findProduct(final String prodId) {
       if(prodId == null || prodId.isEmpty() ){
        throw new IllegalArgumentException();
        }
        
        Product product = null;
        for(Product p : inMemoryStorage.products) {
            if(prodId.equals(p.getProductID())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
}
    

