import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products. 
 * @author Albert Coyle
 * @version 12-11-21
 */
public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    // Can this be differentiated in name from the single value method?
    {
        Product product = findProduct(productID);
        if(product != null) 
        {
            if(product.getQuantity() <= 1000)
            {
                product.increaseQuantity(amount);
                
                System.out.println(" Bought " + amount + " of " +
                product.getName());
                // Personalise message, e.g. (Message + product.getName());
            }
            else
            {
                System.out.println( product.getName() + " cannot be purchased. Selected quantity would exceed current storage limitations.");
            }
        }
        else
        {
            System.out.println(" Product matching this criteria not found.");
        }
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock)
        {
            if(product.getID() == productID)
            {
                return product;
            }
        }
        return null;
    }
    
    /**
     * A method intended to search for a product based on its name.
     * Should be able to draw a result with only the initial part of the name
     * given.
     */
    public Product findProduct (String name)
    {
        for(Product product : stock)
        {
            if(product.getName() == name)
            {
                return product;
            }
        }
        return null;
    }
    
        /**
     * Sells one of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
        // Calls the following method, but exclusively uses a value of one.
    }
    
    /**
     * Sell a chosen quantity of a given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);

    if(product != null) 
    {
        if(product.getQuantity() > 0 && product.getQuantity() > amount)
        {
                product.decreaseQuantity(amount);
                
                System.out.println(" Sold " + amount + " of " + product.getName());
        }   
        else if(product.getQuantity() == 0)
        {
                System.out.println( product.getName() +
                " is currently out of stock.");
        }
        else
        {
                System.out.println( "Cannot sell " + amount + " of "
                                    + product.getName() + " as only " + 
                                    product.getQuantity() + " units of stock are available.");
        }
        }
        else
        {
            System.out.println(" Product matching this criteria not found.");
        }
    }    

    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Albert's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
}