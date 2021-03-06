import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @modified by Albert Coyle
 * @version 26-11-21
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random random;

    /**
     * A StockManager populated with 10 sample products.
     */
    public StockDemo(StockList stock)
    //(StockList stock)
    {
        //this.stock = stock;
        this.stock = new StockList();
        this.random = new Random();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers. A product ID cannot start
        // with a 0. Not an illegal value, but it will fail to display.
        
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
     * Generates a random value for the purchase of products, used for a stock
     * management demonstration.
     */
    private void buyProducts()
    {
        for(int i = 101; i <= 110; i++)
        {
            stock.buyProduct(i, random.nextInt(1001));
        }
    }

    /**
     * Generates a random value for the sale of products, used for a stock
     * management demonstration.
     */
    private void sellProducts()
        {
        for(int i = 101; i <= 110; i++)
        {
            stock.sellProduct(i, random.nextInt(1001));
        }
    }
    }   