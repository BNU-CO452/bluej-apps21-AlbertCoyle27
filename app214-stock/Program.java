
/**
 * Program launches a text-based visual interface with which the user
 * may directly communicate, rather than working through object methods.
 *
 * @author Albert Coyle
 * @version 0.1 (19/11/2021)
 */
public class Program
{
    private static StockApp app;
    
    public static void main(String[] args)
    {
        app = new StockApp();
        app.run();
    }
}
