
/**
 * The Module Class contains information on the modules undertaken as part of a
 *
 * @author Albert Coyle
 * @version 1.0 20/10/2021
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
     * Module Constructor. 
     * The values representative of the Module chosen are entered here.
     */
    public Module(String modulecode, String moduletitle, int credit)
    {
        this.modulecode = modulecode;
        this.moduletitle = moduletitle;
        this.credit = 15;
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
     * Creates a header to accent the module information printout
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Information");
        System.out.println(" --------------------------------");
        System.out.println();
    }

    public void setCredit (int credit)
    {
        this.credit = credit;
    }
}
