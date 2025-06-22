/*
Filename: Advice.java (file 2 for Messages.java)
Represents some thoughtful advice, used to demonstrate use of an overriden method.
*/

public class Advice extends Thought
{
	public void message() // prints message, this method overrides parent's version
    {
        System.out.println("Warning: Dates in calendar are closer " + "than they appear.");
        System.out.println();
        super.message(); // explicitly invokes the parent's version
    }    
}