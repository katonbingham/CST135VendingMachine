package cs135vendingmachine;

/**
 *
 * @author Katon
 */
public class Candy extends Snack{
    Candy(){
        setName("Skittles");
        setPrice(1.89);
    }
    
    Candy(Candy c){
        System.out.println("Copy constructor called");
        setName(c.getName());
        setPrice(c.getPrice());
    }
    
    Candy(String s, double d){
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
