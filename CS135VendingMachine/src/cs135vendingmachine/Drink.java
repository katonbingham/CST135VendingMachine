package cs135vendingmachine;

/**
 *
 * @author Katon
 */
public class Drink 
        extends Product 
        implements Comparable{
    private int drinkVolume; // volume in oz
    Drink(){
        drinkVolume = 12;
        setName("Monster");
        setPrice(2.99);
    }
    
    Drink(Drink d){
        System.out.println("Copy constructor called");
        this.setName(d.getName());
        this.setPrice(d.getPrice());
        drinkVolume = d.drinkVolume;
    }
    
    Drink(String s, double d, int i){
        drinkVolume = i;
        this.setPrice(d);
        this.setName(s);
    }
    
    @Override
    public String toString(){
        return getName() 
                + " " 
                + getPrice() 
                + " "
                + drinkVolume;
    }
    
    @Override
    public int compareTo(Drink other) {
        int diff = 0;
        // convert strings to lowercase to ensure
        // consistent ASCII values
        String a = this.getName().toLowerCase();
        String b = other.getName().toLowerCase();
        
        // compare value of the first letter
        diff = a.charAt(0) - b.charAt(0);
        
        // if names are the same, compare price
        if (diff == 0)
        {
            if (this.getPrice() < other.getPrice())
                return -1;
            else return 1;
        }
        // otherwise continue comparison
        else if (diff<0)
            return -1;
        return 1;
    }

    @Override
    public int compareTo(Snack s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
