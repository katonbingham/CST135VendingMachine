package cs135vendingmachine;

/**
 *
 * @author Katon
 */
public class Dispenser {
    private String userInput;
    private double userCurrency;
    // need an inventory of some kind - hash table?
    
    Dispenser(){ userInput = ""; userCurrency = 0.00; }

    Dispenser(Dispenser d){
        userInput = d.userInput;
        userCurrency = d.userCurrency;
    }

    // future iterations will use the several ints to determine number of
    // sub-snacks and drinks to "stock"
    Dispenser(int i, int j, int k, int l){
        Candy candy = new Candy();
        Chips chips = new Chips();
        Gum gum = new Gum();
        Drink drink = new Drink();
    }
    
    Product vendItem(Product p){
        return p;
    }
    
    boolean priceCheck(double a, double b){
        return false;
    }
    
    double returnChange(double change){
        return change;
    }
    
    void promptSelection(){
        System.out.println("Selection invalid!");
        System.out.println("Please select an item...");
    }
    
    void restock(Product p){
        // replenish vending machine stock
    }
    
    void displayProducts(){
        // System.out.println(candy.toString());
    }
    
    String getUserInput(){ return userInput; }
    double getUserCurrency() { return userCurrency; }
    void setUserInput(String s){ userInput = s; }
    void setUserCurrency(double d){ userCurrency = d; }
}
