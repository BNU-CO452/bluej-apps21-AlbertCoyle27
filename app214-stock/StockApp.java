
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Albert Coyle
 * @version 0.13 (30/12/2021)
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    private StockDemo demo;
    //Declaration used to call the functions of the StockDemo class
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        
        //StockDemo demo = new StockDemo();
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
    
    private boolean executeChoice(String choice)
    
    {
        if(choice.equals("quit"))
        {
            System.out.println("Program Operation Terminated. You may now close the window.");
            return true;
        }
        else if (choice.equals("add"))
        {
            int id = reader.getInt("Enter product ID");
            String name = reader.getString("Enter product name");
            Product product = new Product(113,"LED Lightbulb, Low Energy");
            stock.add(product);
            // Adds a brand new product to the stocklist
            System.out.println("Product " + product.getID() 
            + ","  + product.getName() +  " has been added.");
        }
        else if (choice.equals("remove"))
        {
            int id = reader.getInt("Enter product ID");
            String name = reader.getString("Enter product name");
            Product product = new Product(113,"LED Lightbulb, Low Energy");
            stock.remove(product);
            System.out.println("Product " + product.getID() 
            + ","  + product.getName() +  " has been removed");
        }
        else if(choice.equals("print"))
        {
            stock.print();
            printHeading();
        }
        else if (choice.equals("buy"))
        {
            
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
        System.out.println("    Buy:        Buy stock of a product");
        System.out.println("    Sell:       Sell stock of a product");
        System.out.println("    Search:     Search for a product");
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