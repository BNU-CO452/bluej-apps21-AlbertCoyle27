
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

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
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
        stock.add(new Product(110, "Economy Batteries"));
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
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
    }

    private void sellProducts()
    {
    }    
}