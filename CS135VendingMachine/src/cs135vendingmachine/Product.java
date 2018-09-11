package cs135vendingmachine;

/**
 *
 * @author Katon
 */
abstract public class Product {
    
    private String name;
    private double price;
    
    Product(){
        name = "Blank";
        price = 0.00;
    }
    
    Product(Product p){
        System.out.println("Copy constructor called");
        name = p.name;
        price = p.price;
    }
    
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    String getName() {
        return name;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    double getPrice(){
        return price;
    }
    
    void setPrice(double price){
        this.price = price;
    }
}
