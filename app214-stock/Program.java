
/**
 * Program launches a text-based visual interface with which the user
 * may directly communicate, rather than working through object methods.
 *
 * @author Albert Coyle
 * @version 0.13 (29/11/2021)
 */
public class Program
{
    private static StockApp app;
    
    public static void main(String[] args)
    {
        System.out.println("Application Launch Successful. Please enter a displayed prompt.");
        app = new StockApp();
        app.run();
    }
}
