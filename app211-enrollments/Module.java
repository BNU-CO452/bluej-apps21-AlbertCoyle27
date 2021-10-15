
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    // A unique identifier e.g. CO452
    private String modulecode;
    // The title of the module.
    private String moduletitle;
    // The credit value of the module.
    private int credit;
    /**
     * Create a Module. 
     * All other details are set to unkown values.
     */
    public Module(String modulecode, String moduletitle, int credit)
    {
        this.modulecode = modulecode;
        this.moduletitle = moduletitle;
    }

    
    /**
     * Print the details of the module, the students assigned to it,
     * and the credit value it possesses.
     */
    public void print()
    {
        printHeading();
        
        System.out.println(" Module Code: " + modulecode + ": "
        + moduletitle + ": " + credit);
        System.out.println();
    }
    
    /**
     * Print out the details of the module to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Information");
        System.out.println(" --------------------------------");
        System.out.println();
    }
    
    /**
     * Constructor serves to initialise each variable
     */
    public Module (String modulecode, String moduletitle)
    {
        this.credit = 15;
    }
    
    public void setCredit (int credit)
    {
        this.credit = credit;
    }
}
