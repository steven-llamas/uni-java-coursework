/*
Program: 1. Creating Subclasses
Filename: Dictionary.java (file 2 for Words.java)
*/

public class Dictionary extends Book
{
	private int definitions = 52500;
    // Prints a message using both local and inherited values.
    public double computeRatio()    {   return (double) definitions / pages;    }

    // Definitions mutator.
    public void setDefinitions(int numDefinitions) { definitions = numDefinitions;  }

    // Definitions accessor.
    public int getDefinitions()  {  return definitions;  }
}
