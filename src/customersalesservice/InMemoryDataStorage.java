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
    
    public Customer[] customers = {
        new Customer("100", "John Smith"),
        new Customer("200", "Sally Jones"),
        new Customer("300", "Bob Clementi")
    };
    
   
    public Product[] products = {
        new Product("A101", "MLB Brewer's Hat ", 19.95, new PercentDiscount(0.15)),
        new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(0.12,2)),
        new Product("C222", "Women's Socks    ", 9.50, new NoDiscount()),
        new Product("D333", "Women's Jacket   ", 45.99, new FlatAmountDiscount(10.00))
    };
    
    
}
