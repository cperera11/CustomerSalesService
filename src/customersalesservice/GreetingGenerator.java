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
public class GreetingGenerator {
    private String greeting;


    public final String getGreeting() {
        return greeting;
    }

    public final void setGreeting(String greeting){
         if(greeting == null || greeting.isEmpty()){
        throw new IllegalArgumentException();
         }
        this.greeting = greeting;
    }
    
    public final String generateGreeting(String greeting) {
        setGreeting(greeting);
        return getGreeting();
    }
    
}
