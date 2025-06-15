/*
(Words.java or Main.java, show use of inherited method)
Other files needed for this program: 2 files, Book.java, Dictionary.java
*/

public class Main
{
	public static void main(String[ ] args) 
	{
	    Dictionary webster = new Dictionary();
        System.out.println("Number of pages: " + webster.getPages());
        System.out.println("Number of definitions: " + webster.getDefinitions());
        System.out.println("Definitions per page: " + webster.computeRatio());
	}
}