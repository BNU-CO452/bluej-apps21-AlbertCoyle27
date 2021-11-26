import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author Michael Kölling and David J. Barnes
 * @modified by Albert Coyle 19/11/2021
 * @version 0.11 (19/11/2021)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getString(String prompt)
    {
        String inputLine = null;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.print(prompt);         
            inputLine = reader.nextLine();
            
            if(!inputLine.isEmpty())
                isValid = true;
            else 
                System.out.println("\nBlank input detected.\n");
        }

        return inputLine;
    }
    
    /**
     * Reads the succeeding Int from standard input (the terminal console),
     * and return it as an interger.
     * 
     * @return Integer typed by user.
     */
    public int getInt(String prompt)
    {
        int number = 0;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.println(prompt);
            number = reader.nextInt();
            
            if(number > 0)
            {
                isValid = true;
            }
            else 
                System.out.println("Value Less Than Zero.");
        }

        return number;
    }
}