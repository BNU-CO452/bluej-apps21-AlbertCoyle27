
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Albert Coyle
 * @version 0.12
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        //StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private void addProduct()
    {
        System.out.println("Adding a new product");
        System.out.println(); // Blank Line
        
        int id = reader.getInt("Enter a product ID number.");
        // Returns an integer
        String name = reader.getString("Enter a product name.");
        // Should return a product name
        
        //stock.get(Product);
        //stock.print();
        // Stock (stock) is as yet undeclared. Importing the App03 Classes will remedy this.
    }
    
        private void removeProduct(Product stock)
    {
        //System.out.println("Removing a product");
        //System.out.println();
        
        //int id = reader.getInt("Enter product ID number.");
        // Returns an integer
        //String name = reader.getString("Enter product name.");
        // Should return a product name
        
        //stock.remove(Product);
        //stock.print();
    }
    
        private void printProduct()
    {
        //System.out.println("Printing all products");
        //System.out.println();
        //stock.print();
        //System.out.println();
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if (choice.equals("add"))
        {
            reader.getInt("Enter product ID");
            String name = reader.getString("Enter product name");
            Product product = new Product(113,"LED Lightbulb, Low Energy");
            stock.add(product);
            // Adds a brand new product to the stocklist
            System.out.println("Product " + product.getID() 
            + " ,"  + product.getName() +  "has been added");
            // Ensure there is no = accidentally included.
        }
        else if (choice.equals("remove"))
        {
            reader.getInt("Enter product ID");
            String name = reader.getString("Enter product name");
            //Product product = new Product(113,"LED Lightbulb, Low Energy");
            // Converting the above line of code to remove a product
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        
        return false;
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Albert Coyle");
        System.out.println("********************************");
    }
}