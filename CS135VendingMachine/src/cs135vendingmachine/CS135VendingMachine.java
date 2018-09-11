/*
 * Katon Bingham
 * CST135
 * 9/2/2018
 * This is entirely my own work
 */
package cs135vendingmachine;

/**
 *
 * @author Katon
 */
public class CS135VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dispenser d = new Dispenser(1, 2, 3, 4);
        // d.displayProducts();
        
        Drink a = new Drink("sprite", 3.20, 12);
        Drink b = new Drink("pepsi", 4.20, 12);

        // 'p' before 's' so expected output is 1        
        System.out.println(a.compareTo(b));

        
    }
}
