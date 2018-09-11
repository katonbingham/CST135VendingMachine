package cs135vendingmachine;

/**
 *
 * @author Katon
 */
abstract public class Snack 
        extends Product 
        implements Comparable{
    Snack(){}
    
    Snack (Snack s){
        System.out.println("Copy constructor called");
        this.setName(s.getName());
        this.setPrice(s.getPrice());
    }
    
    Snack(String s, double d){
        setName(s);
        setPrice(d);
    }
    
    @Override
    public String toString(){
        return "abstract Snack";
    }
    
    @Override
    public int compareTo(Snack other) {
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
}