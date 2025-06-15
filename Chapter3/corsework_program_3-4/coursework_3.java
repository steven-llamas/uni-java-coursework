/*
Program: 3. Overriding methods (Messages.java or Main.java)
Other files needed for this program: two files, Thought.java, Advice.java
*/

public class Main
{
	public static void main(String[ ] args) 
	{
	    Thought parked = new Thought(); // Thought is parent class
        Advice dates = new Advice(); // Advice is child class derived from Thought
        parked.message();
        dates.message(); // overridden
	}
}