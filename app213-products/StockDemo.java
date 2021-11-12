import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @modified by Albert Coyle
 * @version 05-11-21
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random random;

    /**
     * A StockManager populated with 10 sample products.
     */
    public StockDemo()
    //(StockList stock)
    {
        //this.stock = stock;
        this.stock = new StockList();
        this.random = new Random();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers. A product ID cannot start
        // with a 0. Not an illegal value, but it will not display.
        
        stock.add(new Product(101, "Fitness Watch Standard"));
        stock.add(new Product(102, "Fitness Watch Plus"));
        stock.add(new Product(103, "Fitness Watch Premium"));
        stock.add(new Product(104, "SmartPhone Simple"));
        stock.add(new Product(105, "SmartPhone Alpha"));
        stock.add(new Product(106, "SmartPhone Omega"));
        stock.add(new Product(107, "HomeAssistant Basic"));
        stock.add(new Product(108, "HomeAssistant Supreme"));
        stock.add(new Product(109, "HomeAssistant Ultimate"));
        stock.add(new Product(110, "Batteries, Economy"));
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        // Call Established (stock)
        stock.print();        

        sellProducts();
        // Call Established
        stock.print();        
    }
    
    /**
     * Allows for user to define the quantity of products to be bought.
     */
    private void buyProducts()
    // Adding functionality for randon value testing, will be testing the
    // method "nextInt", which picks out a value between an upper and lower 
    // bound. Ensure a number exceeding the established bounds is created to
    // test the efficacy of the system error detection and resolution.
    {
        for(int i = 101; i <= 10; i++)
        stock.buyProduct(101, random.nextInt(1000));
        stock.buyProduct(102, random.nextInt(1000));
        stock.buyProduct(103, random.nextInt(1000));
        stock.buyProduct(104, random.nextInt(1000));
        stock.buyProduct(105, random.nextInt(1005));
        stock.buyProduct(106, random.nextInt(1000));
        stock.buyProduct(107, random.nextInt(1000));
        stock.buyProduct(108, random.nextInt(1000));
        stock.buyProduct(109, random.nextInt(1000));
        stock.buyProduct(110, random.nextInt(1000));
    }

    /**
     * Allows for user to define the quantity of products sold.
     */
    private void sellProducts()
    {
        stock.sellProduct(101, 400);
        stock.sellProduct(102, 500);
        stock.sellProduct(103, 275);
        stock.sellProduct(104, 150);
        stock.sellProduct(105, 325);
        stock.sellProduct(106, 140);
        stock.sellProduct(107, 200);
        stock.sellProduct(108, 110);
        stock.sellProduct(109, 80);
        stock.sellProduct(110, 775);
    }    
}