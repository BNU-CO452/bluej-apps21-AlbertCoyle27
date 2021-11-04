import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock and Nicholas Day
 * Modified by Albert Coyle
 * @version 04-11-2021
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    
    public ArrayList<Module> modules;
    
    private String code;
    private String title;
    
    private Grades finalGrade;
     
    /**
     * Constructs a specified course (Computing and Web
     * Development). Designed to streamline testing.
     */
    public Course()
    {
        this("GW4F", "BSc Hons Computing & Web Development");
    }
    
    /**
     * Constructor for objects of class Course (Method)
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        
        createModules();
    }

    /**
     * Create four modules and add them to the
     * modules list for testing purposes.  These
     * must be your four modules.
     */
    public void createModules()
    {
        Module moduleCO452 = new Module ("CO452", "Programming Concepts");
        addModule(moduleCO452);
        Module moduleCO454 = new Module ("CO454", "Digital Technologies and Professional Practice");
        addModule(moduleCO454);
        Module moduleCO456 = new Module ("CO456", "Web Development");
        addModule(moduleCO456);
        Module moduleCO450 = new Module ("CO450", "Computer Architectures");
        addModule(moduleCO450);
    }
    
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
    /**
     * Converts the assigned numerical marks into letter grades. (Cannot use 70 for the 
     * Grade A condition, it cannot be parsed)
     */
    public Grades convertToGrade(int mark)
    {
        if(mark >= 0 && mark <= 39)
        return Grades.F;
        else if(mark <= 49)
        return Grades.D;
        else if(mark <= 59)
        return Grades.C;
        else if(mark <=69)
        return Grades.B;
        else if(mark <= 100)
        return Grades.A;
        else
        return Grades.NS;
    }
    
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        return Grades.NS;
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        System.out.println();
        
        printModules();
    }
    
    /**
     * Print the four modules of the course.
     * (Module) is the Class name, (module) is the Object name, (modules)
     * represents the entry given for modules in the ArrayList
     */
    public void printModules()
    {
        System.out.println("---------------");
        System.out.println("Course Modules");
        System.out.println("---------------");
        System.out.println();
        
        for(Module module : modules)
        {
            //System.out.print("\t" + module.getCode());
            //System.out.print("\t" + module.getTitle());
            module.print();
            module.printCredit();
        }
        System.out.println();
        
    }
}
