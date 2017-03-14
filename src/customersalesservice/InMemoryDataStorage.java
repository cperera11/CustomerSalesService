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
public class InMemoryDataStorage {
        
    public final Product[] products = {
        new Product("A111", "MLB Brewer's Hat ", "19.95"),
        new Product("B222", "Men's Dress Shirt", "35.50"),
        new Product("C333", "Women's Socks    ", "9.50")
    };
    
    public final Customer[] customers = {
        new Customer("100", "John Smith"),
        new Customer("200", "Sally Jones"),
        new Customer("300", "Bob Clementi")
    };
    
    
}
