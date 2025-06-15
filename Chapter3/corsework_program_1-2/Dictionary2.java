/*
Filename: Dictionary2.java (file 2 for Words2.java)
Represent a dictionary, which is a book, use to demonstrate use of super reference.
*/

public class Dictionary2 extends Book2
{
	private int definitions;
    //Constructor: Sets up dictionary with specified no. of pages & definitions
    public Dictionary2 (int numPages, int numDefinitions)
    { 
        super (numPages);
        definitions = numDefinitions;
    }
    // Prints a message using both local and inherited values.
    public double computeRatio()    {   return (double) definitions / pages;    }

    // Definitions mutator.
    public void setDefinitions(int numDefinitions) { definitions = numDefinitions;  }

    // Definitions accessor.
    public int getDefinitions()  {  return definitions;  }
}