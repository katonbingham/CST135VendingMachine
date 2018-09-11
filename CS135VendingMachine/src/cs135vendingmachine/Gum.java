package cs135vendingmachine;

/**
 *
 * @author Katon
 */
public class Gum extends Snack{
    Gum(){
        setName("Big Chew");
        setPrice(0.99);
    }
    
    Gum(Gum g){
        System.out.println("Copy constructor called");
        setName(g.getName());
        setPrice(g.getPrice());
    }
    
    Gum(String s, double d){
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
