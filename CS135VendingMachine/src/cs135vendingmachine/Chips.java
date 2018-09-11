/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs135vendingmachine;

/**
 *
 * @author Katon
 */
public class Chips extends Snack{
    Chips(){
        setName("Lays");
        setPrice(2.79);
    }
    
    Chips(Chips c){
        System.out.println("Copy constructor called");
        setName(c.getName());
        setPrice(c.getPrice());
    }
    
    Chips(String s, double d){
        setName(s);
        setPrice(d);
    }
    
    @Override
    public String toString(){
        return getName() 
                + " "
                + getPrice();
    }

    @Override
    public int compareTo(Drink d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
